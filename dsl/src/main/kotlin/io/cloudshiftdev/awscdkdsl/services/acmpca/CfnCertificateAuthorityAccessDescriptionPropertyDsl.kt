@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.acmpca

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/**
 * Provides access information used by the `authorityInfoAccess` and `subjectInfoAccess` extensions
 * described in
 * [RFC 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * AccessDescriptionProperty accessDescriptionProperty = AccessDescriptionProperty.builder()
 * .accessLocation(GeneralNameProperty.builder()
 * .directoryName(SubjectProperty.builder()
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
 * .build())
 * .dnsName("dnsName")
 * .ediPartyName(EdiPartyNameProperty.builder()
 * .nameAssigner("nameAssigner")
 * .partyName("partyName")
 * .build())
 * .ipAddress("ipAddress")
 * .otherName(OtherNameProperty.builder()
 * .typeId("typeId")
 * .value("value")
 * .build())
 * .registeredId("registeredId")
 * .rfc822Name("rfc822Name")
 * .uniformResourceIdentifier("uniformResourceIdentifier")
 * .build())
 * .accessMethod(AccessMethodProperty.builder()
 * .accessMethodType("accessMethodType")
 * .customObjectIdentifier("customObjectIdentifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessdescription.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityAccessDescriptionPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.AccessDescriptionProperty.Builder =
        CfnCertificateAuthority.AccessDescriptionProperty.builder()

    /** @param accessLocation The location of `AccessDescription` information. */
    public fun accessLocation(accessLocation: IResolvable) {
        cdkBuilder.accessLocation(accessLocation)
    }

    /** @param accessLocation The location of `AccessDescription` information. */
    public fun accessLocation(accessLocation: CfnCertificateAuthority.GeneralNameProperty) {
        cdkBuilder.accessLocation(accessLocation)
    }

    /** @param accessMethod The type and format of `AccessDescription` information. */
    public fun accessMethod(accessMethod: IResolvable) {
        cdkBuilder.accessMethod(accessMethod)
    }

    /** @param accessMethod The type and format of `AccessDescription` information. */
    public fun accessMethod(accessMethod: CfnCertificateAuthority.AccessMethodProperty) {
        cdkBuilder.accessMethod(accessMethod)
    }

    public fun build(): CfnCertificateAuthority.AccessDescriptionProperty = cdkBuilder.build()
}
