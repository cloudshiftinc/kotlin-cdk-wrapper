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
public class CfnResponseHeadersPolicyReferrerPolicyPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.ReferrerPolicyProperty.Builder =
        CfnResponseHeadersPolicy.ReferrerPolicyProperty.builder()

    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    public fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`)
    }

    public fun referrerPolicy(referrerPolicy: String) {
        cdkBuilder.referrerPolicy(referrerPolicy)
    }

    public fun build(): CfnResponseHeadersPolicy.ReferrerPolicyProperty = cdkBuilder.build()
}
