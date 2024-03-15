@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnApiDestinationProps {
  public fun connectionArn(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun httpMethod(): String

  public fun invocationEndpoint(): String

  public fun invocationRateLimitPerSecond(): Number? =
      unwrap(this).getInvocationRateLimitPerSecond()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun connectionArn(connectionArn: String)

    public fun description(description: String)

    public fun httpMethod(httpMethod: String)

    public fun invocationEndpoint(invocationEndpoint: String)

    public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnApiDestinationProps.Builder =
        software.amazon.awscdk.services.events.CfnApiDestinationProps.builder()

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    override fun invocationEndpoint(invocationEndpoint: String) {
      cdkBuilder.invocationEndpoint(invocationEndpoint)
    }

    override fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number) {
      cdkBuilder.invocationRateLimitPerSecond(invocationRateLimitPerSecond)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnApiDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnApiDestinationProps,
  ) : CdkObject(cdkObject), CfnApiDestinationProps {
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    override fun description(): String? = unwrap(this).getDescription()

    override fun httpMethod(): String = unwrap(this).getHttpMethod()

    override fun invocationEndpoint(): String = unwrap(this).getInvocationEndpoint()

    override fun invocationRateLimitPerSecond(): Number? =
        unwrap(this).getInvocationRateLimitPerSecond()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnApiDestinationProps):
        CfnApiDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiDestinationProps):
        software.amazon.awscdk.services.events.CfnApiDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnApiDestinationProps
  }
}
