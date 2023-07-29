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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Specifies the X.509 extension information for a certificate.
 *
 * Extensions present in `CustomExtensions` follow the `ApiPassthrough`
 * [template rules](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html#template-order-of-operations)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * CustomExtensionProperty customExtensionProperty = CustomExtensionProperty.builder()
 * .objectIdentifier("objectIdentifier")
 * .value("value")
 * // the properties below are optional
 * .critical(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html)
 */
@CdkDslMarker
public class CfnCertificateCustomExtensionPropertyDsl {
    private val cdkBuilder: CfnCertificate.CustomExtensionProperty.Builder =
        CfnCertificate.CustomExtensionProperty.builder()

    /** @param critical Specifies the critical flag of the X.509 extension. */
    public fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
    }

    /** @param critical Specifies the critical flag of the X.509 extension. */
    public fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical)
    }

    /**
     * @param objectIdentifier Specifies the object identifier (OID) of the X.509 extension. For
     *   more information, see the
     *   [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
     */
    public fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
    }

    /** @param value Specifies the base64-encoded value of the X.509 extension. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCertificate.CustomExtensionProperty = cdkBuilder.build()
}
