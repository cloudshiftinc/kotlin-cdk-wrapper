package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IEnvironment : IResource {
  public fun addExtension(arg0: IExtension)

  public fun application(): IApplication? = unwrap(this).getApplication()?.let(IApplication::wrap)

  public fun applicationId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentArn(): String

  public fun environmentId(): String

  public fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  public fun name(): String? = unwrap(this).getName()

  public fun on(arg0: ActionPoint, arg1: IEventDestination)

  public fun on(
    arg0: ActionPoint,
    arg1: IEventDestination,
    arg2: ExtensionOptions,
  )

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
  public fun on(
    arg0: ActionPoint,
    arg1: IEventDestination,
    arg2: ExtensionOptions.Builder.() -> Unit,
  )

  public fun onDeploymentBaking(arg0: IEventDestination)

  public fun onDeploymentBaking(arg0: IEventDestination, arg1: ExtensionOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public fun onDeploymentBaking(arg0: IEventDestination, arg1: ExtensionOptions.Builder.() -> Unit)

  public fun onDeploymentComplete(arg0: IEventDestination)

  public fun onDeploymentComplete(arg0: IEventDestination, arg1: ExtensionOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public fun onDeploymentComplete(arg0: IEventDestination,
      arg1: ExtensionOptions.Builder.() -> Unit)

  public fun onDeploymentRolledBack(arg0: IEventDestination)

  public fun onDeploymentRolledBack(arg0: IEventDestination, arg1: ExtensionOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public fun onDeploymentRolledBack(arg0: IEventDestination,
      arg1: ExtensionOptions.Builder.() -> Unit)

  public fun onDeploymentStart(arg0: IEventDestination)

  public fun onDeploymentStart(arg0: IEventDestination, arg1: ExtensionOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public fun onDeploymentStart(arg0: IEventDestination, arg1: ExtensionOptions.Builder.() -> Unit)

  public fun onDeploymentStep(arg0: IEventDestination)

  public fun onDeploymentStep(arg0: IEventDestination, arg1: ExtensionOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public fun onDeploymentStep(arg0: IEventDestination, arg1: ExtensionOptions.Builder.() -> Unit)

  public fun preCreateHostedConfigurationVersion(arg0: IEventDestination)

  public fun preCreateHostedConfigurationVersion(arg0: IEventDestination, arg1: ExtensionOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public fun preCreateHostedConfigurationVersion(arg0: IEventDestination,
      arg1: ExtensionOptions.Builder.() -> Unit)

  public fun preStartDeployment(arg0: IEventDestination)

  public fun preStartDeployment(arg0: IEventDestination, arg1: ExtensionOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public fun preStartDeployment(arg0: IEventDestination, arg1: ExtensionOptions.Builder.() -> Unit)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IEnvironment,
  ) : IEnvironment {
    public override fun addExtension(arg0: IExtension) {
      unwrap(this).addExtension(arg0.let(IExtension::unwrap))
    }

    public override fun application(): IApplication? =
        unwrap(this).getApplication()?.let(IApplication::wrap)

    public override fun applicationId(): String = unwrap(this).getApplicationId()

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun environmentArn(): String = unwrap(this).getEnvironmentArn()

    public override fun environmentId(): String = unwrap(this).getEnvironmentId()

    public override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap)
        ?: emptyList()

    public override fun name(): String? = unwrap(this).getName()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun on(arg0: ActionPoint, arg1: IEventDestination) {
      unwrap(this).on(arg0.let(ActionPoint::unwrap), arg1.let(IEventDestination::unwrap))
    }

    public override fun on(
      arg0: ActionPoint,
      arg1: IEventDestination,
      arg2: ExtensionOptions,
    ) {
      unwrap(this).on(arg0.let(ActionPoint::unwrap), arg1.let(IEventDestination::unwrap),
          arg2.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
    public override fun on(
      arg0: ActionPoint,
      arg1: IEventDestination,
      arg2: ExtensionOptions.Builder.() -> Unit,
    ): Unit = on(arg0, arg1, ExtensionOptions(arg2))

    public override fun onDeploymentBaking(arg0: IEventDestination) {
      unwrap(this).onDeploymentBaking(arg0.let(IEventDestination::unwrap))
    }

    public override fun onDeploymentBaking(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentBaking(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
    public override fun onDeploymentBaking(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(arg0,
        ExtensionOptions(arg1))

    public override fun onDeploymentComplete(arg0: IEventDestination) {
      unwrap(this).onDeploymentComplete(arg0.let(IEventDestination::unwrap))
    }

    public override fun onDeploymentComplete(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentComplete(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
    public override fun onDeploymentComplete(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(arg0,
        ExtensionOptions(arg1))

    public override fun onDeploymentRolledBack(arg0: IEventDestination) {
      unwrap(this).onDeploymentRolledBack(arg0.let(IEventDestination::unwrap))
    }

    public override fun onDeploymentRolledBack(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentRolledBack(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
    public override fun onDeploymentRolledBack(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentRolledBack(arg0,
        ExtensionOptions(arg1))

    public override fun onDeploymentStart(arg0: IEventDestination) {
      unwrap(this).onDeploymentStart(arg0.let(IEventDestination::unwrap))
    }

    public override fun onDeploymentStart(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentStart(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
    public override fun onDeploymentStart(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(arg0,
        ExtensionOptions(arg1))

    public override fun onDeploymentStep(arg0: IEventDestination) {
      unwrap(this).onDeploymentStep(arg0.let(IEventDestination::unwrap))
    }

    public override fun onDeploymentStep(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentStep(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
    public override fun onDeploymentStep(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(arg0,
        ExtensionOptions(arg1))

    public override fun preCreateHostedConfigurationVersion(arg0: IEventDestination) {
      unwrap(this).preCreateHostedConfigurationVersion(arg0.let(IEventDestination::unwrap))
    }

    public override fun preCreateHostedConfigurationVersion(arg0: IEventDestination,
        arg1: ExtensionOptions) {
      unwrap(this).preCreateHostedConfigurationVersion(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
    public override fun preCreateHostedConfigurationVersion(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = preCreateHostedConfigurationVersion(arg0,
        ExtensionOptions(arg1))

    public override fun preStartDeployment(arg0: IEventDestination) {
      unwrap(this).preStartDeployment(arg0.let(IEventDestination::unwrap))
    }

    public override fun preStartDeployment(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).preStartDeployment(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
    public override fun preStartDeployment(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(arg0,
        ExtensionOptions(arg1))

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IEnvironment):
        IEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEnvironment):
        software.amazon.awscdk.services.appconfig.IEnvironment = (wrapped as Wrapper).cdkObject
  }
}
