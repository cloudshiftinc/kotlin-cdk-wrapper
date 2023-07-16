@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.amazon.awscdk.services.cassandra.CfnTable

public inline fun CfnKeyspace.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnKeyspace.setReplicationSpecification(block: CfnKeyspaceReplicationSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnKeyspaceReplicationSpecificationPropertyDsl()
  builder.apply(block)
  return setReplicationSpecification(builder.build())
}

public inline fun CfnTable.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTable.setBillingMode(block: CfnTableBillingModePropertyDsl.() -> Unit = {}) {
  val builder = CfnTableBillingModePropertyDsl()
  builder.apply(block)
  return setBillingMode(builder.build())
}

public inline
    fun CfnTable.setEncryptionSpecification(block: CfnTableEncryptionSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTableEncryptionSpecificationPropertyDsl()
  builder.apply(block)
  return setEncryptionSpecification(builder.build())
}
