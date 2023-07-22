@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterBootstrapActionConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.BootstrapActionConfigProperty.Builder =
      EmrCreateCluster.BootstrapActionConfigProperty.builder()

  /**
   * @param name The name of the bootstrap action. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param scriptBootstrapAction The script run by the bootstrap action. 
   */
  public
      fun scriptBootstrapAction(scriptBootstrapAction: EmrCreateClusterScriptBootstrapActionConfigPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterScriptBootstrapActionConfigPropertyDsl()
    builder.apply(scriptBootstrapAction)
    cdkBuilder.scriptBootstrapAction(builder.build())
  }

  /**
   * @param scriptBootstrapAction The script run by the bootstrap action. 
   */
  public
      fun scriptBootstrapAction(scriptBootstrapAction: EmrCreateCluster.ScriptBootstrapActionConfigProperty) {
    cdkBuilder.scriptBootstrapAction(scriptBootstrapAction)
  }

  public fun build(): EmrCreateCluster.BootstrapActionConfigProperty = cdkBuilder.build()
}
