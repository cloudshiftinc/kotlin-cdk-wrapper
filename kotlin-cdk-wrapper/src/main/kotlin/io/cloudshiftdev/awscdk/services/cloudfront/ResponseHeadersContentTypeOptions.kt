@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersContentTypeOptions {
  public fun `override`(): Boolean

  @CdkDslMarker
  public interface Builder {
    public fun `override`(`override`: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions.builder()

    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions,
  ) : CdkObject(cdkObject), ResponseHeadersContentTypeOptions {
    override fun `override`(): Boolean = unwrap(this).getOverride()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersContentTypeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions):
        ResponseHeadersContentTypeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersContentTypeOptions):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
  }
}
