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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import kotlin.String

@CdkDslMarker
public class CfnEventSourceMappingFilterPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.FilterProperty.Builder =
        CfnEventSourceMapping.FilterProperty.builder()

    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    public fun build(): CfnEventSourceMapping.FilterProperty = cdkBuilder.build()
}
