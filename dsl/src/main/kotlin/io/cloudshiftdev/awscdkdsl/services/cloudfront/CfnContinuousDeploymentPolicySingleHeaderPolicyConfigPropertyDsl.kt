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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * SingleHeaderPolicyConfigProperty singleHeaderPolicyConfigProperty =
 * SingleHeaderPolicyConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig.html)
 */
@CdkDslMarker
public class CfnContinuousDeploymentPolicySingleHeaderPolicyConfigPropertyDsl {
    private val cdkBuilder: CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty.Builder =
        CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty.builder()

    /** @param header the value to be set. */
    public fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
    }

    /** @param value the value to be set. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty =
        cdkBuilder.build()
}
