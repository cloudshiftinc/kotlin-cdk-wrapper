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
import software.amazon.awscdk.services.appconfig.Application
import software.constructs.Construct

/**
 * An AWS AppConfig application.
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
 * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-application.html)
 */
@CdkDslMarker
public class ApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Application.Builder = Application.Builder.create(scope, id)

    /**
     * The name of the application.
     *
     * Default: - A name is generated.
     *
     * @param applicationName The name of the application.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * The description for the application.
     *
     * Default: - No description.
     *
     * @param description The description for the application.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): Application = cdkBuilder.build()
}
