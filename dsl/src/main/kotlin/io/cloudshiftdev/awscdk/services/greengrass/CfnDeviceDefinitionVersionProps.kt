package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDeviceDefinitionVersionProps {
  /**
   * The ID of the device definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid)
   */
  public fun deviceDefinitionId(): String

  /**
   * The devices in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
   */
  public fun devices(): Any

  /**
   * A builder for [CfnDeviceDefinitionVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deviceDefinitionId The ID of the device definition associated with this version. 
     * This value is a GUID.
     */
    public fun deviceDefinitionId(deviceDefinitionId: String)

    /**
     * @param devices The devices in this version. 
     */
    public fun devices(devices: IResolvable)

    /**
     * @param devices The devices in this version. 
     */
    public fun devices(devices: List<Any>)

    /**
     * @param devices The devices in this version. 
     */
    public fun devices(vararg devices: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps.builder()

    /**
     * @param deviceDefinitionId The ID of the device definition associated with this version. 
     * This value is a GUID.
     */
    override fun deviceDefinitionId(deviceDefinitionId: String) {
      cdkBuilder.deviceDefinitionId(deviceDefinitionId)
    }

    /**
     * @param devices The devices in this version. 
     */
    override fun devices(devices: IResolvable) {
      cdkBuilder.devices(devices.let(IResolvable::unwrap))
    }

    /**
     * @param devices The devices in this version. 
     */
    override fun devices(devices: List<Any>) {
      cdkBuilder.devices(devices)
    }

    /**
     * @param devices The devices in this version. 
     */
    override fun devices(vararg devices: Any): Unit = devices(devices.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnDeviceDefinitionVersionProps {
    /**
     * The ID of the device definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid)
     */
    override fun deviceDefinitionId(): String = unwrap(this).getDeviceDefinitionId()

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     */
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
