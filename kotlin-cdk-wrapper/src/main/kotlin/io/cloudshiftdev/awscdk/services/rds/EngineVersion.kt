@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EngineVersion {
  public fun fullVersion(): String? = unwrap(this).getFullVersion()

  public fun majorVersion(): String

  @CdkDslMarker
  public interface Builder {
    public fun fullVersion(fullVersion: String)

    public fun majorVersion(majorVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.EngineVersion.Builder =
        software.amazon.awscdk.services.rds.EngineVersion.builder()

    override fun fullVersion(fullVersion: String) {
      cdkBuilder.fullVersion(fullVersion)
    }

    override fun majorVersion(majorVersion: String) {
      cdkBuilder.majorVersion(majorVersion)
    }

    public fun build(): software.amazon.awscdk.services.rds.EngineVersion = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.EngineVersion,
  ) : CdkObject(cdkObject), EngineVersion {
    override fun fullVersion(): String? = unwrap(this).getFullVersion()

    override fun majorVersion(): String = unwrap(this).getMajorVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EngineVersion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.EngineVersion): EngineVersion =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EngineVersion): software.amazon.awscdk.services.rds.EngineVersion =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.EngineVersion
  }
}
