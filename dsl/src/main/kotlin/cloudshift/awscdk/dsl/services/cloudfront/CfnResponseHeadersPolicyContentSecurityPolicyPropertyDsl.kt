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
import kotlin.String

@CdkDslMarker
public class CfnResponseHeadersPolicyContentSecurityPolicyPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder =
        CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.builder()

    public fun contentSecurityPolicy(contentSecurityPolicy: String) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
    }

    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    public fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`)
    }

    public fun build(): CfnResponseHeadersPolicy.ContentSecurityPolicyProperty = cdkBuilder.build()
}
