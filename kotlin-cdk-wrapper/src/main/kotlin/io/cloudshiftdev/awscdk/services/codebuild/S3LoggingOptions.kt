@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface S3LoggingOptions {
  public fun bucket(): IBucket

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  public fun prefix(): String? = unwrap(this).getPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun enabled(enabled: Boolean)

    public fun encrypted(encrypted: Boolean)

    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.S3LoggingOptions.Builder =
        software.amazon.awscdk.services.codebuild.S3LoggingOptions.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.S3LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.S3LoggingOptions,
  ) : CdkObject(cdkObject), S3LoggingOptions {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3LoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.S3LoggingOptions):
        S3LoggingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3LoggingOptions):
        software.amazon.awscdk.services.codebuild.S3LoggingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.S3LoggingOptions
  }
}
