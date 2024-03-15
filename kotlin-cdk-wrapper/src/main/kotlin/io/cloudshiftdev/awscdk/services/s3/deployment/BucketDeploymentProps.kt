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

public interface BucketDeploymentProps {
  public fun accessControl(): BucketAccessControl? =
      unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

  public fun cacheControl(): List<CacheControl> =
      unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

  public fun contentDisposition(): String? = unwrap(this).getContentDisposition()

  public fun contentEncoding(): String? = unwrap(this).getContentEncoding()

  public fun contentLanguage(): String? = unwrap(this).getContentLanguage()

  public fun contentType(): String? = unwrap(this).getContentType()

  public fun destinationBucket(): IBucket

  public fun destinationKeyPrefix(): String? = unwrap(this).getDestinationKeyPrefix()

  public fun distribution(): IDistribution? =
      unwrap(this).getDistribution()?.let(IDistribution::wrap)

  public fun distributionPaths(): List<String> = unwrap(this).getDistributionPaths() ?: emptyList()

  public fun ephemeralStorageSize(): Size? = unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

  public fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

  public fun extract(): Boolean? = unwrap(this).getExtract()

  public fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  public fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

  public fun prune(): Boolean? = unwrap(this).getPrune()

  public fun retainOnDelete(): Boolean? = unwrap(this).getRetainOnDelete()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun serverSideEncryption(): ServerSideEncryption? =
      unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

  public fun serverSideEncryptionAwsKmsKeyId(): String? =
      unwrap(this).getServerSideEncryptionAwsKmsKeyId()

  public fun serverSideEncryptionCustomerAlgorithm(): String? =
      unwrap(this).getServerSideEncryptionCustomerAlgorithm()

  public fun signContent(): Boolean? = unwrap(this).getSignContent()

  public fun sources(): List<ISource>

  public fun storageClass(): StorageClass? = unwrap(this).getStorageClass()?.let(StorageClass::wrap)

  public fun useEfs(): Boolean? = unwrap(this).getUseEfs()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public fun websiteRedirectLocation(): String? = unwrap(this).getWebsiteRedirectLocation()

  @CdkDslMarker
  public interface Builder {
    public fun accessControl(accessControl: BucketAccessControl)

    public fun cacheControl(cacheControl: List<CacheControl>)

    public fun cacheControl(vararg cacheControl: CacheControl)

    public fun contentDisposition(contentDisposition: String)

    public fun contentEncoding(contentEncoding: String)

    public fun contentLanguage(contentLanguage: String)

    public fun contentType(contentType: String)

    public fun destinationBucket(destinationBucket: IBucket)

    public fun destinationKeyPrefix(destinationKeyPrefix: String)

    public fun distribution(distribution: IDistribution)

    public fun distributionPaths(distributionPaths: List<String>)

    public fun distributionPaths(vararg distributionPaths: String)

    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun expires(expires: Expiration)

    public fun extract(extract: Boolean)

    public fun include(include: List<String>)

    public fun include(vararg include: String)

    public fun logGroup(logGroup: ILogGroup)

    public fun logRetention(logRetention: RetentionDays)

    public fun memoryLimit(memoryLimit: Number)

    public fun metadata(metadata: Map<String, String>)

    public fun prune(prune: Boolean)

    public fun retainOnDelete(retainOnDelete: Boolean)

    public fun role(role: IRole)

    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)

    public fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String)

    public fun signContent(signContent: Boolean)

    public fun sources(sources: List<ISource>)

    public fun sources(vararg sources: ISource)

    public fun storageClass(storageClass: StorageClass)

    public fun useEfs(useEfs: Boolean)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32097b1ef126d6fd90bcb5a0e01b05a54d6a9f22585dd07a12158a32a956d40f")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    public fun websiteRedirectLocation(websiteRedirectLocation: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder =
        software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.builder()

    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    override fun cacheControl(cacheControl: List<CacheControl>) {
      cdkBuilder.cacheControl(cacheControl.map(CacheControl::unwrap))
    }

    override fun cacheControl(vararg cacheControl: CacheControl): Unit =
        cacheControl(cacheControl.toList())

    override fun contentDisposition(contentDisposition: String) {
      cdkBuilder.contentDisposition(contentDisposition)
    }

    override fun contentEncoding(contentEncoding: String) {
      cdkBuilder.contentEncoding(contentEncoding)
    }

    override fun contentLanguage(contentLanguage: String) {
      cdkBuilder.contentLanguage(contentLanguage)
    }

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun destinationBucket(destinationBucket: IBucket) {
      cdkBuilder.destinationBucket(destinationBucket.let(IBucket::unwrap))
    }

    override fun destinationKeyPrefix(destinationKeyPrefix: String) {
      cdkBuilder.destinationKeyPrefix(destinationKeyPrefix)
    }

    override fun distribution(distribution: IDistribution) {
      cdkBuilder.distribution(distribution.let(IDistribution::unwrap))
    }

    override fun distributionPaths(distributionPaths: List<String>) {
      cdkBuilder.distributionPaths(distributionPaths)
    }

    override fun distributionPaths(vararg distributionPaths: String): Unit =
        distributionPaths(distributionPaths.toList())

    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun expires(expires: Expiration) {
      cdkBuilder.expires(expires.let(Expiration::unwrap))
    }

    override fun extract(extract: Boolean) {
      cdkBuilder.extract(extract)
    }

    override fun include(include: List<String>) {
      cdkBuilder.include(include)
    }

    override fun include(vararg include: String): Unit = include(include.toList())

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    override fun metadata(metadata: Map<String, String>) {
      cdkBuilder.metadata(metadata)
    }

    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    override fun retainOnDelete(retainOnDelete: Boolean) {
      cdkBuilder.retainOnDelete(retainOnDelete)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption::unwrap))
    }

    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    override
        fun serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm: String) {
      cdkBuilder.serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm)
    }

    override fun signContent(signContent: Boolean) {
      cdkBuilder.signContent(signContent)
    }

    override fun sources(sources: List<ISource>) {
      cdkBuilder.sources(sources.map(ISource::unwrap))
    }

    override fun sources(vararg sources: ISource): Unit = sources(sources.toList())

    override fun storageClass(storageClass: StorageClass) {
      cdkBuilder.storageClass(storageClass.let(StorageClass::unwrap))
    }

    override fun useEfs(useEfs: Boolean) {
      cdkBuilder.useEfs(useEfs)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32097b1ef126d6fd90bcb5a0e01b05a54d6a9f22585dd07a12158a32a956d40f")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    override fun websiteRedirectLocation(websiteRedirectLocation: String) {
      cdkBuilder.websiteRedirectLocation(websiteRedirectLocation)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps,
  ) : CdkObject(cdkObject), BucketDeploymentProps {
    override fun accessControl(): BucketAccessControl? =
        unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

    override fun cacheControl(): List<CacheControl> =
        unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

    override fun contentDisposition(): String? = unwrap(this).getContentDisposition()

    override fun contentEncoding(): String? = unwrap(this).getContentEncoding()

    override fun contentLanguage(): String? = unwrap(this).getContentLanguage()

    override fun contentType(): String? = unwrap(this).getContentType()

    override fun destinationBucket(): IBucket =
        unwrap(this).getDestinationBucket().let(IBucket::wrap)

    override fun destinationKeyPrefix(): String? = unwrap(this).getDestinationKeyPrefix()

    override fun distribution(): IDistribution? =
        unwrap(this).getDistribution()?.let(IDistribution::wrap)

    override fun distributionPaths(): List<String> = unwrap(this).getDistributionPaths() ?:
        emptyList()

    override fun ephemeralStorageSize(): Size? =
        unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    override fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

    override fun extract(): Boolean? = unwrap(this).getExtract()

    override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

    override fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

    override fun prune(): Boolean? = unwrap(this).getPrune()

    override fun retainOnDelete(): Boolean? = unwrap(this).getRetainOnDelete()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun serverSideEncryption(): ServerSideEncryption? =
        unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

    override fun serverSideEncryptionAwsKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionAwsKmsKeyId()

    override fun serverSideEncryptionCustomerAlgorithm(): String? =
        unwrap(this).getServerSideEncryptionCustomerAlgorithm()

    override fun signContent(): Boolean? = unwrap(this).getSignContent()

    override fun sources(): List<ISource> = unwrap(this).getSources().map(ISource::wrap)

    override fun storageClass(): StorageClass? =
        unwrap(this).getStorageClass()?.let(StorageClass::wrap)

    override fun useEfs(): Boolean? = unwrap(this).getUseEfs()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

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
