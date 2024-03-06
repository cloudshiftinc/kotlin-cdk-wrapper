@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.constructs.Construct

/**
 * The `AWS::Lightsail::Disk` resource specifies a disk that can be attached to an Amazon Lightsail
 * instance that is in the same AWS Region and Availability Zone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
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
@CdkDslMarker
public class CfnDiskDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDisk.Builder = CfnDisk.Builder.create(scope, id)

    private val _addOns: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     *
     * @param addOns An array of add-ons for the disk.
     */
    public fun addOns(vararg addOns: Any) {
        _addOns.addAll(listOf(*addOns))
    }

    /**
     * An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     *
     * @param addOns An array of add-ons for the disk.
     */
    public fun addOns(addOns: Collection<Any>) {
        _addOns.addAll(addOns)
    }

    /**
     * An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-addons)
     *
     * @param addOns An array of add-ons for the disk.
     */
    public fun addOns(addOns: IResolvable) {
        cdkBuilder.addOns(addOns)
    }

    /**
     * The AWS Region and Availability Zone location for the disk (for example, `us-east-1a` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-availabilityzone)
     *
     * @param availabilityZone The AWS Region and Availability Zone location for the disk (for
     *   example, `us-east-1a` ).
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The name of the disk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-diskname)
     *
     * @param diskName The name of the disk.
     */
    public fun diskName(diskName: String) {
        cdkBuilder.diskName(diskName)
    }

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     *
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /**
     * The AWS Region and Availability Zone where the disk is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-location)
     *
     * @param location The AWS Region and Availability Zone where the disk is located.
     */
    public fun location(location: CfnDisk.LocationProperty) {
        cdkBuilder.location(location)
    }

    /**
     * The size of the disk in GB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-sizeingb)
     *
     * @param sizeInGb The size of the disk in GB.
     */
    public fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-disk.html#cfn-lightsail-disk-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDisk {
        if (_addOns.isNotEmpty()) cdkBuilder.addOns(_addOns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
