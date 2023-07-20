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
import software.amazon.awscdk.services.cognito.DateTimeAttribute
import kotlin.Boolean

@CdkDslMarker
public class DateTimeAttributeDsl {
    private val cdkBuilder: DateTimeAttribute.Builder = DateTimeAttribute.Builder.create()

    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun build(): DateTimeAttribute = cdkBuilder.build()
}
