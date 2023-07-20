@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupDeploymentPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.DeploymentProperty.Builder =
      CfnDeploymentGroup.DeploymentProperty.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: Boolean) {
    cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures)
  }

  public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: IResolvable) {
    cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures)
  }

  public fun revision(revision: IResolvable) {
    cdkBuilder.revision(revision)
  }

  public fun revision(revision: CfnDeploymentGroup.RevisionLocationProperty) {
    cdkBuilder.revision(revision)
  }

  public fun build(): CfnDeploymentGroup.DeploymentProperty = cdkBuilder.build()
}
