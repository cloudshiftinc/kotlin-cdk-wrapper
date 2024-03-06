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
 * The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in
 * the certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * KeyUsageFlagsProperty keyUsageFlagsProperty = KeyUsageFlagsProperty.builder()
 * .dataEncipherment(false)
 * .digitalSignature(false)
 * .keyAgreement(false)
 * .keyEncipherment(false)
 * .nonRepudiation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html)
 */
@CdkDslMarker
public class CfnTemplateKeyUsageFlagsPropertyDsl {
    private val cdkBuilder: CfnTemplate.KeyUsageFlagsProperty.Builder =
        CfnTemplate.KeyUsageFlagsProperty.builder()

    /**
     * @param dataEncipherment DataEncipherment is asserted when the subject public key is used for
     *   directly enciphering raw user data without the use of an intermediate symmetric cipher.
     */
    public fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
    }

    /**
     * @param dataEncipherment DataEncipherment is asserted when the subject public key is used for
     *   directly enciphering raw user data without the use of an intermediate symmetric cipher.
     */
    public fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment)
    }

    /**
     * @param digitalSignature The digitalSignature is asserted when the subject public key is used
     *   for verifying digital signatures.
     */
    public fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
    }

    /**
     * @param digitalSignature The digitalSignature is asserted when the subject public key is used
     *   for verifying digital signatures.
     */
    public fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature)
    }

    /**
     * @param keyAgreement KeyAgreement is asserted when the subject public key is used for key
     *   agreement.
     */
    public fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    /**
     * @param keyAgreement KeyAgreement is asserted when the subject public key is used for key
     *   agreement.
     */
    public fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    /**
     * @param keyEncipherment KeyEncipherment is asserted when the subject public key is used for
     *   enciphering private or secret keys, i.e., for key transport.
     */
    public fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
    }

    /**
     * @param keyEncipherment KeyEncipherment is asserted when the subject public key is used for
     *   enciphering private or secret keys, i.e., for key transport.
     */
    public fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment)
    }

    /**
     * @param nonRepudiation NonRepudiation is asserted when the subject public key is used to
     *   verify digital signatures.
     */
    public fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
    }

    /**
     * @param nonRepudiation NonRepudiation is asserted when the subject public key is used to
     *   verify digital signatures.
     */
    public fun nonRepudiation(nonRepudiation: IResolvable) {
        cdkBuilder.nonRepudiation(nonRepudiation)
    }

    public fun build(): CfnTemplate.KeyUsageFlagsProperty = cdkBuilder.build()
}
