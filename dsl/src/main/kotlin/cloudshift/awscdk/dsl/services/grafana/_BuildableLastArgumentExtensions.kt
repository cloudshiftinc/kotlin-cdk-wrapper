@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

public inline
    fun CfnWorkspace.setNetworkAccessControl(block: CfnWorkspaceNetworkAccessControlPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWorkspaceNetworkAccessControlPropertyDsl()
  builder.apply(block)
  return setNetworkAccessControl(builder.build())
}

public inline
    fun CfnWorkspace.setSamlConfiguration(block: CfnWorkspaceSamlConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWorkspaceSamlConfigurationPropertyDsl()
  builder.apply(block)
  return setSamlConfiguration(builder.build())
}

public inline
    fun CfnWorkspace.setVpcConfiguration(block: CfnWorkspaceVpcConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnWorkspaceVpcConfigurationPropertyDsl()
  builder.apply(block)
  return setVpcConfiguration(builder.build())
}
