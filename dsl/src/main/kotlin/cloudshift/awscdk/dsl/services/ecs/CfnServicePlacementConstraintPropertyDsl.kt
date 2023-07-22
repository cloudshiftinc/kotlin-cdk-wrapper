@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The `PlacementConstraint` property specifies an object representing a constraint on task
 * placement in the task definition.
 *
 * For more information, see [Task Placement
 * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .expression("expression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html)
 */
@CdkDslMarker
public class CfnServicePlacementConstraintPropertyDsl {
  private val cdkBuilder: CfnService.PlacementConstraintProperty.Builder =
      CfnService.PlacementConstraintProperty.builder()

  /**
   * @param expression A cluster query language expression to apply to the constraint.
   * The expression can have a maximum length of 2000 characters. You can't specify an expression if
   * the constraint type is `distinctInstance` . For more information, see [Cluster query
   * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param type The type of constraint. 
   * Use `distinctInstance` to ensure that each task in a particular group is running on a different
   * container instance. Use `memberOf` to restrict the selection to a group of valid candidates.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService.PlacementConstraintProperty = cdkBuilder.build()
}
