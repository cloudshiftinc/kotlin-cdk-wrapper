package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.Expiration
import io.cloudshiftdev.awscdk.Size
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
  private val cdkObject: software.amazon.awscdk.services.s3.deployment.BucketDeployment,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun addSource(source: ISource) {
    unwrap(this).addSource(source.let(ISource::unwrap))
  }

  public open fun deployedBucket(): IBucket = unwrap(this).getDeployedBucket().let(IBucket::wrap)

  public open fun objectKeys(): List<String> = unwrap(this).getObjectKeys() ?: emptyList()

  public interface Builder {
    public fun accessControl(accessControl: BucketAccessControl)

    public fun cacheControl(cacheControl: List<CacheControl>)

    public fun contentDisposition(contentDisposition: String)

    public fun contentEncoding(contentEncoding: String)

    public fun contentLanguage(contentLanguage: String)

    public fun contentType(contentType: String)

    public fun destinationBucket(destinationBucket: IBucket)

    public fun destinationKeyPrefix(destinationKeyPrefix: String)

    public fun distribution(distribution: IDistribution)

    public fun distributionPaths(distributionPaths: List<String>)

    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    public fun exclude(exclude: List<String>)

    public fun expires(expires: Expiration)

    public fun extract(extract: Boolean)

    public fun include(include: List<String>)

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

    public fun storageClass(storageClass: StorageClass)

    public fun useEfs(useEfs: Boolean)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f8214998cf69e2cf8077f818ea3d759d9db2d009e57e5b6308913ae5364b64c")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    public fun websiteRedirectLocation(websiteRedirectLocation: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.deployment.BucketDeployment.Builder =
        software.amazon.awscdk.services.s3.deployment.BucketDeployment.Builder.create(scope, id)

    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    override fun cacheControl(cacheControl: List<CacheControl>) {
      cdkBuilder.cacheControl(cacheControl.map(CacheControl::unwrap))
    }

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

    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun expires(expires: Expiration) {
      cdkBuilder.expires(expires.let(Expiration::unwrap))
    }

    override fun extract(extract: Boolean) {
      cdkBuilder.extract(extract)
    }

    override fun include(include: List<String>) {
      cdkBuilder.include(include)
    }

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f8214998cf69e2cf8077f818ea3d759d9db2d009e57e5b6308913ae5364b64c")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    override fun websiteRedirectLocation(websiteRedirectLocation: String) {
      cdkBuilder.websiteRedirectLocation(websiteRedirectLocation)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.BucketDeployment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
