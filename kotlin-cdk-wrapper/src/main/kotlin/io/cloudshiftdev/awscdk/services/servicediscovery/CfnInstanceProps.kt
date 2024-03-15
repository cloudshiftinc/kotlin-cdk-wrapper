@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnInstanceProps {
  public fun instanceAttributes(): Any

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public fun serviceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun instanceAttributes(instanceAttributes: Any)

    public fun instanceId(instanceId: String)

    public fun serviceId(serviceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnInstanceProps.builder()

    override fun instanceAttributes(instanceAttributes: Any) {
      cdkBuilder.instanceAttributes(instanceAttributes)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.CfnInstanceProps,
  ) : CdkObject(cdkObject), CfnInstanceProps {
    override fun instanceAttributes(): Any = unwrap(this).getInstanceAttributes()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun serviceId(): String = unwrap(this).getServiceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnInstanceProps):
        CfnInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.servicediscovery.CfnInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.CfnInstanceProps
  }
}
