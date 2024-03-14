package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TransformInput {
  public fun compressionType(): CompressionType? =
      unwrap(this).getCompressionType()?.let(CompressionType::wrap)

  public fun contentType(): String? = unwrap(this).getContentType()

  public fun splitType(): SplitType? = unwrap(this).getSplitType()?.let(SplitType::wrap)

  public fun transformDataSource(): TransformDataSource

  public interface Builder {
    public fun compressionType(compressionType: CompressionType)

    public fun contentType(contentType: String)

    public fun splitType(splitType: SplitType)

    public fun transformDataSource(transformDataSource: TransformDataSource)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f551870120542c8db26a2b12caf7813593a48287a8bf352a51c8dc7371a7c04")
    public fun transformDataSource(transformDataSource: TransformDataSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformInput.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformInput.builder()

    override fun compressionType(compressionType: CompressionType) {
      cdkBuilder.compressionType(compressionType.let(CompressionType::unwrap))
    }

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun splitType(splitType: SplitType) {
      cdkBuilder.splitType(splitType.let(SplitType::unwrap))
    }

    override fun transformDataSource(transformDataSource: TransformDataSource) {
      cdkBuilder.transformDataSource(transformDataSource.let(TransformDataSource::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f551870120542c8db26a2b12caf7813593a48287a8bf352a51c8dc7371a7c04")
    override fun transformDataSource(transformDataSource: TransformDataSource.Builder.() -> Unit):
        Unit = transformDataSource(TransformDataSource(transformDataSource))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformInput =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformInput,
  ) : TransformInput {
    override fun compressionType(): CompressionType? =
        unwrap(this).getCompressionType()?.let(CompressionType::wrap)

    override fun contentType(): String? = unwrap(this).getContentType()

    override fun splitType(): SplitType? = unwrap(this).getSplitType()?.let(SplitType::wrap)

    override fun transformDataSource(): TransformDataSource =
        unwrap(this).getTransformDataSource().let(TransformDataSource::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TransformInput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformInput):
        TransformInput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformInput):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformInput = (wrapped as
        Wrapper).cdkObject
  }
}
