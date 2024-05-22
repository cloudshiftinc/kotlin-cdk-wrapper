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
 * A FUOTA task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnFuotaTask cfnFuotaTask = CfnFuotaTask.Builder.create(this, "MyCfnFuotaTask")
 * .firmwareUpdateImage("firmwareUpdateImage")
 * .firmwareUpdateRole("firmwareUpdateRole")
 * .loRaWan(LoRaWANProperty.builder()
 * .rfRegion("rfRegion")
 * // the properties below are optional
 * .startTime("startTime")
 * .build())
 * // the properties below are optional
 * .associateMulticastGroup("associateMulticastGroup")
 * .associateWirelessDevice("associateWirelessDevice")
 * .description("description")
 * .disassociateMulticastGroup("disassociateMulticastGroup")
 * .disassociateWirelessDevice("disassociateWirelessDevice")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html)
 */
public open class CfnFuotaTask(
  cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFuotaTaskProps,
  ) :
      this(software.amazon.awscdk.services.iotwireless.CfnFuotaTask(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFuotaTaskProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFuotaTaskProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFuotaTaskProps(props)
  )

  /**
   * The ID of the multicast group to associate with a FUOTA task.
   */
  public open fun associateMulticastGroup(): String? = unwrap(this).getAssociateMulticastGroup()

  /**
   * The ID of the multicast group to associate with a FUOTA task.
   */
  public open fun associateMulticastGroup(`value`: String) {
    unwrap(this).setAssociateMulticastGroup(`value`)
  }

  /**
   * The ID of the wireless device to associate with a multicast group.
   */
  public open fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  /**
   * The ID of the wireless device to associate with a multicast group.
   */
  public open fun associateWirelessDevice(`value`: String) {
    unwrap(this).setAssociateWirelessDevice(`value`)
  }

  /**
   * The ARN of a FUOTA task.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The status of a FUOTA task.
   */
  public open fun attrFuotaTaskStatus(): String = unwrap(this).getAttrFuotaTaskStatus()

  /**
   * The ID of a FUOTA task.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Start time of a FUOTA task.
   */
  public open fun attrLoRaWanStartTime(): String = unwrap(this).getAttrLoRaWanStartTime()

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
   * The ID of the multicast group to disassociate from a FUOTA task.
   */
  public open fun disassociateMulticastGroup(): String? =
      unwrap(this).getDisassociateMulticastGroup()

  /**
   * The ID of the multicast group to disassociate from a FUOTA task.
   */
  public open fun disassociateMulticastGroup(`value`: String) {
    unwrap(this).setDisassociateMulticastGroup(`value`)
  }

  /**
   * The ID of the wireless device to disassociate from a FUOTA task.
   */
  public open fun disassociateWirelessDevice(): String? =
      unwrap(this).getDisassociateWirelessDevice()

  /**
   * The ID of the wireless device to disassociate from a FUOTA task.
   */
  public open fun disassociateWirelessDevice(`value`: String) {
    unwrap(this).setDisassociateWirelessDevice(`value`)
  }

  /**
   * The S3 URI points to a firmware update image that is to be used with a FUOTA task.
   */
  public open fun firmwareUpdateImage(): String = unwrap(this).getFirmwareUpdateImage()

  /**
   * The S3 URI points to a firmware update image that is to be used with a FUOTA task.
   */
  public open fun firmwareUpdateImage(`value`: String) {
    unwrap(this).setFirmwareUpdateImage(`value`)
  }

  /**
   * The firmware update role that is to be used with a FUOTA task.
   */
  public open fun firmwareUpdateRole(): String = unwrap(this).getFirmwareUpdateRole()

  /**
   * The firmware update role that is to be used with a FUOTA task.
   */
  public open fun firmwareUpdateRole(`value`: String) {
    unwrap(this).setFirmwareUpdateRole(`value`)
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
   * The LoRaWAN information used with a FUOTA task.
   */
  public open fun loRaWan(): Any = unwrap(this).getLoRaWan()

  /**
   * The LoRaWAN information used with a FUOTA task.
   */
  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The LoRaWAN information used with a FUOTA task.
   */
  public open fun loRaWan(`value`: LoRaWANProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANProperty.Companion::unwrap))
  }

  /**
   * The LoRaWAN information used with a FUOTA task.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a99e06309f086f4cd6781a2cb253828db431bd9066893acad4c92bd8426a230")
  public open fun loRaWan(`value`: LoRaWANProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANProperty(`value`))

  /**
   * The name of a FUOTA task.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of a FUOTA task.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotwireless.CfnFuotaTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the multicast group to associate with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatemulticastgroup)
     * @param associateMulticastGroup The ID of the multicast group to associate with a FUOTA task. 
     */
    public fun associateMulticastGroup(associateMulticastGroup: String)

    /**
     * The ID of the wireless device to associate with a multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatewirelessdevice)
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     * group. 
     */
    public fun associateWirelessDevice(associateWirelessDevice: String)

    /**
     * The description of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-description)
     * @param description The description of the new resource. 
     */
    public fun description(description: String)

    /**
     * The ID of the multicast group to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatemulticastgroup)
     * @param disassociateMulticastGroup The ID of the multicast group to disassociate from a FUOTA
     * task. 
     */
    public fun disassociateMulticastGroup(disassociateMulticastGroup: String)

    /**
     * The ID of the wireless device to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatewirelessdevice)
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a FUOTA
     * task. 
     */
    public fun disassociateWirelessDevice(disassociateWirelessDevice: String)

    /**
     * The S3 URI points to a firmware update image that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdateimage)
     * @param firmwareUpdateImage The S3 URI points to a firmware update image that is to be used
     * with a FUOTA task. 
     */
    public fun firmwareUpdateImage(firmwareUpdateImage: String)

    /**
     * The firmware update role that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdaterole)
     * @param firmwareUpdateRole The firmware update role that is to be used with a FUOTA task. 
     */
    public fun firmwareUpdateRole(firmwareUpdateRole: String)

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    public fun loRaWan(loRaWan: LoRaWANProperty)

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c48060063cf77fafc4ecbb90c1bb6c1b3396b527ab5f61f846c7acaf7fcccd7")
    public fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit)

    /**
     * The name of a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-name)
     * @param name The name of a FUOTA task. 
     */
    public fun name(name: String)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnFuotaTask.Builder =
        software.amazon.awscdk.services.iotwireless.CfnFuotaTask.Builder.create(scope, id)

    /**
     * The ID of the multicast group to associate with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatemulticastgroup)
     * @param associateMulticastGroup The ID of the multicast group to associate with a FUOTA task. 
     */
    override fun associateMulticastGroup(associateMulticastGroup: String) {
      cdkBuilder.associateMulticastGroup(associateMulticastGroup)
    }

    /**
     * The ID of the wireless device to associate with a multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatewirelessdevice)
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     * group. 
     */
    override fun associateWirelessDevice(associateWirelessDevice: String) {
      cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    /**
     * The description of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-description)
     * @param description The description of the new resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the multicast group to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatemulticastgroup)
     * @param disassociateMulticastGroup The ID of the multicast group to disassociate from a FUOTA
     * task. 
     */
    override fun disassociateMulticastGroup(disassociateMulticastGroup: String) {
      cdkBuilder.disassociateMulticastGroup(disassociateMulticastGroup)
    }

    /**
     * The ID of the wireless device to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatewirelessdevice)
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a FUOTA
     * task. 
     */
    override fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
      cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    /**
     * The S3 URI points to a firmware update image that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdateimage)
     * @param firmwareUpdateImage The S3 URI points to a firmware update image that is to be used
     * with a FUOTA task. 
     */
    override fun firmwareUpdateImage(firmwareUpdateImage: String) {
      cdkBuilder.firmwareUpdateImage(firmwareUpdateImage)
    }

    /**
     * The firmware update role that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdaterole)
     * @param firmwareUpdateRole The firmware update role that is to be used with a FUOTA task. 
     */
    override fun firmwareUpdateRole(firmwareUpdateRole: String) {
      cdkBuilder.firmwareUpdateRole(firmwareUpdateRole)
    }

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable.Companion::unwrap))
    }

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    override fun loRaWan(loRaWan: LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANProperty.Companion::unwrap))
    }

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c48060063cf77fafc4ecbb90c1bb6c1b3396b527ab5f61f846c7acaf7fcccd7")
    override fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANProperty(loRaWan))

    /**
     * The name of a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-name)
     * @param name The name of a FUOTA task. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnFuotaTask =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnFuotaTask.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFuotaTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFuotaTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTask):
        CfnFuotaTask = CfnFuotaTask(cdkObject)

    internal fun unwrap(wrapped: CfnFuotaTask):
        software.amazon.awscdk.services.iotwireless.CfnFuotaTask = wrapped.cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnFuotaTask
  }

  /**
   * The LoRaWAN information used with a FUOTA task.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * LoRaWANProperty loRaWANProperty = LoRaWANProperty.builder()
   * .rfRegion("rfRegion")
   * // the properties below are optional
   * .startTime("startTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-fuotatask-lorawan.html)
   */
  public interface LoRaWANProperty {
    /**
     * The frequency band (RFRegion) value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-fuotatask-lorawan.html#cfn-iotwireless-fuotatask-lorawan-rfregion)
     */
    public fun rfRegion(): String

    /**
     * Start time of a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-fuotatask-lorawan.html#cfn-iotwireless-fuotatask-lorawan-starttime)
     */
    public fun startTime(): String? = unwrap(this).getStartTime()

    /**
     * A builder for [LoRaWANProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rfRegion The frequency band (RFRegion) value. 
       */
      public fun rfRegion(rfRegion: String)

      /**
       * @param startTime Start time of a FUOTA task.
       */
      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty.builder()

      /**
       * @param rfRegion The frequency band (RFRegion) value. 
       */
      override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      /**
       * @param startTime Start time of a FUOTA task.
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build(): software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty,
    ) : CdkObject(cdkObject), LoRaWANProperty {
      /**
       * The frequency band (RFRegion) value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-fuotatask-lorawan.html#cfn-iotwireless-fuotatask-lorawan-rfregion)
       */
      override fun rfRegion(): String = unwrap(this).getRfRegion()

      /**
       * Start time of a FUOTA task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-fuotatask-lorawan.html#cfn-iotwireless-fuotatask-lorawan-starttime)
       */
      override fun startTime(): String? = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty):
          LoRaWANProperty = CdkObjectWrappers.wrap(cdkObject) as? LoRaWANProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANProperty):
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty
    }
  }
}
