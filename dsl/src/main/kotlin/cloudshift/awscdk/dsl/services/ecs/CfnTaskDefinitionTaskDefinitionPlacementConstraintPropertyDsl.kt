@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionTaskDefinitionPlacementConstraintPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder =
      CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.builder()

  /**
   * @param expression A cluster query language expression to apply to the constraint.
   * For more information, see [Cluster query
   * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param type The type of constraint. 
   * The `MemberOf` constraint restricts selection to be from a group of valid candidates.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty =
      cdkBuilder.build()
}
