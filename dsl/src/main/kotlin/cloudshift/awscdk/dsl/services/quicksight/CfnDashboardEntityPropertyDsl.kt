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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardEntityPropertyDsl {
    private val cdkBuilder: CfnDashboard.EntityProperty.Builder =
        CfnDashboard.EntityProperty.builder()

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnDashboard.EntityProperty = cdkBuilder.build()
}
