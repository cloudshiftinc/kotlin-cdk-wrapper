package io.cloudshiftdev.awscdk.services.ecr

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

public open class CfnPublicRepository internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun repositoryCatalogData(): Any? = unwrap(this).getRepositoryCatalogData()

  public open fun repositoryCatalogData(`value`: Any) {
    unwrap(this).setRepositoryCatalogData(`value`)
  }

  public open fun repositoryName(): String? = unwrap(this).getRepositoryName()

  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  public open fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  public open fun repositoryPolicyText(`value`: Any) {
    unwrap(this).setRepositoryPolicyText(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun repositoryCatalogData(repositoryCatalogData: Any) {
    }

    public fun repositoryName(repositoryName: String) {
    }

    public fun repositoryPolicyText(repositoryPolicyText: Any) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPublicRepository.Builder =
        software.amazon.awscdk.services.ecr.CfnPublicRepository.Builder.create(scope, id)

    public override fun repositoryCatalogData(repositoryCatalogData: Any) {
      cdkBuilder.repositoryCatalogData(repositoryCatalogData)
    }

    public override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnPublicRepository = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublicRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublicRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepository):
        CfnPublicRepository = CfnPublicRepository(cdkObject)

    internal fun unwrap(wrapped: CfnPublicRepository):
        software.amazon.awscdk.services.ecr.CfnPublicRepository = wrapped.cdkObject
  }

  public interface RepositoryCatalogDataProperty {
    public fun aboutText(): String? = unwrap(this).getAboutText()

    public fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

    public fun operatingSystems(): List<String> = unwrap(this).getOperatingSystems() ?: emptyList()

    public fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

    public fun usageText(): String? = unwrap(this).getUsageText()

    public interface Builder {
      public fun aboutText(aboutText: String) {
      }

      public fun architectures(architectures: List<String>) {
      }

      public fun operatingSystems(operatingSystems: List<String>) {
      }

      public fun repositoryDescription(repositoryDescription: String) {
      }

      public fun usageText(usageText: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty.builder()

      public override fun aboutText(aboutText: String) {
        cdkBuilder.aboutText(aboutText)
      }

      public override fun architectures(architectures: List<String>) {
        cdkBuilder.architectures(architectures)
      }

      public override fun operatingSystems(operatingSystems: List<String>) {
        cdkBuilder.operatingSystems(operatingSystems)
      }

      public override fun repositoryDescription(repositoryDescription: String) {
        cdkBuilder.repositoryDescription(repositoryDescription)
      }

      public override fun usageText(usageText: String) {
        cdkBuilder.usageText(usageText)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty,
    ) : RepositoryCatalogDataProperty {
      public override fun aboutText(): String? = unwrap(this).getAboutText()

      public override fun architectures(): List<String> = unwrap(this).getArchitectures() ?:
          emptyList()

      public override fun operatingSystems(): List<String> = unwrap(this).getOperatingSystems() ?:
          emptyList()

      public override fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

      public override fun usageText(): String? = unwrap(this).getUsageText()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryCatalogDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty):
          RepositoryCatalogDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryCatalogDataProperty):
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
