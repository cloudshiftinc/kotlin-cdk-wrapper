@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget
import software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes

/**
 * The application actually being deployed.
 *
 * Type of the `CfnCodeDeployBlueGreenHookProps.applications` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnCodeDeployBlueGreenApplication cfnCodeDeployBlueGreenApplication =
 * CfnCodeDeployBlueGreenApplication.builder()
 * .ecsAttributes(CfnCodeDeployBlueGreenEcsAttributes.builder()
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
 * .build())
 * .target(CfnCodeDeployBlueGreenApplicationTarget.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnCodeDeployBlueGreenApplicationDsl {
  private val cdkBuilder: CfnCodeDeployBlueGreenApplication.Builder =
      CfnCodeDeployBlueGreenApplication.builder()

  /**
   * @param ecsAttributes The detailed attributes of the deployed target. 
   */
  public fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributesDsl.() -> Unit = {}) {
    val builder = CfnCodeDeployBlueGreenEcsAttributesDsl()
    builder.apply(ecsAttributes)
    cdkBuilder.ecsAttributes(builder.build())
  }

  /**
   * @param ecsAttributes The detailed attributes of the deployed target. 
   */
  public fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes) {
    cdkBuilder.ecsAttributes(ecsAttributes)
  }

  /**
   * @param target The target that is being deployed. 
   */
  public fun target(target: CfnCodeDeployBlueGreenApplicationTargetDsl.() -> Unit = {}) {
    val builder = CfnCodeDeployBlueGreenApplicationTargetDsl()
    builder.apply(target)
    cdkBuilder.target(builder.build())
  }

  /**
   * @param target The target that is being deployed. 
   */
  public fun target(target: CfnCodeDeployBlueGreenApplicationTarget) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnCodeDeployBlueGreenApplication = cdkBuilder.build()
}
