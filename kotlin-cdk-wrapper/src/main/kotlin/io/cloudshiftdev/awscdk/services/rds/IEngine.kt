@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IEngine {
  public fun defaultUsername(): String? = unwrap(this).getDefaultUsername()

  public fun engineFamily(): String? = unwrap(this).getEngineFamily()

  public fun engineType(): String

  public fun engineVersion(): EngineVersion? =
      unwrap(this).getEngineVersion()?.let(EngineVersion::wrap)

  public fun parameterGroupFamily(): String? = unwrap(this).getParameterGroupFamily()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.IEngine,
  ) : CdkObject(cdkObject), IEngine {
    override fun defaultUsername(): String? = unwrap(this).getDefaultUsername()

    override fun engineFamily(): String? = unwrap(this).getEngineFamily()

    override fun engineType(): String = unwrap(this).getEngineType()

    override fun engineVersion(): EngineVersion? =
        unwrap(this).getEngineVersion()?.let(EngineVersion::wrap)

    override fun parameterGroupFamily(): String? = unwrap(this).getParameterGroupFamily()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IEngine): IEngine =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEngine): software.amazon.awscdk.services.rds.IEngine = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.IEngine
  }
}
