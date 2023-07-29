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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig

/**
 * Options when binding a log destination to a RestApi Stage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * AccessLogDestinationConfig accessLogDestinationConfig = AccessLogDestinationConfig.builder()
 * .destinationArn("destinationArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class AccessLogDestinationConfigDsl {
    private val cdkBuilder: AccessLogDestinationConfig.Builder =
        AccessLogDestinationConfig.builder()

    /** @param destinationArn The Amazon Resource Name (ARN) of the destination resource. */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun build(): AccessLogDestinationConfig = cdkBuilder.build()
}
