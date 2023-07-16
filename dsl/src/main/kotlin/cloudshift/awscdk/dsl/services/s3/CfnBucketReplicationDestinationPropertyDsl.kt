@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketReplicationDestinationPropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationDestinationProperty.Builder =
      CfnBucket.ReplicationDestinationProperty.builder()

  public fun accessControlTranslation(accessControlTranslation: IResolvable) {
    cdkBuilder.accessControlTranslation(accessControlTranslation)
  }

  public
      fun accessControlTranslation(accessControlTranslation: CfnBucket.AccessControlTranslationProperty) {
    cdkBuilder.accessControlTranslation(accessControlTranslation)
  }

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public
      fun encryptionConfiguration(encryptionConfiguration: CfnBucket.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public fun metrics(metrics: IResolvable) {
    cdkBuilder.metrics(metrics)
  }

  public fun metrics(metrics: CfnBucket.MetricsProperty) {
    cdkBuilder.metrics(metrics)
  }

  public fun replicationTime(replicationTime: IResolvable) {
    cdkBuilder.replicationTime(replicationTime)
  }

  public fun replicationTime(replicationTime: CfnBucket.ReplicationTimeProperty) {
    cdkBuilder.replicationTime(replicationTime)
  }

  public fun storageClass(storageClass: String) {
    cdkBuilder.storageClass(storageClass)
  }

  public fun build(): CfnBucket.ReplicationDestinationProperty = cdkBuilder.build()
}
