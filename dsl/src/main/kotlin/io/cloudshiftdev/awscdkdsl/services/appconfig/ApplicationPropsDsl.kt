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
import software.amazon.awscdk.services.appconfig.ApplicationProps

/**
 * Properties for the Application construct.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * ApplicationProps applicationProps = ApplicationProps.builder()
 * .applicationName("applicationName")
 * .description("description")
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationPropsDsl {
    private val cdkBuilder: ApplicationProps.Builder = ApplicationProps.builder()

    /** @param applicationName The name of the application. */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /** @param description The description for the application. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): ApplicationProps = cdkBuilder.build()
}
