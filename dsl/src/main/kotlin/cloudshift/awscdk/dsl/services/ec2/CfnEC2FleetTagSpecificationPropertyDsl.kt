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
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * Specifies the tags to apply to a resource when the resource is being created for an EC2 Fleet.
 *
 * `TagSpecification` is a property of the
 * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
 * resource.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html)
 */
@CdkDslMarker
public class CfnEC2FleetTagSpecificationPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.TagSpecificationProperty.Builder =
        CfnEC2Fleet.TagSpecificationProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param resourceType The type of resource to tag. */
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

    public fun build(): CfnEC2Fleet.TagSpecificationProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
