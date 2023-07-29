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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnGroup

/**
 * A group version in AWS IoT Greengrass , which references of a core definition version, device
 * definition version, subscription definition version, and other version types that contain the
 * components you want to deploy to a Greengrass core device.
 *
 * The group version must reference a core definition version that contains one core. Other version
 * types are optionally included, depending on your business need.
 *
 * In an AWS CloudFormation template, `GroupVersion` is the property type of the `InitialVersion`
 * property in the
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * GroupVersionProperty groupVersionProperty = GroupVersionProperty.builder()
 * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
 * .coreDefinitionVersionArn("coreDefinitionVersionArn")
 * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
 * .functionDefinitionVersionArn("functionDefinitionVersionArn")
 * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
 * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
 * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html)
 */
@CdkDslMarker
public class CfnGroupGroupVersionPropertyDsl {
    private val cdkBuilder: CfnGroup.GroupVersionProperty.Builder =
        CfnGroup.GroupVersionProperty.builder()

    /**
     * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
     *   definition version that contains the connectors you want to deploy with the group version.
     */
    public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
        cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
    }

    /**
     * @param coreDefinitionVersionArn The ARN of the core definition version that contains the core
     *   you want to deploy with the group version. Currently, the core definition version can
     *   contain only one core.
     */
    public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
        cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
    }

    /**
     * @param deviceDefinitionVersionArn The ARN of the device definition version that contains the
     *   devices you want to deploy with the group version.
     */
    public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
        cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
    }

    /**
     * @param functionDefinitionVersionArn The ARN of the function definition version that contains
     *   the functions you want to deploy with the group version.
     */
    public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
        cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
    }

    /**
     * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains the
     *   loggers you want to deploy with the group version.
     */
    public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
        cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
    }

    /**
     * @param resourceDefinitionVersionArn The ARN of the resource definition version that contains
     *   the resources you want to deploy with the group version.
     */
    public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
        cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
    }

    /**
     * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
     *   contains the subscriptions you want to deploy with the group version.
     */
    public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
        cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
    }

    public fun build(): CfnGroup.GroupVersionProperty = cdkBuilder.build()
}
