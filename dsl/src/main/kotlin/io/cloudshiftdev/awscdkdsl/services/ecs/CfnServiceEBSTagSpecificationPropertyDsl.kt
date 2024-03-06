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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The tag specifications of an Amazon EBS volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * EBSTagSpecificationProperty eBSTagSpecificationProperty = EBSTagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * // the properties below are optional
 * .propagateTags("propagateTags")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html)
 */
@CdkDslMarker
public class CfnServiceEBSTagSpecificationPropertyDsl {
    private val cdkBuilder: CfnService.EBSTagSpecificationProperty.Builder =
        CfnService.EBSTagSpecificationProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param propagateTags Determines whether to propagate the tags from the task definition to the
     *   Amazon EBS volume. Tags can only propagate to a `SERVICE` specified in
     *   `ServiceVolumeConfiguration` . If no value is specified, the tags aren't propagated.
     */
    public fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /** @param resourceType The type of volume resource. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param tags The tags applied to this Amazon EBS volume. `AmazonECSCreated` and
     *   `AmazonECSManaged` are reserved tags that can't be used.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags applied to this Amazon EBS volume. `AmazonECSCreated` and
     *   `AmazonECSManaged` are reserved tags that can't be used.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnService.EBSTagSpecificationProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
