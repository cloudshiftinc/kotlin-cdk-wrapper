@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devicefarm

import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnProject
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject

public inline fun CfnProject.setVpcConfig(block: CfnProjectVpcConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline
    fun CfnTestGridProject.setVpcConfig(block: CfnTestGridProjectVpcConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTestGridProjectVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}
