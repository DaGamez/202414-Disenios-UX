import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WebAppHomeComponent } from './web-app-home.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [WebAppHomeComponent],
  exports: [WebAppHomeComponent]
})
export class WebAppHomeModule { }
