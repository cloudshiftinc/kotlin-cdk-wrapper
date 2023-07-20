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

package cloudshift.awscdk.dsl.services.aps

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.aps.CfnWorkspace
import kotlin.String

@CdkDslMarker
public class CfnWorkspaceLoggingConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkspace.LoggingConfigurationProperty.Builder =
        CfnWorkspace.LoggingConfigurationProperty.builder()

    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    public fun build(): CfnWorkspace.LoggingConfigurationProperty = cdkBuilder.build()
}
