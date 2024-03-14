package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ErrorResponse {
  public fun httpStatus(): Number

  public fun responseHttpStatus(): Number? = unwrap(this).getResponseHttpStatus()

  public fun responsePagePath(): String? = unwrap(this).getResponsePagePath()

  public fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

  public interface Builder {
    public fun httpStatus(httpStatus: Number) {
    }

    public fun responseHttpStatus(responseHttpStatus: Number) {
    }

    public fun responsePagePath(responsePagePath: String) {
    }

    public fun ttl(ttl: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.ErrorResponse.Builder =
        software.amazon.awscdk.services.cloudfront.ErrorResponse.builder()

    public override fun httpStatus(httpStatus: Number) {
      cdkBuilder.httpStatus(httpStatus)
    }

    public override fun responseHttpStatus(responseHttpStatus: Number) {
      cdkBuilder.responseHttpStatus(responseHttpStatus)
    }

    public override fun responsePagePath(responsePagePath: String) {
      cdkBuilder.responsePagePath(responsePagePath)
    }

    public override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ErrorResponse =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ErrorResponse,
  ) : ErrorResponse {
    public override fun httpStatus(): Number = unwrap(this).getHttpStatus()

    public override fun responseHttpStatus(): Number? = unwrap(this).getResponseHttpStatus()

    public override fun responsePagePath(): String? = unwrap(this).getResponsePagePath()

    public override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ErrorResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ErrorResponse):
        ErrorResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ErrorResponse):
        software.amazon.awscdk.services.cloudfront.ErrorResponse = (wrapped as Wrapper).cdkObject
  }
}
