package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TransformDataSource {
  public fun s3DataSource(): TransformS3DataSource

  public interface Builder {
    public fun s3DataSource(s3DataSource: TransformS3DataSource) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cef63f9015e5860a7abe9681e3daedec5a393ef9abc69e1937f27214de3e2f8")
    public fun s3DataSource(s3DataSource: TransformS3DataSource.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource.builder()

    public override fun s3DataSource(s3DataSource: TransformS3DataSource) {
      cdkBuilder.s3DataSource(s3DataSource.let(TransformS3DataSource::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cef63f9015e5860a7abe9681e3daedec5a393ef9abc69e1937f27214de3e2f8")
    public override fun s3DataSource(s3DataSource: TransformS3DataSource.Builder.() -> Unit): Unit =
        s3DataSource(TransformS3DataSource(s3DataSource))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource,
  ) : TransformDataSource {
    public override fun s3DataSource(): TransformS3DataSource =
        unwrap(this).getS3DataSource().let(TransformS3DataSource::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TransformDataSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource):
        TransformDataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformDataSource):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource = (wrapped as
        Wrapper).cdkObject
  }
}
