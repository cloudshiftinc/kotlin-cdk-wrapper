@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDocument`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * Object content;
 * CfnDocumentProps cfnDocumentProps = CfnDocumentProps.builder()
 * .content(content)
 * // the properties below are optional
 * .attachments(List.of(AttachmentsSourceProperty.builder()
 * .key("key")
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .documentFormat("documentFormat")
 * .documentType("documentType")
 * .name("name")
 * .requires(List.of(DocumentRequiresProperty.builder()
 * .name("name")
 * .version("version")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetType("targetType")
 * .updateMethod("updateMethod")
 * .versionName("versionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
 */
public interface CfnDocumentProps {
  /**
   * A list of key-value pairs that describe attachments to a version of a document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
   */
  public fun attachments(): Any? = unwrap(this).getAttachments()

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
   */
  public fun content(): Any

  /**
   * Specify the document format for the request.
   *
   * `JSON` is the default format.
   *
   * Default: - "JSON"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documentformat)
   */
  public fun documentFormat(): String? = unwrap(this).getDocumentFormat()

  /**
   * The type of document to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documenttype)
   */
  public fun documentType(): String? = unwrap(this).getDocumentType()

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
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A list of SSM documents required by a document.
   *
   * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
   * configuration in an SSM document, the user must also specify a required document for validation
   * purposes. In this case, an `ApplicationConfiguration` document requires an
   * `ApplicationConfigurationSchema` document for validation purposes. For more information, see [What
   * is AWS AppConfig ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
   * in the *AWS AppConfig User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-requires)
   */
  public fun requires(): Any? = unwrap(this).getRequires()

  /**
   * AWS CloudFormation resource tags to apply to the document.
   *
   * Use tags to help you identify and categorize resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun targetType(): String? = unwrap(this).getTargetType()

  /**
   * If the document resource you specify in your template already exists, this parameter determines
   * whether a new version of the existing document is created, or the existing document is replaced.
   *
   * `Replace` is the default method. If you specify `NewVersion` for the `UpdateMethod` parameter,
   * and the `Name` of the document does not match an existing resource, a new document is created.
   * When you specify `NewVersion` , the default version of the document is changed to the newly
   * created version.
   *
   * Default: - "Replace"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-updatemethod)
   */
  public fun updateMethod(): String? = unwrap(this).getUpdateMethod()

  /**
   * An optional field specifying the version of the artifact you are creating with the document.
   *
   * For example, `Release12.1` . This value is unique across all versions of a document, and can't
   * be changed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-versionname)
   */
  public fun versionName(): String? = unwrap(this).getVersionName()

  /**
   * A builder for [CfnDocumentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document.
     */
    public fun attachments(attachments: IResolvable)

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document.
     */
    public fun attachments(attachments: List<Any>)

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document.
     */
    public fun attachments(vararg attachments: Any)

    /**
     * @param content The content for the new SSM document in JSON or YAML. 
     * For more information about the schemas for SSM document content, see [SSM document schema
     * features and
     * examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * This parameter also supports `String` data types.
     */
    public fun content(content: Any)

    /**
     * @param documentFormat Specify the document format for the request.
     * `JSON` is the default format.
     */
    public fun documentFormat(documentFormat: String)

    /**
     * @param documentType The type of document to create.
     */
    public fun documentType(documentType: String)

    /**
     * @param name A name for the SSM document.
     *
     * You can't use the following strings as document name prefixes. These are reserved by AWS for
     * use as document name prefixes:
     *
     * * `aws`
     * * `amazon`
     * * `amzn`
     */
    public fun name(name: String)

    /**
     * @param requires A list of SSM documents required by a document.
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     */
    public fun requires(requires: IResolvable)

    /**
     * @param requires A list of SSM documents required by a document.
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     */
    public fun requires(requires: List<Any>)

    /**
     * @param requires A list of SSM documents required by a document.
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     */
    public fun requires(vararg requires: Any)

    /**
     * @param tags AWS CloudFormation resource tags to apply to the document.
     * Use tags to help you identify and categorize resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags AWS CloudFormation resource tags to apply to the document.
     * Use tags to help you identify and categorize resources.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetType Specify a target type to define the kinds of resources the document can run
     * on.
     * For example, to run a document on EC2 instances, specify the following value:
     * `/AWS::EC2::Instance` . If you specify a value of '/' the document can run on all types of
     * resources. If you don't specify a value, the document can't run on any resources. For a list of
     * valid resource types, see [AWS resource and property types
     * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * in the *AWS CloudFormation User Guide* .
     */
    public fun targetType(targetType: String)

    /**
     * @param updateMethod If the document resource you specify in your template already exists,
     * this parameter determines whether a new version of the existing document is created, or the
     * existing document is replaced.
     * `Replace` is the default method. If you specify `NewVersion` for the `UpdateMethod`
     * parameter, and the `Name` of the document does not match an existing resource, a new document is
     * created. When you specify `NewVersion` , the default version of the document is changed to the
     * newly created version.
     */
    public fun updateMethod(updateMethod: String)

    /**
     * @param versionName An optional field specifying the version of the artifact you are creating
     * with the document.
     * For example, `Release12.1` . This value is unique across all versions of a document, and
     * can't be changed.
     */
    public fun versionName(versionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnDocumentProps.Builder =
        software.amazon.awscdk.services.ssm.CfnDocumentProps.builder()

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document.
     */
    override fun attachments(attachments: IResolvable) {
      cdkBuilder.attachments(attachments.let(IResolvable::unwrap))
    }

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document.
     */
    override fun attachments(attachments: List<Any>) {
      cdkBuilder.attachments(attachments)
    }

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     * document.
     */
    override fun attachments(vararg attachments: Any): Unit = attachments(attachments.toList())

    /**
     * @param content The content for the new SSM document in JSON or YAML. 
     * For more information about the schemas for SSM document content, see [SSM document schema
     * features and
     * examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * This parameter also supports `String` data types.
     */
    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    /**
     * @param documentFormat Specify the document format for the request.
     * `JSON` is the default format.
     */
    override fun documentFormat(documentFormat: String) {
      cdkBuilder.documentFormat(documentFormat)
    }

    /**
     * @param documentType The type of document to create.
     */
    override fun documentType(documentType: String) {
      cdkBuilder.documentType(documentType)
    }

    /**
     * @param name A name for the SSM document.
     *
     * You can't use the following strings as document name prefixes. These are reserved by AWS for
     * use as document name prefixes:
     *
     * * `aws`
     * * `amazon`
     * * `amzn`
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param requires A list of SSM documents required by a document.
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     */
    override fun requires(requires: IResolvable) {
      cdkBuilder.requires(requires.let(IResolvable::unwrap))
    }

    /**
     * @param requires A list of SSM documents required by a document.
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     */
    override fun requires(requires: List<Any>) {
      cdkBuilder.requires(requires)
    }

    /**
     * @param requires A list of SSM documents required by a document.
     * This parameter is used exclusively by AWS AppConfig . When a user creates an AWS AppConfig
     * configuration in an SSM document, the user must also specify a required document for validation
     * purposes. In this case, an `ApplicationConfiguration` document requires an
     * `ApplicationConfigurationSchema` document for validation purposes. For more information, see
     * [What is AWS AppConfig
     * ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the *AWS
     * AppConfig User Guide* .
     */
    override fun requires(vararg requires: Any): Unit = requires(requires.toList())

    /**
     * @param tags AWS CloudFormation resource tags to apply to the document.
     * Use tags to help you identify and categorize resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags AWS CloudFormation resource tags to apply to the document.
     * Use tags to help you identify and categorize resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetType Specify a target type to define the kinds of resources the document can run
     * on.
     * For example, to run a document on EC2 instances, specify the following value:
     * `/AWS::EC2::Instance` . If you specify a value of '/' the document can run on all types of
     * resources. If you don't specify a value, the document can't run on any resources. For a list of
     * valid resource types, see [AWS resource and property types
     * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * in the *AWS CloudFormation User Guide* .
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    /**
     * @param updateMethod If the document resource you specify in your template already exists,
     * this parameter determines whether a new version of the existing document is created, or the
     * existing document is replaced.
     * `Replace` is the default method. If you specify `NewVersion` for the `UpdateMethod`
     * parameter, and the `Name` of the document does not match an existing resource, a new document is
     * created. When you specify `NewVersion` , the default version of the document is changed to the
     * newly created version.
     */
    override fun updateMethod(updateMethod: String) {
      cdkBuilder.updateMethod(updateMethod)
    }

    /**
     * @param versionName An optional field specifying the version of the artifact you are creating
     * with the document.
     * For example, `Release12.1` . This value is unique across all versions of a document, and
     * can't be changed.
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnDocumentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnDocumentProps,
  ) : CdkObject(cdkObject), CfnDocumentProps {
    /**
     * A list of key-value pairs that describe attachments to a version of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-attachments)
     */
    override fun attachments(): Any? = unwrap(this).getAttachments()

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
     */
    override fun content(): Any = unwrap(this).getContent()

    /**
     * Specify the document format for the request.
     *
     * `JSON` is the default format.
     *
     * Default: - "JSON"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documentformat)
     */
    override fun documentFormat(): String? = unwrap(this).getDocumentFormat()

    /**
     * The type of document to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documenttype)
     */
    override fun documentType(): String? = unwrap(this).getDocumentType()

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
     */
    override fun name(): String? = unwrap(this).getName()

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
     */
    override fun requires(): Any? = unwrap(this).getRequires()

    /**
     * AWS CloudFormation resource tags to apply to the document.
     *
     * Use tags to help you identify and categorize resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun targetType(): String? = unwrap(this).getTargetType()

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
     */
    override fun updateMethod(): String? = unwrap(this).getUpdateMethod()

    /**
     * An optional field specifying the version of the artifact you are creating with the document.
     *
     * For example, `Release12.1` . This value is unique across all versions of a document, and
     * can't be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-versionname)
     */
    override fun versionName(): String? = unwrap(this).getVersionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocumentProps):
        CfnDocumentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDocumentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentProps):
        software.amazon.awscdk.services.ssm.CfnDocumentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.CfnDocumentProps
  }
}
