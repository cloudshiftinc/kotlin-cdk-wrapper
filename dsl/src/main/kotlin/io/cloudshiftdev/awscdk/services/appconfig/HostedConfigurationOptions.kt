package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HostedConfigurationOptions : ConfigurationOptions {
  public fun content(): ConfigurationContent

  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public fun versionLabel(): String? = unwrap(this).getVersionLabel()

  public interface Builder {
    public fun content(content: ConfigurationContent) {
    }

    public fun deployTo(deployTo: List<IEnvironment>) {
    }

    public fun deploymentKey(deploymentKey: IKey) {
    }

    public fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
    }

    public fun description(description: String) {
    }

    public fun latestVersionNumber(latestVersionNumber: Number) {
    }

    public fun name(name: String) {
    }

    public fun type(type: ConfigurationType) {
    }

    public fun validators(validators: List<IValidator>) {
    }

    public fun versionLabel(versionLabel: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.HostedConfigurationOptions.Builder =
        software.amazon.awscdk.services.appconfig.HostedConfigurationOptions.builder()

    public override fun content(content: ConfigurationContent) {
      cdkBuilder.content(content.let(ConfigurationContent::unwrap))
    }

    public override fun deployTo(deployTo: List<IEnvironment>) {
      cdkBuilder.deployTo(deployTo.map(IEnvironment::unwrap))
    }

    public override fun deploymentKey(deploymentKey: IKey) {
      cdkBuilder.deploymentKey(deploymentKey.let(IKey::unwrap))
    }

    public override fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
      cdkBuilder.deploymentStrategy(deploymentStrategy.let(IDeploymentStrategy::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun type(type: ConfigurationType) {
      cdkBuilder.type(type.let(ConfigurationType::unwrap))
    }

    public override fun validators(validators: List<IValidator>) {
      cdkBuilder.validators(validators.map(IValidator::unwrap))
    }

    public override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.HostedConfigurationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.HostedConfigurationOptions,
  ) : HostedConfigurationOptions {
    public override fun content(): ConfigurationContent =
        unwrap(this).getContent().let(ConfigurationContent::wrap)

    public override fun deployTo(): List<IEnvironment> =
        unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

    public override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

    public override fun deploymentStrategy(): IDeploymentStrategy? =
        unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    public override fun name(): String? = unwrap(this).getName()

    public override fun type(): ConfigurationType? =
        unwrap(this).getType()?.let(ConfigurationType::wrap)

    public override fun validators(): List<IValidator> =
        unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()

    public override fun versionLabel(): String? = unwrap(this).getVersionLabel()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HostedConfigurationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.HostedConfigurationOptions):
        HostedConfigurationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedConfigurationOptions):
        software.amazon.awscdk.services.appconfig.HostedConfigurationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
