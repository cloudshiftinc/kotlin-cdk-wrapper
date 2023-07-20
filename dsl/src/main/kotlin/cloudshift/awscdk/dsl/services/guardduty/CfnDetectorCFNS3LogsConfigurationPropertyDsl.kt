@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector
import kotlin.Boolean

@CdkDslMarker
public class CfnDetectorCFNS3LogsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDetector.CFNS3LogsConfigurationProperty.Builder =
        CfnDetector.CFNS3LogsConfigurationProperty.builder()

    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    public fun build(): CfnDetector.CFNS3LogsConfigurationProperty = cdkBuilder.build()
}
