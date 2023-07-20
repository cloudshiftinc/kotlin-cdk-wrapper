@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnFileSystemProps

@CdkDslMarker
public class CfnFileSystemPropsDsl {
  private val cdkBuilder: CfnFileSystemProps.Builder = CfnFileSystemProps.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun backupId(backupId: String) {
    cdkBuilder.backupId(backupId)
  }

  public fun fileSystemType(fileSystemType: String) {
    cdkBuilder.fileSystemType(fileSystemType)
  }

  public fun fileSystemTypeVersion(fileSystemTypeVersion: String) {
    cdkBuilder.fileSystemTypeVersion(fileSystemTypeVersion)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun lustreConfiguration(lustreConfiguration: IResolvable) {
    cdkBuilder.lustreConfiguration(lustreConfiguration)
  }

  public fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty) {
    cdkBuilder.lustreConfiguration(lustreConfiguration)
  }

  public fun ontapConfiguration(ontapConfiguration: IResolvable) {
    cdkBuilder.ontapConfiguration(ontapConfiguration)
  }

  public fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty) {
    cdkBuilder.ontapConfiguration(ontapConfiguration)
  }

  public fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
    cdkBuilder.openZfsConfiguration(openZfsConfiguration)
  }

  public
      fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty) {
    cdkBuilder.openZfsConfiguration(openZfsConfiguration)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun storageCapacity(storageCapacity: Number) {
    cdkBuilder.storageCapacity(storageCapacity)
  }

  public fun storageType(storageType: String) {
    cdkBuilder.storageType(storageType)
  }

  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun windowsConfiguration(windowsConfiguration: IResolvable) {
    cdkBuilder.windowsConfiguration(windowsConfiguration)
  }

  public
      fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty) {
    cdkBuilder.windowsConfiguration(windowsConfiguration)
  }

  public fun build(): CfnFileSystemProps {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
