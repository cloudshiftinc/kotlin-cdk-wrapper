@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrustStore internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrNumberOfCaCertificates(): Number =
      unwrap(this).getAttrNumberOfCaCertificates()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrTrustStoreArn(): String = unwrap(this).getAttrTrustStoreArn()

  public open fun caCertificatesBundleS3Bucket(): String? =
      unwrap(this).getCaCertificatesBundleS3Bucket()

  public open fun caCertificatesBundleS3Bucket(`value`: String) {
    unwrap(this).setCaCertificatesBundleS3Bucket(`value`)
  }

  public open fun caCertificatesBundleS3Key(): String? = unwrap(this).getCaCertificatesBundleS3Key()

  public open fun caCertificatesBundleS3Key(`value`: String) {
    unwrap(this).setCaCertificatesBundleS3Key(`value`)
  }

  public open fun caCertificatesBundleS3ObjectVersion(): String? =
      unwrap(this).getCaCertificatesBundleS3ObjectVersion()

  public open fun caCertificatesBundleS3ObjectVersion(`value`: String) {
    unwrap(this).setCaCertificatesBundleS3ObjectVersion(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String)

    public fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String)

    public fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrustStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrustStore(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore):
        CfnTrustStore = CfnTrustStore(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStore):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore = wrapped.cdkObject
  }
}
