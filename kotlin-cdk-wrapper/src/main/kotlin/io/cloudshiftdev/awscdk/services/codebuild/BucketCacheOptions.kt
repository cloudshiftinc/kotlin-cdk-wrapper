@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface BucketCacheOptions {
  public fun prefix(): String? = unwrap(this).getPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BucketCacheOptions.Builder =
        software.amazon.awscdk.services.codebuild.BucketCacheOptions.builder()

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BucketCacheOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.BucketCacheOptions,
  ) : CdkObject(cdkObject), BucketCacheOptions {
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketCacheOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BucketCacheOptions):
        BucketCacheOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketCacheOptions):
        software.amazon.awscdk.services.codebuild.BucketCacheOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BucketCacheOptions
  }
}
