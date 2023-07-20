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

package cloudshift.awscdk.dsl.services.ivs

import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import kotlin.Unit

public inline fun CfnRecordingConfiguration.setDestinationConfiguration(
    block: CfnRecordingConfigurationDestinationConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRecordingConfigurationDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setDestinationConfiguration(builder.build())
}

public inline fun CfnRecordingConfiguration.setThumbnailConfiguration(
    block: CfnRecordingConfigurationThumbnailConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRecordingConfigurationThumbnailConfigurationPropertyDsl()
    builder.apply(block)
    return setThumbnailConfiguration(builder.build())
}
