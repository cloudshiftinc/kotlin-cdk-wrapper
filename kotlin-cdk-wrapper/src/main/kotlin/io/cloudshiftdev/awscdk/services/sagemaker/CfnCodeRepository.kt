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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Git repository as a resource in your SageMaker AI account.
 *
 * You can associate the repository with notebook instances so that you can use Git source control
 * for the notebooks you create. The Git repository is a resource in your SageMaker AI account, so it
 * can be associated with more than one notebook instance, and it persists independently from the
 * lifecycle of any notebook instances it is associated with.
 *
 * The repository can be hosted either in [AWS
 * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other
 * Git repository.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnCodeRepository cfnCodeRepository = CfnCodeRepository.Builder.create(this,
 * "MyCfnCodeRepository")
 * .gitConfig(GitConfigProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * // the properties below are optional
 * .branch("branch")
 * .secretArn("secretArn")
 * .build())
 * // the properties below are optional
 * .codeRepositoryName("codeRepositoryName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html)
 */
public open class CfnCodeRepository(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepository,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCodeRepositoryProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnCodeRepository(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCodeRepositoryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCodeRepositoryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCodeRepositoryProps(props)
  )

  /**
   * The name of the code repository, such as `myCodeRepo` .
   */
  public open fun attrCodeRepositoryName(): String = unwrap(this).getAttrCodeRepositoryName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the Git repository.
   */
  public open fun codeRepositoryName(): String? = unwrap(this).getCodeRepositoryName()

  /**
   * The name of the Git repository.
   */
  public open fun codeRepositoryName(`value`: String) {
    unwrap(this).setCodeRepositoryName(`value`)
  }

  /**
   * Configuration details for the Git repository, including the URL where it is located and the ARN
   * of the AWS Secrets Manager secret that contains the credentials used to access the repository.
   */
  public open fun gitConfig(): Any = unwrap(this).getGitConfig()

  /**
   * Configuration details for the Git repository, including the URL where it is located and the ARN
   * of the AWS Secrets Manager secret that contains the credentials used to access the repository.
   */
  public open fun gitConfig(`value`: IResolvable) {
    unwrap(this).setGitConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration details for the Git repository, including the URL where it is located and the ARN
   * of the AWS Secrets Manager secret that contains the credentials used to access the repository.
   */
  public open fun gitConfig(`value`: GitConfigProperty) {
    unwrap(this).setGitConfig(`value`.let(GitConfigProperty.Companion::unwrap))
  }

  /**
   * Configuration details for the Git repository, including the URL where it is located and the ARN
   * of the AWS Secrets Manager secret that contains the credentials used to access the repository.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38ff25139d9feff692ae296d1b4bd6ffacdff488f323557ea5bbcfca3c86d041")
  public open fun gitConfig(`value`: GitConfigProperty.Builder.() -> Unit): Unit =
      gitConfig(GitConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * List of tags for Code Repository.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * List of tags for Code Repository.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * List of tags for Code Repository.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnCodeRepository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Git repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname)
     * @param codeRepositoryName The name of the Git repository. 
     */
    public fun codeRepositoryName(codeRepositoryName: String)

    /**
     * Configuration details for the Git repository, including the URL where it is located and the
     * ARN of the AWS Secrets Manager secret that contains the credentials used to access the
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    public fun gitConfig(gitConfig: IResolvable)

    /**
     * Configuration details for the Git repository, including the URL where it is located and the
     * ARN of the AWS Secrets Manager secret that contains the credentials used to access the
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    public fun gitConfig(gitConfig: GitConfigProperty)

    /**
     * Configuration details for the Git repository, including the URL where it is located and the
     * ARN of the AWS Secrets Manager secret that contains the credentials used to access the
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22d74d66512f00a6582b1f3c146a255dc8da1bfce432fd5d3afada04d6847919")
    public fun gitConfig(gitConfig: GitConfigProperty.Builder.() -> Unit)

    /**
     * List of tags for Code Repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
     * @param tags List of tags for Code Repository. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * List of tags for Code Repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
     * @param tags List of tags for Code Repository. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnCodeRepository.Builder =
        software.amazon.awscdk.services.sagemaker.CfnCodeRepository.Builder.create(scope, id)

    /**
     * The name of the Git repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname)
     * @param codeRepositoryName The name of the Git repository. 
     */
    override fun codeRepositoryName(codeRepositoryName: String) {
      cdkBuilder.codeRepositoryName(codeRepositoryName)
    }

    /**
     * Configuration details for the Git repository, including the URL where it is located and the
     * ARN of the AWS Secrets Manager secret that contains the credentials used to access the
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    override fun gitConfig(gitConfig: IResolvable) {
      cdkBuilder.gitConfig(gitConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration details for the Git repository, including the URL where it is located and the
     * ARN of the AWS Secrets Manager secret that contains the credentials used to access the
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    override fun gitConfig(gitConfig: GitConfigProperty) {
      cdkBuilder.gitConfig(gitConfig.let(GitConfigProperty.Companion::unwrap))
    }

    /**
     * Configuration details for the Git repository, including the URL where it is located and the
     * ARN of the AWS Secrets Manager secret that contains the credentials used to access the
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-gitconfig)
     * @param gitConfig Configuration details for the Git repository, including the URL where it is
     * located and the ARN of the AWS Secrets Manager secret that contains the credentials used to
     * access the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22d74d66512f00a6582b1f3c146a255dc8da1bfce432fd5d3afada04d6847919")
    override fun gitConfig(gitConfig: GitConfigProperty.Builder.() -> Unit): Unit =
        gitConfig(GitConfigProperty(gitConfig))

    /**
     * List of tags for Code Repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
     * @param tags List of tags for Code Repository. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * List of tags for Code Repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-tags)
     * @param tags List of tags for Code Repository. 
     */
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
        software.amazon.awscdk.services.sagemaker.CfnCodeRepository = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnCodeRepository
  }

  /**
   * Specifies configuration details for a Git repository in your AWS account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * GitConfigProperty gitConfigProperty = GitConfigProperty.builder()
   * .repositoryUrl("repositoryUrl")
   * // the properties below are optional
   * .branch("branch")
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html)
   */
  public interface GitConfigProperty {
    /**
     * The default branch for the Git repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-branch)
     */
    public fun branch(): String? = unwrap(this).getBranch()

    /**
     * The URL where the Git repository is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-repositoryurl)
     */
    public fun repositoryUrl(): String

    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the
     * credentials used to access the git repository.
     *
     * The secret must have a staging label of `AWSCURRENT` and must be in the following format:
     *
     * `{"username": *UserName* , "password": *Password* }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [GitConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param branch The default branch for the Git repository.
       */
      public fun branch(branch: String)

      /**
       * @param repositoryUrl The URL where the Git repository is located. 
       */
      public fun repositoryUrl(repositoryUrl: String)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
       * contains the credentials used to access the git repository.
       * The secret must have a staging label of `AWSCURRENT` and must be in the following format:
       *
       * `{"username": *UserName* , "password": *Password* }`
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty.builder()

      /**
       * @param branch The default branch for the Git repository.
       */
      override fun branch(branch: String) {
        cdkBuilder.branch(branch)
      }

      /**
       * @param repositoryUrl The URL where the Git repository is located. 
       */
      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
       * contains the credentials used to access the git repository.
       * The secret must have a staging label of `AWSCURRENT` and must be in the following format:
       *
       * `{"username": *UserName* , "password": *Password* }`
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty,
    ) : CdkObject(cdkObject),
        GitConfigProperty {
      /**
       * The default branch for the Git repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-branch)
       */
      override fun branch(): String? = unwrap(this).getBranch()

      /**
       * The URL where the Git repository is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-repositoryurl)
       */
      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()

      /**
       * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the
       * credentials used to access the git repository.
       *
       * The secret must have a staging label of `AWSCURRENT` and must be in the following format:
       *
       * `{"username": *UserName* , "password": *Password* }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty):
          GitConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? GitConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty
    }
  }
}
