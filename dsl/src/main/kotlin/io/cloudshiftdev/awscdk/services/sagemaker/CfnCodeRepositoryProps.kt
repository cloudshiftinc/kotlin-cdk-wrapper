package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCodeRepositoryProps {
  /**
   * The name of the Git repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname)
   */
  public fun codeRepositoryName(): String? = unwrap(this).getCodeRepositoryName()

  /**
   * Configuration details for the Git repository, including the URL where it is located and the ARN
   * of the AWS Secrets Manager secret that contains the credentials used to access the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
   */
  public fun gitConfig(): Any

  /**
   * List of tags for Code Repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCodeRepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param codeRepositoryName The name of the Git repository.
     */
    public fun codeRepositoryName(codeRepositoryName: String)

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    public fun gitConfig(gitConfig: IResolvable)

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    public fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty)

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d368bc60400175864cc0f260d6ba1e159b5f9da51673ce31b1666f80d2c33c1f")
    public fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty.Builder.() -> Unit)

    /**
     * @param tags List of tags for Code Repository.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags List of tags for Code Repository.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps.Builder
        = software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps.builder()

    /**
     * @param codeRepositoryName The name of the Git repository.
     */
    override fun codeRepositoryName(codeRepositoryName: String) {
      cdkBuilder.codeRepositoryName(codeRepositoryName)
    }

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    override fun gitConfig(gitConfig: IResolvable) {
      cdkBuilder.gitConfig(gitConfig.let(IResolvable::unwrap))
    }

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    override fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty) {
      cdkBuilder.gitConfig(gitConfig.let(CfnCodeRepository.GitConfigProperty::unwrap))
    }

    /**
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d368bc60400175864cc0f260d6ba1e159b5f9da51673ce31b1666f80d2c33c1f")
    override fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty.Builder.() -> Unit): Unit
        = gitConfig(CfnCodeRepository.GitConfigProperty(gitConfig))

    /**
     * @param tags List of tags for Code Repository.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags List of tags for Code Repository.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps,
  ) : CdkObject(cdkObject), CfnCodeRepositoryProps {
    /**
     * The name of the Git repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname)
     */
    override fun codeRepositoryName(): String? = unwrap(this).getCodeRepositoryName()

    /**
     * Configuration details for the Git repository, including the URL where it is located and the
     * ARN of the AWS Secrets Manager secret that contains the credentials used to access the
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
     */
    override fun gitConfig(): Any = unwrap(this).getGitConfig()

    /**
     * List of tags for Code Repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
     */
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
