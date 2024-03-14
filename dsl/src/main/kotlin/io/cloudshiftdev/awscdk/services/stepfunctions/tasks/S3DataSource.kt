package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface S3DataSource {
  public fun attributeNames(): List<String> = unwrap(this).getAttributeNames() ?: emptyList()

  public fun s3DataDistributionType(): S3DataDistributionType? =
      unwrap(this).getS3DataDistributionType()?.let(S3DataDistributionType::wrap)

  public fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

  public fun s3Location(): S3Location

  public interface Builder {
    public fun attributeNames(attributeNames: List<String>)

    public fun s3DataDistributionType(s3DataDistributionType: S3DataDistributionType)

    public fun s3DataType(s3DataType: S3DataType)

    public fun s3Location(s3Location: S3Location)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource.Builder
        = software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource.builder()

    override fun attributeNames(attributeNames: List<String>) {
      cdkBuilder.attributeNames(attributeNames)
    }

    override fun s3DataDistributionType(s3DataDistributionType: S3DataDistributionType) {
      cdkBuilder.s3DataDistributionType(s3DataDistributionType.let(S3DataDistributionType::unwrap))
    }

    override fun s3DataType(s3DataType: S3DataType) {
      cdkBuilder.s3DataType(s3DataType.let(S3DataType::unwrap))
    }

    override fun s3Location(s3Location: S3Location) {
      cdkBuilder.s3Location(s3Location.let(S3Location::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource,
  ) : S3DataSource {
    override fun attributeNames(): List<String> = unwrap(this).getAttributeNames() ?: emptyList()

    override fun s3DataDistributionType(): S3DataDistributionType? =
        unwrap(this).getS3DataDistributionType()?.let(S3DataDistributionType::wrap)

    override fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

    override fun s3Location(): S3Location = unwrap(this).getS3Location().let(S3Location::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): S3DataSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource):
        S3DataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3DataSource):
        software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource = (wrapped as
        Wrapper).cdkObject
  }
}
