@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface ResponseCustomHeadersBehavior {
  public fun customHeaders(): List<ResponseCustomHeader>

  @CdkDslMarker
  public interface Builder {
    public fun customHeaders(customHeaders: List<ResponseCustomHeader>)

    public fun customHeaders(vararg customHeaders: ResponseCustomHeader)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior.builder()

    override fun customHeaders(customHeaders: List<ResponseCustomHeader>) {
      cdkBuilder.customHeaders(customHeaders.map(ResponseCustomHeader::unwrap))
    }

    override fun customHeaders(vararg customHeaders: ResponseCustomHeader): Unit =
        customHeaders(customHeaders.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior,
  ) : CdkObject(cdkObject), ResponseCustomHeadersBehavior {
    override fun customHeaders(): List<ResponseCustomHeader> =
        unwrap(this).getCustomHeaders().map(ResponseCustomHeader::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseCustomHeadersBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior):
        ResponseCustomHeadersBehavior = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseCustomHeadersBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior
  }
}
