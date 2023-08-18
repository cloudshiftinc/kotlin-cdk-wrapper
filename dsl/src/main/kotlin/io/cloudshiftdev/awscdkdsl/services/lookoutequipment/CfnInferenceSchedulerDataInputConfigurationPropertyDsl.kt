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

package io.cloudshiftdev.awscdkdsl.services.lookoutequipment

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

/**
 * Specifies configuration information for the input data for the inference scheduler, including
 * delimiter, format, and dataset location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutequipment.*;
 * DataInputConfigurationProperty dataInputConfigurationProperty =
 * DataInputConfigurationProperty.builder()
 * .s3InputConfiguration(S3InputConfigurationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .inferenceInputNameConfiguration(InputNameConfigurationProperty.builder()
 * .componentTimestampDelimiter("componentTimestampDelimiter")
 * .timestampFormat("timestampFormat")
 * .build())
 * .inputTimeZoneOffset("inputTimeZoneOffset")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html)
 */
@CdkDslMarker
public class CfnInferenceSchedulerDataInputConfigurationPropertyDsl {
    private val cdkBuilder: CfnInferenceScheduler.DataInputConfigurationProperty.Builder =
        CfnInferenceScheduler.DataInputConfigurationProperty.builder()

    /**
     * @param inferenceInputNameConfiguration Specifies configuration information for the input data
     *   for the inference, including timestamp format and delimiter.
     */
    public fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: IResolvable) {
        cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration)
    }

    /**
     * @param inferenceInputNameConfiguration Specifies configuration information for the input data
     *   for the inference, including timestamp format and delimiter.
     */
    public fun inferenceInputNameConfiguration(
        inferenceInputNameConfiguration: CfnInferenceScheduler.InputNameConfigurationProperty
    ) {
        cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration)
    }

    /**
     * @param inputTimeZoneOffset Indicates the difference between your time zone and Greenwich Mean
     *   Time (GMT).
     */
    public fun inputTimeZoneOffset(inputTimeZoneOffset: String) {
        cdkBuilder.inputTimeZoneOffset(inputTimeZoneOffset)
    }

    /**
     * @param s3InputConfiguration Specifies configuration information for the input data for the
     *   inference, including input data S3 location.
     */
    public fun s3InputConfiguration(s3InputConfiguration: IResolvable) {
        cdkBuilder.s3InputConfiguration(s3InputConfiguration)
    }

    /**
     * @param s3InputConfiguration Specifies configuration information for the input data for the
     *   inference, including input data S3 location.
     */
    public fun s3InputConfiguration(
        s3InputConfiguration: CfnInferenceScheduler.S3InputConfigurationProperty
    ) {
        cdkBuilder.s3InputConfiguration(s3InputConfiguration)
    }

    public fun build(): CfnInferenceScheduler.DataInputConfigurationProperty = cdkBuilder.build()
}
