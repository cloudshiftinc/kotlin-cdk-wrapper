@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

public inline fun CfnExperimentTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnExperimentTemplate.setLogConfiguration(block: CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl()
  builder.apply(block)
  return setLogConfiguration(builder.build())
}
