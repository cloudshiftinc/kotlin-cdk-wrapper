package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface PluginContextQuery {
  public fun pluginName(): String

  public interface Builder {
    public fun pluginName(pluginName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.PluginContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.PluginContextQuery.builder()

    override fun pluginName(pluginName: String) {
      cdkBuilder.pluginName(pluginName)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.PluginContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.PluginContextQuery,
  ) : PluginContextQuery {
    override fun pluginName(): String = unwrap(this).getPluginName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PluginContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.PluginContextQuery):
        PluginContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PluginContextQuery):
        software.amazon.awscdk.cloudassembly.schema.PluginContextQuery = (wrapped as
        Wrapper).cdkObject
  }
}
