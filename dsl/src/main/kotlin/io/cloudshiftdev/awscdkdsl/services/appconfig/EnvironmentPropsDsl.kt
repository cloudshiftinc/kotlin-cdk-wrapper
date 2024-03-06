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
import software.amazon.awscdk.services.appconfig.EnvironmentProps
import software.amazon.awscdk.services.appconfig.IApplication
import software.amazon.awscdk.services.appconfig.Monitor

/**
 * Properties for the Environment construct.
 *
 * Example:
 * ```
 * Application app = new Application(this, "MyApp");
 * Environment env = Environment.Builder.create(this, "MyEnv")
 * .application(app)
 * .build();
 * HostedConfiguration.Builder.create(this, "MyHostedConfig")
 * .application(app)
 * .deployTo(List.of(env))
 * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
 * .build();
 * ```
 */
@CdkDslMarker
public class EnvironmentPropsDsl {
    private val cdkBuilder: EnvironmentProps.Builder = EnvironmentProps.builder()

    private val _monitors: MutableList<Monitor> = mutableListOf()

    /** @param application The application to be associated with the environment. */
    public fun application(application: IApplication) {
        cdkBuilder.application(application)
    }

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

    public fun build(): EnvironmentProps {
        if (_monitors.isNotEmpty()) cdkBuilder.monitors(_monitors)
        return cdkBuilder.build()
    }
}
