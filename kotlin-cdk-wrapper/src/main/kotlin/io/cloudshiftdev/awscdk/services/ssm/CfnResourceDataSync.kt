@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 *
 * The following *Syntax* section shows all fields that are supported for a resource data sync. The
 * *Examples* section below shows the recommended way to specify configurations for each sync type.
 * Refer to the *Examples* section when you create your resource data sync.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
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
public open class CfnResourceDataSync internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of the resource data sync.
   */
  public open fun attrSyncName(): String = unwrap(this).getAttrSyncName()

  /**
   * The name of the S3 bucket where the aggregated data is stored.
   */
  public open fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * The name of the S3 bucket where the aggregated data is stored.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  /**
   * An Amazon S3 prefix for the bucket.
   */
  public open fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  /**
   * An Amazon S3 prefix for the bucket.
   */
  public open fun bucketPrefix(`value`: String) {
    unwrap(this).setBucketPrefix(`value`)
  }

  /**
   * The AWS Region with the S3 bucket targeted by the resource data sync.
   */
  public open fun bucketRegion(): String? = unwrap(this).getBucketRegion()

  /**
   * The AWS Region with the S3 bucket targeted by the resource data sync.
   */
  public open fun bucketRegion(`value`: String) {
    unwrap(this).setBucketRegion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of an encryption key for a destination in Amazon S3 .
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of an encryption key for a destination in Amazon S3 .
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * Configuration information for the target S3 bucket.
   */
  public open fun s3Destination(): Any? = unwrap(this).getS3Destination()

  /**
   * Configuration information for the target S3 bucket.
   */
  public open fun s3Destination(`value`: IResolvable) {
    unwrap(this).setS3Destination(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information for the target S3 bucket.
   */
  public open fun s3Destination(`value`: S3DestinationProperty) {
    unwrap(this).setS3Destination(`value`.let(S3DestinationProperty::unwrap))
  }

  /**
   * Configuration information for the target S3 bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c432aa5a72a916d666940dd0f9f88e632981ae256c4848191f47b188b5a88af3")
  public open fun s3Destination(`value`: S3DestinationProperty.Builder.() -> Unit): Unit =
      s3Destination(S3DestinationProperty(`value`))

  /**
   * A supported sync format.
   */
  public open fun syncFormat(): String? = unwrap(this).getSyncFormat()

  /**
   * A supported sync format.
   */
  public open fun syncFormat(`value`: String) {
    unwrap(this).setSyncFormat(`value`)
  }

  /**
   *
   */
  public open fun syncName(): String = unwrap(this).getSyncName()

  /**
   *
   */
  public open fun syncName(`value`: String) {
    unwrap(this).setSyncName(`value`)
  }

  /**
   * Information about the source where the data was synchronized.
   */
  public open fun syncSource(): Any? = unwrap(this).getSyncSource()

  /**
   * Information about the source where the data was synchronized.
   */
  public open fun syncSource(`value`: IResolvable) {
    unwrap(this).setSyncSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the source where the data was synchronized.
   */
  public open fun syncSource(`value`: SyncSourceProperty) {
    unwrap(this).setSyncSource(`value`.let(SyncSourceProperty::unwrap))
  }

  /**
   * Information about the source where the data was synchronized.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f8e468ffa5c113c230b1ebfca5c85b16a5879409f1f5ba7068a0bda7d8190d3")
  public open fun syncSource(`value`: SyncSourceProperty.Builder.() -> Unit): Unit =
      syncSource(SyncSourceProperty(`value`))

  /**
   * The type of resource data sync.
   */
  public open fun syncType(): String? = unwrap(this).getSyncType()

  /**
   * The type of resource data sync.
   */
  public open fun syncType(`value`: String) {
    unwrap(this).setSyncType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnResourceDataSync].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the S3 bucket where the aggregated data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
     * @param bucketName The name of the S3 bucket where the aggregated data is stored. 
     */
    public fun bucketName(bucketName: String)

    /**
     * An Amazon S3 prefix for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
     * @param bucketPrefix An Amazon S3 prefix for the bucket. 
     */
    public fun bucketPrefix(bucketPrefix: String)

    /**
     * The AWS Region with the S3 bucket targeted by the resource data sync.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
     * @param bucketRegion The AWS Region with the S3 bucket targeted by the resource data sync. 
     */
    public fun bucketRegion(bucketRegion: String)

    /**
     * The Amazon Resource Name (ARN) of an encryption key for a destination in Amazon S3 .
     *
     * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
     * exist in the same AWS Region as the destination Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of an encryption key for a destination in
     * Amazon S3 . 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * Configuration information for the target S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
     * @param s3Destination Configuration information for the target S3 bucket. 
     */
    public fun s3Destination(s3Destination: IResolvable)

    /**
     * Configuration information for the target S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
     * @param s3Destination Configuration information for the target S3 bucket. 
     */
    public fun s3Destination(s3Destination: S3DestinationProperty)

    /**
     * Configuration information for the target S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
     * @param s3Destination Configuration information for the target S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c378387d02085c81c4b97cfbbed7f69a5025cddd7a2441d77d7d685cae1c0ed2")
    public fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit)

    /**
     * A supported sync format.
     *
     * The following format is currently supported: JsonSerDe
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
     * @param syncFormat A supported sync format. 
     */
    public fun syncFormat(syncFormat: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
     * @param syncName 
     */
    public fun syncName(syncName: String)

    /**
     * Information about the source where the data was synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
     * @param syncSource Information about the source where the data was synchronized. 
     */
    public fun syncSource(syncSource: IResolvable)

    /**
     * Information about the source where the data was synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
     * @param syncSource Information about the source where the data was synchronized. 
     */
    public fun syncSource(syncSource: SyncSourceProperty)

    /**
     * Information about the source where the data was synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
     * @param syncSource Information about the source where the data was synchronized. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e14b005fb825862d912ca43eb369a99982a83b0e4689af10cd3f1c5f5f71498")
    public fun syncSource(syncSource: SyncSourceProperty.Builder.() -> Unit)

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
    public fun syncType(syncType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnResourceDataSync.Builder =
        software.amazon.awscdk.services.ssm.CfnResourceDataSync.Builder.create(scope, id)

    /**
     * The name of the S3 bucket where the aggregated data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
     * @param bucketName The name of the S3 bucket where the aggregated data is stored. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * An Amazon S3 prefix for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
     * @param bucketPrefix An Amazon S3 prefix for the bucket. 
     */
    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * The AWS Region with the S3 bucket targeted by the resource data sync.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
     * @param bucketRegion The AWS Region with the S3 bucket targeted by the resource data sync. 
     */
    override fun bucketRegion(bucketRegion: String) {
      cdkBuilder.bucketRegion(bucketRegion)
    }

    /**
     * The Amazon Resource Name (ARN) of an encryption key for a destination in Amazon S3 .
     *
     * You can use a KMS key to encrypt inventory data in Amazon S3 . You must specify a key that
     * exist in the same AWS Region as the destination Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of an encryption key for a destination in
     * Amazon S3 . 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * Configuration information for the target S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
     * @param s3Destination Configuration information for the target S3 bucket. 
     */
    override fun s3Destination(s3Destination: IResolvable) {
      cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
    }

    /**
     * Configuration information for the target S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
     * @param s3Destination Configuration information for the target S3 bucket. 
     */
    override fun s3Destination(s3Destination: S3DestinationProperty) {
      cdkBuilder.s3Destination(s3Destination.let(S3DestinationProperty::unwrap))
    }

    /**
     * Configuration information for the target S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-s3destination)
     * @param s3Destination Configuration information for the target S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c378387d02085c81c4b97cfbbed7f69a5025cddd7a2441d77d7d685cae1c0ed2")
    override fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit): Unit =
        s3Destination(S3DestinationProperty(s3Destination))

    /**
     * A supported sync format.
     *
     * The following format is currently supported: JsonSerDe
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
     * @param syncFormat A supported sync format. 
     */
    override fun syncFormat(syncFormat: String) {
      cdkBuilder.syncFormat(syncFormat)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
     * @param syncName 
     */
    override fun syncName(syncName: String) {
      cdkBuilder.syncName(syncName)
    }

    /**
     * Information about the source where the data was synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
     * @param syncSource Information about the source where the data was synchronized. 
     */
    override fun syncSource(syncSource: IResolvable) {
      cdkBuilder.syncSource(syncSource.let(IResolvable::unwrap))
    }

    /**
     * Information about the source where the data was synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
     * @param syncSource Information about the source where the data was synchronized. 
     */
    override fun syncSource(syncSource: SyncSourceProperty) {
      cdkBuilder.syncSource(syncSource.let(SyncSourceProperty::unwrap))
    }

    /**
     * Information about the source where the data was synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncsource)
     * @param syncSource Information about the source where the data was synchronized. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e14b005fb825862d912ca43eb369a99982a83b0e4689af10cd3f1c5f5f71498")
    override fun syncSource(syncSource: SyncSourceProperty.Builder.() -> Unit): Unit =
        syncSource(SyncSourceProperty(syncSource))

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
    override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnResourceDataSync = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnResourceDataSync.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceDataSync {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceDataSync(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync):
        CfnResourceDataSync = CfnResourceDataSync(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDataSync):
        software.amazon.awscdk.services.ssm.CfnResourceDataSync = wrapped.cdkObject
  }

  /**
   * Information about the `AwsOrganizationsSource` resource data sync source.
   *
   * A sync source of this type can synchronize data from AWS Organizations or, if an AWS
   * organization isn't present, from multiple AWS Regions .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * AwsOrganizationsSourceProperty awsOrganizationsSourceProperty =
   * AwsOrganizationsSourceProperty.builder()
   * .organizationSourceType("organizationSourceType")
   * // the properties below are optional
   * .organizationalUnits(List.of("organizationalUnits"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html)
   */
  public interface AwsOrganizationsSourceProperty {
    /**
     * If an AWS organization is present, this is either `OrganizationalUnits` or
     * `EntireOrganization` .
     *
     * For `OrganizationalUnits` , the data is aggregated from a set of organization units. For
     * `EntireOrganization` , the data is aggregated from the entire AWS organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationsourcetype)
     */
    public fun organizationSourceType(): String

    /**
     * The AWS Organizations organization units included in the sync.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationalunits)
     */
    public fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
        emptyList()

    /**
     * A builder for [AwsOrganizationsSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param organizationSourceType If an AWS organization is present, this is either
       * `OrganizationalUnits` or `EntireOrganization` . 
       * For `OrganizationalUnits` , the data is aggregated from a set of organization units. For
       * `EntireOrganization` , the data is aggregated from the entire AWS organization.
       */
      public fun organizationSourceType(organizationSourceType: String)

      /**
       * @param organizationalUnits The AWS Organizations organization units included in the sync.
       */
      public fun organizationalUnits(organizationalUnits: List<String>)

      /**
       * @param organizationalUnits The AWS Organizations organization units included in the sync.
       */
      public fun organizationalUnits(vararg organizationalUnits: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty.builder()

      /**
       * @param organizationSourceType If an AWS organization is present, this is either
       * `OrganizationalUnits` or `EntireOrganization` . 
       * For `OrganizationalUnits` , the data is aggregated from a set of organization units. For
       * `EntireOrganization` , the data is aggregated from the entire AWS organization.
       */
      override fun organizationSourceType(organizationSourceType: String) {
        cdkBuilder.organizationSourceType(organizationSourceType)
      }

      /**
       * @param organizationalUnits The AWS Organizations organization units included in the sync.
       */
      override fun organizationalUnits(organizationalUnits: List<String>) {
        cdkBuilder.organizationalUnits(organizationalUnits)
      }

      /**
       * @param organizationalUnits The AWS Organizations organization units included in the sync.
       */
      override fun organizationalUnits(vararg organizationalUnits: String): Unit =
          organizationalUnits(organizationalUnits.toList())

      public fun build():
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty,
    ) : CdkObject(cdkObject), AwsOrganizationsSourceProperty {
      /**
       * If an AWS organization is present, this is either `OrganizationalUnits` or
       * `EntireOrganization` .
       *
       * For `OrganizationalUnits` , the data is aggregated from a set of organization units. For
       * `EntireOrganization` , the data is aggregated from the entire AWS organization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationsourcetype)
       */
      override fun organizationSourceType(): String = unwrap(this).getOrganizationSourceType()

      /**
       * The AWS Organizations organization units included in the sync.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationalunits)
       */
      override fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsOrganizationsSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty):
          AwsOrganizationsSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AwsOrganizationsSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsOrganizationsSourceProperty):
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty
    }
  }

  /**
   * Information about the target S3 bucket for the resource data sync.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * S3DestinationProperty s3DestinationProperty = S3DestinationProperty.builder()
   * .bucketName("bucketName")
   * .bucketRegion("bucketRegion")
   * .syncFormat("syncFormat")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html)
   */
  public interface S3DestinationProperty {
    /**
     * The name of the S3 bucket where the aggregated data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketname)
     */
    public fun bucketName(): String

    /**
     * An Amazon S3 prefix for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The AWS Region with the S3 bucket targeted by the resource data sync.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketregion)
     */
    public fun bucketRegion(): String

    /**
     * The ARN of an encryption key for a destination in Amazon S3.
     *
     * Must belong to the same Region as the destination S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A supported sync format.
     *
     * The following format is currently supported: JsonSerDe
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-syncformat)
     */
    public fun syncFormat(): String

    /**
     * A builder for [S3DestinationProperty]
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
       * @param kmsKeyArn The ARN of an encryption key for a destination in Amazon S3.
       * Must belong to the same Region as the destination S3 bucket.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param syncFormat A supported sync format. 
       * The following format is currently supported: JsonSerDe
       */
      public fun syncFormat(syncFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty.builder()

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
       * @param kmsKeyArn The ARN of an encryption key for a destination in Amazon S3.
       * Must belong to the same Region as the destination S3 bucket.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param syncFormat A supported sync format. 
       * The following format is currently supported: JsonSerDe
       */
      override fun syncFormat(syncFormat: String) {
        cdkBuilder.syncFormat(syncFormat)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty,
    ) : CdkObject(cdkObject), S3DestinationProperty {
      /**
       * The name of the S3 bucket where the aggregated data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * An Amazon S3 prefix for the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The AWS Region with the S3 bucket targeted by the resource data sync.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketregion)
       */
      override fun bucketRegion(): String = unwrap(this).getBucketRegion()

      /**
       * The ARN of an encryption key for a destination in Amazon S3.
       *
       * Must belong to the same Region as the destination S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * A supported sync format.
       *
       * The following format is currently supported: JsonSerDe
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-syncformat)
       */
      override fun syncFormat(): String = unwrap(this).getSyncFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty):
          S3DestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3DestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationProperty):
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty
    }
  }

  /**
   * Information about the source of the data included in the resource data sync.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * SyncSourceProperty syncSourceProperty = SyncSourceProperty.builder()
   * .sourceRegions(List.of("sourceRegions"))
   * .sourceType("sourceType")
   * // the properties below are optional
   * .awsOrganizationsSource(AwsOrganizationsSourceProperty.builder()
   * .organizationSourceType("organizationSourceType")
   * // the properties below are optional
   * .organizationalUnits(List.of("organizationalUnits"))
   * .build())
   * .includeFutureRegions(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html)
   */
  public interface SyncSourceProperty {
    /**
     * Information about the AwsOrganizationsSource resource data sync source.
     *
     * A sync source of this type can synchronize data from AWS Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-awsorganizationssource)
     */
    public fun awsOrganizationsSource(): Any? = unwrap(this).getAwsOrganizationsSource()

    /**
     * Whether to automatically synchronize and aggregate data from new AWS Regions when those
     * Regions come online.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-includefutureregions)
     */
    public fun includeFutureRegions(): Any? = unwrap(this).getIncludeFutureRegions()

    /**
     * The `SyncSource` AWS Regions included in the resource data sync.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourceregions)
     */
    public fun sourceRegions(): List<String>

    /**
     * The type of data source for the resource data sync.
     *
     * `SourceType` is either `AwsOrganizations` (if an organization is present in AWS Organizations
     * ) or `SingleAccountMultiRegions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourcetype)
     */
    public fun sourceType(): String

    /**
     * A builder for [SyncSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data
       * sync source.
       * A sync source of this type can synchronize data from AWS Organizations .
       */
      public fun awsOrganizationsSource(awsOrganizationsSource: IResolvable)

      /**
       * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data
       * sync source.
       * A sync source of this type can synchronize data from AWS Organizations .
       */
      public fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty)

      /**
       * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data
       * sync source.
       * A sync source of this type can synchronize data from AWS Organizations .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88e6d3855aee2ba6fd38c8dd0a81e6ed5bcc2164ffa523c9dc2e0708b28e2bdf")
      public
          fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty.Builder.() -> Unit)

      /**
       * @param includeFutureRegions Whether to automatically synchronize and aggregate data from
       * new AWS Regions when those Regions come online.
       */
      public fun includeFutureRegions(includeFutureRegions: Boolean)

      /**
       * @param includeFutureRegions Whether to automatically synchronize and aggregate data from
       * new AWS Regions when those Regions come online.
       */
      public fun includeFutureRegions(includeFutureRegions: IResolvable)

      /**
       * @param sourceRegions The `SyncSource` AWS Regions included in the resource data sync. 
       */
      public fun sourceRegions(sourceRegions: List<String>)

      /**
       * @param sourceRegions The `SyncSource` AWS Regions included in the resource data sync. 
       */
      public fun sourceRegions(vararg sourceRegions: String)

      /**
       * @param sourceType The type of data source for the resource data sync. 
       * `SourceType` is either `AwsOrganizations` (if an organization is present in AWS
       * Organizations ) or `SingleAccountMultiRegions` .
       */
      public fun sourceType(sourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty.builder()

      /**
       * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data
       * sync source.
       * A sync source of this type can synchronize data from AWS Organizations .
       */
      override fun awsOrganizationsSource(awsOrganizationsSource: IResolvable) {
        cdkBuilder.awsOrganizationsSource(awsOrganizationsSource.let(IResolvable::unwrap))
      }

      /**
       * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data
       * sync source.
       * A sync source of this type can synchronize data from AWS Organizations .
       */
      override fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty) {
        cdkBuilder.awsOrganizationsSource(awsOrganizationsSource.let(AwsOrganizationsSourceProperty::unwrap))
      }

      /**
       * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data
       * sync source.
       * A sync source of this type can synchronize data from AWS Organizations .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88e6d3855aee2ba6fd38c8dd0a81e6ed5bcc2164ffa523c9dc2e0708b28e2bdf")
      override
          fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty.Builder.() -> Unit):
          Unit = awsOrganizationsSource(AwsOrganizationsSourceProperty(awsOrganizationsSource))

      /**
       * @param includeFutureRegions Whether to automatically synchronize and aggregate data from
       * new AWS Regions when those Regions come online.
       */
      override fun includeFutureRegions(includeFutureRegions: Boolean) {
        cdkBuilder.includeFutureRegions(includeFutureRegions)
      }

      /**
       * @param includeFutureRegions Whether to automatically synchronize and aggregate data from
       * new AWS Regions when those Regions come online.
       */
      override fun includeFutureRegions(includeFutureRegions: IResolvable) {
        cdkBuilder.includeFutureRegions(includeFutureRegions.let(IResolvable::unwrap))
      }

      /**
       * @param sourceRegions The `SyncSource` AWS Regions included in the resource data sync. 
       */
      override fun sourceRegions(sourceRegions: List<String>) {
        cdkBuilder.sourceRegions(sourceRegions)
      }

      /**
       * @param sourceRegions The `SyncSource` AWS Regions included in the resource data sync. 
       */
      override fun sourceRegions(vararg sourceRegions: String): Unit =
          sourceRegions(sourceRegions.toList())

      /**
       * @param sourceType The type of data source for the resource data sync. 
       * `SourceType` is either `AwsOrganizations` (if an organization is present in AWS
       * Organizations ) or `SingleAccountMultiRegions` .
       */
      override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      public fun build(): software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty,
    ) : CdkObject(cdkObject), SyncSourceProperty {
      /**
       * Information about the AwsOrganizationsSource resource data sync source.
       *
       * A sync source of this type can synchronize data from AWS Organizations .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-awsorganizationssource)
       */
      override fun awsOrganizationsSource(): Any? = unwrap(this).getAwsOrganizationsSource()

      /**
       * Whether to automatically synchronize and aggregate data from new AWS Regions when those
       * Regions come online.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-includefutureregions)
       */
      override fun includeFutureRegions(): Any? = unwrap(this).getIncludeFutureRegions()

      /**
       * The `SyncSource` AWS Regions included in the resource data sync.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourceregions)
       */
      override fun sourceRegions(): List<String> = unwrap(this).getSourceRegions()

      /**
       * The type of data source for the resource data sync.
       *
       * `SourceType` is either `AwsOrganizations` (if an organization is present in AWS
       * Organizations ) or `SingleAccountMultiRegions` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourcetype)
       */
      override fun sourceType(): String = unwrap(this).getSourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SyncSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty):
          SyncSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SyncSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SyncSourceProperty):
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty
    }
  }
}
