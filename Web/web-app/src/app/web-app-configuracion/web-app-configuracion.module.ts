import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WebAppConfiguracionComponent } from './web-app-configuracion.component';
import { MatSelectModule } from '@angular/material/select';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';  // No need to import FormControl separately
import { MatCheckboxModule } from '@angular/material/checkbox';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
@NgModule({
  imports: [
    CommonModule,
    MatSelectModule,
    MatFormFieldModule,
    MatInputModule,
    FormsModule,
    ReactiveFormsModule,
    MatCheckboxModule,
    BrowserAnimationsModule,
    MatButtonModule
  ],
  declarations: [WebAppConfiguracionComponent]
})
export class WebAppConfiguracionModule { }
