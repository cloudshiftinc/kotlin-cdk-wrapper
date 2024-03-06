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
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration

/**
 * The regional parameters in the environment blueprint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RegionalParameterProperty regionalParameterProperty = RegionalParameterProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-regionalparameter.html)
 */
@CdkDslMarker
public class CfnEnvironmentBlueprintConfigurationRegionalParameterPropertyDsl {
    private val cdkBuilder: CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty.Builder =
        CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty.builder()

    /** @param parameters A string to string map containing parameters for the region. */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param parameters A string to string map containing parameters for the region. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param region The region specified in the environment parameter. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty =
        cdkBuilder.build()
}
