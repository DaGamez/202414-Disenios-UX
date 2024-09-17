import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WebAppHomeComponent } from './web-app-home/web-app-home.component';
import { WebAppHomeModule } from './web-app-home/web-app-home.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    WebAppHomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
