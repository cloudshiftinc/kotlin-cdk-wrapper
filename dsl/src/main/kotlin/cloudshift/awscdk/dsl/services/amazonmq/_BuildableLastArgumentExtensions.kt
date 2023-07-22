@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation

/**
 * A list of information about the configuration.
 */
public inline fun CfnBroker.setConfiguration(block: CfnBrokerConfigurationIdPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBrokerConfigurationIdPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}

/**
 * Encryption options for the broker.
 */
public inline
    fun CfnBroker.setEncryptionOptions(block: CfnBrokerEncryptionOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBrokerEncryptionOptionsPropertyDsl()
  builder.apply(block)
  return setEncryptionOptions(builder.build())
}

/**
 * Optional.
 */
public inline
    fun CfnBroker.setLdapServerMetadata(block: CfnBrokerLdapServerMetadataPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBrokerLdapServerMetadataPropertyDsl()
  builder.apply(block)
  return setLdapServerMetadata(builder.build())
}

/**
 * Enables Amazon CloudWatch logging for brokers.
 */
public inline fun CfnBroker.setLogs(block: CfnBrokerLogListPropertyDsl.() -> Unit = {}) {
  val builder = CfnBrokerLogListPropertyDsl()
  builder.apply(block)
  return setLogs(builder.build())
}

/**
 * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending updates
 * or patches to the broker.
 */
public inline
    fun CfnBroker.setMaintenanceWindowStartTime(block: CfnBrokerMaintenanceWindowPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBrokerMaintenanceWindowPropertyDsl()
  builder.apply(block)
  return setMaintenanceWindowStartTime(builder.build())
}

/**
 * The configuration to associate with a broker.
 */
public inline
    fun CfnConfigurationAssociation.setConfiguration(block: CfnConfigurationAssociationConfigurationIdPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationAssociationConfigurationIdPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}
