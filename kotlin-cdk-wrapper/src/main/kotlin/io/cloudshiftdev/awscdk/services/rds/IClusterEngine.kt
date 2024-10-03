@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The interface representing a database cluster (as opposed to instance) engine.
 */
public interface IClusterEngine : IEngine {
  /**
   * Method called when the engine is used to create a new cluster.
   *
   * @param scope 
   * @param options 
   */
  public fun bindToCluster(scope: Construct, options: ClusterEngineBindOptions): ClusterEngineConfig

  /**
   * Method called when the engine is used to create a new cluster.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9db4165b6dd46987c5db0e71079e9d6a87f0e537509ad2fc4a4ffa36d17032ec")
  public fun bindToCluster(scope: Construct, options: ClusterEngineBindOptions.Builder.() -> Unit):
      ClusterEngineConfig

  /**
   * Whether the IAM Roles used for data importing and exporting need to be combined for this
   * Engine, or can they be kept separate.
   *
   * Default: false
   */
  public fun combineImportAndExportRoles(): Boolean? = unwrap(this).getCombineImportAndExportRoles()

  /**
   * The application used by this engine to perform rotation for a multi-user scenario.
   */
  public fun multiUserRotationApplication(): SecretRotationApplication

  /**
   * The application used by this engine to perform rotation for a single-user scenario.
   */
  public fun singleUserRotationApplication(): SecretRotationApplication

  /**
   * The log types that are available with this engine type.
   */
  public fun supportedLogTypes(): List<String>

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.IClusterEngine,
  ) : CdkObject(cdkObject),
      IClusterEngine {
    /**
     * Method called when the engine is used to create a new cluster.
     *
     * @param scope 
     * @param options 
     */
    override fun bindToCluster(scope: Construct, options: ClusterEngineBindOptions):
        ClusterEngineConfig = unwrap(this).bindToCluster(scope.let(Construct.Companion::unwrap),
        options.let(ClusterEngineBindOptions.Companion::unwrap)).let(ClusterEngineConfig::wrap)

    /**
     * Method called when the engine is used to create a new cluster.
     *
     * @param scope 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9db4165b6dd46987c5db0e71079e9d6a87f0e537509ad2fc4a4ffa36d17032ec")
    override fun bindToCluster(scope: Construct,
        options: ClusterEngineBindOptions.Builder.() -> Unit): ClusterEngineConfig =
        bindToCluster(scope, ClusterEngineBindOptions(options))

    /**
     * Whether the IAM Roles used for data importing and exporting need to be combined for this
     * Engine, or can they be kept separate.
     *
     * Default: false
     */
    override fun combineImportAndExportRoles(): Boolean? =
        unwrap(this).getCombineImportAndExportRoles()

    /**
     * The default name of the master database user if one was not provided explicitly.
     *
     * The global default of 'admin' will be used if this is `undefined`.
     * Note that 'admin' is a reserved word in PostgreSQL and cannot be used.
     */
    override fun defaultUsername(): String? = unwrap(this).getDefaultUsername()

    /**
     * The family this engine belongs to, like "MYSQL", or "POSTGRESQL".
     *
     * This property is used when creating a Database Proxy.
     * Most engines don't belong to any family
     * (and because of that, you can't create Database Proxies for their Clusters or Instances).
     *
     * Default: - the engine doesn't belong to any family
     */
    override fun engineFamily(): String? = unwrap(this).getEngineFamily()

    /**
     * The type of the engine, for example "mysql".
     */
    override fun engineType(): String = unwrap(this).getEngineType()

    /**
     * The exact version of the engine that is used, for example "5.1.42".
     *
     * Default: - use the default version for this engine type
     */
    override fun engineVersion(): EngineVersion? =
        unwrap(this).getEngineVersion()?.let(EngineVersion::wrap)

    /**
     * The application used by this engine to perform rotation for a multi-user scenario.
     */
    override fun multiUserRotationApplication(): SecretRotationApplication =
        unwrap(this).getMultiUserRotationApplication().let(SecretRotationApplication::wrap)

    /**
     * The family to use for ParameterGroups using this engine.
     *
     * This is usually equal to "<engineType><engineMajorVersion>",
     * but can sometimes be a variation of that.
     * You can pass this property when creating new ParameterGroup.
     *
     * Default: - the ParameterGroup family is not known
     * (which means the major version of the engine is also not known)
     */
    override fun parameterGroupFamily(): String? = unwrap(this).getParameterGroupFamily()

    /**
     * The application used by this engine to perform rotation for a single-user scenario.
     */
    override fun singleUserRotationApplication(): SecretRotationApplication =
        unwrap(this).getSingleUserRotationApplication().let(SecretRotationApplication::wrap)

    /**
     * The log types that are available with this engine type.
     */
    override fun supportedLogTypes(): List<String> = unwrap(this).getSupportedLogTypes()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IClusterEngine): IClusterEngine
        = CdkObjectWrappers.wrap(cdkObject) as? IClusterEngine ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IClusterEngine): software.amazon.awscdk.services.rds.IClusterEngine
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.IClusterEngine
  }
}
