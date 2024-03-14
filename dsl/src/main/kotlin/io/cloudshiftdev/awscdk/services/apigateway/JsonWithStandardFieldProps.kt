package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Boolean
import kotlin.Unit

public interface JsonWithStandardFieldProps {
  public fun caller(): Boolean

  public fun httpMethod(): Boolean

  public fun ip(): Boolean

  public fun protocol(): Boolean

  public fun requestTime(): Boolean

  public fun resourcePath(): Boolean

  public fun responseLength(): Boolean

  public fun status(): Boolean

  public fun user(): Boolean

  public interface Builder {
    public fun caller(caller: Boolean) {
    }

    public fun httpMethod(httpMethod: Boolean) {
    }

    public fun ip(ip: Boolean) {
    }

    public fun protocol(protocol: Boolean) {
    }

    public fun requestTime(requestTime: Boolean) {
    }

    public fun resourcePath(resourcePath: Boolean) {
    }

    public fun responseLength(responseLength: Boolean) {
    }

    public fun status(status: Boolean) {
    }

    public fun user(user: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.Builder =
        software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.builder()

    public override fun caller(caller: Boolean) {
      cdkBuilder.caller(caller)
    }

    public override fun httpMethod(httpMethod: Boolean) {
      cdkBuilder.httpMethod(httpMethod)
    }

    public override fun ip(ip: Boolean) {
      cdkBuilder.ip(ip)
    }

    public override fun protocol(protocol: Boolean) {
      cdkBuilder.protocol(protocol)
    }

    public override fun requestTime(requestTime: Boolean) {
      cdkBuilder.requestTime(requestTime)
    }

    public override fun resourcePath(resourcePath: Boolean) {
      cdkBuilder.resourcePath(resourcePath)
    }

    public override fun responseLength(responseLength: Boolean) {
      cdkBuilder.responseLength(responseLength)
    }

    public override fun status(status: Boolean) {
      cdkBuilder.status(status)
    }

    public override fun user(user: Boolean) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps,
  ) : JsonWithStandardFieldProps {
    public override fun caller(): Boolean = unwrap(this).getCaller()

    public override fun httpMethod(): Boolean = unwrap(this).getHttpMethod()

    public override fun ip(): Boolean = unwrap(this).getIp()

    public override fun protocol(): Boolean = unwrap(this).getProtocol()

    public override fun requestTime(): Boolean = unwrap(this).getRequestTime()

    public override fun resourcePath(): Boolean = unwrap(this).getResourcePath()

    public override fun responseLength(): Boolean = unwrap(this).getResponseLength()

    public override fun status(): Boolean = unwrap(this).getStatus()

    public override fun user(): Boolean = unwrap(this).getUser()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): JsonWithStandardFieldProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps):
        JsonWithStandardFieldProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonWithStandardFieldProps):
        software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps = (wrapped as
        Wrapper).cdkObject
  }
}
