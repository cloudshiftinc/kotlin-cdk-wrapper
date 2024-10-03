@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnResourceDataSync`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
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
public interface CfnResourceDataSyncProps {
  /**
   * The name of the S3 bucket where the aggregated data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * An Amazon S3 prefix for the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
   */
  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  /**
   * The AWS Region with the S3 bucket targeted by the resource data sync.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
   */
  public fun bucketRegion(): String? = unwrap(this).getBucketRegion()

  /**
   * The Amazon Resource Name (ARN) of an encryption key for a destination in Amazon S3 .
   *
   * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
   * exist in the same AWS Region as the destination Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * Configuration information for the target S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
   */
  public fun s3Destination(): Any? = unwrap(this).getS3Destination()

  /**
   * A supported sync format.
   *
   * The following format is currently supported: JsonSerDe
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
   */
  public fun syncFormat(): String? = unwrap(this).getSyncFormat()

  /**
   * A name for the resource data sync.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
   */
  public fun syncName(): String

  /**
   * Information about the source where the data was synchronized.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
   */
  public fun syncSource(): Any? = unwrap(this).getSyncSource()

  /**
   * The type of resource data sync.
   *
   * If `SyncType` is `SyncToDestination` , then the resource data sync synchronizes data to an S3
   * bucket. If the `SyncType` is `SyncFromSource` then the resource data sync synchronizes data from
   * AWS Organizations or from multiple AWS Regions .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-synctype)
   */
  public fun syncType(): String? = unwrap(this).getSyncType()

  /**
   * A builder for [CfnResourceDataSyncProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName The name of the S3 bucket where the aggregated data is stored.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param bucketPrefix An Amazon S3 prefix for the bucket.
     */
    public fun bucketPrefix(bucketPrefix: String)

    /**
     * @param bucketRegion The AWS Region with the S3 bucket targeted by the resource data sync.
     */
    public fun bucketRegion(bucketRegion: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of an encryption key for a destination in
     * Amazon S3 .
     * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
     * exist in the same AWS Region as the destination Amazon S3 bucket.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param s3Destination Configuration information for the target S3 bucket.
     */
    public fun s3Destination(s3Destination: IResolvable)

    /**
     * @param s3Destination Configuration information for the target S3 bucket.
     */
    public fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty)

    /**
     * @param s3Destination Configuration information for the target S3 bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7552ab8a7fe08243c488d378cf9c819e6c90971e4ea849a36200de1164446aa2")
    public
        fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty.Builder.() -> Unit)

    /**
     * @param syncFormat A supported sync format.
     * The following format is currently supported: JsonSerDe
     */
    public fun syncFormat(syncFormat: String)

    /**
     * @param syncName A name for the resource data sync. 
     */
    public fun syncName(syncName: String)

    /**
     * @param syncSource Information about the source where the data was synchronized.
     */
    public fun syncSource(syncSource: IResolvable)

    /**
     * @param syncSource Information about the source where the data was synchronized.
     */
    public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty)

    /**
     * @param syncSource Information about the source where the data was synchronized.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffe484ae1dfc69db267d415ae122618d657352e806e838efddea605927310215")
    public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty.Builder.() -> Unit)

    /**
     * @param syncType The type of resource data sync.
     * If `SyncType` is `SyncToDestination` , then the resource data sync synchronizes data to an S3
     * bucket. If the `SyncType` is `SyncFromSource` then the resource data sync synchronizes data from
     * AWS Organizations or from multiple AWS Regions .
     */
    public fun syncType(syncType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps.Builder =
        software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps.builder()

    /**
     * @param bucketName The name of the S3 bucket where the aggregated data is stored.
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketPrefix An Amazon S3 prefix for the bucket.
     */
    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param bucketRegion The AWS Region with the S3 bucket targeted by the resource data sync.
     */
    override fun bucketRegion(bucketRegion: String) {
      cdkBuilder.bucketRegion(bucketRegion)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of an encryption key for a destination in
     * Amazon S3 .
     * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
     * exist in the same AWS Region as the destination Amazon S3 bucket.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param s3Destination Configuration information for the target S3 bucket.
     */
    override fun s3Destination(s3Destination: IResolvable) {
      cdkBuilder.s3Destination(s3Destination.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param s3Destination Configuration information for the target S3 bucket.
     */
    override fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty) {
      cdkBuilder.s3Destination(s3Destination.let(CfnResourceDataSync.S3DestinationProperty.Companion::unwrap))
    }

    /**
     * @param s3Destination Configuration information for the target S3 bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7552ab8a7fe08243c488d378cf9c819e6c90971e4ea849a36200de1164446aa2")
    override
        fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty.Builder.() -> Unit):
        Unit = s3Destination(CfnResourceDataSync.S3DestinationProperty(s3Destination))

    /**
     * @param syncFormat A supported sync format.
     * The following format is currently supported: JsonSerDe
     */
    override fun syncFormat(syncFormat: String) {
      cdkBuilder.syncFormat(syncFormat)
    }

    /**
     * @param syncName A name for the resource data sync. 
     */
    override fun syncName(syncName: String) {
      cdkBuilder.syncName(syncName)
    }

    /**
     * @param syncSource Information about the source where the data was synchronized.
     */
    override fun syncSource(syncSource: IResolvable) {
      cdkBuilder.syncSource(syncSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param syncSource Information about the source where the data was synchronized.
     */
    override fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty) {
      cdkBuilder.syncSource(syncSource.let(CfnResourceDataSync.SyncSourceProperty.Companion::unwrap))
    }

    /**
     * @param syncSource Information about the source where the data was synchronized.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffe484ae1dfc69db267d415ae122618d657352e806e838efddea605927310215")
    override fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty.Builder.() -> Unit):
        Unit = syncSource(CfnResourceDataSync.SyncSourceProperty(syncSource))

    /**
     * @param syncType The type of resource data sync.
     * If `SyncType` is `SyncToDestination` , then the resource data sync synchronizes data to an S3
     * bucket. If the `SyncType` is `SyncFromSource` then the resource data sync synchronizes data from
     * AWS Organizations or from multiple AWS Regions .
     */
    override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps,
  ) : CdkObject(cdkObject),
      CfnResourceDataSyncProps {
    /**
     * The name of the S3 bucket where the aggregated data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * An Amazon S3 prefix for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
     */
    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The AWS Region with the S3 bucket targeted by the resource data sync.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
     */
    override fun bucketRegion(): String? = unwrap(this).getBucketRegion()

    /**
     * The Amazon Resource Name (ARN) of an encryption key for a destination in Amazon S3 .
     *
     * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
     * exist in the same AWS Region as the destination Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * Configuration information for the target S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
     */
    override fun s3Destination(): Any? = unwrap(this).getS3Destination()

    /**
     * A supported sync format.
     *
     * The following format is currently supported: JsonSerDe
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
     */
    override fun syncFormat(): String? = unwrap(this).getSyncFormat()

    /**
     * A name for the resource data sync.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
     */
    override fun syncName(): String = unwrap(this).getSyncName()

    /**
     * Information about the source where the data was synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
     */
    override fun syncSource(): Any? = unwrap(this).getSyncSource()

    /**
     * The type of resource data sync.
     *
     * If `SyncType` is `SyncToDestination` , then the resource data sync synchronizes data to an S3
     * bucket. If the `SyncType` is `SyncFromSource` then the resource data sync synchronizes data from
     * AWS Organizations or from multiple AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-synctype)
     */
    override fun syncType(): String? = unwrap(this).getSyncType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDataSyncProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps):
        CfnResourceDataSyncProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourceDataSyncProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDataSyncProps):
        software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
  }
}
