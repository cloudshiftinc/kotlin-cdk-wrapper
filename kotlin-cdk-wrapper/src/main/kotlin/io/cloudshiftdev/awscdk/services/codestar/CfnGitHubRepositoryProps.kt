@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestar

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnGitHubRepositoryProps {
  public fun code(): Any? = unwrap(this).getCode()

  public fun connectionArn(): String? = unwrap(this).getConnectionArn()

  public fun enableIssues(): Any? = unwrap(this).getEnableIssues()

  public fun isPrivate(): Any? = unwrap(this).getIsPrivate()

  public fun repositoryAccessToken(): String? = unwrap(this).getRepositoryAccessToken()

  public fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

  public fun repositoryName(): String

  public fun repositoryOwner(): String

  @CdkDslMarker
  public interface Builder {
    public fun code(code: IResolvable)

    public fun code(code: CfnGitHubRepository.CodeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1adf9e0f48ec4866cefa9d4d1b835c40a27bc1faf4ccf53e8428bb2cb11b4f2")
    public fun code(code: CfnGitHubRepository.CodeProperty.Builder.() -> Unit)

    public fun connectionArn(connectionArn: String)

    public fun enableIssues(enableIssues: Boolean)

    public fun enableIssues(enableIssues: IResolvable)

    public fun isPrivate(isPrivate: Boolean)

    public fun isPrivate(isPrivate: IResolvable)

    public fun repositoryAccessToken(repositoryAccessToken: String)

    public fun repositoryDescription(repositoryDescription: String)

    public fun repositoryName(repositoryName: String)

    public fun repositoryOwner(repositoryOwner: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps.Builder =
        software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps.builder()

    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    override fun code(code: CfnGitHubRepository.CodeProperty) {
      cdkBuilder.code(code.let(CfnGitHubRepository.CodeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1adf9e0f48ec4866cefa9d4d1b835c40a27bc1faf4ccf53e8428bb2cb11b4f2")
    override fun code(code: CfnGitHubRepository.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnGitHubRepository.CodeProperty(code))

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun enableIssues(enableIssues: Boolean) {
      cdkBuilder.enableIssues(enableIssues)
    }

    override fun enableIssues(enableIssues: IResolvable) {
      cdkBuilder.enableIssues(enableIssues.let(IResolvable::unwrap))
    }

    override fun isPrivate(isPrivate: Boolean) {
      cdkBuilder.isPrivate(isPrivate)
    }

    override fun isPrivate(isPrivate: IResolvable) {
      cdkBuilder.isPrivate(isPrivate.let(IResolvable::unwrap))
    }

    override fun repositoryAccessToken(repositoryAccessToken: String) {
      cdkBuilder.repositoryAccessToken(repositoryAccessToken)
    }

    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun repositoryOwner(repositoryOwner: String) {
      cdkBuilder.repositoryOwner(repositoryOwner)
    }

    public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps,
  ) : CdkObject(cdkObject), CfnGitHubRepositoryProps {
    override fun code(): Any? = unwrap(this).getCode()

    override fun connectionArn(): String? = unwrap(this).getConnectionArn()

    override fun enableIssues(): Any? = unwrap(this).getEnableIssues()

    override fun isPrivate(): Any? = unwrap(this).getIsPrivate()

    override fun repositoryAccessToken(): String? = unwrap(this).getRepositoryAccessToken()

    override fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    override fun repositoryOwner(): String = unwrap(this).getRepositoryOwner()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGitHubRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps):
        CfnGitHubRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGitHubRepositoryProps):
        software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps
  }
}
