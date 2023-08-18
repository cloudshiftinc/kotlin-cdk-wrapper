@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.RedirectProtocol
import software.amazon.awscdk.services.s3.RedirectTarget

/**
 * Specifies a redirect behavior of all requests to a website endpoint of a bucket.
 *
 * Example:
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyRedirectedBucket")
 * .websiteRedirect(RedirectTarget.builder().hostName("www.example.com").build())
 * .build();
 * ```
 */
@CdkDslMarker
public class RedirectTargetDsl {
    private val cdkBuilder: RedirectTarget.Builder = RedirectTarget.builder()

    /** @param hostName Name of the host where requests are redirected. */
    public fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
    }

    /** @param protocol Protocol to use when redirecting requests. */
    public fun protocol(protocol: RedirectProtocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): RedirectTarget = cdkBuilder.build()
}
