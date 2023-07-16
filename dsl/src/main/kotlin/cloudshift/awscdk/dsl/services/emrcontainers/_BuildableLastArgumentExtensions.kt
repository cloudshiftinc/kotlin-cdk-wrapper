@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

public inline fun CfnVirtualCluster.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVirtualCluster.setContainerProvider(block: CfnVirtualClusterContainerProviderPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVirtualClusterContainerProviderPropertyDsl()
  builder.apply(block)
  return setContainerProvider(builder.build())
}
