@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

public interface NestedCloudAssemblyProperties {
  public fun directoryName(): String

  public fun displayName(): String? = unwrap(this).getDisplayName()

  @CdkDslMarker
  public interface Builder {
    public fun directoryName(directoryName: String)

    public fun displayName(displayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.builder()

    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties,
  ) : CdkObject(cdkObject),
      NestedCloudAssemblyProperties {
    override fun directoryName(): String = unwrap(this).getDirectoryName()

    override fun displayName(): String? = unwrap(this).getDisplayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NestedCloudAssemblyProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties):
        NestedCloudAssemblyProperties = CdkObjectWrappers.wrap(cdkObject) as?
        NestedCloudAssemblyProperties ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NestedCloudAssemblyProperties):
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
  }
}
