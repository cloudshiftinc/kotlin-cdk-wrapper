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

package cloudshift.awscdk.dsl.services.groundstation

import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnMissionProfile
import kotlin.Unit

public inline fun CfnConfig.setConfigData(block: CfnConfigConfigDataPropertyDsl.() -> Unit = {}) {
    val builder = CfnConfigConfigDataPropertyDsl()
    builder.apply(block)
    return setConfigData(builder.build())
}

public inline fun CfnMissionProfile.setStreamsKmsKey(
    block: CfnMissionProfileStreamsKmsKeyPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnMissionProfileStreamsKmsKeyPropertyDsl()
    builder.apply(block)
    return setStreamsKmsKey(builder.build())
}
