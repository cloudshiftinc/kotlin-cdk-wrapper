@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface NonIpInstanceBaseProps : BaseInstanceProps {
  @CdkDslMarker
  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun instanceId(instanceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps.Builder =
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps.builder()

    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps,
  ) : CdkObject(cdkObject), NonIpInstanceBaseProps {
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    override fun instanceId(): String? = unwrap(this).getInstanceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NonIpInstanceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps):
        NonIpInstanceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NonIpInstanceBaseProps):
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps
  }
}