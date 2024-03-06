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

package io.cloudshiftdev.awscdkdsl.services.s3outposts

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

/**
 * The failure reason, if any, for a create or delete endpoint operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * FailedReasonProperty failedReasonProperty = FailedReasonProperty.builder()
 * .errorCode("errorCode")
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html)
 */
@CdkDslMarker
public class CfnEndpointFailedReasonPropertyDsl {
    private val cdkBuilder: CfnEndpoint.FailedReasonProperty.Builder =
        CfnEndpoint.FailedReasonProperty.builder()

    /** @param errorCode The failure code, if any, for a create or delete endpoint operation. */
    public fun errorCode(errorCode: String) {
        cdkBuilder.errorCode(errorCode)
    }

    /**
     * @param message Additional error details describing the endpoint failure and recommended
     *   action.
     */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnEndpoint.FailedReasonProperty = cdkBuilder.build()
}
