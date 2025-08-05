@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS AppConfig environment.
 *
 * Example:
 *
 * ```
 * Application app = new Application(this, "MyApp");
 * Environment env = Environment.Builder.create(this, "MyEnv")
 * .application(app)
 * .build();
 * HostedConfiguration.Builder.create(this, "MyFirstHostedConfig")
 * .application(app)
 * .deployTo(List.of(env))
 * .content(ConfigurationContent.fromInlineText("This is my first configuration content."))
 * .build();
 * HostedConfiguration.Builder.create(this, "MySecondHostedConfig")
 * .application(app)
 * .deployTo(List.of(env))
 * .content(ConfigurationContent.fromInlineText("This is my second configuration content."))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-environment.html)
 */
public open class Environment(
  cdkObject: software.amazon.awscdk.services.appconfig.Environment,
) : Resource(cdkObject),
    IEnvironment,
    IExtensible {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.Environment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EnvironmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, EnvironmentProps(props)
  )

  /**
   * Creates a deployment of the supplied configuration to this environment.
   *
   * Note that you can only deploy one configuration at a time to an environment.
   * However, you can deploy one configuration each to different environments at the same time.
   * If more than one deployment is requested for this environment, they will occur in the same
   * order they were provided.
   *
   * @param configuration 
   */
  public override fun addDeployment(configuration: IConfiguration) {
    unwrap(this).addDeployment(configuration.let(IConfiguration.Companion::unwrap))
  }

  /**
   * Creates a deployment for each of the supplied configurations to this environment.
   *
   * These configurations will be deployed in the same order as the input array.
   *
   * @param configurations 
   */
  public override fun addDeployments(vararg configurations: IConfiguration) {
    unwrap(this).addDeployments(*configurations.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.appconfig.IConfiguration}.toTypedArray())
  }

  /**
   * Adds an extension association to the environment.
   *
   * @param extension 
   */
  public override fun addExtension(extension: IExtension) {
    unwrap(this).addExtension(extension.let(IExtension.Companion::unwrap))
  }

  /**
   * The application associated with the environment.
   */
  public override fun application(): IApplication? =
      unwrap(this).getApplication()?.let(IApplication::wrap)

  /**
   * The ID of the environment.
   */
  public override fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * Adds an AT_DEPLOYMENT_TICK extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun atDeploymentTick(eventDestination: IEventDestination) {
    unwrap(this).atDeploymentTick(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an AT_DEPLOYMENT_TICK extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun atDeploymentTick(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).atDeploymentTick(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an AT_DEPLOYMENT_TICK extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f8c201d364bd1348c470ff45a380b57e5cbcd5d83fb8aa9250995db9670d33c2")
  public override fun atDeploymentTick(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = atDeploymentTick(eventDestination,
      ExtensionOptions(options))

  /**
   * The description of the environment.
   */
  public override fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the environment.
   */
  public override fun environmentArn(): String = unwrap(this).getEnvironmentArn()

  /**
   * The ID of the environment.
   */
  public override fun environmentId(): String = unwrap(this).getEnvironmentId()

  /**
   * Adds an IAM policy statement associated with this environment to an IAM principal's policy.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Permits an IAM principal to perform read operations on this environment's configurations.
   *
   * Actions: GetLatestConfiguration, StartConfigurationSession.
   *
   * @param identity 
   */
  public override fun grantReadConfig(identity: IGrantable): Grant =
      unwrap(this).grantReadConfig(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The monitors for the environment.
   */
  public override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  /**
   * The name of the environment.
   */
  public override fun name(): String? = unwrap(this).getName()

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the environment.
   *
   * @param actionPoint 
   * @param eventDestination 
   * @param options
   */
  public override fun on(actionPoint: ActionPoint, eventDestination: IEventDestination) {
    unwrap(this).on(actionPoint.let(ActionPoint.Companion::unwrap),
        eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the environment.
   *
   * @param actionPoint 
   * @param eventDestination 
   * @param options
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
   * extension association to the environment.
   *
   * @param actionPoint 
   * @param eventDestination 
   * @param options
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
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentRolledBack(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit =
      preCreateHostedConfigurationVersion(eventDestination, ExtensionOptions(options))

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preStartDeployment(eventDestination: IEventDestination) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination.Companion::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination.Companion::unwrap),
        options.let(ExtensionOptions.Companion::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the environment.
   *
   * @param eventDestination 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(eventDestination,
      ExtensionOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.Environment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application to be associated with the environment.
     *
     * @param application The application to be associated with the environment. 
     */
    public fun application(application: IApplication)

    /**
     * A property to prevent accidental deletion of active environments.
     *
     * Default: undefined - AppConfig default is ACCOUNT_DEFAULT
     *
     * @param deletionProtectionCheck A property to prevent accidental deletion of active
     * environments. 
     */
    public fun deletionProtectionCheck(deletionProtectionCheck: DeletionProtectionCheck)

    /**
     * The description of the environment.
     *
     * Default: - No description.
     *
     * @param description The description of the environment. 
     */
    public fun description(description: String)

    /**
     * The name of the environment.
     *
     * Default: - A name is generated.
     *
     * @param environmentName The name of the environment. 
     */
    public fun environmentName(environmentName: String)

    /**
     * The monitors for the environment.
     *
     * Default: - No monitors.
     *
     * @param monitors The monitors for the environment. 
     */
    public fun monitors(monitors: List<Monitor>)

    /**
     * The monitors for the environment.
     *
     * Default: - No monitors.
     *
     * @param monitors The monitors for the environment. 
     */
    public fun monitors(vararg monitors: Monitor)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Environment.Builder =
        software.amazon.awscdk.services.appconfig.Environment.Builder.create(scope, id)

    /**
     * The application to be associated with the environment.
     *
     * @param application The application to be associated with the environment. 
     */
    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication.Companion::unwrap))
    }

    /**
     * A property to prevent accidental deletion of active environments.
     *
     * Default: undefined - AppConfig default is ACCOUNT_DEFAULT
     *
     * @param deletionProtectionCheck A property to prevent accidental deletion of active
     * environments. 
     */
    override fun deletionProtectionCheck(deletionProtectionCheck: DeletionProtectionCheck) {
      cdkBuilder.deletionProtectionCheck(deletionProtectionCheck.let(DeletionProtectionCheck.Companion::unwrap))
    }

    /**
     * The description of the environment.
     *
     * Default: - No description.
     *
     * @param description The description of the environment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the environment.
     *
     * Default: - A name is generated.
     *
     * @param environmentName The name of the environment. 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * The monitors for the environment.
     *
     * Default: - No monitors.
     *
     * @param monitors The monitors for the environment. 
     */
    override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor.Companion::unwrap))
    }

    /**
     * The monitors for the environment.
     *
     * Default: - No monitors.
     *
     * @param monitors The monitors for the environment. 
     */
    override fun monitors(vararg monitors: Monitor): Unit = monitors(monitors.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.Environment = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.appconfig.Environment.PROPERTY_INJECTION_ID

    public fun fromEnvironmentArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      environmentArn: String,
    ): IEnvironment =
        software.amazon.awscdk.services.appconfig.Environment.fromEnvironmentArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, environmentArn).let(IEnvironment::wrap)

    public fun fromEnvironmentAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EnvironmentAttributes,
    ): IEnvironment =
        software.amazon.awscdk.services.appconfig.Environment.fromEnvironmentAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(EnvironmentAttributes.Companion::unwrap)).let(IEnvironment::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd908126f7f1a01009a6c6b7024c7d97a46bc780f4d581f0e786cd5e2abdccc2")
    public fun fromEnvironmentAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EnvironmentAttributes.Builder.() -> Unit,
    ): IEnvironment = fromEnvironmentAttributes(scope, id, EnvironmentAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Environment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Environment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Environment): Environment
        = Environment(cdkObject)

    internal fun unwrap(wrapped: Environment): software.amazon.awscdk.services.appconfig.Environment
        = wrapped.cdkObject as software.amazon.awscdk.services.appconfig.Environment
  }
}
