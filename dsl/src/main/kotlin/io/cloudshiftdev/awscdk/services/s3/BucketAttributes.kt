package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface BucketAttributes {
  /**
   * The account this existing bucket belongs to.
   *
   * Default: - it's assumed the bucket belongs to the same account as the scope it's being imported
   * into
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   * The ARN of the bucket.
   *
   * At least one of bucketArn or bucketName must be
   * defined in order to initialize a bucket ref.
   */
  public fun bucketArn(): String? = unwrap(this).getBucketArn()

  /**
   * The domain name of the bucket.
   *
   * Default: - Inferred from bucket name
   */
  public fun bucketDomainName(): String? = unwrap(this).getBucketDomainName()

  /**
   * The IPv6 DNS name of the specified bucket.
   */
  public fun bucketDualStackDomainName(): String? = unwrap(this).getBucketDualStackDomainName()

  /**
   * The name of the bucket.
   *
   * If the underlying value of ARN is a string, the
   * name will be parsed from the ARN. Otherwise, the name is optional, but
   * some features that require the bucket name such as auto-creating a bucket
   * policy, won't work.
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * The regional domain name of the specified bucket.
   */
  public fun bucketRegionalDomainName(): String? = unwrap(this).getBucketRegionalDomainName()

  /**
   * (deprecated) Force the format of the website URL of the bucket.
   *
   * This should be true for
   * regions launched since 2014.
   *
   * Default: - inferred from available region information, `false` otherwise
   *
   * @deprecated The correct website url format can be inferred automatically from the bucket
   * `region`.
   * Always provide the bucket region if the `bucketWebsiteUrl` will be used.
   * Alternatively provide the full `bucketWebsiteUrl` manually.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun bucketWebsiteNewUrlFormat(): Boolean? = unwrap(this).getBucketWebsiteNewUrlFormat()

  /**
   * The website URL of the bucket (if static web hosting is enabled).
   *
   * Default: - Inferred from bucket name and region
   */
  public fun bucketWebsiteUrl(): String? = unwrap(this).getBucketWebsiteUrl()

  /**
   * KMS encryption key associated with this bucket.
   *
   * Default: - no encryption key
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * If this bucket has been configured for static website hosting.
   *
   * Default: false
   */
  public fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

  /**
   * The role to be used by the notifications handler.
   *
   * Default: - a new role will be created.
   */
  public fun notificationsHandlerRole(): IRole? =
      unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

  /**
   * The region this existing bucket is in.
   *
   * Features that require the region (e.g. `bucketWebsiteUrl`) won't fully work
   * if the region cannot be correctly inferred.
   *
   * Default: - it's assumed the bucket is in the same region as the scope it's being imported into
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [BucketAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The account this existing bucket belongs to.
     */
    public fun account(account: String)

    /**
     * @param bucketArn The ARN of the bucket.
     * At least one of bucketArn or bucketName must be
     * defined in order to initialize a bucket ref.
     */
    public fun bucketArn(bucketArn: String)

    /**
     * @param bucketDomainName The domain name of the bucket.
     */
    public fun bucketDomainName(bucketDomainName: String)

    /**
     * @param bucketDualStackDomainName The IPv6 DNS name of the specified bucket.
     */
    public fun bucketDualStackDomainName(bucketDualStackDomainName: String)

    /**
     * @param bucketName The name of the bucket.
     * If the underlying value of ARN is a string, the
     * name will be parsed from the ARN. Otherwise, the name is optional, but
     * some features that require the bucket name such as auto-creating a bucket
     * policy, won't work.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param bucketRegionalDomainName The regional domain name of the specified bucket.
     */
    public fun bucketRegionalDomainName(bucketRegionalDomainName: String)

    /**
     * @param bucketWebsiteNewUrlFormat Force the format of the website URL of the bucket.
     * This should be true for
     * regions launched since 2014.
     * @deprecated The correct website url format can be inferred automatically from the bucket
     * `region`.
     * Always provide the bucket region if the `bucketWebsiteUrl` will be used.
     * Alternatively provide the full `bucketWebsiteUrl` manually.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat: Boolean)

    /**
     * @param bucketWebsiteUrl The website URL of the bucket (if static web hosting is enabled).
     */
    public fun bucketWebsiteUrl(bucketWebsiteUrl: String)

    /**
     * @param encryptionKey KMS encryption key associated with this bucket.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param isWebsite If this bucket has been configured for static website hosting.
     */
    public fun isWebsite(isWebsite: Boolean)

    /**
     * @param notificationsHandlerRole The role to be used by the notifications handler.
     */
    public fun notificationsHandlerRole(notificationsHandlerRole: IRole)

    /**
     * @param region The region this existing bucket is in.
     * Features that require the region (e.g. `bucketWebsiteUrl`) won't fully work
     * if the region cannot be correctly inferred.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketAttributes.Builder =
        software.amazon.awscdk.services.s3.BucketAttributes.builder()

    /**
     * @param account The account this existing bucket belongs to.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param bucketArn The ARN of the bucket.
     * At least one of bucketArn or bucketName must be
     * defined in order to initialize a bucket ref.
     */
    override fun bucketArn(bucketArn: String) {
      cdkBuilder.bucketArn(bucketArn)
    }

    /**
     * @param bucketDomainName The domain name of the bucket.
     */
    override fun bucketDomainName(bucketDomainName: String) {
      cdkBuilder.bucketDomainName(bucketDomainName)
    }

    /**
     * @param bucketDualStackDomainName The IPv6 DNS name of the specified bucket.
     */
    override fun bucketDualStackDomainName(bucketDualStackDomainName: String) {
      cdkBuilder.bucketDualStackDomainName(bucketDualStackDomainName)
    }

    /**
     * @param bucketName The name of the bucket.
     * If the underlying value of ARN is a string, the
     * name will be parsed from the ARN. Otherwise, the name is optional, but
     * some features that require the bucket name such as auto-creating a bucket
     * policy, won't work.
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketRegionalDomainName The regional domain name of the specified bucket.
     */
    override fun bucketRegionalDomainName(bucketRegionalDomainName: String) {
      cdkBuilder.bucketRegionalDomainName(bucketRegionalDomainName)
    }

    /**
     * @param bucketWebsiteNewUrlFormat Force the format of the website URL of the bucket.
     * This should be true for
     * regions launched since 2014.
     * @deprecated The correct website url format can be inferred automatically from the bucket
     * `region`.
     * Always provide the bucket region if the `bucketWebsiteUrl` will be used.
     * Alternatively provide the full `bucketWebsiteUrl` manually.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat: Boolean) {
      cdkBuilder.bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat)
    }

    /**
     * @param bucketWebsiteUrl The website URL of the bucket (if static web hosting is enabled).
     */
    override fun bucketWebsiteUrl(bucketWebsiteUrl: String) {
      cdkBuilder.bucketWebsiteUrl(bucketWebsiteUrl)
    }

    /**
     * @param encryptionKey KMS encryption key associated with this bucket.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param isWebsite If this bucket has been configured for static website hosting.
     */
    override fun isWebsite(isWebsite: Boolean) {
      cdkBuilder.isWebsite(isWebsite)
    }

    /**
     * @param notificationsHandlerRole The role to be used by the notifications handler.
     */
    override fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
      cdkBuilder.notificationsHandlerRole(notificationsHandlerRole.let(IRole::unwrap))
    }

    /**
     * @param region The region this existing bucket is in.
     * Features that require the region (e.g. `bucketWebsiteUrl`) won't fully work
     * if the region cannot be correctly inferred.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.BucketAttributes,
  ) : BucketAttributes {
    /**
     * The account this existing bucket belongs to.
     *
     * Default: - it's assumed the bucket belongs to the same account as the scope it's being
     * imported into
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * The ARN of the bucket.
     *
     * At least one of bucketArn or bucketName must be
     * defined in order to initialize a bucket ref.
     */
    override fun bucketArn(): String? = unwrap(this).getBucketArn()

    /**
     * The domain name of the bucket.
     *
     * Default: - Inferred from bucket name
     */
    override fun bucketDomainName(): String? = unwrap(this).getBucketDomainName()

    /**
     * The IPv6 DNS name of the specified bucket.
     */
    override fun bucketDualStackDomainName(): String? = unwrap(this).getBucketDualStackDomainName()

    /**
     * The name of the bucket.
     *
     * If the underlying value of ARN is a string, the
     * name will be parsed from the ARN. Otherwise, the name is optional, but
     * some features that require the bucket name such as auto-creating a bucket
     * policy, won't work.
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The regional domain name of the specified bucket.
     */
    override fun bucketRegionalDomainName(): String? = unwrap(this).getBucketRegionalDomainName()

    /**
     * (deprecated) Force the format of the website URL of the bucket.
     *
     * This should be true for
     * regions launched since 2014.
     *
     * Default: - inferred from available region information, `false` otherwise
     *
     * @deprecated The correct website url format can be inferred automatically from the bucket
     * `region`.
     * Always provide the bucket region if the `bucketWebsiteUrl` will be used.
     * Alternatively provide the full `bucketWebsiteUrl` manually.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun bucketWebsiteNewUrlFormat(): Boolean? = unwrap(this).getBucketWebsiteNewUrlFormat()

    /**
     * The website URL of the bucket (if static web hosting is enabled).
     *
     * Default: - Inferred from bucket name and region
     */
    override fun bucketWebsiteUrl(): String? = unwrap(this).getBucketWebsiteUrl()

    /**
     * KMS encryption key associated with this bucket.
     *
     * Default: - no encryption key
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * If this bucket has been configured for static website hosting.
     *
     * Default: false
     */
    override fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

    /**
     * The role to be used by the notifications handler.
     *
     * Default: - a new role will be created.
     */
    override fun notificationsHandlerRole(): IRole? =
        unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

    /**
     * The region this existing bucket is in.
     *
     * Features that require the region (e.g. `bucketWebsiteUrl`) won't fully work
     * if the region cannot be correctly inferred.
     *
     * Default: - it's assumed the bucket is in the same region as the scope it's being imported
     * into
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BucketAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketAttributes):
        BucketAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketAttributes):
        software.amazon.awscdk.services.s3.BucketAttributes = (wrapped as Wrapper).cdkObject
  }
}
