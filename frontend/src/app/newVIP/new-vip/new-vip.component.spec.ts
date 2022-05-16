import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewVipComponent } from './new-vip.component';

describe('NewVipComponent', () => {
  let component: NewVipComponent;
  let fixture: ComponentFixture<NewVipComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewVipComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewVipComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
