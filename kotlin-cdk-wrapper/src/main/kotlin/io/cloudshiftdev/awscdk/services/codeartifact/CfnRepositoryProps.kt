@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeartifact

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRepositoryProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun domainName(): String

  public fun domainOwner(): String? = unwrap(this).getDomainOwner()

  public fun externalConnections(): List<String> = unwrap(this).getExternalConnections() ?:
      emptyList()

  public fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

  public fun repositoryName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun upstreams(): List<String> = unwrap(this).getUpstreams() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun domainName(domainName: String)

    public fun domainOwner(domainOwner: String)

    public fun externalConnections(externalConnections: List<String>)

    public fun externalConnections(vararg externalConnections: String)

    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any)

    public fun repositoryName(repositoryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun upstreams(upstreams: List<String>)

    public fun upstreams(vararg upstreams: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnRepositoryProps.Builder
        = software.amazon.awscdk.services.codeartifact.CfnRepositoryProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainOwner(domainOwner: String) {
      cdkBuilder.domainOwner(domainOwner)
    }

    override fun externalConnections(externalConnections: List<String>) {
      cdkBuilder.externalConnections(externalConnections)
    }

    override fun externalConnections(vararg externalConnections: String): Unit =
        externalConnections(externalConnections.toList())

    override fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
      cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun upstreams(upstreams: List<String>) {
      cdkBuilder.upstreams(upstreams)
    }

    override fun upstreams(vararg upstreams: String): Unit = upstreams(upstreams.toList())

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepositoryProps,
  ) : CdkObject(cdkObject), CfnRepositoryProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun domainOwner(): String? = unwrap(this).getDomainOwner()

    override fun externalConnections(): List<String> = unwrap(this).getExternalConnections() ?:
        emptyList()

    override fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun upstreams(): List<String> = unwrap(this).getUpstreams() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepositoryProps):
        CfnRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryProps):
        software.amazon.awscdk.services.codeartifact.CfnRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeartifact.CfnRepositoryProps
  }
}
