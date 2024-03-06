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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ecs.EBSTagSpecification
import software.amazon.awscdk.services.ecs.EbsPropagatedTagSource

/**
 * Tag Specification for EBS volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * EBSTagSpecification eBSTagSpecification = EBSTagSpecification.builder()
 * .propagateTags(EbsPropagatedTagSource.SERVICE)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 */
@CdkDslMarker
public class EBSTagSpecificationDsl {
    private val cdkBuilder: EBSTagSpecification.Builder = EBSTagSpecification.builder()

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     *   service to the task. Valid values are: PropagatedTagSource.SERVICE,
     *   PropagatedTagSource.TASK_DEFINITION
     */
    public fun propagateTags(propagateTags: EbsPropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /** @param tags The tags to apply to the volume. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): EBSTagSpecification = cdkBuilder.build()
}
