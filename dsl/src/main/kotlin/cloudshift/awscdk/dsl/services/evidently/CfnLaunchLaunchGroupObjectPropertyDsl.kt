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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.evidently.CfnLaunch
import kotlin.String

@CdkDslMarker
public class CfnLaunchLaunchGroupObjectPropertyDsl {
    private val cdkBuilder: CfnLaunch.LaunchGroupObjectProperty.Builder =
        CfnLaunch.LaunchGroupObjectProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun feature(feature: String) {
        cdkBuilder.feature(feature)
    }

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun variation(variation: String) {
        cdkBuilder.variation(variation)
    }

    public fun build(): CfnLaunch.LaunchGroupObjectProperty = cdkBuilder.build()
}
