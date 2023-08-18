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

package io.cloudshiftdev.awscdkdsl.services.scheduler

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * The task placement strategy for a task or service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementstrategy.html)
 */
@CdkDslMarker
public class CfnSchedulePlacementStrategyPropertyDsl {
    private val cdkBuilder: CfnSchedule.PlacementStrategyProperty.Builder =
        CfnSchedule.PlacementStrategyProperty.builder()

    /**
     * @param field The field to apply the placement strategy against. For the spread placement
     *   strategy, valid values are `instanceId` (or `instanceId` , which has the same effect), or
     *   any platform or custom attribute that is applied to a container instance, such as
     *   `attribute:ecs.availability-zone` . For the binpack placement strategy, valid values are
     *   `cpu` and `memory` . For the random placement strategy, this field is not used.
     */
    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    /**
     * @param type The type of placement strategy. The random placement strategy randomly places
     *   tasks on available candidates. The spread placement strategy spreads placement across
     *   available candidates evenly based on the field parameter. The binpack strategy places tasks
     *   on available candidates that have the least available amount of the resource that is
     *   specified with the field parameter. For example, if you binpack on memory, a task is placed
     *   on the instance with the least amount of remaining memory (but still enough to run the
     *   task).
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSchedule.PlacementStrategyProperty = cdkBuilder.build()
}
