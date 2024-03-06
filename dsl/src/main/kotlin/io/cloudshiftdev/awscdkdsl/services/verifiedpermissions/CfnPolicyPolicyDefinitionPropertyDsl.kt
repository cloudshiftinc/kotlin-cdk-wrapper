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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicy

/**
 * A structure that defines a Cedar policy.
 *
 * It includes the policy type, a description, and a policy body. This is a top level data type used
 * to create a policy.
 *
 * This data type is used as a request parameter for the
 * [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
 * operation. This structure must always have either an `Static` or a `TemplateLinked` element.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * PolicyDefinitionProperty policyDefinitionProperty = PolicyDefinitionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-policydefinition.html)
 */
@CdkDslMarker
public class CfnPolicyPolicyDefinitionPropertyDsl {
    private val cdkBuilder: CfnPolicy.PolicyDefinitionProperty.Builder =
        CfnPolicy.PolicyDefinitionProperty.builder()

    /**
     * @param staticValue A structure that describes a static policy. An static policy doesn't use a
     *   template or allow placeholders for entities.
     */
    public fun staticValue(staticValue: IResolvable) {
        cdkBuilder.staticValue(staticValue)
    }

    /**
     * @param staticValue A structure that describes a static policy. An static policy doesn't use a
     *   template or allow placeholders for entities.
     */
    public fun staticValue(staticValue: CfnPolicy.StaticPolicyDefinitionProperty) {
        cdkBuilder.staticValue(staticValue)
    }

    /**
     * @param templateLinked A structure that describes a policy that was instantiated from a
     *   template. The template can specify placeholders for `principal` and `resource` . When you
     *   use
     *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
     *   to create a policy from a template, you specify the exact principal and resource to use for
     *   the instantiated policy.
     */
    public fun templateLinked(templateLinked: IResolvable) {
        cdkBuilder.templateLinked(templateLinked)
    }

    /**
     * @param templateLinked A structure that describes a policy that was instantiated from a
     *   template. The template can specify placeholders for `principal` and `resource` . When you
     *   use
     *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
     *   to create a policy from a template, you specify the exact principal and resource to use for
     *   the instantiated policy.
     */
    public fun templateLinked(templateLinked: CfnPolicy.TemplateLinkedPolicyDefinitionProperty) {
        cdkBuilder.templateLinked(templateLinked)
    }

    public fun build(): CfnPolicy.PolicyDefinitionProperty = cdkBuilder.build()
}
