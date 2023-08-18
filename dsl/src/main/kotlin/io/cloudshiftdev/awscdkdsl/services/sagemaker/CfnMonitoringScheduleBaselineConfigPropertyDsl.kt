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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and
 * statistics.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * BaselineConfigProperty baselineConfigProperty = BaselineConfigProperty.builder()
 * .constraintsResource(ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .statisticsResource(StatisticsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-baselineconfig.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleBaselineConfigPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.BaselineConfigProperty.Builder =
        CfnMonitoringSchedule.BaselineConfigProperty.builder()

    /** @param constraintsResource The Amazon S3 URI for the constraints resource. */
    public fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    /** @param constraintsResource The Amazon S3 URI for the constraints resource. */
    public fun constraintsResource(
        constraintsResource: CfnMonitoringSchedule.ConstraintsResourceProperty
    ) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    /**
     * @param statisticsResource The baseline statistics file in Amazon S3 that the current
     *   monitoring job should be validated against.
     */
    public fun statisticsResource(statisticsResource: IResolvable) {
        cdkBuilder.statisticsResource(statisticsResource)
    }

    /**
     * @param statisticsResource The baseline statistics file in Amazon S3 that the current
     *   monitoring job should be validated against.
     */
    public fun statisticsResource(
        statisticsResource: CfnMonitoringSchedule.StatisticsResourceProperty
    ) {
        cdkBuilder.statisticsResource(statisticsResource)
    }

    public fun build(): CfnMonitoringSchedule.BaselineConfigProperty = cdkBuilder.build()
}
