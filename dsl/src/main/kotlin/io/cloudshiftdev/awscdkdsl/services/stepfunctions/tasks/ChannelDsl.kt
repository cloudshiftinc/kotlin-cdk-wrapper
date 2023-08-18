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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.Channel
import software.amazon.awscdk.services.stepfunctions.tasks.CompressionType
import software.amazon.awscdk.services.stepfunctions.tasks.DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.InputMode
import software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig

/**
 * Describes the training, validation or test dataset and the Amazon S3 location where it is stored.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * S3Location s3Location;
 * Channel channel = Channel.builder()
 * .channelName("channelName")
 * .dataSource(DataSource.builder()
 * .s3DataSource(S3DataSource.builder()
 * .s3Location(s3Location)
 * // the properties below are optional
 * .attributeNames(List.of("attributeNames"))
 * .s3DataDistributionType(S3DataDistributionType.FULLY_REPLICATED)
 * .s3DataType(S3DataType.MANIFEST_FILE)
 * .build())
 * .build())
 * // the properties below are optional
 * .compressionType(CompressionType.NONE)
 * .contentType("contentType")
 * .inputMode(InputMode.PIPE)
 * .recordWrapperType(RecordWrapperType.NONE)
 * .shuffleConfig(ShuffleConfig.builder()
 * .seed(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ChannelDsl {
    private val cdkBuilder: Channel.Builder = Channel.builder()

    /** @param channelName Name of the channel. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /** @param compressionType Compression type if training data is compressed. */
    public fun compressionType(compressionType: CompressionType) {
        cdkBuilder.compressionType(compressionType)
    }

    /** @param contentType The MIME type of the data. */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /** @param dataSource Location of the channel data. */
    public fun dataSource(dataSource: DataSourceDsl.() -> Unit = {}) {
        val builder = DataSourceDsl()
        builder.apply(dataSource)
        cdkBuilder.dataSource(builder.build())
    }

    /** @param dataSource Location of the channel data. */
    public fun dataSource(dataSource: DataSource) {
        cdkBuilder.dataSource(dataSource)
    }

    /** @param inputMode Input mode to use for the data channel in a training job. */
    public fun inputMode(inputMode: InputMode) {
        cdkBuilder.inputMode(inputMode)
    }

    /**
     * @param recordWrapperType Specify RecordIO as the value when input data is in raw format but
     *   the training algorithm requires the RecordIO format. In this case, Amazon SageMaker wraps
     *   each individual S3 object in a RecordIO record. If the input data is already in RecordIO
     *   format, you don't need to set this attribute.
     */
    public fun recordWrapperType(recordWrapperType: RecordWrapperType) {
        cdkBuilder.recordWrapperType(recordWrapperType)
    }

    /** @param shuffleConfig Shuffle config option for input data in a channel. */
    public fun shuffleConfig(shuffleConfig: ShuffleConfigDsl.() -> Unit = {}) {
        val builder = ShuffleConfigDsl()
        builder.apply(shuffleConfig)
        cdkBuilder.shuffleConfig(builder.build())
    }

    /** @param shuffleConfig Shuffle config option for input data in a channel. */
    public fun shuffleConfig(shuffleConfig: ShuffleConfig) {
        cdkBuilder.shuffleConfig(shuffleConfig)
    }

    public fun build(): Channel = cdkBuilder.build()
}
