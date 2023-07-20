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

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.robomaker.CfnFleetProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnFleetPropsDsl {
    private val cdkBuilder: CfnFleetProps.Builder = CfnFleetProps.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnFleetProps = cdkBuilder.build()
}
