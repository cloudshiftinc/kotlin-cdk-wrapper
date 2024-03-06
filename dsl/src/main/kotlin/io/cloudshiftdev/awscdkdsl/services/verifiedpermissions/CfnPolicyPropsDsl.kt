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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps

/**
 * Properties for defining a `CfnPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
 * .definition(PolicyDefinitionProperty.builder()
 * .static(StaticPolicyDefinitionProperty.builder()
 * .statement("statement")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .templateLinked(TemplateLinkedPolicyDefinitionProperty.builder()
 * .policyTemplateId("policyTemplateId")
 * // the properties below are optional
 * .principal(EntityIdentifierProperty.builder()
 * .entityId("entityId")
 * .entityType("entityType")
 * .build())
 * .resource(EntityIdentifierProperty.builder()
 * .entityId("entityId")
 * .entityType("entityType")
 * .build())
 * .build())
 * .build())
 * .policyStoreId("policyStoreId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html)
 */
@CdkDslMarker
public class CfnPolicyPropsDsl {
    private val cdkBuilder: CfnPolicyProps.Builder = CfnPolicyProps.builder()

    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     *   The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     *   The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    public fun definition(definition: CfnPolicy.PolicyDefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    /**
     * @param policyStoreId Specifies the `PolicyStoreId` of the policy store you want to store the
     *   policy in.
     */
    public fun policyStoreId(policyStoreId: String) {
        cdkBuilder.policyStoreId(policyStoreId)
    }

    public fun build(): CfnPolicyProps = cdkBuilder.build()
}
