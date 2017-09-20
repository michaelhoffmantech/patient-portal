import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Appointment } from './appointments.model';
import { ResponseWrapper } from '../../shared/model/response-wrapper.model';
import { createRequestOption } from '../../shared/model/request-util';

@Injectable()
export class AppointmentsService {

    private resourceUrl = 'api/appointments';

    constructor(private http: Http) { }

    create(appointment: Appointment): Observable<Appointment> {
        const copy = this.convert(appointment);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            return res.json();
        });
    }

    query(req?: any): Observable<ResponseWrapper> {
        const options = createRequestOption(req);
        return this.http.get(this.resourceUrl, options)
            .map((res: Response) => this.convertResponse(res));
    }

    private convert(appointment: Appointment): Appointment {
        const copy: Appointment = Object.assign({}, appointment);
        return copy;
    }

    private convertResponse(res: Response): ResponseWrapper {
        const jsonResponse = res.json();
        return new ResponseWrapper(res.headers, jsonResponse, res.status);
    }
}
