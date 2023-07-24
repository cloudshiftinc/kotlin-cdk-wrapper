@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
import software.amazon.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Construction properties for UntrustedCodeBoundaryPolicy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.services.iam.*;
 * PolicyStatement policyStatement;
 * UntrustedCodeBoundaryPolicyProps untrustedCodeBoundaryPolicyProps =
 * UntrustedCodeBoundaryPolicyProps.builder()
 * .additionalStatements(List.of(policyStatement))
 * .managedPolicyName("managedPolicyName")
 * .build();
 * ```
 */
@CdkDslMarker
public class UntrustedCodeBoundaryPolicyPropsDsl {
    private val cdkBuilder: UntrustedCodeBoundaryPolicyProps.Builder =
        UntrustedCodeBoundaryPolicyProps.builder()

    private val _additionalStatements: MutableList<PolicyStatement> = mutableListOf()

    /**
     * @param additionalStatements Additional statements to add to the default set of statements.
     */
    public fun additionalStatements(additionalStatements: PolicyStatementDsl.() -> Unit) {
        _additionalStatements.add(PolicyStatementDsl().apply(additionalStatements).build())
    }

    /**
     * @param additionalStatements Additional statements to add to the default set of statements.
     */
    public fun additionalStatements(additionalStatements: Collection<PolicyStatement>) {
        _additionalStatements.addAll(additionalStatements)
    }

    /**
     * @param managedPolicyName The name of the managed policy.
     */
    public fun managedPolicyName(managedPolicyName: String) {
        cdkBuilder.managedPolicyName(managedPolicyName)
    }

    public fun build(): UntrustedCodeBoundaryPolicyProps {
        if (_additionalStatements.isNotEmpty()) cdkBuilder.additionalStatements(_additionalStatements)
        return cdkBuilder.build()
    }
}
