@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCodeRepositoryProps {
  public fun codeRepositoryName(): String? = unwrap(this).getCodeRepositoryName()

  public fun gitConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun codeRepositoryName(codeRepositoryName: String)

    public fun gitConfig(gitConfig: IResolvable)

    public fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d368bc60400175864cc0f260d6ba1e159b5f9da51673ce31b1666f80d2c33c1f")
    public fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps.Builder
        = software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps.builder()

    override fun codeRepositoryName(codeRepositoryName: String) {
      cdkBuilder.codeRepositoryName(codeRepositoryName)
    }

    override fun gitConfig(gitConfig: IResolvable) {
      cdkBuilder.gitConfig(gitConfig.let(IResolvable::unwrap))
    }

    override fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty) {
      cdkBuilder.gitConfig(gitConfig.let(CfnCodeRepository.GitConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d368bc60400175864cc0f260d6ba1e159b5f9da51673ce31b1666f80d2c33c1f")
    override fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty.Builder.() -> Unit): Unit
        = gitConfig(CfnCodeRepository.GitConfigProperty(gitConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps,
  ) : CdkObject(cdkObject), CfnCodeRepositoryProps {
    override fun codeRepositoryName(): String? = unwrap(this).getCodeRepositoryName()

    override fun gitConfig(): Any = unwrap(this).getGitConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps):
        CfnCodeRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeRepositoryProps):
        software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps
  }
}
