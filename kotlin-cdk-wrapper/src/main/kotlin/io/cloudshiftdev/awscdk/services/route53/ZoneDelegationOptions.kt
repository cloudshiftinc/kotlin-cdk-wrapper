@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ZoneDelegationOptions {
  public fun comment(): String? = unwrap(this).getComment()

  public fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.ZoneDelegationOptions.Builder =
        software.amazon.awscdk.services.route53.ZoneDelegationOptions.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.ZoneDelegationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.ZoneDelegationOptions,
  ) : CdkObject(cdkObject), ZoneDelegationOptions {
    override fun comment(): String? = unwrap(this).getComment()

    override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ZoneDelegationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.ZoneDelegationOptions):
        ZoneDelegationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ZoneDelegationOptions):
        software.amazon.awscdk.services.route53.ZoneDelegationOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.ZoneDelegationOptions
  }
}
