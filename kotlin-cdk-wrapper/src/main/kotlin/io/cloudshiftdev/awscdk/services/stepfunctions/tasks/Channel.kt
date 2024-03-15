@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface Channel {
  public fun channelName(): String

  public fun compressionType(): CompressionType? =
      unwrap(this).getCompressionType()?.let(CompressionType::wrap)

  public fun contentType(): String? = unwrap(this).getContentType()

  public fun dataSource(): DataSource

  public fun inputMode(): InputMode? = unwrap(this).getInputMode()?.let(InputMode::wrap)

  public fun recordWrapperType(): RecordWrapperType? =
      unwrap(this).getRecordWrapperType()?.let(RecordWrapperType::wrap)

  public fun shuffleConfig(): ShuffleConfig? =
      unwrap(this).getShuffleConfig()?.let(ShuffleConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun channelName(channelName: String)

    public fun compressionType(compressionType: CompressionType)

    public fun contentType(contentType: String)

    public fun dataSource(dataSource: DataSource)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08384c89c67f863a95ea6bced0745c976d9e2dff8312118b611066805676df29")
    public fun dataSource(dataSource: DataSource.Builder.() -> Unit)

    public fun inputMode(inputMode: InputMode)

    public fun recordWrapperType(recordWrapperType: RecordWrapperType)

    public fun shuffleConfig(shuffleConfig: ShuffleConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e74bda975f33af7e76b8cc25021d600f3713637da2b33486f9236864b93a52")
    public fun shuffleConfig(shuffleConfig: ShuffleConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.Channel.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.Channel.builder()

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun compressionType(compressionType: CompressionType) {
      cdkBuilder.compressionType(compressionType.let(CompressionType::unwrap))
    }

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun dataSource(dataSource: DataSource) {
      cdkBuilder.dataSource(dataSource.let(DataSource::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08384c89c67f863a95ea6bced0745c976d9e2dff8312118b611066805676df29")
    override fun dataSource(dataSource: DataSource.Builder.() -> Unit): Unit =
        dataSource(DataSource(dataSource))

    override fun inputMode(inputMode: InputMode) {
      cdkBuilder.inputMode(inputMode.let(InputMode::unwrap))
    }

    override fun recordWrapperType(recordWrapperType: RecordWrapperType) {
      cdkBuilder.recordWrapperType(recordWrapperType.let(RecordWrapperType::unwrap))
    }

    override fun shuffleConfig(shuffleConfig: ShuffleConfig) {
      cdkBuilder.shuffleConfig(shuffleConfig.let(ShuffleConfig::unwrap))
    }

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
    override fun channelName(): String = unwrap(this).getChannelName()

    override fun compressionType(): CompressionType? =
        unwrap(this).getCompressionType()?.let(CompressionType::wrap)

    override fun contentType(): String? = unwrap(this).getContentType()

    override fun dataSource(): DataSource = unwrap(this).getDataSource().let(DataSource::wrap)

    override fun inputMode(): InputMode? = unwrap(this).getInputMode()?.let(InputMode::wrap)

    override fun recordWrapperType(): RecordWrapperType? =
        unwrap(this).getRecordWrapperType()?.let(RecordWrapperType::wrap)

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
