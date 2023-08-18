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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.logs.ResourcePolicyProps

/**
 * Properties to define Cloudwatch log group resource policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
 * PolicyStatement policyStatement;
 * ResourcePolicyProps resourcePolicyProps = ResourcePolicyProps.builder()
 * .policyStatements(List.of(policyStatement))
 * .resourcePolicyName("resourcePolicyName")
 * .build();
 * ```
 */
@CdkDslMarker
public class ResourcePolicyPropsDsl {
    private val cdkBuilder: ResourcePolicyProps.Builder = ResourcePolicyProps.builder()

    private val _policyStatements: MutableList<PolicyStatement> = mutableListOf()

    /** @param policyStatements Initial statements to add to the resource policy. */
    public fun policyStatements(policyStatements: PolicyStatementDsl.() -> Unit) {
        _policyStatements.add(PolicyStatementDsl().apply(policyStatements).build())
    }

    /** @param policyStatements Initial statements to add to the resource policy. */
    public fun policyStatements(policyStatements: Collection<PolicyStatement>) {
        _policyStatements.addAll(policyStatements)
    }

    /** @param resourcePolicyName Name of the log group resource policy. */
    public fun resourcePolicyName(resourcePolicyName: String) {
        cdkBuilder.resourcePolicyName(resourcePolicyName)
    }

    public fun build(): ResourcePolicyProps {
        if (_policyStatements.isNotEmpty()) cdkBuilder.policyStatements(_policyStatements)
        return cdkBuilder.build()
    }
}
