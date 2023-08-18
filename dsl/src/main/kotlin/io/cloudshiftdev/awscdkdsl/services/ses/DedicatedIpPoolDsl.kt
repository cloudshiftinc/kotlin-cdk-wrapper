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
import software.constructs.Construct

/**
 * A dedicated IP pool.
 *
 * Example:
 * ```
 * new DedicatedIpPool(this, "Pool");
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
     * Default: - a CloudFormation generated name
     *
     * @param dedicatedIpPoolName A name for the dedicated IP pool.
     */
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
        cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    public fun build(): DedicatedIpPool = cdkBuilder.build()
}
