@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.constructs.Construct

/**
 * The `AWS::SSM::ResourceDataSync` resource creates, updates, or deletes a resource data sync for
 * AWS Systems Manager .
 *
 * A resource data sync helps you view data from multiple sources in a single location. Systems
 * Manager offers two types of resource data sync: `SyncToDestination` and `SyncFromSource` .
 *
 * You can configure Systems Manager Inventory to use the `SyncToDestination` type to synchronize
 * Inventory data from multiple AWS Regions to a single Amazon S3 bucket.
 *
 * You can configure Systems Manager Explorer to use the `SyncFromSource` type to synchronize
 * operational work items (OpsItems) and operational data (OpsData) from multiple AWS Regions . This
 * type can synchronize OpsItems and OpsData from multiple AWS accounts and Regions or from an
 * `EntireOrganization` by using AWS Organizations .
 *
 * A resource data sync is an asynchronous operation that returns immediately. After a successful
 * initial sync is completed, the system continuously syncs data.
 *
 * By default, data is not encrypted in Amazon S3 . We strongly recommend that you enable encryption
 * in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon
 * S3 bucket by creating a restrictive bucket policy.
 *
 * For more information, see [Configuring Inventory
 * Collection](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-configuring.html#sysman-inventory-datasync)
 * and [Setting Up Systems Manager Explorer to Display Data from Multiple Accounts and
 * Regions](https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html)
 * in the *AWS Systems Manager User Guide* .
 *
 * Important: The following *Syntax* section shows all fields that are supported for a resource data
 * sync. The *Examples* section below shows the recommended way to specify configurations for each sync
 * type. Please see the *Examples* section when you create your resource data sync.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * CfnResourceDataSync cfnResourceDataSync = CfnResourceDataSync.Builder.create(this,
 * "MyCfnResourceDataSync")
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
public class CfnResourceDataSyncDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceDataSync.Builder = CfnResourceDataSync.Builder.create(scope,
      id)

  /**
   * The name of the S3 bucket where the aggregated data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
   * @param bucketName The name of the S3 bucket where the aggregated data is stored. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * An Amazon S3 prefix for the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
   * @param bucketPrefix An Amazon S3 prefix for the bucket. 
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * The AWS Region with the S3 bucket targeted by the resource data sync.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
   * @param bucketRegion The AWS Region with the S3 bucket targeted by the resource data sync. 
   */
  public fun bucketRegion(bucketRegion: String) {
    cdkBuilder.bucketRegion(bucketRegion)
  }

  /**
   * The ARN of an encryption key for a destination in Amazon S3 .
   *
   * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
   * exist in the same region as the destination Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
   * @param kmsKeyArn The ARN of an encryption key for a destination in Amazon S3 . 
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * Configuration information for the target S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
   * @param s3Destination Configuration information for the target S3 bucket. 
   */
  public fun s3Destination(s3Destination: IResolvable) {
    cdkBuilder.s3Destination(s3Destination)
  }

  /**
   * Configuration information for the target S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
   * @param s3Destination Configuration information for the target S3 bucket. 
   */
  public fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty) {
    cdkBuilder.s3Destination(s3Destination)
  }

  /**
   * A supported sync format.
   *
   * The following format is currently supported: JsonSerDe
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
   * @param syncFormat A supported sync format. 
   */
  public fun syncFormat(syncFormat: String) {
    cdkBuilder.syncFormat(syncFormat)
  }

  /**
   * A name for the resource data sync.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
   * @param syncName A name for the resource data sync. 
   */
  public fun syncName(syncName: String) {
    cdkBuilder.syncName(syncName)
  }

  /**
   * Information about the source where the data was synchronized.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
   * @param syncSource Information about the source where the data was synchronized. 
   */
  public fun syncSource(syncSource: IResolvable) {
    cdkBuilder.syncSource(syncSource)
  }

  /**
   * Information about the source where the data was synchronized.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
   * @param syncSource Information about the source where the data was synchronized. 
   */
  public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty) {
    cdkBuilder.syncSource(syncSource)
  }

  /**
   * The type of resource data sync.
   *
   * If `SyncType` is `SyncToDestination` , then the resource data sync synchronizes data to an S3
   * bucket. If the `SyncType` is `SyncFromSource` then the resource data sync synchronizes data from
   * AWS Organizations or from multiple AWS Regions .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-synctype)
   * @param syncType The type of resource data sync. 
   */
  public fun syncType(syncType: String) {
    cdkBuilder.syncType(syncType)
  }

  public fun build(): CfnResourceDataSync = cdkBuilder.build()
}
