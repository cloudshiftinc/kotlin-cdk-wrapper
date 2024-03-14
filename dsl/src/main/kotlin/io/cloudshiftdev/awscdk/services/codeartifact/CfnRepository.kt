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

public open class CfnRepository internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrDomainOwner(): String = unwrap(this).getAttrDomainOwner()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun domainOwner(): String? = unwrap(this).getDomainOwner()

  public open fun domainOwner(`value`: String) {
    unwrap(this).setDomainOwner(`value`)
  }

  public open fun externalConnections(): List<String> = unwrap(this).getExternalConnections() ?:
      emptyList()

  public open fun externalConnections(`value`: List<String>) {
    unwrap(this).setExternalConnections(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

  public open fun permissionsPolicyDocument(`value`: Any) {
    unwrap(this).setPermissionsPolicyDocument(`value`)
  }

  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun upstreams(): List<String> = unwrap(this).getUpstreams() ?: emptyList()

  public open fun upstreams(`value`: List<String>) {
    unwrap(this).setUpstreams(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun domainName(domainName: String) {
    }

    public fun domainOwner(domainOwner: String) {
    }

    public fun externalConnections(externalConnections: List<String>) {
    }

    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
    }

    public fun repositoryName(repositoryName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun upstreams(upstreams: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnRepository.Builder =
        software.amazon.awscdk.services.codeartifact.CfnRepository.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun domainOwner(domainOwner: String) {
      cdkBuilder.domainOwner(domainOwner)
    }

    public override fun externalConnections(externalConnections: List<String>) {
      cdkBuilder.externalConnections(externalConnections)
    }

    public override fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
      cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    public override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun upstreams(upstreams: List<String>) {
      cdkBuilder.upstreams(upstreams)
    }

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnRepository =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepository):
        CfnRepository = CfnRepository(cdkObject)

    internal fun unwrap(wrapped: CfnRepository):
        software.amazon.awscdk.services.codeartifact.CfnRepository = wrapped.cdkObject
  }
}
