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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtension
import software.constructs.Construct

/**
 * Creates an AWS AppConfig extension.
 *
 * An extension augments your ability to inject logic or behavior at different points during the AWS
 * AppConfig workflow of creating or deploying a configuration.
 *
 * You can create your own extensions or use the AWS authored extensions provided by AWS AppConfig .
 * For an AWS AppConfig extension that uses AWS Lambda , you must create a Lambda function to
 * perform any computation and processing defined in the extension. If you plan to create custom
 * versions of the AWS authored notification extensions, you only need to specify an Amazon Resource
 * Name (ARN) in the `Uri` field for the new extension version.
 * * For a custom EventBridge notification extension, enter the ARN of the EventBridge default
 *   events in the `Uri` field.
 * * For a custom Amazon SNS notification extension, enter the ARN of an Amazon SNS topic in the
 *   `Uri` field.
 * * For a custom Amazon SQS notification extension, enter the ARN of an Amazon SQS message queue in
 *   the `Uri` field.
 *
 * For more information about extensions, see
 * [Working with AWS AppConfig extensions](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
 * in the *AWS AppConfig User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * Object actions;
 * CfnExtension cfnExtension = CfnExtension.Builder.create(this, "MyCfnExtension")
 * .actions(actions)
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .latestVersionNumber(123)
 * .parameters(Map.of(
 * "parametersKey", ParameterProperty.builder()
 * .required(false)
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html)
 */
@CdkDslMarker
public class CfnExtensionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnExtension.Builder = CfnExtension.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The actions defined in the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-actions)
     *
     * @param actions The actions defined in the extension.
     */
    public fun actions(actions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(actions)
        cdkBuilder.actions(builder.map)
    }

    /**
     * The actions defined in the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-actions)
     *
     * @param actions The actions defined in the extension.
     */
    public fun actions(actions: Any) {
        cdkBuilder.actions(actions)
    }

    /**
     * Information about the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-description)
     *
     * @param description Information about the extension.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * You can omit this field when you create an extension.
     *
     * When you create a new version, specify the most recent current version number. For example,
     * you create version 3, enter 2 for this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-latestversionnumber)
     *
     * @param latestVersionNumber You can omit this field when you create an extension.
     */
    public fun latestVersionNumber(latestVersionNumber: Number) {
        cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * A name for the extension.
     *
     * Each extension name in your account must be unique. Extension versions use the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-name)
     *
     * @param name A name for the extension.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     *
     * @param parameters The parameters accepted by the extension.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     *
     * @param parameters The parameters accepted by the extension.
     */
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     *
     * @param parameters The parameters accepted by the extension.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * Adds one or more tags for the specified extension.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of
     * which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
     *
     * @param tags Adds one or more tags for the specified extension.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Adds one or more tags for the specified extension.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of
     * which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
     *
     * @param tags Adds one or more tags for the specified extension.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnExtension {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
