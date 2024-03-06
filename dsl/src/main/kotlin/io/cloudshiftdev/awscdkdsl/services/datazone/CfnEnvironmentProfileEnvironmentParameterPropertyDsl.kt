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
import software.amazon.awscdk.services.datazone.CfnEnvironmentProfile

/**
 * The parameter details of an environment profile.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentprofile-environmentparameter.html)
 */
@CdkDslMarker
public class CfnEnvironmentProfileEnvironmentParameterPropertyDsl {
    private val cdkBuilder: CfnEnvironmentProfile.EnvironmentParameterProperty.Builder =
        CfnEnvironmentProfile.EnvironmentParameterProperty.builder()

    /** @param name The name specified in the environment parameter. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of the environment profile. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEnvironmentProfile.EnvironmentParameterProperty = cdkBuilder.build()
}
