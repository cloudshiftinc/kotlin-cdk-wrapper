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
import software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes
import software.amazon.awscdk.services.apigatewayv2.IHttpApi

/**
 * The attributes used to import existing HttpStage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * HttpStageAttributes httpStageAttributes = HttpStageAttributes.builder()
 * .api(httpApi)
 * .stageName("stageName")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpStageAttributesDsl {
    private val cdkBuilder: HttpStageAttributes.Builder = HttpStageAttributes.builder()

    /** @param api The API to which this stage is associated. */
    public fun api(api: IHttpApi) {
        cdkBuilder.api(api)
    }

    /** @param stageName The name of the stage. */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): HttpStageAttributes = cdkBuilder.build()
}
