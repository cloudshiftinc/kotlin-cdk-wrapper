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
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The Environment property type specifies environment variables to use in a job definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEnvironmentPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EnvironmentProperty.Builder =
        CfnJobDefinition.EnvironmentProperty.builder()

    /** @param name The name of the environment variable. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of the environment variable. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnJobDefinition.EnvironmentProperty = cdkBuilder.build()
}
