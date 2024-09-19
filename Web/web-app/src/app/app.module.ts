import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { WebAppHomeComponent } from './web-app-home/web-app-home.component';
import { WebAppHomeModule } from './web-app-home/web-app-home.module';
import { LoginComponent } from './login/login.component';
import { ReestablecerContraseniaComponent } from './reestablecer-contrasenia/reestablecer-contrasenia.component';
import { OlvidoContraseniaComponent } from './olvido-contrasenia/olvido-contrasenia.component';

const routes: Routes = [
  { path: '', component: LoginComponent, pathMatch: 'full' },
  { path: 'home', component: WebAppHomeComponent },
  { path: 'olvido-contrasenia', component: OlvidoContraseniaComponent }
  // other routes...
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ReestablecerContraseniaComponent,
    OlvidoContraseniaComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    WebAppHomeModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }