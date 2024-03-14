package io.cloudshiftdev.awscdk.services.ssm

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
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDocument internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnDocument,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A list of key-value pairs that describe attachments to a version of a document.
   */
  public open fun attachments(): Any? = unwrap(this).getAttachments()

  /**
   * A list of key-value pairs that describe attachments to a version of a document.
   */
  public open fun attachments(`value`: IResolvable) {
    unwrap(this).setAttachments(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of key-value pairs that describe attachments to a version of a document.
   */
  public open fun attachments(__idx_ac66f0: List<Any>) {
    unwrap(this).setAttachments(__idx_ac66f0)
  }

  /**
   * A list of key-value pairs that describe attachments to a version of a document.
   */
  public open fun attachments(vararg __idx_ac66f0: Any): Unit = attachments(__idx_ac66f0.toList())

  /**
   * The content for the new SSM document in JSON or YAML.
   */
  public open fun content(): Any = unwrap(this).getContent()

  /**
   * The content for the new SSM document in JSON or YAML.
   */
  public open fun content(`value`: Any) {
    unwrap(this).setContent(`value`)
  }

  /**
   * Specify the document format for the request.
   */
  public open fun documentFormat(): String? = unwrap(this).getDocumentFormat()

  /**
   * Specify the document format for the request.
   */
  public open fun documentFormat(`value`: String) {
    unwrap(this).setDocumentFormat(`value`)
  }

  /**
   * The type of document to create.
   */
  public open fun documentType(): String? = unwrap(this).getDocumentType()

  /**
   * The type of document to create.
   */
  public open fun documentType(`value`: String) {
    unwrap(this).setDocumentType(`value`)
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
   * A name for the SSM document.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A name for the SSM document.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of SSM documents required by a document.
   */
  public open fun requires(): Any? = unwrap(this).getRequires()

  /**
   * A list of SSM documents required by a document.
   */
  public open fun requires(`value`: IResolvable) {
    unwrap(this).setRequires(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of SSM documents required by a document.
   */
  public open fun requires(__idx_ac66f0: List<Any>) {
    unwrap(this).setRequires(__idx_ac66f0)
  }

  /**
   * A list of SSM documents required by a document.
   */
  public open fun requires(vararg __idx_ac66f0: Any): Unit = requires(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * AWS CloudFormation resource tags to apply to the document.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * AWS CloudFormation resource tags to apply to the document.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * AWS CloudFormation resource tags to apply to the document.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specify a target type to define the kinds of resources the document can run on.
   */
  public open fun targetType(): String? = unwrap(this).getTargetType()

  /**
   * Specify a target type to define the kinds of resources the document can run on.
   */
  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  /**
   * If the document resource you specify in your template already exists, this parameter determines
   * whether a new version of the existing document is created, or the existing document is replaced.
   */
  public open fun updateMethod(): String? = unwrap(this).getUpdateMethod()

  /**
   * If the document resource you specify in your template already exists, this parameter determines
   * whether a new version of the existing document is created, or the existing document is replaced.
   */
  public open fun updateMethod(`value`: String) {
    unwrap(this).setUpdateMethod(`value`)
  }

  /**
   * An optional field specifying the version of the artifact you are creating with the document.
   */
  public open fun versionName(): String? = unwrap(this).getVersionName()

  /**
   * An optional field specifying the version of the artifact you are creating with the document.
   */
  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnDocument].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of key-value pairs that describe attachments to a version of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document. 
     */
    public fun attachments(attachments: IResolvable)

    /**
     * A list of key-value pairs that describe attachments to a version of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document. 
     */
    public fun attachments(attachments: List<Any>)

    /**
     * A list of key-value pairs that describe attachments to a version of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document. 
     */
    public fun attachments(vararg attachments: Any)

    /**
     * The content for the new SSM document in JSON or YAML.
     *
     * For more information about the schemas for SSM document content, see [SSM document schema
     * features and
     * examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * This parameter also supports `String` data types.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-content)
     * @param content The content for the new SSM document in JSON or YAML. 
     */
    public fun content(content: Any)

    /**
     * Specify the document format for the request.
     *
     * `JSON` is the default format.
     *
     * Default: - "JSON"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documentformat)
     * @param documentFormat Specify the document format for the request. 
     */
    public fun documentFormat(documentFormat: String)

    /**
     * The type of document to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documenttype)
     * @param documentType The type of document to create. 
     */
    public fun documentType(documentType: String)

    /**
     * A name for the SSM document.
     *
     *
     * You can't use the following strings as document name prefixes. These are reserved by AWS for
     * use as document name prefixes:
     *
     * * `aws`
     * * `amazon`
     * * `amzn`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-name)
     * @param name A name for the SSM document. 
     */
    public fun name(name: String)

    /**
     * A list of SSM documents required by a document.
     *
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-requires)
     * @param requires A list of SSM documents required by a document. 
     */
    public fun requires(requires: IResolvable)

    /**
     * A list of SSM documents required by a document.
     *
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-requires)
     * @param requires A list of SSM documents required by a document. 
     */
    public fun requires(requires: List<Any>)

    /**
     * A list of SSM documents required by a document.
     *
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-requires)
     * @param requires A list of SSM documents required by a document. 
     */
    public fun requires(vararg requires: Any)

    /**
     * AWS CloudFormation resource tags to apply to the document.
     *
     * Use tags to help you identify and categorize resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
     * @param tags AWS CloudFormation resource tags to apply to the document. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * AWS CloudFormation resource tags to apply to the document.
     *
     * Use tags to help you identify and categorize resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
     * @param tags AWS CloudFormation resource tags to apply to the document. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specify a target type to define the kinds of resources the document can run on.
     *
     * For example, to run a document on EC2 instances, specify the following value:
     * `/AWS::EC2::Instance` . If you specify a value of '/' the document can run on all types of
     * resources. If you don't specify a value, the document can't run on any resources. For a list of
     * valid resource types, see [AWS resource and property types
     * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-targettype)
     * @param targetType Specify a target type to define the kinds of resources the document can run
     * on. 
     */
    public fun targetType(targetType: String)

    /**
     * If the document resource you specify in your template already exists, this parameter
     * determines whether a new version of the existing document is created, or the existing document
     * is replaced.
     *
     * `Replace` is the default method. If you specify `NewVersion` for the `UpdateMethod`
     * parameter, and the `Name` of the document does not match an existing resource, a new document is
     * created. When you specify `NewVersion` , the default version of the document is changed to the
     * newly created version.
     *
     * Default: - "Replace"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-updatemethod)
     * @param updateMethod If the document resource you specify in your template already exists,
     * this parameter determines whether a new version of the existing document is created, or the
     * existing document is replaced. 
     */
    public fun updateMethod(updateMethod: String)

    /**
     * An optional field specifying the version of the artifact you are creating with the document.
     *
     * For example, `Release12.1` . This value is unique across all versions of a document, and
     * can't be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-versionname)
     * @param versionName An optional field specifying the version of the artifact you are creating
     * with the document. 
     */
    public fun versionName(versionName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnDocument.Builder =
        software.amazon.awscdk.services.ssm.CfnDocument.Builder.create(scope, id)

    /**
     * A list of key-value pairs that describe attachments to a version of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document. 
     */
    override fun attachments(attachments: IResolvable) {
      cdkBuilder.attachments(attachments.let(IResolvable::unwrap))
    }

    /**
     * A list of key-value pairs that describe attachments to a version of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document. 
     */
    override fun attachments(attachments: List<Any>) {
      cdkBuilder.attachments(attachments)
    }

    /**
     * A list of key-value pairs that describe attachments to a version of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document. 
     */
    override fun attachments(vararg attachments: Any): Unit = attachments(attachments.toList())

    /**
     * The content for the new SSM document in JSON or YAML.
     *
     * For more information about the schemas for SSM document content, see [SSM document schema
     * features and
     * examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * This parameter also supports `String` data types.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-content)
     * @param content The content for the new SSM document in JSON or YAML. 
     */
    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    /**
     * Specify the document format for the request.
     *
     * `JSON` is the default format.
     *
     * Default: - "JSON"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documentformat)
     * @param documentFormat Specify the document format for the request. 
     */
    override fun documentFormat(documentFormat: String) {
      cdkBuilder.documentFormat(documentFormat)
    }

    /**
     * The type of document to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documenttype)
     * @param documentType The type of document to create. 
     */
    override fun documentType(documentType: String) {
      cdkBuilder.documentType(documentType)
    }

    /**
     * A name for the SSM document.
     *
     *
     * You can't use the following strings as document name prefixes. These are reserved by AWS for
     * use as document name prefixes:
     *
     * * `aws`
     * * `amazon`
     * * `amzn`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-name)
     * @param name A name for the SSM document. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of SSM documents required by a document.
     *
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-requires)
     * @param requires A list of SSM documents required by a document. 
     */
    override fun requires(requires: IResolvable) {
      cdkBuilder.requires(requires.let(IResolvable::unwrap))
    }

    /**
     * A list of SSM documents required by a document.
     *
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-requires)
     * @param requires A list of SSM documents required by a document. 
     */
    override fun requires(requires: List<Any>) {
      cdkBuilder.requires(requires)
    }

    /**
     * A list of SSM documents required by a document.
     *
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-requires)
     * @param requires A list of SSM documents required by a document. 
     */
    override fun requires(vararg requires: Any): Unit = requires(requires.toList())

    /**
     * AWS CloudFormation resource tags to apply to the document.
     *
     * Use tags to help you identify and categorize resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
     * @param tags AWS CloudFormation resource tags to apply to the document. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * AWS CloudFormation resource tags to apply to the document.
     *
     * Use tags to help you identify and categorize resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
     * @param tags AWS CloudFormation resource tags to apply to the document. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specify a target type to define the kinds of resources the document can run on.
     *
     * For example, to run a document on EC2 instances, specify the following value:
     * `/AWS::EC2::Instance` . If you specify a value of '/' the document can run on all types of
     * resources. If you don't specify a value, the document can't run on any resources. For a list of
     * valid resource types, see [AWS resource and property types
     * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-targettype)
     * @param targetType Specify a target type to define the kinds of resources the document can run
     * on. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    /**
     * If the document resource you specify in your template already exists, this parameter
     * determines whether a new version of the existing document is created, or the existing document
     * is replaced.
     *
     * `Replace` is the default method. If you specify `NewVersion` for the `UpdateMethod`
     * parameter, and the `Name` of the document does not match an existing resource, a new document is
     * created. When you specify `NewVersion` , the default version of the document is changed to the
     * newly created version.
     *
     * Default: - "Replace"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-updatemethod)
     * @param updateMethod If the document resource you specify in your template already exists,
     * this parameter determines whether a new version of the existing document is created, or the
     * existing document is replaced. 
     */
    override fun updateMethod(updateMethod: String) {
      cdkBuilder.updateMethod(updateMethod)
    }

    /**
     * An optional field specifying the version of the artifact you are creating with the document.
     *
     * For example, `Release12.1` . This value is unique across all versions of a document, and
     * can't be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-versionname)
     * @param versionName An optional field specifying the version of the artifact you are creating
     * with the document. 
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnDocument = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocument {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocument(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocument): CfnDocument =
        CfnDocument(cdkObject)

    internal fun unwrap(wrapped: CfnDocument): software.amazon.awscdk.services.ssm.CfnDocument =
        wrapped.cdkObject
  }

  public interface AttachmentsSourceProperty {
    /**
     * The key of a key-value pair that identifies the location of an attachment to a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html#cfn-ssm-document-attachmentssource-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The name of the document attachment file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html#cfn-ssm-document-attachmentssource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of a key-value pair that identifies the location of an attachment to a document.
     *
     * The format for *Value* depends on the type of key you specify.
     *
     * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
     *
     * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
     *
     * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
     *
     * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
     *
     * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
     * document in your account, a version number of that document, and a file attached to that
     * document version that you want to reuse. For example:
     *
     * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
     *
     * However, if the SSM document is shared with you from another account, the full SSM document
     * ARN must be specified instead of the document name only. For example:
     *
     * `"Values": [
     * "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html#cfn-ssm-document-attachmentssource-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [AttachmentsSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key of a key-value pair that identifies the location of an attachment to a
       * document.
       */
      public fun key(key: String)

      /**
       * @param name The name of the document attachment file.
       */
      public fun name(name: String)

      /**
       * @param values The value of a key-value pair that identifies the location of an attachment
       * to a document.
       * The format for *Value* depends on the type of key you specify.
       *
       * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
       *
       * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
       *
       * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
       * document in your account, a version number of that document, and a file attached to that
       * document version that you want to reuse. For example:
       *
       * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
       *
       * However, if the SSM document is shared with you from another account, the full SSM document
       * ARN must be specified instead of the document name only. For example:
       *
       * `"Values": [
       * "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]`
       */
      public fun values(values: List<String>)

      /**
       * @param values The value of a key-value pair that identifies the location of an attachment
       * to a document.
       * The format for *Value* depends on the type of key you specify.
       *
       * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
       *
       * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
       *
       * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
       * document in your account, a version number of that document, and a file attached to that
       * document version that you want to reuse. For example:
       *
       * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
       *
       * However, if the SSM document is shared with you from another account, the full SSM document
       * ARN must be specified instead of the document name only. For example:
       *
       * `"Values": [
       * "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]`
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty.builder()

      /**
       * @param key The key of a key-value pair that identifies the location of an attachment to a
       * document.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param name The name of the document attachment file.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param values The value of a key-value pair that identifies the location of an attachment
       * to a document.
       * The format for *Value* depends on the type of key you specify.
       *
       * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
       *
       * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
       *
       * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
       * document in your account, a version number of that document, and a file attached to that
       * document version that you want to reuse. For example:
       *
       * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
       *
       * However, if the SSM document is shared with you from another account, the full SSM document
       * ARN must be specified instead of the document name only. For example:
       *
       * `"Values": [
       * "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]`
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The value of a key-value pair that identifies the location of an attachment
       * to a document.
       * The format for *Value* depends on the type of key you specify.
       *
       * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
       *
       * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
       *
       * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
       * document in your account, a version number of that document, and a file attached to that
       * document version that you want to reuse. For example:
       *
       * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
       *
       * However, if the SSM document is shared with you from another account, the full SSM document
       * ARN must be specified instead of the document name only. For example:
       *
       * `"Values": [
       * "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]`
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty,
    ) : AttachmentsSourceProperty {
      /**
       * The key of a key-value pair that identifies the location of an attachment to a document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html#cfn-ssm-document-attachmentssource-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The name of the document attachment file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html#cfn-ssm-document-attachmentssource-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of a key-value pair that identifies the location of an attachment to a document.
       *
       * The format for *Value* depends on the type of key you specify.
       *
       * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
       *
       * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
       *
       * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
       *
       * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
       * document in your account, a version number of that document, and a file attached to that
       * document version that you want to reuse. For example:
       *
       * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
       *
       * However, if the SSM document is shared with you from another account, the full SSM document
       * ARN must be specified instead of the document name only. For example:
       *
       * `"Values": [
       * "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html#cfn-ssm-document-attachmentssource-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttachmentsSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty):
          AttachmentsSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttachmentsSourceProperty):
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DocumentRequiresProperty {
    /**
     * The name of the required SSM document.
     *
     * The name can be an Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-documentrequires.html#cfn-ssm-document-documentrequires-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The document version required by the current document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-documentrequires.html#cfn-ssm-document-documentrequires-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [DocumentRequiresProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the required SSM document.
       * The name can be an Amazon Resource Name (ARN).
       */
      public fun name(name: String)

      /**
       * @param version The document version required by the current document.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty.builder()

      /**
       * @param name The name of the required SSM document.
       * The name can be an Amazon Resource Name (ARN).
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The document version required by the current document.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty,
    ) : DocumentRequiresProperty {
      /**
       * The name of the required SSM document.
       *
       * The name can be an Amazon Resource Name (ARN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-documentrequires.html#cfn-ssm-document-documentrequires-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The document version required by the current document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-documentrequires.html#cfn-ssm-document-documentrequires-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentRequiresProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty):
          DocumentRequiresProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentRequiresProperty):
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
