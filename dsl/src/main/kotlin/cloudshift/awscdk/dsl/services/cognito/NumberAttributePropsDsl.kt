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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.NumberAttributeProps
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class NumberAttributePropsDsl {
    private val cdkBuilder: NumberAttributeProps.Builder = NumberAttributeProps.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun build(): NumberAttributeProps = cdkBuilder.build()
}
