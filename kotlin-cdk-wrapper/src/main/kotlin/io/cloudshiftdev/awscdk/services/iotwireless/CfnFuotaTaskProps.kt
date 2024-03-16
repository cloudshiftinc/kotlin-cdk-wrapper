@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFuotaTask`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnFuotaTaskProps cfnFuotaTaskProps = CfnFuotaTaskProps.builder()
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
public interface CfnFuotaTaskProps {
  /**
   * The ID of the multicast group to associate with a FUOTA task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatemulticastgroup)
   */
  public fun associateMulticastGroup(): String? = unwrap(this).getAssociateMulticastGroup()

  /**
   * The ID of the wireless device to associate with a multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatewirelessdevice)
   */
  public fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  /**
   * The description of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the multicast group to disassociate from a FUOTA task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatemulticastgroup)
   */
  public fun disassociateMulticastGroup(): String? = unwrap(this).getDisassociateMulticastGroup()

  /**
   * The ID of the wireless device to disassociate from a FUOTA task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatewirelessdevice)
   */
  public fun disassociateWirelessDevice(): String? = unwrap(this).getDisassociateWirelessDevice()

  /**
   * The S3 URI points to a firmware update image that is to be used with a FUOTA task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdateimage)
   */
  public fun firmwareUpdateImage(): String

  /**
   * The firmware update role that is to be used with a FUOTA task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdaterole)
   */
  public fun firmwareUpdateRole(): String

  /**
   * The LoRaWAN information used with a FUOTA task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
   */
  public fun loRaWan(): Any

  /**
   * The name of a FUOTA task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFuotaTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associateMulticastGroup The ID of the multicast group to associate with a FUOTA task.
     */
    public fun associateMulticastGroup(associateMulticastGroup: String)

    /**
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     * group.
     */
    public fun associateWirelessDevice(associateWirelessDevice: String)

    /**
     * @param description The description of the new resource.
     */
    public fun description(description: String)

    /**
     * @param disassociateMulticastGroup The ID of the multicast group to disassociate from a FUOTA
     * task.
     */
    public fun disassociateMulticastGroup(disassociateMulticastGroup: String)

    /**
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a FUOTA
     * task.
     */
    public fun disassociateWirelessDevice(disassociateWirelessDevice: String)

    /**
     * @param firmwareUpdateImage The S3 URI points to a firmware update image that is to be used
     * with a FUOTA task. 
     */
    public fun firmwareUpdateImage(firmwareUpdateImage: String)

    /**
     * @param firmwareUpdateRole The firmware update role that is to be used with a FUOTA task. 
     */
    public fun firmwareUpdateRole(firmwareUpdateRole: String)

    /**
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    public fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty)

    /**
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3671dd8d1ba30d7154ca30e9175b9be2df9bba82b1da0d7c86d54e3d1856eea3")
    public fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty.Builder.() -> Unit)

    /**
     * @param name The name of a FUOTA task.
     */
    public fun name(name: String)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps.builder()

    /**
     * @param associateMulticastGroup The ID of the multicast group to associate with a FUOTA task.
     */
    override fun associateMulticastGroup(associateMulticastGroup: String) {
      cdkBuilder.associateMulticastGroup(associateMulticastGroup)
    }

    /**
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     * group.
     */
    override fun associateWirelessDevice(associateWirelessDevice: String) {
      cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    /**
     * @param description The description of the new resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disassociateMulticastGroup The ID of the multicast group to disassociate from a FUOTA
     * task.
     */
    override fun disassociateMulticastGroup(disassociateMulticastGroup: String) {
      cdkBuilder.disassociateMulticastGroup(disassociateMulticastGroup)
    }

    /**
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a FUOTA
     * task.
     */
    override fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
      cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    /**
     * @param firmwareUpdateImage The S3 URI points to a firmware update image that is to be used
     * with a FUOTA task. 
     */
    override fun firmwareUpdateImage(firmwareUpdateImage: String) {
      cdkBuilder.firmwareUpdateImage(firmwareUpdateImage)
    }

    /**
     * @param firmwareUpdateRole The firmware update role that is to be used with a FUOTA task. 
     */
    override fun firmwareUpdateRole(firmwareUpdateRole: String) {
      cdkBuilder.firmwareUpdateRole(firmwareUpdateRole)
    }

    /**
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    override fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnFuotaTask.LoRaWANProperty::unwrap))
    }

    /**
     * @param loRaWan The LoRaWAN information used with a FUOTA task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3671dd8d1ba30d7154ca30e9175b9be2df9bba82b1da0d7c86d54e3d1856eea3")
    override fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(CfnFuotaTask.LoRaWANProperty(loRaWan))

    /**
     * @param name The name of a FUOTA task.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps,
  ) : CdkObject(cdkObject), CfnFuotaTaskProps {
    /**
     * The ID of the multicast group to associate with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatemulticastgroup)
     */
    override fun associateMulticastGroup(): String? = unwrap(this).getAssociateMulticastGroup()

    /**
     * The ID of the wireless device to associate with a multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatewirelessdevice)
     */
    override fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

    /**
     * The description of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the multicast group to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatemulticastgroup)
     */
    override fun disassociateMulticastGroup(): String? =
        unwrap(this).getDisassociateMulticastGroup()

    /**
     * The ID of the wireless device to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatewirelessdevice)
     */
    override fun disassociateWirelessDevice(): String? =
        unwrap(this).getDisassociateWirelessDevice()

    /**
     * The S3 URI points to a firmware update image that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdateimage)
     */
    override fun firmwareUpdateImage(): String = unwrap(this).getFirmwareUpdateImage()

    /**
     * The firmware update role that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdaterole)
     */
    override fun firmwareUpdateRole(): String = unwrap(this).getFirmwareUpdateRole()

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     */
    override fun loRaWan(): Any = unwrap(this).getLoRaWan()

    /**
     * The name of a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFuotaTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps):
        CfnFuotaTaskProps = CdkObjectWrappers.wrap(cdkObject) as CfnFuotaTaskProps

    internal fun unwrap(wrapped: CfnFuotaTaskProps):
        software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps
  }
}
