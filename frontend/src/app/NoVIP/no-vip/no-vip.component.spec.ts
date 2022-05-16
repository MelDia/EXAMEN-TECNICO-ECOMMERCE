import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NoVipComponent } from './no-vip.component';

describe('NoVipComponent', () => {
  let component: NoVipComponent;
  let fixture: ComponentFixture<NoVipComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NoVipComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NoVipComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
