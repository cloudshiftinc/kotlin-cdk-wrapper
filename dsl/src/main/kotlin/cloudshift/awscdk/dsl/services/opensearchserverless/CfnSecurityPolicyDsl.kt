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

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSecurityPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityPolicy.Builder = CfnSecurityPolicy.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun policy(policy: String) {
        cdkBuilder.policy(policy)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSecurityPolicy = cdkBuilder.build()
}
