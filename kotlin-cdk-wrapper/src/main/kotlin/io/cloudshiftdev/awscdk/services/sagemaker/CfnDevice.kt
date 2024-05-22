@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SageMaker::Device` resource is an Amazon SageMaker resource type that allows you to
 * register your Devices against an existing SageMaker Edge Manager DeviceFleet.
 *
 * Each device must be listed individually in the CFN specification.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnDevice cfnDevice = CfnDevice.Builder.create(this, "MyCfnDevice")
 * .deviceFleetName("deviceFleetName")
 * // the properties below are optional
 * .device(DeviceProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .description("description")
 * .iotThingName("iotThingName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html)
 */
public open class CfnDevice(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnDevice(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeviceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeviceProps(props)
  )

  /**
   * Edge device you want to create.
   */
  public open fun device(): Any? = unwrap(this).getDevice()

  /**
   * Edge device you want to create.
   */
  public open fun device(`value`: IResolvable) {
    unwrap(this).setDevice(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Edge device you want to create.
   */
  public open fun device(`value`: DeviceProperty) {
    unwrap(this).setDevice(`value`.let(DeviceProperty.Companion::unwrap))
  }

  /**
   * Edge device you want to create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5dc42cc2f36fb4751c3405dc6520f75e5415ededd8012c92c62e372483e96b8")
  public open fun device(`value`: DeviceProperty.Builder.() -> Unit): Unit =
      device(DeviceProperty(`value`))

  /**
   * The name of the fleet the device belongs to.
   */
  public open fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

  /**
   * The name of the fleet the device belongs to.
   */
  public open fun deviceFleetName(`value`: String) {
    unwrap(this).setDeviceFleetName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * devices.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * devices.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * devices.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnDevice].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Edge device you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
     * @param device Edge device you want to create. 
     */
    public fun device(device: IResolvable)

    /**
     * Edge device you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
     * @param device Edge device you want to create. 
     */
    public fun device(device: DeviceProperty)

    /**
     * Edge device you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
     * @param device Edge device you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4e7a7e3cbe04285da0f7a5e0957f8dec55dd96ae1f2aa55cb43fe225fccb36")
    public fun device(device: DeviceProperty.Builder.() -> Unit)

    /**
     * The name of the fleet the device belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-devicefleetname)
     * @param deviceFleetName The name of the fleet the device belongs to. 
     */
    public fun deviceFleetName(deviceFleetName: String)

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * devices.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * devices.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDevice.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDevice.Builder.create(scope, id)

    /**
     * Edge device you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
     * @param device Edge device you want to create. 
     */
    override fun device(device: IResolvable) {
      cdkBuilder.device(device.let(IResolvable.Companion::unwrap))
    }

    /**
     * Edge device you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
     * @param device Edge device you want to create. 
     */
    override fun device(device: DeviceProperty) {
      cdkBuilder.device(device.let(DeviceProperty.Companion::unwrap))
    }

    /**
     * Edge device you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
     * @param device Edge device you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4e7a7e3cbe04285da0f7a5e0957f8dec55dd96ae1f2aa55cb43fe225fccb36")
    override fun device(device: DeviceProperty.Builder.() -> Unit): Unit =
        device(DeviceProperty(device))

    /**
     * The name of the fleet the device belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-devicefleetname)
     * @param deviceFleetName The name of the fleet the device belongs to. 
     */
    override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * devices.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * devices.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDevice = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnDevice.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice): CfnDevice =
        CfnDevice(cdkObject)

    internal fun unwrap(wrapped: CfnDevice): software.amazon.awscdk.services.sagemaker.CfnDevice =
        wrapped.cdkObject as software.amazon.awscdk.services.sagemaker.CfnDevice
  }

  /**
   * Information of a particular device.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DeviceProperty deviceProperty = DeviceProperty.builder()
   * .deviceName("deviceName")
   * // the properties below are optional
   * .description("description")
   * .iotThingName("iotThingName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html)
   */
  public interface DeviceProperty {
    /**
     * Description of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html#cfn-sagemaker-device-device-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html#cfn-sagemaker-device-device-devicename)
     */
    public fun deviceName(): String

    /**
     * AWS Internet of Things (IoT) object name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html#cfn-sagemaker-device-device-iotthingname)
     */
    public fun iotThingName(): String? = unwrap(this).getIotThingName()

    /**
     * A builder for [DeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description Description of the device.
       */
      public fun description(description: String)

      /**
       * @param deviceName The name of the device. 
       */
      public fun deviceName(deviceName: String)

      /**
       * @param iotThingName AWS Internet of Things (IoT) object name.
       */
      public fun iotThingName(iotThingName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty.builder()

      /**
       * @param description Description of the device.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param deviceName The name of the device. 
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param iotThingName AWS Internet of Things (IoT) object name.
       */
      override fun iotThingName(iotThingName: String) {
        cdkBuilder.iotThingName(iotThingName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty,
    ) : CdkObject(cdkObject), DeviceProperty {
      /**
       * Description of the device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html#cfn-sagemaker-device-device-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name of the device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html#cfn-sagemaker-device-device-devicename)
       */
      override fun deviceName(): String = unwrap(this).getDeviceName()

      /**
       * AWS Internet of Things (IoT) object name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html#cfn-sagemaker-device-device-iotthingname)
       */
      override fun iotThingName(): String? = unwrap(this).getIotThingName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty):
          DeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? DeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty
    }
  }
}
