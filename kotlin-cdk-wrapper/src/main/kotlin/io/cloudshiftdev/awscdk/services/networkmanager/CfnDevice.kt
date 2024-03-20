@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

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
 * Specifies a device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnDevice cfnDevice = CfnDevice.Builder.create(this, "MyCfnDevice")
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
public open class CfnDevice internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnDevice(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeviceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeviceProps(props)
  )

  /**
   * The time that the device was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ARN of the device.
   *
   * For example,
   * `arn:aws:networkmanager::123456789012:device/global-network-01231231231231231/device-07f6fd08867abc123`
   * .
   */
  public open fun attrDeviceArn(): String = unwrap(this).getAttrDeviceArn()

  /**
   * The ID of the device.
   *
   * For example, `device-07f6fd08867abc123` .
   */
  public open fun attrDeviceId(): String = unwrap(this).getAttrDeviceId()

  /**
   * The state of the device.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The AWS location of the device.
   */
  public open fun awsLocation(): Any? = unwrap(this).getAwsLocation()

  /**
   * The AWS location of the device.
   */
  public open fun awsLocation(`value`: IResolvable) {
    unwrap(this).setAwsLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The AWS location of the device.
   */
  public open fun awsLocation(`value`: AWSLocationProperty) {
    unwrap(this).setAwsLocation(`value`.let(AWSLocationProperty::unwrap))
  }

  /**
   * The AWS location of the device.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83d22458fe4c928e3b0d576756cf7d4cb96076efe3f14dec0ba40189d51f952c")
  public open fun awsLocation(`value`: AWSLocationProperty.Builder.() -> Unit): Unit =
      awsLocation(AWSLocationProperty(`value`))

  /**
   * A description of the device.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the device.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the global network.
   */
  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  /**
   * The ID of the global network.
   */
  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The site location.
   */
  public open fun location(): Any? = unwrap(this).getLocation()

  /**
   * The site location.
   */
  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The site location.
   */
  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
  }

  /**
   * The site location.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe1d2e6c4bcf17ed92a42706fcc004b539bdf2c9344bca7ead7c95d2bea105cb")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  /**
   * The model of the device.
   */
  public open fun model(): String? = unwrap(this).getModel()

  /**
   * The model of the device.
   */
  public open fun model(`value`: String) {
    unwrap(this).setModel(`value`)
  }

  /**
   * The serial number of the device.
   */
  public open fun serialNumber(): String? = unwrap(this).getSerialNumber()

  /**
   * The serial number of the device.
   */
  public open fun serialNumber(`value`: String) {
    unwrap(this).setSerialNumber(`value`)
  }

  /**
   * The site ID.
   */
  public open fun siteId(): String? = unwrap(this).getSiteId()

  /**
   * The site ID.
   */
  public open fun siteId(`value`: String) {
    unwrap(this).setSiteId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the device.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the device.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the device.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The device type.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The device type.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The vendor of the device.
   */
  public open fun vendor(): String? = unwrap(this).getVendor()

  /**
   * The vendor of the device.
   */
  public open fun vendor(`value`: String) {
    unwrap(this).setVendor(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnDevice].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS location of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
     * @param awsLocation The AWS location of the device. 
     */
    public fun awsLocation(awsLocation: IResolvable)

    /**
     * The AWS location of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
     * @param awsLocation The AWS location of the device. 
     */
    public fun awsLocation(awsLocation: AWSLocationProperty)

    /**
     * The AWS location of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
     * @param awsLocation The AWS location of the device. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("876b852edb9897dee52b427b91554cf016d67b1c8c78a214475b98d0e8752b43")
    public fun awsLocation(awsLocation: AWSLocationProperty.Builder.() -> Unit)

    /**
     * A description of the device.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-description)
     * @param description A description of the device. 
     */
    public fun description(description: String)

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * The site location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
     * @param location The site location. 
     */
    public fun location(location: IResolvable)

    /**
     * The site location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
     * @param location The site location. 
     */
    public fun location(location: LocationProperty)

    /**
     * The site location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
     * @param location The site location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a741859ec421cd2266f4416b1a2c580555d70e8b533608f512b1a0b89cde9c39")
    public fun location(location: LocationProperty.Builder.() -> Unit)

    /**
     * The model of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-model)
     * @param model The model of the device. 
     */
    public fun model(model: String)

    /**
     * The serial number of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-serialnumber)
     * @param serialNumber The serial number of the device. 
     */
    public fun serialNumber(serialNumber: String)

    /**
     * The site ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-siteid)
     * @param siteId The site ID. 
     */
    public fun siteId(siteId: String)

    /**
     * The tags for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
     * @param tags The tags for the device. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
     * @param tags The tags for the device. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The device type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-type)
     * @param type The device type. 
     */
    public fun type(type: String)

    /**
     * The vendor of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-vendor)
     * @param vendor The vendor of the device. 
     */
    public fun vendor(vendor: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnDevice.Builder =
        software.amazon.awscdk.services.networkmanager.CfnDevice.Builder.create(scope, id)

    /**
     * The AWS location of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
     * @param awsLocation The AWS location of the device. 
     */
    override fun awsLocation(awsLocation: IResolvable) {
      cdkBuilder.awsLocation(awsLocation.let(IResolvable::unwrap))
    }

    /**
     * The AWS location of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
     * @param awsLocation The AWS location of the device. 
     */
    override fun awsLocation(awsLocation: AWSLocationProperty) {
      cdkBuilder.awsLocation(awsLocation.let(AWSLocationProperty::unwrap))
    }

    /**
     * The AWS location of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
     * @param awsLocation The AWS location of the device. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("876b852edb9897dee52b427b91554cf016d67b1c8c78a214475b98d0e8752b43")
    override fun awsLocation(awsLocation: AWSLocationProperty.Builder.() -> Unit): Unit =
        awsLocation(AWSLocationProperty(awsLocation))

    /**
     * A description of the device.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-description)
     * @param description A description of the device. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * The site location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
     * @param location The site location. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    /**
     * The site location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
     * @param location The site location. 
     */
    override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty::unwrap))
    }

    /**
     * The site location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
     * @param location The site location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a741859ec421cd2266f4416b1a2c580555d70e8b533608f512b1a0b89cde9c39")
    override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    /**
     * The model of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-model)
     * @param model The model of the device. 
     */
    override fun model(model: String) {
      cdkBuilder.model(model)
    }

    /**
     * The serial number of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-serialnumber)
     * @param serialNumber The serial number of the device. 
     */
    override fun serialNumber(serialNumber: String) {
      cdkBuilder.serialNumber(serialNumber)
    }

    /**
     * The site ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-siteid)
     * @param siteId The site ID. 
     */
    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    /**
     * The tags for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
     * @param tags The tags for the device. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
     * @param tags The tags for the device. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The device type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-type)
     * @param type The device type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The vendor of the device.
     *
     * Constraints: Maximum length of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-vendor)
     * @param vendor The vendor of the device. 
     */
    override fun vendor(vendor: String) {
      cdkBuilder.vendor(vendor)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnDevice =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnDevice.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice):
        CfnDevice = CfnDevice(cdkObject)

    internal fun unwrap(wrapped: CfnDevice):
        software.amazon.awscdk.services.networkmanager.CfnDevice = wrapped.cdkObject
  }

  /**
   * Specifies a location in AWS .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * AWSLocationProperty aWSLocationProperty = AWSLocationProperty.builder()
   * .subnetArn("subnetArn")
   * .zone("zone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-awslocation.html)
   */
  public interface AWSLocationProperty {
    /**
     * The Amazon Resource Name (ARN) of the subnet that the device is located in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-awslocation.html#cfn-networkmanager-device-awslocation-subnetarn)
     */
    public fun subnetArn(): String? = unwrap(this).getSubnetArn()

    /**
     * The Zone that the device is located in.
     *
     * Specify the ID of an Availability Zone, Local Zone, Wavelength Zone, or an Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-awslocation.html#cfn-networkmanager-device-awslocation-zone)
     */
    public fun zone(): String? = unwrap(this).getZone()

    /**
     * A builder for [AWSLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param subnetArn The Amazon Resource Name (ARN) of the subnet that the device is located
       * in.
       */
      public fun subnetArn(subnetArn: String)

      /**
       * @param zone The Zone that the device is located in.
       * Specify the ID of an Availability Zone, Local Zone, Wavelength Zone, or an Outpost.
       */
      public fun zone(zone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty.builder()

      /**
       * @param subnetArn The Amazon Resource Name (ARN) of the subnet that the device is located
       * in.
       */
      override fun subnetArn(subnetArn: String) {
        cdkBuilder.subnetArn(subnetArn)
      }

      /**
       * @param zone The Zone that the device is located in.
       * Specify the ID of an Availability Zone, Local Zone, Wavelength Zone, or an Outpost.
       */
      override fun zone(zone: String) {
        cdkBuilder.zone(zone)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty,
    ) : CdkObject(cdkObject), AWSLocationProperty {
      /**
       * The Amazon Resource Name (ARN) of the subnet that the device is located in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-awslocation.html#cfn-networkmanager-device-awslocation-subnetarn)
       */
      override fun subnetArn(): String? = unwrap(this).getSubnetArn()

      /**
       * The Zone that the device is located in.
       *
       * Specify the ID of an Availability Zone, Local Zone, Wavelength Zone, or an Outpost.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-awslocation.html#cfn-networkmanager-device-awslocation-zone)
       */
      override fun zone(): String? = unwrap(this).getZone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AWSLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty):
          AWSLocationProperty = CdkObjectWrappers.wrap(cdkObject) as? AWSLocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSLocationProperty):
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty
    }
  }

  /**
   * Describes a location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * LocationProperty locationProperty = LocationProperty.builder()
   * .address("address")
   * .latitude("latitude")
   * .longitude("longitude")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html)
   */
  public interface LocationProperty {
    /**
     * The physical address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The latitude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-latitude)
     */
    public fun latitude(): String? = unwrap(this).getLatitude()

    /**
     * The longitude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-longitude)
     */
    public fun longitude(): String? = unwrap(this).getLongitude()

    /**
     * A builder for [LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The physical address.
       */
      public fun address(address: String)

      /**
       * @param latitude The latitude.
       */
      public fun latitude(latitude: String)

      /**
       * @param longitude The longitude.
       */
      public fun longitude(longitude: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty.builder()

      /**
       * @param address The physical address.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param latitude The latitude.
       */
      override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      /**
       * @param longitude The longitude.
       */
      override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public fun build(): software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty,
    ) : CdkObject(cdkObject), LocationProperty {
      /**
       * The physical address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The latitude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-latitude)
       */
      override fun latitude(): String? = unwrap(this).getLatitude()

      /**
       * The longitude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-longitude)
       */
      override fun longitude(): String? = unwrap(this).getLongitude()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty):
          LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty
    }
  }
}
