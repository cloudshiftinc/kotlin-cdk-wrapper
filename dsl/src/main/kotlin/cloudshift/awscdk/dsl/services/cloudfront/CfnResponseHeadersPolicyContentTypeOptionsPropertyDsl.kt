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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import kotlin.Boolean

@CdkDslMarker
public class CfnResponseHeadersPolicyContentTypeOptionsPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.ContentTypeOptionsProperty.Builder =
        CfnResponseHeadersPolicy.ContentTypeOptionsProperty.builder()

    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    public fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`)
    }

    public fun build(): CfnResponseHeadersPolicy.ContentTypeOptionsProperty = cdkBuilder.build()
}
