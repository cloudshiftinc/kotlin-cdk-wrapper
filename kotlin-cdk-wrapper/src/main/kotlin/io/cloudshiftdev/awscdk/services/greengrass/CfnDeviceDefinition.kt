@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::DeviceDefinition` resource represents a device definition for AWS IoT
 * Greengrass .
 *
 * Device definitions are used to organize your device definition versions.
 *
 * Device definitions can reference multiple device definition versions. All device definition
 * versions must be associated with a device definition. Each device definition version can contain one
 * or more devices.
 *
 *
 * When you create a device definition, you can optionally include an initial device definition
 * version. To associate a device definition version later, create an
 * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
 * resource and specify the ID of this device definition.
 *
 * After you create the device definition version that contains the devices you want to deploy, you
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
 * Object tags;
 * CfnDeviceDefinition cfnDeviceDefinition = CfnDeviceDefinition.Builder.create(this,
 * "MyCfnDeviceDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(DeviceDefinitionVersionProperty.builder()
 * .devices(List.of(DeviceProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
 */
public open class CfnDeviceDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the `DeviceDefinition` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/devices/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `DeviceDefinition` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `DeviceDefinitionVersion` that was added to the `DeviceDefinition` , such
   * as `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/devices/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the device definition.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The device definition version to include when the device definition is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The device definition version to include when the device definition is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The device definition version to include when the device definition is created.
   */
  public open fun initialVersion(`value`: DeviceDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(DeviceDefinitionVersionProperty::unwrap))
  }

  /**
   * The device definition version to include when the device definition is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63540674c1e81229a8719e6fe32e737669c6c01d44c8641a314f6ed7c41cf20f")
  public open fun initialVersion(`value`: DeviceDefinitionVersionProperty.Builder.() -> Unit): Unit
      = initialVersion(DeviceDefinitionVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the device definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the device definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the device definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the device definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnDeviceDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The device definition version to include when the device definition is created.
     *
     * A device definition version contains a list of
     * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     * property types.
     *
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
     * @param initialVersion The device definition version to include when the device definition is
     * created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * The device definition version to include when the device definition is created.
     *
     * A device definition version contains a list of
     * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     * property types.
     *
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
     * @param initialVersion The device definition version to include when the device definition is
     * created. 
     */
    public fun initialVersion(initialVersion: DeviceDefinitionVersionProperty)

    /**
     * The device definition version to include when the device definition is created.
     *
     * A device definition version contains a list of
     * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     * property types.
     *
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
     * @param initialVersion The device definition version to include when the device definition is
     * created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a9c6093ebdd2b7b760d2e78030469c7097e411ac682b04db29bd9cf45d91e8")
    public fun initialVersion(initialVersion: DeviceDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * The name of the device definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-name)
     * @param name The name of the device definition. 
     */
    public fun name(name: String)

    /**
     * Application-specific metadata to attach to the device definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-tags)
     * @param tags Application-specific metadata to attach to the device definition. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.Builder.create(scope, id)

    /**
     * The device definition version to include when the device definition is created.
     *
     * A device definition version contains a list of
     * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     * property types.
     *
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
     * @param initialVersion The device definition version to include when the device definition is
     * created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * The device definition version to include when the device definition is created.
     *
     * A device definition version contains a list of
     * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     * property types.
     *
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
     * @param initialVersion The device definition version to include when the device definition is
     * created. 
     */
    override fun initialVersion(initialVersion: DeviceDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(DeviceDefinitionVersionProperty::unwrap))
    }

    /**
     * The device definition version to include when the device definition is created.
     *
     * A device definition version contains a list of
     * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     * property types.
     *
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
     * @param initialVersion The device definition version to include when the device definition is
     * created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a9c6093ebdd2b7b760d2e78030469c7097e411ac682b04db29bd9cf45d91e8")
    override fun initialVersion(initialVersion: DeviceDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(DeviceDefinitionVersionProperty(initialVersion))

    /**
     * The name of the device definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-name)
     * @param name The name of the device definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the device definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-tags)
     * @param tags Application-specific metadata to attach to the device definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnDeviceDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition):
        CfnDeviceDefinition = CfnDeviceDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceDefinition):
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinition = wrapped.cdkObject
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
   * [`DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html)
   * property type contains a list of `Device` property types.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
   */
  public interface DeviceProperty {
    /**
     * The Amazon Resource Name (ARN) of the device certificate for the device.
     *
     * This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT Greengrass
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-certificatearn)
     */
    public fun certificateArn(): String

    /**
     * A descriptive or arbitrary ID for the device.
     *
     * This value must be unique within the device definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-id)
     */
    public fun id(): String

    /**
     * Indicates whether the device's local shadow is synced with the cloud automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-syncshadow)
     */
    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    /**
     * The ARN of the device, which is an AWS IoT device (thing).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-thingarn)
     */
    public fun thingArn(): String

    /**
     * A builder for [DeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The Amazon Resource Name (ARN) of the device certificate for the
       * device. 
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
       * @param thingArn The ARN of the device, which is an AWS IoT device (thing). 
       */
      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty.builder()

      /**
       * @param certificateArn The Amazon Resource Name (ARN) of the device certificate for the
       * device. 
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
        cdkBuilder.syncShadow(syncShadow.let(IResolvable::unwrap))
      }

      /**
       * @param thingArn The ARN of the device, which is an AWS IoT device (thing). 
       */
      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty,
    ) : CdkObject(cdkObject), DeviceProperty {
      /**
       * The Amazon Resource Name (ARN) of the device certificate for the device.
       *
       * This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT
       * Greengrass services.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-certificatearn)
       */
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      /**
       * A descriptive or arbitrary ID for the device.
       *
       * This value must be unique within the device definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * Indicates whether the device's local shadow is synced with the cloud automatically.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-syncshadow)
       */
      override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      /**
       * The ARN of the device, which is an AWS IoT device (thing).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html#cfn-greengrass-devicedefinition-device-thingarn)
       */
      override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty):
          DeviceProperty = CdkObjectWrappers.wrap(cdkObject) as DeviceProperty

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty
    }
  }

  /**
   * A device definition version contains a list of
   * [devices](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
   * .
   *
   *
   * After you create a device definition version that contains the devices you want to deploy, you
   * must add it to your group version. For more information, see
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * .
   *
   *
   * In an AWS CloudFormation template, `DeviceDefinitionVersion` is the property type of the
   * `InitialVersion` property in the
   * [`AWS::Greengrass::DeviceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * DeviceDefinitionVersionProperty deviceDefinitionVersionProperty =
   * DeviceDefinitionVersionProperty.builder()
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html)
   */
  public interface DeviceDefinitionVersionProperty {
    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices)
     */
    public fun devices(): Any

    /**
     * A builder for [DeviceDefinitionVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
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
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty,
    ) : CdkObject(cdkObject), DeviceDefinitionVersionProperty {
      /**
       * The devices in this version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices)
       */
      override fun devices(): Any = unwrap(this).getDevices()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty):
          DeviceDefinitionVersionProperty = CdkObjectWrappers.wrap(cdkObject) as
          DeviceDefinitionVersionProperty

      internal fun unwrap(wrapped: DeviceDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty
    }
  }
}
