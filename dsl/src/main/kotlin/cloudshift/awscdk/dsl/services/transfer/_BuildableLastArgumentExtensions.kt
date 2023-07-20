@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnUser

public inline fun CfnServer.setEndpointDetails(block: CfnServerEndpointDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServerEndpointDetailsPropertyDsl()
  builder.apply(block)
  return setEndpointDetails(builder.build())
}

public inline
    fun CfnServer.setIdentityProviderDetails(block: CfnServerIdentityProviderDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServerIdentityProviderDetailsPropertyDsl()
  builder.apply(block)
  return setIdentityProviderDetails(builder.build())
}

public inline fun CfnServer.setProtocolDetails(block: CfnServerProtocolDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServerProtocolDetailsPropertyDsl()
  builder.apply(block)
  return setProtocolDetails(builder.build())
}

public inline fun CfnServer.setWorkflowDetails(block: CfnServerWorkflowDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServerWorkflowDetailsPropertyDsl()
  builder.apply(block)
  return setWorkflowDetails(builder.build())
}

public inline fun CfnUser.setPosixProfile(block: CfnUserPosixProfilePropertyDsl.() -> Unit = {}) {
  val builder = CfnUserPosixProfilePropertyDsl()
  builder.apply(block)
  return setPosixProfile(builder.build())
}
