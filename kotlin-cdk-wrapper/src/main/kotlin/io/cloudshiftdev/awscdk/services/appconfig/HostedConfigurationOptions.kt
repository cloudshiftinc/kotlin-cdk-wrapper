@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for HostedConfiguration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * ConfigurationContent configurationContent;
 * DeploymentStrategy deploymentStrategy;
 * Environment environment;
 * Key key;
 * IValidator validator;
 * HostedConfigurationOptions hostedConfigurationOptions = HostedConfigurationOptions.builder()
 * .content(configurationContent)
 * // the properties below are optional
 * .deletionProtectionCheck(DeletionProtectionCheck.ACCOUNT_DEFAULT)
 * .deploymentKey(key)
 * .deploymentStrategy(deploymentStrategy)
 * .deployTo(List.of(environment))
 * .description("description")
 * .latestVersionNumber(123)
 * .name("name")
 * .type(ConfigurationType.FREEFORM)
 * .validators(List.of(validator))
 * .versionLabel("versionLabel")
 * .build();
 * ```
 */
public interface HostedConfigurationOptions : ConfigurationOptions {
  /**
   * The content of the hosted configuration.
   */
  public fun content(): ConfigurationContent

  /**
   * The latest version number of the hosted configuration.
   *
   * Default: - None.
   */
  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * The version label of the hosted configuration.
   *
   * Default: - None.
   */
  public fun versionLabel(): String? = unwrap(this).getVersionLabel()

  /**
   * A builder for [HostedConfigurationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param content The content of the hosted configuration. 
     */
    public fun content(content: ConfigurationContent)

    /**
     * @param deletionProtectionCheck A parameter to configure deletion protection.
     * Deletion protection prevents a user from deleting a configuration profile if your application
     * has called
     * either `GetLatestConfiguration` or `GetConfiguration` for the configuration profile during
     * the specified interval.
     */
    public fun deletionProtectionCheck(deletionProtectionCheck: DeletionProtectionCheck)

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
     * @param latestVersionNumber The latest version number of the hosted configuration.
     */
    public fun latestVersionNumber(latestVersionNumber: Number)

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

    /**
     * @param versionLabel The version label of the hosted configuration.
     */
    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.HostedConfigurationOptions.Builder =
        software.amazon.awscdk.services.appconfig.HostedConfigurationOptions.builder()

    /**
     * @param content The content of the hosted configuration. 
     */
    override fun content(content: ConfigurationContent) {
      cdkBuilder.content(content.let(ConfigurationContent.Companion::unwrap))
    }

    /**
     * @param deletionProtectionCheck A parameter to configure deletion protection.
     * Deletion protection prevents a user from deleting a configuration profile if your application
     * has called
     * either `GetLatestConfiguration` or `GetConfiguration` for the configuration profile during
     * the specified interval.
     */
    override fun deletionProtectionCheck(deletionProtectionCheck: DeletionProtectionCheck) {
      cdkBuilder.deletionProtectionCheck(deletionProtectionCheck.let(DeletionProtectionCheck.Companion::unwrap))
    }

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
     * @param latestVersionNumber The latest version number of the hosted configuration.
     */
    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
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

    /**
     * @param versionLabel The version label of the hosted configuration.
     */
    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.HostedConfigurationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.HostedConfigurationOptions,
  ) : CdkObject(cdkObject),
      HostedConfigurationOptions {
    /**
     * The content of the hosted configuration.
     */
    override fun content(): ConfigurationContent =
        unwrap(this).getContent().let(ConfigurationContent::wrap)

    /**
     * A parameter to configure deletion protection.
     *
     * Deletion protection prevents a user from deleting a configuration profile if your application
     * has called
     * either `GetLatestConfiguration` or `GetConfiguration` for the configuration profile during
     * the specified interval.
     *
     * Default: DeletionProtectionCheck.ACCOUNT_DEFAULT
     *
     * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/deletion-protection.html)
     */
    override fun deletionProtectionCheck(): DeletionProtectionCheck? =
        unwrap(this).getDeletionProtectionCheck()?.let(DeletionProtectionCheck::wrap)

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
     * The latest version number of the hosted configuration.
     *
     * Default: - None.
     */
    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

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

    /**
     * The version label of the hosted configuration.
     *
     * Default: - None.
     */
    override fun versionLabel(): String? = unwrap(this).getVersionLabel()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedConfigurationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.HostedConfigurationOptions):
        HostedConfigurationOptions = CdkObjectWrappers.wrap(cdkObject) as?
        HostedConfigurationOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedConfigurationOptions):
        software.amazon.awscdk.services.appconfig.HostedConfigurationOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.HostedConfigurationOptions
  }
}
