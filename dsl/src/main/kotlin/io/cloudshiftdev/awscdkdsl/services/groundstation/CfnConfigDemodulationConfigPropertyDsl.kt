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

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Defines demodulation settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * DemodulationConfigProperty demodulationConfigProperty = DemodulationConfigProperty.builder()
 * .unvalidatedJson("unvalidatedJson")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-demodulationconfig.html)
 */
@CdkDslMarker
public class CfnConfigDemodulationConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.DemodulationConfigProperty.Builder =
        CfnConfig.DemodulationConfigProperty.builder()

    /**
     * @param unvalidatedJson The demodulation settings are in JSON format and define parameters for
     *   demodulation, for example which modulation scheme (e.g. PSK, QPSK, etc.) and matched filter
     *   to use.
     */
    public fun unvalidatedJson(unvalidatedJson: String) {
        cdkBuilder.unvalidatedJson(unvalidatedJson)
    }

    public fun build(): CfnConfig.DemodulationConfigProperty = cdkBuilder.build()
}
