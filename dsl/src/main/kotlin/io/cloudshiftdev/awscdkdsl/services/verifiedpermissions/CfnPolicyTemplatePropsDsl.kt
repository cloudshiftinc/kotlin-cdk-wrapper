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
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps

/**
 * Properties for defining a `CfnPolicyTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CfnPolicyTemplateProps cfnPolicyTemplateProps = CfnPolicyTemplateProps.builder()
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
public class CfnPolicyTemplatePropsDsl {
    private val cdkBuilder: CfnPolicyTemplateProps.Builder = CfnPolicyTemplateProps.builder()

    /** @param description The description to attach to the new or updated policy template. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param policyStoreId The unique identifier of the policy store that contains the template.
     */
    public fun policyStoreId(policyStoreId: String) {
        cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * @param statement Specifies the content that you want to use for the new policy template,
     *   written in the Cedar policy language.
     */
    public fun statement(statement: String) {
        cdkBuilder.statement(statement)
    }

    public fun build(): CfnPolicyTemplateProps = cdkBuilder.build()
}
