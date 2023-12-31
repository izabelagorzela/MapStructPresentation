package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.entities.mappingComposition.Contact;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.ContactDto;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.Patient;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.PatientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapperWithDefaultMethod {

    //Map a bean with child bean (bean with reference to other bean).
    //Demonstration of default method to map child bean.

    PatientMapperWithDefaultMethod INSTANCE = Mappers.getMapper(PatientMapperWithDefaultMethod.class);
    @Mapping(source = "contact", target = "contactDto")
    PatientDto patientToPatientDto(Patient patient);

    default ContactDto contactToContactDTO(Contact contact) {
        if(contact != null) {
            ContactDto contactDto = new ContactDto();
            contactDto.setEmail(contact.getEmail());
            contactDto.setPhone(contact.getPhone());
            return contactDto;
        }
        else {
            return null;
        }
    }
}