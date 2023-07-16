@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.fms.CfnNotificationChannel
import software.amazon.awscdk.services.fms.CfnPolicy
import software.amazon.awscdk.services.fms.CfnResourceSet

public inline fun CfnNotificationChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPolicy.setExcludeMap(block: CfnPolicyIEMapPropertyDsl.() -> Unit = {}) {
  val builder = CfnPolicyIEMapPropertyDsl()
  builder.apply(block)
  return setExcludeMap(builder.build())
}

public inline fun CfnPolicy.setIncludeMap(block: CfnPolicyIEMapPropertyDsl.() -> Unit = {}) {
  val builder = CfnPolicyIEMapPropertyDsl()
  builder.apply(block)
  return setIncludeMap(builder.build())
}

public inline
    fun CfnPolicy.setSecurityServicePolicyData(block: CfnPolicySecurityServicePolicyDataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPolicySecurityServicePolicyDataPropertyDsl()
  builder.apply(block)
  return setSecurityServicePolicyData(builder.build())
}

public inline fun CfnResourceSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
