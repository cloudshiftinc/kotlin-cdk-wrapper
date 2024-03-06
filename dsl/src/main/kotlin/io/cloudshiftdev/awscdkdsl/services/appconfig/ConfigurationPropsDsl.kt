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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.ConfigurationProps
import software.amazon.awscdk.services.appconfig.ConfigurationType
import software.amazon.awscdk.services.appconfig.IApplication
import software.amazon.awscdk.services.appconfig.IDeploymentStrategy
import software.amazon.awscdk.services.appconfig.IEnvironment
import software.amazon.awscdk.services.appconfig.IValidator
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties for the Configuration construct.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * import software.amazon.awscdk.services.kms.*;
 * Application application;
 * DeploymentStrategy deploymentStrategy;
 * Environment environment;
 * Key key;
 * IValidator validator;
 * ConfigurationProps configurationProps = ConfigurationProps.builder()
 * .application(application)
 * // the properties below are optional
 * .deploymentKey(key)
 * .deploymentStrategy(deploymentStrategy)
 * .deployTo(List.of(environment))
 * .description("description")
 * .name("name")
 * .type(ConfigurationType.FREEFORM)
 * .validators(List.of(validator))
 * .build();
 * ```
 */
@CdkDslMarker
public class ConfigurationPropsDsl {
    private val cdkBuilder: ConfigurationProps.Builder = ConfigurationProps.builder()

    private val _deployTo: MutableList<IEnvironment> = mutableListOf()

    private val _validators: MutableList<IValidator> = mutableListOf()

    /** @param application The application associated with the configuration. */
    public fun application(application: IApplication) {
        cdkBuilder.application(application)
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

    public fun build(): ConfigurationProps {
        if (_deployTo.isNotEmpty()) cdkBuilder.deployTo(_deployTo)
        if (_validators.isNotEmpty()) cdkBuilder.validators(_validators)
        return cdkBuilder.build()
    }
}
