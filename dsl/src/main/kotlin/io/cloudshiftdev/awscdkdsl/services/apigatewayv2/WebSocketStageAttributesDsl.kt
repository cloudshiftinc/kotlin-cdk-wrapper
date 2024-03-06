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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.IWebSocketApi
import software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes

/**
 * The attributes used to import existing WebSocketStage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * WebSocketStageAttributes webSocketStageAttributes = WebSocketStageAttributes.builder()
 * .api(webSocketApi)
 * .stageName("stageName")
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketStageAttributesDsl {
    private val cdkBuilder: WebSocketStageAttributes.Builder = WebSocketStageAttributes.builder()

    /** @param api The API to which this stage is associated. */
    public fun api(api: IWebSocketApi) {
        cdkBuilder.api(api)
    }

    /** @param stageName The name of the stage. */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): WebSocketStageAttributes = cdkBuilder.build()
}
