@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class BucketDeploymentPropsDsl {
    private val cdkBuilder: BucketDeploymentProps.Builder = BucketDeploymentProps.builder()

    private val _cacheControl: MutableList<CacheControl> = mutableListOf()

    private val _distributionPaths: MutableList<String> = mutableListOf()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _include: MutableList<String> = mutableListOf()

    private val _sources: MutableList<ISource> = mutableListOf()

    public fun accessControl(accessControl: BucketAccessControl) {
        cdkBuilder.accessControl(accessControl)
    }

    public fun cacheControl(vararg cacheControl: CacheControl) {
        _cacheControl.addAll(listOf(*cacheControl))
    }

    public fun cacheControl(cacheControl: Collection<CacheControl>) {
        _cacheControl.addAll(cacheControl)
    }

    public fun contentDisposition(contentDisposition: String) {
        cdkBuilder.contentDisposition(contentDisposition)
    }

    public fun contentEncoding(contentEncoding: String) {
        cdkBuilder.contentEncoding(contentEncoding)
    }

    public fun contentLanguage(contentLanguage: String) {
        cdkBuilder.contentLanguage(contentLanguage)
    }

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun destinationBucket(destinationBucket: IBucket) {
        cdkBuilder.destinationBucket(destinationBucket)
    }

    public fun destinationKeyPrefix(destinationKeyPrefix: String) {
        cdkBuilder.destinationKeyPrefix(destinationKeyPrefix)
    }

    public fun distribution(distribution: IDistribution) {
        cdkBuilder.distribution(distribution)
    }

    public fun distributionPaths(vararg distributionPaths: String) {
        _distributionPaths.addAll(listOf(*distributionPaths))
    }

    public fun distributionPaths(distributionPaths: Collection<String>) {
        _distributionPaths.addAll(distributionPaths)
    }

    public fun ephemeralStorageSize(ephemeralStorageSize: Size) {
        cdkBuilder.ephemeralStorageSize(ephemeralStorageSize)
    }

    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    public fun expires(expires: Expiration) {
        cdkBuilder.expires(expires)
    }

    public fun extract(extract: Boolean) {
        cdkBuilder.extract(extract)
    }

    public fun include(vararg include: String) {
        _include.addAll(listOf(*include))
    }

    public fun include(include: Collection<String>) {
        _include.addAll(include)
    }

    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    public fun memoryLimit(memoryLimit: Number) {
        cdkBuilder.memoryLimit(memoryLimit)
    }

    public fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
    }

    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    public fun retainOnDelete(retainOnDelete: Boolean) {
        cdkBuilder.retainOnDelete(retainOnDelete)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
        cdkBuilder.serverSideEncryption(serverSideEncryption)
    }

    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String) {
        cdkBuilder.serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm)
    }

    public fun signContent(signContent: Boolean) {
        cdkBuilder.signContent(signContent)
    }

    public fun sources(vararg sources: ISource) {
        _sources.addAll(listOf(*sources))
    }

    public fun sources(sources: Collection<ISource>) {
        _sources.addAll(sources)
    }

    public fun storageClass(storageClass: StorageClass) {
        cdkBuilder.storageClass(storageClass)
    }

    public fun useEfs(useEfs: Boolean) {
        cdkBuilder.useEfs(useEfs)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun websiteRedirectLocation(websiteRedirectLocation: String) {
        cdkBuilder.websiteRedirectLocation(websiteRedirectLocation)
    }

    public fun build(): BucketDeploymentProps {
        if (_cacheControl.isNotEmpty()) cdkBuilder.cacheControl(_cacheControl)
        if (_distributionPaths.isNotEmpty()) cdkBuilder.distributionPaths(_distributionPaths)
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_include.isNotEmpty()) cdkBuilder.include(_include)
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
