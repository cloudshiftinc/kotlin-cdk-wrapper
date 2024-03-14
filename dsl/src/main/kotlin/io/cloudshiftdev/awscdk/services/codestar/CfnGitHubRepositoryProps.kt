package io.cloudshiftdev.awscdk.services.codestar

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnGitHubRepositoryProps {
  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
   */
  public fun code(): Any? = unwrap(this).getCode()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-connectionarn)
   */
  public fun connectionArn(): String? = unwrap(this).getConnectionArn()

  /**
   * Indicates whether to enable issues for the GitHub repository.
   *
   * You can use GitHub issues to track information and bugs for your repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
   */
  public fun enableIssues(): Any? = unwrap(this).getEnableIssues()

  /**
   * Indicates whether the GitHub repository is a private repository.
   *
   * If so, you choose who can see and commit to this repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
   */
  public fun isPrivate(): Any? = unwrap(this).getIsPrivate()

  /**
   * The GitHub user's personal access token for the GitHub repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken)
   */
  public fun repositoryAccessToken(): String? = unwrap(this).getRepositoryAccessToken()

  /**
   * A comment or description about the new repository.
   *
   * This description is displayed in GitHub after the repository is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription)
   */
  public fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

  /**
   * The name of the repository you want to create in GitHub with AWS CloudFormation stack creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname)
   */
  public fun repositoryName(): String

  /**
   * The GitHub user name for the owner of the GitHub repository to be created.
   *
   * If this repository should be owned by a GitHub organization, provide its name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner)
   */
  public fun repositoryOwner(): String

  /**
   * A builder for [CfnGitHubRepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     */
    public fun code(code: IResolvable)

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     */
    public fun code(code: CfnGitHubRepository.CodeProperty)

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1adf9e0f48ec4866cefa9d4d1b835c40a27bc1faf4ccf53e8428bb2cb11b4f2")
    public fun code(code: CfnGitHubRepository.CodeProperty.Builder.() -> Unit)

    /**
     * @param connectionArn the value to be set.
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param enableIssues Indicates whether to enable issues for the GitHub repository.
     * You can use GitHub issues to track information and bugs for your repository.
     */
    public fun enableIssues(enableIssues: Boolean)

    /**
     * @param enableIssues Indicates whether to enable issues for the GitHub repository.
     * You can use GitHub issues to track information and bugs for your repository.
     */
    public fun enableIssues(enableIssues: IResolvable)

    /**
     * @param isPrivate Indicates whether the GitHub repository is a private repository.
     * If so, you choose who can see and commit to this repository.
     */
    public fun isPrivate(isPrivate: Boolean)

    /**
     * @param isPrivate Indicates whether the GitHub repository is a private repository.
     * If so, you choose who can see and commit to this repository.
     */
    public fun isPrivate(isPrivate: IResolvable)

    /**
     * @param repositoryAccessToken The GitHub user's personal access token for the GitHub
     * repository.
     */
    public fun repositoryAccessToken(repositoryAccessToken: String)

    /**
     * @param repositoryDescription A comment or description about the new repository.
     * This description is displayed in GitHub after the repository is created.
     */
    public fun repositoryDescription(repositoryDescription: String)

    /**
     * @param repositoryName The name of the repository you want to create in GitHub with AWS
     * CloudFormation stack creation. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param repositoryOwner The GitHub user name for the owner of the GitHub repository to be
     * created. 
     * If this repository should be owned by a GitHub organization, provide its name.
     */
    public fun repositoryOwner(repositoryOwner: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps.Builder =
        software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps.builder()

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     */
    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     */
    override fun code(code: CfnGitHubRepository.CodeProperty) {
      cdkBuilder.code(code.let(CfnGitHubRepository.CodeProperty::unwrap))
    }

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1adf9e0f48ec4866cefa9d4d1b835c40a27bc1faf4ccf53e8428bb2cb11b4f2")
    override fun code(code: CfnGitHubRepository.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnGitHubRepository.CodeProperty(code))

    /**
     * @param connectionArn the value to be set.
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param enableIssues Indicates whether to enable issues for the GitHub repository.
     * You can use GitHub issues to track information and bugs for your repository.
     */
    override fun enableIssues(enableIssues: Boolean) {
      cdkBuilder.enableIssues(enableIssues)
    }

    /**
     * @param enableIssues Indicates whether to enable issues for the GitHub repository.
     * You can use GitHub issues to track information and bugs for your repository.
     */
    override fun enableIssues(enableIssues: IResolvable) {
      cdkBuilder.enableIssues(enableIssues.let(IResolvable::unwrap))
    }

    /**
     * @param isPrivate Indicates whether the GitHub repository is a private repository.
     * If so, you choose who can see and commit to this repository.
     */
    override fun isPrivate(isPrivate: Boolean) {
      cdkBuilder.isPrivate(isPrivate)
    }

    /**
     * @param isPrivate Indicates whether the GitHub repository is a private repository.
     * If so, you choose who can see and commit to this repository.
     */
    override fun isPrivate(isPrivate: IResolvable) {
      cdkBuilder.isPrivate(isPrivate.let(IResolvable::unwrap))
    }

    /**
     * @param repositoryAccessToken The GitHub user's personal access token for the GitHub
     * repository.
     */
    override fun repositoryAccessToken(repositoryAccessToken: String) {
      cdkBuilder.repositoryAccessToken(repositoryAccessToken)
    }

    /**
     * @param repositoryDescription A comment or description about the new repository.
     * This description is displayed in GitHub after the repository is created.
     */
    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    /**
     * @param repositoryName The name of the repository you want to create in GitHub with AWS
     * CloudFormation stack creation. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param repositoryOwner The GitHub user name for the owner of the GitHub repository to be
     * created. 
     * If this repository should be owned by a GitHub organization, provide its name.
     */
    override fun repositoryOwner(repositoryOwner: String) {
      cdkBuilder.repositoryOwner(repositoryOwner)
    }

    public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps,
  ) : CdkObject(cdkObject), CfnGitHubRepositoryProps {
    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
     */
    override fun code(): Any? = unwrap(this).getCode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-connectionarn)
     */
    override fun connectionArn(): String? = unwrap(this).getConnectionArn()

    /**
     * Indicates whether to enable issues for the GitHub repository.
     *
     * You can use GitHub issues to track information and bugs for your repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
     */
    override fun enableIssues(): Any? = unwrap(this).getEnableIssues()

    /**
     * Indicates whether the GitHub repository is a private repository.
     *
     * If so, you choose who can see and commit to this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
     */
    override fun isPrivate(): Any? = unwrap(this).getIsPrivate()

    /**
     * The GitHub user's personal access token for the GitHub repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken)
     */
    override fun repositoryAccessToken(): String? = unwrap(this).getRepositoryAccessToken()

    /**
     * A comment or description about the new repository.
     *
     * This description is displayed in GitHub after the repository is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription)
     */
    override fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

    /**
     * The name of the repository you want to create in GitHub with AWS CloudFormation stack
     * creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname)
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    /**
     * The GitHub user name for the owner of the GitHub repository to be created.
     *
     * If this repository should be owned by a GitHub organization, provide its name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner)
     */
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
