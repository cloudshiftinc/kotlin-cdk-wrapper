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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Certificate extensions for v2 template schema.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * ExtensionsV2Property extensionsV2Property = ExtensionsV2Property.builder()
 * .keyUsage(KeyUsageProperty.builder()
 * .usageFlags(KeyUsageFlagsProperty.builder()
 * .dataEncipherment(false)
 * .digitalSignature(false)
 * .keyAgreement(false)
 * .keyEncipherment(false)
 * .nonRepudiation(false)
 * .build())
 * // the properties below are optional
 * .critical(false)
 * .build())
 * // the properties below are optional
 * .applicationPolicies(ApplicationPoliciesProperty.builder()
 * .policies(List.of(ApplicationPolicyProperty.builder()
 * .policyObjectIdentifier("policyObjectIdentifier")
 * .policyType("policyType")
 * .build()))
 * // the properties below are optional
 * .critical(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv2.html)
 */
@CdkDslMarker
public class CfnTemplateExtensionsV2PropertyDsl {
    private val cdkBuilder: CfnTemplate.ExtensionsV2Property.Builder =
        CfnTemplate.ExtensionsV2Property.builder()

    /**
     * @param applicationPolicies Application policies specify what the certificate is used for and
     *   its purpose.
     */
    public fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies)
    }

    /**
     * @param applicationPolicies Application policies specify what the certificate is used for and
     *   its purpose.
     */
    public fun applicationPolicies(applicationPolicies: CfnTemplate.ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies)
    }

    /**
     * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
     *   certificate signing) of the key contained in the certificate.
     */
    public fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
     *   certificate signing) of the key contained in the certificate.
     */
    public fun keyUsage(keyUsage: CfnTemplate.KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage)
    }

    public fun build(): CfnTemplate.ExtensionsV2Property = cdkBuilder.build()
}
