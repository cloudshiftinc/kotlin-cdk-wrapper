@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public interface IApplication : IResource {
  /**
   * Adds an environment.
   *
   * @param id The name of the environment construct. 
   * @param options The options for the environment construct.
   */
  public fun addEnvironment(id: String): IEnvironment

  /**
   * Adds an environment.
   *
   * @param id The name of the environment construct. 
   * @param options The options for the environment construct.
   */
  public fun addEnvironment(id: String, options: EnvironmentOptions): IEnvironment

  /**
   * Adds an environment.
   *
   * @param id The name of the environment construct. 
   * @param options The options for the environment construct.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c104632a3d0a4e3f999a6f63baa5b43afe61918d2af83102e45915a66f0ec0b")
  public fun addEnvironment(id: String, options: EnvironmentOptions.Builder.() -> Unit):
      IEnvironment

  /**
   * Adds an existing environment.
   *
   * @param environment The environment. 
   */
  public fun addExistingEnvironment(environment: IEnvironment)

  /**
   * Adds an extension association to the application.
   *
   * @param extension The extension to create an association for. 
   */
  public fun addExtension(extension: IExtension)

  /**
   * Adds a hosted configuration.
   *
   * @param id The name of the hosted configuration construct. 
   * @param options The options for the hosted configuration construct. 
   */
  public fun addHostedConfiguration(id: String, options: HostedConfigurationOptions):
      HostedConfiguration

  /**
   * Adds a hosted configuration.
   *
   * @param id The name of the hosted configuration construct. 
   * @param options The options for the hosted configuration construct. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9a4c56e358d895d1df2b4a4dfd88bd752cef6f44f4f4132eb52adb3024fc6e82")
  public fun addHostedConfiguration(id: String,
      options: HostedConfigurationOptions.Builder.() -> Unit): HostedConfiguration

  /**
   * Adds a sourced configuration.
   *
   * @param id The name of the sourced configuration construct. 
   * @param options The options for the sourced configuration construct. 
   */
  public fun addSourcedConfiguration(id: String, options: SourcedConfigurationOptions):
      SourcedConfiguration

  /**
   * Adds a sourced configuration.
   *
   * @param id The name of the sourced configuration construct. 
   * @param options The options for the sourced configuration construct. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f164adb048ad3f7b09ca183a13b663a31673b97620c35cd63fc05114572ed704")
  public fun addSourcedConfiguration(id: String,
      options: SourcedConfigurationOptions.Builder.() -> Unit): SourcedConfiguration

  /**
   * The Amazon Resource Name (ARN) of the application.
   */
  public fun applicationArn(): String

  /**
   * The ID of the application.
   */
  public fun applicationId(): String

  /**
   * The description of the application.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Returns the list of associated environments.
   */
  public fun environments(): List<IEnvironment>

  /**
   * The name of the application.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun on(actionPoint: ActionPoint, eventDestination: IEventDestination)

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions,
  )

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
  public fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions.Builder.() -> Unit,
  )

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentBaking(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentBaking(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentComplete(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentComplete(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentRolledBack(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentRolledBack(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStart(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStart(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStep(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStep(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination)

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions)

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preStartDeployment(eventDestination: IEventDestination)

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preStartDeployment(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.IApplication,
  ) : CdkObject(cdkObject), IApplication {
    /**
     * Adds an environment.
     *
     * @param id The name of the environment construct. 
     * @param options The options for the environment construct.
     */
    override fun addEnvironment(id: String): IEnvironment =
        unwrap(this).addEnvironment(id).let(IEnvironment::wrap)

    /**
     * Adds an environment.
     *
     * @param id The name of the environment construct. 
     * @param options The options for the environment construct.
     */
    override fun addEnvironment(id: String, options: EnvironmentOptions): IEnvironment =
        unwrap(this).addEnvironment(id,
        options.let(EnvironmentOptions::unwrap)).let(IEnvironment::wrap)

    /**
     * Adds an environment.
     *
     * @param id The name of the environment construct. 
     * @param options The options for the environment construct.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c104632a3d0a4e3f999a6f63baa5b43afe61918d2af83102e45915a66f0ec0b")
    override fun addEnvironment(id: String, options: EnvironmentOptions.Builder.() -> Unit):
        IEnvironment = addEnvironment(id, EnvironmentOptions(options))

    /**
     * Adds an existing environment.
     *
     * @param environment The environment. 
     */
    override fun addExistingEnvironment(environment: IEnvironment) {
      unwrap(this).addExistingEnvironment(environment.let(IEnvironment::unwrap))
    }

    /**
     * Adds an extension association to the application.
     *
     * @param extension The extension to create an association for. 
     */
    override fun addExtension(extension: IExtension) {
      unwrap(this).addExtension(extension.let(IExtension::unwrap))
    }

    /**
     * Adds a hosted configuration.
     *
     * @param id The name of the hosted configuration construct. 
     * @param options The options for the hosted configuration construct. 
     */
    override fun addHostedConfiguration(id: String, options: HostedConfigurationOptions):
        HostedConfiguration = unwrap(this).addHostedConfiguration(id,
        options.let(HostedConfigurationOptions::unwrap)).let(HostedConfiguration::wrap)

    /**
     * Adds a hosted configuration.
     *
     * @param id The name of the hosted configuration construct. 
     * @param options The options for the hosted configuration construct. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a4c56e358d895d1df2b4a4dfd88bd752cef6f44f4f4132eb52adb3024fc6e82")
    override fun addHostedConfiguration(id: String,
        options: HostedConfigurationOptions.Builder.() -> Unit): HostedConfiguration =
        addHostedConfiguration(id, HostedConfigurationOptions(options))

    /**
     * Adds a sourced configuration.
     *
     * @param id The name of the sourced configuration construct. 
     * @param options The options for the sourced configuration construct. 
     */
    override fun addSourcedConfiguration(id: String, options: SourcedConfigurationOptions):
        SourcedConfiguration = unwrap(this).addSourcedConfiguration(id,
        options.let(SourcedConfigurationOptions::unwrap)).let(SourcedConfiguration::wrap)

    /**
     * Adds a sourced configuration.
     *
     * @param id The name of the sourced configuration construct. 
     * @param options The options for the sourced configuration construct. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f164adb048ad3f7b09ca183a13b663a31673b97620c35cd63fc05114572ed704")
    override fun addSourcedConfiguration(id: String,
        options: SourcedConfigurationOptions.Builder.() -> Unit): SourcedConfiguration =
        addSourcedConfiguration(id, SourcedConfigurationOptions(options))

    /**
     * The Amazon Resource Name (ARN) of the application.
     */
    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    /**
     * The ID of the application.
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The description of the application.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Returns the list of associated environments.
     */
    override fun environments(): List<IEnvironment> =
        unwrap(this).environments().map(IEnvironment::wrap)

    /**
     * The name of the application.
     */
    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Adds an extension defined by the action point and event destination and also creates an
     * extension association to an application.
     *
     * @param actionPoint The action point which triggers the event. 
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun on(actionPoint: ActionPoint, eventDestination: IEventDestination) {
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
    override fun on(
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
    override fun on(
      actionPoint: ActionPoint,
      eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit,
    ): Unit = on(actionPoint, eventDestination, ExtensionOptions(options))

    /**
     * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates
     * an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentBaking(eventDestination: IEventDestination) {
      unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates
     * an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentBaking(eventDestination: IEventDestination,
        options: ExtensionOptions) {
      unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap),
          options.let(ExtensionOptions::unwrap))
    }

    /**
     * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates
     * an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
    override fun onDeploymentBaking(eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(eventDestination,
        ExtensionOptions(options))

    /**
     * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
     * an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentComplete(eventDestination: IEventDestination) {
      unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
     * an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentComplete(eventDestination: IEventDestination,
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
    override fun onDeploymentComplete(eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(eventDestination,
        ExtensionOptions(options))

    /**
     * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
     * creates an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentRolledBack(eventDestination: IEventDestination) {
      unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
     * creates an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentRolledBack(eventDestination: IEventDestination,
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
    override fun onDeploymentRolledBack(eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit): Unit =
        onDeploymentRolledBack(eventDestination, ExtensionOptions(options))

    /**
     * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
     * extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentStart(eventDestination: IEventDestination) {
      unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
     * extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentStart(eventDestination: IEventDestination, options: ExtensionOptions) {
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
    override fun onDeploymentStart(eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(eventDestination,
        ExtensionOptions(options))

    /**
     * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
     * extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentStep(eventDestination: IEventDestination) {
      unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
     * extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun onDeploymentStep(eventDestination: IEventDestination, options: ExtensionOptions) {
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
    override fun onDeploymentStep(eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(eventDestination,
        ExtensionOptions(options))

    /**
     * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
     * and also creates an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination) {
      unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
     * and also creates an extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
    override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit): Unit =
        preCreateHostedConfigurationVersion(eventDestination, ExtensionOptions(options))

    /**
     * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
     * extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun preStartDeployment(eventDestination: IEventDestination) {
      unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
     * extension association to an application.
     *
     * @param eventDestination The event that occurs during the extension. 
     * @param options Options for the extension.
     */
    override fun preStartDeployment(eventDestination: IEventDestination,
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
    override fun preStartDeployment(eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(eventDestination,
        ExtensionOptions(options))

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IApplication):
        IApplication = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplication):
        software.amazon.awscdk.services.appconfig.IApplication = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.IApplication
  }
}
