package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CnameInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstance,
) : InstanceBase(cdkObject) {
  public open fun cname(): String = unwrap(this).getCname()

  public override fun instanceId(): String = unwrap(this).getInstanceId()

  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun instanceCname(instanceCname: String)

    public fun instanceId(instanceId: String)

    public fun service(service: IService)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CnameInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.CnameInstance.Builder.create(scope, id)

    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    override fun instanceCname(instanceCname: String) {
      cdkBuilder.instanceCname(instanceCname)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CnameInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CnameInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CnameInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstance):
        CnameInstance = CnameInstance(cdkObject)

    internal fun unwrap(wrapped: CnameInstance):
        software.amazon.awscdk.services.servicediscovery.CnameInstance = wrapped.cdkObject
  }
}
