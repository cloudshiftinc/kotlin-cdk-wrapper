@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnCluster
import software.amazon.awscdk.services.redshift.CfnScheduledAction

public inline fun CfnCluster.setEndpoint(block: CfnClusterEndpointPropertyDsl.() -> Unit = {}) {
  val builder = CfnClusterEndpointPropertyDsl()
  builder.apply(block)
  return setEndpoint(builder.build())
}

public inline
    fun CfnCluster.setLoggingProperties(block: CfnClusterLoggingPropertiesPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterLoggingPropertiesPropertyDsl()
  builder.apply(block)
  return setLoggingProperties(builder.build())
}

public inline
    fun CfnScheduledAction.setTargetAction(block: CfnScheduledActionScheduledActionTypePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledActionScheduledActionTypePropertyDsl()
  builder.apply(block)
  return setTargetAction(builder.build())
}
