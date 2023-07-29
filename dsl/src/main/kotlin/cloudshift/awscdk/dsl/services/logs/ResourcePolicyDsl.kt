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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.logs.ResourcePolicy
import software.constructs.Construct

/**
 * Resource Policy for CloudWatch Log Groups.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called `addToResourcePolicy()`,
 * which will automatically create a new resource policy if one doesn't exist yet, otherwise it will
 * add to the existing policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
 * PolicyStatement policyStatement;
 * ResourcePolicy resourcePolicy = ResourcePolicy.Builder.create(this, "MyResourcePolicy")
 * .policyStatements(List.of(policyStatement))
 * .resourcePolicyName("resourcePolicyName")
 * .build();
 * ```
 */
@CdkDslMarker
public class ResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ResourcePolicy.Builder = ResourcePolicy.Builder.create(scope, id)

    private val _policyStatements: MutableList<PolicyStatement> = mutableListOf()

    /**
     * Initial statements to add to the resource policy.
     *
     * Default: - No statements
     *
     * @param policyStatements Initial statements to add to the resource policy.
     */
    public fun policyStatements(policyStatements: PolicyStatementDsl.() -> Unit) {
        _policyStatements.add(PolicyStatementDsl().apply(policyStatements).build())
    }

    /**
     * Initial statements to add to the resource policy.
     *
     * Default: - No statements
     *
     * @param policyStatements Initial statements to add to the resource policy.
     */
    public fun policyStatements(policyStatements: Collection<PolicyStatement>) {
        _policyStatements.addAll(policyStatements)
    }

    /**
     * Name of the log group resource policy.
     *
     * Default: - Uses a unique id based on the construct path
     *
     * @param resourcePolicyName Name of the log group resource policy.
     */
    public fun resourcePolicyName(resourcePolicyName: String) {
        cdkBuilder.resourcePolicyName(resourcePolicyName)
    }

    public fun build(): ResourcePolicy {
        if (_policyStatements.isNotEmpty()) cdkBuilder.policyStatements(_policyStatements)
        return cdkBuilder.build()
    }
}
