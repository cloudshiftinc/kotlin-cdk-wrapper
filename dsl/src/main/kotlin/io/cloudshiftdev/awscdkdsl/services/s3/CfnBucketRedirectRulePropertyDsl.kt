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
 * Specifies how requests are redirected.
 *
 * In the event of an error, you can specify a different error code to return.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * RedirectRuleProperty redirectRuleProperty = RedirectRuleProperty.builder()
 * .hostName("hostName")
 * .httpRedirectCode("httpRedirectCode")
 * .protocol("protocol")
 * .replaceKeyPrefixWith("replaceKeyPrefixWith")
 * .replaceKeyWith("replaceKeyWith")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html)
 */
@CdkDslMarker
public class CfnBucketRedirectRulePropertyDsl {
    private val cdkBuilder: CfnBucket.RedirectRuleProperty.Builder =
        CfnBucket.RedirectRuleProperty.builder()

    /** @param hostName The host name to use in the redirect request. */
    public fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
    }

    /**
     * @param httpRedirectCode The HTTP redirect code to use on the response. Not required if one of
     *   the siblings is present.
     */
    public fun httpRedirectCode(httpRedirectCode: String) {
        cdkBuilder.httpRedirectCode(httpRedirectCode)
    }

    /**
     * @param protocol Protocol to use when redirecting requests. The default is the protocol that
     *   is used in the original request.
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param replaceKeyPrefixWith The object key prefix to use in the redirect request. For
     *   example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/`
     *   folder) to `documents/` , you can set a condition block with `KeyPrefixEquals` set to
     *   `docs/` and in the Redirect set `ReplaceKeyPrefixWith` to `/documents` . Not required if
     *   one of the siblings is present. Can be present only if `ReplaceKeyWith` is not provided.
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see
     * [XML related object key constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     */
    public fun replaceKeyPrefixWith(replaceKeyPrefixWith: String) {
        cdkBuilder.replaceKeyPrefixWith(replaceKeyPrefixWith)
    }

    /**
     * @param replaceKeyWith The specific object key to use in the redirect request. For example,
     *   redirect request to `error.html` . Not required if one of the siblings is present. Can be
     *   present only if `ReplaceKeyPrefixWith` is not provided.
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see
     * [XML related object key constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     */
    public fun replaceKeyWith(replaceKeyWith: String) {
        cdkBuilder.replaceKeyWith(replaceKeyWith)
    }

    public fun build(): CfnBucket.RedirectRuleProperty = cdkBuilder.build()
}
