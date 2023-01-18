import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExecutivehomeComponent } from './executivehome.component';

describe('ExecutivehomeComponent', () => {
  let component: ExecutivehomeComponent;
  let fixture: ComponentFixture<ExecutivehomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExecutivehomeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExecutivehomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
