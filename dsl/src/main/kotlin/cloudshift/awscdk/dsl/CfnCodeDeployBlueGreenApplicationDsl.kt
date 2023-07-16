@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget
import software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes

@CdkDslMarker
public class CfnCodeDeployBlueGreenApplicationDsl {
  private val cdkBuilder: CfnCodeDeployBlueGreenApplication.Builder =
      CfnCodeDeployBlueGreenApplication.builder()

  public fun ecsAttributes(block: CfnCodeDeployBlueGreenEcsAttributesDsl.() -> Unit = {}) {
    val builder = CfnCodeDeployBlueGreenEcsAttributesDsl()
    builder.apply(block)
    cdkBuilder.ecsAttributes(builder.build())
  }

  public fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes) {
    cdkBuilder.ecsAttributes(ecsAttributes)
  }

  public fun target(block: CfnCodeDeployBlueGreenApplicationTargetDsl.() -> Unit = {}) {
    val builder = CfnCodeDeployBlueGreenApplicationTargetDsl()
    builder.apply(block)
    cdkBuilder.target(builder.build())
  }

  public fun target(target: CfnCodeDeployBlueGreenApplicationTarget) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnCodeDeployBlueGreenApplication = cdkBuilder.build()
}
