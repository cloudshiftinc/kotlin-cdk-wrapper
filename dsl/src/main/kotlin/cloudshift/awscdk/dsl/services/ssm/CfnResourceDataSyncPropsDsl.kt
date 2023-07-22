@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps

/**
 * Properties for defining a `CfnResourceDataSync`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * CfnResourceDataSyncProps cfnResourceDataSyncProps = CfnResourceDataSyncProps.builder()
 * .syncName("syncName")
 * // the properties below are optional
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .bucketRegion("bucketRegion")
 * .kmsKeyArn("kmsKeyArn")
 * .s3Destination(S3DestinationProperty.builder()
 * .bucketName("bucketName")
 * .bucketRegion("bucketRegion")
 * .syncFormat("syncFormat")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .syncFormat("syncFormat")
 * .syncSource(SyncSourceProperty.builder()
 * .sourceRegions(List.of("sourceRegions"))
 * .sourceType("sourceType")
 * // the properties below are optional
 * .awsOrganizationsSource(AwsOrganizationsSourceProperty.builder()
 * .organizationSourceType("organizationSourceType")
 * // the properties below are optional
 * .organizationalUnits(List.of("organizationalUnits"))
 * .build())
 * .includeFutureRegions(false)
 * .build())
 * .syncType("syncType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html)
 */
@CdkDslMarker
public class CfnResourceDataSyncPropsDsl {
  private val cdkBuilder: CfnResourceDataSyncProps.Builder = CfnResourceDataSyncProps.builder()

  /**
   * @param bucketName The name of the S3 bucket where the aggregated data is stored.
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix An Amazon S3 prefix for the bucket.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param bucketRegion The AWS Region with the S3 bucket targeted by the resource data sync.
   */
  public fun bucketRegion(bucketRegion: String) {
    cdkBuilder.bucketRegion(bucketRegion)
  }

  /**
   * @param kmsKeyArn The ARN of an encryption key for a destination in Amazon S3 .
   * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
   * exist in the same region as the destination Amazon S3 bucket.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param s3Destination Configuration information for the target S3 bucket.
   */
  public fun s3Destination(s3Destination: IResolvable) {
    cdkBuilder.s3Destination(s3Destination)
  }

  /**
   * @param s3Destination Configuration information for the target S3 bucket.
   */
  public fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty) {
    cdkBuilder.s3Destination(s3Destination)
  }

  /**
   * @param syncFormat A supported sync format.
   * The following format is currently supported: JsonSerDe
   */
  public fun syncFormat(syncFormat: String) {
    cdkBuilder.syncFormat(syncFormat)
  }

  /**
   * @param syncName A name for the resource data sync. 
   */
  public fun syncName(syncName: String) {
    cdkBuilder.syncName(syncName)
  }

  /**
   * @param syncSource Information about the source where the data was synchronized.
   */
  public fun syncSource(syncSource: IResolvable) {
    cdkBuilder.syncSource(syncSource)
  }

  /**
   * @param syncSource Information about the source where the data was synchronized.
   */
  public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty) {
    cdkBuilder.syncSource(syncSource)
  }

  /**
   * @param syncType The type of resource data sync.
   * If `SyncType` is `SyncToDestination` , then the resource data sync synchronizes data to an S3
   * bucket. If the `SyncType` is `SyncFromSource` then the resource data sync synchronizes data from
   * AWS Organizations or from multiple AWS Regions .
   */
  public fun syncType(syncType: String) {
    cdkBuilder.syncType(syncType)
  }

  public fun build(): CfnResourceDataSyncProps = cdkBuilder.build()
}
