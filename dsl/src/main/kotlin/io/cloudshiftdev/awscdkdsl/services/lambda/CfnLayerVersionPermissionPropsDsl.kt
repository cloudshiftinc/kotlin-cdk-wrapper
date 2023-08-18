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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps

/**
 * Properties for defining a `CfnLayerVersionPermission`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnLayerVersionPermissionProps cfnLayerVersionPermissionProps =
 * CfnLayerVersionPermissionProps.builder()
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
public class CfnLayerVersionPermissionPropsDsl {
    private val cdkBuilder: CfnLayerVersionPermissionProps.Builder =
        CfnLayerVersionPermissionProps.builder()

    /**
     * @param action The API action that grants access to the layer. For example,
     *   `lambda:GetLayerVersion` .
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /** @param layerVersionArn The name or Amazon Resource Name (ARN) of the layer. */
    public fun layerVersionArn(layerVersionArn: String) {
        cdkBuilder.layerVersionArn(layerVersionArn)
    }

    /**
     * @param organizationId With the principal set to `*` , grant permission to all accounts in the
     *   specified organization.
     */
    public fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
    }

    /**
     * @param principal An account ID, or `*` to grant layer usage permission to all accounts in an
     *   organization, or all AWS accounts (if `organizationId` is not specified). For the last
     *   case, make sure that you really do want all AWS accounts to have usage permission to this
     *   layer.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun build(): CfnLayerVersionPermissionProps = cdkBuilder.build()
}
