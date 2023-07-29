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
import software.amazon.awscdk.services.greengrass.CfnGroupVersion
import software.constructs.Construct

/**
 * The `AWS::Greengrass::GroupVersion` resource represents a group version in AWS IoT Greengrass .
 *
 * A group version references a core definition version, device definition version, subscription
 * definition version, and other version types that contain the components you want to deploy to a
 * Greengrass core device. The group version must reference a core definition version that contains
 * one core. Other version types are optionally included, depending on your business need.
 *
 * To create a group version, you must specify the ID of the group that you want to associate with
 * the version. For information about creating a group, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * CfnGroupVersion cfnGroupVersion = CfnGroupVersion.Builder.create(this, "MyCfnGroupVersion")
 * .groupId("groupId")
 * // the properties below are optional
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
 */
@CdkDslMarker
public class CfnGroupVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGroupVersion.Builder = CfnGroupVersion.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the connector definition version that contains the
     * connectors you want to deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn)
     *
     * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
     *   definition version that contains the connectors you want to deploy with the group version.
     */
    public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
        cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
    }

    /**
     * The ARN of the core definition version that contains the core you want to deploy with the
     * group version.
     *
     * Currently, the core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn)
     *
     * @param coreDefinitionVersionArn The ARN of the core definition version that contains the core
     *   you want to deploy with the group version.
     */
    public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
        cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
    }

    /**
     * The ARN of the device definition version that contains the devices you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn)
     *
     * @param deviceDefinitionVersionArn The ARN of the device definition version that contains the
     *   devices you want to deploy with the group version.
     */
    public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
        cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
    }

    /**
     * The ARN of the function definition version that contains the functions you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn)
     *
     * @param functionDefinitionVersionArn The ARN of the function definition version that contains
     *   the functions you want to deploy with the group version.
     */
    public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
        cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
    }

    /**
     * The ID of the group associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid)
     *
     * @param groupId The ID of the group associated with this version.
     */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    /**
     * The ARN of the logger definition version that contains the loggers you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn)
     *
     * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains the
     *   loggers you want to deploy with the group version.
     */
    public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
        cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
    }

    /**
     * The ARN of the resource definition version that contains the resources you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn)
     *
     * @param resourceDefinitionVersionArn The ARN of the resource definition version that contains
     *   the resources you want to deploy with the group version.
     */
    public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
        cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
    }

    /**
     * The ARN of the subscription definition version that contains the subscriptions you want to
     * deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn)
     *
     * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
     *   contains the subscriptions you want to deploy with the group version.
     */
    public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
        cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
    }

    public fun build(): CfnGroupVersion = cdkBuilder.build()
}
