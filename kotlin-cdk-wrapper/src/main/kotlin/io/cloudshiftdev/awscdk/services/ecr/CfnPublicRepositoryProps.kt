@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPublicRepositoryProps {
  public fun repositoryCatalogData(): Any? = unwrap(this).getRepositoryCatalogData()

  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  public fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun repositoryCatalogData(repositoryCatalogData: Any)

    public fun repositoryName(repositoryName: String)

    public fun repositoryPolicyText(repositoryPolicyText: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps.Builder =
        software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps.builder()

    override fun repositoryCatalogData(repositoryCatalogData: Any) {
      cdkBuilder.repositoryCatalogData(repositoryCatalogData)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps,
  ) : CdkObject(cdkObject), CfnPublicRepositoryProps {
    override fun repositoryCatalogData(): Any? = unwrap(this).getRepositoryCatalogData()

    override fun repositoryName(): String? = unwrap(this).getRepositoryName()

    override fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps):
        CfnPublicRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicRepositoryProps):
        software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps
  }
}
