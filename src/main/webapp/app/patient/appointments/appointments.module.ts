import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppointmentsComponent } from './appointments.component';
import {appointmentsPopupRoute, appointmentsRoute} from './appointments.route';
import {PatientPortalSharedModule} from '../../shared/shared.module';
import {AppointmentsDialogComponent, AppointmentsPopupComponent} from './appointments-dialog.component';
import {AppointmentsService} from './appointments.service';
import {AppointmentsPopupService} from './appointments-popup.service';

const ENTITY_STATES = [
    ...appointmentsRoute,
    ...appointmentsPopupRoute
]

/**
 * Appointments module decorated class
 */
@NgModule({
    imports: [
        PatientPortalSharedModule,
        RouterModule.forRoot(ENTITY_STATES, {useHash: true})
    ],
    declarations: [
        AppointmentsComponent,
        AppointmentsDialogComponent,
        AppointmentsPopupComponent
    ],
    entryComponents: [
        AppointmentsComponent,
        AppointmentsDialogComponent,
        AppointmentsPopupComponent
    ],
    providers: [
        AppointmentsService,
        AppointmentsPopupService
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class PatientPortalAppointmentsModule {}
