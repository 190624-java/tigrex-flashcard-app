import { TestBed } from '@angular/core/testing';

import { FlashcardServiceService } from './flashcard-service.service';

describe('FlashcardServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FlashcardServiceService = TestBed.get(FlashcardServiceService);
    expect(service).toBeTruthy();
  });
});
