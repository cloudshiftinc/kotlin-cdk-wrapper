@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentComponentDeploymentSpecificationPropertyDsl {
  private val cdkBuilder: CfnDeployment.ComponentDeploymentSpecificationProperty.Builder =
      CfnDeployment.ComponentDeploymentSpecificationProperty.builder()

  public fun componentVersion(componentVersion: String) {
    cdkBuilder.componentVersion(componentVersion)
  }

  public fun configurationUpdate(configurationUpdate: IResolvable) {
    cdkBuilder.configurationUpdate(configurationUpdate)
  }

  public
      fun configurationUpdate(configurationUpdate: CfnDeployment.ComponentConfigurationUpdateProperty) {
    cdkBuilder.configurationUpdate(configurationUpdate)
  }

  public fun runWith(runWith: IResolvable) {
    cdkBuilder.runWith(runWith)
  }

  public fun runWith(runWith: CfnDeployment.ComponentRunWithProperty) {
    cdkBuilder.runWith(runWith)
  }

  public fun build(): CfnDeployment.ComponentDeploymentSpecificationProperty = cdkBuilder.build()
}
