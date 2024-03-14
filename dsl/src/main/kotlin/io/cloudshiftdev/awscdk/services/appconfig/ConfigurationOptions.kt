package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ConfigurationOptions {
  public fun deployTo(): List<IEnvironment> = unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?:
      emptyList()

  public fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

  public fun deploymentStrategy(): IDeploymentStrategy? =
      unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

  public fun validators(): List<IValidator> = unwrap(this).getValidators()?.map(IValidator::wrap) ?:
      emptyList()

  public interface Builder {
    public fun deployTo(deployTo: List<IEnvironment>)

    public fun deploymentKey(deploymentKey: IKey)

    public fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy)

    public fun description(description: String)

    public fun name(name: String)

    public fun type(type: ConfigurationType)

    public fun validators(validators: List<IValidator>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ConfigurationOptions.Builder =
        software.amazon.awscdk.services.appconfig.ConfigurationOptions.builder()

    override fun deployTo(deployTo: List<IEnvironment>) {
      cdkBuilder.deployTo(deployTo.map(IEnvironment::unwrap))
    }

    override fun deploymentKey(deploymentKey: IKey) {
      cdkBuilder.deploymentKey(deploymentKey.let(IKey::unwrap))
    }

    override fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
      cdkBuilder.deploymentStrategy(deploymentStrategy.let(IDeploymentStrategy::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun type(type: ConfigurationType) {
      cdkBuilder.type(type.let(ConfigurationType::unwrap))
    }

    override fun validators(validators: List<IValidator>) {
      cdkBuilder.validators(validators.map(IValidator::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ConfigurationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationOptions,
  ) : ConfigurationOptions {
    override fun deployTo(): List<IEnvironment> =
        unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

    override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

    override fun deploymentStrategy(): IDeploymentStrategy? =
        unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

    override fun validators(): List<IValidator> =
        unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationOptions):
        ConfigurationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationOptions):
        software.amazon.awscdk.services.appconfig.ConfigurationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
