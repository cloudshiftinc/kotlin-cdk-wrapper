@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnConfiguration
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation

public inline fun CfnBroker.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnBroker.setConfiguration(block: CfnBrokerConfigurationIdPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBrokerConfigurationIdPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}

public inline
    fun CfnBroker.setEncryptionOptions(block: CfnBrokerEncryptionOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBrokerEncryptionOptionsPropertyDsl()
  builder.apply(block)
  return setEncryptionOptions(builder.build())
}

public inline
    fun CfnBroker.setLdapServerMetadata(block: CfnBrokerLdapServerMetadataPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBrokerLdapServerMetadataPropertyDsl()
  builder.apply(block)
  return setLdapServerMetadata(builder.build())
}

public inline fun CfnBroker.setLogs(block: CfnBrokerLogListPropertyDsl.() -> Unit = {}) {
  val builder = CfnBrokerLogListPropertyDsl()
  builder.apply(block)
  return setLogs(builder.build())
}

public inline
    fun CfnBroker.setMaintenanceWindowStartTime(block: CfnBrokerMaintenanceWindowPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBrokerMaintenanceWindowPropertyDsl()
  builder.apply(block)
  return setMaintenanceWindowStartTime(builder.build())
}

public inline fun CfnConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnConfigurationAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConfigurationAssociation.setConfiguration(block: CfnConfigurationAssociationConfigurationIdPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationAssociationConfigurationIdPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}
