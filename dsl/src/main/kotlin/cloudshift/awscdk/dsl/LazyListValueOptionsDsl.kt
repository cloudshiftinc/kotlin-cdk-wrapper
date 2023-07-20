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
import software.amazon.awscdk.LazyListValueOptions
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class LazyListValueOptionsDsl {
    private val cdkBuilder: LazyListValueOptions.Builder = LazyListValueOptions.builder()

    public fun displayHint(displayHint: String) {
        cdkBuilder.displayHint(displayHint)
    }

    public fun omitEmpty(omitEmpty: Boolean) {
        cdkBuilder.omitEmpty(omitEmpty)
    }

    public fun build(): LazyListValueOptions = cdkBuilder.build()
}
