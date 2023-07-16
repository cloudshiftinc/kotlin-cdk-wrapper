@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemOntapConfigurationPropertyDsl {
  private val cdkBuilder: CfnFileSystem.OntapConfigurationProperty.Builder =
      CfnFileSystem.OntapConfigurationProperty.builder()

  private val _routeTableIds: MutableList<String> = mutableListOf()

  public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
    cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
  }

  public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
    cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
  }

  public fun deploymentType(deploymentType: String) {
    cdkBuilder.deploymentType(deploymentType)
  }

  public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
    cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
  }

  public
      fun diskIopsConfiguration(diskIopsConfiguration: CfnFileSystem.DiskIopsConfigurationProperty) {
    cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
  }

  public fun endpointIpAddressRange(endpointIpAddressRange: String) {
    cdkBuilder.endpointIpAddressRange(endpointIpAddressRange)
  }

  public fun fsxAdminPassword(fsxAdminPassword: String) {
    cdkBuilder.fsxAdminPassword(fsxAdminPassword)
  }

  public fun preferredSubnetId(preferredSubnetId: String) {
    cdkBuilder.preferredSubnetId(preferredSubnetId)
  }

  public fun routeTableIds(vararg routeTableIds: String) {
    _routeTableIds.addAll(listOf(*routeTableIds))
  }

  public fun routeTableIds(routeTableIds: Collection<String>) {
    _routeTableIds.addAll(routeTableIds)
  }

  public fun throughputCapacity(throughputCapacity: Number) {
    cdkBuilder.throughputCapacity(throughputCapacity)
  }

  public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
    cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
  }

  public fun build(): CfnFileSystem.OntapConfigurationProperty {
    if(_routeTableIds.isNotEmpty()) cdkBuilder.routeTableIds(_routeTableIds)
    return cdkBuilder.build()
  }
}
