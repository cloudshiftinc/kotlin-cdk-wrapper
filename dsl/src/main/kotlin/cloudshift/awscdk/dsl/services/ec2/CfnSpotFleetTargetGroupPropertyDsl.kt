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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes a load balancer target group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TargetGroupProperty targetGroupProperty = TargetGroupProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html)
 */
@CdkDslMarker
public class CfnSpotFleetTargetGroupPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.TargetGroupProperty.Builder =
        CfnSpotFleet.TargetGroupProperty.builder()

    /** @param arn The Amazon Resource Name (ARN) of the target group. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnSpotFleet.TargetGroupProperty = cdkBuilder.build()
}
