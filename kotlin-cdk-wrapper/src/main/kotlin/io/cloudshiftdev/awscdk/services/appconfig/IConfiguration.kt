@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

/**
 *
 */
public interface IConfiguration : IConstruct {
  /**
   * The application associated with the configuration.
   */
  public fun application(): IApplication

  /**
   * The ID of the configuration profile.
   */
  public fun configurationProfileId(): String

  /**
   * The environments to deploy to.
   */
  public fun deployTo(): List<IEnvironment> = unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?:
      emptyList()

  /**
   * The deployment key for the configuration.
   */
  public fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

  /**
   * The deployment strategy for the configuration.
   */
  public fun deploymentStrategy(): IDeploymentStrategy? =
      unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

  /**
   * The description of the configuration.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the configuration.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The configuration type.
   */
  public fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

  /**
   * The validators for the configuration.
   */
  public fun validators(): List<IValidator> = unwrap(this).getValidators()?.map(IValidator::wrap) ?:
      emptyList()

  /**
   * The configuration version number.
   */
  public fun versionNumber(): String? = unwrap(this).getVersionNumber()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.IConfiguration,
  ) : CdkObject(cdkObject), IConfiguration {
    /**
     * The application associated with the configuration.
     */
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

    /**
     * The ID of the configuration profile.
     */
    override fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

    /**
     * The environments to deploy to.
     */
    override fun deployTo(): List<IEnvironment> =
        unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

    /**
     * The deployment key for the configuration.
     */
    override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

    /**
     * The deployment strategy for the configuration.
     */
    override fun deploymentStrategy(): IDeploymentStrategy? =
        unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

    /**
     * The description of the configuration.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the configuration.
     */
    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The configuration type.
     */
    override fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

    /**
     * The validators for the configuration.
     */
    override fun validators(): List<IValidator> =
        unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()

    /**
     * The configuration version number.
     */
    override fun versionNumber(): String? = unwrap(this).getVersionNumber()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IConfiguration):
        IConfiguration = CdkObjectWrappers.wrap(cdkObject) as? IConfiguration ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConfiguration):
        software.amazon.awscdk.services.appconfig.IConfiguration = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appconfig.IConfiguration
  }
}
