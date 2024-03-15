@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface LoggingConfiguration {
  public fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  public fun includeCookies(): Boolean? = unwrap(this).getIncludeCookies()

  public fun prefix(): String? = unwrap(this).getPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun includeCookies(includeCookies: Boolean)

    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder
        = software.amazon.awscdk.services.cloudfront.LoggingConfiguration.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun includeCookies(includeCookies: Boolean) {
      cdkBuilder.includeCookies(includeCookies)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.LoggingConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.LoggingConfiguration,
  ) : CdkObject(cdkObject), LoggingConfiguration {
    override fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

    override fun includeCookies(): Boolean? = unwrap(this).getIncludeCookies()

    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.LoggingConfiguration):
        LoggingConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingConfiguration):
        software.amazon.awscdk.services.cloudfront.LoggingConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.LoggingConfiguration
  }
}
