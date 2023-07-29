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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet

/**
 * Contains information about the reputation settings for a configuration set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * ReputationOptionsProperty reputationOptionsProperty = ReputationOptionsProperty.builder()
 * .reputationMetricsEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-reputationoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetReputationOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.ReputationOptionsProperty.Builder =
        CfnConfigurationSet.ReputationOptionsProperty.builder()

    /**
     * @param reputationMetricsEnabled Describes whether or not Amazon SES publishes reputation
     *   metrics for the configuration set, such as bounce and complaint rates, to Amazon
     *   CloudWatch. If the value is `true` , reputation metrics are published. If the value is
     *   `false` , reputation metrics are not published. The default value is `false` .
     */
    public fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
    }

    /**
     * @param reputationMetricsEnabled Describes whether or not Amazon SES publishes reputation
     *   metrics for the configuration set, such as bounce and complaint rates, to Amazon
     *   CloudWatch. If the value is `true` , reputation metrics are published. If the value is
     *   `false` , reputation metrics are not published. The default value is `false` .
     */
    public fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
    }

    public fun build(): CfnConfigurationSet.ReputationOptionsProperty = cdkBuilder.build()
}
