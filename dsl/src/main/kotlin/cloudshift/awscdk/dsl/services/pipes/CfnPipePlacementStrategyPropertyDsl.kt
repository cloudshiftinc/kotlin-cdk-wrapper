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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The task placement strategy for a task or service.
 *
 * To learn more, see
 * [Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html)
 * in the Amazon Elastic Container Service Service Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementstrategy.html)
 */
@CdkDslMarker
public class CfnPipePlacementStrategyPropertyDsl {
    private val cdkBuilder: CfnPipe.PlacementStrategyProperty.Builder =
        CfnPipe.PlacementStrategyProperty.builder()

    /**
     * @param field The field to apply the placement strategy against. For the spread placement
     *   strategy, valid values are instanceId (or host, which has the same effect), or any platform
     *   or custom attribute that is applied to a container instance, such as
     *   attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu
     *   and memory. For the random placement strategy, this field is not used.
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

    public fun build(): CfnPipe.PlacementStrategyProperty = cdkBuilder.build()
}
