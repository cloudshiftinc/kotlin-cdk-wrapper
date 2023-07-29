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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

/**
 * Specifies information required when returning a custom HTTP response.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * FixedResponseConfigProperty fixedResponseConfigProperty = FixedResponseConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentType("contentType")
 * .messageBody("messageBody")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html)
 */
@CdkDslMarker
public class CfnListenerFixedResponseConfigPropertyDsl {
    private val cdkBuilder: CfnListener.FixedResponseConfigProperty.Builder =
        CfnListener.FixedResponseConfigProperty.builder()

    /**
     * @param contentType The content type. Valid Values: text/plain | text/css | text/html |
     *   application/javascript | application/json
     */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /** @param messageBody The message. */
    public fun messageBody(messageBody: String) {
        cdkBuilder.messageBody(messageBody)
    }

    /** @param statusCode The HTTP response code (2XX, 4XX, or 5XX). */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnListener.FixedResponseConfigProperty = cdkBuilder.build()
}
