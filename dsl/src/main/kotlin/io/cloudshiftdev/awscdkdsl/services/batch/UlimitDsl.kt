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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.batch.Ulimit
import software.amazon.awscdk.services.batch.UlimitName

/**
 * Sets limits for a resource with `ulimit` on linux systems.
 *
 * Used by the Docker daemon.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Ulimit ulimit = Ulimit.builder()
 * .hardLimit(123)
 * .name(UlimitName.CORE)
 * .softLimit(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class UlimitDsl {
    private val cdkBuilder: Ulimit.Builder = Ulimit.builder()

    /**
     * @param hardLimit The hard limit for this resource. The container will be terminated if it
     *   exceeds this limit.
     */
    public fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
    }

    /** @param name The resource to limit. */
    public fun name(name: UlimitName) {
        cdkBuilder.name(name)
    }

    /**
     * @param softLimit The reservation for this resource. The container will not be terminated if
     *   it exceeds this limit.
     */
    public fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
    }

    public fun build(): Ulimit = cdkBuilder.build()
}
