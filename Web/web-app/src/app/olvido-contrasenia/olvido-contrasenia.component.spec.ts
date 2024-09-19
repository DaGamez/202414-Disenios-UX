import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OlvidoContraseniaComponent } from './olvido-contrasenia.component';

describe('OlvidoContraseniaComponent', () => {
  let component: OlvidoContraseniaComponent;
  let fixture: ComponentFixture<OlvidoContraseniaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OlvidoContraseniaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OlvidoContraseniaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
