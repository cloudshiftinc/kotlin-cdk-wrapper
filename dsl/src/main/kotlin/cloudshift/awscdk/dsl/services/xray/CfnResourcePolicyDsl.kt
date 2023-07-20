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

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnResourcePolicy
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
        cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
        cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
