@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupWorkGroupConfigurationUpdatesPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder =
      CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.builder()

  public fun additionalConfiguration(additionalConfiguration: String) {
    cdkBuilder.additionalConfiguration(additionalConfiguration)
  }

  public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
    cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
  }

  public
      fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
    cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
  }

  public
      fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty) {
    cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
  }

  public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
    cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
  }

  public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
    cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
  }

  public fun engineVersion(engineVersion: IResolvable) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun engineVersion(engineVersion: CfnWorkGroup.EngineVersionProperty) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun executionRole(executionRole: String) {
    cdkBuilder.executionRole(executionRole)
  }

  public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
    cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
  }

  public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
    cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
  }

  public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: Boolean) {
    cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery)
  }

  public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: IResolvable) {
    cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery)
  }

  public
      fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: Boolean) {
    cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration)
  }

  public
      fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: IResolvable) {
    cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration)
  }

  public fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
    cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
  }

  public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
    cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
  }

  public fun resultConfigurationUpdates(resultConfigurationUpdates: IResolvable) {
    cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates)
  }

  public
      fun resultConfigurationUpdates(resultConfigurationUpdates: CfnWorkGroup.ResultConfigurationUpdatesProperty) {
    cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates)
  }

  public fun build(): CfnWorkGroup.WorkGroupConfigurationUpdatesProperty = cdkBuilder.build()
}
