import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ng2-webstorage';

import { PatientPortalSharedModule, UserRouteAccessService } from './shared';
import { PatientPortalHomeModule } from './home/home.module';
import { PatientPortalAdminModule } from './admin/admin.module';
import { PatientPortalAccountModule } from './account/account.module';
import { PatientPortalEntityModule } from './entities/entity.module';
import { PatientPortalPatientModule } from './patient/patient.module';

import { customHttpProvider } from './blocks/interceptor/http.provider';
import { PaginationConfig } from './blocks/config/uib-pagination.config';

// jhipster-needle-angular-add-module-import JHipster will add new module here

import {
    JhiMainComponent,
    LayoutRoutingModule,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    PageRibbonComponent,
    ErrorComponent
} from './layouts';

@NgModule({
    imports: [
        BrowserModule,
        LayoutRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        PatientPortalSharedModule,
        PatientPortalHomeModule,
        PatientPortalAdminModule,
        PatientPortalAccountModule,
        PatientPortalEntityModule,
        PatientPortalPatientModule,
        // jhipster-needle-angular-add-module JHipster will add new module here
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        PageRibbonComponent,
        FooterComponent
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        PaginationConfig,
        UserRouteAccessService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class PatientPortalAppModule {}
