@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCodeRepository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCodeRepositoryName(): String = unwrap(this).getAttrCodeRepositoryName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun codeRepositoryName(): String? = unwrap(this).getCodeRepositoryName()

  public open fun codeRepositoryName(`value`: String) {
    unwrap(this).setCodeRepositoryName(`value`)
  }

  public open fun gitConfig(): Any = unwrap(this).getGitConfig()

  public open fun gitConfig(`value`: IResolvable) {
    unwrap(this).setGitConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun gitConfig(`value`: GitConfigProperty) {
    unwrap(this).setGitConfig(`value`.let(GitConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38ff25139d9feff692ae296d1b4bd6ffacdff488f323557ea5bbcfca3c86d041")
  public open fun gitConfig(`value`: GitConfigProperty.Builder.() -> Unit): Unit =
      gitConfig(GitConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun codeRepositoryName(codeRepositoryName: String)

    public fun gitConfig(gitConfig: IResolvable)

    public fun gitConfig(gitConfig: GitConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22d74d66512f00a6582b1f3c146a255dc8da1bfce432fd5d3afada04d6847919")
    public fun gitConfig(gitConfig: GitConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnCodeRepository.Builder =
        software.amazon.awscdk.services.sagemaker.CfnCodeRepository.Builder.create(scope, id)

    override fun codeRepositoryName(codeRepositoryName: String) {
      cdkBuilder.codeRepositoryName(codeRepositoryName)
    }

    override fun gitConfig(gitConfig: IResolvable) {
      cdkBuilder.gitConfig(gitConfig.let(IResolvable::unwrap))
    }

    override fun gitConfig(gitConfig: GitConfigProperty) {
      cdkBuilder.gitConfig(gitConfig.let(GitConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22d74d66512f00a6582b1f3c146a255dc8da1bfce432fd5d3afada04d6847919")
    override fun gitConfig(gitConfig: GitConfigProperty.Builder.() -> Unit): Unit =
        gitConfig(GitConfigProperty(gitConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnCodeRepository =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnCodeRepository.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCodeRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCodeRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepository):
        CfnCodeRepository = CfnCodeRepository(cdkObject)

    internal fun unwrap(wrapped: CfnCodeRepository):
        software.amazon.awscdk.services.sagemaker.CfnCodeRepository = wrapped.cdkObject
  }

  public interface GitConfigProperty {
    public fun branch(): String? = unwrap(this).getBranch()

    public fun repositoryUrl(): String

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    @CdkDslMarker
    public interface Builder {
      public fun branch(branch: String)

      public fun repositoryUrl(repositoryUrl: String)

      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty.builder()

      override fun branch(branch: String) {
        cdkBuilder.branch(branch)
      }

      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty,
    ) : CdkObject(cdkObject), GitConfigProperty {
      override fun branch(): String? = unwrap(this).getBranch()

      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()

      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty):
          GitConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty
    }
  }
}
