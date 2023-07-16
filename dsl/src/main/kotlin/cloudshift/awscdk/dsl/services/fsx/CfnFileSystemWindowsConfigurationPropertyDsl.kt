@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemWindowsConfigurationPropertyDsl {
  private val cdkBuilder: CfnFileSystem.WindowsConfigurationProperty.Builder =
      CfnFileSystem.WindowsConfigurationProperty.builder()

  private val _aliases: MutableList<String> = mutableListOf()

  public fun activeDirectoryId(activeDirectoryId: String) {
    cdkBuilder.activeDirectoryId(activeDirectoryId)
  }

  public fun aliases(vararg aliases: String) {
    _aliases.addAll(listOf(*aliases))
  }

  public fun aliases(aliases: Collection<String>) {
    _aliases.addAll(aliases)
  }

  public fun auditLogConfiguration(auditLogConfiguration: IResolvable) {
    cdkBuilder.auditLogConfiguration(auditLogConfiguration)
  }

  public
      fun auditLogConfiguration(auditLogConfiguration: CfnFileSystem.AuditLogConfigurationProperty) {
    cdkBuilder.auditLogConfiguration(auditLogConfiguration)
  }

  public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
    cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
  }

  public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
    cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
  }

  public fun deploymentType(deploymentType: String) {
    cdkBuilder.deploymentType(deploymentType)
  }

  public fun preferredSubnetId(preferredSubnetId: String) {
    cdkBuilder.preferredSubnetId(preferredSubnetId)
  }

  public
      fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable) {
    cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
  }

  public
      fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty) {
    cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
  }

  public fun throughputCapacity(throughputCapacity: Number) {
    cdkBuilder.throughputCapacity(throughputCapacity)
  }

  public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
    cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
  }

  public fun build(): CfnFileSystem.WindowsConfigurationProperty {
    if(_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
    return cdkBuilder.build()
  }
}
