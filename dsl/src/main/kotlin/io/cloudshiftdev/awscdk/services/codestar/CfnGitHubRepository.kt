package io.cloudshiftdev.awscdk.services.codestar

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGitHubRepository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   */
  public open fun code(): Any? = unwrap(this).getCode()

  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   */
  public open fun code(`value`: IResolvable) {
    unwrap(this).setCode(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   */
  public open fun code(`value`: CodeProperty) {
    unwrap(this).setCode(`value`.let(CodeProperty::unwrap))
  }

  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b5aff40e582c6a14e868147d2e5df89c451d3c61991b0239d2ebade8ba4f446")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  /**
   *
   */
  public open fun connectionArn(): String? = unwrap(this).getConnectionArn()

  /**
   *
   */
  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  /**
   * Indicates whether to enable issues for the GitHub repository.
   */
  public open fun enableIssues(): Any? = unwrap(this).getEnableIssues()

  /**
   * Indicates whether to enable issues for the GitHub repository.
   */
  public open fun enableIssues(`value`: Boolean) {
    unwrap(this).setEnableIssues(`value`)
  }

  /**
   * Indicates whether to enable issues for the GitHub repository.
   */
  public open fun enableIssues(`value`: IResolvable) {
    unwrap(this).setEnableIssues(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Indicates whether the GitHub repository is a private repository.
   */
  public open fun isPrivate(): Any? = unwrap(this).getIsPrivate()

  /**
   * Indicates whether the GitHub repository is a private repository.
   */
  public open fun isPrivate(`value`: Boolean) {
    unwrap(this).setIsPrivate(`value`)
  }

  /**
   * Indicates whether the GitHub repository is a private repository.
   */
  public open fun isPrivate(`value`: IResolvable) {
    unwrap(this).setIsPrivate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The GitHub user's personal access token for the GitHub repository.
   */
  public open fun repositoryAccessToken(): String? = unwrap(this).getRepositoryAccessToken()

  /**
   * The GitHub user's personal access token for the GitHub repository.
   */
  public open fun repositoryAccessToken(`value`: String) {
    unwrap(this).setRepositoryAccessToken(`value`)
  }

  /**
   * A comment or description about the new repository.
   */
  public open fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

  /**
   * A comment or description about the new repository.
   */
  public open fun repositoryDescription(`value`: String) {
    unwrap(this).setRepositoryDescription(`value`)
  }

  /**
   * The name of the repository you want to create in GitHub with AWS CloudFormation stack creation.
   */
  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  /**
   * The name of the repository you want to create in GitHub with AWS CloudFormation stack creation.
   */
  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  /**
   * The GitHub user name for the owner of the GitHub repository to be created.
   */
  public open fun repositoryOwner(): String = unwrap(this).getRepositoryOwner()

  /**
   * The GitHub user name for the owner of the GitHub repository to be created.
   */
  public open fun repositoryOwner(`value`: String) {
    unwrap(this).setRepositoryOwner(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codestar.CfnGitHubRepository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    public fun code(code: IResolvable)

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    public fun code(code: CodeProperty)

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0576170719d008fcc3e4deb282cca208bfd690f67322915753fcb0ac80b47f77")
    public fun code(code: CodeProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-connectionarn)
     * @param connectionArn 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * Indicates whether to enable issues for the GitHub repository.
     *
     * You can use GitHub issues to track information and bugs for your repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
     * @param enableIssues Indicates whether to enable issues for the GitHub repository. 
     */
    public fun enableIssues(enableIssues: Boolean)

    /**
     * Indicates whether to enable issues for the GitHub repository.
     *
     * You can use GitHub issues to track information and bugs for your repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
     * @param enableIssues Indicates whether to enable issues for the GitHub repository. 
     */
    public fun enableIssues(enableIssues: IResolvable)

    /**
     * Indicates whether the GitHub repository is a private repository.
     *
     * If so, you choose who can see and commit to this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
     * @param isPrivate Indicates whether the GitHub repository is a private repository. 
     */
    public fun isPrivate(isPrivate: Boolean)

    /**
     * Indicates whether the GitHub repository is a private repository.
     *
     * If so, you choose who can see and commit to this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
     * @param isPrivate Indicates whether the GitHub repository is a private repository. 
     */
    public fun isPrivate(isPrivate: IResolvable)

    /**
     * The GitHub user's personal access token for the GitHub repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken)
     * @param repositoryAccessToken The GitHub user's personal access token for the GitHub
     * repository. 
     */
    public fun repositoryAccessToken(repositoryAccessToken: String)

    /**
     * A comment or description about the new repository.
     *
     * This description is displayed in GitHub after the repository is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription)
     * @param repositoryDescription A comment or description about the new repository. 
     */
    public fun repositoryDescription(repositoryDescription: String)

    /**
     * The name of the repository you want to create in GitHub with AWS CloudFormation stack
     * creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname)
     * @param repositoryName The name of the repository you want to create in GitHub with AWS
     * CloudFormation stack creation. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * The GitHub user name for the owner of the GitHub repository to be created.
     *
     * If this repository should be owned by a GitHub organization, provide its name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner)
     * @param repositoryOwner The GitHub user name for the owner of the GitHub repository to be
     * created. 
     */
    public fun repositoryOwner(repositoryOwner: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codestar.CfnGitHubRepository.Builder =
        software.amazon.awscdk.services.codestar.CfnGitHubRepository.Builder.create(scope, id)

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    override fun code(code: CodeProperty) {
      cdkBuilder.code(code.let(CodeProperty::unwrap))
    }

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0576170719d008fcc3e4deb282cca208bfd690f67322915753fcb0ac80b47f77")
    override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-connectionarn)
     * @param connectionArn 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * Indicates whether to enable issues for the GitHub repository.
     *
     * You can use GitHub issues to track information and bugs for your repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
     * @param enableIssues Indicates whether to enable issues for the GitHub repository. 
     */
    override fun enableIssues(enableIssues: Boolean) {
      cdkBuilder.enableIssues(enableIssues)
    }

    /**
     * Indicates whether to enable issues for the GitHub repository.
     *
     * You can use GitHub issues to track information and bugs for your repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
     * @param enableIssues Indicates whether to enable issues for the GitHub repository. 
     */
    override fun enableIssues(enableIssues: IResolvable) {
      cdkBuilder.enableIssues(enableIssues.let(IResolvable::unwrap))
    }

    /**
     * Indicates whether the GitHub repository is a private repository.
     *
     * If so, you choose who can see and commit to this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
     * @param isPrivate Indicates whether the GitHub repository is a private repository. 
     */
    override fun isPrivate(isPrivate: Boolean) {
      cdkBuilder.isPrivate(isPrivate)
    }

    /**
     * Indicates whether the GitHub repository is a private repository.
     *
     * If so, you choose who can see and commit to this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
     * @param isPrivate Indicates whether the GitHub repository is a private repository. 
     */
    override fun isPrivate(isPrivate: IResolvable) {
      cdkBuilder.isPrivate(isPrivate.let(IResolvable::unwrap))
    }

    /**
     * The GitHub user's personal access token for the GitHub repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken)
     * @param repositoryAccessToken The GitHub user's personal access token for the GitHub
     * repository. 
     */
    override fun repositoryAccessToken(repositoryAccessToken: String) {
      cdkBuilder.repositoryAccessToken(repositoryAccessToken)
    }

    /**
     * A comment or description about the new repository.
     *
     * This description is displayed in GitHub after the repository is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription)
     * @param repositoryDescription A comment or description about the new repository. 
     */
    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    /**
     * The name of the repository you want to create in GitHub with AWS CloudFormation stack
     * creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname)
     * @param repositoryName The name of the repository you want to create in GitHub with AWS
     * CloudFormation stack creation. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * The GitHub user name for the owner of the GitHub repository to be created.
     *
     * If this repository should be owned by a GitHub organization, provide its name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner)
     * @param repositoryOwner The GitHub user name for the owner of the GitHub repository to be
     * created. 
     */
    override fun repositoryOwner(repositoryOwner: String) {
      cdkBuilder.repositoryOwner(repositoryOwner)
    }

    public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepository =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codestar.CfnGitHubRepository.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGitHubRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGitHubRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository):
        CfnGitHubRepository = CfnGitHubRepository(cdkObject)

    internal fun unwrap(wrapped: CfnGitHubRepository):
        software.amazon.awscdk.services.codestar.CfnGitHubRepository = wrapped.cdkObject
  }

  public interface CodeProperty {
    /**
     * Information about the Amazon S3 bucket that contains a ZIP file of code to be committed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html#cfn-codestar-githubrepository-code-s3)
     */
    public fun s3(): Any

    /**
     * A builder for [CodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       */
      public fun s3(s3: S3Property)

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fd3a546b010d0c31ae1661af2835497807d2c9e6a6f40850ec667d3d8e1c61e")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty.Builder =
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty.builder()

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       */
      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fd3a546b010d0c31ae1661af2835497807d2c9e6a6f40850ec667d3d8e1c61e")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty,
    ) : CdkObject(cdkObject), CodeProperty {
      /**
       * Information about the Amazon S3 bucket that contains a ZIP file of code to be committed to
       * the repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html#cfn-codestar-githubrepository-code-s3)
       */
      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty):
          CodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty
    }
  }

  public interface S3Property {
    /**
     * The name of the Amazon S3 bucket that contains the ZIP file with the content to be committed
     * to the new repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-bucket)
     */
    public fun bucket(): String

    /**
     * The S3 object key or file name for the ZIP file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-key)
     */
    public fun key(): String

    /**
     * The object version of the ZIP file, if versioning is enabled for the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-objectversion)
     */
    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the Amazon S3 bucket that contains the ZIP file with the content
       * to be committed to the new repository. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The S3 object key or file name for the ZIP file. 
       */
      public fun key(key: String)

      /**
       * @param objectVersion The object version of the ZIP file, if versioning is enabled for the
       * Amazon S3 bucket.
       */
      public fun objectVersion(objectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property.Builder =
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property.builder()

      /**
       * @param bucket The name of the Amazon S3 bucket that contains the ZIP file with the content
       * to be committed to the new repository. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The S3 object key or file name for the ZIP file. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param objectVersion The object version of the ZIP file, if versioning is enabled for the
       * Amazon S3 bucket.
       */
      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      /**
       * The name of the Amazon S3 bucket that contains the ZIP file with the content to be
       * committed to the new repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The S3 object key or file name for the ZIP file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The object version of the ZIP file, if versioning is enabled for the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-objectversion)
       */
      override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property
    }
  }
}
