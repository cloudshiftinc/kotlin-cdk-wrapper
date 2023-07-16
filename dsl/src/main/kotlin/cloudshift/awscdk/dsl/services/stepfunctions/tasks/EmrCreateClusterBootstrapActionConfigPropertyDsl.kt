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

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public
      fun scriptBootstrapAction(block: EmrCreateClusterScriptBootstrapActionConfigPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterScriptBootstrapActionConfigPropertyDsl()
    builder.apply(block)
    cdkBuilder.scriptBootstrapAction(builder.build())
  }

  public
      fun scriptBootstrapAction(scriptBootstrapAction: EmrCreateCluster.ScriptBootstrapActionConfigProperty) {
    cdkBuilder.scriptBootstrapAction(scriptBootstrapAction)
  }

  public fun build(): EmrCreateCluster.BootstrapActionConfigProperty = cdkBuilder.build()
}
