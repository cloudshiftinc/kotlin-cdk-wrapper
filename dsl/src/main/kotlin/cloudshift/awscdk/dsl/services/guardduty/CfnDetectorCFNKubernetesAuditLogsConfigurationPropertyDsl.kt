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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Describes which optional data sources are enabled for a detector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CFNKubernetesAuditLogsConfigurationProperty cFNKubernetesAuditLogsConfigurationProperty =
 * CFNKubernetesAuditLogsConfigurationProperty.builder()
 * .enable(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesauditlogsconfiguration.html)
 */
@CdkDslMarker
public class CfnDetectorCFNKubernetesAuditLogsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.Builder =
        CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.builder()

    /**
     * @param enable Describes whether Kubernetes audit logs are enabled as a data source for the
     *   detector.
     */
    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    /**
     * @param enable Describes whether Kubernetes audit logs are enabled as a data source for the
     *   detector.
     */
    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    public fun build(): CfnDetector.CFNKubernetesAuditLogsConfigurationProperty = cdkBuilder.build()
}
