package io.cloudshiftdev.awscdk.services.codebuild

import kotlin.String
import kotlin.Unit

public interface BucketCacheOptions {
  public fun prefix(): String? = unwrap(this).getPrefix()

  public interface Builder {
    public fun prefix(prefix: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BucketCacheOptions.Builder =
        software.amazon.awscdk.services.codebuild.BucketCacheOptions.builder()

    public override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BucketCacheOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.BucketCacheOptions,
  ) : BucketCacheOptions {
    public override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BucketCacheOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BucketCacheOptions):
        BucketCacheOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketCacheOptions):
        software.amazon.awscdk.services.codebuild.BucketCacheOptions = (wrapped as
        Wrapper).cdkObject
  }
}
