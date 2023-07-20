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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnAuthPolicyPropsDsl {
    private val cdkBuilder: CfnAuthPolicyProps.Builder = CfnAuthPolicyProps.builder()

    public fun policy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policy(builder.map)
    }

    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun build(): CfnAuthPolicyProps = cdkBuilder.build()
}
