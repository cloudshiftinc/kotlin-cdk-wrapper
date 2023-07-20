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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardReferenceLineDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ReferenceLineDataConfigurationProperty.Builder =
        CfnDashboard.ReferenceLineDataConfigurationProperty.builder()

    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    public fun dynamicConfiguration(dynamicConfiguration: IResolvable) {
        cdkBuilder.dynamicConfiguration(dynamicConfiguration)
    }

    public fun dynamicConfiguration(dynamicConfiguration: CfnDashboard.ReferenceLineDynamicDataConfigurationProperty) {
        cdkBuilder.dynamicConfiguration(dynamicConfiguration)
    }

    public fun staticConfiguration(staticConfiguration: IResolvable) {
        cdkBuilder.staticConfiguration(staticConfiguration)
    }

    public fun staticConfiguration(staticConfiguration: CfnDashboard.ReferenceLineStaticDataConfigurationProperty) {
        cdkBuilder.staticConfiguration(staticConfiguration)
    }

    public fun build(): CfnDashboard.ReferenceLineDataConfigurationProperty = cdkBuilder.build()
}
