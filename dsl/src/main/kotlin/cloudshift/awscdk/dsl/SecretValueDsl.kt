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
import software.amazon.awscdk.ResolutionTypeHint
import software.amazon.awscdk.SecretValue
import kotlin.Any
import kotlin.Boolean

@CdkDslMarker
public class SecretValueDsl(
    protectedValue: Any,
) {
    private val cdkBuilder: SecretValue.Builder = SecretValue.Builder.create(protectedValue)

    public fun stackTrace(stackTrace: Boolean) {
        cdkBuilder.stackTrace(stackTrace)
    }

    public fun typeHint(typeHint: ResolutionTypeHint) {
        cdkBuilder.typeHint(typeHint)
    }

    public fun build(): SecretValue = cdkBuilder.build()
}
