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
import software.constructs.Construct

/**
 * Creates or updates a Cedar policy and saves it in the specified policy store.
 *
 * You can create either a static policy or a policy linked to a policy template.
 *
 * You can directly update only static policies. To update a template-linked policy, you must update
 * it's linked policy template instead.
 * * To create a static policy, in the `Definition` include a `Static` element that includes the
 *   Cedar policy text in the `Statement` element.
 * * To create a policy that is dynamically linked to a policy template, in the `Definition` include
 *   a `Templatelinked` element that specifies the policy template ID and the principal and resource
 *   to associate with this policy. If the policy template is ever updated, any policies linked to
 *   the policy template automatically use the updated template.
 * * If policy validation is enabled in the policy store, then updating a static policy causes
 *   Verified Permissions to validate the policy against the schema in the policy store. If the
 *   updated static policy doesn't pass validation, the operation fails and the update isn't stored.
 * * When you edit a static policy, You can change only certain elements of a static policy:
 * * The action referenced by the policy.
 * * A condition clause, such as when and unless.
 *
 * You can't change these elements of a static policy:
 * * Changing a policy from a static policy to a template-linked policy.
 * * Changing the effect of a static policy from permit or forbid.
 * * The principal referenced by a static policy.
 * * The resource referenced by a static policy.
 * * To update a template-linked policy, you must update the template instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
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
public class CfnPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPolicy.Builder = CfnPolicy.Builder.create(scope, id)

    /**
     * Specifies the policy type and content to use for the new or updated policy.
     *
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
     *
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * Specifies the policy type and content to use for the new or updated policy.
     *
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
     *
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     */
    public fun definition(definition: CfnPolicy.PolicyDefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    /**
     * Specifies the `PolicyStoreId` of the policy store you want to store the policy in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-policystoreid)
     *
     * @param policyStoreId Specifies the `PolicyStoreId` of the policy store you want to store the
     *   policy in.
     */
    public fun policyStoreId(policyStoreId: String) {
        cdkBuilder.policyStoreId(policyStoreId)
    }

    public fun build(): CfnPolicy = cdkBuilder.build()
}
