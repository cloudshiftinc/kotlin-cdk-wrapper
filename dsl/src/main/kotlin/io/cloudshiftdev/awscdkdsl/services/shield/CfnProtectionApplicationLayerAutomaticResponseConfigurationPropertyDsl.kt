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

package io.cloudshiftdev.awscdkdsl.services.shield

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.shield.CfnProtection

/**
 * The automatic application layer DDoS mitigation settings for a `Protection` .
 *
 * This configuration determines whether Shield Advanced automatically manages rules in the web ACL
 * in order to respond to application layer events that Shield Advanced determines to be DDoS
 * attacks.
 *
 * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced automatic
 * mitigation, see the guidance for the `AWS::WAFv2::WebACL` resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * Object block;
 * Object count;
 * ApplicationLayerAutomaticResponseConfigurationProperty
 * applicationLayerAutomaticResponseConfigurationProperty =
 * ApplicationLayerAutomaticResponseConfigurationProperty.builder()
 * .action(ActionProperty.builder()
 * .block(block)
 * .count(count)
 * .build())
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-applicationlayerautomaticresponseconfiguration.html)
 */
@CdkDslMarker
public class CfnProtectionApplicationLayerAutomaticResponseConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.Builder =
        CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.builder()

    /**
     * @param action Specifies the action setting that Shield Advanced should use in the AWS WAF
     *   rules that it creates on behalf of the protected resource in response to DDoS attacks. You
     *   specify this as part of the configuration for the automatic application layer DDoS
     *   mitigation feature, when you enable or update automatic mitigation. Shield Advanced creates
     *   the AWS WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have
     *   associated with the resource.
     */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /**
     * @param action Specifies the action setting that Shield Advanced should use in the AWS WAF
     *   rules that it creates on behalf of the protected resource in response to DDoS attacks. You
     *   specify this as part of the configuration for the automatic application layer DDoS
     *   mitigation feature, when you enable or update automatic mitigation. Shield Advanced creates
     *   the AWS WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have
     *   associated with the resource.
     */
    public fun action(action: CfnProtection.ActionProperty) {
        cdkBuilder.action(action)
    }

    /**
     * @param status Indicates whether automatic application layer DDoS mitigation is enabled for
     *   the protection.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty =
        cdkBuilder.build()
}
