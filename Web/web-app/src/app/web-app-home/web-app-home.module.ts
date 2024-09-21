import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WebAppHomeComponent } from './web-app-home.component';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    CommonModule,
    RouterModule
  ],
  declarations: [WebAppHomeComponent],
  exports: [WebAppHomeComponent]
})
export class WebAppHomeModule { }
