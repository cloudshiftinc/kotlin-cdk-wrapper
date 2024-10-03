@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A version of an engine - for either a cluster, or instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * EngineVersion engineVersion = EngineVersion.builder()
 * .majorVersion("majorVersion")
 * // the properties below are optional
 * .fullVersion("fullVersion")
 * .build();
 * ```
 */
public interface EngineVersion {
  /**
   * The full version string of the engine, for example, "5.6.mysql_aurora.1.22.1". It can be
   * undefined, which means RDS should use whatever version it deems appropriate for the given engine
   * type.
   *
   * Default: - no version specified
   */
  public fun fullVersion(): String? = unwrap(this).getFullVersion()

  /**
   * The major version of the engine, for example, "5.6". Used in specifying the ParameterGroup
   * family and OptionGroup version for this engine.
   */
  public fun majorVersion(): String

  /**
   * A builder for [EngineVersion]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fullVersion The full version string of the engine, for example,
     * "5.6.mysql_aurora.1.22.1". It can be undefined, which means RDS should use whatever version it
     * deems appropriate for the given engine type.
     */
    public fun fullVersion(fullVersion: String)

    /**
     * @param majorVersion The major version of the engine, for example, "5.6". Used in specifying
     * the ParameterGroup family and OptionGroup version for this engine. 
     */
    public fun majorVersion(majorVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.EngineVersion.Builder =
        software.amazon.awscdk.services.rds.EngineVersion.builder()

    /**
     * @param fullVersion The full version string of the engine, for example,
     * "5.6.mysql_aurora.1.22.1". It can be undefined, which means RDS should use whatever version it
     * deems appropriate for the given engine type.
     */
    override fun fullVersion(fullVersion: String) {
      cdkBuilder.fullVersion(fullVersion)
    }

    /**
     * @param majorVersion The major version of the engine, for example, "5.6". Used in specifying
     * the ParameterGroup family and OptionGroup version for this engine. 
     */
    override fun majorVersion(majorVersion: String) {
      cdkBuilder.majorVersion(majorVersion)
    }

    public fun build(): software.amazon.awscdk.services.rds.EngineVersion = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.EngineVersion,
  ) : CdkObject(cdkObject),
      EngineVersion {
    /**
     * The full version string of the engine, for example, "5.6.mysql_aurora.1.22.1". It can be
     * undefined, which means RDS should use whatever version it deems appropriate for the given engine
     * type.
     *
     * Default: - no version specified
     */
    override fun fullVersion(): String? = unwrap(this).getFullVersion()

    /**
     * The major version of the engine, for example, "5.6". Used in specifying the ParameterGroup
     * family and OptionGroup version for this engine.
     */
    override fun majorVersion(): String = unwrap(this).getMajorVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EngineVersion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.EngineVersion): EngineVersion =
        CdkObjectWrappers.wrap(cdkObject) as? EngineVersion ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EngineVersion): software.amazon.awscdk.services.rds.EngineVersion =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.EngineVersion
  }
}
