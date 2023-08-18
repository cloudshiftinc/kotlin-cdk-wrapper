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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnVdmAttributes

/**
 * Settings for your VDM configuration as applicable to the Guardian.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * GuardianAttributesProperty guardianAttributesProperty = GuardianAttributesProperty.builder()
 * .optimizedSharedDelivery("optimizedSharedDelivery")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-guardianattributes.html)
 */
@CdkDslMarker
public class CfnVdmAttributesGuardianAttributesPropertyDsl {
    private val cdkBuilder: CfnVdmAttributes.GuardianAttributesProperty.Builder =
        CfnVdmAttributes.GuardianAttributesProperty.builder()

    /**
     * @param optimizedSharedDelivery Specifies the status of your VDM optimized shared delivery.
     *   Can be one of the following:.
     * * `ENABLED` – Amazon SES enables optimized shared delivery for your account.
     * * `DISABLED` – Amazon SES disables optimized shared delivery for your account.
     */
    public fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): CfnVdmAttributes.GuardianAttributesProperty = cdkBuilder.build()
}
