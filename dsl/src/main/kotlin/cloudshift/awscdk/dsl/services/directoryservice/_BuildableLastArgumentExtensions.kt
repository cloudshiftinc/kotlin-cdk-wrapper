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

package cloudshift.awscdk.dsl.services.directoryservice

import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import kotlin.Unit

public inline fun CfnMicrosoftAD.setVpcSettings(block: CfnMicrosoftADVpcSettingsPropertyDsl.() -> Unit = {}) {
    val builder = CfnMicrosoftADVpcSettingsPropertyDsl()
    builder.apply(block)
    return setVpcSettings(builder.build())
}

public inline fun CfnSimpleAD.setVpcSettings(
    block: CfnSimpleADVpcSettingsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSimpleADVpcSettingsPropertyDsl()
    builder.apply(block)
    return setVpcSettings(builder.build())
}
