@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::DeviceDefinitionVersion` resource represents a device definition version
 * for AWS IoT Greengrass .
 *
 * A device definition version contains a list of devices.
 *
 *
 * To create a device definition version, you must specify the ID of the device definition that you
 * want to associate with the version. For information about creating a device definition, see
 * [`AWS::Greengrass::DeviceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
 * .
 *
 * After you create a device definition version that contains the devices you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnDeviceDefinitionVersion cfnDeviceDefinitionVersion =
 * CfnDeviceDefinitionVersion.Builder.create(this, "MyCfnDeviceDefinitionVersion")
 * .deviceDefinitionId("deviceDefinitionId")
 * .devices(List.of(DeviceProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
 */
public open class CfnDeviceDefinitionVersion(
  cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceDefinitionVersionProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeviceDefinitionVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceDefinitionVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeviceDefinitionVersionProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the device definition associated with this version.
   */
  public open fun deviceDefinitionId(): String = unwrap(this).getDeviceDefinitionId()

  /**
   * The ID of the device definition associated with this version.
   */
  public open fun deviceDefinitionId(`value`: String) {
    unwrap(this).setDeviceDefinitionId(`value`)
  }

  /**
   * The devices in this version.
   */
  public open fun devices(): Any = unwrap(this).getDevices()

  /**
   * The devices in this version.
   */
  public open fun devices(`value`: IResolvable) {
    unwrap(this).setDevices(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The devices in this version.
   */
  public open fun devices(`value`: List<Any>) {
    unwrap(this).setDevices(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The devices in this version.
   */
  public open fun devices(vararg `value`: Any): Unit = devices(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnDeviceDefinitionVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the device definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid)
     * @param deviceDefinitionId The ID of the device definition associated with this version. 
     */
    public fun deviceDefinitionId(deviceDefinitionId: String)

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     * @param devices The devices in this version. 
     */
    public fun devices(devices: IResolvable)

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     * @param devices The devices in this version. 
     */
    public fun devices(devices: List<Any>)

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     * @param devices The devices in this version. 
     */
    public fun devices(vararg devices: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.Builder.create(scope,
        id)

    /**
     * The ID of the device definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid)
     * @param deviceDefinitionId The ID of the device definition associated with this version. 
     */
    override fun deviceDefinitionId(deviceDefinitionId: String) {
      cdkBuilder.deviceDefinitionId(deviceDefinitionId)
    }

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     * @param devices The devices in this version. 
     */
    override fun devices(devices: IResolvable) {
      cdkBuilder.devices(devices.let(IResolvable.Companion::unwrap))
    }

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     * @param devices The devices in this version. 
     */
    override fun devices(devices: List<Any>) {
      cdkBuilder.devices(devices.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     * @param devices The devices in this version. 
     */
    override fun devices(vararg devices: Any): Unit = devices(devices.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion):
        CfnDeviceDefinitionVersion = CfnDeviceDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
  }

  /**
   * A device is an AWS IoT device (thing) that's added to a Greengrass group.
   *
   * Greengrass devices can communicate with the Greengrass core in the same group. For more
   * information, see [What Is AWS IoT Greengrass
   * ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html) in the *Developer
   * Guide* .
   *
   * In an AWS CloudFormation template, the `Devices` property of the
   * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
   * resource contains a list of `Device` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * DeviceProperty deviceProperty = DeviceProperty.builder()
   * .certificateArn("certificateArn")
   * .id("id")
   * .thingArn("thingArn")
   * // the properties below are optional
   * .syncShadow(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html)
   */
  public interface DeviceProperty {
    /**
     * The ARN of the device certificate for the device.
     *
     * This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT Greengrass
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-certificatearn)
     */
    public fun certificateArn(): String

    /**
     * A descriptive or arbitrary ID for the device.
     *
     * This value must be unique within the device definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-id)
     */
    public fun id(): String

    /**
     * Indicates whether the device's local shadow is synced with the cloud automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-syncshadow)
     */
    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    /**
     * The Amazon Resource Name (ARN) of the device, which is an AWS IoT device (thing).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-thingarn)
     */
    public fun thingArn(): String

    /**
     * A builder for [DeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The ARN of the device certificate for the device. 
       * This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT
       * Greengrass services.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param id A descriptive or arbitrary ID for the device. 
       * This value must be unique within the device definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
       * automatically.
       */
      public fun syncShadow(syncShadow: Boolean)

      /**
       * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
       * automatically.
       */
      public fun syncShadow(syncShadow: IResolvable)

      /**
       * @param thingArn The Amazon Resource Name (ARN) of the device, which is an AWS IoT device
       * (thing). 
       */
      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty.builder()

      /**
       * @param certificateArn The ARN of the device certificate for the device. 
       * This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT
       * Greengrass services.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param id A descriptive or arbitrary ID for the device. 
       * This value must be unique within the device definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
       * automatically.
       */
      override fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
      }

      /**
       * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
       * automatically.
       */
      override fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param thingArn The Amazon Resource Name (ARN) of the device, which is an AWS IoT device
       * (thing). 
       */
      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty,
    ) : CdkObject(cdkObject),
        DeviceProperty {
      /**
       * The ARN of the device certificate for the device.
       *
       * This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT
       * Greengrass services.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-certificatearn)
       */
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      /**
       * A descriptive or arbitrary ID for the device.
       *
       * This value must be unique within the device definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * Indicates whether the device's local shadow is synced with the cloud automatically.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-syncshadow)
       */
      override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      /**
       * The Amazon Resource Name (ARN) of the device, which is an AWS IoT device (thing).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html#cfn-greengrass-devicedefinitionversion-device-thingarn)
       */
      override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty):
          DeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? DeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty
    }
  }
}
