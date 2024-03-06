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
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * SingleWeightPolicyConfigProperty singleWeightPolicyConfigProperty =
 * SingleWeightPolicyConfigProperty.builder()
 * .weight(123)
 * // the properties below are optional
 * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig.html)
 */
@CdkDslMarker
public class CfnContinuousDeploymentPolicySingleWeightPolicyConfigPropertyDsl {
    private val cdkBuilder: CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty.Builder =
        CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty.builder()

    /** @param sessionStickinessConfig the value to be set. */
    public fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig)
    }

    /** @param sessionStickinessConfig the value to be set. */
    public fun sessionStickinessConfig(
        sessionStickinessConfig: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty
    ) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig)
    }

    /** @param weight the value to be set. */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty =
        cdkBuilder.build()
}
