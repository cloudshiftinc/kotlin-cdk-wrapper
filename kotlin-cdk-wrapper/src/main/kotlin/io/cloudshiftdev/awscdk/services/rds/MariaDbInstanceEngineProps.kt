@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for MariaDB instance engines.
 *
 * Used in `DatabaseInstanceEngine.mariaDb`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * MariaDbEngineVersion mariaDbEngineVersion;
 * MariaDbInstanceEngineProps mariaDbInstanceEngineProps = MariaDbInstanceEngineProps.builder()
 * .version(mariaDbEngineVersion)
 * .build();
 * ```
 */
public interface MariaDbInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): MariaDbEngineVersion

  /**
   * A builder for [MariaDbInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: MariaDbEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: MariaDbEngineVersion) {
      cdkBuilder.version(version.let(MariaDbEngineVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps,
  ) : CdkObject(cdkObject), MariaDbInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): MariaDbEngineVersion =
        unwrap(this).getVersion().let(MariaDbEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MariaDbInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps):
        MariaDbInstanceEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        MariaDbInstanceEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MariaDbInstanceEngineProps):
        software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps
  }
}
