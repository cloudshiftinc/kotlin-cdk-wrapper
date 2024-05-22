@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

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
 * Properties for defining a `CfnDevice`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnDeviceProps cfnDeviceProps = CfnDeviceProps.builder()
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .awsLocation(AWSLocationProperty.builder()
 * .subnetArn("subnetArn")
 * .zone("zone")
 * .build())
 * .description("description")
 * .location(LocationProperty.builder()
 * .address("address")
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .model("model")
 * .serialNumber("serialNumber")
 * .siteId("siteId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .vendor("vendor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html)
 */
public interface CfnDeviceProps {
  /**
   * The AWS location of the device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
   */
  public fun awsLocation(): Any? = unwrap(this).getAwsLocation()

  /**
   * A description of the device.
   *
   * Constraints: Maximum length of 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-globalnetworkid)
   */
  public fun globalNetworkId(): String

  /**
   * The site location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
   */
  public fun location(): Any? = unwrap(this).getLocation()

  /**
   * The model of the device.
   *
   * Constraints: Maximum length of 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-model)
   */
  public fun model(): String? = unwrap(this).getModel()

  /**
   * The serial number of the device.
   *
   * Constraints: Maximum length of 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-serialnumber)
   */
  public fun serialNumber(): String? = unwrap(this).getSerialNumber()

  /**
   * The site ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-siteid)
   */
  public fun siteId(): String? = unwrap(this).getSiteId()

  /**
   * The tags for the device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The device type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * The vendor of the device.
   *
   * Constraints: Maximum length of 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-vendor)
   */
  public fun vendor(): String? = unwrap(this).getVendor()

  /**
   * A builder for [CfnDeviceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsLocation The AWS location of the device.
     */
    public fun awsLocation(awsLocation: IResolvable)

    /**
     * @param awsLocation The AWS location of the device.
     */
    public fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty)

    /**
     * @param awsLocation The AWS location of the device.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627ca20406f6934109262f76be248505e5a0a7a400774ebc56a25157ccb424e1")
    public fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty.Builder.() -> Unit)

    /**
     * @param description A description of the device.
     * Constraints: Maximum length of 256 characters.
     */
    public fun description(description: String)

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * @param location The site location.
     */
    public fun location(location: IResolvable)

    /**
     * @param location The site location.
     */
    public fun location(location: CfnDevice.LocationProperty)

    /**
     * @param location The site location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cebf7fdaed6de748ea24971e19a233f52e83b6d800b2196c8bd5f26dfc0befc")
    public fun location(location: CfnDevice.LocationProperty.Builder.() -> Unit)

    /**
     * @param model The model of the device.
     * Constraints: Maximum length of 128 characters.
     */
    public fun model(model: String)

    /**
     * @param serialNumber The serial number of the device.
     * Constraints: Maximum length of 128 characters.
     */
    public fun serialNumber(serialNumber: String)

    /**
     * @param siteId The site ID.
     */
    public fun siteId(siteId: String)

    /**
     * @param tags The tags for the device.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the device.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The device type.
     */
    public fun type(type: String)

    /**
     * @param vendor The vendor of the device.
     * Constraints: Maximum length of 128 characters.
     */
    public fun vendor(vendor: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnDeviceProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnDeviceProps.builder()

    /**
     * @param awsLocation The AWS location of the device.
     */
    override fun awsLocation(awsLocation: IResolvable) {
      cdkBuilder.awsLocation(awsLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param awsLocation The AWS location of the device.
     */
    override fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty) {
      cdkBuilder.awsLocation(awsLocation.let(CfnDevice.AWSLocationProperty.Companion::unwrap))
    }

    /**
     * @param awsLocation The AWS location of the device.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627ca20406f6934109262f76be248505e5a0a7a400774ebc56a25157ccb424e1")
    override fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty.Builder.() -> Unit): Unit =
        awsLocation(CfnDevice.AWSLocationProperty(awsLocation))

    /**
     * @param description A description of the device.
     * Constraints: Maximum length of 256 characters.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param location The site location.
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param location The site location.
     */
    override fun location(location: CfnDevice.LocationProperty) {
      cdkBuilder.location(location.let(CfnDevice.LocationProperty.Companion::unwrap))
    }

    /**
     * @param location The site location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cebf7fdaed6de748ea24971e19a233f52e83b6d800b2196c8bd5f26dfc0befc")
    override fun location(location: CfnDevice.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnDevice.LocationProperty(location))

    /**
     * @param model The model of the device.
     * Constraints: Maximum length of 128 characters.
     */
    override fun model(model: String) {
      cdkBuilder.model(model)
    }

    /**
     * @param serialNumber The serial number of the device.
     * Constraints: Maximum length of 128 characters.
     */
    override fun serialNumber(serialNumber: String) {
      cdkBuilder.serialNumber(serialNumber)
    }

    /**
     * @param siteId The site ID.
     */
    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    /**
     * @param tags The tags for the device.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the device.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The device type.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param vendor The vendor of the device.
     * Constraints: Maximum length of 128 characters.
     */
    override fun vendor(vendor: String) {
      cdkBuilder.vendor(vendor)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkmanager.CfnDeviceProps,
  ) : CdkObject(cdkObject), CfnDeviceProps {
    /**
     * The AWS location of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
     */
    override fun awsLocation(): Any? = unwrap(this).getAwsLocation()

    /**
     * A description of the device.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-globalnetworkid)
     */
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    /**
     * The site location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
     */
    override fun location(): Any? = unwrap(this).getLocation()

    /**
     * The model of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-model)
     */
    override fun model(): String? = unwrap(this).getModel()

    /**
     * The serial number of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-serialnumber)
     */
    override fun serialNumber(): String? = unwrap(this).getSerialNumber()

    /**
     * The site ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-siteid)
     */
    override fun siteId(): String? = unwrap(this).getSiteId()

    /**
     * The tags for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The device type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-type)
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * The vendor of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-vendor)
     */
    override fun vendor(): String? = unwrap(this).getVendor()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDeviceProps):
        CfnDeviceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeviceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProps):
        software.amazon.awscdk.services.networkmanager.CfnDeviceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnDeviceProps
  }
}
