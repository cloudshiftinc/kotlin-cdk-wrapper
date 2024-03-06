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

    /** @param unvalidatedJson the value to be set. */
    public fun unvalidatedJson(unvalidatedJson: String) {
        cdkBuilder.unvalidatedJson(unvalidatedJson)
    }

    public fun build(): CfnConfig.DecodeConfigProperty = cdkBuilder.build()
}
