package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Suppress
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

  public interface Builder {
    public fun channelName(channelName: String) {
    }

    public fun compressionType(compressionType: CompressionType) {
    }

    public fun contentType(contentType: String) {
    }

    public fun dataSource(dataSource: DataSource) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08384c89c67f863a95ea6bced0745c976d9e2dff8312118b611066805676df29")
    public fun dataSource(dataSource: DataSource.Builder.() -> Unit) {
    }

    public fun inputMode(inputMode: InputMode) {
    }

    public fun recordWrapperType(recordWrapperType: RecordWrapperType) {
    }

    public fun shuffleConfig(shuffleConfig: ShuffleConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e74bda975f33af7e76b8cc25021d600f3713637da2b33486f9236864b93a52")
    public fun shuffleConfig(shuffleConfig: ShuffleConfig.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.Channel.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.Channel.builder()

    public override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    public override fun compressionType(compressionType: CompressionType) {
      cdkBuilder.compressionType(compressionType.let(CompressionType::unwrap))
    }

    public override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    public override fun dataSource(dataSource: DataSource) {
      cdkBuilder.dataSource(dataSource.let(DataSource::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08384c89c67f863a95ea6bced0745c976d9e2dff8312118b611066805676df29")
    public override fun dataSource(dataSource: DataSource.Builder.() -> Unit): Unit =
        dataSource(DataSource(dataSource))

    public override fun inputMode(inputMode: InputMode) {
      cdkBuilder.inputMode(inputMode.let(InputMode::unwrap))
    }

    public override fun recordWrapperType(recordWrapperType: RecordWrapperType) {
      cdkBuilder.recordWrapperType(recordWrapperType.let(RecordWrapperType::unwrap))
    }

    public override fun shuffleConfig(shuffleConfig: ShuffleConfig) {
      cdkBuilder.shuffleConfig(shuffleConfig.let(ShuffleConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e74bda975f33af7e76b8cc25021d600f3713637da2b33486f9236864b93a52")
    public override fun shuffleConfig(shuffleConfig: ShuffleConfig.Builder.() -> Unit): Unit =
        shuffleConfig(ShuffleConfig(shuffleConfig))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.Channel =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Channel,
  ) : Channel {
    public override fun channelName(): String = unwrap(this).getChannelName()

    public override fun compressionType(): CompressionType? =
        unwrap(this).getCompressionType()?.let(CompressionType::wrap)

    public override fun contentType(): String? = unwrap(this).getContentType()

    public override fun dataSource(): DataSource =
        unwrap(this).getDataSource().let(DataSource::wrap)

    public override fun inputMode(): InputMode? = unwrap(this).getInputMode()?.let(InputMode::wrap)

    public override fun recordWrapperType(): RecordWrapperType? =
        unwrap(this).getRecordWrapperType()?.let(RecordWrapperType::wrap)

    public override fun shuffleConfig(): ShuffleConfig? =
        unwrap(this).getShuffleConfig()?.let(ShuffleConfig::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Channel {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Channel):
        Channel = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Channel):
        software.amazon.awscdk.services.stepfunctions.tasks.Channel = (wrapped as Wrapper).cdkObject
  }
}
