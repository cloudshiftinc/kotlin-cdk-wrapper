@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation

public inline
    fun CfnConfigurationAssociation.setConfiguration(block: CfnConfigurationAssociationConfigurationIdPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationAssociationConfigurationIdPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
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
