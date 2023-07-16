@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterBootstrapActionConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.BootstrapActionConfigProperty.Builder =
      CfnCluster.BootstrapActionConfigProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun scriptBootstrapAction(scriptBootstrapAction: IResolvable) {
    cdkBuilder.scriptBootstrapAction(scriptBootstrapAction)
  }

  public
      fun scriptBootstrapAction(scriptBootstrapAction: CfnCluster.ScriptBootstrapActionConfigProperty) {
    cdkBuilder.scriptBootstrapAction(scriptBootstrapAction)
  }

  public fun build(): CfnCluster.BootstrapActionConfigProperty = cdkBuilder.build()
}
