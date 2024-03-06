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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps
import software.amazon.awscdk.services.ses.ScalingMode

/**
 * Properties for a dedicated IP pool.
 *
 * Example:
 * ```
 * DedicatedIpPool.Builder.create(this, "Pool")
 * .dedicatedIpPoolName("mypool")
 * .scalingMode(ScalingMode.STANDARD)
 * .build();
 * ```
 */
@CdkDslMarker
public class DedicatedIpPoolPropsDsl {
    private val cdkBuilder: DedicatedIpPoolProps.Builder = DedicatedIpPoolProps.builder()

    /**
     * @param dedicatedIpPoolName A name for the dedicated IP pool. The name must adhere to specific
     *   constraints: it can only include lowercase letters (a-z), numbers (0-9), underscores (_),
     *   and hyphens (-), and must not exceed 64 characters in length.
     */
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
        cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    /**
     * @param scalingMode The type of scailing mode to use for this IP pool. Updating ScalingMode
     *   doesn't require a replacement if you're updating its value from `STANDARD` to `MANAGED`.
     *   However, updating ScalingMode from `MANAGED` to `STANDARD` is not supported.
     */
    public fun scalingMode(scalingMode: ScalingMode) {
        cdkBuilder.scalingMode(scalingMode)
    }

    public fun build(): DedicatedIpPoolProps = cdkBuilder.build()
}
