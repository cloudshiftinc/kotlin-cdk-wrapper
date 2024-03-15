@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface S3SourceProps : SourceProps {
  public fun bucket(): IBucket

  public fun path(): String

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun identifier(identifier: String)

    public fun path(path: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.S3SourceProps.Builder =
        software.amazon.awscdk.services.codebuild.S3SourceProps.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.S3SourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.S3SourceProps,
  ) : CdkObject(cdkObject), S3SourceProps {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun identifier(): String? = unwrap(this).getIdentifier()

    override fun path(): String = unwrap(this).getPath()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.S3SourceProps):
        S3SourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3SourceProps):
        software.amazon.awscdk.services.codebuild.S3SourceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.S3SourceProps
  }
}
