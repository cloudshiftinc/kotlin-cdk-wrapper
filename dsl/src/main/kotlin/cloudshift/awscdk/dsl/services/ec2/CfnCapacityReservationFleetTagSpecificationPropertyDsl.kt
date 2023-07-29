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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet

/**
 * The tags to apply to a resource when the resource is being created.
 *
 * When you specify a tag, you must specify the resource type to tag, otherwise the request will
 * fail.
 *
 * The `Valid Values` lists all the resource types that can be tagged. However, the action you're
 * using might not support tagging all of these resource types. If you try to tag a resource type
 * that is unsupported for the action you're using, you'll get an error.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-tagspecification.html)
 */
@CdkDslMarker
public class CfnCapacityReservationFleetTagSpecificationPropertyDsl {
    private val cdkBuilder: CfnCapacityReservationFleet.TagSpecificationProperty.Builder =
        CfnCapacityReservationFleet.TagSpecificationProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param resourceType The type of resource to tag on creation. Specify
     *   `capacity-reservation-fleet` . To tag a resource after it has been created, see
     *   [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /** @param tags The tags to apply to the resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to apply to the resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCapacityReservationFleet.TagSpecificationProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
