@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrustStoreProps {
  public fun caCertificatesBundleS3Bucket(): String? =
      unwrap(this).getCaCertificatesBundleS3Bucket()

  public fun caCertificatesBundleS3Key(): String? = unwrap(this).getCaCertificatesBundleS3Key()

  public fun caCertificatesBundleS3ObjectVersion(): String? =
      unwrap(this).getCaCertificatesBundleS3ObjectVersion()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String)

    public fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String)

    public fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps.builder()

    override fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String) {
      cdkBuilder.caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket)
    }

    override fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String) {
      cdkBuilder.caCertificatesBundleS3Key(caCertificatesBundleS3Key)
    }

    override fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String) {
      cdkBuilder.caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps,
  ) : CdkObject(cdkObject), CfnTrustStoreProps {
    override fun caCertificatesBundleS3Bucket(): String? =
        unwrap(this).getCaCertificatesBundleS3Bucket()

    override fun caCertificatesBundleS3Key(): String? = unwrap(this).getCaCertificatesBundleS3Key()

    override fun caCertificatesBundleS3ObjectVersion(): String? =
        unwrap(this).getCaCertificatesBundleS3ObjectVersion()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrustStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps):
        CfnTrustStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStoreProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps
  }
}
