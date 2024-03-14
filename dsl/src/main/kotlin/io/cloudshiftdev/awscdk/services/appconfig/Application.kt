package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Application internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.Application,
) : Resource(cdkObject), IApplication, IExtensible {
  /**
   * Adds an environment.
   *
   * @param id 
   * @param options
   */
  public override fun addEnvironment(id: String): IEnvironment =
      unwrap(this).addEnvironment(id).let(IEnvironment::wrap)

  /**
   * Adds an environment.
   *
   * @param id 
   * @param options
   */
  public override fun addEnvironment(id: String, options: EnvironmentOptions): IEnvironment =
      unwrap(this).addEnvironment(id,
      options.let(EnvironmentOptions::unwrap)).let(IEnvironment::wrap)

  /**
   * Adds an environment.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c104632a3d0a4e3f999a6f63baa5b43afe61918d2af83102e45915a66f0ec0b")
  public override fun addEnvironment(id: String, options: EnvironmentOptions.Builder.() -> Unit):
      IEnvironment = addEnvironment(id, EnvironmentOptions(options))

  /**
   * Adds an existing environment.
   *
   * @param environment 
   */
  public override fun addExistingEnvironment(environment: IEnvironment) {
    unwrap(this).addExistingEnvironment(environment.let(IEnvironment::unwrap))
  }

  /**
   * Adds an extension association to the application.
   *
   * @param extension The extension to create an association for. 
   */
  public override fun addExtension(extension: IExtension) {
    unwrap(this).addExtension(extension.let(IExtension::unwrap))
  }

  /**
   * Adds a hosted configuration.
   *
   * @param id 
   * @param options 
   */
  public override fun addHostedConfiguration(id: String, options: HostedConfigurationOptions):
      HostedConfiguration = unwrap(this).addHostedConfiguration(id,
      options.let(HostedConfigurationOptions::unwrap)).let(HostedConfiguration::wrap)

  /**
   * Adds a hosted configuration.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9a4c56e358d895d1df2b4a4dfd88bd752cef6f44f4f4132eb52adb3024fc6e82")
  public override fun addHostedConfiguration(id: String,
      options: HostedConfigurationOptions.Builder.() -> Unit): HostedConfiguration =
      addHostedConfiguration(id, HostedConfigurationOptions(options))

  /**
   * Adds a sourced configuration.
   *
   * @param id 
   * @param options 
   */
  public override fun addSourcedConfiguration(id: String, options: SourcedConfigurationOptions):
      SourcedConfiguration = unwrap(this).addSourcedConfiguration(id,
      options.let(SourcedConfigurationOptions::unwrap)).let(SourcedConfiguration::wrap)

  /**
   * Adds a sourced configuration.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f164adb048ad3f7b09ca183a13b663a31673b97620c35cd63fc05114572ed704")
  public override fun addSourcedConfiguration(id: String,
      options: SourcedConfigurationOptions.Builder.() -> Unit): SourcedConfiguration =
      addSourcedConfiguration(id, SourcedConfigurationOptions(options))

  /**
   * The Amazon Resource Name (ARN) of the application.
   */
  public override fun applicationArn(): String = unwrap(this).getApplicationArn()

  /**
   * The ID of the application.
   */
  public override fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The description of the application.
   */
  public override fun description(): String? = unwrap(this).getDescription()

  /**
   * Returns the list of associated environments.
   */
  public override fun environments(): List<IEnvironment> =
      unwrap(this).environments().map(IEnvironment::wrap)

  /**
   * The name of the application.
   */
  public override fun name(): String? = unwrap(this).getName()

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun on(actionPoint: ActionPoint, eventDestination: IEventDestination) {
    unwrap(this).on(actionPoint.let(ActionPoint::unwrap),
        eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
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
    unwrap(this).on(actionPoint.let(ActionPoint::unwrap),
        eventDestination.let(IEventDestination::unwrap), options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
  public override fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions.Builder.() -> Unit,
  ): Unit = on(actionPoint, eventDestination, ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentRolledBack(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit =
      preCreateHostedConfigurationVersion(eventDestination, ExtensionOptions(options))

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preStartDeployment(eventDestination: IEventDestination) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(eventDestination,
      ExtensionOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.Application].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the application.
     *
     * Default: - A name is generated.
     *
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * The description for the application.
     *
     * Default: - No description.
     *
     * @param description The description for the application. 
     */
    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Application.Builder =
        software.amazon.awscdk.services.appconfig.Application.Builder.create(scope, id)

    /**
     * The name of the application.
     *
     * Default: - A name is generated.
     *
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * The description for the application.
     *
     * Default: - No description.
     *
     * @param description The description for the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.Application = cdkBuilder.build()
  }

  public companion object {
    public fun addAgentToEcs(taskDef: TaskDefinition) {
      software.amazon.awscdk.services.appconfig.Application.addAgentToEcs(taskDef.let(TaskDefinition::unwrap))
    }

    public fun fromApplicationArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      applicationArn: String,
    ): IApplication =
        software.amazon.awscdk.services.appconfig.Application.fromApplicationArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, applicationArn).let(IApplication::wrap)

    public fun fromApplicationId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      applicationId: String,
    ): IApplication =
        software.amazon.awscdk.services.appconfig.Application.fromApplicationId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, applicationId).let(IApplication::wrap)

    public fun lambdaLayerVersionArn(region: String): String =
        software.amazon.awscdk.services.appconfig.Application.getLambdaLayerVersionArn(region)

    public fun lambdaLayerVersionArn(region: String, platform: Platform): String =
        software.amazon.awscdk.services.appconfig.Application.getLambdaLayerVersionArn(region,
        platform.let(Platform::unwrap))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Application {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Application(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Application): Application
        = Application(cdkObject)

    internal fun unwrap(wrapped: Application): software.amazon.awscdk.services.appconfig.Application
        = wrapped.cdkObject
  }
}
