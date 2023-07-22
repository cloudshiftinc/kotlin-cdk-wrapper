@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget

@CdkDslMarker
public class CfnCodeDeployBlueGreenApplicationTargetDsl {
  private val cdkBuilder: CfnCodeDeployBlueGreenApplicationTarget.Builder =
      CfnCodeDeployBlueGreenApplicationTarget.builder()

  /**
   * @param logicalId The logical id of the target resource. 
   */
  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  /**
   * @param type The resource type of the target being deployed. 
   * Right now, the only allowed value is 'AWS::ECS::Service'.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCodeDeployBlueGreenApplicationTarget = cdkBuilder.build()
}
