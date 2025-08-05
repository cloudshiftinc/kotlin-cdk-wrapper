@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Artifact properties for a feature flag report.
 *
 * A feature flag report is small enough that all the properties can be inlined
 * here, and doesn't need an additional file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object recommendedValue;
 * Object userValue;
 * FeatureFlagReportProperties featureFlagReportProperties = FeatureFlagReportProperties.builder()
 * .flags(Map.of(
 * "flagsKey", FeatureFlag.builder()
 * .explanation("explanation")
 * .recommendedValue(recommendedValue)
 * .userValue(userValue)
 * .build()))
 * .module("module")
 * .build();
 * ```
 */
public interface FeatureFlagReportProperties {
  /**
   * Information about every feature flag supported by this library.
   */
  public fun flags(): Map<String, FeatureFlag>

  /**
   * The library that this feature flag report applies to.
   */
  public fun module(): String

  /**
   * A builder for [FeatureFlagReportProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param flags Information about every feature flag supported by this library. 
     */
    public fun flags(flags: Map<String, FeatureFlag>)

    /**
     * @param module The library that this feature flag report applies to. 
     */
    public fun module(module: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloud_assembly_schema.FeatureFlagReportProperties.Builder =
        software.amazon.awscdk.cloud_assembly_schema.FeatureFlagReportProperties.builder()

    /**
     * @param flags Information about every feature flag supported by this library. 
     */
    override fun flags(flags: Map<String, FeatureFlag>) {
      cdkBuilder.flags(flags.mapValues{FeatureFlag.unwrap(it.value)})
    }

    /**
     * @param module The library that this feature flag report applies to. 
     */
    override fun module(module: String) {
      cdkBuilder.module(module)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.FeatureFlagReportProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.FeatureFlagReportProperties,
  ) : CdkObject(cdkObject),
      FeatureFlagReportProperties {
    /**
     * Information about every feature flag supported by this library.
     */
    override fun flags(): Map<String, FeatureFlag> =
        unwrap(this).getFlags().mapValues{FeatureFlag.wrap(it.value)}

    /**
     * The library that this feature flag report applies to.
     */
    override fun module(): String = unwrap(this).getModule()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FeatureFlagReportProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.FeatureFlagReportProperties):
        FeatureFlagReportProperties = CdkObjectWrappers.wrap(cdkObject) as?
        FeatureFlagReportProperties ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FeatureFlagReportProperties):
        software.amazon.awscdk.cloud_assembly_schema.FeatureFlagReportProperties = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloud_assembly_schema.FeatureFlagReportProperties
  }
}
