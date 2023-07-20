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
import software.amazon.awscdk.services.robomaker.CfnFleet
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnFleetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFleet.Builder = CfnFleet.Builder.create(scope, id)

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnFleet = cdkBuilder.build()
}
