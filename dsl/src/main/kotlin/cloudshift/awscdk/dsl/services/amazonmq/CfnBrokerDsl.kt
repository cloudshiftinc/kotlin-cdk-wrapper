@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.constructs.Construct

@CdkDslMarker
public class CfnBrokerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBroker.Builder = CfnBroker.Builder.create(scope, id)

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnBroker.TagsEntryProperty> = mutableListOf()

  private val _users: MutableList<Any> = mutableListOf()

  public fun authenticationStrategy(authenticationStrategy: String) {
    cdkBuilder.authenticationStrategy(authenticationStrategy)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun brokerName(brokerName: String) {
    cdkBuilder.brokerName(brokerName)
  }

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun configuration(configuration: CfnBroker.ConfigurationIdProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun deploymentMode(deploymentMode: String) {
    cdkBuilder.deploymentMode(deploymentMode)
  }

  public fun encryptionOptions(encryptionOptions: IResolvable) {
    cdkBuilder.encryptionOptions(encryptionOptions)
  }

  public fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty) {
    cdkBuilder.encryptionOptions(encryptionOptions)
  }

  public fun engineType(engineType: String) {
    cdkBuilder.engineType(engineType)
  }

  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun hostInstanceType(hostInstanceType: String) {
    cdkBuilder.hostInstanceType(hostInstanceType)
  }

  public fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
    cdkBuilder.ldapServerMetadata(ldapServerMetadata)
  }

  public fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty) {
    cdkBuilder.ldapServerMetadata(ldapServerMetadata)
  }

  public fun logs(logs: IResolvable) {
    cdkBuilder.logs(logs)
  }

  public fun logs(logs: CfnBroker.LogListProperty) {
    cdkBuilder.logs(logs)
  }

  public fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
    cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime)
  }

  public
      fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty) {
    cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime)
  }

  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
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

  public fun tags(tags: CfnBrokerTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnBrokerTagsEntryPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnBroker.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  public fun users(vararg users: Any) {
    _users.addAll(listOf(*users))
  }

  public fun users(users: Collection<Any>) {
    _users.addAll(users)
  }

  public fun users(users: IResolvable) {
    cdkBuilder.users(users)
  }

  public fun build(): CfnBroker {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
