@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDeviceDefinitionVersionProps {
  public fun deviceDefinitionId(): String

  public fun devices(): Any

  @CdkDslMarker
  public interface Builder {
    public fun deviceDefinitionId(deviceDefinitionId: String)

    public fun devices(devices: IResolvable)

    public fun devices(devices: List<Any>)

    public fun devices(vararg devices: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps.builder()

    override fun deviceDefinitionId(deviceDefinitionId: String) {
      cdkBuilder.deviceDefinitionId(deviceDefinitionId)
    }

    override fun devices(devices: IResolvable) {
      cdkBuilder.devices(devices.let(IResolvable::unwrap))
    }

    override fun devices(devices: List<Any>) {
      cdkBuilder.devices(devices)
    }

    override fun devices(vararg devices: Any): Unit = devices(devices.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnDeviceDefinitionVersionProps {
    override fun deviceDefinitionId(): String = unwrap(this).getDeviceDefinitionId()

    override fun devices(): Any = unwrap(this).getDevices()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps):
        CfnDeviceDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps
  }
}
