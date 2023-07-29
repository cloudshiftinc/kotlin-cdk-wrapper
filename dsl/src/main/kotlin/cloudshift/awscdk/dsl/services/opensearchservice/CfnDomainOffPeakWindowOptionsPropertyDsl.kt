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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Off-peak window settings for the domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * OffPeakWindowOptionsProperty offPeakWindowOptionsProperty =
 * OffPeakWindowOptionsProperty.builder()
 * .enabled(false)
 * .offPeakWindow(OffPeakWindowProperty.builder()
 * .windowStartTime(WindowStartTimeProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindowoptions.html)
 */
@CdkDslMarker
public class CfnDomainOffPeakWindowOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.OffPeakWindowOptionsProperty.Builder =
        CfnDomain.OffPeakWindowOptionsProperty.builder()

    /** @param enabled Specifies whether off-peak window settings are enabled for the domain. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Specifies whether off-peak window settings are enabled for the domain. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param offPeakWindow Off-peak window settings for the domain. */
    public fun offPeakWindow(offPeakWindow: IResolvable) {
        cdkBuilder.offPeakWindow(offPeakWindow)
    }

    /** @param offPeakWindow Off-peak window settings for the domain. */
    public fun offPeakWindow(offPeakWindow: CfnDomain.OffPeakWindowProperty) {
        cdkBuilder.offPeakWindow(offPeakWindow)
    }

    public fun build(): CfnDomain.OffPeakWindowOptionsProperty = cdkBuilder.build()
}
