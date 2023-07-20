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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediapackage.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.LogConfigurationProperty.Builder =
        CfnChannel.LogConfigurationProperty.builder()

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnChannel.LogConfigurationProperty = cdkBuilder.build()
}
