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

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.location.CfnMap
import kotlin.String

@CdkDslMarker
public class CfnMapMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnMap.MapConfigurationProperty.Builder =
        CfnMap.MapConfigurationProperty.builder()

    public fun style(style: String) {
        cdkBuilder.style(style)
    }

    public fun build(): CfnMap.MapConfigurationProperty = cdkBuilder.build()
}
