@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Properties for Oracle Enterprise Edition (CDB) instance engines.
 *
 * Used in `DatabaseInstanceEngine.oracleEeCdb`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * OracleEngineVersion oracleEngineVersion;
 * OracleEeCdbInstanceEngineProps oracleEeCdbInstanceEngineProps =
 * OracleEeCdbInstanceEngineProps.builder()
 * .version(oracleEngineVersion)
 * .build();
 * ```
 */
public interface OracleEeCdbInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): OracleEngineVersion

  /**
   * A builder for [OracleEeCdbInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: OracleEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: OracleEngineVersion) {
      cdkBuilder.version(version.let(OracleEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps,
  ) : CdkObject(cdkObject), OracleEeCdbInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): OracleEngineVersion =
        unwrap(this).getVersion().let(OracleEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OracleEeCdbInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps):
        OracleEeCdbInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OracleEeCdbInstanceEngineProps):
        software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps
  }
}
