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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnMitigationAction
import software.constructs.Construct

/**
 * Defines an action that can be applied to audit findings by using StartAuditMitigationActionsTask.
 *
 * For API reference, see
 * [CreateMitigationAction](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateMitigationAction.html)
 * and for general information, see
 * [Mitigation actions](https://docs.aws.amazon.com/iot/latest/developerguide/dd-mitigation-actions.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnMitigationAction cfnMitigationAction = CfnMitigationAction.Builder.create(this,
 * "MyCfnMitigationAction")
 * .actionParams(ActionParamsProperty.builder()
 * .addThingsToThingGroupParams(AddThingsToThingGroupParamsProperty.builder()
 * .thingGroupNames(List.of("thingGroupNames"))
 * // the properties below are optional
 * .overrideDynamicGroups(false)
 * .build())
 * .enableIoTLoggingParams(EnableIoTLoggingParamsProperty.builder()
 * .logLevel("logLevel")
 * .roleArnForLogging("roleArnForLogging")
 * .build())
 * .publishFindingToSnsParams(PublishFindingToSnsParamsProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .replaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsProperty.builder()
 * .templateName("templateName")
 * .build())
 * .updateCaCertificateParams(UpdateCACertificateParamsProperty.builder()
 * .action("action")
 * .build())
 * .updateDeviceCertificateParams(UpdateDeviceCertificateParamsProperty.builder()
 * .action("action")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .actionName("actionName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html)
 */
@CdkDslMarker
public class CfnMitigationActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMitigationAction.Builder =
        CfnMitigationAction.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The friendly name of the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionname)
     *
     * @param actionName The friendly name of the mitigation action.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     *
     * @param actionParams The set of parameters for this mitigation action.
     */
    public fun actionParams(actionParams: IResolvable) {
        cdkBuilder.actionParams(actionParams)
    }

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     *
     * @param actionParams The set of parameters for this mitigation action.
     */
    public fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty) {
        cdkBuilder.actionParams(actionParams)
    }

    /**
     * The IAM role ARN used to apply this mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-rolearn)
     *
     * @param roleArn The IAM role ARN used to apply this mitigation action.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * Metadata that can be used to manage the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
     *
     * @param tags Metadata that can be used to manage the mitigation action.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata that can be used to manage the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
     *
     * @param tags Metadata that can be used to manage the mitigation action.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMitigationAction {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
