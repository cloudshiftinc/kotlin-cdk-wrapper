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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Defines decoding settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * DecodeConfigProperty decodeConfigProperty = DecodeConfigProperty.builder()
 * .unvalidatedJson("unvalidatedJson")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-decodeconfig.html)
 */
@CdkDslMarker
public class CfnConfigDecodeConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.DecodeConfigProperty.Builder =
        CfnConfig.DecodeConfigProperty.builder()

    /**
     * @param unvalidatedJson The decoding settings are in JSON format and define a set of steps to
     *   perform to decode the data.
     */
    public fun unvalidatedJson(unvalidatedJson: String) {
        cdkBuilder.unvalidatedJson(unvalidatedJson)
    }

    public fun build(): CfnConfig.DecodeConfigProperty = cdkBuilder.build()
}
