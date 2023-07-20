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
import software.amazon.awscdk.ReverseOptions
import kotlin.Boolean

@CdkDslMarker
public class ReverseOptionsDsl {
    private val cdkBuilder: ReverseOptions.Builder = ReverseOptions.builder()

    public fun failConcat(failConcat: Boolean) {
        cdkBuilder.failConcat(failConcat)
    }

    public fun build(): ReverseOptions = cdkBuilder.build()
}
