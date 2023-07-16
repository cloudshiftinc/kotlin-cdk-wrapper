@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate

@CdkDslMarker
public class CfnCodeDeployLambdaAliasUpdateDsl {
  private val cdkBuilder: CfnCodeDeployLambdaAliasUpdate.Builder =
      CfnCodeDeployLambdaAliasUpdate.builder()

  public fun afterAllowTrafficHook(afterAllowTrafficHook: String) {
    cdkBuilder.afterAllowTrafficHook(afterAllowTrafficHook)
  }

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun beforeAllowTrafficHook(beforeAllowTrafficHook: String) {
    cdkBuilder.beforeAllowTrafficHook(beforeAllowTrafficHook)
  }

  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  public fun build(): CfnCodeDeployLambdaAliasUpdate = cdkBuilder.build()
}
