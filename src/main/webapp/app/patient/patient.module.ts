import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { PatientPortalAppointmentsModule } from './appointments/appointments.module';

/**
 * Patient module decorated class
 */
@NgModule({
    imports: [
        PatientPortalAppointmentsModule
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class PatientPortalPatientModule {}
