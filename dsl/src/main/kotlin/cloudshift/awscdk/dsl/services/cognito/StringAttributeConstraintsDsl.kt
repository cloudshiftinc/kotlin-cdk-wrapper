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
import software.amazon.awscdk.services.cognito.StringAttributeConstraints
import kotlin.Number

@CdkDslMarker
public class StringAttributeConstraintsDsl {
    private val cdkBuilder: StringAttributeConstraints.Builder = StringAttributeConstraints.builder()

    public fun maxLen(maxLen: Number) {
        cdkBuilder.maxLen(maxLen)
    }

    public fun minLen(minLen: Number) {
        cdkBuilder.minLen(minLen)
    }

    public fun build(): StringAttributeConstraints = cdkBuilder.build()
}
