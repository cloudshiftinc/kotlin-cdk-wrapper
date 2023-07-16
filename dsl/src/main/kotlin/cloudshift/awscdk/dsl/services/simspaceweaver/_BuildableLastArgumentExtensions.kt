@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.simspaceweaver

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation

public inline fun CfnSimulation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSimulation.setSchemaS3Location(block: CfnSimulationS3LocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSimulationS3LocationPropertyDsl()
  builder.apply(block)
  return setSchemaS3Location(builder.build())
}

public inline
    fun CfnSimulation.setSnapshotS3Location(block: CfnSimulationS3LocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSimulationS3LocationPropertyDsl()
  builder.apply(block)
  return setSnapshotS3Location(builder.build())
}
