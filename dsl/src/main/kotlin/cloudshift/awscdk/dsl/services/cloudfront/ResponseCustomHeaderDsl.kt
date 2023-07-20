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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeader
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class ResponseCustomHeaderDsl {
    private val cdkBuilder: ResponseCustomHeader.Builder = ResponseCustomHeader.builder()

    public fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
    }

    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): ResponseCustomHeader = cdkBuilder.build()
}
