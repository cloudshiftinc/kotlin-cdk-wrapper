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
 * Specifies key usage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * KeyUsagePropertyFlagsProperty keyUsagePropertyFlagsProperty =
 * KeyUsagePropertyFlagsProperty.builder()
 * .decrypt(false)
 * .keyAgreement(false)
 * .sign(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html)
 */
@CdkDslMarker
public class CfnTemplateKeyUsagePropertyFlagsPropertyDsl {
    private val cdkBuilder: CfnTemplate.KeyUsagePropertyFlagsProperty.Builder =
        CfnTemplate.KeyUsagePropertyFlagsProperty.builder()

    /** @param decrypt Allows key for encryption and decryption. */
    public fun decrypt(decrypt: Boolean) {
        cdkBuilder.decrypt(decrypt)
    }

    /** @param decrypt Allows key for encryption and decryption. */
    public fun decrypt(decrypt: IResolvable) {
        cdkBuilder.decrypt(decrypt)
    }

    /** @param keyAgreement Allows key exchange without encryption. */
    public fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    /** @param keyAgreement Allows key exchange without encryption. */
    public fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    /** @param sign Allow key use for digital signature. */
    public fun sign(sign: Boolean) {
        cdkBuilder.sign(sign)
    }

    /** @param sign Allow key use for digital signature. */
    public fun sign(sign: IResolvable) {
        cdkBuilder.sign(sign)
    }

    public fun build(): CfnTemplate.KeyUsagePropertyFlagsProperty = cdkBuilder.build()
}
