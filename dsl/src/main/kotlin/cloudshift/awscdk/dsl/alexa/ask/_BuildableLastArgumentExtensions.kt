@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.alexa.ask.CfnSkill

public inline fun CfnSkill.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSkill.setAuthenticationConfiguration(block: CfnSkillAuthenticationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSkillAuthenticationConfigurationPropertyDsl()
  builder.apply(block)
  return setAuthenticationConfiguration(builder.build())
}

public inline fun CfnSkill.setSkillPackage(block: CfnSkillSkillPackagePropertyDsl.() -> Unit = {}) {
  val builder = CfnSkillSkillPackagePropertyDsl()
  builder.apply(block)
  return setSkillPackage(builder.build())
}
