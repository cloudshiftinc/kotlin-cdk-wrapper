package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.CfnInstance,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceAttributes(): Any = unwrap(this).getInstanceAttributes()

  public open fun instanceAttributes(`value`: Any) {
    unwrap(this).setInstanceAttributes(`value`)
  }

  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun serviceId(): String = unwrap(this).getServiceId()

  public open fun serviceId(`value`: String) {
    unwrap(this).setServiceId(`value`)
  }

  public interface Builder {
    public fun instanceAttributes(instanceAttributes: Any) {
    }

    public fun instanceId(instanceId: String) {
    }

    public fun serviceId(serviceId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CfnInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnInstance.Builder.create(scope, id)

    public override fun instanceAttributes(instanceAttributes: Any) {
      cdkBuilder.instanceAttributes(instanceAttributes)
    }

    public override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnInstance):
        CfnInstance = CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance):
        software.amazon.awscdk.services.servicediscovery.CfnInstance = wrapped.cdkObject
  }
}
