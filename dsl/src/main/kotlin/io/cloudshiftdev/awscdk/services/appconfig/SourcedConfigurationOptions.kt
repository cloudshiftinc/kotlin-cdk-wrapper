package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SourcedConfigurationOptions : ConfigurationOptions {
  public fun location(): ConfigurationSource

  public fun retrievalRole(): IRole? = unwrap(this).getRetrievalRole()?.let(IRole::wrap)

  public fun versionNumber(): String? = unwrap(this).getVersionNumber()

  public interface Builder {
    public fun deployTo(deployTo: List<IEnvironment>)

    public fun deployTo(vararg deployTo: IEnvironment)

    public fun deploymentKey(deploymentKey: IKey)

    public fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy)

    public fun description(description: String)

    public fun location(location: ConfigurationSource)

    public fun name(name: String)

    public fun retrievalRole(retrievalRole: IRole)

    public fun type(type: ConfigurationType)

    public fun validators(validators: List<IValidator>)

    public fun validators(vararg validators: IValidator)

    public fun versionNumber(versionNumber: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions.Builder =
        software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions.builder()

    override fun deployTo(deployTo: List<IEnvironment>) {
      cdkBuilder.deployTo(deployTo.map(IEnvironment::unwrap))
    }

    override fun deployTo(vararg deployTo: IEnvironment): Unit = deployTo(deployTo.toList())

    override fun deploymentKey(deploymentKey: IKey) {
      cdkBuilder.deploymentKey(deploymentKey.let(IKey::unwrap))
    }

    override fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
      cdkBuilder.deploymentStrategy(deploymentStrategy.let(IDeploymentStrategy::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun location(location: ConfigurationSource) {
      cdkBuilder.location(location.let(ConfigurationSource::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun retrievalRole(retrievalRole: IRole) {
      cdkBuilder.retrievalRole(retrievalRole.let(IRole::unwrap))
    }

    override fun type(type: ConfigurationType) {
      cdkBuilder.type(type.let(ConfigurationType::unwrap))
    }

    override fun validators(validators: List<IValidator>) {
      cdkBuilder.validators(validators.map(IValidator::unwrap))
    }

    override fun validators(vararg validators: IValidator): Unit = validators(validators.toList())

    override fun versionNumber(versionNumber: String) {
      cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions,
  ) : SourcedConfigurationOptions {
    override fun deployTo(): List<IEnvironment> =
        unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

    override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

    override fun deploymentStrategy(): IDeploymentStrategy? =
        unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun location(): ConfigurationSource =
        unwrap(this).getLocation().let(ConfigurationSource::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun retrievalRole(): IRole? = unwrap(this).getRetrievalRole()?.let(IRole::wrap)

    override fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

    override fun validators(): List<IValidator> =
        unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()

    override fun versionNumber(): String? = unwrap(this).getVersionNumber()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourcedConfigurationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions):
        SourcedConfigurationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourcedConfigurationOptions):
        software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
