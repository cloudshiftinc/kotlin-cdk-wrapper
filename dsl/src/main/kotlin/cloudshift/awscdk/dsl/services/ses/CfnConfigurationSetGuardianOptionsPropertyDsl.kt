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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

/**
 * Settings for your VDM configuration as applicable to the Guardian.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * GuardianOptionsProperty guardianOptionsProperty = GuardianOptionsProperty.builder()
 * .optimizedSharedDelivery("optimizedSharedDelivery")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-guardianoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetGuardianOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.GuardianOptionsProperty.Builder =
        CfnConfigurationSet.GuardianOptionsProperty.builder()

    /**
     * @param optimizedSharedDelivery Specifies the status of your VDM optimized shared delivery.
     *   Can be one of the following:.
     * * `ENABLED` – Amazon SES enables optimized shared delivery for the configuration set.
     * * `DISABLED` – Amazon SES disables optimized shared delivery for the configuration set.
     */
    public fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): CfnConfigurationSet.GuardianOptionsProperty = cdkBuilder.build()
}
