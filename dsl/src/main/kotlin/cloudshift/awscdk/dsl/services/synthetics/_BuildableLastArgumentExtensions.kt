@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.synthetics.CfnCanary
import software.amazon.awscdk.services.synthetics.CfnGroup

public inline fun CfnCanary.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCanary.setArtifactConfig(block: CfnCanaryArtifactConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCanaryArtifactConfigPropertyDsl()
  builder.apply(block)
  return setArtifactConfig(builder.build())
}

public inline fun CfnCanary.setCode(block: CfnCanaryCodePropertyDsl.() -> Unit = {}) {
  val builder = CfnCanaryCodePropertyDsl()
  builder.apply(block)
  return setCode(builder.build())
}

public inline fun CfnCanary.setRunConfig(block: CfnCanaryRunConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnCanaryRunConfigPropertyDsl()
  builder.apply(block)
  return setRunConfig(builder.build())
}

public inline fun CfnCanary.setSchedule(block: CfnCanarySchedulePropertyDsl.() -> Unit = {}) {
  val builder = CfnCanarySchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}

public inline fun CfnCanary.setVisualReference(block: CfnCanaryVisualReferencePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCanaryVisualReferencePropertyDsl()
  builder.apply(block)
  return setVisualReference(builder.build())
}

public inline fun CfnCanary.setVpcConfig(block: CfnCanaryVPCConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnCanaryVPCConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline fun CfnGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
