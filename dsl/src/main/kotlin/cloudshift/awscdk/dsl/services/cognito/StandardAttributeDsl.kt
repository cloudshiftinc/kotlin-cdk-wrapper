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
import software.amazon.awscdk.services.cognito.StandardAttribute
import kotlin.Boolean

@CdkDslMarker
public class StandardAttributeDsl {
    private val cdkBuilder: StandardAttribute.Builder = StandardAttribute.builder()

    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    public fun build(): StandardAttribute = cdkBuilder.build()
}
