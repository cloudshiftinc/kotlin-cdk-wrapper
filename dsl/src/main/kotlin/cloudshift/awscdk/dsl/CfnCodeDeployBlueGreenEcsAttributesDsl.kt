@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes
import software.amazon.awscdk.CfnTrafficRouting

/**
 * The attributes of the ECS Service being deployed.
 *
 * Type of the `CfnCodeDeployBlueGreenApplication.ecsAttributes` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnCodeDeployBlueGreenEcsAttributes cfnCodeDeployBlueGreenEcsAttributes =
 * CfnCodeDeployBlueGreenEcsAttributes.builder()
 * .taskDefinitions(List.of("taskDefinitions"))
 * .taskSets(List.of("taskSets"))
 * .trafficRouting(CfnTrafficRouting.builder()
 * .prodTrafficRoute(CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .targetGroups(List.of("targetGroups"))
 * .testTrafficRoute(CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnCodeDeployBlueGreenEcsAttributesDsl {
  private val cdkBuilder: CfnCodeDeployBlueGreenEcsAttributes.Builder =
      CfnCodeDeployBlueGreenEcsAttributes.builder()

  private val _taskDefinitions: MutableList<String> = mutableListOf()

  private val _taskSets: MutableList<String> = mutableListOf()

  /**
   * @param taskDefinitions The logical IDs of the blue and green, respectively,
   * AWS::ECS::TaskDefinition task definitions. 
   */
  public fun taskDefinitions(vararg taskDefinitions: String) {
    _taskDefinitions.addAll(listOf(*taskDefinitions))
  }

  /**
   * @param taskDefinitions The logical IDs of the blue and green, respectively,
   * AWS::ECS::TaskDefinition task definitions. 
   */
  public fun taskDefinitions(taskDefinitions: Collection<String>) {
    _taskDefinitions.addAll(taskDefinitions)
  }

  /**
   * @param taskSets The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task
   * sets. 
   */
  public fun taskSets(vararg taskSets: String) {
    _taskSets.addAll(listOf(*taskSets))
  }

  /**
   * @param taskSets The logical IDs of the blue and green, respectively, AWS::ECS::TaskSet task
   * sets. 
   */
  public fun taskSets(taskSets: Collection<String>) {
    _taskSets.addAll(taskSets)
  }

  /**
   * @param trafficRouting The traffic routing configuration. 
   */
  public fun trafficRouting(trafficRouting: CfnTrafficRoutingDsl.() -> Unit = {}) {
    val builder = CfnTrafficRoutingDsl()
    builder.apply(trafficRouting)
    cdkBuilder.trafficRouting(builder.build())
  }

  /**
   * @param trafficRouting The traffic routing configuration. 
   */
  public fun trafficRouting(trafficRouting: CfnTrafficRouting) {
    cdkBuilder.trafficRouting(trafficRouting)
  }

  public fun build(): CfnCodeDeployBlueGreenEcsAttributes {
    if(_taskDefinitions.isNotEmpty()) cdkBuilder.taskDefinitions(_taskDefinitions)
    if(_taskSets.isNotEmpty()) cdkBuilder.taskSets(_taskSets)
    return cdkBuilder.build()
  }
}
