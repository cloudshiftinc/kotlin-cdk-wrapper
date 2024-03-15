@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.Expiration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.IDistribution
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.BucketAccessControl
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for `BucketDeployment`.
 *
 * Example:
 *
 * ```
 * Bucket websiteBucket;
 * BucketDeployment deployment = BucketDeployment.Builder.create(this, "DeployWebsite")
 * .sources(List.of(Source.asset(join(__dirname, "my-website"))))
 * .destinationBucket(websiteBucket)
 * .build();
 * new ConstructThatReadsFromTheBucket(this, "Consumer", Map.of(
 * // Use 'deployment.deployedBucket' instead of 'websiteBucket' here
 * "bucket", deployment.getDeployedBucket()));
 * ```
 */
public interface BucketDeploymentProps {
  /**
   * System-defined x-amz-acl metadata to be set on all objects in the deployment.
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl)
   */
  public fun accessControl(): BucketAccessControl? =
      unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

  /**
   * System-defined cache-control metadata to be set on all objects in the deployment.
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun cacheControl(): List<CacheControl> =
      unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

  /**
   * System-defined cache-disposition metadata to be set on all objects in the deployment.
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun contentDisposition(): String? = unwrap(this).getContentDisposition()

  /**
   * System-defined content-encoding metadata to be set on all objects in the deployment.
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun contentEncoding(): String? = unwrap(this).getContentEncoding()

  /**
   * System-defined content-language metadata to be set on all objects in the deployment.
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun contentLanguage(): String? = unwrap(this).getContentLanguage()

  /**
   * System-defined content-type metadata to be set on all objects in the deployment.
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The S3 bucket to sync the contents of the zip file to.
   */
  public fun destinationBucket(): IBucket

  /**
   * Key prefix in the destination bucket.
   *
   * Must be &lt;=104 characters
   *
   * Default: "/" (unzip to root of the destination bucket)
   */
  public fun destinationKeyPrefix(): String? = unwrap(this).getDestinationKeyPrefix()

  /**
   * The CloudFront distribution using the destination bucket as an origin.
   *
   * Files in the distribution's edge caches will be invalidated after
   * files are uploaded to the destination bucket.
   *
   * Default: - No invalidation occurs
   */
  public fun distribution(): IDistribution? =
      unwrap(this).getDistribution()?.let(IDistribution::wrap)

  /**
   * The file paths to invalidate in the CloudFront distribution.
   *
   * Default: - All files under the destination bucket key prefix will be invalidated.
   */
  public fun distributionPaths(): List<String> = unwrap(this).getDistributionPaths() ?: emptyList()

  /**
   * The size of the AWS Lambda function’s /tmp directory in MiB.
   *
   * Default: 512 MiB
   */
  public fun ephemeralStorageSize(): Size? = unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  /**
   * If this is set, matching files or objects will be excluded from the deployment's sync command.
   *
   * This can be used to exclude a file from being pruned in the destination bucket.
   *
   * If you want to just exclude files from the deployment package (which excludes these files
   * evaluated when invalidating the asset), you should leverage the `exclude` property of
   * `AssetOptions` when defining your source.
   *
   * Default: - No exclude filters are used
   *
   * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/index.html#use-of-exclude-and-include-filters)
   */
  public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

  /**
   * System-defined expires metadata to be set on all objects in the deployment.
   *
   * Default: - The objects in the distribution will not expire.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

  /**
   * If this is set, the zip file will be synced to the destination S3 bucket and extracted.
   *
   * If false, the file will remain zipped in the destination bucket.
   *
   * Default: true
   */
  public fun extract(): Boolean? = unwrap(this).getExtract()

  /**
   * If this is set, matching files or objects will be included with the deployment's sync command.
   *
   * Since all files from the deployment package are included by default, this property
   * is usually leveraged alongside an `exclude` filter.
   *
   * Default: - No include filters are used and all files are included with the sync command
   *
   * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/index.html#use-of-exclude-and-include-filters)
   */
  public fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

  /**
   * The Log Group used for logging of events emitted by the custom resource's lambda function.
   *
   * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
   * If you are deploying to another type of region, please check regional availability first.
   *
   * Default: - a default log group created by AWS Lambda
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * The number of days that the lambda function's log events are kept in CloudWatch Logs.
   *
   * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
   * `logGroup` allows you to create a fully customizable log group and instruct the Lambda function
   * to send logs to it.
   *
   * Default: logs.RetentionDays.INFINITE
   */
  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  /**
   * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the files
   * from the CDK bucket to the destination bucket.
   *
   * If you are deploying large files, you will need to increase this number
   * accordingly.
   *
   * Default: 128
   */
  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  /**
   * User-defined object metadata to be set on all objects in the deployment.
   *
   * Default: - No user metadata is set
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#UserMetadata)
   */
  public fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

  /**
   * If this is set to false, files in the destination bucket that do not exist in the asset, will
   * NOT be deleted during deployment (create/update).
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/sync.html)
   */
  public fun prune(): Boolean? = unwrap(this).getPrune()

  /**
   * If this is set to "false", the destination files will be deleted when the resource is deleted
   * or the destination is updated.
   *
   * NOTICE: Configuring this to "false" might have operational implications. Please
   * visit to the package documentation referred below to make sure you fully understand those
   * implications.
   *
   * Default: true - when resource is deleted/updated, files are retained
   *
   * [Documentation](https://github.com/aws/aws-cdk/tree/main/packages/aws-cdk-lib/aws-s3-deployment#retain-on-delete)
   */
  public fun retainOnDelete(): Boolean? = unwrap(this).getRetainOnDelete()

  /**
   * Execution role associated with this function.
   *
   * Default: - A role is automatically created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * System-defined x-amz-server-side-encryption metadata to be set on all objects in the
   * deployment.
   *
   * Default: - Server side encryption is not used.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun serverSideEncryption(): ServerSideEncryption? =
      unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

  /**
   * System-defined x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects in
   * the deployment.
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun serverSideEncryptionAwsKmsKeyId(): String? =
      unwrap(this).getServerSideEncryptionAwsKmsKeyId()

  /**
   * System-defined x-amz-server-side-encryption-customer-algorithm metadata to be set on all
   * objects in the deployment.
   *
   * Warning: This is not a useful parameter until this bug is fixed:
   * https://github.com/aws/aws-cdk/issues/6080
   *
   * Default: - Not set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html#sse-c-how-to-programmatically-intro)
   */
  public fun serverSideEncryptionCustomerAlgorithm(): String? =
      unwrap(this).getServerSideEncryptionCustomerAlgorithm()

  /**
   * If set to true, uploads will precompute the value of `x-amz-content-sha256` and include it in
   * the signed S3 request headers.
   *
   * Default: - `x-amz-content-sha256` will not be computed
   */
  public fun signContent(): Boolean? = unwrap(this).getSignContent()

  /**
   * The sources from which to deploy the contents of this bucket.
   */
  public fun sources(): List<ISource>

  /**
   * System-defined x-amz-storage-class metadata to be set on all objects in the deployment.
   *
   * Default: - Default storage-class for the bucket is used.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun storageClass(): StorageClass? = unwrap(this).getStorageClass()?.let(StorageClass::wrap)

  /**
   * Mount an EFS file system.
   *
   * Enable this if your assets are large and you encounter disk space errors.
   * Enabling this option will require a VPC to be specified.
   *
   * Default: - No EFS. Lambda has access only to 512MB of disk space.
   */
  public fun useEfs(): Boolean? = unwrap(this).getUseEfs()

  /**
   * The VPC network to place the deployment lambda handler in.
   *
   * This is required if `useEfs` is set.
   *
   * Default: None
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Where in the VPC to place the deployment lambda handler.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: - the Vpc default strategy if not specified
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * System-defined x-amz-website-redirect-location metadata to be set on all objects in the
   * deployment.
   *
   * Default: - No website redirection.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
   */
  public fun websiteRedirectLocation(): String? = unwrap(this).getWebsiteRedirectLocation()

  /**
   * A builder for [BucketDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControl System-defined x-amz-acl metadata to be set on all objects in the
     * deployment.
     */
    public fun accessControl(accessControl: BucketAccessControl)

    /**
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment.
     */
    public fun cacheControl(cacheControl: List<CacheControl>)

    /**
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment.
     */
    public fun cacheControl(vararg cacheControl: CacheControl)

    /**
     * @param contentDisposition System-defined cache-disposition metadata to be set on all objects
     * in the deployment.
     */
    public fun contentDisposition(contentDisposition: String)

    /**
     * @param contentEncoding System-defined content-encoding metadata to be set on all objects in
     * the deployment.
     */
    public fun contentEncoding(contentEncoding: String)

    /**
     * @param contentLanguage System-defined content-language metadata to be set on all objects in
     * the deployment.
     */
    public fun contentLanguage(contentLanguage: String)

    /**
     * @param contentType System-defined content-type metadata to be set on all objects in the
     * deployment.
     */
    public fun contentType(contentType: String)

    /**
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    public fun destinationBucket(destinationBucket: IBucket)

    /**
     * @param destinationKeyPrefix Key prefix in the destination bucket.
     * Must be &lt;=104 characters
     */
    public fun destinationKeyPrefix(destinationKeyPrefix: String)

    /**
     * @param distribution The CloudFront distribution using the destination bucket as an origin.
     * Files in the distribution's edge caches will be invalidated after
     * files are uploaded to the destination bucket.
     */
    public fun distribution(distribution: IDistribution)

    /**
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
     */
    public fun distributionPaths(distributionPaths: List<String>)

    /**
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
     */
    public fun distributionPaths(vararg distributionPaths: String)

    /**
     * @param ephemeralStorageSize The size of the AWS Lambda function’s /tmp directory in MiB.
     */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    /**
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command.
     * This can be used to exclude a file from being pruned in the destination bucket.
     *
     * If you want to just exclude files from the deployment package (which excludes these files
     * evaluated when invalidating the asset), you should leverage the `exclude` property of
     * `AssetOptions` when defining your source.
     */
    public fun exclude(exclude: List<String>)

    /**
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command.
     * This can be used to exclude a file from being pruned in the destination bucket.
     *
     * If you want to just exclude files from the deployment package (which excludes these files
     * evaluated when invalidating the asset), you should leverage the `exclude` property of
     * `AssetOptions` when defining your source.
     */
    public fun exclude(vararg exclude: String)

    /**
     * @param expires System-defined expires metadata to be set on all objects in the deployment.
     */
    public fun expires(expires: Expiration)

    /**
     * @param extract If this is set, the zip file will be synced to the destination S3 bucket and
     * extracted.
     * If false, the file will remain zipped in the destination bucket.
     */
    public fun extract(extract: Boolean)

    /**
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command.
     * Since all files from the deployment package are included by default, this property
     * is usually leveraged alongside an `exclude` filter.
     */
    public fun include(include: List<String>)

    /**
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command.
     * Since all files from the deployment package are included by default, this property
     * is usually leveraged alongside an `exclude` filter.
     */
    public fun include(vararg include: String)

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logRetention The number of days that the lambda function's log events are kept in
     * CloudWatch Logs.
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket.
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     */
    public fun memoryLimit(memoryLimit: Number)

    /**
     * @param metadata User-defined object metadata to be set on all objects in the deployment.
     */
    public fun metadata(metadata: Map<String, String>)

    /**
     * @param prune If this is set to false, files in the destination bucket that do not exist in
     * the asset, will NOT be deleted during deployment (create/update).
     */
    public fun prune(prune: Boolean)

    /**
     * @param retainOnDelete If this is set to "false", the destination files will be deleted when
     * the resource is deleted or the destination is updated.
     * NOTICE: Configuring this to "false" might have operational implications. Please
     * visit to the package documentation referred below to make sure you fully understand those
     * implications.
     */
    public fun retainOnDelete(retainOnDelete: Boolean)

    /**
     * @param role Execution role associated with this function.
     */
    public fun role(role: IRole)

    /**
     * @param serverSideEncryption System-defined x-amz-server-side-encryption metadata to be set on
     * all objects in the deployment.
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    /**
     * @param serverSideEncryptionAwsKmsKeyId System-defined
     * x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects in the deployment.
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)

    /**
     * @param serverSideEncryptionCustomerAlgorithm System-defined
     * x-amz-server-side-encryption-customer-algorithm metadata to be set on all objects in the
     * deployment.
     * Warning: This is not a useful parameter until this bug is fixed:
     * https://github.com/aws/aws-cdk/issues/6080
     */
    public fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String)

    /**
     * @param signContent If set to true, uploads will precompute the value of
     * `x-amz-content-sha256` and include it in the signed S3 request headers.
     */
    public fun signContent(signContent: Boolean)

    /**
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    public fun sources(sources: List<ISource>)

    /**
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    public fun sources(vararg sources: ISource)

    /**
     * @param storageClass System-defined x-amz-storage-class metadata to be set on all objects in
     * the deployment.
     */
    public fun storageClass(storageClass: StorageClass)

    /**
     * @param useEfs Mount an EFS file system.
     * Enable this if your assets are large and you encounter disk space errors.
     * Enabling this option will require a VPC to be specified.
     */
    public fun useEfs(useEfs: Boolean)

    /**
     * @param vpc The VPC network to place the deployment lambda handler in.
     * This is required if `useEfs` is set.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler.
     * Only used if 'vpc' is supplied.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler.
     * Only used if 'vpc' is supplied.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32097b1ef126d6fd90bcb5a0e01b05a54d6a9f22585dd07a12158a32a956d40f")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param websiteRedirectLocation System-defined x-amz-website-redirect-location metadata to be
     * set on all objects in the deployment.
     */
    public fun websiteRedirectLocation(websiteRedirectLocation: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder =
        software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.builder()

    /**
     * @param accessControl System-defined x-amz-acl metadata to be set on all objects in the
     * deployment.
     */
    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    /**
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment.
     */
    override fun cacheControl(cacheControl: List<CacheControl>) {
      cdkBuilder.cacheControl(cacheControl.map(CacheControl::unwrap))
    }

    /**
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment.
     */
    override fun cacheControl(vararg cacheControl: CacheControl): Unit =
        cacheControl(cacheControl.toList())

    /**
     * @param contentDisposition System-defined cache-disposition metadata to be set on all objects
     * in the deployment.
     */
    override fun contentDisposition(contentDisposition: String) {
      cdkBuilder.contentDisposition(contentDisposition)
    }

    /**
     * @param contentEncoding System-defined content-encoding metadata to be set on all objects in
     * the deployment.
     */
    override fun contentEncoding(contentEncoding: String) {
      cdkBuilder.contentEncoding(contentEncoding)
    }

    /**
     * @param contentLanguage System-defined content-language metadata to be set on all objects in
     * the deployment.
     */
    override fun contentLanguage(contentLanguage: String) {
      cdkBuilder.contentLanguage(contentLanguage)
    }

    /**
     * @param contentType System-defined content-type metadata to be set on all objects in the
     * deployment.
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    override fun destinationBucket(destinationBucket: IBucket) {
      cdkBuilder.destinationBucket(destinationBucket.let(IBucket::unwrap))
    }

    /**
     * @param destinationKeyPrefix Key prefix in the destination bucket.
     * Must be &lt;=104 characters
     */
    override fun destinationKeyPrefix(destinationKeyPrefix: String) {
      cdkBuilder.destinationKeyPrefix(destinationKeyPrefix)
    }

    /**
     * @param distribution The CloudFront distribution using the destination bucket as an origin.
     * Files in the distribution's edge caches will be invalidated after
     * files are uploaded to the destination bucket.
     */
    override fun distribution(distribution: IDistribution) {
      cdkBuilder.distribution(distribution.let(IDistribution::unwrap))
    }

    /**
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
     */
    override fun distributionPaths(distributionPaths: List<String>) {
      cdkBuilder.distributionPaths(distributionPaths)
    }

    /**
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
     */
    override fun distributionPaths(vararg distributionPaths: String): Unit =
        distributionPaths(distributionPaths.toList())

    /**
     * @param ephemeralStorageSize The size of the AWS Lambda function’s /tmp directory in MiB.
     */
    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    /**
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command.
     * This can be used to exclude a file from being pruned in the destination bucket.
     *
     * If you want to just exclude files from the deployment package (which excludes these files
     * evaluated when invalidating the asset), you should leverage the `exclude` property of
     * `AssetOptions` when defining your source.
     */
    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    /**
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command.
     * This can be used to exclude a file from being pruned in the destination bucket.
     *
     * If you want to just exclude files from the deployment package (which excludes these files
     * evaluated when invalidating the asset), you should leverage the `exclude` property of
     * `AssetOptions` when defining your source.
     */
    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    /**
     * @param expires System-defined expires metadata to be set on all objects in the deployment.
     */
    override fun expires(expires: Expiration) {
      cdkBuilder.expires(expires.let(Expiration::unwrap))
    }

    /**
     * @param extract If this is set, the zip file will be synced to the destination S3 bucket and
     * extracted.
     * If false, the file will remain zipped in the destination bucket.
     */
    override fun extract(extract: Boolean) {
      cdkBuilder.extract(extract)
    }

    /**
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command.
     * Since all files from the deployment package are included by default, this property
     * is usually leveraged alongside an `exclude` filter.
     */
    override fun include(include: List<String>) {
      cdkBuilder.include(include)
    }

    /**
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command.
     * Since all files from the deployment package are included by default, this property
     * is usually leveraged alongside an `exclude` filter.
     */
    override fun include(vararg include: String): Unit = include(include.toList())

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param logRetention The number of days that the lambda function's log events are kept in
     * CloudWatch Logs.
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket.
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     */
    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * @param metadata User-defined object metadata to be set on all objects in the deployment.
     */
    override fun metadata(metadata: Map<String, String>) {
      cdkBuilder.metadata(metadata)
    }

    /**
     * @param prune If this is set to false, files in the destination bucket that do not exist in
     * the asset, will NOT be deleted during deployment (create/update).
     */
    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    /**
     * @param retainOnDelete If this is set to "false", the destination files will be deleted when
     * the resource is deleted or the destination is updated.
     * NOTICE: Configuring this to "false" might have operational implications. Please
     * visit to the package documentation referred below to make sure you fully understand those
     * implications.
     */
    override fun retainOnDelete(retainOnDelete: Boolean) {
      cdkBuilder.retainOnDelete(retainOnDelete)
    }

    /**
     * @param role Execution role associated with this function.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param serverSideEncryption System-defined x-amz-server-side-encryption metadata to be set on
     * all objects in the deployment.
     */
    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption::unwrap))
    }

    /**
     * @param serverSideEncryptionAwsKmsKeyId System-defined
     * x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects in the deployment.
     */
    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    /**
     * @param serverSideEncryptionCustomerAlgorithm System-defined
     * x-amz-server-side-encryption-customer-algorithm metadata to be set on all objects in the
     * deployment.
     * Warning: This is not a useful parameter until this bug is fixed:
     * https://github.com/aws/aws-cdk/issues/6080
     */
    override
        fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String) {
      cdkBuilder.serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm)
    }

    /**
     * @param signContent If set to true, uploads will precompute the value of
     * `x-amz-content-sha256` and include it in the signed S3 request headers.
     */
    override fun signContent(signContent: Boolean) {
      cdkBuilder.signContent(signContent)
    }

    /**
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    override fun sources(sources: List<ISource>) {
      cdkBuilder.sources(sources.map(ISource::unwrap))
    }

    /**
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    override fun sources(vararg sources: ISource): Unit = sources(sources.toList())

    /**
     * @param storageClass System-defined x-amz-storage-class metadata to be set on all objects in
     * the deployment.
     */
    override fun storageClass(storageClass: StorageClass) {
      cdkBuilder.storageClass(storageClass.let(StorageClass::unwrap))
    }

    /**
     * @param useEfs Mount an EFS file system.
     * Enable this if your assets are large and you encounter disk space errors.
     * Enabling this option will require a VPC to be specified.
     */
    override fun useEfs(useEfs: Boolean) {
      cdkBuilder.useEfs(useEfs)
    }

    /**
     * @param vpc The VPC network to place the deployment lambda handler in.
     * This is required if `useEfs` is set.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler.
     * Only used if 'vpc' is supplied.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler.
     * Only used if 'vpc' is supplied.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32097b1ef126d6fd90bcb5a0e01b05a54d6a9f22585dd07a12158a32a956d40f")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * @param websiteRedirectLocation System-defined x-amz-website-redirect-location metadata to be
     * set on all objects in the deployment.
     */
    override fun websiteRedirectLocation(websiteRedirectLocation: String) {
      cdkBuilder.websiteRedirectLocation(websiteRedirectLocation)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps,
  ) : CdkObject(cdkObject), BucketDeploymentProps {
    /**
     * System-defined x-amz-acl metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl)
     */
    override fun accessControl(): BucketAccessControl? =
        unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

    /**
     * System-defined cache-control metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun cacheControl(): List<CacheControl> =
        unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

    /**
     * System-defined cache-disposition metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun contentDisposition(): String? = unwrap(this).getContentDisposition()

    /**
     * System-defined content-encoding metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun contentEncoding(): String? = unwrap(this).getContentEncoding()

    /**
     * System-defined content-language metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun contentLanguage(): String? = unwrap(this).getContentLanguage()

    /**
     * System-defined content-type metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The S3 bucket to sync the contents of the zip file to.
     */
    override fun destinationBucket(): IBucket =
        unwrap(this).getDestinationBucket().let(IBucket::wrap)

    /**
     * Key prefix in the destination bucket.
     *
     * Must be &lt;=104 characters
     *
     * Default: "/" (unzip to root of the destination bucket)
     */
    override fun destinationKeyPrefix(): String? = unwrap(this).getDestinationKeyPrefix()

    /**
     * The CloudFront distribution using the destination bucket as an origin.
     *
     * Files in the distribution's edge caches will be invalidated after
     * files are uploaded to the destination bucket.
     *
     * Default: - No invalidation occurs
     */
    override fun distribution(): IDistribution? =
        unwrap(this).getDistribution()?.let(IDistribution::wrap)

    /**
     * The file paths to invalidate in the CloudFront distribution.
     *
     * Default: - All files under the destination bucket key prefix will be invalidated.
     */
    override fun distributionPaths(): List<String> = unwrap(this).getDistributionPaths() ?:
        emptyList()

    /**
     * The size of the AWS Lambda function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     */
    override fun ephemeralStorageSize(): Size? =
        unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

    /**
     * If this is set, matching files or objects will be excluded from the deployment's sync
     * command.
     *
     * This can be used to exclude a file from being pruned in the destination bucket.
     *
     * If you want to just exclude files from the deployment package (which excludes these files
     * evaluated when invalidating the asset), you should leverage the `exclude` property of
     * `AssetOptions` when defining your source.
     *
     * Default: - No exclude filters are used
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/index.html#use-of-exclude-and-include-filters)
     */
    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    /**
     * System-defined expires metadata to be set on all objects in the deployment.
     *
     * Default: - The objects in the distribution will not expire.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

    /**
     * If this is set, the zip file will be synced to the destination S3 bucket and extracted.
     *
     * If false, the file will remain zipped in the destination bucket.
     *
     * Default: true
     */
    override fun extract(): Boolean? = unwrap(this).getExtract()

    /**
     * If this is set, matching files or objects will be included with the deployment's sync
     * command.
     *
     * Since all files from the deployment package are included by default, this property
     * is usually leveraged alongside an `exclude` filter.
     *
     * Default: - No include filters are used and all files are included with the sync command
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/index.html#use-of-exclude-and-include-filters)
     */
    override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * The number of days that the lambda function's log events are kept in CloudWatch Logs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: logs.RetentionDays.INFINITE
     */
    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    /**
     * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the
     * files from the CDK bucket to the destination bucket.
     *
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     *
     * Default: 128
     */
    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

    /**
     * User-defined object metadata to be set on all objects in the deployment.
     *
     * Default: - No user metadata is set
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#UserMetadata)
     */
    override fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

    /**
     * If this is set to false, files in the destination bucket that do not exist in the asset, will
     * NOT be deleted during deployment (create/update).
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/sync.html)
     */
    override fun prune(): Boolean? = unwrap(this).getPrune()

    /**
     * If this is set to "false", the destination files will be deleted when the resource is deleted
     * or the destination is updated.
     *
     * NOTICE: Configuring this to "false" might have operational implications. Please
     * visit to the package documentation referred below to make sure you fully understand those
     * implications.
     *
     * Default: true - when resource is deleted/updated, files are retained
     *
     * [Documentation](https://github.com/aws/aws-cdk/tree/main/packages/aws-cdk-lib/aws-s3-deployment#retain-on-delete)
     */
    override fun retainOnDelete(): Boolean? = unwrap(this).getRetainOnDelete()

    /**
     * Execution role associated with this function.
     *
     * Default: - A role is automatically created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * System-defined x-amz-server-side-encryption metadata to be set on all objects in the
     * deployment.
     *
     * Default: - Server side encryption is not used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun serverSideEncryption(): ServerSideEncryption? =
        unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

    /**
     * System-defined x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects
     * in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun serverSideEncryptionAwsKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionAwsKmsKeyId()

    /**
     * System-defined x-amz-server-side-encryption-customer-algorithm metadata to be set on all
     * objects in the deployment.
     *
     * Warning: This is not a useful parameter until this bug is fixed:
     * https://github.com/aws/aws-cdk/issues/6080
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html#sse-c-how-to-programmatically-intro)
     */
    override fun serverSideEncryptionCustomerAlgorithm(): String? =
        unwrap(this).getServerSideEncryptionCustomerAlgorithm()

    /**
     * If set to true, uploads will precompute the value of `x-amz-content-sha256` and include it in
     * the signed S3 request headers.
     *
     * Default: - `x-amz-content-sha256` will not be computed
     */
    override fun signContent(): Boolean? = unwrap(this).getSignContent()

    /**
     * The sources from which to deploy the contents of this bucket.
     */
    override fun sources(): List<ISource> = unwrap(this).getSources().map(ISource::wrap)

    /**
     * System-defined x-amz-storage-class metadata to be set on all objects in the deployment.
     *
     * Default: - Default storage-class for the bucket is used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun storageClass(): StorageClass? =
        unwrap(this).getStorageClass()?.let(StorageClass::wrap)

    /**
     * Mount an EFS file system.
     *
     * Enable this if your assets are large and you encounter disk space errors.
     * Enabling this option will require a VPC to be specified.
     *
     * Default: - No EFS. Lambda has access only to 512MB of disk space.
     */
    override fun useEfs(): Boolean? = unwrap(this).getUseEfs()

    /**
     * The VPC network to place the deployment lambda handler in.
     *
     * This is required if `useEfs` is set.
     *
     * Default: None
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Where in the VPC to place the deployment lambda handler.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - the Vpc default strategy if not specified
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

    /**
     * System-defined x-amz-website-redirect-location metadata to be set on all objects in the
     * deployment.
     *
     * Default: - No website redirection.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     */
    override fun websiteRedirectLocation(): String? = unwrap(this).getWebsiteRedirectLocation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps):
        BucketDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketDeploymentProps):
        software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps
  }
}
