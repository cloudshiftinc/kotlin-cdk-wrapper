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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnMultiRegionAccessPointPolicyPropsDsl {
    private val cdkBuilder: CfnMultiRegionAccessPointPolicyProps.Builder =
        CfnMultiRegionAccessPointPolicyProps.builder()

    public fun mrapName(mrapName: String) {
        cdkBuilder.mrapName(mrapName)
    }

    public fun policy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policy(builder.map)
    }

    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnMultiRegionAccessPointPolicyProps = cdkBuilder.build()
}
