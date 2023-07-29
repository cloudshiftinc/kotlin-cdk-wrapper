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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.constructs.Construct

/**
 * The `AWS::Lambda::LayerVersionPermission` resource adds permissions to the resource-based policy
 * of a version of an
 * [Lambda layer](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) . Use this
 * action to grant layer usage permission to other accounts. You can grant permission to a single
 * account, all AWS accounts, or all accounts in an organization.
 *
 * Since the release of the
 * [UpdateReplacePolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
 * both `UpdateReplacePolicy` and `DeletionPolicy` are required to protect your
 * Resources/LayerPermissions from deletion.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnLayerVersionPermission cfnLayerVersionPermission =
 * CfnLayerVersionPermission.Builder.create(this, "MyCfnLayerVersionPermission")
 * .action("action")
 * .layerVersionArn("layerVersionArn")
 * .principal("principal")
 * // the properties below are optional
 * .organizationId("organizationId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html)
 */
@CdkDslMarker
public class CfnLayerVersionPermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLayerVersionPermission.Builder =
        CfnLayerVersionPermission.Builder.create(scope, id)

    /**
     * The API action that grants access to the layer.
     *
     * For example, `lambda:GetLayerVersion` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-action)
     *
     * @param action The API action that grants access to the layer.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * The name or Amazon Resource Name (ARN) of the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-layerversionarn)
     *
     * @param layerVersionArn The name or Amazon Resource Name (ARN) of the layer.
     */
    public fun layerVersionArn(layerVersionArn: String) {
        cdkBuilder.layerVersionArn(layerVersionArn)
    }

    /**
     * With the principal set to `*` , grant permission to all accounts in the specified
     * organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-organizationid)
     *
     * @param organizationId With the principal set to `*` , grant permission to all accounts in the
     *   specified organization.
     */
    public fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
    }

    /**
     * An account ID, or `*` to grant layer usage permission to all accounts in an organization, or
     * all AWS accounts (if `organizationId` is not specified).
     *
     * For the last case, make sure that you really do want all AWS accounts to have usage
     * permission to this layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-principal)
     *
     * @param principal An account ID, or `*` to grant layer usage permission to all accounts in an
     *   organization, or all AWS accounts (if `organizationId` is not specified).
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun build(): CfnLayerVersionPermission = cdkBuilder.build()
}
