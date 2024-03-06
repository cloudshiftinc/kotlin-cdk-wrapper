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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * The key usage extension defines the purpose (e.g., encipherment, signature) of the key contained
 * in the certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * KeyUsageProperty keyUsageProperty = KeyUsageProperty.builder()
 * .usageFlags(KeyUsageFlagsProperty.builder()
 * .dataEncipherment(false)
 * .digitalSignature(false)
 * .keyAgreement(false)
 * .keyEncipherment(false)
 * .nonRepudiation(false)
 * .build())
 * // the properties below are optional
 * .critical(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusage.html)
 */
@CdkDslMarker
public class CfnTemplateKeyUsagePropertyDsl {
    private val cdkBuilder: CfnTemplate.KeyUsageProperty.Builder =
        CfnTemplate.KeyUsageProperty.builder()

    /** @param critical Sets the key usage extension to critical. */
    public fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
    }

    /** @param critical Sets the key usage extension to critical. */
    public fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical)
    }

    /**
     * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
     *   of the key contained in the certificate.
     */
    public fun usageFlags(usageFlags: IResolvable) {
        cdkBuilder.usageFlags(usageFlags)
    }

    /**
     * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
     *   of the key contained in the certificate.
     */
    public fun usageFlags(usageFlags: CfnTemplate.KeyUsageFlagsProperty) {
        cdkBuilder.usageFlags(usageFlags)
    }

    public fun build(): CfnTemplate.KeyUsageProperty = cdkBuilder.build()
}
