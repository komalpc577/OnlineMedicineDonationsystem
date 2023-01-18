import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdmiAddComponent } from './admi-add.component';

describe('AdmiAddComponent', () => {
  let component: AdmiAddComponent;
  let fixture: ComponentFixture<AdmiAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdmiAddComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdmiAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
