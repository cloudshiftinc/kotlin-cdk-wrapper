package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface PluginContextQuery {
  /**
   * The name of the plugin.
   */
  public fun pluginName(): String

  /**
   * A builder for [PluginContextQuery]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param pluginName The name of the plugin. 
     */
    public fun pluginName(pluginName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.PluginContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.PluginContextQuery.builder()

    /**
     * @param pluginName The name of the plugin. 
     */
    override fun pluginName(pluginName: String) {
      cdkBuilder.pluginName(pluginName)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.PluginContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.PluginContextQuery,
  ) : PluginContextQuery {
    /**
     * The name of the plugin.
     */
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
