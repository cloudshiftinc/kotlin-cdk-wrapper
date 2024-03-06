@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3.deployment

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Expiration
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.cloudfront.IDistribution
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.s3.BucketAccessControl
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.BucketDeployment
import software.amazon.awscdk.services.s3.deployment.CacheControl
import software.amazon.awscdk.services.s3.deployment.ISource
import software.amazon.awscdk.services.s3.deployment.ServerSideEncryption
import software.amazon.awscdk.services.s3.deployment.StorageClass
import software.constructs.Construct

/**
 * `BucketDeployment` populates an S3 bucket with the contents of .zip files from other S3 buckets
 * or from local disk.
 *
 * Example:
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
@CdkDslMarker
public class BucketDeploymentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BucketDeployment.Builder = BucketDeployment.Builder.create(scope, id)

    private val _cacheControl: MutableList<CacheControl> = mutableListOf()

    private val _distributionPaths: MutableList<String> = mutableListOf()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _include: MutableList<String> = mutableListOf()

    private val _sources: MutableList<ISource> = mutableListOf()

    /**
     * System-defined x-amz-acl metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl)
     *
     * @param accessControl System-defined x-amz-acl metadata to be set on all objects in the
     *   deployment.
     */
    public fun accessControl(accessControl: BucketAccessControl) {
        cdkBuilder.accessControl(accessControl)
    }

    /**
     * System-defined cache-control metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     *   deployment.
     */
    public fun cacheControl(vararg cacheControl: CacheControl) {
        _cacheControl.addAll(listOf(*cacheControl))
    }

    /**
     * System-defined cache-control metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param cacheControl System-defined cache-control metadata to be set on all objects in the
     *   deployment.
     */
    public fun cacheControl(cacheControl: Collection<CacheControl>) {
        _cacheControl.addAll(cacheControl)
    }

    /**
     * System-defined cache-disposition metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param contentDisposition System-defined cache-disposition metadata to be set on all objects
     *   in the deployment.
     */
    public fun contentDisposition(contentDisposition: String) {
        cdkBuilder.contentDisposition(contentDisposition)
    }

    /**
     * System-defined content-encoding metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param contentEncoding System-defined content-encoding metadata to be set on all objects in
     *   the deployment.
     */
    public fun contentEncoding(contentEncoding: String) {
        cdkBuilder.contentEncoding(contentEncoding)
    }

    /**
     * System-defined content-language metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param contentLanguage System-defined content-language metadata to be set on all objects in
     *   the deployment.
     */
    public fun contentLanguage(contentLanguage: String) {
        cdkBuilder.contentLanguage(contentLanguage)
    }

    /**
     * System-defined content-type metadata to be set on all objects in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param contentType System-defined content-type metadata to be set on all objects in the
     *   deployment.
     */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /**
     * The S3 bucket to sync the contents of the zip file to.
     *
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to.
     */
    public fun destinationBucket(destinationBucket: IBucket) {
        cdkBuilder.destinationBucket(destinationBucket)
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
    public fun destinationKeyPrefix(destinationKeyPrefix: String) {
        cdkBuilder.destinationKeyPrefix(destinationKeyPrefix)
    }

    /**
     * The CloudFront distribution using the destination bucket as an origin.
     *
     * Files in the distribution's edge caches will be invalidated after files are uploaded to the
     * destination bucket.
     *
     * Default: - No invalidation occurs
     *
     * @param distribution The CloudFront distribution using the destination bucket as an origin.
     */
    public fun distribution(distribution: IDistribution) {
        cdkBuilder.distribution(distribution)
    }

    /**
     * The file paths to invalidate in the CloudFront distribution.
     *
     * Default: - All files under the destination bucket key prefix will be invalidated.
     *
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
     */
    public fun distributionPaths(vararg distributionPaths: String) {
        _distributionPaths.addAll(listOf(*distributionPaths))
    }

    /**
     * The file paths to invalidate in the CloudFront distribution.
     *
     * Default: - All files under the destination bucket key prefix will be invalidated.
     *
     * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
     */
    public fun distributionPaths(distributionPaths: Collection<String>) {
        _distributionPaths.addAll(distributionPaths)
    }

    /**
     * The size of the AWS Lambda function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     *
     * @param ephemeralStorageSize The size of the AWS Lambda function’s /tmp directory in MiB.
     */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size) {
        cdkBuilder.ephemeralStorageSize(ephemeralStorageSize)
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
     *
     * @param exclude If this is set, matching files or objects will be excluded from the
     *   deployment's sync command.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
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
     *
     * @param exclude If this is set, matching files or objects will be excluded from the
     *   deployment's sync command.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /**
     * System-defined expires metadata to be set on all objects in the deployment.
     *
     * Default: - The objects in the distribution will not expire.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param expires System-defined expires metadata to be set on all objects in the deployment.
     */
    public fun expires(expires: Expiration) {
        cdkBuilder.expires(expires)
    }

    /**
     * If this is set, the zip file will be synced to the destination S3 bucket and extracted.
     *
     * If false, the file will remain zipped in the destination bucket.
     *
     * Default: true
     *
     * @param extract If this is set, the zip file will be synced to the destination S3 bucket and
     *   extracted.
     */
    public fun extract(extract: Boolean) {
        cdkBuilder.extract(extract)
    }

    /**
     * If this is set, matching files or objects will be included with the deployment's sync
     * command.
     *
     * Since all files from the deployment package are included by default, this property is usually
     * leveraged alongside an `exclude` filter.
     *
     * Default: - No include filters are used and all files are included with the sync command
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/index.html#use-of-exclude-and-include-filters)
     *
     * @param include If this is set, matching files or objects will be included with the
     *   deployment's sync command.
     */
    public fun include(vararg include: String) {
        _include.addAll(listOf(*include))
    }

    /**
     * If this is set, matching files or objects will be included with the deployment's sync
     * command.
     *
     * Since all files from the deployment package are included by default, this property is usually
     * leveraged alongside an `exclude` filter.
     *
     * Default: - No include filters are used and all files are included with the sync command
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/index.html#use-of-exclude-and-include-filters)
     *
     * @param include If this is set, matching files or objects will be included with the
     *   deployment's sync command.
     */
    public fun include(include: Collection<String>) {
        _include.addAll(include)
    }

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16. If
     * you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     *
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     *   lambda function.
     */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
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
     *   CloudWatch Logs.
     */
    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    /**
     * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the
     * files from the CDK bucket to the destination bucket.
     *
     * If you are deploying large files, you will need to increase this number accordingly.
     *
     * Default: 128
     *
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     *   replicates the files from the CDK bucket to the destination bucket.
     */
    public fun memoryLimit(memoryLimit: Number) {
        cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * User-defined object metadata to be set on all objects in the deployment.
     *
     * Default: - No user metadata is set
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#UserMetadata)
     *
     * @param metadata User-defined object metadata to be set on all objects in the deployment.
     */
    public fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
    }

    /**
     * If this is set to false, files in the destination bucket that do not exist in the asset, will
     * NOT be deleted during deployment (create/update).
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/s3/sync.html)
     *
     * @param prune If this is set to false, files in the destination bucket that do not exist in
     *   the asset, will NOT be deleted during deployment (create/update).
     */
    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    /**
     * If this is set to "false", the destination files will be deleted when the resource is deleted
     * or the destination is updated.
     *
     * NOTICE: Configuring this to "false" might have operational implications. Please visit to the
     * package documentation referred below to make sure you fully understand those implications.
     *
     * Default: true - when resource is deleted/updated, files are retained
     *
     * [Documentation](https://github.com/aws/aws-cdk/tree/main/packages/aws-cdk-lib/aws-s3-deployment#retain-on-delete)
     *
     * @param retainOnDelete If this is set to "false", the destination files will be deleted when
     *   the resource is deleted or the destination is updated.
     */
    public fun retainOnDelete(retainOnDelete: Boolean) {
        cdkBuilder.retainOnDelete(retainOnDelete)
    }

    /**
     * Execution role associated with this function.
     *
     * Default: - A role is automatically created
     *
     * @param role Execution role associated with this function.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * System-defined x-amz-server-side-encryption metadata to be set on all objects in the
     * deployment.
     *
     * Default: - Server side encryption is not used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param serverSideEncryption System-defined x-amz-server-side-encryption metadata to be set on
     *   all objects in the deployment.
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
        cdkBuilder.serverSideEncryption(serverSideEncryption)
    }

    /**
     * System-defined x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects
     * in the deployment.
     *
     * Default: - Not set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param serverSideEncryptionAwsKmsKeyId System-defined
     *   x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects in the
     *   deployment.
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
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
     *
     * @param serverSideEncryptionCustomerAlgorithm System-defined
     *   x-amz-server-side-encryption-customer-algorithm metadata to be set on all objects in the
     *   deployment.
     */
    public fun serverSideEncryptionCustomerAlgorithm(
        serverSideEncryptionCustomerAlgorithm: String
    ) {
        cdkBuilder.serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm)
    }

    /**
     * If set to true, uploads will precompute the value of `x-amz-content-sha256` and include it in
     * the signed S3 request headers.
     *
     * Default: - `x-amz-content-sha256` will not be computed
     *
     * @param signContent If set to true, uploads will precompute the value of
     *   `x-amz-content-sha256` and include it in the signed S3 request headers.
     */
    public fun signContent(signContent: Boolean) {
        cdkBuilder.signContent(signContent)
    }

    /**
     * The sources from which to deploy the contents of this bucket.
     *
     * @param sources The sources from which to deploy the contents of this bucket.
     */
    public fun sources(vararg sources: ISource) {
        _sources.addAll(listOf(*sources))
    }

    /**
     * The sources from which to deploy the contents of this bucket.
     *
     * @param sources The sources from which to deploy the contents of this bucket.
     */
    public fun sources(sources: Collection<ISource>) {
        _sources.addAll(sources)
    }

    /**
     * System-defined x-amz-storage-class metadata to be set on all objects in the deployment.
     *
     * Default: - Default storage-class for the bucket is used.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param storageClass System-defined x-amz-storage-class metadata to be set on all objects in
     *   the deployment.
     */
    public fun storageClass(storageClass: StorageClass) {
        cdkBuilder.storageClass(storageClass)
    }

    /**
     * Mount an EFS file system.
     *
     * Enable this if your assets are large and you encounter disk space errors. Enabling this
     * option will require a VPC to be specified.
     *
     * Default: - No EFS. Lambda has access only to 512MB of disk space.
     *
     * @param useEfs Mount an EFS file system.
     */
    public fun useEfs(useEfs: Boolean) {
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
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
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
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
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
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    /**
     * System-defined x-amz-website-redirect-location metadata to be set on all objects in the
     * deployment.
     *
     * Default: - No website redirection.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#SysMetadata)
     *
     * @param websiteRedirectLocation System-defined x-amz-website-redirect-location metadata to be
     *   set on all objects in the deployment.
     */
    public fun websiteRedirectLocation(websiteRedirectLocation: String) {
        cdkBuilder.websiteRedirectLocation(websiteRedirectLocation)
    }

    public fun build(): BucketDeployment {
        if (_cacheControl.isNotEmpty()) cdkBuilder.cacheControl(_cacheControl)
        if (_distributionPaths.isNotEmpty()) cdkBuilder.distributionPaths(_distributionPaths)
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_include.isNotEmpty()) cdkBuilder.include(_include)
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
