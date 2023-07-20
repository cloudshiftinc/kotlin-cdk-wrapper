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
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import kotlin.String

@CdkDslMarker
public class CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl {
    private val cdkBuilder: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder =
        CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun cookiesConfig(cookiesConfig: IResolvable) {
        cdkBuilder.cookiesConfig(cookiesConfig)
    }

    public fun cookiesConfig(cookiesConfig: CfnOriginRequestPolicy.CookiesConfigProperty) {
        cdkBuilder.cookiesConfig(cookiesConfig)
    }

    public fun headersConfig(headersConfig: IResolvable) {
        cdkBuilder.headersConfig(headersConfig)
    }

    public fun headersConfig(headersConfig: CfnOriginRequestPolicy.HeadersConfigProperty) {
        cdkBuilder.headersConfig(headersConfig)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun queryStringsConfig(queryStringsConfig: IResolvable) {
        cdkBuilder.queryStringsConfig(queryStringsConfig)
    }

    public fun queryStringsConfig(queryStringsConfig: CfnOriginRequestPolicy.QueryStringsConfigProperty) {
        cdkBuilder.queryStringsConfig(queryStringsConfig)
    }

    public fun build(): CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty = cdkBuilder.build()
}
