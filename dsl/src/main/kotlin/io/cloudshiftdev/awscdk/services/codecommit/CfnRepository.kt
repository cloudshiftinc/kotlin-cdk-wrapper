package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRepository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * When you pass the logical ID of this resource, the function returns the Amazon Resource Name
   * (ARN) of the repository.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When you pass the logical ID of this resource, the function returns the URL to use for cloning
   * the repository over HTTPS.
   */
  public open fun attrCloneUrlHttp(): String = unwrap(this).getAttrCloneUrlHttp()

  /**
   * When you pass the logical ID of this resource, the function returns the URL to use for cloning
   * the repository over SSH.
   */
  public open fun attrCloneUrlSsh(): String = unwrap(this).getAttrCloneUrlSsh()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * When you pass the logical ID of this resource, the function returns the repository's name.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

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
  @JvmName("67a3e3849f110839ab6fc49fb4e7c6d9bf667ceee3cf4cf771287b9af26a4b8b")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the AWS Key Management Service encryption key used to encrypt and decrypt the
   * repository.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the AWS Key Management Service encryption key used to encrypt and decrypt the
   * repository.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
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
   * The name of the new repository to be created.
   */
  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  /**
   * The name of the new repository to be created.
   */
  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tag key-value pairs to use when tagging this repository.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tag key-value pairs to use when tagging this repository.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * One or more tag key-value pairs to use when tagging this repository.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The JSON block of configuration information for each trigger.
   */
  public open fun triggers(): Any? = unwrap(this).getTriggers()

  /**
   * The JSON block of configuration information for each trigger.
   */
  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  /**
   * The JSON block of configuration information for each trigger.
   */
  public open fun triggers(__idx_ac66f0: List<Any>) {
    unwrap(this).setTriggers(__idx_ac66f0)
  }

  /**
   * The JSON block of configuration information for each trigger.
   */
  public open fun triggers(vararg __idx_ac66f0: Any): Unit = triggers(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codecommit.CfnRepository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    public fun code(code: IResolvable)

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    public fun code(code: CodeProperty)

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9fd4d268d04ae519367c5e33ce2b6df25d1e474a34053bdfc54974fc3b3d3dc1")
    public fun code(code: CodeProperty.Builder.() -> Unit)

    /**
     * The ID of the AWS Key Management Service encryption key used to encrypt and decrypt the
     * repository.
     *
     *
     * The input can be the full ARN, the key ID, or the key alias. For more information, see
     * [Finding the key ID and key
     * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/find-cmk-id-arn.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service encryption key used to encrypt and
     * decrypt the repository. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * A comment or description about the new repository.
     *
     *
     * The description field for a repository accepts all HTML characters and all valid Unicode
     * characters. Applications that do not HTML-encode the description and display it in a webpage can
     * expose users to potentially malicious code. Make sure that you HTML-encode the description field
     * in any application that uses this API to display the repository description on a webpage.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
     * @param repositoryDescription A comment or description about the new repository. 
     */
    public fun repositoryDescription(repositoryDescription: String)

    /**
     * The name of the new repository to be created.
     *
     *
     * The repository name must be unique across the calling AWS account . Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
     * characters. For more information about the limits on repository names, see
     * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
     * CodeCommit User Guide* . The suffix .git is prohibited.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
     * @param repositoryName The name of the new repository to be created. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * One or more tag key-value pairs to use when tagging this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
     * @param tags One or more tag key-value pairs to use when tagging this repository. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tag key-value pairs to use when tagging this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
     * @param tags One or more tag key-value pairs to use when tagging this repository. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     * @param triggers The JSON block of configuration information for each trigger. 
     */
    public fun triggers(triggers: IResolvable)

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     * @param triggers The JSON block of configuration information for each trigger. 
     */
    public fun triggers(triggers: List<Any>)

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     * @param triggers The JSON block of configuration information for each trigger. 
     */
    public fun triggers(vararg triggers: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.CfnRepository.Builder =
        software.amazon.awscdk.services.codecommit.CfnRepository.Builder.create(scope, id)

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
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
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
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
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9fd4d268d04ae519367c5e33ce2b6df25d1e474a34053bdfc54974fc3b3d3dc1")
    override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

    /**
     * The ID of the AWS Key Management Service encryption key used to encrypt and decrypt the
     * repository.
     *
     *
     * The input can be the full ARN, the key ID, or the key alias. For more information, see
     * [Finding the key ID and key
     * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/find-cmk-id-arn.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service encryption key used to encrypt and
     * decrypt the repository. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * A comment or description about the new repository.
     *
     *
     * The description field for a repository accepts all HTML characters and all valid Unicode
     * characters. Applications that do not HTML-encode the description and display it in a webpage can
     * expose users to potentially malicious code. Make sure that you HTML-encode the description field
     * in any application that uses this API to display the repository description on a webpage.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
     * @param repositoryDescription A comment or description about the new repository. 
     */
    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    /**
     * The name of the new repository to be created.
     *
     *
     * The repository name must be unique across the calling AWS account . Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
     * characters. For more information about the limits on repository names, see
     * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
     * CodeCommit User Guide* . The suffix .git is prohibited.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
     * @param repositoryName The name of the new repository to be created. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * One or more tag key-value pairs to use when tagging this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
     * @param tags One or more tag key-value pairs to use when tagging this repository. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * One or more tag key-value pairs to use when tagging this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
     * @param tags One or more tag key-value pairs to use when tagging this repository. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     * @param triggers The JSON block of configuration information for each trigger. 
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     * @param triggers The JSON block of configuration information for each trigger. 
     */
    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     * @param triggers The JSON block of configuration information for each trigger. 
     */
    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    public fun build(): software.amazon.awscdk.services.codecommit.CfnRepository =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository):
        CfnRepository = CfnRepository(cdkObject)

    internal fun unwrap(wrapped: CfnRepository):
        software.amazon.awscdk.services.codecommit.CfnRepository = wrapped.cdkObject
  }

  public interface CodeProperty {
    /**
     * Optional.
     *
     * Specifies a branch name to be used as the default branch when importing code into a
     * repository on initial creation. If this property is not set, the name *main* will be used for
     * the default branch for the repository. Changes to this property are ignored after initial
     * resource creation. We recommend using this parameter to set the name to *main* to align with the
     * default behavior of CodeCommit unless another name is needed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html#cfn-codecommit-repository-code-branchname)
     */
    public fun branchName(): String? = unwrap(this).getBranchName()

    /**
     * Information about the Amazon S3 bucket that contains a ZIP file of code to be committed to
     * the repository.
     *
     * Changes to this property are ignored after initial resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html#cfn-codecommit-repository-code-s3)
     */
    public fun s3(): Any

    /**
     * A builder for [CodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param branchName Optional.
       * Specifies a branch name to be used as the default branch when importing code into a
       * repository on initial creation. If this property is not set, the name *main* will be used for
       * the default branch for the repository. Changes to this property are ignored after initial
       * resource creation. We recommend using this parameter to set the name to *main* to align with
       * the default behavior of CodeCommit unless another name is needed.
       */
      public fun branchName(branchName: String)

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       * Changes to this property are ignored after initial resource creation.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       * Changes to this property are ignored after initial resource creation.
       */
      public fun s3(s3: S3Property)

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       * Changes to this property are ignored after initial resource creation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c913cac2906efe85d52961192d80b494f8add6529f9c3d9d5834e0d5692edef1")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty.Builder =
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty.builder()

      /**
       * @param branchName Optional.
       * Specifies a branch name to be used as the default branch when importing code into a
       * repository on initial creation. If this property is not set, the name *main* will be used for
       * the default branch for the repository. Changes to this property are ignored after initial
       * resource creation. We recommend using this parameter to set the name to *main* to align with
       * the default behavior of CodeCommit unless another name is needed.
       */
      override fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
      }

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       * Changes to this property are ignored after initial resource creation.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       * Changes to this property are ignored after initial resource creation.
       */
      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      /**
       * @param s3 Information about the Amazon S3 bucket that contains a ZIP file of code to be
       * committed to the repository. 
       * Changes to this property are ignored after initial resource creation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c913cac2906efe85d52961192d80b494f8add6529f9c3d9d5834e0d5692edef1")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty,
    ) : CdkObject(cdkObject), CodeProperty {
      /**
       * Optional.
       *
       * Specifies a branch name to be used as the default branch when importing code into a
       * repository on initial creation. If this property is not set, the name *main* will be used for
       * the default branch for the repository. Changes to this property are ignored after initial
       * resource creation. We recommend using this parameter to set the name to *main* to align with
       * the default behavior of CodeCommit unless another name is needed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html#cfn-codecommit-repository-code-branchname)
       */
      override fun branchName(): String? = unwrap(this).getBranchName()

      /**
       * Information about the Amazon S3 bucket that contains a ZIP file of code to be committed to
       * the repository.
       *
       * Changes to this property are ignored after initial resource creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html#cfn-codecommit-repository-code-s3)
       */
      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty):
          CodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty
    }
  }

  public interface S3Property {
    /**
     * The name of the Amazon S3 bucket that contains the ZIP file with the content that will be
     * committed to the new repository.
     *
     * This can be specified using the name of the bucket in the AWS account . Changes to this
     * property are ignored after initial resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html#cfn-codecommit-repository-s3-bucket)
     */
    public fun bucket(): String

    /**
     * The key to use for accessing the Amazon S3 bucket.
     *
     * Changes to this property are ignored after initial resource creation. For more information,
     * see [Creating object key
     * names](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html) and [Uploading
     * objects](https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html) in the
     * Amazon S3 User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html#cfn-codecommit-repository-s3-key)
     */
    public fun key(): String

    /**
     * The object version of the ZIP file, if versioning is enabled for the Amazon S3 bucket.
     *
     * Changes to this property are ignored after initial resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html#cfn-codecommit-repository-s3-objectversion)
     */
    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the Amazon S3 bucket that contains the ZIP file with the content
       * that will be committed to the new repository. 
       * This can be specified using the name of the bucket in the AWS account . Changes to this
       * property are ignored after initial resource creation.
       */
      public fun bucket(bucket: String)

      /**
       * @param key The key to use for accessing the Amazon S3 bucket. 
       * Changes to this property are ignored after initial resource creation. For more information,
       * see [Creating object key
       * names](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html) and [Uploading
       * objects](https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html) in the
       * Amazon S3 User Guide.
       */
      public fun key(key: String)

      /**
       * @param objectVersion The object version of the ZIP file, if versioning is enabled for the
       * Amazon S3 bucket.
       * Changes to this property are ignored after initial resource creation.
       */
      public fun objectVersion(objectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property.Builder =
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property.builder()

      /**
       * @param bucket The name of the Amazon S3 bucket that contains the ZIP file with the content
       * that will be committed to the new repository. 
       * This can be specified using the name of the bucket in the AWS account . Changes to this
       * property are ignored after initial resource creation.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The key to use for accessing the Amazon S3 bucket. 
       * Changes to this property are ignored after initial resource creation. For more information,
       * see [Creating object key
       * names](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html) and [Uploading
       * objects](https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html) in the
       * Amazon S3 User Guide.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param objectVersion The object version of the ZIP file, if versioning is enabled for the
       * Amazon S3 bucket.
       * Changes to this property are ignored after initial resource creation.
       */
      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build(): software.amazon.awscdk.services.codecommit.CfnRepository.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      /**
       * The name of the Amazon S3 bucket that contains the ZIP file with the content that will be
       * committed to the new repository.
       *
       * This can be specified using the name of the bucket in the AWS account . Changes to this
       * property are ignored after initial resource creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html#cfn-codecommit-repository-s3-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The key to use for accessing the Amazon S3 bucket.
       *
       * Changes to this property are ignored after initial resource creation. For more information,
       * see [Creating object key
       * names](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html) and [Uploading
       * objects](https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html) in the
       * Amazon S3 User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html#cfn-codecommit-repository-s3-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The object version of the ZIP file, if versioning is enabled for the Amazon S3 bucket.
       *
       * Changes to this property are ignored after initial resource creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html#cfn-codecommit-repository-s3-objectversion)
       */
      override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property
    }
  }

  public interface RepositoryTriggerProperty {
    /**
     * The branches to be included in the trigger configuration.
     *
     * If you specify an empty array, the trigger applies to all branches.
     *
     *
     * Although no content is required in the array, you must include the array itself.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-branches)
     */
    public fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

    /**
     * Any custom data associated with the trigger to be included in the information sent to the
     * target of the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-customdata)
     */
    public fun customData(): String? = unwrap(this).getCustomData()

    /**
     * The ARN of the resource that is the target for a trigger (for example, the ARN of a topic in
     * Amazon SNS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-destinationarn)
     */
    public fun destinationArn(): String

    /**
     * The repository events that cause the trigger to run actions in another service, such as
     * sending a notification through Amazon SNS.
     *
     *
     * The valid value "all" cannot be used with any other values.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-events)
     */
    public fun events(): List<String>

    /**
     * The name of the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-name)
     */
    public fun name(): String

    /**
     * A builder for [RepositoryTriggerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param branches The branches to be included in the trigger configuration.
       * If you specify an empty array, the trigger applies to all branches.
       *
       *
       * Although no content is required in the array, you must include the array itself.
       */
      public fun branches(branches: List<String>)

      /**
       * @param branches The branches to be included in the trigger configuration.
       * If you specify an empty array, the trigger applies to all branches.
       *
       *
       * Although no content is required in the array, you must include the array itself.
       */
      public fun branches(vararg branches: String)

      /**
       * @param customData Any custom data associated with the trigger to be included in the
       * information sent to the target of the trigger.
       */
      public fun customData(customData: String)

      /**
       * @param destinationArn The ARN of the resource that is the target for a trigger (for
       * example, the ARN of a topic in Amazon SNS). 
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param events The repository events that cause the trigger to run actions in another
       * service, such as sending a notification through Amazon SNS. 
       *
       * The valid value "all" cannot be used with any other values.
       */
      public fun events(events: List<String>)

      /**
       * @param events The repository events that cause the trigger to run actions in another
       * service, such as sending a notification through Amazon SNS. 
       *
       * The valid value "all" cannot be used with any other values.
       */
      public fun events(vararg events: String)

      /**
       * @param name The name of the trigger. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder
          =
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.builder()

      /**
       * @param branches The branches to be included in the trigger configuration.
       * If you specify an empty array, the trigger applies to all branches.
       *
       *
       * Although no content is required in the array, you must include the array itself.
       */
      override fun branches(branches: List<String>) {
        cdkBuilder.branches(branches)
      }

      /**
       * @param branches The branches to be included in the trigger configuration.
       * If you specify an empty array, the trigger applies to all branches.
       *
       *
       * Although no content is required in the array, you must include the array itself.
       */
      override fun branches(vararg branches: String): Unit = branches(branches.toList())

      /**
       * @param customData Any custom data associated with the trigger to be included in the
       * information sent to the target of the trigger.
       */
      override fun customData(customData: String) {
        cdkBuilder.customData(customData)
      }

      /**
       * @param destinationArn The ARN of the resource that is the target for a trigger (for
       * example, the ARN of a topic in Amazon SNS). 
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param events The repository events that cause the trigger to run actions in another
       * service, such as sending a notification through Amazon SNS. 
       *
       * The valid value "all" cannot be used with any other values.
       */
      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events The repository events that cause the trigger to run actions in another
       * service, such as sending a notification through Amazon SNS. 
       *
       * The valid value "all" cannot be used with any other values.
       */
      override fun events(vararg events: String): Unit = events(events.toList())

      /**
       * @param name The name of the trigger. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty,
    ) : CdkObject(cdkObject), RepositoryTriggerProperty {
      /**
       * The branches to be included in the trigger configuration.
       *
       * If you specify an empty array, the trigger applies to all branches.
       *
       *
       * Although no content is required in the array, you must include the array itself.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-branches)
       */
      override fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

      /**
       * Any custom data associated with the trigger to be included in the information sent to the
       * target of the trigger.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-customdata)
       */
      override fun customData(): String? = unwrap(this).getCustomData()

      /**
       * The ARN of the resource that is the target for a trigger (for example, the ARN of a topic
       * in Amazon SNS).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-destinationarn)
       */
      override fun destinationArn(): String = unwrap(this).getDestinationArn()

      /**
       * The repository events that cause the trigger to run actions in another service, such as
       * sending a notification through Amazon SNS.
       *
       *
       * The valid value "all" cannot be used with any other values.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-events)
       */
      override fun events(): List<String> = unwrap(this).getEvents()

      /**
       * The name of the trigger.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty):
          RepositoryTriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryTriggerProperty):
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty
    }
  }
}
