@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.robomaker.CfnFleet
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion

public inline fun CfnFleet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRobot.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRobotApplication.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnRobotApplication.setRobotSoftwareSuite(block: CfnRobotApplicationRobotSoftwareSuitePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRobotApplicationRobotSoftwareSuitePropertyDsl()
  builder.apply(block)
  return setRobotSoftwareSuite(builder.build())
}

public inline fun CfnRobotApplicationVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSimulationApplication.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSimulationApplication.setRenderingEngine(block: CfnSimulationApplicationRenderingEnginePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSimulationApplicationRenderingEnginePropertyDsl()
  builder.apply(block)
  return setRenderingEngine(builder.build())
}

public inline
    fun CfnSimulationApplication.setRobotSoftwareSuite(block: CfnSimulationApplicationRobotSoftwareSuitePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSimulationApplicationRobotSoftwareSuitePropertyDsl()
  builder.apply(block)
  return setRobotSoftwareSuite(builder.build())
}

public inline
    fun CfnSimulationApplication.setSimulationSoftwareSuite(block: CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl()
  builder.apply(block)
  return setSimulationSoftwareSuite(builder.build())
}

public inline fun CfnSimulationApplicationVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
