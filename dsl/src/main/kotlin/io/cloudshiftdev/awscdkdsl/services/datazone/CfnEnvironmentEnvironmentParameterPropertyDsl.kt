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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnEnvironment

/**
 * The parameter details of the environment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * EnvironmentParameterProperty environmentParameterProperty =
 * EnvironmentParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environment-environmentparameter.html)
 */
@CdkDslMarker
public class CfnEnvironmentEnvironmentParameterPropertyDsl {
    private val cdkBuilder: CfnEnvironment.EnvironmentParameterProperty.Builder =
        CfnEnvironment.EnvironmentParameterProperty.builder()

    /** @param name The name of the environment parameter. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of the environment parameter. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEnvironment.EnvironmentParameterProperty = cdkBuilder.build()
}
