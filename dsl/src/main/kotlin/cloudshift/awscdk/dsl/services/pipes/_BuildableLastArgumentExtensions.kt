@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.pipes.CfnPipe

public inline fun CfnPipe.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPipe.setEnrichmentParameters(block: CfnPipePipeEnrichmentParametersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPipePipeEnrichmentParametersPropertyDsl()
  builder.apply(block)
  return setEnrichmentParameters(builder.build())
}

public inline
    fun CfnPipe.setSourceParameters(block: CfnPipePipeSourceParametersPropertyDsl.() -> Unit = {}) {
  val builder = CfnPipePipeSourceParametersPropertyDsl()
  builder.apply(block)
  return setSourceParameters(builder.build())
}

public inline
    fun CfnPipe.setTargetParameters(block: CfnPipePipeTargetParametersPropertyDsl.() -> Unit = {}) {
  val builder = CfnPipePipeTargetParametersPropertyDsl()
  builder.apply(block)
  return setTargetParameters(builder.build())
}
