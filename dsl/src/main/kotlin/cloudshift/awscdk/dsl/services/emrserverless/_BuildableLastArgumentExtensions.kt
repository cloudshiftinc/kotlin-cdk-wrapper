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

package cloudshift.awscdk.dsl.services.emrserverless

import software.amazon.awscdk.services.emrserverless.CfnApplication
import kotlin.Unit

public inline fun CfnApplication.setAutoStartConfiguration(
    block: CfnApplicationAutoStartConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationAutoStartConfigurationPropertyDsl()
    builder.apply(block)
    return setAutoStartConfiguration(builder.build())
}

public inline fun CfnApplication.setAutoStopConfiguration(
    block: CfnApplicationAutoStopConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationAutoStopConfigurationPropertyDsl()
    builder.apply(block)
    return setAutoStopConfiguration(builder.build())
}

public inline fun CfnApplication.setImageConfiguration(
    block: CfnApplicationImageConfigurationInputPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationImageConfigurationInputPropertyDsl()
    builder.apply(block)
    return setImageConfiguration(builder.build())
}

public inline fun CfnApplication.setMaximumCapacity(
    block: CfnApplicationMaximumAllowedResourcesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationMaximumAllowedResourcesPropertyDsl()
    builder.apply(block)
    return setMaximumCapacity(builder.build())
}

public inline fun CfnApplication.setNetworkConfiguration(
    block: CfnApplicationNetworkConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return setNetworkConfiguration(builder.build())
}
