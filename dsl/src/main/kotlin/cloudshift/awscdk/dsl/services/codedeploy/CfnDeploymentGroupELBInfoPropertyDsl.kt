@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupELBInfoPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.ELBInfoProperty.Builder =
      CfnDeploymentGroup.ELBInfoProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDeploymentGroup.ELBInfoProperty = cdkBuilder.build()
}
