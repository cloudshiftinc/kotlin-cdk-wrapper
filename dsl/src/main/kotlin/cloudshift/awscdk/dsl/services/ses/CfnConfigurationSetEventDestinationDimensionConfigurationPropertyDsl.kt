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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder =
        CfnConfigurationSetEventDestination.DimensionConfigurationProperty.builder()

    public fun defaultDimensionValue(defaultDimensionValue: String) {
        cdkBuilder.defaultDimensionValue(defaultDimensionValue)
    }

    public fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
    }

    public fun dimensionValueSource(dimensionValueSource: String) {
        cdkBuilder.dimensionValueSource(dimensionValueSource)
    }

    public fun build(): CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
        cdkBuilder.build()
}
