@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Query input for plugins.
 *
 * This alternate branch is necessary because it needs to be able to escape all type checking
 * we do on on the cloud assembly -- we cannot know the properties that will be used a priori.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * PluginContextQuery pluginContextQuery = PluginContextQuery.builder()
 * .pluginName("pluginName")
 * .build();
 * ```
 */
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
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.PluginContextQuery.Builder
        = software.amazon.awscdk.cloud_assembly_schema.PluginContextQuery.builder()

    /**
     * @param pluginName The name of the plugin. 
     */
    override fun pluginName(pluginName: String) {
      cdkBuilder.pluginName(pluginName)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.PluginContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.PluginContextQuery,
  ) : CdkObject(cdkObject),
      PluginContextQuery {
    /**
     * The name of the plugin.
     */
    override fun pluginName(): String = unwrap(this).getPluginName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PluginContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.PluginContextQuery):
        PluginContextQuery = CdkObjectWrappers.wrap(cdkObject) as? PluginContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PluginContextQuery):
        software.amazon.awscdk.cloud_assembly_schema.PluginContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.PluginContextQuery
  }
}
