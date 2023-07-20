@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.aps

import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnWorkspace

public inline
    fun CfnWorkspace.setLoggingConfiguration(block: CfnWorkspaceLoggingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWorkspaceLoggingConfigurationPropertyDsl()
  builder.apply(block)
  return setLoggingConfiguration(builder.build())
}
