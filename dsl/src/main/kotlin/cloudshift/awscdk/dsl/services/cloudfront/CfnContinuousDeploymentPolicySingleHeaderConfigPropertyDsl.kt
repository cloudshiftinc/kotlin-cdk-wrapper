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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

/**
 * Determines which HTTP requests are sent to the staging distribution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * SingleHeaderConfigProperty singleHeaderConfigProperty = SingleHeaderConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderconfig.html)
 */
@CdkDslMarker
public class CfnContinuousDeploymentPolicySingleHeaderConfigPropertyDsl {
    private val cdkBuilder: CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.Builder =
        CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.builder()

    /**
     * @param header The request header name that you want CloudFront to send to your staging
     *   distribution. The header must contain the prefix `aws-cf-cd-` .
     */
    public fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
    }

    /** @param value The request header value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty =
        cdkBuilder.build()
}
