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
import kotlin.Number
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

/**
 * Session stickiness provides the ability to define multiple requests from a single viewer as a
 * single session.
 *
 * This prevents the potentially inconsistent experience of sending some of a given user's requests
 * to your staging distribution, while others are sent to your primary distribution. Define the
 * session duration using TTL values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * SessionStickinessConfigProperty sessionStickinessConfigProperty =
 * SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig.html)
 */
@CdkDslMarker
public class CfnContinuousDeploymentPolicySessionStickinessConfigPropertyDsl {
    private val cdkBuilder: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.Builder =
        CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.builder()

    /**
     * @param idleTtl The amount of time after which you want sessions to cease if no requests are
     *   received. Allowed values are 300–3600 seconds (5–60 minutes).
     */
    public fun idleTtl(idleTtl: Number) {
        cdkBuilder.idleTtl(idleTtl)
    }

    /**
     * @param maximumTtl The maximum amount of time to consider requests from the viewer as being
     *   part of the same session. Allowed values are 300–3600 seconds (5–60 minutes).
     */
    public fun maximumTtl(maximumTtl: Number) {
        cdkBuilder.maximumTtl(maximumTtl)
    }

    public fun build(): CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty =
        cdkBuilder.build()
}
