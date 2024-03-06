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
import software.amazon.awscdk.services.ses.DedicatedIpPool
import software.amazon.awscdk.services.ses.ScalingMode
import software.constructs.Construct

/**
 * A dedicated IP pool.
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
public class DedicatedIpPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DedicatedIpPool.Builder = DedicatedIpPool.Builder.create(scope, id)

    /**
     * A name for the dedicated IP pool.
     *
     * The name must adhere to specific constraints: it can only include lowercase letters (a-z),
     * numbers (0-9), underscores (_), and hyphens (-), and must not exceed 64 characters in length.
     *
     * Default: - a CloudFormation generated name
     *
     * @param dedicatedIpPoolName A name for the dedicated IP pool.
     */
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
        cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    /**
     * The type of scailing mode to use for this IP pool.
     *
     * Updating ScalingMode doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED`. However, updating ScalingMode from `MANAGED` to `STANDARD` is not
     * supported.
     *
     * Default: ScalingMode.STANDARD
     *
     * @param scalingMode The type of scailing mode to use for this IP pool.
     */
    public fun scalingMode(scalingMode: ScalingMode) {
        cdkBuilder.scalingMode(scalingMode)
    }

    public fun build(): DedicatedIpPool = cdkBuilder.build()
}
