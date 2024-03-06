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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnProtection

/**
 * Specifies the action setting that Shield Advanced should use in the AWS WAF rules that it creates
 * on behalf of the protected resource in response to DDoS attacks.
 *
 * You specify this as part of the configuration for the automatic application layer DDoS mitigation
 * feature, when you enable or update automatic mitigation. Shield Advanced creates the AWS WAF
 * rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with
 * the resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * Object block;
 * Object count;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .block(block)
 * .count(count)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-action.html)
 */
@CdkDslMarker
public class CfnProtectionActionPropertyDsl {
    private val cdkBuilder: CfnProtection.ActionProperty.Builder =
        CfnProtection.ActionProperty.builder()

    /**
     * @param block Specifies that Shield Advanced should configure its AWS WAF rules with the AWS
     *   WAF `Block` action. You must specify exactly one action, either `Block` or `Count` .
     *
     * Example JSON: `{ "Block": {} }`
     *
     * Example YAML: `Block: {}`
     */
    public fun block(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.block(builder.map)
    }

    /**
     * @param block Specifies that Shield Advanced should configure its AWS WAF rules with the AWS
     *   WAF `Block` action. You must specify exactly one action, either `Block` or `Count` .
     *
     * Example JSON: `{ "Block": {} }`
     *
     * Example YAML: `Block: {}`
     */
    public fun block(block: Any) {
        cdkBuilder.block(block)
    }

    /**
     * @param count Specifies that Shield Advanced should configure its AWS WAF rules with the AWS
     *   WAF `Count` action. You must specify exactly one action, either `Block` or `Count` .
     *
     * Example JSON: `{ "Count": {} }`
     *
     * Example YAML: `Count: {}`
     */
    public fun count(count: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(count)
        cdkBuilder.count(builder.map)
    }

    /**
     * @param count Specifies that Shield Advanced should configure its AWS WAF rules with the AWS
     *   WAF `Count` action. You must specify exactly one action, either `Block` or `Count` .
     *
     * Example JSON: `{ "Count": {} }`
     *
     * Example YAML: `Count: {}`
     */
    public fun count(count: Any) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnProtection.ActionProperty = cdkBuilder.build()
}
