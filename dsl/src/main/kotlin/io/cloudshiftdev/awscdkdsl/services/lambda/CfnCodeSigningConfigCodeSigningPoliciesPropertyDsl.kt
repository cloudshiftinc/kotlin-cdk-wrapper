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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig

/**
 * Code signing configuration
 * [policies](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html#config-codesigning-policies)
 * specify the validation failure action for signature mismatch or expiry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CodeSigningPoliciesProperty codeSigningPoliciesProperty = CodeSigningPoliciesProperty.builder()
 * .untrustedArtifactOnDeployment("untrustedArtifactOnDeployment")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-codesigningpolicies.html)
 */
@CdkDslMarker
public class CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl {
    private val cdkBuilder: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder =
        CfnCodeSigningConfig.CodeSigningPoliciesProperty.builder()

    /**
     * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
     *   validation failure. If you set the policy to `Enforce` , Lambda blocks the deployment
     *   request if signature validation checks fail. If you set the policy to `Warn` , Lambda
     *   allows the deployment and creates a CloudWatch log.
     *
     * Default value: `Warn`
     */
    public fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: String) {
        cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
    }

    public fun build(): CfnCodeSigningConfig.CodeSigningPoliciesProperty = cdkBuilder.build()
}
