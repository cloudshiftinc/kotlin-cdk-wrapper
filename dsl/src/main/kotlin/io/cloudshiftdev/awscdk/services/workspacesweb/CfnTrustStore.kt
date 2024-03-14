package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrustStore internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStore,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns()

  public open fun attrTrustStoreArn(): String = unwrap(this).getAttrTrustStoreArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun certificateList(): List<String> = unwrap(this).getCertificateList()

  public open fun certificateList(`value`: List<String>) {
    unwrap(this).setCertificateList(`value`)
  }

  public open fun certificateList(vararg `value`: String): Unit = certificateList(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun certificateList(certificateList: List<String>)

    public fun certificateList(vararg certificateList: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnTrustStore.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnTrustStore.Builder.create(scope, id)

    override fun certificateList(certificateList: List<String>) {
      cdkBuilder.certificateList(certificateList)
    }

    override fun certificateList(vararg certificateList: String): Unit =
        certificateList(certificateList.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnTrustStore =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrustStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrustStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStore):
        CfnTrustStore = CfnTrustStore(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStore):
        software.amazon.awscdk.services.workspacesweb.CfnTrustStore = wrapped.cdkObject
  }
}
