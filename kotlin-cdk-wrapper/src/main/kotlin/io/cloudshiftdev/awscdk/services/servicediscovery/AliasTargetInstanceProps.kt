@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AliasTargetInstanceProps : BaseInstanceProps {
  public fun dnsName(): String

  public fun service(): IService

  @CdkDslMarker
  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun dnsName(dnsName: String)

    public fun instanceId(instanceId: String)

    public fun service(service: IService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps.builder()

    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps,
  ) : CdkObject(cdkObject), AliasTargetInstanceProps {
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    override fun dnsName(): String = unwrap(this).getDnsName()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun service(): IService = unwrap(this).getService().let(IService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasTargetInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps):
        AliasTargetInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasTargetInstanceProps):
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
  }
}
