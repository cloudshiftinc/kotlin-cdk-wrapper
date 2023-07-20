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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.String

@CdkDslMarker
public class CfnBucketRedirectRulePropertyDsl {
    private val cdkBuilder: CfnBucket.RedirectRuleProperty.Builder =
        CfnBucket.RedirectRuleProperty.builder()

    public fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
    }

    public fun httpRedirectCode(httpRedirectCode: String) {
        cdkBuilder.httpRedirectCode(httpRedirectCode)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun replaceKeyPrefixWith(replaceKeyPrefixWith: String) {
        cdkBuilder.replaceKeyPrefixWith(replaceKeyPrefixWith)
    }

    public fun replaceKeyWith(replaceKeyWith: String) {
        cdkBuilder.replaceKeyWith(replaceKeyWith)
    }

    public fun build(): CfnBucket.RedirectRuleProperty = cdkBuilder.build()
}
