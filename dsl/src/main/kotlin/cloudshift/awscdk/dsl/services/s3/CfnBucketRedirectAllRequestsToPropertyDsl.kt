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
public class CfnBucketRedirectAllRequestsToPropertyDsl {
    private val cdkBuilder: CfnBucket.RedirectAllRequestsToProperty.Builder =
        CfnBucket.RedirectAllRequestsToProperty.builder()

    public fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnBucket.RedirectAllRequestsToProperty = cdkBuilder.build()
}
