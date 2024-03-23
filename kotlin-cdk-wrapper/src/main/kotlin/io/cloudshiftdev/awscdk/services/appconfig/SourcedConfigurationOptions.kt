@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for SourcedConfiguration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * ConfigurationSource configurationSource;
 * DeploymentStrategy deploymentStrategy;
 * Environment environment;
 * Key key;
 * Role role;
 * IValidator validator;
 * SourcedConfigurationOptions sourcedConfigurationOptions = SourcedConfigurationOptions.builder()
 * .location(configurationSource)
 * // the properties below are optional
 * .deploymentKey(key)
 * .deploymentStrategy(deploymentStrategy)
 * .deployTo(List.of(environment))
 * .description("description")
 * .name("name")
 * .retrievalRole(role)
 * .type(ConfigurationType.FREEFORM)
 * .validators(List.of(validator))
 * .versionNumber("versionNumber")
 * .build();
 * ```
 */
public interface SourcedConfigurationOptions : ConfigurationOptions {
  /**
   * The location where the configuration is stored.
   */
  public fun location(): ConfigurationSource

  /**
   * The IAM role to retrieve the configuration.
   *
   * Default: - A role is generated.
   */
  public fun retrievalRole(): IRole? = unwrap(this).getRetrievalRole()?.let(IRole::wrap)

  /**
   * The version number of the sourced configuration to deploy.
   *
   * If this is not specified,
   * then there will be no deployment.
   *
   * Default: - None.
   */
  public fun versionNumber(): String? = unwrap(this).getVersionNumber()

  /**
   * A builder for [SourcedConfigurationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment.
     */
    public fun deployTo(deployTo: List<IEnvironment>)

    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment.
     */
    public fun deployTo(vararg deployTo: IEnvironment)

    /**
     * @param deploymentKey The deployment key of the configuration.
     */
    public fun deploymentKey(deploymentKey: IKey)

    /**
     * @param deploymentStrategy The deployment strategy for the configuration.
     */
    public fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy)

    /**
     * @param description The description of the configuration.
     */
    public fun description(description: String)

    /**
     * @param location The location where the configuration is stored. 
     */
    public fun location(location: ConfigurationSource)

    /**
     * @param name The name of the configuration.
     */
    public fun name(name: String)

    /**
     * @param retrievalRole The IAM role to retrieve the configuration.
     */
    public fun retrievalRole(retrievalRole: IRole)

    /**
     * @param type The type of configuration.
     */
    public fun type(type: ConfigurationType)

    /**
     * @param validators The validators for the configuration.
     */
    public fun validators(validators: List<IValidator>)

    /**
     * @param validators The validators for the configuration.
     */
    public fun validators(vararg validators: IValidator)

    /**
     * @param versionNumber The version number of the sourced configuration to deploy.
     * If this is not specified,
     * then there will be no deployment.
     */
    public fun versionNumber(versionNumber: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions.Builder =
        software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions.builder()

    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment.
     */
    override fun deployTo(deployTo: List<IEnvironment>) {
      cdkBuilder.deployTo(deployTo.map(IEnvironment::unwrap))
    }

    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment.
     */
    override fun deployTo(vararg deployTo: IEnvironment): Unit = deployTo(deployTo.toList())

    /**
     * @param deploymentKey The deployment key of the configuration.
     */
    override fun deploymentKey(deploymentKey: IKey) {
      cdkBuilder.deploymentKey(deploymentKey.let(IKey::unwrap))
    }

    /**
     * @param deploymentStrategy The deployment strategy for the configuration.
     */
    override fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
      cdkBuilder.deploymentStrategy(deploymentStrategy.let(IDeploymentStrategy::unwrap))
    }

    /**
     * @param description The description of the configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param location The location where the configuration is stored. 
     */
    override fun location(location: ConfigurationSource) {
      cdkBuilder.location(location.let(ConfigurationSource::unwrap))
    }

    /**
     * @param name The name of the configuration.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param retrievalRole The IAM role to retrieve the configuration.
     */
    override fun retrievalRole(retrievalRole: IRole) {
      cdkBuilder.retrievalRole(retrievalRole.let(IRole::unwrap))
    }

    /**
     * @param type The type of configuration.
     */
    override fun type(type: ConfigurationType) {
      cdkBuilder.type(type.let(ConfigurationType::unwrap))
    }

    /**
     * @param validators The validators for the configuration.
     */
    override fun validators(validators: List<IValidator>) {
      cdkBuilder.validators(validators.map(IValidator::unwrap))
    }

    /**
     * @param validators The validators for the configuration.
     */
    override fun validators(vararg validators: IValidator): Unit = validators(validators.toList())

    /**
     * @param versionNumber The version number of the sourced configuration to deploy.
     * If this is not specified,
     * then there will be no deployment.
     */
    override fun versionNumber(versionNumber: String) {
      cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions,
  ) : CdkObject(cdkObject), SourcedConfigurationOptions {
    /**
     * The list of environments to deploy the configuration to.
     *
     * If this parameter is not specified, then there will be no
     * deployment.
     *
     * Default: - None.
     */
    override fun deployTo(): List<IEnvironment> =
        unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

    /**
     * The deployment key of the configuration.
     *
     * Default: - None.
     */
    override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

    /**
     * The deployment strategy for the configuration.
     *
     * Default: - A deployment strategy with the rollout strategy set to
     * RolloutStrategy.CANARY_10_PERCENT_20_MINUTES
     */
    override fun deploymentStrategy(): IDeploymentStrategy? =
        unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

    /**
     * The description of the configuration.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The location where the configuration is stored.
     */
    override fun location(): ConfigurationSource =
        unwrap(this).getLocation().let(ConfigurationSource::wrap)

    /**
     * The name of the configuration.
     *
     * Default: - A name is generated.
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The IAM role to retrieve the configuration.
     *
     * Default: - A role is generated.
     */
    override fun retrievalRole(): IRole? = unwrap(this).getRetrievalRole()?.let(IRole::wrap)

    /**
     * The type of configuration.
     *
     * Default: ConfigurationType.FREEFORM
     */
    override fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

    /**
     * The validators for the configuration.
     *
     * Default: - No validators.
     */
    override fun validators(): List<IValidator> =
        unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()

    /**
     * The version number of the sourced configuration to deploy.
     *
     * If this is not specified,
     * then there will be no deployment.
     *
     * Default: - None.
     */
    override fun versionNumber(): String? = unwrap(this).getVersionNumber()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourcedConfigurationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions):
        SourcedConfigurationOptions = CdkObjectWrappers.wrap(cdkObject) as?
        SourcedConfigurationOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourcedConfigurationOptions):
        software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions
  }
}
