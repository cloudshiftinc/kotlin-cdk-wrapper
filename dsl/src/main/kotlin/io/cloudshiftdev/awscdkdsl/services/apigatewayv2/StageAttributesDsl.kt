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
import software.amazon.awscdk.services.apigatewayv2.StageAttributes

/**
 * The attributes used to import existing Stage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * StageAttributes stageAttributes = StageAttributes.builder()
 * .stageName("stageName")
 * .build();
 * ```
 */
@CdkDslMarker
public class StageAttributesDsl {
    private val cdkBuilder: StageAttributes.Builder = StageAttributes.builder()

    /** @param stageName The name of the stage. */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): StageAttributes = cdkBuilder.build()
}
