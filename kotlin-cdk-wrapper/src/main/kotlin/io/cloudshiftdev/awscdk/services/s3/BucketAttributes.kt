@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface BucketAttributes {
  public fun account(): String? = unwrap(this).getAccount()

  public fun bucketArn(): String? = unwrap(this).getBucketArn()

  public fun bucketDomainName(): String? = unwrap(this).getBucketDomainName()

  public fun bucketDualStackDomainName(): String? = unwrap(this).getBucketDualStackDomainName()

  public fun bucketName(): String? = unwrap(this).getBucketName()

  public fun bucketRegionalDomainName(): String? = unwrap(this).getBucketRegionalDomainName()

  @Deprecated(message = "deprecated in CDK")
  public fun bucketWebsiteNewUrlFormat(): Boolean? = unwrap(this).getBucketWebsiteNewUrlFormat()

  public fun bucketWebsiteUrl(): String? = unwrap(this).getBucketWebsiteUrl()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

  public fun notificationsHandlerRole(): IRole? =
      unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

  public fun region(): String? = unwrap(this).getRegion()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun bucketArn(bucketArn: String)

    public fun bucketDomainName(bucketDomainName: String)

    public fun bucketDualStackDomainName(bucketDualStackDomainName: String)

    public fun bucketName(bucketName: String)

    public fun bucketRegionalDomainName(bucketRegionalDomainName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat: Boolean)

    public fun bucketWebsiteUrl(bucketWebsiteUrl: String)

    public fun encryptionKey(encryptionKey: IKey)

    public fun isWebsite(isWebsite: Boolean)

    public fun notificationsHandlerRole(notificationsHandlerRole: IRole)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketAttributes.Builder =
        software.amazon.awscdk.services.s3.BucketAttributes.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun bucketArn(bucketArn: String) {
      cdkBuilder.bucketArn(bucketArn)
    }

    override fun bucketDomainName(bucketDomainName: String) {
      cdkBuilder.bucketDomainName(bucketDomainName)
    }

    override fun bucketDualStackDomainName(bucketDualStackDomainName: String) {
      cdkBuilder.bucketDualStackDomainName(bucketDualStackDomainName)
    }

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun bucketRegionalDomainName(bucketRegionalDomainName: String) {
      cdkBuilder.bucketRegionalDomainName(bucketRegionalDomainName)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat: Boolean) {
      cdkBuilder.bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat)
    }

    override fun bucketWebsiteUrl(bucketWebsiteUrl: String) {
      cdkBuilder.bucketWebsiteUrl(bucketWebsiteUrl)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun isWebsite(isWebsite: Boolean) {
      cdkBuilder.isWebsite(isWebsite)
    }

    override fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
      cdkBuilder.notificationsHandlerRole(notificationsHandlerRole.let(IRole::unwrap))
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.BucketAttributes,
  ) : CdkObject(cdkObject), BucketAttributes {
    override fun account(): String? = unwrap(this).getAccount()

    override fun bucketArn(): String? = unwrap(this).getBucketArn()

    override fun bucketDomainName(): String? = unwrap(this).getBucketDomainName()

    override fun bucketDualStackDomainName(): String? = unwrap(this).getBucketDualStackDomainName()

    override fun bucketName(): String? = unwrap(this).getBucketName()

    override fun bucketRegionalDomainName(): String? = unwrap(this).getBucketRegionalDomainName()

    @Deprecated(message = "deprecated in CDK")
    override fun bucketWebsiteNewUrlFormat(): Boolean? = unwrap(this).getBucketWebsiteNewUrlFormat()

    override fun bucketWebsiteUrl(): String? = unwrap(this).getBucketWebsiteUrl()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

    override fun notificationsHandlerRole(): IRole? =
        unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketAttributes):
        BucketAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketAttributes):
        software.amazon.awscdk.services.s3.BucketAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.BucketAttributes
  }
}
