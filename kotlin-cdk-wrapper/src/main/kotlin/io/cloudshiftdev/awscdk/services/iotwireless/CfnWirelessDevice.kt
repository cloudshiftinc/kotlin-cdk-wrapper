@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

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
 * Provisions a wireless device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnWirelessDevice cfnWirelessDevice = CfnWirelessDevice.Builder.create(this,
 * "MyCfnWirelessDevice")
 * .destinationName("destinationName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .lastUplinkReceivedAt("lastUplinkReceivedAt")
 * .loRaWan(LoRaWANDeviceProperty.builder()
 * .abpV10X(AbpV10xProperty.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV10xProperty.builder()
 * .appSKey("appSKey")
 * .nwkSKey("nwkSKey")
 * .build())
 * .build())
 * .abpV11(AbpV11Property.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV11Property.builder()
 * .appSKey("appSKey")
 * .fNwkSIntKey("fNwkSIntKey")
 * .nwkSEncKey("nwkSEncKey")
 * .sNwkSIntKey("sNwkSIntKey")
 * .build())
 * .build())
 * .devEui("devEui")
 * .deviceProfileId("deviceProfileId")
 * .otaaV10X(OtaaV10xProperty.builder()
 * .appEui("appEui")
 * .appKey("appKey")
 * .build())
 * .otaaV11(OtaaV11Property.builder()
 * .appKey("appKey")
 * .joinEui("joinEui")
 * .nwkKey("nwkKey")
 * .build())
 * .serviceProfileId("serviceProfileId")
 * .build())
 * .name("name")
 * .positioning("positioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingArn("thingArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html)
 */
public open class CfnWirelessDevice(
  cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWirelessDeviceProps,
  ) :
      this(software.amazon.awscdk.services.iotwireless.CfnWirelessDevice(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWirelessDeviceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWirelessDeviceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWirelessDeviceProps(props)
  )

  /**
   * The ARN of the wireless device created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the wireless device created.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the thing associated with the wireless device.
   *
   * The value is empty if a thing isn't associated with the device.
   */
  public open fun attrThingName(): String = unwrap(this).getAttrThingName()

  /**
   * The description of the new resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the new resource.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the destination to assign to the new wireless device.
   */
  public open fun destinationName(): String = unwrap(this).getDestinationName()

  /**
   * The name of the destination to assign to the new wireless device.
   */
  public open fun destinationName(`value`: String) {
    unwrap(this).setDestinationName(`value`)
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
   * The date and time when the most recent uplink was received.
   */
  public open fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

  /**
   * The date and time when the most recent uplink was received.
   */
  public open fun lastUplinkReceivedAt(`value`: String) {
    unwrap(this).setLastUplinkReceivedAt(`value`)
  }

  /**
   * The device configuration information to use to create the wireless device.
   */
  public open fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  /**
   * The device configuration information to use to create the wireless device.
   */
  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The device configuration information to use to create the wireless device.
   */
  public open fun loRaWan(`value`: LoRaWANDeviceProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANDeviceProperty.Companion::unwrap))
  }

  /**
   * The device configuration information to use to create the wireless device.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9fbba6cb746fd6a471043e0ecf24050f1a731300ece4041b15da041702ead454")
  public open fun loRaWan(`value`: LoRaWANDeviceProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANDeviceProperty(`value`))

  /**
   * The name of the new resource.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the new resource.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * FPort values for the GNSS, Stream, and ClockSync functions of the positioning information.
   */
  public open fun positioning(): String? = unwrap(this).getPositioning()

  /**
   * FPort values for the GNSS, Stream, and ClockSync functions of the positioning information.
   */
  public open fun positioning(`value`: String) {
    unwrap(this).setPositioning(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the thing to associate with the wireless device.
   */
  public open fun thingArn(): String? = unwrap(this).getThingArn()

  /**
   * The ARN of the thing to associate with the wireless device.
   */
  public open fun thingArn(`value`: String) {
    unwrap(this).setThingArn(`value`)
  }

  /**
   * The wireless device type.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The wireless device type.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotwireless.CfnWirelessDevice].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the new resource.
     *
     * Maximum length is 2048.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-description)
     * @param description The description of the new resource. 
     */
    public fun description(description: String)

    /**
     * The name of the destination to assign to the new wireless device.
     *
     * Can have only have alphanumeric, - (hyphen) and _ (underscore) characters and it can't have
     * any spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-destinationname)
     * @param destinationName The name of the destination to assign to the new wireless device. 
     */
    public fun destinationName(destinationName: String)

    /**
     * The date and time when the most recent uplink was received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lastuplinkreceivedat)
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received. 
     */
    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    /**
     * The device configuration information to use to create the wireless device.
     *
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
     * @param loRaWan The device configuration information to use to create the wireless device. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * The device configuration information to use to create the wireless device.
     *
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
     * @param loRaWan The device configuration information to use to create the wireless device. 
     */
    public fun loRaWan(loRaWan: LoRaWANDeviceProperty)

    /**
     * The device configuration information to use to create the wireless device.
     *
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
     * @param loRaWan The device configuration information to use to create the wireless device. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17db95673df2b6886b960f1082d8cbdb9116647da1b05b3a57a75d0b298dc6e4")
    public fun loRaWan(loRaWan: LoRaWANDeviceProperty.Builder.() -> Unit)

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-name)
     * @param name The name of the new resource. 
     */
    public fun name(name: String)

    /**
     * FPort values for the GNSS, Stream, and ClockSync functions of the positioning information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-positioning)
     * @param positioning FPort values for the GNSS, Stream, and ClockSync functions of the
     * positioning information. 
     */
    public fun positioning(positioning: String)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the thing to associate with the wireless device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-thingarn)
     * @param thingArn The ARN of the thing to associate with the wireless device. 
     */
    public fun thingArn(thingArn: String)

    /**
     * The wireless device type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-type)
     * @param type The wireless device type. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.Builder.create(scope, id)

    /**
     * The description of the new resource.
     *
     * Maximum length is 2048.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-description)
     * @param description The description of the new resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the destination to assign to the new wireless device.
     *
     * Can have only have alphanumeric, - (hyphen) and _ (underscore) characters and it can't have
     * any spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-destinationname)
     * @param destinationName The name of the destination to assign to the new wireless device. 
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * The date and time when the most recent uplink was received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lastuplinkreceivedat)
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received. 
     */
    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    /**
     * The device configuration information to use to create the wireless device.
     *
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
     * @param loRaWan The device configuration information to use to create the wireless device. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable.Companion::unwrap))
    }

    /**
     * The device configuration information to use to create the wireless device.
     *
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
     * @param loRaWan The device configuration information to use to create the wireless device. 
     */
    override fun loRaWan(loRaWan: LoRaWANDeviceProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANDeviceProperty.Companion::unwrap))
    }

    /**
     * The device configuration information to use to create the wireless device.
     *
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
     * @param loRaWan The device configuration information to use to create the wireless device. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17db95673df2b6886b960f1082d8cbdb9116647da1b05b3a57a75d0b298dc6e4")
    override fun loRaWan(loRaWan: LoRaWANDeviceProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANDeviceProperty(loRaWan))

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-name)
     * @param name The name of the new resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * FPort values for the GNSS, Stream, and ClockSync functions of the positioning information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-positioning)
     * @param positioning FPort values for the GNSS, Stream, and ClockSync functions of the
     * positioning information. 
     */
    override fun positioning(positioning: String) {
      cdkBuilder.positioning(positioning)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the thing to associate with the wireless device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-thingarn)
     * @param thingArn The ARN of the thing to associate with the wireless device. 
     */
    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    /**
     * The wireless device type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-type)
     * @param type The wireless device type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWirelessDevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWirelessDevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice):
        CfnWirelessDevice = CfnWirelessDevice(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessDevice):
        software.amazon.awscdk.services.iotwireless.CfnWirelessDevice = wrapped.cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
  }

  /**
   * ABP device object for LoRaWAN specification v1.0.x.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * AbpV10xProperty abpV10xProperty = AbpV10xProperty.builder()
   * .devAddr("devAddr")
   * .sessionKeys(SessionKeysAbpV10xProperty.builder()
   * .appSKey("appSKey")
   * .nwkSKey("nwkSKey")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv10x.html)
   */
  public interface AbpV10xProperty {
    /**
     * The DevAddr value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv10x.html#cfn-iotwireless-wirelessdevice-abpv10x-devaddr)
     */
    public fun devAddr(): String

    /**
     * Session keys for ABP v1.0.x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv10x.html#cfn-iotwireless-wirelessdevice-abpv10x-sessionkeys)
     */
    public fun sessionKeys(): Any

    /**
     * A builder for [AbpV10xProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param devAddr The DevAddr value. 
       */
      public fun devAddr(devAddr: String)

      /**
       * @param sessionKeys Session keys for ABP v1.0.x. 
       */
      public fun sessionKeys(sessionKeys: IResolvable)

      /**
       * @param sessionKeys Session keys for ABP v1.0.x. 
       */
      public fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty)

      /**
       * @param sessionKeys Session keys for ABP v1.0.x. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb15038e40fff6bc52daf846737f0c14b826cf665300fcaa90a307c5cdef1235")
      public fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty.builder()

      /**
       * @param devAddr The DevAddr value. 
       */
      override fun devAddr(devAddr: String) {
        cdkBuilder.devAddr(devAddr)
      }

      /**
       * @param sessionKeys Session keys for ABP v1.0.x. 
       */
      override fun sessionKeys(sessionKeys: IResolvable) {
        cdkBuilder.sessionKeys(sessionKeys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sessionKeys Session keys for ABP v1.0.x. 
       */
      override fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty) {
        cdkBuilder.sessionKeys(sessionKeys.let(SessionKeysAbpV10xProperty.Companion::unwrap))
      }

      /**
       * @param sessionKeys Session keys for ABP v1.0.x. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb15038e40fff6bc52daf846737f0c14b826cf665300fcaa90a307c5cdef1235")
      override fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty.Builder.() -> Unit): Unit =
          sessionKeys(SessionKeysAbpV10xProperty(sessionKeys))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty,
    ) : CdkObject(cdkObject), AbpV10xProperty {
      /**
       * The DevAddr value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv10x.html#cfn-iotwireless-wirelessdevice-abpv10x-devaddr)
       */
      override fun devAddr(): String = unwrap(this).getDevAddr()

      /**
       * Session keys for ABP v1.0.x.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv10x.html#cfn-iotwireless-wirelessdevice-abpv10x-sessionkeys)
       */
      override fun sessionKeys(): Any = unwrap(this).getSessionKeys()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AbpV10xProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty):
          AbpV10xProperty = CdkObjectWrappers.wrap(cdkObject) as? AbpV10xProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbpV10xProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty
    }
  }

  /**
   * ABP device object for create APIs for v1.1.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * AbpV11Property abpV11Property = AbpV11Property.builder()
   * .devAddr("devAddr")
   * .sessionKeys(SessionKeysAbpV11Property.builder()
   * .appSKey("appSKey")
   * .fNwkSIntKey("fNwkSIntKey")
   * .nwkSEncKey("nwkSEncKey")
   * .sNwkSIntKey("sNwkSIntKey")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv11.html)
   */
  public interface AbpV11Property {
    /**
     * The DevAddr value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv11.html#cfn-iotwireless-wirelessdevice-abpv11-devaddr)
     */
    public fun devAddr(): String

    /**
     * Session keys for ABP v1.1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv11.html#cfn-iotwireless-wirelessdevice-abpv11-sessionkeys)
     */
    public fun sessionKeys(): Any

    /**
     * A builder for [AbpV11Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param devAddr The DevAddr value. 
       */
      public fun devAddr(devAddr: String)

      /**
       * @param sessionKeys Session keys for ABP v1.1. 
       */
      public fun sessionKeys(sessionKeys: IResolvable)

      /**
       * @param sessionKeys Session keys for ABP v1.1. 
       */
      public fun sessionKeys(sessionKeys: SessionKeysAbpV11Property)

      /**
       * @param sessionKeys Session keys for ABP v1.1. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a4ab19815afb52a5115c2c1c22281e7dc245874a390b9057281b5f2477d776")
      public fun sessionKeys(sessionKeys: SessionKeysAbpV11Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property.builder()

      /**
       * @param devAddr The DevAddr value. 
       */
      override fun devAddr(devAddr: String) {
        cdkBuilder.devAddr(devAddr)
      }

      /**
       * @param sessionKeys Session keys for ABP v1.1. 
       */
      override fun sessionKeys(sessionKeys: IResolvable) {
        cdkBuilder.sessionKeys(sessionKeys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sessionKeys Session keys for ABP v1.1. 
       */
      override fun sessionKeys(sessionKeys: SessionKeysAbpV11Property) {
        cdkBuilder.sessionKeys(sessionKeys.let(SessionKeysAbpV11Property.Companion::unwrap))
      }

      /**
       * @param sessionKeys Session keys for ABP v1.1. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a4ab19815afb52a5115c2c1c22281e7dc245874a390b9057281b5f2477d776")
      override fun sessionKeys(sessionKeys: SessionKeysAbpV11Property.Builder.() -> Unit): Unit =
          sessionKeys(SessionKeysAbpV11Property(sessionKeys))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property,
    ) : CdkObject(cdkObject), AbpV11Property {
      /**
       * The DevAddr value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv11.html#cfn-iotwireless-wirelessdevice-abpv11-devaddr)
       */
      override fun devAddr(): String = unwrap(this).getDevAddr()

      /**
       * Session keys for ABP v1.1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv11.html#cfn-iotwireless-wirelessdevice-abpv11-sessionkeys)
       */
      override fun sessionKeys(): Any = unwrap(this).getSessionKeys()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AbpV11Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property):
          AbpV11Property = CdkObjectWrappers.wrap(cdkObject) as? AbpV11Property ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbpV11Property):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property
    }
  }

  /**
   * LoRaWAN object for create functions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * LoRaWANDeviceProperty loRaWANDeviceProperty = LoRaWANDeviceProperty.builder()
   * .abpV10X(AbpV10xProperty.builder()
   * .devAddr("devAddr")
   * .sessionKeys(SessionKeysAbpV10xProperty.builder()
   * .appSKey("appSKey")
   * .nwkSKey("nwkSKey")
   * .build())
   * .build())
   * .abpV11(AbpV11Property.builder()
   * .devAddr("devAddr")
   * .sessionKeys(SessionKeysAbpV11Property.builder()
   * .appSKey("appSKey")
   * .fNwkSIntKey("fNwkSIntKey")
   * .nwkSEncKey("nwkSEncKey")
   * .sNwkSIntKey("sNwkSIntKey")
   * .build())
   * .build())
   * .devEui("devEui")
   * .deviceProfileId("deviceProfileId")
   * .otaaV10X(OtaaV10xProperty.builder()
   * .appEui("appEui")
   * .appKey("appKey")
   * .build())
   * .otaaV11(OtaaV11Property.builder()
   * .appKey("appKey")
   * .joinEui("joinEui")
   * .nwkKey("nwkKey")
   * .build())
   * .serviceProfileId("serviceProfileId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html)
   */
  public interface LoRaWANDeviceProperty {
    /**
     * ABP device object for LoRaWAN specification v1.0.x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-abpv10x)
     */
    public fun abpV10X(): Any? = unwrap(this).getAbpV10X()

    /**
     * ABP device object for create APIs for v1.1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-abpv11)
     */
    public fun abpV11(): Any? = unwrap(this).getAbpV11()

    /**
     * The DevEUI value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-deveui)
     */
    public fun devEui(): String? = unwrap(this).getDevEui()

    /**
     * The ID of the device profile for the new wireless device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-deviceprofileid)
     */
    public fun deviceProfileId(): String? = unwrap(this).getDeviceProfileId()

    /**
     * OTAA device object for create APIs for v1.0.x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-otaav10x)
     */
    public fun otaaV10X(): Any? = unwrap(this).getOtaaV10X()

    /**
     * OTAA device object for v1.1 for create APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-otaav11)
     */
    public fun otaaV11(): Any? = unwrap(this).getOtaaV11()

    /**
     * The ID of the service profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-serviceprofileid)
     */
    public fun serviceProfileId(): String? = unwrap(this).getServiceProfileId()

    /**
     * A builder for [LoRaWANDeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param abpV10X ABP device object for LoRaWAN specification v1.0.x.
       */
      public fun abpV10X(abpV10X: IResolvable)

      /**
       * @param abpV10X ABP device object for LoRaWAN specification v1.0.x.
       */
      public fun abpV10X(abpV10X: AbpV10xProperty)

      /**
       * @param abpV10X ABP device object for LoRaWAN specification v1.0.x.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31d1329837a555378d17b475b6f0606f5d664a3ef01d19be5802e27f31e13397")
      public fun abpV10X(abpV10X: AbpV10xProperty.Builder.() -> Unit)

      /**
       * @param abpV11 ABP device object for create APIs for v1.1.
       */
      public fun abpV11(abpV11: IResolvable)

      /**
       * @param abpV11 ABP device object for create APIs for v1.1.
       */
      public fun abpV11(abpV11: AbpV11Property)

      /**
       * @param abpV11 ABP device object for create APIs for v1.1.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6536c67eef3767a4ae92e3a1014e34742a2aa29f52f0b6055fe5fcc30ac41b40")
      public fun abpV11(abpV11: AbpV11Property.Builder.() -> Unit)

      /**
       * @param devEui The DevEUI value.
       */
      public fun devEui(devEui: String)

      /**
       * @param deviceProfileId The ID of the device profile for the new wireless device.
       */
      public fun deviceProfileId(deviceProfileId: String)

      /**
       * @param otaaV10X OTAA device object for create APIs for v1.0.x.
       */
      public fun otaaV10X(otaaV10X: IResolvable)

      /**
       * @param otaaV10X OTAA device object for create APIs for v1.0.x.
       */
      public fun otaaV10X(otaaV10X: OtaaV10xProperty)

      /**
       * @param otaaV10X OTAA device object for create APIs for v1.0.x.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d835de486fdf1d3d0d58e6b6132d02e3068d8b032a7d23364924d046784030d")
      public fun otaaV10X(otaaV10X: OtaaV10xProperty.Builder.() -> Unit)

      /**
       * @param otaaV11 OTAA device object for v1.1 for create APIs.
       */
      public fun otaaV11(otaaV11: IResolvable)

      /**
       * @param otaaV11 OTAA device object for v1.1 for create APIs.
       */
      public fun otaaV11(otaaV11: OtaaV11Property)

      /**
       * @param otaaV11 OTAA device object for v1.1 for create APIs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50001fd6c81be7952f9e3e7f379b431600dce85809310301bde2e1cf32cf63a3")
      public fun otaaV11(otaaV11: OtaaV11Property.Builder.() -> Unit)

      /**
       * @param serviceProfileId The ID of the service profile.
       */
      public fun serviceProfileId(serviceProfileId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty.builder()

      /**
       * @param abpV10X ABP device object for LoRaWAN specification v1.0.x.
       */
      override fun abpV10X(abpV10X: IResolvable) {
        cdkBuilder.abpV10X(abpV10X.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param abpV10X ABP device object for LoRaWAN specification v1.0.x.
       */
      override fun abpV10X(abpV10X: AbpV10xProperty) {
        cdkBuilder.abpV10X(abpV10X.let(AbpV10xProperty.Companion::unwrap))
      }

      /**
       * @param abpV10X ABP device object for LoRaWAN specification v1.0.x.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31d1329837a555378d17b475b6f0606f5d664a3ef01d19be5802e27f31e13397")
      override fun abpV10X(abpV10X: AbpV10xProperty.Builder.() -> Unit): Unit =
          abpV10X(AbpV10xProperty(abpV10X))

      /**
       * @param abpV11 ABP device object for create APIs for v1.1.
       */
      override fun abpV11(abpV11: IResolvable) {
        cdkBuilder.abpV11(abpV11.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param abpV11 ABP device object for create APIs for v1.1.
       */
      override fun abpV11(abpV11: AbpV11Property) {
        cdkBuilder.abpV11(abpV11.let(AbpV11Property.Companion::unwrap))
      }

      /**
       * @param abpV11 ABP device object for create APIs for v1.1.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6536c67eef3767a4ae92e3a1014e34742a2aa29f52f0b6055fe5fcc30ac41b40")
      override fun abpV11(abpV11: AbpV11Property.Builder.() -> Unit): Unit =
          abpV11(AbpV11Property(abpV11))

      /**
       * @param devEui The DevEUI value.
       */
      override fun devEui(devEui: String) {
        cdkBuilder.devEui(devEui)
      }

      /**
       * @param deviceProfileId The ID of the device profile for the new wireless device.
       */
      override fun deviceProfileId(deviceProfileId: String) {
        cdkBuilder.deviceProfileId(deviceProfileId)
      }

      /**
       * @param otaaV10X OTAA device object for create APIs for v1.0.x.
       */
      override fun otaaV10X(otaaV10X: IResolvable) {
        cdkBuilder.otaaV10X(otaaV10X.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param otaaV10X OTAA device object for create APIs for v1.0.x.
       */
      override fun otaaV10X(otaaV10X: OtaaV10xProperty) {
        cdkBuilder.otaaV10X(otaaV10X.let(OtaaV10xProperty.Companion::unwrap))
      }

      /**
       * @param otaaV10X OTAA device object for create APIs for v1.0.x.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d835de486fdf1d3d0d58e6b6132d02e3068d8b032a7d23364924d046784030d")
      override fun otaaV10X(otaaV10X: OtaaV10xProperty.Builder.() -> Unit): Unit =
          otaaV10X(OtaaV10xProperty(otaaV10X))

      /**
       * @param otaaV11 OTAA device object for v1.1 for create APIs.
       */
      override fun otaaV11(otaaV11: IResolvable) {
        cdkBuilder.otaaV11(otaaV11.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param otaaV11 OTAA device object for v1.1 for create APIs.
       */
      override fun otaaV11(otaaV11: OtaaV11Property) {
        cdkBuilder.otaaV11(otaaV11.let(OtaaV11Property.Companion::unwrap))
      }

      /**
       * @param otaaV11 OTAA device object for v1.1 for create APIs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50001fd6c81be7952f9e3e7f379b431600dce85809310301bde2e1cf32cf63a3")
      override fun otaaV11(otaaV11: OtaaV11Property.Builder.() -> Unit): Unit =
          otaaV11(OtaaV11Property(otaaV11))

      /**
       * @param serviceProfileId The ID of the service profile.
       */
      override fun serviceProfileId(serviceProfileId: String) {
        cdkBuilder.serviceProfileId(serviceProfileId)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty,
    ) : CdkObject(cdkObject), LoRaWANDeviceProperty {
      /**
       * ABP device object for LoRaWAN specification v1.0.x.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-abpv10x)
       */
      override fun abpV10X(): Any? = unwrap(this).getAbpV10X()

      /**
       * ABP device object for create APIs for v1.1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-abpv11)
       */
      override fun abpV11(): Any? = unwrap(this).getAbpV11()

      /**
       * The DevEUI value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-deveui)
       */
      override fun devEui(): String? = unwrap(this).getDevEui()

      /**
       * The ID of the device profile for the new wireless device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-deviceprofileid)
       */
      override fun deviceProfileId(): String? = unwrap(this).getDeviceProfileId()

      /**
       * OTAA device object for create APIs for v1.0.x.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-otaav10x)
       */
      override fun otaaV10X(): Any? = unwrap(this).getOtaaV10X()

      /**
       * OTAA device object for v1.1 for create APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-otaav11)
       */
      override fun otaaV11(): Any? = unwrap(this).getOtaaV11()

      /**
       * The ID of the service profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html#cfn-iotwireless-wirelessdevice-lorawandevice-serviceprofileid)
       */
      override fun serviceProfileId(): String? = unwrap(this).getServiceProfileId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty):
          LoRaWANDeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? LoRaWANDeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANDeviceProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * OtaaV10xProperty otaaV10xProperty = OtaaV10xProperty.builder()
   * .appEui("appEui")
   * .appKey("appKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html)
   */
  public interface OtaaV10xProperty {
    /**
     * The AppEUI value.
     *
     * You specify this value when using LoRaWAN versions v1.0.2 or v1.0.3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html#cfn-iotwireless-wirelessdevice-otaav10x-appeui)
     */
    public fun appEui(): String

    /**
     * The AppKey value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html#cfn-iotwireless-wirelessdevice-otaav10x-appkey)
     */
    public fun appKey(): String

    /**
     * A builder for [OtaaV10xProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appEui The AppEUI value. 
       * You specify this value when using LoRaWAN versions v1.0.2 or v1.0.3.
       */
      public fun appEui(appEui: String)

      /**
       * @param appKey The AppKey value. 
       */
      public fun appKey(appKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty.builder()

      /**
       * @param appEui The AppEUI value. 
       * You specify this value when using LoRaWAN versions v1.0.2 or v1.0.3.
       */
      override fun appEui(appEui: String) {
        cdkBuilder.appEui(appEui)
      }

      /**
       * @param appKey The AppKey value. 
       */
      override fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty,
    ) : CdkObject(cdkObject), OtaaV10xProperty {
      /**
       * The AppEUI value.
       *
       * You specify this value when using LoRaWAN versions v1.0.2 or v1.0.3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html#cfn-iotwireless-wirelessdevice-otaav10x-appeui)
       */
      override fun appEui(): String = unwrap(this).getAppEui()

      /**
       * The AppKey value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html#cfn-iotwireless-wirelessdevice-otaav10x-appkey)
       */
      override fun appKey(): String = unwrap(this).getAppKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OtaaV10xProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty):
          OtaaV10xProperty = CdkObjectWrappers.wrap(cdkObject) as? OtaaV10xProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtaaV10xProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty
    }
  }

  /**
   * OTAA device object for v1.1 for create APIs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * OtaaV11Property otaaV11Property = OtaaV11Property.builder()
   * .appKey("appKey")
   * .joinEui("joinEui")
   * .nwkKey("nwkKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html)
   */
  public interface OtaaV11Property {
    /**
     * The AppKey is a secret key, which you should handle in a similar way as you would an
     * application password.
     *
     * You can protect the AppKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html#cfn-iotwireless-wirelessdevice-otaav11-appkey)
     */
    public fun appKey(): String

    /**
     * The JoinEUI value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html#cfn-iotwireless-wirelessdevice-otaav11-joineui)
     */
    public fun joinEui(): String

    /**
     * The NwkKey is a secret key, which you should handle in a similar way as you would an
     * application password.
     *
     * You can protect the NwkKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html#cfn-iotwireless-wirelessdevice-otaav11-nwkkey)
     */
    public fun nwkKey(): String

    /**
     * A builder for [OtaaV11Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appKey The AppKey is a secret key, which you should handle in a similar way as you
       * would an application password. 
       * You can protect the AppKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      public fun appKey(appKey: String)

      /**
       * @param joinEui The JoinEUI value. 
       */
      public fun joinEui(joinEui: String)

      /**
       * @param nwkKey The NwkKey is a secret key, which you should handle in a similar way as you
       * would an application password. 
       * You can protect the NwkKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      public fun nwkKey(nwkKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property.builder()

      /**
       * @param appKey The AppKey is a secret key, which you should handle in a similar way as you
       * would an application password. 
       * You can protect the AppKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      override fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
      }

      /**
       * @param joinEui The JoinEUI value. 
       */
      override fun joinEui(joinEui: String) {
        cdkBuilder.joinEui(joinEui)
      }

      /**
       * @param nwkKey The NwkKey is a secret key, which you should handle in a similar way as you
       * would an application password. 
       * You can protect the NwkKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      override fun nwkKey(nwkKey: String) {
        cdkBuilder.nwkKey(nwkKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property,
    ) : CdkObject(cdkObject), OtaaV11Property {
      /**
       * The AppKey is a secret key, which you should handle in a similar way as you would an
       * application password.
       *
       * You can protect the AppKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html#cfn-iotwireless-wirelessdevice-otaav11-appkey)
       */
      override fun appKey(): String = unwrap(this).getAppKey()

      /**
       * The JoinEUI value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html#cfn-iotwireless-wirelessdevice-otaav11-joineui)
       */
      override fun joinEui(): String = unwrap(this).getJoinEui()

      /**
       * The NwkKey is a secret key, which you should handle in a similar way as you would an
       * application password.
       *
       * You can protect the NwkKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html#cfn-iotwireless-wirelessdevice-otaav11-nwkkey)
       */
      override fun nwkKey(): String = unwrap(this).getNwkKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OtaaV11Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property):
          OtaaV11Property = CdkObjectWrappers.wrap(cdkObject) as? OtaaV11Property ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtaaV11Property):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property
    }
  }

  /**
   * Session keys for ABP v1.0.x.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * SessionKeysAbpV10xProperty sessionKeysAbpV10xProperty = SessionKeysAbpV10xProperty.builder()
   * .appSKey("appSKey")
   * .nwkSKey("nwkSKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv10x.html)
   */
  public interface SessionKeysAbpV10xProperty {
    /**
     * The AppSKey value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv10x.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv10x-appskey)
     */
    public fun appSKey(): String

    /**
     * The NwkKey value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv10x.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv10x-nwkskey)
     */
    public fun nwkSKey(): String

    /**
     * A builder for [SessionKeysAbpV10xProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appSKey The AppSKey value. 
       */
      public fun appSKey(appSKey: String)

      /**
       * @param nwkSKey The NwkKey value. 
       */
      public fun nwkSKey(nwkSKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty.builder()

      /**
       * @param appSKey The AppSKey value. 
       */
      override fun appSKey(appSKey: String) {
        cdkBuilder.appSKey(appSKey)
      }

      /**
       * @param nwkSKey The NwkKey value. 
       */
      override fun nwkSKey(nwkSKey: String) {
        cdkBuilder.nwkSKey(nwkSKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty,
    ) : CdkObject(cdkObject), SessionKeysAbpV10xProperty {
      /**
       * The AppSKey value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv10x.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv10x-appskey)
       */
      override fun appSKey(): String = unwrap(this).getAppSKey()

      /**
       * The NwkKey value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv10x.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv10x-nwkskey)
       */
      override fun nwkSKey(): String = unwrap(this).getNwkSKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SessionKeysAbpV10xProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty):
          SessionKeysAbpV10xProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SessionKeysAbpV10xProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionKeysAbpV10xProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty
    }
  }

  /**
   * Session keys for ABP v1.1.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * SessionKeysAbpV11Property sessionKeysAbpV11Property = SessionKeysAbpV11Property.builder()
   * .appSKey("appSKey")
   * .fNwkSIntKey("fNwkSIntKey")
   * .nwkSEncKey("nwkSEncKey")
   * .sNwkSIntKey("sNwkSIntKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html)
   */
  public interface SessionKeysAbpV11Property {
    /**
     * The AppSKey is a secret key, which you should handle in a similar way as you would an
     * application password.
     *
     * You can protect the AppSKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-appskey)
     */
    public fun appSKey(): String

    /**
     * The FNwkSIntKey is a secret key, which you should handle in a similar way as you would an
     * application password.
     *
     * You can protect the FNwkSIntKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-fnwksintkey)
     */
    public fun fNwkSIntKey(): String

    /**
     * The NwkSEncKey is a secret key, which you should handle in a similar way as you would an
     * application password.
     *
     * You can protect the NwkSEncKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-nwksenckey)
     */
    public fun nwkSEncKey(): String

    /**
     * The SNwkSIntKey is a secret key, which you should handle in a similar way as you would an
     * application password.
     *
     * You can protect the SNwkSIntKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-snwksintkey)
     */
    public fun sNwkSIntKey(): String

    /**
     * A builder for [SessionKeysAbpV11Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appSKey The AppSKey is a secret key, which you should handle in a similar way as you
       * would an application password. 
       * You can protect the AppSKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      public fun appSKey(appSKey: String)

      /**
       * @param fNwkSIntKey The FNwkSIntKey is a secret key, which you should handle in a similar
       * way as you would an application password. 
       * You can protect the FNwkSIntKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      public fun fNwkSIntKey(fNwkSIntKey: String)

      /**
       * @param nwkSEncKey The NwkSEncKey is a secret key, which you should handle in a similar way
       * as you would an application password. 
       * You can protect the NwkSEncKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      public fun nwkSEncKey(nwkSEncKey: String)

      /**
       * @param sNwkSIntKey The SNwkSIntKey is a secret key, which you should handle in a similar
       * way as you would an application password. 
       * You can protect the SNwkSIntKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      public fun sNwkSIntKey(sNwkSIntKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property.builder()

      /**
       * @param appSKey The AppSKey is a secret key, which you should handle in a similar way as you
       * would an application password. 
       * You can protect the AppSKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      override fun appSKey(appSKey: String) {
        cdkBuilder.appSKey(appSKey)
      }

      /**
       * @param fNwkSIntKey The FNwkSIntKey is a secret key, which you should handle in a similar
       * way as you would an application password. 
       * You can protect the FNwkSIntKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      override fun fNwkSIntKey(fNwkSIntKey: String) {
        cdkBuilder.fNwkSIntKey(fNwkSIntKey)
      }

      /**
       * @param nwkSEncKey The NwkSEncKey is a secret key, which you should handle in a similar way
       * as you would an application password. 
       * You can protect the NwkSEncKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      override fun nwkSEncKey(nwkSEncKey: String) {
        cdkBuilder.nwkSEncKey(nwkSEncKey)
      }

      /**
       * @param sNwkSIntKey The SNwkSIntKey is a secret key, which you should handle in a similar
       * way as you would an application password. 
       * You can protect the SNwkSIntKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      override fun sNwkSIntKey(sNwkSIntKey: String) {
        cdkBuilder.sNwkSIntKey(sNwkSIntKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property,
    ) : CdkObject(cdkObject), SessionKeysAbpV11Property {
      /**
       * The AppSKey is a secret key, which you should handle in a similar way as you would an
       * application password.
       *
       * You can protect the AppSKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-appskey)
       */
      override fun appSKey(): String = unwrap(this).getAppSKey()

      /**
       * The FNwkSIntKey is a secret key, which you should handle in a similar way as you would an
       * application password.
       *
       * You can protect the FNwkSIntKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-fnwksintkey)
       */
      override fun fNwkSIntKey(): String = unwrap(this).getFNwkSIntKey()

      /**
       * The NwkSEncKey is a secret key, which you should handle in a similar way as you would an
       * application password.
       *
       * You can protect the NwkSEncKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-nwksenckey)
       */
      override fun nwkSEncKey(): String = unwrap(this).getNwkSEncKey()

      /**
       * The SNwkSIntKey is a secret key, which you should handle in a similar way as you would an
       * application password.
       *
       * You can protect the SNwkSIntKey value by storing it in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html#cfn-iotwireless-wirelessdevice-sessionkeysabpv11-snwksintkey)
       */
      override fun sNwkSIntKey(): String = unwrap(this).getSNwkSIntKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SessionKeysAbpV11Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property):
          SessionKeysAbpV11Property = CdkObjectWrappers.wrap(cdkObject) as?
          SessionKeysAbpV11Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionKeysAbpV11Property):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property
    }
  }
}
