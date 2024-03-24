@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lightsail::Disk` resource specifies a disk that can be attached to an Amazon Lightsail
 * instance that is in the same AWS Region and Availability Zone.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnDisk cfnDisk = CfnDisk.Builder.create(this, "MyCfnDisk")
 * .diskName("diskName")
 * .sizeInGb(123)
 * // the properties below are optional
 * .addOns(List.of(AddOnProperty.builder()
 * .addOnType("addOnType")
 * // the properties below are optional
 * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
 * .snapshotTimeOfDay("snapshotTimeOfDay")
 * .build())
 * .status("status")
 * .build()))
 * .availabilityZone("availabilityZone")
 * .location(LocationProperty.builder()
 * .availabilityZone("availabilityZone")
 * .regionName("regionName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html)
 */
public open class CfnDisk(
  cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDiskProps,
  ) :
      this(software.amazon.awscdk.services.lightsail.CfnDisk(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDiskProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDiskProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDiskProps(props)
  )

  /**
   * An array of add-ons for the disk.
   */
  public open fun addOns(): Any? = unwrap(this).getAddOns()

  /**
   * An array of add-ons for the disk.
   */
  public open fun addOns(`value`: IResolvable) {
    unwrap(this).setAddOns(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of add-ons for the disk.
   */
  public open fun addOns(`value`: List<Any>) {
    unwrap(this).setAddOns(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of add-ons for the disk.
   */
  public open fun addOns(vararg `value`: Any): Unit = addOns(`value`.toList())

  /**
   * The resources to which the disk is attached.
   */
  public open fun attrAttachedTo(): String = unwrap(this).getAttrAttachedTo()

  /**
   * (Deprecated) The attachment state of the disk.
   *
   *
   * In releases prior to November 14, 2017, this parameter returned `attached` for system disks in
   * the API response. It is now deprecated, but still included in the response. Use `isAttached`
   * instead.
   */
  public open fun attrAttachmentState(): String = unwrap(this).getAttrAttachmentState()

  /**
   * The Amazon Resource Name (ARN) of the disk.
   */
  public open fun attrDiskArn(): String = unwrap(this).getAttrDiskArn()

  /**
   * The input/output operations per second (IOPS) of the disk.
   */
  public open fun attrIops(): Number = unwrap(this).getAttrIops()

  /**
   * A Boolean value indicating whether the disk is attached.
   */
  public open fun attrIsAttached(): IResolvable =
      unwrap(this).getAttrIsAttached().let(IResolvable::wrap)

  /**
   * The Availability Zone where the disk is located.
   */
  public open fun attrLocationAvailabilityZone(): String =
      unwrap(this).getAttrLocationAvailabilityZone()

  /**
   * The AWS Region where the disk is located.
   */
  public open fun attrLocationRegionName(): String = unwrap(this).getAttrLocationRegionName()

  /**
   * The disk path.
   */
  public open fun attrPath(): String = unwrap(this).getAttrPath()

  /**
   * The resource type of the disk (for example, `Disk` ).
   */
  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  /**
   * The state of the disk (for example, `in-use` ).
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The support code of the disk.
   *
   * Include this code in your email to support when you have questions about a disk or another
   * resource in Lightsail . This code helps our support team to look up your Lightsail information.
   */
  public open fun attrSupportCode(): String = unwrap(this).getAttrSupportCode()

  /**
   * The AWS Region and Availability Zone location for the disk (for example, `us-east-1a` ).
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The AWS Region and Availability Zone location for the disk (for example, `us-east-1a` ).
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The name of the disk.
   */
  public open fun diskName(): String = unwrap(this).getDiskName()

  /**
   * The name of the disk.
   */
  public open fun diskName(`value`: String) {
    unwrap(this).setDiskName(`value`)
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
   * The AWS Region and Availability Zone where the disk is located.
   */
  public open fun location(): Any? = unwrap(this).getLocation()

  /**
   * The AWS Region and Availability Zone where the disk is located.
   */
  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The AWS Region and Availability Zone where the disk is located.
   */
  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
  }

  /**
   * The AWS Region and Availability Zone where the disk is located.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6ea1ce60a7102130db8514b1dd1d4291dac2673f3f99f71bd4f4b4bd387abd2")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  /**
   * The size of the disk in GB.
   */
  public open fun sizeInGb(): Number = unwrap(this).getSizeInGb()

  /**
   * The size of the disk in GB.
   */
  public open fun sizeInGb(`value`: Number) {
    unwrap(this).setSizeInGb(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnDisk].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of add-ons for the disk.
     *
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     * @param addOns An array of add-ons for the disk. 
     */
    public fun addOns(addOns: IResolvable)

    /**
     * An array of add-ons for the disk.
     *
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     * @param addOns An array of add-ons for the disk. 
     */
    public fun addOns(addOns: List<Any>)

    /**
     * An array of add-ons for the disk.
     *
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     * @param addOns An array of add-ons for the disk. 
     */
    public fun addOns(vararg addOns: Any)

    /**
     * The AWS Region and Availability Zone location for the disk (for example, `us-east-1a` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-availabilityzone)
     * @param availabilityZone The AWS Region and Availability Zone location for the disk (for
     * example, `us-east-1a` ). 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The name of the disk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-diskname)
     * @param diskName The name of the disk. 
     */
    public fun diskName(diskName: String)

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     * @param location The AWS Region and Availability Zone where the disk is located. 
     */
    public fun location(location: IResolvable)

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     * @param location The AWS Region and Availability Zone where the disk is located. 
     */
    public fun location(location: LocationProperty)

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     * @param location The AWS Region and Availability Zone where the disk is located. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd31cd3aff101e415dd437d50ed0c47b200615363e5321b85bb126ab37e00fa9")
    public fun location(location: LocationProperty.Builder.() -> Unit)

    /**
     * The size of the disk in GB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-sizeingb)
     * @param sizeInGb The size of the disk in GB. 
     */
    public fun sizeInGb(sizeInGb: Number)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDisk.Builder =
        software.amazon.awscdk.services.lightsail.CfnDisk.Builder.create(scope, id)

    /**
     * An array of add-ons for the disk.
     *
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     * @param addOns An array of add-ons for the disk. 
     */
    override fun addOns(addOns: IResolvable) {
      cdkBuilder.addOns(addOns.let(IResolvable::unwrap))
    }

    /**
     * An array of add-ons for the disk.
     *
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     * @param addOns An array of add-ons for the disk. 
     */
    override fun addOns(addOns: List<Any>) {
      cdkBuilder.addOns(addOns.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of add-ons for the disk.
     *
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     * @param addOns An array of add-ons for the disk. 
     */
    override fun addOns(vararg addOns: Any): Unit = addOns(addOns.toList())

    /**
     * The AWS Region and Availability Zone location for the disk (for example, `us-east-1a` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-availabilityzone)
     * @param availabilityZone The AWS Region and Availability Zone location for the disk (for
     * example, `us-east-1a` ). 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The name of the disk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-diskname)
     * @param diskName The name of the disk. 
     */
    override fun diskName(diskName: String) {
      cdkBuilder.diskName(diskName)
    }

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     * @param location The AWS Region and Availability Zone where the disk is located. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     * @param location The AWS Region and Availability Zone where the disk is located. 
     */
    override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty::unwrap))
    }

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     * @param location The AWS Region and Availability Zone where the disk is located. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd31cd3aff101e415dd437d50ed0c47b200615363e5321b85bb126ab37e00fa9")
    override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    /**
     * The size of the disk in GB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-sizeingb)
     * @param sizeInGb The size of the disk in GB. 
     */
    override fun sizeInGb(sizeInGb: Number) {
      cdkBuilder.sizeInGb(sizeInGb)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDisk = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnDisk.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDisk {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDisk(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk): CfnDisk =
        CfnDisk(cdkObject)

    internal fun unwrap(wrapped: CfnDisk): software.amazon.awscdk.services.lightsail.CfnDisk =
        wrapped.cdkObject as software.amazon.awscdk.services.lightsail.CfnDisk
  }

  /**
   * `AddOn` is a property of the
   * [AWS::Lightsail::Disk](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html)
   * resource. It describes the add-ons for a disk.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * AddOnProperty addOnProperty = AddOnProperty.builder()
   * .addOnType("addOnType")
   * // the properties below are optional
   * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
   * .snapshotTimeOfDay("snapshotTimeOfDay")
   * .build())
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html)
   */
  public interface AddOnProperty {
    /**
     * The add-on type (for example, `AutoSnapshot` ).
     *
     *
     * `AutoSnapshot` is the only add-on that can be enabled for a disk.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html#cfn-lightsail-disk-addon-addontype)
     */
    public fun addOnType(): String

    /**
     * The parameters for the automatic snapshot add-on, such as the daily time when an automatic
     * snapshot will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html#cfn-lightsail-disk-addon-autosnapshotaddonrequest)
     */
    public fun autoSnapshotAddOnRequest(): Any? = unwrap(this).getAutoSnapshotAddOnRequest()

    /**
     * The status of the add-on.
     *
     * Valid Values: `Enabled` | `Disabled`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html#cfn-lightsail-disk-addon-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [AddOnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addOnType The add-on type (for example, `AutoSnapshot` ). 
       *
       * `AutoSnapshot` is the only add-on that can be enabled for a disk.
       */
      public fun addOnType(addOnType: String)

      /**
       * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as
       * the daily time when an automatic snapshot will be created.
       */
      public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable)

      /**
       * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as
       * the daily time when an automatic snapshot will be created.
       */
      public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty)

      /**
       * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as
       * the daily time when an automatic snapshot will be created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bfdcb74b866e98c57c2409486794c297fdaab9d014d1c05279a425875c2d9e3")
      public
          fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit)

      /**
       * @param status The status of the add-on.
       * Valid Values: `Enabled` | `Disabled`
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty.builder()

      /**
       * @param addOnType The add-on type (for example, `AutoSnapshot` ). 
       *
       * `AutoSnapshot` is the only add-on that can be enabled for a disk.
       */
      override fun addOnType(addOnType: String) {
        cdkBuilder.addOnType(addOnType)
      }

      /**
       * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as
       * the daily time when an automatic snapshot will be created.
       */
      override fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.let(IResolvable::unwrap))
      }

      /**
       * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as
       * the daily time when an automatic snapshot will be created.
       */
      override fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.let(AutoSnapshotAddOnProperty::unwrap))
      }

      /**
       * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as
       * the daily time when an automatic snapshot will be created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bfdcb74b866e98c57c2409486794c297fdaab9d014d1c05279a425875c2d9e3")
      override
          fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit):
          Unit = autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty(autoSnapshotAddOnRequest))

      /**
       * @param status The status of the add-on.
       * Valid Values: `Enabled` | `Disabled`
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty,
    ) : CdkObject(cdkObject), AddOnProperty {
      /**
       * The add-on type (for example, `AutoSnapshot` ).
       *
       *
       * `AutoSnapshot` is the only add-on that can be enabled for a disk.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html#cfn-lightsail-disk-addon-addontype)
       */
      override fun addOnType(): String = unwrap(this).getAddOnType()

      /**
       * The parameters for the automatic snapshot add-on, such as the daily time when an automatic
       * snapshot will be created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html#cfn-lightsail-disk-addon-autosnapshotaddonrequest)
       */
      override fun autoSnapshotAddOnRequest(): Any? = unwrap(this).getAutoSnapshotAddOnRequest()

      /**
       * The status of the add-on.
       *
       * Valid Values: `Enabled` | `Disabled`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html#cfn-lightsail-disk-addon-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty):
          AddOnProperty = CdkObjectWrappers.wrap(cdkObject) as? AddOnProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddOnProperty):
          software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty
    }
  }

  /**
   * `AutoSnapshotAddOn` is a property of the
   * [AddOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html)
   * property. It describes the automatic snapshot add-on for a disk.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * AutoSnapshotAddOnProperty autoSnapshotAddOnProperty = AutoSnapshotAddOnProperty.builder()
   * .snapshotTimeOfDay("snapshotTimeOfDay")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-autosnapshotaddon.html)
   */
  public interface AutoSnapshotAddOnProperty {
    /**
     * The daily time when an automatic snapshot will be created.
     *
     * Constraints:
     *
     * * Must be in `HH:00` format, and in an hourly increment.
     * * Specified in Coordinated Universal Time (UTC).
     * * The snapshot will be automatically created between the time specified and up to 45 minutes
     * after.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-autosnapshotaddon.html#cfn-lightsail-disk-autosnapshotaddon-snapshottimeofday)
     */
    public fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()

    /**
     * A builder for [AutoSnapshotAddOnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
       * Constraints:
       *
       * * Must be in `HH:00` format, and in an hourly increment.
       * * Specified in Coordinated Universal Time (UTC).
       * * The snapshot will be automatically created between the time specified and up to 45
       * minutes after.
       */
      public fun snapshotTimeOfDay(snapshotTimeOfDay: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty.builder()

      /**
       * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
       * Constraints:
       *
       * * Must be in `HH:00` format, and in an hourly increment.
       * * Specified in Coordinated Universal Time (UTC).
       * * The snapshot will be automatically created between the time specified and up to 45
       * minutes after.
       */
      override fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
        cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty,
    ) : CdkObject(cdkObject), AutoSnapshotAddOnProperty {
      /**
       * The daily time when an automatic snapshot will be created.
       *
       * Constraints:
       *
       * * Must be in `HH:00` format, and in an hourly increment.
       * * Specified in Coordinated Universal Time (UTC).
       * * The snapshot will be automatically created between the time specified and up to 45
       * minutes after.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-autosnapshotaddon.html#cfn-lightsail-disk-autosnapshotaddon-snapshottimeofday)
       */
      override fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoSnapshotAddOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty):
          AutoSnapshotAddOnProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoSnapshotAddOnProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoSnapshotAddOnProperty):
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty
    }
  }

  /**
   * The AWS Region and Availability Zone where the disk is located.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * LocationProperty locationProperty = LocationProperty.builder()
   * .availabilityZone("availabilityZone")
   * .regionName("regionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-location.html)
   */
  public interface LocationProperty {
    /**
     * The Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-location.html#cfn-lightsail-disk-location-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The AWS Region where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-location.html#cfn-lightsail-disk-location-regionname)
     */
    public fun regionName(): String? = unwrap(this).getRegionName()

    /**
     * A builder for [LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone where the disk is located.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param regionName The AWS Region where the disk is located.
       */
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty.builder()

      /**
       * @param availabilityZone The Availability Zone where the disk is located.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param regionName The AWS Region where the disk is located.
       */
      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty,
    ) : CdkObject(cdkObject), LocationProperty {
      /**
       * The Availability Zone where the disk is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-location.html#cfn-lightsail-disk-location-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The AWS Region where the disk is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-location.html#cfn-lightsail-disk-location-regionname)
       */
      override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty):
          LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty
    }
  }
}
