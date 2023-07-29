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

package cloudshift.awscdk.dsl.services.opsworks

import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnStack

/** A `LayerCustomRecipes` object that specifies the layer custom recipes. */
public inline fun CfnLayer.setCustomRecipes(block: CfnLayerRecipesPropertyDsl.() -> Unit = {}) {
    val builder = CfnLayerRecipesPropertyDsl()
    builder.apply(block)
    return setCustomRecipes(builder.build())
}

/**
 * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
 * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
 */
public inline fun CfnLayer.setLifecycleEventConfiguration(
    block: CfnLayerLifecycleEventConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLayerLifecycleEventConfigurationPropertyDsl()
    builder.apply(block)
    return setLifecycleEventConfiguration(builder.build())
}

/** The load-based scaling configuration for the AWS OpsWorks layer. */
public inline fun CfnLayer.setLoadBasedAutoScaling(
    block: CfnLayerLoadBasedAutoScalingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLayerLoadBasedAutoScalingPropertyDsl()
    builder.apply(block)
    return setLoadBasedAutoScaling(builder.build())
}

/**
 * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf version
 * on Chef 11.10 stacks. For more information, see
 * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
 * .
 */
public inline fun CfnStack.setChefConfiguration(
    block: CfnStackChefConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStackChefConfigurationPropertyDsl()
    builder.apply(block)
    return setChefConfiguration(builder.build())
}

/** The configuration manager. */
public inline fun CfnStack.setConfigurationManager(
    block: CfnStackStackConfigurationManagerPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStackStackConfigurationManagerPropertyDsl()
    builder.apply(block)
    return setConfigurationManager(builder.build())
}

/** Contains the information required to retrieve an app or cookbook from a repository. */
public inline fun CfnStack.setCustomCookbooksSource(
    block: CfnStackSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnStackSourcePropertyDsl()
    builder.apply(block)
    return setCustomCookbooksSource(builder.build())
}

/** A `Source` object that specifies the app repository. */
public inline fun CfnApp.setAppSource(block: CfnAppSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnAppSourcePropertyDsl()
    builder.apply(block)
    return setAppSource(builder.build())
}

/** An `SslConfiguration` object with the SSL configuration. */
public inline fun CfnApp.setSslConfiguration(
    block: CfnAppSslConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAppSslConfigurationPropertyDsl()
    builder.apply(block)
    return setSslConfiguration(builder.build())
}

/** The time-based scaling configuration for the instance. */
public inline fun CfnInstance.setTimeBasedAutoScaling(
    block: CfnInstanceTimeBasedAutoScalingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInstanceTimeBasedAutoScalingPropertyDsl()
    builder.apply(block)
    return setTimeBasedAutoScaling(builder.build())
}
