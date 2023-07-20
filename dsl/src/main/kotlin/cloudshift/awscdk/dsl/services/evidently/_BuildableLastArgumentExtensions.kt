@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnExperiment
import software.amazon.awscdk.services.evidently.CfnLaunch
import software.amazon.awscdk.services.evidently.CfnProject

public inline
    fun CfnLaunch.setExecutionStatus(block: CfnLaunchExecutionStatusObjectPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLaunchExecutionStatusObjectPropertyDsl()
  builder.apply(block)
  return setExecutionStatus(builder.build())
}

public inline
    fun CfnProject.setAppConfigResource(block: CfnProjectAppConfigResourceObjectPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnProjectAppConfigResourceObjectPropertyDsl()
  builder.apply(block)
  return setAppConfigResource(builder.build())
}

public inline
    fun CfnProject.setDataDelivery(block: CfnProjectDataDeliveryObjectPropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectDataDeliveryObjectPropertyDsl()
  builder.apply(block)
  return setDataDelivery(builder.build())
}

public inline
    fun CfnExperiment.setOnlineAbConfig(block: CfnExperimentOnlineAbConfigObjectPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnExperimentOnlineAbConfigObjectPropertyDsl()
  builder.apply(block)
  return setOnlineAbConfig(builder.build())
}

public inline
    fun CfnExperiment.setRunningStatus(block: CfnExperimentRunningStatusObjectPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnExperimentRunningStatusObjectPropertyDsl()
  builder.apply(block)
  return setRunningStatus(builder.build())
}
