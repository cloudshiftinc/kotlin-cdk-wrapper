@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface VirtualHostedStyleUrlOptions {
  public fun regional(): Boolean? = unwrap(this).getRegional()

  @CdkDslMarker
  public interface Builder {
    public fun regional(regional: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions.Builder
        = software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions.builder()

    override fun regional(regional: Boolean) {
      cdkBuilder.regional(regional)
    }

    public fun build(): software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions,
  ) : CdkObject(cdkObject), VirtualHostedStyleUrlOptions {
    override fun regional(): Boolean? = unwrap(this).getRegional()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualHostedStyleUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions):
        VirtualHostedStyleUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualHostedStyleUrlOptions):
        software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions
  }
}
