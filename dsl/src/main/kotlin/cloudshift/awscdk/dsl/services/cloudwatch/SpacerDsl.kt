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
import software.amazon.awscdk.services.cloudwatch.Spacer
import kotlin.Number

@CdkDslMarker
public class SpacerDsl {
    private val cdkBuilder: Spacer.Builder = Spacer.Builder.create()

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): Spacer = cdkBuilder.build()
}
