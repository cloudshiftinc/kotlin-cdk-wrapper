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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudwatch.YAxisProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class YAxisPropsDsl {
    private val cdkBuilder: YAxisProps.Builder = YAxisProps.builder()

    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun showUnits(showUnits: Boolean) {
        cdkBuilder.showUnits(showUnits)
    }

    public fun build(): YAxisProps = cdkBuilder.build()
}
