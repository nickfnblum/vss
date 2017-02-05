package gov.samhsa.c2s.vss.web;

import gov.samhsa.c2s.vss.service.ValueSetLookupService;
import gov.samhsa.c2s.vss.service.dto.CodedConceptAndCodeSystemOidDto;
import gov.samhsa.c2s.vss.service.dto.ValueSetCategoryMapDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ValueSetLookupRestController {

    @Autowired
    private ValueSetLookupService valueSetLookupService;

    @RequestMapping(value = "/search/valueSetCategories", method = RequestMethod.POST)
    public List<ValueSetCategoryMapDto> searchValueSetCategories(@Valid @RequestBody List<CodedConceptAndCodeSystemOidDto> codedConceptAndCodeSystemOidDtos){
        return valueSetLookupService.lookupValueSetCategories(codedConceptAndCodeSystemOidDtos);
    }
}