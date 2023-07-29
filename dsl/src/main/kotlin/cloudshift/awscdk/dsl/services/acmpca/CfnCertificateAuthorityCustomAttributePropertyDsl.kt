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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/**
 * Defines the X.500 relative distinguished name (RDN).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * CustomAttributeProperty customAttributeProperty = CustomAttributeProperty.builder()
 * .objectIdentifier("objectIdentifier")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-customattribute.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityCustomAttributePropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.CustomAttributeProperty.Builder =
        CfnCertificateAuthority.CustomAttributeProperty.builder()

    /**
     * @param objectIdentifier Specifies the object identifier (OID) of the attribute type of the
     *   relative distinguished name (RDN).
     */
    public fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
    }

    /** @param value Specifies the attribute value of relative distinguished name (RDN). */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCertificateAuthority.CustomAttributeProperty = cdkBuilder.build()
}
