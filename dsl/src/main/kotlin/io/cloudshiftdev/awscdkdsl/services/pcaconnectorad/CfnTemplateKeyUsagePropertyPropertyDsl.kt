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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * The key usage property defines the purpose of the private key contained in the certificate.
 *
 * You can specify specific purposes using property flags or all by using property type ALL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * KeyUsagePropertyProperty keyUsagePropertyProperty = KeyUsagePropertyProperty.builder()
 * .propertyFlags(KeyUsagePropertyFlagsProperty.builder()
 * .decrypt(false)
 * .keyAgreement(false)
 * .sign(false)
 * .build())
 * .propertyType("propertyType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageproperty.html)
 */
@CdkDslMarker
public class CfnTemplateKeyUsagePropertyPropertyDsl {
    private val cdkBuilder: CfnTemplate.KeyUsagePropertyProperty.Builder =
        CfnTemplate.KeyUsagePropertyProperty.builder()

    /**
     * @param propertyFlags You can specify key usage for encryption, key agreement, and signature.
     *   You can use property flags or property type but not both.
     */
    public fun propertyFlags(propertyFlags: IResolvable) {
        cdkBuilder.propertyFlags(propertyFlags)
    }

    /**
     * @param propertyFlags You can specify key usage for encryption, key agreement, and signature.
     *   You can use property flags or property type but not both.
     */
    public fun propertyFlags(propertyFlags: CfnTemplate.KeyUsagePropertyFlagsProperty) {
        cdkBuilder.propertyFlags(propertyFlags)
    }

    /**
     * @param propertyType You can specify all key usages using property type ALL. You can use
     *   property type or property flags but not both.
     */
    public fun propertyType(propertyType: String) {
        cdkBuilder.propertyType(propertyType)
    }

    public fun build(): CfnTemplate.KeyUsagePropertyProperty = cdkBuilder.build()
}
