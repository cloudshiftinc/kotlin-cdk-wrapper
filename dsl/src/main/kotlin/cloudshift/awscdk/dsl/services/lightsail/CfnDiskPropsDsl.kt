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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.amazon.awscdk.services.lightsail.CfnDiskProps

/**
 * Properties for defining a `CfnDisk`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
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
@CdkDslMarker
public class CfnDiskPropsDsl {
    private val cdkBuilder: CfnDiskProps.Builder = CfnDiskProps.builder()

    private val _addOns: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    public fun addOns(vararg addOns: Any) {
        _addOns.addAll(listOf(*addOns))
    }

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    public fun addOns(addOns: Collection<Any>) {
        _addOns.addAll(addOns)
    }

    /**
     * @param addOns An array of add-ons for the disk.
     *
     * If the disk has an add-on enabled when performing a delete disk request, the add-on is
     * automatically disabled before the disk is deleted.
     */
    public fun addOns(addOns: IResolvable) {
        cdkBuilder.addOns(addOns)
    }

    /**
     * @param availabilityZone The AWS Region and Availability Zone location for the disk (for
     *   example, `us-east-1a` ).
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param diskName The name of the disk. */
    public fun diskName(diskName: String) {
        cdkBuilder.diskName(diskName)
    }

    /** @param location Location of a resource. */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /** @param location Location of a resource. */
    public fun location(location: CfnDisk.LocationProperty) {
        cdkBuilder.location(location)
    }

    /** @param sizeInGb The size of the disk in GB. */
    public fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDiskProps {
        if (_addOns.isNotEmpty()) cdkBuilder.addOns(_addOns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
