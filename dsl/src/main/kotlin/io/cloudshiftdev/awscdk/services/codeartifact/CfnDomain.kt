package io.cloudshiftdev.awscdk.services.codeartifact

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codeartifact.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrEncryptionKey(): String = unwrap(this).getAttrEncryptionKey()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrOwner(): String = unwrap(this).getAttrOwner()

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

  public open fun permissionsPolicyDocument(`value`: Any) {
    unwrap(this).setPermissionsPolicyDocument(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun domainName(domainName: String) {
    }

    public fun encryptionKey(encryptionKey: String) {
    }

    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnDomain.Builder =
        software.amazon.awscdk.services.codeartifact.CfnDomain.Builder.create(scope, id)

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    public override fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
      cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnDomain): CfnDomain
        = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.codeartifact.CfnDomain
        = wrapped.cdkObject
  }
}
