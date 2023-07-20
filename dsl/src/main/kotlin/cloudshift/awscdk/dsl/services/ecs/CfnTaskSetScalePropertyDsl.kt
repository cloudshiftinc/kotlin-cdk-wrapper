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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnTaskSet
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTaskSetScalePropertyDsl {
    private val cdkBuilder: CfnTaskSet.ScaleProperty.Builder = CfnTaskSet.ScaleProperty.builder()

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTaskSet.ScaleProperty = cdkBuilder.build()
}
