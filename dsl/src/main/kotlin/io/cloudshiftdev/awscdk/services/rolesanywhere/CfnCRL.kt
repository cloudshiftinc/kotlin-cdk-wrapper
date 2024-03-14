package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCRL internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRL,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCrlId(): String = unwrap(this).getAttrCrlId()

  public open fun crlData(): String = unwrap(this).getCrlData()

  public open fun crlData(`value`: String) {
    unwrap(this).setCrlData(`value`)
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun trustAnchorArn(): String? = unwrap(this).getTrustAnchorArn()

  public open fun trustAnchorArn(`value`: String) {
    unwrap(this).setTrustAnchorArn(`value`)
  }

  public interface Builder {
    public fun crlData(crlData: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun enabled(enabled: IResolvable) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun trustAnchorArn(trustAnchorArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnCRL.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnCRL.Builder.create(scope, id)

    public override fun crlData(crlData: String) {
      cdkBuilder.crlData(crlData)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun trustAnchorArn(trustAnchorArn: String) {
      cdkBuilder.trustAnchorArn(trustAnchorArn)
    }

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnCRL = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCRL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCRL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRL): CfnCRL =
        CfnCRL(cdkObject)

    internal fun unwrap(wrapped: CfnCRL): software.amazon.awscdk.services.rolesanywhere.CfnCRL =
        wrapped.cdkObject
  }
}
