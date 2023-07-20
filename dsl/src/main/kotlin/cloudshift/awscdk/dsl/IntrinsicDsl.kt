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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Intrinsic
import software.amazon.awscdk.ResolutionTypeHint
import kotlin.Any
import kotlin.Boolean

@CdkDslMarker
public class IntrinsicDsl(
    `value`: Any,
) {
    private val cdkBuilder: Intrinsic.Builder = Intrinsic.Builder.create(value)

    public fun stackTrace(stackTrace: Boolean) {
        cdkBuilder.stackTrace(stackTrace)
    }

    public fun typeHint(typeHint: ResolutionTypeHint) {
        cdkBuilder.typeHint(typeHint)
    }

    public fun build(): Intrinsic = cdkBuilder.build()
}
