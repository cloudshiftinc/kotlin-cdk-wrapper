package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface BuildEnvironmentCertificate {
  public fun bucket(): IBucket

  public fun objectKey(): String

  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun objectKey(objectKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate.Builder =
        software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate,
  ) : BuildEnvironmentCertificate {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun objectKey(): String = unwrap(this).getObjectKey()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BuildEnvironmentCertificate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate):
        BuildEnvironmentCertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildEnvironmentCertificate):
        software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate = (wrapped as
        Wrapper).cdkObject
  }
}
