@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A sourced configuration represents configuration stored in an Amazon S3 bucket, AWS Secrets
 * Manager secret, Systems Manager (SSM) Parameter Store parameter, SSM document, or AWS CodePipeline.
 *
 * Example:
 *
 * ```
 * Application application;
 * Bucket bucket;
 * SourcedConfiguration.Builder.create(this, "MySourcedConfiguration")
 * .application(application)
 * .location(ConfigurationSource.fromBucket(bucket, "path/to/file.json"))
 * .type(ConfigurationType.FEATURE_FLAGS)
 * .name("MyConfig")
 * .description("This is my sourced configuration from CDK.")
 * .build();
 * ```
 */
public open class SourcedConfiguration(
  cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfiguration,
) : CloudshiftdevConstructsConstruct(cdkObject),
    IConfiguration,
    IExtensible {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SourcedConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.SourcedConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(SourcedConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SourcedConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, SourcedConfigurationProps(props)
  )

  /**
   * Adds an extension association to the configuration profile.
   *
   * @param extension The extension to create an association for. 
   */
  public override fun addExtension(extension: IExtension) {
    unwrap(this).addExtension(extension.let(IExtension.Companion::unwrap))
  }

  /**
   * The application associated with the configuration.
   */
  public override fun application(): IApplication =
      unwrap(this).getApplication().let(IApplication::wrap)

  /**
   * The Amazon Resource Name (ARN) of the configuration profile.
   */
  public open fun configurationProfileArn(): String = unwrap(this).getConfigurationProfileArn()

  /**
   * The ID of the configuration profile.
   */
  public override fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

  /**
   * The environments to deploy to.
   */
  public override fun deployTo(): List<IEnvironment> =
      unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

  /**
   * The deployment key for the configuration.
   */
  public override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

  /**
   * The deployment strategy for the configuration.
   */
  public override fun deploymentStrategy(): IDeploymentStrategy? =
      unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

  /**
   * The description of the configuration.
   */
  public override fun description(): String? = unwrap(this).getDescription()

  /**
   * The location where the configuration is stored.
   */
  public open fun location(): ConfigurationSource =
      unwrap(this).getLocation().let(ConfigurationSource::wrap)

  /**
   * The name of the configuration.
   */
  public override fun name(): String? = unwrap(this).getName()

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun on(actionPoint: ActionPoint, eventDestination: IEventDestination) {
    unwrap(this).on(actionPoint.let(ActionPoint.Companion::unwrap),
        eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions,
  ) {
    unwrap(this).on(actionPoint.let(ActionPoint.Companion::unwrap),
        eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
  public override fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions.Builder.() -> Unit,
  ): Unit = on(actionPoint, eventDestination, ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentRolledBack(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit =
      preCreateHostedConfigurationVersion(eventDestination, ExtensionOptions(options))

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preStartDeployment(eventDestination: IEventDestination) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the configuration profile.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(eventDestination,
      ExtensionOptions(options))

  /**
   * The IAM role to retrieve the configuration.
   */
  public open fun retrievalRole(): IRole? = unwrap(this).getRetrievalRole()?.let(IRole::wrap)

  /**
   * The key to decrypt the configuration if applicable.
   *
   * This key
   * can be used when storing configuration in AWS Secrets Manager, Systems Manager Parameter Store,
   * or Amazon S3.
   */
  public open fun sourceKey(): IKey? = unwrap(this).getSourceKey()?.let(IKey::wrap)

  /**
   * The configuration type.
   */
  public override fun type(): ConfigurationType? =
      unwrap(this).getType()?.let(ConfigurationType::wrap)

  /**
   * The validators for the configuration.
   */
  public override fun validators(): List<IValidator> =
      unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()

  /**
   * The version number of the configuration to deploy.
   */
  public override fun versionNumber(): String? = unwrap(this).getVersionNumber()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.SourcedConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application associated with the configuration.
     *
     * @param application The application associated with the configuration. 
     */
    public fun application(application: IApplication)

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
     *
     * @param deployTo The list of environments to deploy the configuration to. 
     */
    public fun deployTo(deployTo: List<IEnvironment>)

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
     *
     * @param deployTo The list of environments to deploy the configuration to. 
     */
    public fun deployTo(vararg deployTo: IEnvironment)

    /**
     * The deployment key of the configuration.
     *
     * Default: - None.
     *
     * @param deploymentKey The deployment key of the configuration. 
     */
    public fun deploymentKey(deploymentKey: IKey)

    /**
     * The deployment strategy for the configuration.
     *
     * Default: - A deployment strategy with the rollout strategy set to
     * RolloutStrategy.CANARY_10_PERCENT_20_MINUTES
     *
     * @param deploymentStrategy The deployment strategy for the configuration. 
     */
    public fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy)

    /**
     * The description of the configuration.
     *
     * Default: - No description.
     *
     * @param description The description of the configuration. 
     */
    public fun description(description: String)

    /**
     * The location where the configuration is stored.
     *
     * @param location The location where the configuration is stored. 
     */
    public fun location(location: ConfigurationSource)

    /**
     * The name of the configuration.
     *
     * Default: - A name is generated.
     *
     * @param name The name of the configuration. 
     */
    public fun name(name: String)

    /**
     * The IAM role to retrieve the configuration.
     *
     * Default: - Auto generated if location type is not ConfigurationSourceType.CODE_PIPELINE
     * otherwise no role specified.
     *
     * @param retrievalRole The IAM role to retrieve the configuration. 
     */
    public fun retrievalRole(retrievalRole: IRole)

    /**
     * The type of configuration.
     *
     * Default: ConfigurationType.FREEFORM
     *
     * @param type The type of configuration. 
     */
    public fun type(type: ConfigurationType)

    /**
     * The validators for the configuration.
     *
     * Default: - No validators.
     *
     * @param validators The validators for the configuration. 
     */
    public fun validators(validators: List<IValidator>)

    /**
     * The validators for the configuration.
     *
     * Default: - No validators.
     *
     * @param validators The validators for the configuration. 
     */
    public fun validators(vararg validators: IValidator)

    /**
     * The version number of the sourced configuration to deploy.
     *
     * If this is not specified,
     * then there will be no deployment.
     *
     * Default: - None.
     *
     * @param versionNumber The version number of the sourced configuration to deploy. 
     */
    public fun versionNumber(versionNumber: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.SourcedConfiguration.Builder =
        software.amazon.awscdk.services.appconfig.SourcedConfiguration.Builder.create(scope, id)

    /**
     * The application associated with the configuration.
     *
     * @param application The application associated with the configuration. 
     */
    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication.Companion::unwrap))
    }

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
     *
     * @param deployTo The list of environments to deploy the configuration to. 
     */
    override fun deployTo(deployTo: List<IEnvironment>) {
      cdkBuilder.deployTo(deployTo.map(IEnvironment.Companion::unwrap))
    }

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
     *
     * @param deployTo The list of environments to deploy the configuration to. 
     */
    override fun deployTo(vararg deployTo: IEnvironment): Unit = deployTo(deployTo.toList())

    /**
     * The deployment key of the configuration.
     *
     * Default: - None.
     *
     * @param deploymentKey The deployment key of the configuration. 
     */
    override fun deploymentKey(deploymentKey: IKey) {
      cdkBuilder.deploymentKey(deploymentKey.let(IKey.Companion::unwrap))
    }

    /**
     * The deployment strategy for the configuration.
     *
     * Default: - A deployment strategy with the rollout strategy set to
     * RolloutStrategy.CANARY_10_PERCENT_20_MINUTES
     *
     * @param deploymentStrategy The deployment strategy for the configuration. 
     */
    override fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
      cdkBuilder.deploymentStrategy(deploymentStrategy.let(IDeploymentStrategy.Companion::unwrap))
    }

    /**
     * The description of the configuration.
     *
     * Default: - No description.
     *
     * @param description The description of the configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The location where the configuration is stored.
     *
     * @param location The location where the configuration is stored. 
     */
    override fun location(location: ConfigurationSource) {
      cdkBuilder.location(location.let(ConfigurationSource.Companion::unwrap))
    }

    /**
     * The name of the configuration.
     *
     * Default: - A name is generated.
     *
     * @param name The name of the configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The IAM role to retrieve the configuration.
     *
     * Default: - Auto generated if location type is not ConfigurationSourceType.CODE_PIPELINE
     * otherwise no role specified.
     *
     * @param retrievalRole The IAM role to retrieve the configuration. 
     */
    override fun retrievalRole(retrievalRole: IRole) {
      cdkBuilder.retrievalRole(retrievalRole.let(IRole.Companion::unwrap))
    }

    /**
     * The type of configuration.
     *
     * Default: ConfigurationType.FREEFORM
     *
     * @param type The type of configuration. 
     */
    override fun type(type: ConfigurationType) {
      cdkBuilder.type(type.let(ConfigurationType.Companion::unwrap))
    }

    /**
     * The validators for the configuration.
     *
     * Default: - No validators.
     *
     * @param validators The validators for the configuration. 
     */
    override fun validators(validators: List<IValidator>) {
      cdkBuilder.validators(validators.map(IValidator.Companion::unwrap))
    }

    /**
     * The validators for the configuration.
     *
     * Default: - No validators.
     *
     * @param validators The validators for the configuration. 
     */
    override fun validators(vararg validators: IValidator): Unit = validators(validators.toList())

    /**
     * The version number of the sourced configuration to deploy.
     *
     * If this is not specified,
     * then there will be no deployment.
     *
     * Default: - None.
     *
     * @param versionNumber The version number of the sourced configuration to deploy. 
     */
    override fun versionNumber(versionNumber: String) {
      cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.SourcedConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SourcedConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SourcedConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfiguration):
        SourcedConfiguration = SourcedConfiguration(cdkObject)

    internal fun unwrap(wrapped: SourcedConfiguration):
        software.amazon.awscdk.services.appconfig.SourcedConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.appconfig.SourcedConfiguration
  }
}
