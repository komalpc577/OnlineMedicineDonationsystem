import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExecutiveloginComponent } from './executivelogin.component';

describe('ExecutiveloginComponent', () => {
  let component: ExecutiveloginComponent;
  let fixture: ComponentFixture<ExecutiveloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExecutiveloginComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExecutiveloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
