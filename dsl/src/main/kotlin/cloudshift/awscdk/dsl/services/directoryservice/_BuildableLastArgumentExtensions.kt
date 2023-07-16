@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.directoryservice

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD

public inline fun CfnMicrosoftAD.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnMicrosoftAD.setVpcSettings(block: CfnMicrosoftADVpcSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnMicrosoftADVpcSettingsPropertyDsl()
  builder.apply(block)
  return setVpcSettings(builder.build())
}

public inline fun CfnSimpleAD.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSimpleAD.setVpcSettings(block: CfnSimpleADVpcSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSimpleADVpcSettingsPropertyDsl()
  builder.apply(block)
  return setVpcSettings(builder.build())
}
