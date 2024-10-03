@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for Oracle Enterprise Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.oracleEe`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * OracleEngineVersion oracleEngineVersion;
 * OracleEeInstanceEngineProps oracleEeInstanceEngineProps = OracleEeInstanceEngineProps.builder()
 * .version(oracleEngineVersion)
 * .build();
 * ```
 */
public interface OracleEeInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): OracleEngineVersion

  /**
   * A builder for [OracleEeInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: OracleEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps.Builder
        = software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: OracleEngineVersion) {
      cdkBuilder.version(version.let(OracleEngineVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps,
  ) : CdkObject(cdkObject),
      OracleEeInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): OracleEngineVersion =
        unwrap(this).getVersion().let(OracleEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OracleEeInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps):
        OracleEeInstanceEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        OracleEeInstanceEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OracleEeInstanceEngineProps):
        software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps
  }
}
