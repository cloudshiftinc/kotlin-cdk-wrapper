@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.CfnApiDestination,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun connectionArn(): String = unwrap(this).getConnectionArn()

  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun httpMethod(): String = unwrap(this).getHttpMethod()

  public open fun httpMethod(`value`: String) {
    unwrap(this).setHttpMethod(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun invocationEndpoint(): String = unwrap(this).getInvocationEndpoint()

  public open fun invocationEndpoint(`value`: String) {
    unwrap(this).setInvocationEndpoint(`value`)
  }

  public open fun invocationRateLimitPerSecond(): Number? =
      unwrap(this).getInvocationRateLimitPerSecond()

  public open fun invocationRateLimitPerSecond(`value`: Number) {
    unwrap(this).setInvocationRateLimitPerSecond(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun connectionArn(connectionArn: String)

    public fun description(description: String)

    public fun httpMethod(httpMethod: String)

    public fun invocationEndpoint(invocationEndpoint: String)

    public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnApiDestination.Builder =
        software.amazon.awscdk.services.events.CfnApiDestination.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.events.CfnApiDestination =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnApiDestination.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnApiDestination):
        CfnApiDestination = CfnApiDestination(cdkObject)

    internal fun unwrap(wrapped: CfnApiDestination):
        software.amazon.awscdk.services.events.CfnApiDestination = wrapped.cdkObject
  }
}
