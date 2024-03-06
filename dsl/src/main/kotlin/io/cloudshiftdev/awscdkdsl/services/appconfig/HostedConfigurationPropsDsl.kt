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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.ConfigurationContent
import software.amazon.awscdk.services.appconfig.ConfigurationType
import software.amazon.awscdk.services.appconfig.HostedConfigurationProps
import software.amazon.awscdk.services.appconfig.IApplication
import software.amazon.awscdk.services.appconfig.IDeploymentStrategy
import software.amazon.awscdk.services.appconfig.IEnvironment
import software.amazon.awscdk.services.appconfig.IValidator
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties for HostedConfiguration.
 *
 * Example:
 * ```
 * Application application;
 * HostedConfiguration.Builder.create(this, "MyHostedConfiguration")
 * .application(application)
 * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
 * .type(ConfigurationType.FEATURE_FLAGS)
 * .build();
 * ```
 */
@CdkDslMarker
public class HostedConfigurationPropsDsl {
    private val cdkBuilder: HostedConfigurationProps.Builder = HostedConfigurationProps.builder()

    private val _deployTo: MutableList<IEnvironment> = mutableListOf()

    private val _validators: MutableList<IValidator> = mutableListOf()

    /** @param application The application associated with the configuration. */
    public fun application(application: IApplication) {
        cdkBuilder.application(application)
    }

    /** @param content The content of the hosted configuration. */
    public fun content(content: ConfigurationContent) {
        cdkBuilder.content(content)
    }

    /**
     * @param deployTo The list of environments to deploy the configuration to. If this parameter is
     *   not specified, then there will be no deployment.
     */
    public fun deployTo(vararg deployTo: IEnvironment) {
        _deployTo.addAll(listOf(*deployTo))
    }

    /**
     * @param deployTo The list of environments to deploy the configuration to. If this parameter is
     *   not specified, then there will be no deployment.
     */
    public fun deployTo(deployTo: Collection<IEnvironment>) {
        _deployTo.addAll(deployTo)
    }

    /** @param deploymentKey The deployment key of the configuration. */
    public fun deploymentKey(deploymentKey: IKey) {
        cdkBuilder.deploymentKey(deploymentKey)
    }

    /** @param deploymentStrategy The deployment strategy for the configuration. */
    public fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
        cdkBuilder.deploymentStrategy(deploymentStrategy)
    }

    /** @param description The description of the configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param latestVersionNumber The latest version number of the hosted configuration. */
    public fun latestVersionNumber(latestVersionNumber: Number) {
        cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /** @param name The name of the configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type The type of configuration. */
    public fun type(type: ConfigurationType) {
        cdkBuilder.type(type)
    }

    /** @param validators The validators for the configuration. */
    public fun validators(vararg validators: IValidator) {
        _validators.addAll(listOf(*validators))
    }

    /** @param validators The validators for the configuration. */
    public fun validators(validators: Collection<IValidator>) {
        _validators.addAll(validators)
    }

    /** @param versionLabel The version label of the hosted configuration. */
    public fun versionLabel(versionLabel: String) {
        cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): HostedConfigurationProps {
        if (_deployTo.isNotEmpty()) cdkBuilder.deployTo(_deployTo)
        if (_validators.isNotEmpty()) cdkBuilder.validators(_validators)
        return cdkBuilder.build()
    }
}
