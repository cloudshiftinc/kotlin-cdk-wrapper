@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SourcedConfigurationProps : ConfigurationProps {
  public fun location(): ConfigurationSource

  public fun retrievalRole(): IRole? = unwrap(this).getRetrievalRole()?.let(IRole::wrap)

  public fun versionNumber(): String? = unwrap(this).getVersionNumber()

  @CdkDslMarker
  public interface Builder {
    public fun application(application: IApplication)

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
        software.amazon.awscdk.services.appconfig.SourcedConfigurationProps.Builder =
        software.amazon.awscdk.services.appconfig.SourcedConfigurationProps.builder()

    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.appconfig.SourcedConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfigurationProps,
  ) : CdkObject(cdkObject), SourcedConfigurationProps {
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): SourcedConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.SourcedConfigurationProps):
        SourcedConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourcedConfigurationProps):
        software.amazon.awscdk.services.appconfig.SourcedConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.SourcedConfigurationProps
  }
}
