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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.ActionPoint
import software.amazon.awscdk.services.appconfig.Application
import software.amazon.awscdk.services.appconfig.Environment
import software.amazon.awscdk.services.appconfig.ExtensibleBase
import software.amazon.awscdk.services.appconfig.HostedConfiguration
import software.amazon.awscdk.services.appconfig.IApplication
import software.amazon.awscdk.services.appconfig.IEnvironment
import software.amazon.awscdk.services.appconfig.IEventDestination
import software.amazon.awscdk.services.appconfig.IExtensible
import software.amazon.awscdk.services.appconfig.SourcedConfiguration

/**
 * Adds an environment.
 *
 * @param id
 * @param options
 */
public inline fun Application.addEnvironment(
    id: String,
    block: EnvironmentOptionsDsl.() -> Unit = {}
): IEnvironment {
    val builder = EnvironmentOptionsDsl()
    builder.apply(block)
    return addEnvironment(id, builder.build())
}

/**
 * Adds a hosted configuration.
 *
 * @param id
 * @param options
 */
public inline fun Application.addHostedConfiguration(
    id: String,
    block: HostedConfigurationOptionsDsl.() -> Unit = {}
): HostedConfiguration {
    val builder = HostedConfigurationOptionsDsl()
    builder.apply(block)
    return addHostedConfiguration(id, builder.build())
}

/**
 * Adds a sourced configuration.
 *
 * @param id
 * @param options
 */
public inline fun Application.addSourcedConfiguration(
    id: String,
    block: SourcedConfigurationOptionsDsl.() -> Unit = {}
): SourcedConfiguration {
    val builder = SourcedConfigurationOptionsDsl()
    builder.apply(block)
    return addSourcedConfiguration(id, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to an application.
 *
 * @param actionPoint The action point which triggers the event.
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(actionPoint, eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.onDeploymentBaking(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.onDeploymentComplete(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.onDeploymentRolledBack(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.onDeploymentStart(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.onDeploymentStep(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(eventDestination, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.preCreateHostedConfigurationVersion(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(eventDestination, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun Application.preStartDeployment(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(eventDestination, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to the environment.
 *
 * @param actionPoint
 * @param eventDestination
 * @param options
 */
public inline fun Environment.on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(actionPoint, eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination
 * @param options
 */
public inline fun Environment.onDeploymentBaking(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination
 * @param options
 */
public inline fun Environment.onDeploymentComplete(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to the environment.
 *
 * @param eventDestination
 * @param options
 */
public inline fun Environment.onDeploymentRolledBack(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination
 * @param options
 */
public inline fun Environment.onDeploymentStart(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination
 * @param options
 */
public inline fun Environment.onDeploymentStep(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(eventDestination, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to the environment.
 *
 * @param eventDestination
 * @param options
 */
public inline fun Environment.preCreateHostedConfigurationVersion(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(eventDestination, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination
 * @param options
 */
public inline fun Environment.preStartDeployment(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(eventDestination, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to the derived resource.
 *
 * @param actionPoint
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(actionPoint, eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.onDeploymentBaking(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.onDeploymentComplete(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to the derived resource.
 *
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.onDeploymentRolledBack(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.onDeploymentStart(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.onDeploymentStep(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(eventDestination, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to the derived resource.
 *
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.preCreateHostedConfigurationVersion(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(eventDestination, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination
 * @param options
 */
public inline fun ExtensibleBase.preStartDeployment(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(eventDestination, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to the configuration profile.
 *
 * @param actionPoint The action point which triggers the event.
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(actionPoint, eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.onDeploymentBaking(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.onDeploymentComplete(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.onDeploymentRolledBack(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.onDeploymentStart(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.onDeploymentStep(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(eventDestination, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.preCreateHostedConfigurationVersion(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(eventDestination, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun HostedConfiguration.preStartDeployment(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(eventDestination, builder.build())
}

/**
 * Adds an environment.
 *
 * @param id The name of the environment construct.
 * @param options The options for the environment construct.
 */
public inline fun IApplication.addEnvironment(
    arg0: String,
    block: EnvironmentOptionsDsl.() -> Unit = {}
): IEnvironment {
    val builder = EnvironmentOptionsDsl()
    builder.apply(block)
    return addEnvironment(arg0, builder.build())
}

/**
 * Adds a hosted configuration.
 *
 * @param id The name of the hosted configuration construct.
 * @param options The options for the hosted configuration construct.
 */
public inline fun IApplication.addHostedConfiguration(
    arg0: String,
    block: HostedConfigurationOptionsDsl.() -> Unit = {}
): HostedConfiguration {
    val builder = HostedConfigurationOptionsDsl()
    builder.apply(block)
    return addHostedConfiguration(arg0, builder.build())
}

/**
 * Adds a sourced configuration.
 *
 * @param id The name of the sourced configuration construct.
 * @param options The options for the sourced configuration construct.
 */
public inline fun IApplication.addSourcedConfiguration(
    arg0: String,
    block: SourcedConfigurationOptionsDsl.() -> Unit = {}
): SourcedConfiguration {
    val builder = SourcedConfigurationOptionsDsl()
    builder.apply(block)
    return addSourcedConfiguration(arg0, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to an application.
 *
 * @param actionPoint The action point which triggers the event.
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.on(
    arg0: ActionPoint,
    arg1: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(arg0, arg1, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.onDeploymentBaking(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.onDeploymentComplete(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.onDeploymentRolledBack(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.onDeploymentStart(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.onDeploymentStep(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(arg0, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.preCreateHostedConfigurationVersion(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(arg0, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to an application.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IApplication.preStartDeployment(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(arg0, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to the environment.
 *
 * @param actionPoint The action point which triggers the event.
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.on(
    arg0: ActionPoint,
    arg1: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(arg0, arg1, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.onDeploymentBaking(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.onDeploymentComplete(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to the environment.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.onDeploymentRolledBack(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.onDeploymentStart(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.onDeploymentStep(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(arg0, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to the environment.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.preCreateHostedConfigurationVersion(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(arg0, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to the environment.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IEnvironment.preStartDeployment(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(arg0, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to the derived resource.
 *
 * @param actionPoint The action point which triggers the event.
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.on(
    arg0: ActionPoint,
    arg1: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(arg0, arg1, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.onDeploymentBaking(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.onDeploymentComplete(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to the derived resource.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.onDeploymentRolledBack(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.onDeploymentStart(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(arg0, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.onDeploymentStep(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(arg0, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to the derived resource.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.preCreateHostedConfigurationVersion(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(arg0, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to the derived resource.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun IExtensible.preStartDeployment(
    arg0: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(arg0, builder.build())
}

/**
 * Adds an extension defined by the action point and event destination and also creates an extension
 * association to the configuration profile.
 *
 * @param actionPoint The action point which triggers the event.
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {},
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return on(actionPoint, eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.onDeploymentBaking(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentBaking(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.onDeploymentComplete(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentComplete(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also creates
 * an extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.onDeploymentRolledBack(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentRolledBack(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.onDeploymentStart(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStart(eventDestination, builder.build())
}

/**
 * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.onDeploymentStep(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return onDeploymentStep(eventDestination, builder.build())
}

/**
 * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination and
 * also creates an extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.preCreateHostedConfigurationVersion(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preCreateHostedConfigurationVersion(eventDestination, builder.build())
}

/**
 * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
 * extension association to the configuration profile.
 *
 * @param eventDestination The event that occurs during the extension.
 * @param options Options for the extension.
 */
public inline fun SourcedConfiguration.preStartDeployment(
    eventDestination: IEventDestination,
    block: ExtensionOptionsDsl.() -> Unit = {}
) {
    val builder = ExtensionOptionsDsl()
    builder.apply(block)
    return preStartDeployment(eventDestination, builder.build())
}
