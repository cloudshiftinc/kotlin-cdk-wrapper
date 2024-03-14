package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Unit

public interface TransformS3DataSource {
  public fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

  public fun s3Uri(): String

  public interface Builder {
    public fun s3DataType(s3DataType: S3DataType)

    public fun s3Uri(s3Uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource.builder()

    override fun s3DataType(s3DataType: S3DataType) {
      cdkBuilder.s3DataType(s3DataType.let(S3DataType::unwrap))
    }

    override fun s3Uri(s3Uri: String) {
      cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource,
  ) : TransformS3DataSource {
    override fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

    override fun s3Uri(): String = unwrap(this).getS3Uri()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TransformS3DataSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource):
        TransformS3DataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformS3DataSource):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource = (wrapped as
        Wrapper).cdkObject
  }
}
