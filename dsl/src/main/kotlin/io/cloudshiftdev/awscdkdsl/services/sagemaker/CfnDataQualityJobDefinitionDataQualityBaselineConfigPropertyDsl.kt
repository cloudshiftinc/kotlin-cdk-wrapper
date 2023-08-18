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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * Configuration for monitoring constraints and monitoring statistics.
 *
 * These baseline resources are compared against the results of the current job from the series of
 * jobs scheduled to collect data periodically.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DataQualityBaselineConfigProperty dataQualityBaselineConfigProperty =
 * DataQualityBaselineConfigProperty.builder()
 * .baseliningJobName("baseliningJobName")
 * .constraintsResource(ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .statisticsResource(StatisticsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-dataqualitybaselineconfig.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder =
        CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.builder()

    /**
     * @param baseliningJobName The name of the job that performs baselining for the data quality
     *   monitoring job.
     */
    public fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
    }

    /** @param constraintsResource The constraints resource for a monitoring job. */
    public fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    /** @param constraintsResource The constraints resource for a monitoring job. */
    public fun constraintsResource(
        constraintsResource: CfnDataQualityJobDefinition.ConstraintsResourceProperty
    ) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    /**
     * @param statisticsResource Configuration for monitoring constraints and monitoring statistics.
     *   These baseline resources are compared against the results of the current job from the
     *   series of jobs scheduled to collect data periodically.
     */
    public fun statisticsResource(statisticsResource: IResolvable) {
        cdkBuilder.statisticsResource(statisticsResource)
    }

    /**
     * @param statisticsResource Configuration for monitoring constraints and monitoring statistics.
     *   These baseline resources are compared against the results of the current job from the
     *   series of jobs scheduled to collect data periodically.
     */
    public fun statisticsResource(
        statisticsResource: CfnDataQualityJobDefinition.StatisticsResourceProperty
    ) {
        cdkBuilder.statisticsResource(statisticsResource)
    }

    public fun build(): CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty =
        cdkBuilder.build()
}
