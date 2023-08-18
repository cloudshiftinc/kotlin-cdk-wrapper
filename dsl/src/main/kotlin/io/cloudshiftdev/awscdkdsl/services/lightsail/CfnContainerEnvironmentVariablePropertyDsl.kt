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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * `EnvironmentVariable` is a property of the
 * [Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
 * property. It describes the environment variables of a container on a container service which are
 * key-value parameters that provide dynamic configuration of the application or script run by the
 * container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
 * .value("value")
 * .variable("variable")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-environmentvariable.html)
 */
@CdkDslMarker
public class CfnContainerEnvironmentVariablePropertyDsl {
    private val cdkBuilder: CfnContainer.EnvironmentVariableProperty.Builder =
        CfnContainer.EnvironmentVariableProperty.builder()

    /** @param value The environment variable value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    /** @param variable The environment variable key. */
    public fun variable(variable: String) {
        cdkBuilder.variable(variable)
    }

    public fun build(): CfnContainer.EnvironmentVariableProperty = cdkBuilder.build()
}
