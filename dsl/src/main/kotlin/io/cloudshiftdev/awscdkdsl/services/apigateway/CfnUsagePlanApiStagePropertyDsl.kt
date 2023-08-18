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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

/**
 * API stage name of the associated API stage in a usage plan.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * ApiStageProperty apiStageProperty = ApiStageProperty.builder()
 * .apiId("apiId")
 * .stage("stage")
 * .throttle(Map.of(
 * "throttleKey", ThrottleSettingsProperty.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html)
 */
@CdkDslMarker
public class CfnUsagePlanApiStagePropertyDsl {
    private val cdkBuilder: CfnUsagePlan.ApiStageProperty.Builder =
        CfnUsagePlan.ApiStageProperty.builder()

    /** @param apiId API Id of the associated API stage in a usage plan. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /** @param stage API stage name of the associated API stage in a usage plan. */
    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    /**
     * @param throttle Map containing method level throttling information for API stage in a usage
     *   plan.
     */
    public fun throttle(throttle: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(throttle)
        cdkBuilder.throttle(builder.map)
    }

    /**
     * @param throttle Map containing method level throttling information for API stage in a usage
     *   plan.
     */
    public fun throttle(throttle: Map<String, Any>) {
        cdkBuilder.throttle(throttle)
    }

    /**
     * @param throttle Map containing method level throttling information for API stage in a usage
     *   plan.
     */
    public fun throttle(throttle: IResolvable) {
        cdkBuilder.throttle(throttle)
    }

    public fun build(): CfnUsagePlan.ApiStageProperty = cdkBuilder.build()
}
