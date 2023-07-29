@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnDocumentProps

/**
 * Properties for defining a `CfnDocument`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
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
@CdkDslMarker
public class CfnDocumentPropsDsl {
    private val cdkBuilder: CfnDocumentProps.Builder = CfnDocumentProps.builder()

    private val _attachments: MutableList<Any> = mutableListOf()

    private val _requires: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     *   document.
     */
    public fun attachments(vararg attachments: Any) {
        _attachments.addAll(listOf(*attachments))
    }

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     *   document.
     */
    public fun attachments(attachments: Collection<Any>) {
        _attachments.addAll(attachments)
    }

    /**
     * @param attachments A list of key-value pairs that describe attachments to a version of a
     *   document.
     */
    public fun attachments(attachments: IResolvable) {
        cdkBuilder.attachments(attachments)
    }

    /**
     * @param content The content for the new SSM document in JSON or YAML. For more information
     *   about the schemas for SSM document content, see
     *   [SSM document schema features and examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html)
     *   in the *AWS Systems Manager User Guide* .
     *
     * This parameter also supports `String` data types.
     */
    public fun content(content: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(content)
        cdkBuilder.content(builder.map)
    }

    /**
     * @param content The content for the new SSM document in JSON or YAML. For more information
     *   about the schemas for SSM document content, see
     *   [SSM document schema features and examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html)
     *   in the *AWS Systems Manager User Guide* .
     *
     * This parameter also supports `String` data types.
     */
    public fun content(content: Any) {
        cdkBuilder.content(content)
    }

    /**
     * @param documentFormat Specify the document format for the request. JSON is the default
     *   format.
     */
    public fun documentFormat(documentFormat: String) {
        cdkBuilder.documentFormat(documentFormat)
    }

    /**
     * @param documentType The type of document to create. *Allowed Values* :
     *   `ApplicationConfigurationSchema` | `Automation` | `Automation.ChangeTemplate` | `Command` |
     *   `DeploymentStrategy` | `Package` | `Policy` | `Session`
     */
    public fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
    }

    /**
     * @param name A name for the SSM document.
     *
     * You can't use the following strings as document name prefixes. These are reserved by AWS for
     * use as document name prefixes:
     * * `aws`
     * * `amazon`
     * * `amzn`
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param requires A list of SSM documents required by a document. This parameter is used
     *   exclusively by AWS AppConfig . When a user creates an AWS AppConfig configuration in an SSM
     *   document, the user must also specify a required document for validation purposes. In this
     *   case, an `ApplicationConfiguration` document requires an `ApplicationConfigurationSchema`
     *   document for validation purposes. For more information, see
     *   [What is AWS AppConfig ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     *   in the *AWS AppConfig User Guide* .
     */
    public fun requires(vararg requires: Any) {
        _requires.addAll(listOf(*requires))
    }

    /**
     * @param requires A list of SSM documents required by a document. This parameter is used
     *   exclusively by AWS AppConfig . When a user creates an AWS AppConfig configuration in an SSM
     *   document, the user must also specify a required document for validation purposes. In this
     *   case, an `ApplicationConfiguration` document requires an `ApplicationConfigurationSchema`
     *   document for validation purposes. For more information, see
     *   [What is AWS AppConfig ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     *   in the *AWS AppConfig User Guide* .
     */
    public fun requires(requires: Collection<Any>) {
        _requires.addAll(requires)
    }

    /**
     * @param requires A list of SSM documents required by a document. This parameter is used
     *   exclusively by AWS AppConfig . When a user creates an AWS AppConfig configuration in an SSM
     *   document, the user must also specify a required document for validation purposes. In this
     *   case, an `ApplicationConfiguration` document requires an `ApplicationConfigurationSchema`
     *   document for validation purposes. For more information, see
     *   [What is AWS AppConfig ?](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     *   in the *AWS AppConfig User Guide* .
     */
    public fun requires(requires: IResolvable) {
        cdkBuilder.requires(requires)
    }

    /**
     * @param tags AWS CloudFormation resource tags to apply to the document. Use tags to help you
     *   identify and categorize resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags AWS CloudFormation resource tags to apply to the document. Use tags to help you
     *   identify and categorize resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetType Specify a target type to define the kinds of resources the document can run
     *   on. For example, to run a document on EC2 instances, specify the following value:
     *   `/AWS::EC2::Instance` . If you specify a value of '/' the document can run on all types of
     *   resources. If you don't specify a value, the document can't run on any resources. For a
     *   list of valid resource types, see
     *   [AWS resource and property types reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     *   in the *AWS CloudFormation User Guide* .
     */
    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    /**
     * @param updateMethod If the document resource you specify in your template already exists,
     *   this parameter determines whether a new version of the existing document is created, or the
     *   existing document is replaced. `Replace` is the default method. If you specify `NewVersion`
     *   for the `UpdateMethod` parameter, and the `Name` of the document does not match an existing
     *   resource, a new document is created. When you specify `NewVersion` , the default version of
     *   the document is changed to the newly created version.
     */
    public fun updateMethod(updateMethod: String) {
        cdkBuilder.updateMethod(updateMethod)
    }

    /**
     * @param versionName An optional field specifying the version of the artifact you are creating
     *   with the document. For example, `Release12.1` . This value is unique across all versions of
     *   a document, and can't be changed.
     */
    public fun versionName(versionName: String) {
        cdkBuilder.versionName(versionName)
    }

    public fun build(): CfnDocumentProps {
        if (_attachments.isNotEmpty()) cdkBuilder.attachments(_attachments)
        if (_requires.isNotEmpty()) cdkBuilder.requires(_requires)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
