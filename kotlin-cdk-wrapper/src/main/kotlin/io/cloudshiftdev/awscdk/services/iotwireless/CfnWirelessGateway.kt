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
 * Provisions a wireless gateway.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnWirelessGateway cfnWirelessGateway = CfnWirelessGateway.Builder.create(this,
 * "MyCfnWirelessGateway")
 * .loRaWan(LoRaWANGatewayProperty.builder()
 * .gatewayEui("gatewayEui")
 * .rfRegion("rfRegion")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .lastUplinkReceivedAt("lastUplinkReceivedAt")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingArn("thingArn")
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html)
 */
public open class CfnWirelessGateway(
  cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWirelessGatewayProps,
  ) :
      this(software.amazon.awscdk.services.iotwireless.CfnWirelessGateway(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWirelessGatewayProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWirelessGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWirelessGatewayProps(props)
  )

  /**
   * The ARN of the wireless gateway created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the wireless gateway created.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

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
   * The gateway configuration information to use to create the wireless gateway.
   */
  public open fun loRaWan(): Any = unwrap(this).getLoRaWan()

  /**
   * The gateway configuration information to use to create the wireless gateway.
   */
  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The gateway configuration information to use to create the wireless gateway.
   */
  public open fun loRaWan(`value`: LoRaWANGatewayProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANGatewayProperty.Companion::unwrap))
  }

  /**
   * The gateway configuration information to use to create the wireless gateway.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ab405ea2d76532ea6e626d227a65e8d69f7d1ca44b2e5b64ee66c0946c9ad")
  public open fun loRaWan(`value`: LoRaWANGatewayProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANGatewayProperty(`value`))

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
   * The ARN of the thing to associate with the wireless gateway.
   */
  public open fun thingArn(): String? = unwrap(this).getThingArn()

  /**
   * The ARN of the thing to associate with the wireless gateway.
   */
  public open fun thingArn(`value`: String) {
    unwrap(this).setThingArn(`value`)
  }

  /**
   * The name of the thing associated with the wireless gateway.
   */
  public open fun thingName(): String? = unwrap(this).getThingName()

  /**
   * The name of the thing associated with the wireless gateway.
   */
  public open fun thingName(`value`: String) {
    unwrap(this).setThingName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotwireless.CfnWirelessGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the new resource.
     *
     * The maximum length is 2048 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-description)
     * @param description The description of the new resource. 
     */
    public fun description(description: String)

    /**
     * The date and time when the most recent uplink was received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lastuplinkreceivedat)
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received. 
     */
    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    /**
     * The gateway configuration information to use to create the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * The gateway configuration information to use to create the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    public fun loRaWan(loRaWan: LoRaWANGatewayProperty)

    /**
     * The gateway configuration information to use to create the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2edb31ea263b4d6a7606bcf64e145d28b52083400d9b3be894280b6d67deae33")
    public fun loRaWan(loRaWan: LoRaWANGatewayProperty.Builder.() -> Unit)

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-name)
     * @param name The name of the new resource. 
     */
    public fun name(name: String)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the thing to associate with the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingarn)
     * @param thingArn The ARN of the thing to associate with the wireless gateway. 
     */
    public fun thingArn(thingArn: String)

    /**
     * The name of the thing associated with the wireless gateway.
     *
     * The value is empty if a thing isn't associated with the gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingname)
     * @param thingName The name of the thing associated with the wireless gateway. 
     */
    public fun thingName(thingName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.Builder.create(scope, id)

    /**
     * The description of the new resource.
     *
     * The maximum length is 2048 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-description)
     * @param description The description of the new resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The date and time when the most recent uplink was received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lastuplinkreceivedat)
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received. 
     */
    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    /**
     * The gateway configuration information to use to create the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable.Companion::unwrap))
    }

    /**
     * The gateway configuration information to use to create the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    override fun loRaWan(loRaWan: LoRaWANGatewayProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANGatewayProperty.Companion::unwrap))
    }

    /**
     * The gateway configuration information to use to create the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2edb31ea263b4d6a7606bcf64e145d28b52083400d9b3be894280b6d67deae33")
    override fun loRaWan(loRaWan: LoRaWANGatewayProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANGatewayProperty(loRaWan))

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-name)
     * @param name The name of the new resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the thing to associate with the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingarn)
     * @param thingArn The ARN of the thing to associate with the wireless gateway. 
     */
    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    /**
     * The name of the thing associated with the wireless gateway.
     *
     * The value is empty if a thing isn't associated with the gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingname)
     * @param thingName The name of the thing associated with the wireless gateway. 
     */
    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessGateway =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWirelessGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWirelessGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway):
        CfnWirelessGateway = CfnWirelessGateway(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessGateway):
        software.amazon.awscdk.services.iotwireless.CfnWirelessGateway = wrapped.cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
  }

  /**
   * LoRaWAN wireless gateway object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * LoRaWANGatewayProperty loRaWANGatewayProperty = LoRaWANGatewayProperty.builder()
   * .gatewayEui("gatewayEui")
   * .rfRegion("rfRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessgateway-lorawangateway.html)
   */
  public interface LoRaWANGatewayProperty {
    /**
     * The gateway's EUI value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessgateway-lorawangateway.html#cfn-iotwireless-wirelessgateway-lorawangateway-gatewayeui)
     */
    public fun gatewayEui(): String

    /**
     * The frequency band (RFRegion) value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessgateway-lorawangateway.html#cfn-iotwireless-wirelessgateway-lorawangateway-rfregion)
     */
    public fun rfRegion(): String

    /**
     * A builder for [LoRaWANGatewayProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gatewayEui The gateway's EUI value. 
       */
      public fun gatewayEui(gatewayEui: String)

      /**
       * @param rfRegion The frequency band (RFRegion) value. 
       */
      public fun rfRegion(rfRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty.builder()

      /**
       * @param gatewayEui The gateway's EUI value. 
       */
      override fun gatewayEui(gatewayEui: String) {
        cdkBuilder.gatewayEui(gatewayEui)
      }

      /**
       * @param rfRegion The frequency band (RFRegion) value. 
       */
      override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty,
    ) : CdkObject(cdkObject),
        LoRaWANGatewayProperty {
      /**
       * The gateway's EUI value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessgateway-lorawangateway.html#cfn-iotwireless-wirelessgateway-lorawangateway-gatewayeui)
       */
      override fun gatewayEui(): String = unwrap(this).getGatewayEui()

      /**
       * The frequency band (RFRegion) value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessgateway-lorawangateway.html#cfn-iotwireless-wirelessgateway-lorawangateway-rfregion)
       */
      override fun rfRegion(): String = unwrap(this).getRfRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANGatewayProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty):
          LoRaWANGatewayProperty = CdkObjectWrappers.wrap(cdkObject) as? LoRaWANGatewayProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANGatewayProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty
    }
  }
}
