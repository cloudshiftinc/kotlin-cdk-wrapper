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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `DynamicPartitioningConfiguration` property type specifies the configuration of the dynamic
 * partitioning mechanism that creates targeted data sets from the streaming data by partitioning it
 * based on partition keys.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * DynamicPartitioningConfigurationProperty dynamicPartitioningConfigurationProperty =
 * DynamicPartitioningConfigurationProperty.builder()
 * .enabled(false)
 * .retryOptions(RetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamDynamicPartitioningConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder =
        CfnDeliveryStream.DynamicPartitioningConfigurationProperty.builder()

    /**
     * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data
     *   Firehose delivery stream.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data
     *   Firehose delivery stream.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
     *   deliver data to an Amazon S3 prefix.
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
     *   deliver data to an Amazon S3 prefix.
     */
    public fun retryOptions(retryOptions: CfnDeliveryStream.RetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    public fun build(): CfnDeliveryStream.DynamicPartitioningConfigurationProperty =
        cdkBuilder.build()
}
