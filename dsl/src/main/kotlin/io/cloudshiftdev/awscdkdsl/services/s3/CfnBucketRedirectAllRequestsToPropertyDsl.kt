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
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * RedirectAllRequestsToProperty redirectAllRequestsToProperty =
 * RedirectAllRequestsToProperty.builder()
 * .hostName("hostName")
 * // the properties below are optional
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectallrequeststo.html)
 */
@CdkDslMarker
public class CfnBucketRedirectAllRequestsToPropertyDsl {
    private val cdkBuilder: CfnBucket.RedirectAllRequestsToProperty.Builder =
        CfnBucket.RedirectAllRequestsToProperty.builder()

    /** @param hostName Name of the host where requests are redirected. */
    public fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
    }

    /**
     * @param protocol Protocol to use when redirecting requests. The default is the protocol that
     *   is used in the original request.
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnBucket.RedirectAllRequestsToProperty = cdkBuilder.build()
}
