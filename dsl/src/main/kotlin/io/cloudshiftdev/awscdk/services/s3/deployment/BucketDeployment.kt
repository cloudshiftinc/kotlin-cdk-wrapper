package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.Expiration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BucketDeployment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.deployment.BucketDeployment,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * Add an additional source to the bucket deployment.
   *
   * Example:
   *
   * ```
   * IBucket websiteBucket;
   * BucketDeployment deployment = BucketDeployment.Builder.create(this, "Deployment")
   * .sources(List.of(Source.asset("./website-dist")))
   * .destinationBucket(websiteBucket)
   * .build();
   * deployment.addSource(Source.asset("./another-asset"));
   * ```
   *
   * @param source 
   */
  public open fun addSource(source: ISource) {
    unwrap(this).addSource(source.let(ISource::unwrap))
  }

  /**
   * The bucket after the deployment.
   *
   * If you want to reference the destination bucket in another construct and make sure the
   * bucket deployment has happened before the next operation is started, pass the other construct
   * a reference to `deployment.deployedBucket`.
   *
   * Note that this only returns an immutable reference to the destination bucket.
   * If sequenced access to the original destination bucket is required, you may add a dependency
   * on the bucket deployment instead: `otherResource.node.addDependency(deployment)`
   */
  public open fun deployedBucket(): IBucket = unwrap(this).getDeployedBucket().let(IBucket::wrap)

  /**
   * The object keys for the sources deployed to the S3 bucket.
   *
   * This returns a list of tokenized object keys for source files that are deployed to the bucket.
   *
   * This can be useful when using `BucketDeployment` with `extract` set to `false` and you need to
   * reference
   * the object key that resides in the bucket for that zip source file somewhere else in your CDK
   * application, such as in a CFN output.
   *
   * For example, use `Fn.select(0, myBucketDeployment.objectKeys)` to reference the object key of
   * the
   * first source file in your bucket deployment.
   */
  public open fun objectKeys(): List<String> = unwrap(this).getObjectKeys()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.deployment.BucketDeployment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * System-defined x-amz-acl metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl)
     * @param accessControl System-defined x-amz-acl metadata to be set on all objects in the
     * deployment. 
     */
    public fun accessControl(accessControl: BucketAccessControl)

    /**
     * System-defined cache-control metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment. 
     */
    public fun cacheControl(cacheControl: List<CacheControl>)

    /**
     * System-defined cache-control metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment. 
     */
    public fun cacheControl(vararg cacheControl: CacheControl)

    /**
     * System-defined cache-disposition metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentDisposition System-defined cache-disposition metadata to be set on all objects
     * in the deployment. 
     */
    public fun contentDisposition(contentDisposition: String)

    /**
     * System-defined content-encoding metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentEncoding System-defined content-encoding metadata to be set on all objects in
     * the deployment. 
     */
    public fun contentEncoding(contentEncoding: String)

    /**
     * System-defined content-language metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentLanguage System-defined content-language metadata to be set on all objects in
     * the deployment. 
     */
    public fun contentLanguage(contentLanguage: String)

    /**
     * System-defined content-type metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentType System-defined content-type metadata to be set on all objects in the
     * deployment. 
     */
    public fun contentType(contentType: String)

    /**
     * The S3 bucket to sync the contents of the zip file to.
     *
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    public fun destinationBucket(destinationBucket: IBucket)

    /**
     * Key prefix in the destination bucket.
     *
     * Must be &lt;=104 characters
     *
     * Default: "/" (unzip to root of the destination bucket)
     *
     * @param destinationKeyPrefix Key prefix in the destination bucket. 
     */
    public fun destinationKeyPrefix(destinationKeyPrefix: String)

    /**
     * The CloudFront distribution using the destination bucket as an origin.
     *
     * Files in the distribution's edge caches will be invalidated after
     * files are uploaded to the destination bucket.
     *
     * Default: - No invalidation occurs
     *
     * @param distribution The CloudFront distribution using the destination bucket as an origin. 
     */
    public fun distribution(distribution: IDistribution)

    /**
     * The file paths to invalidate in the CloudFront distribution.
     *
     * Default: - All files under the destination bucket key prefix will be invalidated.
     *
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution. 
     */
    public fun distributionPaths(distributionPaths: List<String>)

    /**
     * The file paths to invalidate in the CloudFront distribution.
     *
     * Default: - All files under the destination bucket key prefix will be invalidated.
     *
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution. 
     */
    public fun distributionPaths(vararg distributionPaths: String)

    /**
     * The size of the AWS Lambda function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     *
     * @param ephemeralStorageSize The size of the AWS Lambda function’s /tmp directory in MiB. 
     */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

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
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command. 
     */
    public fun exclude(exclude: List<String>)

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
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command. 
     */
    public fun exclude(vararg exclude: String)

    /**
     * System-defined expires metadata to be set on all objects in the deployment.
     *
     * Default: - The objects in the distribution will not expire.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param expires System-defined expires metadata to be set on all objects in the deployment. 
     */
    public fun expires(expires: Expiration)

    /**
     * If this is set, the zip file will be synced to the destination S3 bucket and extracted.
     *
     * If false, the file will remain zipped in the destination bucket.
     *
     * Default: true
     *
     * @param extract If this is set, the zip file will be synced to the destination S3 bucket and
     * extracted. 
     */
    public fun extract(extract: Boolean)

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
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command. 
     */
    public fun include(include: List<String>)

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
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command. 
     */
    public fun include(vararg include: String)

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     *
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * The number of days that the lambda function's log events are kept in CloudWatch Logs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: logs.RetentionDays.INFINITE
     *
     * @param logRetention The number of days that the lambda function's log events are kept in
     * CloudWatch Logs. 
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the
     * files from the CDK bucket to the destination bucket.
     *
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     *
     * Default: 128
     *
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket. 
     */
    public fun memoryLimit(memoryLimit: Number)

    /**
     * User-defined object metadata to be set on all objects in the deployment.
     *
     * Default: - No user metadata is set
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#UserMetadata)
     * @param metadata User-defined object metadata to be set on all objects in the deployment. 
     */
    public fun metadata(metadata: Map<String, String>)

    /**
     * If this is set to false, files in the destination bucket that do not exist in the asset, will
     * NOT be deleted during deployment (create/update).
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/sync.html)
     * @param prune If this is set to false, files in the destination bucket that do not exist in
     * the asset, will NOT be deleted during deployment (create/update). 
     */
    public fun prune(prune: Boolean)

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
     * @param retainOnDelete If this is set to "false", the destination files will be deleted when
     * the resource is deleted or the destination is updated. 
     */
    public fun retainOnDelete(retainOnDelete: Boolean)

    /**
     * Execution role associated with this function.
     *
     * Default: - A role is automatically created
     *
     * @param role Execution role associated with this function. 
     */
    public fun role(role: IRole)

    /**
     * System-defined x-amz-server-side-encryption metadata to be set on all objects in the
     * deployment.
     *
     * Default: - Server side encryption is not used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param serverSideEncryption System-defined x-amz-server-side-encryption metadata to be set on
     * all objects in the deployment. 
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    /**
     * System-defined x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects
     * in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param serverSideEncryptionAwsKmsKeyId System-defined
     * x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects in the deployment.
     * 
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)

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
     * @param serverSideEncryptionCustomerAlgorithm System-defined
     * x-amz-server-side-encryption-customer-algorithm metadata to be set on all objects in the
     * deployment. 
     */
    public fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String)

    /**
     * If set to true, uploads will precompute the value of `x-amz-content-sha256` and include it in
     * the signed S3 request headers.
     *
     * Default: - `x-amz-content-sha256` will not be computed
     *
     * @param signContent If set to true, uploads will precompute the value of
     * `x-amz-content-sha256` and include it in the signed S3 request headers. 
     */
    public fun signContent(signContent: Boolean)

    /**
     * The sources from which to deploy the contents of this bucket.
     *
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    public fun sources(sources: List<ISource>)

    /**
     * The sources from which to deploy the contents of this bucket.
     *
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    public fun sources(vararg sources: ISource)

    /**
     * System-defined x-amz-storage-class metadata to be set on all objects in the deployment.
     *
     * Default: - Default storage-class for the bucket is used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param storageClass System-defined x-amz-storage-class metadata to be set on all objects in
     * the deployment. 
     */
    public fun storageClass(storageClass: StorageClass)

    /**
     * Mount an EFS file system.
     *
     * Enable this if your assets are large and you encounter disk space errors.
     * Enabling this option will require a VPC to be specified.
     *
     * Default: - No EFS. Lambda has access only to 512MB of disk space.
     *
     * @param useEfs Mount an EFS file system. 
     */
    public fun useEfs(useEfs: Boolean)

    /**
     * The VPC network to place the deployment lambda handler in.
     *
     * This is required if `useEfs` is set.
     *
     * Default: None
     *
     * @param vpc The VPC network to place the deployment lambda handler in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where in the VPC to place the deployment lambda handler.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Where in the VPC to place the deployment lambda handler.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f8214998cf69e2cf8077f818ea3d759d9db2d009e57e5b6308913ae5364b64c")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * System-defined x-amz-website-redirect-location metadata to be set on all objects in the
     * deployment.
     *
     * Default: - No website redirection.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param websiteRedirectLocation System-defined x-amz-website-redirect-location metadata to be
     * set on all objects in the deployment. 
     */
    public fun websiteRedirectLocation(websiteRedirectLocation: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.deployment.BucketDeployment.Builder =
        software.amazon.awscdk.services.s3.deployment.BucketDeployment.Builder.create(scope, id)

    /**
     * System-defined x-amz-acl metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl)
     * @param accessControl System-defined x-amz-acl metadata to be set on all objects in the
     * deployment. 
     */
    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    /**
     * System-defined cache-control metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment. 
     */
    override fun cacheControl(cacheControl: List<CacheControl>) {
      cdkBuilder.cacheControl(cacheControl.map(CacheControl::unwrap))
    }

    /**
     * System-defined cache-control metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     * deployment. 
     */
    override fun cacheControl(vararg cacheControl: CacheControl): Unit =
        cacheControl(cacheControl.toList())

    /**
     * System-defined cache-disposition metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentDisposition System-defined cache-disposition metadata to be set on all objects
     * in the deployment. 
     */
    override fun contentDisposition(contentDisposition: String) {
      cdkBuilder.contentDisposition(contentDisposition)
    }

    /**
     * System-defined content-encoding metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentEncoding System-defined content-encoding metadata to be set on all objects in
     * the deployment. 
     */
    override fun contentEncoding(contentEncoding: String) {
      cdkBuilder.contentEncoding(contentEncoding)
    }

    /**
     * System-defined content-language metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentLanguage System-defined content-language metadata to be set on all objects in
     * the deployment. 
     */
    override fun contentLanguage(contentLanguage: String) {
      cdkBuilder.contentLanguage(contentLanguage)
    }

    /**
     * System-defined content-type metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param contentType System-defined content-type metadata to be set on all objects in the
     * deployment. 
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * The S3 bucket to sync the contents of the zip file to.
     *
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
     */
    override fun destinationBucket(destinationBucket: IBucket) {
      cdkBuilder.destinationBucket(destinationBucket.let(IBucket::unwrap))
    }

    /**
     * Key prefix in the destination bucket.
     *
     * Must be &lt;=104 characters
     *
     * Default: "/" (unzip to root of the destination bucket)
     *
     * @param destinationKeyPrefix Key prefix in the destination bucket. 
     */
    override fun destinationKeyPrefix(destinationKeyPrefix: String) {
      cdkBuilder.destinationKeyPrefix(destinationKeyPrefix)
    }

    /**
     * The CloudFront distribution using the destination bucket as an origin.
     *
     * Files in the distribution's edge caches will be invalidated after
     * files are uploaded to the destination bucket.
     *
     * Default: - No invalidation occurs
     *
     * @param distribution The CloudFront distribution using the destination bucket as an origin. 
     */
    override fun distribution(distribution: IDistribution) {
      cdkBuilder.distribution(distribution.let(IDistribution::unwrap))
    }

    /**
     * The file paths to invalidate in the CloudFront distribution.
     *
     * Default: - All files under the destination bucket key prefix will be invalidated.
     *
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution. 
     */
    override fun distributionPaths(distributionPaths: List<String>) {
      cdkBuilder.distributionPaths(distributionPaths)
    }

    /**
     * The file paths to invalidate in the CloudFront distribution.
     *
     * Default: - All files under the destination bucket key prefix will be invalidated.
     *
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution. 
     */
    override fun distributionPaths(vararg distributionPaths: String): Unit =
        distributionPaths(distributionPaths.toList())

    /**
     * The size of the AWS Lambda function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     *
     * @param ephemeralStorageSize The size of the AWS Lambda function’s /tmp directory in MiB. 
     */
    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

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
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command. 
     */
    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

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
     * @param exclude If this is set, matching files or objects will be excluded from the
     * deployment's sync command. 
     */
    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    /**
     * System-defined expires metadata to be set on all objects in the deployment.
     *
     * Default: - The objects in the distribution will not expire.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param expires System-defined expires metadata to be set on all objects in the deployment. 
     */
    override fun expires(expires: Expiration) {
      cdkBuilder.expires(expires.let(Expiration::unwrap))
    }

    /**
     * If this is set, the zip file will be synced to the destination S3 bucket and extracted.
     *
     * If false, the file will remain zipped in the destination bucket.
     *
     * Default: true
     *
     * @param extract If this is set, the zip file will be synced to the destination S3 bucket and
     * extracted. 
     */
    override fun extract(extract: Boolean) {
      cdkBuilder.extract(extract)
    }

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
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command. 
     */
    override fun include(include: List<String>) {
      cdkBuilder.include(include)
    }

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
     * @param include If this is set, matching files or objects will be included with the
     * deployment's sync command. 
     */
    override fun include(vararg include: String): Unit = include(include.toList())

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     *
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * The number of days that the lambda function's log events are kept in CloudWatch Logs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: logs.RetentionDays.INFINITE
     *
     * @param logRetention The number of days that the lambda function's log events are kept in
     * CloudWatch Logs. 
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the
     * files from the CDK bucket to the destination bucket.
     *
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     *
     * Default: 128
     *
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket. 
     */
    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * User-defined object metadata to be set on all objects in the deployment.
     *
     * Default: - No user metadata is set
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#UserMetadata)
     * @param metadata User-defined object metadata to be set on all objects in the deployment. 
     */
    override fun metadata(metadata: Map<String, String>) {
      cdkBuilder.metadata(metadata)
    }

    /**
     * If this is set to false, files in the destination bucket that do not exist in the asset, will
     * NOT be deleted during deployment (create/update).
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/sync.html)
     * @param prune If this is set to false, files in the destination bucket that do not exist in
     * the asset, will NOT be deleted during deployment (create/update). 
     */
    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

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
     * @param retainOnDelete If this is set to "false", the destination files will be deleted when
     * the resource is deleted or the destination is updated. 
     */
    override fun retainOnDelete(retainOnDelete: Boolean) {
      cdkBuilder.retainOnDelete(retainOnDelete)
    }

    /**
     * Execution role associated with this function.
     *
     * Default: - A role is automatically created
     *
     * @param role Execution role associated with this function. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * System-defined x-amz-server-side-encryption metadata to be set on all objects in the
     * deployment.
     *
     * Default: - Server side encryption is not used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param serverSideEncryption System-defined x-amz-server-side-encryption metadata to be set on
     * all objects in the deployment. 
     */
    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption::unwrap))
    }

    /**
     * System-defined x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects
     * in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param serverSideEncryptionAwsKmsKeyId System-defined
     * x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects in the deployment.
     * 
     */
    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

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
     * @param serverSideEncryptionCustomerAlgorithm System-defined
     * x-amz-server-side-encryption-customer-algorithm metadata to be set on all objects in the
     * deployment. 
     */
    override
        fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String) {
      cdkBuilder.serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm)
    }

    /**
     * If set to true, uploads will precompute the value of `x-amz-content-sha256` and include it in
     * the signed S3 request headers.
     *
     * Default: - `x-amz-content-sha256` will not be computed
     *
     * @param signContent If set to true, uploads will precompute the value of
     * `x-amz-content-sha256` and include it in the signed S3 request headers. 
     */
    override fun signContent(signContent: Boolean) {
      cdkBuilder.signContent(signContent)
    }

    /**
     * The sources from which to deploy the contents of this bucket.
     *
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    override fun sources(sources: List<ISource>) {
      cdkBuilder.sources(sources.map(ISource::unwrap))
    }

    /**
     * The sources from which to deploy the contents of this bucket.
     *
     * @param sources The sources from which to deploy the contents of this bucket. 
     */
    override fun sources(vararg sources: ISource): Unit = sources(sources.toList())

    /**
     * System-defined x-amz-storage-class metadata to be set on all objects in the deployment.
     *
     * Default: - Default storage-class for the bucket is used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param storageClass System-defined x-amz-storage-class metadata to be set on all objects in
     * the deployment. 
     */
    override fun storageClass(storageClass: StorageClass) {
      cdkBuilder.storageClass(storageClass.let(StorageClass::unwrap))
    }

    /**
     * Mount an EFS file system.
     *
     * Enable this if your assets are large and you encounter disk space errors.
     * Enabling this option will require a VPC to be specified.
     *
     * Default: - No EFS. Lambda has access only to 512MB of disk space.
     *
     * @param useEfs Mount an EFS file system. 
     */
    override fun useEfs(useEfs: Boolean) {
      cdkBuilder.useEfs(useEfs)
    }

    /**
     * The VPC network to place the deployment lambda handler in.
     *
     * This is required if `useEfs` is set.
     *
     * Default: None
     *
     * @param vpc The VPC network to place the deployment lambda handler in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Where in the VPC to place the deployment lambda handler.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Where in the VPC to place the deployment lambda handler.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where in the VPC to place the deployment lambda handler. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f8214998cf69e2cf8077f818ea3d759d9db2d009e57e5b6308913ae5364b64c")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * System-defined x-amz-website-redirect-location metadata to be set on all objects in the
     * deployment.
     *
     * Default: - No website redirection.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     * @param websiteRedirectLocation System-defined x-amz-website-redirect-location metadata to be
     * set on all objects in the deployment. 
     */
    override fun websiteRedirectLocation(websiteRedirectLocation: String) {
      cdkBuilder.websiteRedirectLocation(websiteRedirectLocation)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.BucketDeployment =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BucketDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BucketDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.BucketDeployment):
        BucketDeployment = BucketDeployment(cdkObject)

    internal fun unwrap(wrapped: BucketDeployment):
        software.amazon.awscdk.services.s3.deployment.BucketDeployment = wrapped.cdkObject
  }
}
