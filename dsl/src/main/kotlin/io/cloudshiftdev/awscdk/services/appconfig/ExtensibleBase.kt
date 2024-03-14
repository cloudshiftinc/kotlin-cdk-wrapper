package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class ExtensibleBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.ExtensibleBase,
) : CdkObject(cdkObject), IExtensible {
  /**
   * Adds an extension association to the derived resource.
   *
   * @param extension 
   */
  public override fun addExtension(extension: IExtension) {
    unwrap(this).addExtension(extension.let(IExtension::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the derived resource.
   *
   * @param actionPoint 
   * @param eventDestination 
   * @param options
   */
  public override fun on(actionPoint: ActionPoint, eventDestination: IEventDestination) {
    unwrap(this).on(actionPoint.let(ActionPoint::unwrap),
        eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the derived resource.
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
    unwrap(this).on(actionPoint.let(ActionPoint::unwrap),
        eventDestination.let(IEventDestination::unwrap), options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to the derived resource.
   *
   * @param actionPoint 
   * @param eventDestination 
   * @param options
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
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentRolledBack(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(eventDestination,
      ExtensionOptions(options))

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit =
      preCreateHostedConfigurationVersion(eventDestination, ExtensionOptions(options))

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preStartDeployment(eventDestination: IEventDestination) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to the derived resource.
   *
   * @param eventDestination 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(eventDestination,
      ExtensionOptions(options))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ExtensibleBase):
        ExtensibleBase = ExtensibleBase(cdkObject)

    internal fun unwrap(wrapped: ExtensibleBase):
        software.amazon.awscdk.services.appconfig.ExtensibleBase = wrapped.cdkObject
  }
}
