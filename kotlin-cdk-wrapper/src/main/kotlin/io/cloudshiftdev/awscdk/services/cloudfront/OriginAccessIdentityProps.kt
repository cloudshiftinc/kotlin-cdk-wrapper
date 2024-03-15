@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface OriginAccessIdentityProps {
  public fun comment(): String? = unwrap(this).getComment()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps.Builder =
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps,
  ) : CdkObject(cdkObject), OriginAccessIdentityProps {
    override fun comment(): String? = unwrap(this).getComment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginAccessIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps):
        OriginAccessIdentityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginAccessIdentityProps):
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps
  }
}
