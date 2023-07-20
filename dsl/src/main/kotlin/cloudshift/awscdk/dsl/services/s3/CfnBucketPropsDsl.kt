@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnBucketProps

@CdkDslMarker
public class CfnBucketPropsDsl {
  private val cdkBuilder: CfnBucketProps.Builder = CfnBucketProps.builder()

  private val _analyticsConfigurations: MutableList<Any> = mutableListOf()

  private val _intelligentTieringConfigurations: MutableList<Any> = mutableListOf()

  private val _inventoryConfigurations: MutableList<Any> = mutableListOf()

  private val _metricsConfigurations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accelerateConfiguration(accelerateConfiguration: IResolvable) {
    cdkBuilder.accelerateConfiguration(accelerateConfiguration)
  }

  public
      fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty) {
    cdkBuilder.accelerateConfiguration(accelerateConfiguration)
  }

  public fun accessControl(accessControl: String) {
    cdkBuilder.accessControl(accessControl)
  }

  public fun analyticsConfigurations(vararg analyticsConfigurations: Any) {
    _analyticsConfigurations.addAll(listOf(*analyticsConfigurations))
  }

  public fun analyticsConfigurations(analyticsConfigurations: Collection<Any>) {
    _analyticsConfigurations.addAll(analyticsConfigurations)
  }

  public fun analyticsConfigurations(analyticsConfigurations: IResolvable) {
    cdkBuilder.analyticsConfigurations(analyticsConfigurations)
  }

  public fun bucketEncryption(bucketEncryption: IResolvable) {
    cdkBuilder.bucketEncryption(bucketEncryption)
  }

  public fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty) {
    cdkBuilder.bucketEncryption(bucketEncryption)
  }

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun corsConfiguration(corsConfiguration: IResolvable) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  public fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  public fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any) {
    _intelligentTieringConfigurations.addAll(listOf(*intelligentTieringConfigurations))
  }

  public fun intelligentTieringConfigurations(intelligentTieringConfigurations: Collection<Any>) {
    _intelligentTieringConfigurations.addAll(intelligentTieringConfigurations)
  }

  public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable) {
    cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations)
  }

  public fun inventoryConfigurations(vararg inventoryConfigurations: Any) {
    _inventoryConfigurations.addAll(listOf(*inventoryConfigurations))
  }

  public fun inventoryConfigurations(inventoryConfigurations: Collection<Any>) {
    _inventoryConfigurations.addAll(inventoryConfigurations)
  }

  public fun inventoryConfigurations(inventoryConfigurations: IResolvable) {
    cdkBuilder.inventoryConfigurations(inventoryConfigurations)
  }

  public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
    cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
  }

  public
      fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty) {
    cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
  }

  public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public fun metricsConfigurations(vararg metricsConfigurations: Any) {
    _metricsConfigurations.addAll(listOf(*metricsConfigurations))
  }

  public fun metricsConfigurations(metricsConfigurations: Collection<Any>) {
    _metricsConfigurations.addAll(metricsConfigurations)
  }

  public fun metricsConfigurations(metricsConfigurations: IResolvable) {
    cdkBuilder.metricsConfigurations(metricsConfigurations)
  }

  public fun notificationConfiguration(notificationConfiguration: IResolvable) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

  public
      fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

  public fun objectLockConfiguration(objectLockConfiguration: IResolvable) {
    cdkBuilder.objectLockConfiguration(objectLockConfiguration)
  }

  public
      fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty) {
    cdkBuilder.objectLockConfiguration(objectLockConfiguration)
  }

  public fun objectLockEnabled(objectLockEnabled: Boolean) {
    cdkBuilder.objectLockEnabled(objectLockEnabled)
  }

  public fun objectLockEnabled(objectLockEnabled: IResolvable) {
    cdkBuilder.objectLockEnabled(objectLockEnabled)
  }

  public fun ownershipControls(ownershipControls: IResolvable) {
    cdkBuilder.ownershipControls(ownershipControls)
  }

  public fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty) {
    cdkBuilder.ownershipControls(ownershipControls)
  }

  public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
    cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
  }

  public
      fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty) {
    cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
  }

  public fun replicationConfiguration(replicationConfiguration: IResolvable) {
    cdkBuilder.replicationConfiguration(replicationConfiguration)
  }

  public
      fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty) {
    cdkBuilder.replicationConfiguration(replicationConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun versioningConfiguration(versioningConfiguration: IResolvable) {
    cdkBuilder.versioningConfiguration(versioningConfiguration)
  }

  public
      fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty) {
    cdkBuilder.versioningConfiguration(versioningConfiguration)
  }

  public fun websiteConfiguration(websiteConfiguration: IResolvable) {
    cdkBuilder.websiteConfiguration(websiteConfiguration)
  }

  public fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty) {
    cdkBuilder.websiteConfiguration(websiteConfiguration)
  }

  public fun build(): CfnBucketProps {
    if(_analyticsConfigurations.isNotEmpty())
        cdkBuilder.analyticsConfigurations(_analyticsConfigurations)
    if(_intelligentTieringConfigurations.isNotEmpty())
        cdkBuilder.intelligentTieringConfigurations(_intelligentTieringConfigurations)
    if(_inventoryConfigurations.isNotEmpty())
        cdkBuilder.inventoryConfigurations(_inventoryConfigurations)
    if(_metricsConfigurations.isNotEmpty()) cdkBuilder.metricsConfigurations(_metricsConfigurations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
