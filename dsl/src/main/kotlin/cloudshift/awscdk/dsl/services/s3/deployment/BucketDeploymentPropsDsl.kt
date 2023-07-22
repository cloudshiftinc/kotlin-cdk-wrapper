@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
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
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.s3.BucketAccessControl
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps
import software.amazon.awscdk.services.s3.deployment.CacheControl
import software.amazon.awscdk.services.s3.deployment.ISource
import software.amazon.awscdk.services.s3.deployment.ServerSideEncryption
import software.amazon.awscdk.services.s3.deployment.StorageClass

@CdkDslMarker
public class BucketDeploymentPropsDsl {
  private val cdkBuilder: BucketDeploymentProps.Builder = BucketDeploymentProps.builder()

  private val _cacheControl: MutableList<CacheControl> = mutableListOf()

  private val _distributionPaths: MutableList<String> = mutableListOf()

  private val _exclude: MutableList<String> = mutableListOf()

  private val _include: MutableList<String> = mutableListOf()

  private val _sources: MutableList<ISource> = mutableListOf()

  /**
   * @param accessControl System-defined x-amz-acl metadata to be set on all objects in the
   * deployment.
   */
  public fun accessControl(accessControl: BucketAccessControl) {
    cdkBuilder.accessControl(accessControl)
  }

  /**
   * @param cacheControl System-defined cache-control metadata to be set on all objects in the
   * deployment.
   */
  public fun cacheControl(vararg cacheControl: CacheControl) {
    _cacheControl.addAll(listOf(*cacheControl))
  }

  /**
   * @param cacheControl System-defined cache-control metadata to be set on all objects in the
   * deployment.
   */
  public fun cacheControl(cacheControl: Collection<CacheControl>) {
    _cacheControl.addAll(cacheControl)
  }

  /**
   * @param contentDisposition System-defined cache-disposition metadata to be set on all objects in
   * the deployment.
   */
  public fun contentDisposition(contentDisposition: String) {
    cdkBuilder.contentDisposition(contentDisposition)
  }

  /**
   * @param contentEncoding System-defined content-encoding metadata to be set on all objects in the
   * deployment.
   */
  public fun contentEncoding(contentEncoding: String) {
    cdkBuilder.contentEncoding(contentEncoding)
  }

  /**
   * @param contentLanguage System-defined content-language metadata to be set on all objects in the
   * deployment.
   */
  public fun contentLanguage(contentLanguage: String) {
    cdkBuilder.contentLanguage(contentLanguage)
  }

  /**
   * @param contentType System-defined content-type metadata to be set on all objects in the
   * deployment.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param destinationBucket The S3 bucket to sync the contents of the zip file to. 
   */
  public fun destinationBucket(destinationBucket: IBucket) {
    cdkBuilder.destinationBucket(destinationBucket)
  }

  /**
   * @param destinationKeyPrefix Key prefix in the destination bucket.
   * Must be &lt;=104 characters
   */
  public fun destinationKeyPrefix(destinationKeyPrefix: String) {
    cdkBuilder.destinationKeyPrefix(destinationKeyPrefix)
  }

  /**
   * @param distribution The CloudFront distribution using the destination bucket as an origin.
   * Files in the distribution's edge caches will be invalidated after
   * files are uploaded to the destination bucket.
   */
  public fun distribution(distribution: IDistribution) {
    cdkBuilder.distribution(distribution)
  }

  /**
   * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
   */
  public fun distributionPaths(vararg distributionPaths: String) {
    _distributionPaths.addAll(listOf(*distributionPaths))
  }

  /**
   * @param distributionPaths The file paths to invalidate in the CloudFront distribution.
   */
  public fun distributionPaths(distributionPaths: Collection<String>) {
    _distributionPaths.addAll(distributionPaths)
  }

  /**
   * @param ephemeralStorageSize The size of the AWS Lambda function’s /tmp directory in MiB.
   */
  public fun ephemeralStorageSize(ephemeralStorageSize: Size) {
    cdkBuilder.ephemeralStorageSize(ephemeralStorageSize)
  }

  /**
   * @param exclude If this is set, matching files or objects will be excluded from the deployment's
   * sync command.
   * This can be used to exclude a file from being pruned in the destination bucket.
   *
   * If you want to just exclude files from the deployment package (which excludes these files
   * evaluated when invalidating the asset), you should leverage the `exclude` property of
   * `AssetOptions` when defining your source.
   */
  public fun exclude(vararg exclude: String) {
    _exclude.addAll(listOf(*exclude))
  }

  /**
   * @param exclude If this is set, matching files or objects will be excluded from the deployment's
   * sync command.
   * This can be used to exclude a file from being pruned in the destination bucket.
   *
   * If you want to just exclude files from the deployment package (which excludes these files
   * evaluated when invalidating the asset), you should leverage the `exclude` property of
   * `AssetOptions` when defining your source.
   */
  public fun exclude(exclude: Collection<String>) {
    _exclude.addAll(exclude)
  }

  /**
   * @param expires System-defined expires metadata to be set on all objects in the deployment.
   */
  public fun expires(expires: Expiration) {
    cdkBuilder.expires(expires)
  }

  /**
   * @param extract If this is set, the zip file will be synced to the destination S3 bucket and
   * extracted.
   * If false, the file will remain zipped in the destination bucket.
   */
  public fun extract(extract: Boolean) {
    cdkBuilder.extract(extract)
  }

  /**
   * @param include If this is set, matching files or objects will be included with the deployment's
   * sync command.
   * Since all files from the deployment package are included by default, this property
   * is usually leveraged alongside an `exclude` filter.
   */
  public fun include(vararg include: String) {
    _include.addAll(listOf(*include))
  }

  /**
   * @param include If this is set, matching files or objects will be included with the deployment's
   * sync command.
   * Since all files from the deployment package are included by default, this property
   * is usually leveraged alongside an `exclude` filter.
   */
  public fun include(include: Collection<String>) {
    _include.addAll(include)
  }

  /**
   * @param logRetention The number of days that the lambda function's log events are kept in
   * CloudWatch Logs.
   */
  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  /**
   * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
   * replicates the files from the CDK bucket to the destination bucket.
   * If you are deploying large files, you will need to increase this number
   * accordingly.
   */
  public fun memoryLimit(memoryLimit: Number) {
    cdkBuilder.memoryLimit(memoryLimit)
  }

  /**
   * @param metadata User-defined object metadata to be set on all objects in the deployment.
   */
  public fun metadata(metadata: Map<String, String>) {
    cdkBuilder.metadata(metadata)
  }

  /**
   * @param prune If this is set to false, files in the destination bucket that do not exist in the
   * asset, will NOT be deleted during deployment (create/update).
   */
  public fun prune(prune: Boolean) {
    cdkBuilder.prune(prune)
  }

  /**
   * @param retainOnDelete If this is set to "false", the destination files will be deleted when the
   * resource is deleted or the destination is updated.
   * NOTICE: Configuring this to "false" might have operational implications. Please
   * visit to the package documentation referred below to make sure you fully understand those
   * implications.
   */
  public fun retainOnDelete(retainOnDelete: Boolean) {
    cdkBuilder.retainOnDelete(retainOnDelete)
  }

  /**
   * @param role Execution role associated with this function.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param serverSideEncryption System-defined x-amz-server-side-encryption metadata to be set on
   * all objects in the deployment.
   */
  public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
    cdkBuilder.serverSideEncryption(serverSideEncryption)
  }

  /**
   * @param serverSideEncryptionAwsKmsKeyId System-defined
   * x-amz-server-side-encryption-aws-kms-key-id metadata to be set on all objects in the deployment.
   */
  public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
    cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
  }

  /**
   * @param serverSideEncryptionCustomerAlgorithm System-defined
   * x-amz-server-side-encryption-customer-algorithm metadata to be set on all objects in the
   * deployment.
   * Warning: This is not a useful parameter until this bug is fixed:
   * https://github.com/aws/aws-cdk/issues/6080
   */
  public fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String) {
    cdkBuilder.serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm)
  }

  /**
   * @param signContent If set to true, uploads will precompute the value of `x-amz-content-sha256`
   * and include it in the signed S3 request headers.
   */
  public fun signContent(signContent: Boolean) {
    cdkBuilder.signContent(signContent)
  }

  /**
   * @param sources The sources from which to deploy the contents of this bucket. 
   */
  public fun sources(vararg sources: ISource) {
    _sources.addAll(listOf(*sources))
  }

  /**
   * @param sources The sources from which to deploy the contents of this bucket. 
   */
  public fun sources(sources: Collection<ISource>) {
    _sources.addAll(sources)
  }

  /**
   * @param storageClass System-defined x-amz-storage-class metadata to be set on all objects in the
   * deployment.
   */
  public fun storageClass(storageClass: StorageClass) {
    cdkBuilder.storageClass(storageClass)
  }

  /**
   * @param useEfs Mount an EFS file system.
   * Enable this if your assets are large and you encounter disk space errors.
   * Enabling this option will require a VPC to be specified.
   */
  public fun useEfs(useEfs: Boolean) {
    cdkBuilder.useEfs(useEfs)
  }

  /**
   * @param vpc The VPC network to place the deployment lambda handler in.
   * This is required if `useEfs` is set.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpcSubnets Where in the VPC to place the deployment lambda handler.
   * Only used if 'vpc' is supplied.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * @param vpcSubnets Where in the VPC to place the deployment lambda handler.
   * Only used if 'vpc' is supplied.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  /**
   * @param websiteRedirectLocation System-defined x-amz-website-redirect-location metadata to be
   * set on all objects in the deployment.
   */
  public fun websiteRedirectLocation(websiteRedirectLocation: String) {
    cdkBuilder.websiteRedirectLocation(websiteRedirectLocation)
  }

  public fun build(): BucketDeploymentProps {
    if(_cacheControl.isNotEmpty()) cdkBuilder.cacheControl(_cacheControl)
    if(_distributionPaths.isNotEmpty()) cdkBuilder.distributionPaths(_distributionPaths)
    if(_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
    if(_include.isNotEmpty()) cdkBuilder.include(_include)
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    return cdkBuilder.build()
  }
}
