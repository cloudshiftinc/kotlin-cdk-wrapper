package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface NestedCloudAssemblyProperties {
  public fun directoryName(): String

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public interface Builder {
    public fun directoryName(directoryName: String) {
    }

    public fun displayName(displayName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.builder()

    public override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties,
  ) : NestedCloudAssemblyProperties {
    public override fun directoryName(): String = unwrap(this).getDirectoryName()

    public override fun displayName(): String? = unwrap(this).getDisplayName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NestedCloudAssemblyProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties):
        NestedCloudAssemblyProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NestedCloudAssemblyProperties):
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties = (wrapped as
        Wrapper).cdkObject
  }
}
