@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.transfer.CfnAgreement
import software.amazon.awscdk.services.transfer.CfnCertificate
import software.amazon.awscdk.services.transfer.CfnConnector
import software.amazon.awscdk.services.transfer.CfnProfile
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnUser
import software.amazon.awscdk.services.transfer.CfnWorkflow

public inline fun CfnAgreement.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCertificate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnConnector.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnServer.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

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

public inline fun CfnUser.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnUser.setPosixProfile(block: CfnUserPosixProfilePropertyDsl.() -> Unit = {}) {
  val builder = CfnUserPosixProfilePropertyDsl()
  builder.apply(block)
  return setPosixProfile(builder.build())
}

public inline fun CfnWorkflow.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
