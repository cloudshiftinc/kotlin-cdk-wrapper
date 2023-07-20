@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceDataSyncDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceDataSync.Builder = CfnResourceDataSync.Builder.create(scope,
      id)

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  public fun bucketRegion(bucketRegion: String) {
    cdkBuilder.bucketRegion(bucketRegion)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun s3Destination(s3Destination: IResolvable) {
    cdkBuilder.s3Destination(s3Destination)
  }

  public fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty) {
    cdkBuilder.s3Destination(s3Destination)
  }

  public fun syncFormat(syncFormat: String) {
    cdkBuilder.syncFormat(syncFormat)
  }

  public fun syncName(syncName: String) {
    cdkBuilder.syncName(syncName)
  }

  public fun syncSource(syncSource: IResolvable) {
    cdkBuilder.syncSource(syncSource)
  }

  public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty) {
    cdkBuilder.syncSource(syncSource)
  }

  public fun syncType(syncType: String) {
    cdkBuilder.syncType(syncType)
  }

  public fun build(): CfnResourceDataSync = cdkBuilder.build()
}
