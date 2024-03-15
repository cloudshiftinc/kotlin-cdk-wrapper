@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDisk`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnDiskProps cfnDiskProps = CfnDiskProps.builder()
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
public interface CfnDiskProps {
  /**
   * An array of add-ons for the disk.
   *
   *
   * If the disk has an add-on enabled when performing a delete disk request, the add-on is
   * automatically disabled before the disk is deleted.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
   */
  public fun addOns(): Any? = unwrap(this).getAddOns()

  /**
   * The AWS Region and Availability Zone location for the disk (for example, `us-east-1a` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The name of the disk.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-diskname)
   */
  public fun diskName(): String

  /**
   * The AWS Region and Availability Zone where the disk is located.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
   */
  public fun location(): Any? = unwrap(this).getLocation()

  /**
   * The size of the disk in GB.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-sizeingb)
   */
  public fun sizeInGb(): Number

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDiskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    public fun addOns(addOns: IResolvable)

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    public fun addOns(addOns: List<Any>)

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    public fun addOns(vararg addOns: Any)

    /**
     * @param availabilityZone The AWS Region and Availability Zone location for the disk (for
     * example, `us-east-1a` ).
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param diskName The name of the disk. 
     */
    public fun diskName(diskName: String)

    /**
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    public fun location(location: IResolvable)

    /**
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    public fun location(location: CfnDisk.LocationProperty)

    /**
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b20ade57577ee270cb5f12b279c36144d8ae0e63b06368dac58a5319654637")
    public fun location(location: CfnDisk.LocationProperty.Builder.() -> Unit)

    /**
     * @param sizeInGb The size of the disk in GB. 
     */
    public fun sizeInGb(sizeInGb: Number)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDiskProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnDiskProps.builder()

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    override fun addOns(addOns: IResolvable) {
      cdkBuilder.addOns(addOns.let(IResolvable::unwrap))
    }

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    override fun addOns(addOns: List<Any>) {
      cdkBuilder.addOns(addOns)
    }

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    override fun addOns(vararg addOns: Any): Unit = addOns(addOns.toList())

    /**
     * @param availabilityZone The AWS Region and Availability Zone location for the disk (for
     * example, `us-east-1a` ).
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param diskName The name of the disk. 
     */
    override fun diskName(diskName: String) {
      cdkBuilder.diskName(diskName)
    }

    /**
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    /**
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    override fun location(location: CfnDisk.LocationProperty) {
      cdkBuilder.location(location.let(CfnDisk.LocationProperty::unwrap))
    }

    /**
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b20ade57577ee270cb5f12b279c36144d8ae0e63b06368dac58a5319654637")
    override fun location(location: CfnDisk.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnDisk.LocationProperty(location))

    /**
     * @param sizeInGb The size of the disk in GB. 
     */
    override fun sizeInGb(sizeInGb: Number) {
      cdkBuilder.sizeInGb(sizeInGb)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDiskProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnDiskProps,
  ) : CdkObject(cdkObject), CfnDiskProps {
    /**
     * An array of add-ons for the disk.
     *
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     */
    override fun addOns(): Any? = unwrap(this).getAddOns()

    /**
     * The AWS Region and Availability Zone location for the disk (for example, `us-east-1a` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The name of the disk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-diskname)
     */
    override fun diskName(): String = unwrap(this).getDiskName()

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     */
    override fun location(): Any? = unwrap(this).getLocation()

    /**
     * The size of the disk in GB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-sizeingb)
     */
    override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDiskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDiskProps):
        CfnDiskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDiskProps):
        software.amazon.awscdk.services.lightsail.CfnDiskProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lightsail.CfnDiskProps
  }
}
