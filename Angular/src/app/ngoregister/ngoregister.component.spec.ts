import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgoregisterComponent } from './ngoregister.component';

describe('NgoregisterComponent', () => {
  let component: NgoregisterComponent;
  let fixture: ComponentFixture<NgoregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgoregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgoregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
