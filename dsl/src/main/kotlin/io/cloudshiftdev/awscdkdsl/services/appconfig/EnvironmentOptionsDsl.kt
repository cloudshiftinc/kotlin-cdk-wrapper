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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.EnvironmentOptions
import software.amazon.awscdk.services.appconfig.Monitor

/**
 * Options for the Environment construct.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * Monitor monitor;
 * EnvironmentOptions environmentOptions = EnvironmentOptions.builder()
 * .description("description")
 * .environmentName("environmentName")
 * .monitors(List.of(monitor))
 * .build();
 * ```
 */
@CdkDslMarker
public class EnvironmentOptionsDsl {
    private val cdkBuilder: EnvironmentOptions.Builder = EnvironmentOptions.builder()

    private val _monitors: MutableList<Monitor> = mutableListOf()

    /** @param description The description of the environment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param environmentName The name of the environment. */
    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    /** @param monitors The monitors for the environment. */
    public fun monitors(vararg monitors: Monitor) {
        _monitors.addAll(listOf(*monitors))
    }

    /** @param monitors The monitors for the environment. */
    public fun monitors(monitors: Collection<Monitor>) {
        _monitors.addAll(monitors)
    }

    public fun build(): EnvironmentOptions {
        if (_monitors.isNotEmpty()) cdkBuilder.monitors(_monitors)
        return cdkBuilder.build()
    }
}
