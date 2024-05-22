@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for the Configuration construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * DeploymentStrategy deploymentStrategy;
 * Environment environment;
 * Key key;
 * IValidator validator;
 * ConfigurationOptions configurationOptions = ConfigurationOptions.builder()
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
public interface ConfigurationOptions {
  /**
   * The list of environments to deploy the configuration to.
   *
   * If this parameter is not specified, then there will be no
   * deployment created alongside this configuration.
   *
   * Deployments can be added later using the `IEnvironment.addDeployment` or
   * `IEnvironment.addDeployments` methods.
   *
   * Default: - None.
   */
  public fun deployTo(): List<IEnvironment> = unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?:
      emptyList()

  /**
   * The deployment key of the configuration.
   *
   * Default: - None.
   */
  public fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

  /**
   * The deployment strategy for the configuration.
   *
   * Default: - A deployment strategy with the rollout strategy set to
   * RolloutStrategy.CANARY_10_PERCENT_20_MINUTES
   */
  public fun deploymentStrategy(): IDeploymentStrategy? =
      unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

  /**
   * The description of the configuration.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the configuration.
   *
   * Default: - A name is generated.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The type of configuration.
   *
   * Default: ConfigurationType.FREEFORM
   */
  public fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

  /**
   * The validators for the configuration.
   *
   * Default: - No validators.
   */
  public fun validators(): List<IValidator> = unwrap(this).getValidators()?.map(IValidator::wrap) ?:
      emptyList()

  /**
   * A builder for [ConfigurationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment created alongside this configuration.
     *
     * Deployments can be added later using the `IEnvironment.addDeployment` or
     * `IEnvironment.addDeployments` methods.
     */
    public fun deployTo(deployTo: List<IEnvironment>)

    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment created alongside this configuration.
     *
     * Deployments can be added later using the `IEnvironment.addDeployment` or
     * `IEnvironment.addDeployments` methods.
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
     * @param name The name of the configuration.
     */
    public fun name(name: String)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ConfigurationOptions.Builder =
        software.amazon.awscdk.services.appconfig.ConfigurationOptions.builder()

    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment created alongside this configuration.
     *
     * Deployments can be added later using the `IEnvironment.addDeployment` or
     * `IEnvironment.addDeployments` methods.
     */
    override fun deployTo(deployTo: List<IEnvironment>) {
      cdkBuilder.deployTo(deployTo.map(IEnvironment.Companion::unwrap))
    }

    /**
     * @param deployTo The list of environments to deploy the configuration to.
     * If this parameter is not specified, then there will be no
     * deployment created alongside this configuration.
     *
     * Deployments can be added later using the `IEnvironment.addDeployment` or
     * `IEnvironment.addDeployments` methods.
     */
    override fun deployTo(vararg deployTo: IEnvironment): Unit = deployTo(deployTo.toList())

    /**
     * @param deploymentKey The deployment key of the configuration.
     */
    override fun deploymentKey(deploymentKey: IKey) {
      cdkBuilder.deploymentKey(deploymentKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param deploymentStrategy The deployment strategy for the configuration.
     */
    override fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
      cdkBuilder.deploymentStrategy(deploymentStrategy.let(IDeploymentStrategy.Companion::unwrap))
    }

    /**
     * @param description The description of the configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the configuration.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param type The type of configuration.
     */
    override fun type(type: ConfigurationType) {
      cdkBuilder.type(type.let(ConfigurationType.Companion::unwrap))
    }

    /**
     * @param validators The validators for the configuration.
     */
    override fun validators(validators: List<IValidator>) {
      cdkBuilder.validators(validators.map(IValidator.Companion::unwrap))
    }

    /**
     * @param validators The validators for the configuration.
     */
    override fun validators(vararg validators: IValidator): Unit = validators(validators.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.ConfigurationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationOptions,
  ) : CdkObject(cdkObject), ConfigurationOptions {
    /**
     * The list of environments to deploy the configuration to.
     *
     * If this parameter is not specified, then there will be no
     * deployment created alongside this configuration.
     *
     * Deployments can be added later using the `IEnvironment.addDeployment` or
     * `IEnvironment.addDeployments` methods.
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
     * The name of the configuration.
     *
     * Default: - A name is generated.
     */
    override fun name(): String? = unwrap(this).getName()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationOptions):
        ConfigurationOptions = CdkObjectWrappers.wrap(cdkObject) as? ConfigurationOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationOptions):
        software.amazon.awscdk.services.appconfig.ConfigurationOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ConfigurationOptions
  }
}
