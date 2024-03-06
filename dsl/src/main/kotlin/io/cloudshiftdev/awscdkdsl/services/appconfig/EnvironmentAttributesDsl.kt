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
import software.amazon.awscdk.services.appconfig.EnvironmentAttributes
import software.amazon.awscdk.services.appconfig.IApplication
import software.amazon.awscdk.services.appconfig.Monitor

/**
 * Attributes of an existing AWS AppConfig environment to import it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * Application application;
 * Monitor monitor;
 * EnvironmentAttributes environmentAttributes = EnvironmentAttributes.builder()
 * .application(application)
 * .environmentId("environmentId")
 * // the properties below are optional
 * .description("description")
 * .monitors(List.of(monitor))
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class EnvironmentAttributesDsl {
    private val cdkBuilder: EnvironmentAttributes.Builder = EnvironmentAttributes.builder()

    private val _monitors: MutableList<Monitor> = mutableListOf()

    /** @param application The application associated with the environment. */
    public fun application(application: IApplication) {
        cdkBuilder.application(application)
    }

    /** @param description The description of the environment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param environmentId The ID of the environment. */
    public fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
    }

    /** @param monitors The monitors for the environment. */
    public fun monitors(vararg monitors: Monitor) {
        _monitors.addAll(listOf(*monitors))
    }

    /** @param monitors The monitors for the environment. */
    public fun monitors(monitors: Collection<Monitor>) {
        _monitors.addAll(monitors)
    }

    /** @param name The name of the environment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): EnvironmentAttributes {
        if (_monitors.isNotEmpty()) cdkBuilder.monitors(_monitors)
        return cdkBuilder.build()
    }
}
