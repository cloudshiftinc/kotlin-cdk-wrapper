@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun caller(caller: Boolean)

    public fun httpMethod(httpMethod: Boolean)

    public fun ip(ip: Boolean)

    public fun protocol(protocol: Boolean)

    public fun requestTime(requestTime: Boolean)

    public fun resourcePath(resourcePath: Boolean)

    public fun responseLength(responseLength: Boolean)

    public fun status(status: Boolean)

    public fun user(user: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.Builder =
        software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.builder()

    override fun caller(caller: Boolean) {
      cdkBuilder.caller(caller)
    }

    override fun httpMethod(httpMethod: Boolean) {
      cdkBuilder.httpMethod(httpMethod)
    }

    override fun ip(ip: Boolean) {
      cdkBuilder.ip(ip)
    }

    override fun protocol(protocol: Boolean) {
      cdkBuilder.protocol(protocol)
    }

    override fun requestTime(requestTime: Boolean) {
      cdkBuilder.requestTime(requestTime)
    }

    override fun resourcePath(resourcePath: Boolean) {
      cdkBuilder.resourcePath(resourcePath)
    }

    override fun responseLength(responseLength: Boolean) {
      cdkBuilder.responseLength(responseLength)
    }

    override fun status(status: Boolean) {
      cdkBuilder.status(status)
    }

    override fun user(user: Boolean) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps,
  ) : CdkObject(cdkObject), JsonWithStandardFieldProps {
    override fun caller(): Boolean = unwrap(this).getCaller()

    override fun httpMethod(): Boolean = unwrap(this).getHttpMethod()

    override fun ip(): Boolean = unwrap(this).getIp()

    override fun protocol(): Boolean = unwrap(this).getProtocol()

    override fun requestTime(): Boolean = unwrap(this).getRequestTime()

    override fun resourcePath(): Boolean = unwrap(this).getResourcePath()

    override fun responseLength(): Boolean = unwrap(this).getResponseLength()

    override fun status(): Boolean = unwrap(this).getStatus()

    override fun user(): Boolean = unwrap(this).getUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonWithStandardFieldProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps):
        JsonWithStandardFieldProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonWithStandardFieldProps):
        software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps
  }
}
