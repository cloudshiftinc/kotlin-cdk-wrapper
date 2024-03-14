package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IEngine {
  /**
   * The default name of the master database user if one was not provided explicitly.
   *
   * The global default of 'admin' will be used if this is `undefined`.
   * Note that 'admin' is a reserved word in PostgreSQL and cannot be used.
   */
  public fun defaultUsername(): String? = unwrap(this).getDefaultUsername()

  /**
   * The family this engine belongs to, like "MYSQL", or "POSTGRESQL".
   *
   * This property is used when creating a Database Proxy.
   * Most engines don't belong to any family
   * (and because of that, you can't create Database Proxies for their Clusters or Instances).
   *
   * Default: - the engine doesn't belong to any family
   */
  public fun engineFamily(): String? = unwrap(this).getEngineFamily()

  /**
   * The type of the engine, for example "mysql".
   */
  public fun engineType(): String

  /**
   * The exact version of the engine that is used, for example "5.1.42".
   *
   * Default: - use the default version for this engine type
   */
  public fun engineVersion(): EngineVersion? =
      unwrap(this).getEngineVersion()?.let(EngineVersion::wrap)

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
  public fun parameterGroupFamily(): String? = unwrap(this).getParameterGroupFamily()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.IEngine,
  ) : CdkObject(cdkObject), IEngine {
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
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IEngine): IEngine =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEngine): software.amazon.awscdk.services.rds.IEngine = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.IEngine
  }
}
