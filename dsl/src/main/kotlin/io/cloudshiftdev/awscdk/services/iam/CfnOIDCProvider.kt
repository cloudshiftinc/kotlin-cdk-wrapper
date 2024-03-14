package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOIDCProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProvider,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun clientIdList(): List<String> = unwrap(this).getClientIdList() ?: emptyList()

  public open fun clientIdList(`value`: List<String>) {
    unwrap(this).setClientIdList(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun thumbprintList(): List<String> = unwrap(this).getThumbprintList() ?: emptyList()

  public open fun thumbprintList(`value`: List<String>) {
    unwrap(this).setThumbprintList(`value`)
  }

  public open fun url(): String? = unwrap(this).getUrl()

  public open fun url(`value`: String) {
    unwrap(this).setUrl(`value`)
  }

  public interface Builder {
    public fun clientIdList(clientIdList: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun thumbprintList(thumbprintList: List<String>) {
    }

    public fun url(url: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnOIDCProvider.Builder =
        software.amazon.awscdk.services.iam.CfnOIDCProvider.Builder.create(scope, id)

    public override fun clientIdList(clientIdList: List<String>) {
      cdkBuilder.clientIdList(clientIdList)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun thumbprintList(thumbprintList: List<String>) {
      cdkBuilder.thumbprintList(thumbprintList)
    }

    public override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnOIDCProvider = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOIDCProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOIDCProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProvider):
        CfnOIDCProvider = CfnOIDCProvider(cdkObject)

    internal fun unwrap(wrapped: CfnOIDCProvider):
        software.amazon.awscdk.services.iam.CfnOIDCProvider = wrapped.cdkObject
  }
}
