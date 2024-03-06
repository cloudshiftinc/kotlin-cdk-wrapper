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
import software.amazon.awscdk.services.appconfig.Environment
import software.amazon.awscdk.services.appconfig.IApplication
import software.amazon.awscdk.services.appconfig.Monitor
import software.constructs.Construct

/**
 * An AWS AppConfig environment.
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
 *
 * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-environment.html)
 */
@CdkDslMarker
public class EnvironmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Environment.Builder = Environment.Builder.create(scope, id)

    private val _monitors: MutableList<Monitor> = mutableListOf()

    /**
     * The application to be associated with the environment.
     *
     * @param application The application to be associated with the environment.
     */
    public fun application(application: IApplication) {
        cdkBuilder.application(application)
    }

    /**
     * The description of the environment.
     *
     * Default: - No description.
     *
     * @param description The description of the environment.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the environment.
     *
     * Default: - A name is generated.
     *
     * @param environmentName The name of the environment.
     */
    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    /**
     * The monitors for the environment.
     *
     * Default: - No monitors.
     *
     * @param monitors The monitors for the environment.
     */
    public fun monitors(vararg monitors: Monitor) {
        _monitors.addAll(listOf(*monitors))
    }

    /**
     * The monitors for the environment.
     *
     * Default: - No monitors.
     *
     * @param monitors The monitors for the environment.
     */
    public fun monitors(monitors: Collection<Monitor>) {
        _monitors.addAll(monitors)
    }

    public fun build(): Environment {
        if (_monitors.isNotEmpty()) cdkBuilder.monitors(_monitors)
        return cdkBuilder.build()
    }
}
