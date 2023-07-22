@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * An object representing a constraint on task placement.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementconstraint.html)
 */
@CdkDslMarker
public class CfnSchedulePlacementConstraintPropertyDsl {
  private val cdkBuilder: CfnSchedule.PlacementConstraintProperty.Builder =
      CfnSchedule.PlacementConstraintProperty.builder()

  /**
   * @param expression A cluster query language expression to apply to the constraint.
   * You cannot specify an expression if the constraint type is `distinctInstance` . For more
   * information, see [Cluster query
   * language](https://docs.aws.amazon.com/latest/developerguide/cluster-query-language.html) in the
   * *Amazon ECS Developer Guide* .
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

  public fun build(): CfnSchedule.PlacementConstraintProperty = cdkBuilder.build()
}
