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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnExtension

/**
 * An action defines the tasks that the extension performs during the AWS AppConfig workflow.
 *
 * Each action includes an action point such as `ON_CREATE_HOSTED_CONFIGURATION` , `PRE_DEPLOYMENT`
 * , or `ON_DEPLOYMENT` . Each action also includes a name, a URI to an AWS Lambda function, and an
 * Amazon Resource Name (ARN) for an AWS Identity and Access Management assume role. You specify the
 * name, URI, and ARN for each *action point* defined in the extension. You can specify the
 * following actions for an extension:
 * * `PRE_CREATE_HOSTED_CONFIGURATION_VERSION`
 * * `PRE_START_DEPLOYMENT`
 * * `ON_DEPLOYMENT_START`
 * * `ON_DEPLOYMENT_STEP`
 * * `ON_DEPLOYMENT_BAKING`
 * * `ON_DEPLOYMENT_COMPLETE`
 * * `ON_DEPLOYMENT_ROLLED_BACK`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .name("name")
 * .uri("uri")
 * // the properties below are optional
 * .description("description")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html)
 */
@CdkDslMarker
public class CfnExtensionActionPropertyDsl {
    private val cdkBuilder: CfnExtension.ActionProperty.Builder =
        CfnExtension.ActionProperty.builder()

    /** @param description Information about the action. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The action name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param roleArn An Amazon Resource Name (ARN) for an AWS Identity and Access Management assume
     *   role.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param uri The extension URI associated to the action point in the extension definition. The
     *   URI can be an Amazon Resource Name (ARN) for one of the following: an AWS Lambda function,
     *   an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic, or the
     *   Amazon EventBridge default event bus.
     */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnExtension.ActionProperty = cdkBuilder.build()
}
