@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface representing a database instance (as opposed to cluster) engine.
 */
public interface IInstanceEngine : IEngine {
  /**
   * Method called when the engine is used to create a new instance.
   *
   * @param scope 
   * @param options 
   */
  public fun bindToInstance(scope: Construct, options: InstanceEngineBindOptions):
      InstanceEngineConfig

  /**
   * Method called when the engine is used to create a new instance.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("448f711cfcc63a10acaf117d67161b9831a322dfb27d011d1dcf9ff4e8ec125f")
  public fun bindToInstance(scope: Construct,
      options: InstanceEngineBindOptions.Builder.() -> Unit): InstanceEngineConfig

  /**
   * The application used by this engine to perform rotation for a multi-user scenario.
   */
  public fun multiUserRotationApplication(): SecretRotationApplication

  /**
   * The application used by this engine to perform rotation for a single-user scenario.
   */
  public fun singleUserRotationApplication(): SecretRotationApplication

  /**
   * Whether this engine supports automatic backups of a read replica instance.
   *
   * Default: false
   */
  public fun supportsReadReplicaBackups(): Boolean? = unwrap(this).getSupportsReadReplicaBackups()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.IInstanceEngine,
  ) : CdkObject(cdkObject), IInstanceEngine {
    /**
     * Method called when the engine is used to create a new instance.
     *
     * @param scope 
     * @param options 
     */
    override fun bindToInstance(scope: Construct, options: InstanceEngineBindOptions):
        InstanceEngineConfig = unwrap(this).bindToInstance(scope.let(Construct.Companion::unwrap),
        options.let(InstanceEngineBindOptions.Companion::unwrap)).let(InstanceEngineConfig::wrap)

    /**
     * Method called when the engine is used to create a new instance.
     *
     * @param scope 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("448f711cfcc63a10acaf117d67161b9831a322dfb27d011d1dcf9ff4e8ec125f")
    override fun bindToInstance(scope: Construct,
        options: InstanceEngineBindOptions.Builder.() -> Unit): InstanceEngineConfig =
        bindToInstance(scope, InstanceEngineBindOptions(options))

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
     * Whether this engine supports automatic backups of a read replica instance.
     *
     * Default: false
     */
    override fun supportsReadReplicaBackups(): Boolean? =
        unwrap(this).getSupportsReadReplicaBackups()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IInstanceEngine):
        IInstanceEngine = CdkObjectWrappers.wrap(cdkObject) as? IInstanceEngine ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstanceEngine):
        software.amazon.awscdk.services.rds.IInstanceEngine = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IInstanceEngine
  }
}
