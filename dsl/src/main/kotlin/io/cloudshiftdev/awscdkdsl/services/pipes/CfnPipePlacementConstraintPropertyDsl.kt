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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * An object representing a constraint on task placement.
 *
 * To learn more, see
 * [Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
 * in the Amazon Elastic Container Service Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementconstraint.html)
 */
@CdkDslMarker
public class CfnPipePlacementConstraintPropertyDsl {
    private val cdkBuilder: CfnPipe.PlacementConstraintProperty.Builder =
        CfnPipe.PlacementConstraintProperty.builder()

    /**
     * @param expression A cluster query language expression to apply to the constraint. You cannot
     *   specify an expression if the constraint type is `distinctInstance` . To learn more, see
     *   [Cluster Query Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
     *   in the Amazon Elastic Container Service Developer Guide.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /**
     * @param type The type of constraint. Use distinctInstance to ensure that each task in a
     *   particular group is running on a different container instance. Use memberOf to restrict the
     *   selection to a group of valid candidates.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPipe.PlacementConstraintProperty = cdkBuilder.build()
}
