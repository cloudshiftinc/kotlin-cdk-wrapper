package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NonIpInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstance,
) : InstanceBase(cdkObject) {
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>) {
    }

    public fun instanceId(instanceId: String) {
    }

    public fun service(service: IService) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.NonIpInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.NonIpInstance.Builder.create(scope, id)

    public override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    public override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.NonIpInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NonIpInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NonIpInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstance):
        NonIpInstance = NonIpInstance(cdkObject)

    internal fun unwrap(wrapped: NonIpInstance):
        software.amazon.awscdk.services.servicediscovery.NonIpInstance = wrapped.cdkObject
  }
}
