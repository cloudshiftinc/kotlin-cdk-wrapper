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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lex.CfnResourcePolicy

/**
 * A resource policy to add to the resource.
 *
 * The policy is a JSON structure following the IAM syntax that contains one or more statements that
 * define the policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * PolicyProperty policyProperty = PolicyProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-resourcepolicy-policy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPolicyPropertyDsl {
    private val cdkBuilder: CfnResourcePolicy.PolicyProperty.Builder =
        CfnResourcePolicy.PolicyProperty.builder()

    public fun build(): CfnResourcePolicy.PolicyProperty = cdkBuilder.build()
}
