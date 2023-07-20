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
import software.amazon.awscdk.UniqueResourceNameOptions
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class UniqueResourceNameOptionsDsl {
    private val cdkBuilder: UniqueResourceNameOptions.Builder = UniqueResourceNameOptions.builder()

    public fun allowedSpecialCharacters(allowedSpecialCharacters: String) {
        cdkBuilder.allowedSpecialCharacters(allowedSpecialCharacters)
    }

    public fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
    }

    public fun separator(separator: String) {
        cdkBuilder.separator(separator)
    }

    public fun build(): UniqueResourceNameOptions = cdkBuilder.build()
}
