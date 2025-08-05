@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface FeatureFlagReportProperties {
  public fun flags(): Map<String, FeatureFlag>

  public fun module(): String

  @CdkDslMarker
  public interface Builder {
    public fun flags(flags: Map<String, FeatureFlag>)

    public fun module(module: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.FeatureFlagReportProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.FeatureFlagReportProperties.builder()

    override fun flags(flags: Map<String, FeatureFlag>) {
      cdkBuilder.flags(flags.mapValues{FeatureFlag.unwrap(it.value)})
    }

    override fun module(module: String) {
      cdkBuilder.module(module)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FeatureFlagReportProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.FeatureFlagReportProperties,
  ) : CdkObject(cdkObject),
      FeatureFlagReportProperties {
    override fun flags(): Map<String, FeatureFlag> =
        unwrap(this).getFlags().mapValues{FeatureFlag.wrap(it.value)}

    override fun module(): String = unwrap(this).getModule()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FeatureFlagReportProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FeatureFlagReportProperties):
        FeatureFlagReportProperties = CdkObjectWrappers.wrap(cdkObject) as?
        FeatureFlagReportProperties ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FeatureFlagReportProperties):
        software.amazon.awscdk.cloudassembly.schema.FeatureFlagReportProperties = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.FeatureFlagReportProperties
  }
}
