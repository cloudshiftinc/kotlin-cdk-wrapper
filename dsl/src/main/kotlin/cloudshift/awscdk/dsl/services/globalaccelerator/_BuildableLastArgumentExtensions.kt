@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.CfnAccelerator
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
import software.amazon.awscdk.services.globalaccelerator.CfnListener
import software.amazon.awscdk.services.globalaccelerator.EndpointGroup
import software.amazon.awscdk.services.globalaccelerator.Listener

public inline fun Accelerator.addListener(arg0: String, block: ListenerOptionsDsl.() -> Unit = {}):
    Listener {
  val builder = ListenerOptionsDsl()
  builder.apply(block)
  return addListener(arg0,builder.build())
}

public inline fun CfnAccelerator.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEndpointGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnListener.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun Listener.addEndpointGroup(arg0: String, block: EndpointGroupOptionsDsl.() -> Unit
    = {}): EndpointGroup {
  val builder = EndpointGroupOptionsDsl()
  builder.apply(block)
  return addEndpointGroup(arg0,builder.build())
}
