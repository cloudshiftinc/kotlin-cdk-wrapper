package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnExtensionAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrExtensionArn(): String = unwrap(this).getAttrExtensionArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun extensionIdentifier(): String? = unwrap(this).getExtensionIdentifier()

  public open fun extensionIdentifier(`value`: String) {
    unwrap(this).setExtensionIdentifier(`value`)
  }

  public open fun extensionVersionNumber(): Number? = unwrap(this).getExtensionVersionNumber()

  public open fun extensionVersionNumber(`value`: Number) {
    unwrap(this).setExtensionVersionNumber(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun extensionIdentifier(extensionIdentifier: String) {
    }

    public fun extensionVersionNumber(extensionVersionNumber: Number) {
    }

    public fun parameters(parameters: IResolvable) {
    }

    public fun parameters(parameters: Map<String, String>) {
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociation.Builder =
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociation.Builder.create(scope, id)

    public override fun extensionIdentifier(extensionIdentifier: String) {
      cdkBuilder.extensionIdentifier(extensionIdentifier)
    }

    public override fun extensionVersionNumber(extensionVersionNumber: Number) {
      cdkBuilder.extensionVersionNumber(extensionVersionNumber)
    }

    public override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    public override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    public override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.CfnExtensionAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExtensionAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExtensionAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociation):
        CfnExtensionAssociation = CfnExtensionAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnExtensionAssociation):
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociation = wrapped.cdkObject
  }
}
