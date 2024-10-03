@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

public interface PluginContextQuery {
  public fun pluginName(): String

  @CdkDslMarker
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.PluginContextQuery,
  ) : CdkObject(cdkObject),
      PluginContextQuery {
    override fun pluginName(): String = unwrap(this).getPluginName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PluginContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.PluginContextQuery):
        PluginContextQuery = CdkObjectWrappers.wrap(cdkObject) as? PluginContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PluginContextQuery):
        software.amazon.awscdk.cloudassembly.schema.PluginContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.PluginContextQuery
  }
}
