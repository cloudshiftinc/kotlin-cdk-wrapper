@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Describes the training, validation or test dataset and the Amazon S3 location where it is stored.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
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
public interface Channel {
  /**
   * Name of the channel.
   */
  public fun channelName(): String

  /**
   * Compression type if training data is compressed.
   *
   * Default: - None
   */
  public fun compressionType(): CompressionType? =
      unwrap(this).getCompressionType()?.let(CompressionType::wrap)

  /**
   * The MIME type of the data.
   *
   * Default: - None
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * Location of the channel data.
   */
  public fun dataSource(): DataSource

  /**
   * Input mode to use for the data channel in a training job.
   *
   * Default: - None
   */
  public fun inputMode(): InputMode? = unwrap(this).getInputMode()?.let(InputMode::wrap)

  /**
   * Specify RecordIO as the value when input data is in raw format but the training algorithm
   * requires the RecordIO format.
   *
   * In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record.
   * If the input data is already in RecordIO format, you don't need to set this attribute.
   *
   * Default: - None
   */
  public fun recordWrapperType(): RecordWrapperType? =
      unwrap(this).getRecordWrapperType()?.let(RecordWrapperType::wrap)

  /**
   * Shuffle config option for input data in a channel.
   *
   * Default: - None
   */
  public fun shuffleConfig(): ShuffleConfig? =
      unwrap(this).getShuffleConfig()?.let(ShuffleConfig::wrap)

  /**
   * A builder for [Channel]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelName Name of the channel. 
     */
    public fun channelName(channelName: String)

    /**
     * @param compressionType Compression type if training data is compressed.
     */
    public fun compressionType(compressionType: CompressionType)

    /**
     * @param contentType The MIME type of the data.
     */
    public fun contentType(contentType: String)

    /**
     * @param dataSource Location of the channel data. 
     */
    public fun dataSource(dataSource: DataSource)

    /**
     * @param dataSource Location of the channel data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08384c89c67f863a95ea6bced0745c976d9e2dff8312118b611066805676df29")
    public fun dataSource(dataSource: DataSource.Builder.() -> Unit)

    /**
     * @param inputMode Input mode to use for the data channel in a training job.
     */
    public fun inputMode(inputMode: InputMode)

    /**
     * @param recordWrapperType Specify RecordIO as the value when input data is in raw format but
     * the training algorithm requires the RecordIO format.
     * In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record.
     * If the input data is already in RecordIO format, you don't need to set this attribute.
     */
    public fun recordWrapperType(recordWrapperType: RecordWrapperType)

    /**
     * @param shuffleConfig Shuffle config option for input data in a channel.
     */
    public fun shuffleConfig(shuffleConfig: ShuffleConfig)

    /**
     * @param shuffleConfig Shuffle config option for input data in a channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e74bda975f33af7e76b8cc25021d600f3713637da2b33486f9236864b93a52")
    public fun shuffleConfig(shuffleConfig: ShuffleConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.Channel.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.Channel.builder()

    /**
     * @param channelName Name of the channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param compressionType Compression type if training data is compressed.
     */
    override fun compressionType(compressionType: CompressionType) {
      cdkBuilder.compressionType(compressionType.let(CompressionType::unwrap))
    }

    /**
     * @param contentType The MIME type of the data.
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param dataSource Location of the channel data. 
     */
    override fun dataSource(dataSource: DataSource) {
      cdkBuilder.dataSource(dataSource.let(DataSource::unwrap))
    }

    /**
     * @param dataSource Location of the channel data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08384c89c67f863a95ea6bced0745c976d9e2dff8312118b611066805676df29")
    override fun dataSource(dataSource: DataSource.Builder.() -> Unit): Unit =
        dataSource(DataSource(dataSource))

    /**
     * @param inputMode Input mode to use for the data channel in a training job.
     */
    override fun inputMode(inputMode: InputMode) {
      cdkBuilder.inputMode(inputMode.let(InputMode::unwrap))
    }

    /**
     * @param recordWrapperType Specify RecordIO as the value when input data is in raw format but
     * the training algorithm requires the RecordIO format.
     * In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record.
     * If the input data is already in RecordIO format, you don't need to set this attribute.
     */
    override fun recordWrapperType(recordWrapperType: RecordWrapperType) {
      cdkBuilder.recordWrapperType(recordWrapperType.let(RecordWrapperType::unwrap))
    }

    /**
     * @param shuffleConfig Shuffle config option for input data in a channel.
     */
    override fun shuffleConfig(shuffleConfig: ShuffleConfig) {
      cdkBuilder.shuffleConfig(shuffleConfig.let(ShuffleConfig::unwrap))
    }

    /**
     * @param shuffleConfig Shuffle config option for input data in a channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e74bda975f33af7e76b8cc25021d600f3713637da2b33486f9236864b93a52")
    override fun shuffleConfig(shuffleConfig: ShuffleConfig.Builder.() -> Unit): Unit =
        shuffleConfig(ShuffleConfig(shuffleConfig))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.Channel =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Channel,
  ) : CdkObject(cdkObject), Channel {
    /**
     * Name of the channel.
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * Compression type if training data is compressed.
     *
     * Default: - None
     */
    override fun compressionType(): CompressionType? =
        unwrap(this).getCompressionType()?.let(CompressionType::wrap)

    /**
     * The MIME type of the data.
     *
     * Default: - None
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * Location of the channel data.
     */
    override fun dataSource(): DataSource = unwrap(this).getDataSource().let(DataSource::wrap)

    /**
     * Input mode to use for the data channel in a training job.
     *
     * Default: - None
     */
    override fun inputMode(): InputMode? = unwrap(this).getInputMode()?.let(InputMode::wrap)

    /**
     * Specify RecordIO as the value when input data is in raw format but the training algorithm
     * requires the RecordIO format.
     *
     * In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record.
     * If the input data is already in RecordIO format, you don't need to set this attribute.
     *
     * Default: - None
     */
    override fun recordWrapperType(): RecordWrapperType? =
        unwrap(this).getRecordWrapperType()?.let(RecordWrapperType::wrap)

    /**
     * Shuffle config option for input data in a channel.
     *
     * Default: - None
     */
    override fun shuffleConfig(): ShuffleConfig? =
        unwrap(this).getShuffleConfig()?.let(ShuffleConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Channel {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Channel):
        Channel = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Channel):
        software.amazon.awscdk.services.stepfunctions.tasks.Channel = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.Channel
  }
}
