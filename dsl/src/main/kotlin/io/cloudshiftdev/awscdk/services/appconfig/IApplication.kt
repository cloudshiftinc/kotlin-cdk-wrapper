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

public interface IApplication : IResource {
  public fun addEnvironment(arg0: String): IEnvironment

  public fun addEnvironment(arg0: String, arg1: EnvironmentOptions): IEnvironment

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c104632a3d0a4e3f999a6f63baa5b43afe61918d2af83102e45915a66f0ec0b")
  public fun addEnvironment(arg0: String, arg1: EnvironmentOptions.Builder.() -> Unit): IEnvironment

  public fun addExistingEnvironment(arg0: IEnvironment)

  public fun addExtension(arg0: IExtension)

  public fun addHostedConfiguration(arg0: String, arg1: HostedConfigurationOptions):
      HostedConfiguration

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9a4c56e358d895d1df2b4a4dfd88bd752cef6f44f4f4132eb52adb3024fc6e82")
  public fun addHostedConfiguration(arg0: String,
      arg1: HostedConfigurationOptions.Builder.() -> Unit): HostedConfiguration

  public fun addSourcedConfiguration(arg0: String, arg1: SourcedConfigurationOptions):
      SourcedConfiguration

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f164adb048ad3f7b09ca183a13b663a31673b97620c35cd63fc05114572ed704")
  public fun addSourcedConfiguration(arg0: String,
      arg1: SourcedConfigurationOptions.Builder.() -> Unit): SourcedConfiguration

  public fun applicationArn(): String

  public fun applicationId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun environments(): List<IEnvironment>

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
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IApplication,
  ) : IApplication {
    override fun addEnvironment(arg0: String): IEnvironment =
        unwrap(this).addEnvironment(arg0).let(IEnvironment::wrap)

    override fun addEnvironment(arg0: String, arg1: EnvironmentOptions): IEnvironment =
        unwrap(this).addEnvironment(arg0,
        arg1.let(EnvironmentOptions::unwrap)).let(IEnvironment::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c104632a3d0a4e3f999a6f63baa5b43afe61918d2af83102e45915a66f0ec0b")
    override fun addEnvironment(arg0: String, arg1: EnvironmentOptions.Builder.() -> Unit):
        IEnvironment = addEnvironment(arg0, EnvironmentOptions(arg1))

    override fun addExistingEnvironment(arg0: IEnvironment) {
      unwrap(this).addExistingEnvironment(arg0.let(IEnvironment::unwrap))
    }

    override fun addExtension(arg0: IExtension) {
      unwrap(this).addExtension(arg0.let(IExtension::unwrap))
    }

    override fun addHostedConfiguration(arg0: String, arg1: HostedConfigurationOptions):
        HostedConfiguration = unwrap(this).addHostedConfiguration(arg0,
        arg1.let(HostedConfigurationOptions::unwrap)).let(HostedConfiguration::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a4c56e358d895d1df2b4a4dfd88bd752cef6f44f4f4132eb52adb3024fc6e82")
    override fun addHostedConfiguration(arg0: String,
        arg1: HostedConfigurationOptions.Builder.() -> Unit): HostedConfiguration =
        addHostedConfiguration(arg0, HostedConfigurationOptions(arg1))

    override fun addSourcedConfiguration(arg0: String, arg1: SourcedConfigurationOptions):
        SourcedConfiguration = unwrap(this).addSourcedConfiguration(arg0,
        arg1.let(SourcedConfigurationOptions::unwrap)).let(SourcedConfiguration::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f164adb048ad3f7b09ca183a13b663a31673b97620c35cd63fc05114572ed704")
    override fun addSourcedConfiguration(arg0: String,
        arg1: SourcedConfigurationOptions.Builder.() -> Unit): SourcedConfiguration =
        addSourcedConfiguration(arg0, SourcedConfigurationOptions(arg1))

    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun description(): String? = unwrap(this).getDescription()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun environments(): List<IEnvironment> =
        unwrap(this).environments().map(IEnvironment::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun on(arg0: ActionPoint, arg1: IEventDestination) {
      unwrap(this).on(arg0.let(ActionPoint::unwrap), arg1.let(IEventDestination::unwrap))
    }

    override fun on(
      arg0: ActionPoint,
      arg1: IEventDestination,
      arg2: ExtensionOptions,
    ) {
      unwrap(this).on(arg0.let(ActionPoint::unwrap), arg1.let(IEventDestination::unwrap),
          arg2.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
    override fun on(
      arg0: ActionPoint,
      arg1: IEventDestination,
      arg2: ExtensionOptions.Builder.() -> Unit,
    ): Unit = on(arg0, arg1, ExtensionOptions(arg2))

    override fun onDeploymentBaking(arg0: IEventDestination) {
      unwrap(this).onDeploymentBaking(arg0.let(IEventDestination::unwrap))
    }

    override fun onDeploymentBaking(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentBaking(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
    override fun onDeploymentBaking(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(arg0,
        ExtensionOptions(arg1))

    override fun onDeploymentComplete(arg0: IEventDestination) {
      unwrap(this).onDeploymentComplete(arg0.let(IEventDestination::unwrap))
    }

    override fun onDeploymentComplete(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentComplete(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
    override fun onDeploymentComplete(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(arg0,
        ExtensionOptions(arg1))

    override fun onDeploymentRolledBack(arg0: IEventDestination) {
      unwrap(this).onDeploymentRolledBack(arg0.let(IEventDestination::unwrap))
    }

    override fun onDeploymentRolledBack(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentRolledBack(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
    override fun onDeploymentRolledBack(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentRolledBack(arg0,
        ExtensionOptions(arg1))

    override fun onDeploymentStart(arg0: IEventDestination) {
      unwrap(this).onDeploymentStart(arg0.let(IEventDestination::unwrap))
    }

    override fun onDeploymentStart(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentStart(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
    override fun onDeploymentStart(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(arg0,
        ExtensionOptions(arg1))

    override fun onDeploymentStep(arg0: IEventDestination) {
      unwrap(this).onDeploymentStep(arg0.let(IEventDestination::unwrap))
    }

    override fun onDeploymentStep(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).onDeploymentStep(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
    override fun onDeploymentStep(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(arg0,
        ExtensionOptions(arg1))

    override fun preCreateHostedConfigurationVersion(arg0: IEventDestination) {
      unwrap(this).preCreateHostedConfigurationVersion(arg0.let(IEventDestination::unwrap))
    }

    override fun preCreateHostedConfigurationVersion(arg0: IEventDestination,
        arg1: ExtensionOptions) {
      unwrap(this).preCreateHostedConfigurationVersion(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
    override fun preCreateHostedConfigurationVersion(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = preCreateHostedConfigurationVersion(arg0,
        ExtensionOptions(arg1))

    override fun preStartDeployment(arg0: IEventDestination) {
      unwrap(this).preStartDeployment(arg0.let(IEventDestination::unwrap))
    }

    override fun preStartDeployment(arg0: IEventDestination, arg1: ExtensionOptions) {
      unwrap(this).preStartDeployment(arg0.let(IEventDestination::unwrap),
          arg1.let(ExtensionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
    override fun preStartDeployment(arg0: IEventDestination,
        arg1: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(arg0,
        ExtensionOptions(arg1))

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IApplication):
        IApplication = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplication):
        software.amazon.awscdk.services.appconfig.IApplication = (wrapped as Wrapper).cdkObject
  }
}
