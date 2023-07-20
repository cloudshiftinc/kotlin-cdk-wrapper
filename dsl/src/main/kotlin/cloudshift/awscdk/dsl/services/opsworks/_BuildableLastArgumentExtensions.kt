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

package cloudshift.awscdk.dsl.services.opsworks

import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnStack
import kotlin.Unit

public inline fun CfnLayer.setCustomRecipes(block: CfnLayerRecipesPropertyDsl.() -> Unit = {}) {
    val builder = CfnLayerRecipesPropertyDsl()
    builder.apply(block)
    return setCustomRecipes(builder.build())
}

public inline fun CfnLayer.setLifecycleEventConfiguration(
    block: CfnLayerLifecycleEventConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnLayerLifecycleEventConfigurationPropertyDsl()
    builder.apply(block)
    return setLifecycleEventConfiguration(builder.build())
}

public inline fun CfnLayer.setLoadBasedAutoScaling(
    block: CfnLayerLoadBasedAutoScalingPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnLayerLoadBasedAutoScalingPropertyDsl()
    builder.apply(block)
    return setLoadBasedAutoScaling(builder.build())
}

public inline fun CfnStack.setChefConfiguration(block: CfnStackChefConfigurationPropertyDsl.() -> Unit = {}) {
    val builder = CfnStackChefConfigurationPropertyDsl()
    builder.apply(block)
    return setChefConfiguration(builder.build())
}

public inline fun CfnStack.setConfigurationManager(
    block: CfnStackStackConfigurationManagerPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStackStackConfigurationManagerPropertyDsl()
    builder.apply(block)
    return setConfigurationManager(builder.build())
}

public inline fun CfnStack.setCustomCookbooksSource(
    block: CfnStackSourcePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStackSourcePropertyDsl()
    builder.apply(block)
    return setCustomCookbooksSource(builder.build())
}

public inline fun CfnApp.setAppSource(block: CfnAppSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnAppSourcePropertyDsl()
    builder.apply(block)
    return setAppSource(builder.build())
}

public inline fun CfnApp.setSslConfiguration(
    block: CfnAppSslConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAppSslConfigurationPropertyDsl()
    builder.apply(block)
    return setSslConfiguration(builder.build())
}

public inline fun CfnInstance.setTimeBasedAutoScaling(
    block: CfnInstanceTimeBasedAutoScalingPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceTimeBasedAutoScalingPropertyDsl()
    builder.apply(block)
    return setTimeBasedAutoScaling(builder.build())
}
