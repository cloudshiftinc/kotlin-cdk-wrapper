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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.ecr.CfnRegistryPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnRegistryPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRegistryPolicy.Builder = CfnRegistryPolicy.Builder.create(scope, id)

    public fun policyText(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyText(builder.map)
    }

    public fun policyText(policyText: Any) {
        cdkBuilder.policyText(policyText)
    }

    public fun build(): CfnRegistryPolicy = cdkBuilder.build()
}
