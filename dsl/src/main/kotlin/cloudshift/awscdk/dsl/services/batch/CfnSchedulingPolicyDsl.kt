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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnSchedulingPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchedulingPolicy.Builder = CfnSchedulingPolicy.Builder.create(
        scope,
        id,
    )

    public fun fairsharePolicy(fairsharePolicy: IResolvable) {
        cdkBuilder.fairsharePolicy(fairsharePolicy)
    }

    public fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty) {
        cdkBuilder.fairsharePolicy(fairsharePolicy)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSchedulingPolicy = cdkBuilder.build()
}
