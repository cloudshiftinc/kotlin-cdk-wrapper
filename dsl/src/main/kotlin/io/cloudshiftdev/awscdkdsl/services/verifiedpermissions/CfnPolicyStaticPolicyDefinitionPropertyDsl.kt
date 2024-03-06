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
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicy

/**
 * A structure that defines a static policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * StaticPolicyDefinitionProperty staticPolicyDefinitionProperty =
 * StaticPolicyDefinitionProperty.builder()
 * .statement("statement")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-staticpolicydefinition.html)
 */
@CdkDslMarker
public class CfnPolicyStaticPolicyDefinitionPropertyDsl {
    private val cdkBuilder: CfnPolicy.StaticPolicyDefinitionProperty.Builder =
        CfnPolicy.StaticPolicyDefinitionProperty.builder()

    /** @param description The description of the static policy. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param statement The policy content of the static policy, written in the Cedar policy
     *   language.
     */
    public fun statement(statement: String) {
        cdkBuilder.statement(statement)
    }

    public fun build(): CfnPolicy.StaticPolicyDefinitionProperty = cdkBuilder.build()
}
