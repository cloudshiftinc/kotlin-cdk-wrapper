package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Unit
import kotlin.collections.List

public interface ResponseCustomHeadersBehavior {
  public fun customHeaders(): List<ResponseCustomHeader>

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

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior,
  ) : ResponseCustomHeadersBehavior {
    override fun customHeaders(): List<ResponseCustomHeader> =
        unwrap(this).getCustomHeaders().map(ResponseCustomHeader::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseCustomHeadersBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior):
        ResponseCustomHeadersBehavior = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseCustomHeadersBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior = (wrapped as
        Wrapper).cdkObject
  }
}
