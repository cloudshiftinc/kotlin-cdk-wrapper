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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnResourcePolicyProps

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * Object policy;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
    private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

    /** @param policy A policy you want to associate with a resource. */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /** @param policy A policy you want to associate with a resource. */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /**
     * @param resourceArn Amazon Resource Name (ARN) of the resource to which you want to attach a
     *   policy.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
