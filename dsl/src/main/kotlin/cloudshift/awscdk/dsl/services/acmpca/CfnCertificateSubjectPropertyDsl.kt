@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Contains information about the certificate subject.
 *
 * The `Subject` field in the certificate identifies the entity that owns or controls the public key
 * in the certificate. The entity can be a user, computer, device, or service. The `Subject` must
 * contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names (RDNs).
 * The RDNs are separated by commas in the certificate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * SubjectProperty subjectProperty = SubjectProperty.builder()
 * .commonName("commonName")
 * .country("country")
 * .customAttributes(List.of(CustomAttributeProperty.builder()
 * .objectIdentifier("objectIdentifier")
 * .value("value")
 * .build()))
 * .distinguishedNameQualifier("distinguishedNameQualifier")
 * .generationQualifier("generationQualifier")
 * .givenName("givenName")
 * .initials("initials")
 * .locality("locality")
 * .organization("organization")
 * .organizationalUnit("organizationalUnit")
 * .pseudonym("pseudonym")
 * .serialNumber("serialNumber")
 * .state("state")
 * .surname("surname")
 * .title("title")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html)
 */
@CdkDslMarker
public class CfnCertificateSubjectPropertyDsl {
  private val cdkBuilder: CfnCertificate.SubjectProperty.Builder =
      CfnCertificate.SubjectProperty.builder()

  private val _customAttributes: MutableList<Any> = mutableListOf()

  /**
   * @param commonName For CA and end-entity certificates in a private PKI, the common name (CN) can
   * be any string within the length limit.
   * Note: In publicly trusted certificates, the common name must be a fully qualified domain name
   * (FQDN) associated with the certificate subject.
   */
  public fun commonName(commonName: String) {
    cdkBuilder.commonName(commonName)
  }

  /**
   * @param country Two-digit code that specifies the country in which the certificate subject
   * located.
   */
  public fun country(country: String) {
    cdkBuilder.country(country)
  }

  /**
   * @param customAttributes Contains a sequence of one or more X.500 relative distinguished names
   * (RDNs), each of which consists of an object identifier (OID) and a value. For more information,
   * see NIST’s definition of [Object Identifier
   * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
   *
   * Custom attributes cannot be used in combination with standard attributes.
   */
  public fun customAttributes(vararg customAttributes: Any) {
    _customAttributes.addAll(listOf(*customAttributes))
  }

  /**
   * @param customAttributes Contains a sequence of one or more X.500 relative distinguished names
   * (RDNs), each of which consists of an object identifier (OID) and a value. For more information,
   * see NIST’s definition of [Object Identifier
   * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
   *
   * Custom attributes cannot be used in combination with standard attributes.
   */
  public fun customAttributes(customAttributes: Collection<Any>) {
    _customAttributes.addAll(customAttributes)
  }

  /**
   * @param customAttributes Contains a sequence of one or more X.500 relative distinguished names
   * (RDNs), each of which consists of an object identifier (OID) and a value. For more information,
   * see NIST’s definition of [Object Identifier
   * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
   *
   * Custom attributes cannot be used in combination with standard attributes.
   */
  public fun customAttributes(customAttributes: IResolvable) {
    cdkBuilder.customAttributes(customAttributes)
  }

  /**
   * @param distinguishedNameQualifier Disambiguating information for the certificate subject.
   */
  public fun distinguishedNameQualifier(distinguishedNameQualifier: String) {
    cdkBuilder.distinguishedNameQualifier(distinguishedNameQualifier)
  }

  /**
   * @param generationQualifier Typically a qualifier appended to the name of an individual.
   * Examples include Jr. for junior, Sr. for senior, and III for third.
   */
  public fun generationQualifier(generationQualifier: String) {
    cdkBuilder.generationQualifier(generationQualifier)
  }

  /**
   * @param givenName First name.
   */
  public fun givenName(givenName: String) {
    cdkBuilder.givenName(givenName)
  }

  /**
   * @param initials Concatenation that typically contains the first letter of the *GivenName* , the
   * first letter of the middle name if one exists, and the first letter of the *Surname* .
   */
  public fun initials(initials: String) {
    cdkBuilder.initials(initials)
  }

  /**
   * @param locality The locality (such as a city or town) in which the certificate subject is
   * located.
   */
  public fun locality(locality: String) {
    cdkBuilder.locality(locality)
  }

  /**
   * @param organization Legal name of the organization with which the certificate subject is
   * affiliated.
   */
  public fun organization(organization: String) {
    cdkBuilder.organization(organization)
  }

  /**
   * @param organizationalUnit A subdivision or unit of the organization (such as sales or finance)
   * with which the certificate subject is affiliated.
   */
  public fun organizationalUnit(organizationalUnit: String) {
    cdkBuilder.organizationalUnit(organizationalUnit)
  }

  /**
   * @param pseudonym Typically a shortened version of a longer *GivenName* .
   * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or
   * Eliza.
   */
  public fun pseudonym(pseudonym: String) {
    cdkBuilder.pseudonym(pseudonym)
  }

  /**
   * @param serialNumber The certificate serial number.
   */
  public fun serialNumber(serialNumber: String) {
    cdkBuilder.serialNumber(serialNumber)
  }

  /**
   * @param state State in which the subject of the certificate is located.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * @param surname Family name.
   * In the US and the UK, for example, the surname of an individual is ordered last. In Asian
   * cultures the surname is typically ordered first.
   */
  public fun surname(surname: String) {
    cdkBuilder.surname(surname)
  }

  /**
   * @param title A title such as Mr.
   * or Ms., which is pre-pended to the name to refer formally to the certificate subject.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnCertificate.SubjectProperty {
    if(_customAttributes.isNotEmpty()) cdkBuilder.customAttributes(_customAttributes)
    return cdkBuilder.build()
  }
}
