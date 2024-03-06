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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps

/**
 * Properties for defining a `CfnInferenceScheduler`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutequipment.*;
 * Object dataInputConfiguration;
 * Object dataOutputConfiguration;
 * CfnInferenceSchedulerProps cfnInferenceSchedulerProps = CfnInferenceSchedulerProps.builder()
 * .dataInputConfiguration(dataInputConfiguration)
 * .dataOutputConfiguration(dataOutputConfiguration)
 * .dataUploadFrequency("dataUploadFrequency")
 * .modelName("modelName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .dataDelayOffsetInMinutes(123)
 * .inferenceSchedulerName("inferenceSchedulerName")
 * .serverSideKmsKeyId("serverSideKmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html)
 */
@CdkDslMarker
public class CfnInferenceSchedulerPropsDsl {
    private val cdkBuilder: CfnInferenceSchedulerProps.Builder =
        CfnInferenceSchedulerProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param dataDelayOffsetInMinutes A period of time (in minutes) by which inference on the data
     *   is delayed after the data starts. For instance, if an offset delay time of five minutes was
     *   selected, inference will not begin on the data until the first data measurement after the
     *   five minute mark. For example, if five minutes is selected, the inference scheduler will
     *   wake up at the configured frequency with the additional five minute delay time to check the
     *   customer S3 bucket. The customer can upload data at the same frequency and they don't need
     *   to stop and restart the scheduler when uploading new data.
     */
    public fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number) {
        cdkBuilder.dataDelayOffsetInMinutes(dataDelayOffsetInMinutes)
    }

    /**
     * @param dataInputConfiguration Specifies configuration information for the input data for the
     *   inference scheduler, including delimiter, format, and dataset location.
     */
    public fun dataInputConfiguration(dataInputConfiguration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dataInputConfiguration)
        cdkBuilder.dataInputConfiguration(builder.map)
    }

    /**
     * @param dataInputConfiguration Specifies configuration information for the input data for the
     *   inference scheduler, including delimiter, format, and dataset location.
     */
    public fun dataInputConfiguration(dataInputConfiguration: Any) {
        cdkBuilder.dataInputConfiguration(dataInputConfiguration)
    }

    /**
     * @param dataOutputConfiguration Specifies configuration information for the output results for
     *   the inference scheduler, including the Amazon S3 location for the output.
     */
    public fun dataOutputConfiguration(dataOutputConfiguration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dataOutputConfiguration)
        cdkBuilder.dataOutputConfiguration(builder.map)
    }

    /**
     * @param dataOutputConfiguration Specifies configuration information for the output results for
     *   the inference scheduler, including the Amazon S3 location for the output.
     */
    public fun dataOutputConfiguration(dataOutputConfiguration: Any) {
        cdkBuilder.dataOutputConfiguration(dataOutputConfiguration)
    }

    /**
     * @param dataUploadFrequency How often data is uploaded to the source S3 bucket for the input
     *   data. This value is the length of time between data uploads. For instance, if you select 5
     *   minutes, Amazon Lookout for Equipment will upload the real-time data to the source bucket
     *   once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment
     *   starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     */
    public fun dataUploadFrequency(dataUploadFrequency: String) {
        cdkBuilder.dataUploadFrequency(dataUploadFrequency)
    }

    /** @param inferenceSchedulerName The name of the inference scheduler. */
    public fun inferenceSchedulerName(inferenceSchedulerName: String) {
        cdkBuilder.inferenceSchedulerName(inferenceSchedulerName)
    }

    /** @param modelName The name of the machine learning model used for the inference scheduler. */
    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     *   source being used for the inference.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param serverSideKmsKeyId Provides the identifier of the AWS KMS key used to encrypt
     *   inference scheduler data by Amazon Lookout for Equipment .
     */
    public fun serverSideKmsKeyId(serverSideKmsKeyId: String) {
        cdkBuilder.serverSideKmsKeyId(serverSideKmsKeyId)
    }

    /**
     * @param tags Any tags associated with the inference scheduler. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Any tags associated with the inference scheduler. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInferenceSchedulerProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
