package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IConfiguration : IConstruct {
  public fun application(): IApplication

  public fun configurationProfileId(): String

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

  public fun versionNumber(): String? = unwrap(this).getVersionNumber()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IConfiguration,
  ) : IConfiguration {
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

    override fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

    override fun deployTo(): List<IEnvironment> =
        unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

    override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

    override fun deploymentStrategy(): IDeploymentStrategy? =
        unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

    override fun validators(): List<IValidator> =
        unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()

    override fun versionNumber(): String? = unwrap(this).getVersionNumber()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IConfiguration):
        IConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConfiguration):
        software.amazon.awscdk.services.appconfig.IConfiguration = (wrapped as Wrapper).cdkObject
  }
}
