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
import software.amazon.awscdk.services.cognito.StringAttributeProps
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class StringAttributePropsDsl {
    private val cdkBuilder: StringAttributeProps.Builder = StringAttributeProps.builder()

    public fun maxLen(maxLen: Number) {
        cdkBuilder.maxLen(maxLen)
    }

    public fun minLen(minLen: Number) {
        cdkBuilder.minLen(minLen)
    }

    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun build(): StringAttributeProps = cdkBuilder.build()
}
