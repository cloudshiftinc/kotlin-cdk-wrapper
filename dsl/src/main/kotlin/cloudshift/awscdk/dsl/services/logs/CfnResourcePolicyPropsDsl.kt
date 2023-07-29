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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnResourcePolicyProps

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
    private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

    /**
     * @param policyDocument The details of the policy. It must be formatted in JSON, and you must
     *   use backslashes to escape characters that need to be escaped in JSON strings, such as
     *   double quote marks.
     */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /** @param policyName The name of the resource policy. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
