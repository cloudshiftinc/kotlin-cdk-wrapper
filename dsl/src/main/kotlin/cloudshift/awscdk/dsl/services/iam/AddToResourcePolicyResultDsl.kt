@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.constructs.IDependable
import kotlin.Boolean

@CdkDslMarker
public class AddToResourcePolicyResultDsl {
    private val cdkBuilder: AddToResourcePolicyResult.Builder = AddToResourcePolicyResult.builder()

    public fun policyDependable(policyDependable: IDependable) {
        cdkBuilder.policyDependable(policyDependable)
    }

    public fun statementAdded(statementAdded: Boolean) {
        cdkBuilder.statementAdded(statementAdded)
    }

    public fun build(): AddToResourcePolicyResult = cdkBuilder.build()
}
