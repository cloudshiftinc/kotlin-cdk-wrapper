@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.lambda.layer.node.proxy.agent

import cloudshift.awscdk.dsl.services.lambda.LayerVersionPermissionDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer

public inline fun NodeProxyAgentLayer.addPermission(arg0: String,
    block: LayerVersionPermissionDsl.() -> Unit = {}) {
  val builder = LayerVersionPermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}
