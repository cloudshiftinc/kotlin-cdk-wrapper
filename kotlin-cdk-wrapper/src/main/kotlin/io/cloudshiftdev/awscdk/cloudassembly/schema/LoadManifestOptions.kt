@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

public interface LoadManifestOptions {
  public fun skipEnumCheck(): Boolean? = unwrap(this).getSkipEnumCheck()

  public fun skipVersionCheck(): Boolean? = unwrap(this).getSkipVersionCheck()

  public fun topoSort(): Boolean? = unwrap(this).getTopoSort()

  @CdkDslMarker
  public interface Builder {
    public fun skipEnumCheck(skipEnumCheck: Boolean)

    public fun skipVersionCheck(skipVersionCheck: Boolean)

    public fun topoSort(topoSort: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions.Builder
        = software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions.builder()

    override fun skipEnumCheck(skipEnumCheck: Boolean) {
      cdkBuilder.skipEnumCheck(skipEnumCheck)
    }

    override fun skipVersionCheck(skipVersionCheck: Boolean) {
      cdkBuilder.skipVersionCheck(skipVersionCheck)
    }

    override fun topoSort(topoSort: Boolean) {
      cdkBuilder.topoSort(topoSort)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions,
  ) : CdkObject(cdkObject),
      LoadManifestOptions {
    override fun skipEnumCheck(): Boolean? = unwrap(this).getSkipEnumCheck()

    override fun skipVersionCheck(): Boolean? = unwrap(this).getSkipVersionCheck()

    override fun topoSort(): Boolean? = unwrap(this).getTopoSort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadManifestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions):
        LoadManifestOptions = CdkObjectWrappers.wrap(cdkObject) as? LoadManifestOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadManifestOptions):
        software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions
  }
}
