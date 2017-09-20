import { BaseEntity } from './../../shared';

export class Appointment implements BaseEntity {
    constructor(
        public id?: number,
        public reason?: string,
        public insuranceChange?: boolean,
        public phoneNumber?: string,
    ) {
        this.insuranceChange = false;
    }
}
