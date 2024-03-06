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

package io.cloudshiftdev.awscdkdsl.services.verifiedpermissions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate
import software.constructs.Construct

/**
 * Creates a policy template.
 *
 * A template can use placeholders for the principal and resource. A template must be instantiated
 * into a policy by associating it with specific principals and resources to use for the
 * placeholders. That instantiated policy can then be considered in authorization decisions. The
 * instantiated policy works identically to any other policy, except that it is dynamically linked
 * to the template. If the template changes, then any policies that are linked to that template are
 * immediately updated as well.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CfnPolicyTemplate cfnPolicyTemplate = CfnPolicyTemplate.Builder.create(this,
 * "MyCfnPolicyTemplate")
 * .policyStoreId("policyStoreId")
 * .statement("statement")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html)
 */
@CdkDslMarker
public class CfnPolicyTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPolicyTemplate.Builder = CfnPolicyTemplate.Builder.create(scope, id)

    /**
     * The description to attach to the new or updated policy template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-description)
     *
     * @param description The description to attach to the new or updated policy template.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The unique identifier of the policy store that contains the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-policystoreid)
     *
     * @param policyStoreId The unique identifier of the policy store that contains the template.
     */
    public fun policyStoreId(policyStoreId: String) {
        cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * Specifies the content that you want to use for the new policy template, written in the Cedar
     * policy language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-statement)
     *
     * @param statement Specifies the content that you want to use for the new policy template,
     *   written in the Cedar policy language.
     */
    public fun statement(statement: String) {
        cdkBuilder.statement(statement)
    }

    public fun build(): CfnPolicyTemplate = cdkBuilder.build()
}
