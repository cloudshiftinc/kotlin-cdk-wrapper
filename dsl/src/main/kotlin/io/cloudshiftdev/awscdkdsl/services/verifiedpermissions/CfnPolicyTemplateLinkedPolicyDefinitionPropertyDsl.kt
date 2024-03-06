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

/**
 * A structure that describes a policy created by instantiating a policy template.
 *
 * You can't directly update a template-linked policy. You must update the associated policy
 * template instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * TemplateLinkedPolicyDefinitionProperty templateLinkedPolicyDefinitionProperty =
 * TemplateLinkedPolicyDefinitionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html)
 */
@CdkDslMarker
public class CfnPolicyTemplateLinkedPolicyDefinitionPropertyDsl {
    private val cdkBuilder: CfnPolicy.TemplateLinkedPolicyDefinitionProperty.Builder =
        CfnPolicy.TemplateLinkedPolicyDefinitionProperty.builder()

    /**
     * @param policyTemplateId The unique identifier of the policy template used to create this
     *   policy.
     */
    public fun policyTemplateId(policyTemplateId: String) {
        cdkBuilder.policyTemplateId(policyTemplateId)
    }

    /**
     * @param principal The principal associated with this template-linked policy. Verified
     *   Permissions substitutes this principal for the `?principal` placeholder in the policy
     *   template when it evaluates an authorization request.
     */
    public fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal)
    }

    /**
     * @param principal The principal associated with this template-linked policy. Verified
     *   Permissions substitutes this principal for the `?principal` placeholder in the policy
     *   template when it evaluates an authorization request.
     */
    public fun principal(principal: CfnPolicy.EntityIdentifierProperty) {
        cdkBuilder.principal(principal)
    }

    /**
     * @param resource The resource associated with this template-linked policy. Verified
     *   Permissions substitutes this resource for the `?resource` placeholder in the policy
     *   template when it evaluates an authorization request.
     */
    public fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource)
    }

    /**
     * @param resource The resource associated with this template-linked policy. Verified
     *   Permissions substitutes this resource for the `?resource` placeholder in the policy
     *   template when it evaluates an authorization request.
     */
    public fun resource(resource: CfnPolicy.EntityIdentifierProperty) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnPolicy.TemplateLinkedPolicyDefinitionProperty = cdkBuilder.build()
}
