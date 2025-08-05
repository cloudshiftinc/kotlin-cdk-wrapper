@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * A configuration for markers substitution strategy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.deployment.*;
 * MarkersConfig markersConfig = MarkersConfig.builder()
 * .jsonEscape(false)
 * .build();
 * ```
 */
public interface MarkersConfig {
  /**
   * If set to `true`, the marker substitution will make ure the value inserted in the file will be
   * a valid JSON string.
   *
   * Default: - false
   */
  public fun jsonEscape(): Boolean? = unwrap(this).getJsonEscape()

  /**
   * A builder for [MarkersConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param jsonEscape If set to `true`, the marker substitution will make ure the value inserted
     * in the file will be a valid JSON string.
     */
    public fun jsonEscape(jsonEscape: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.deployment.MarkersConfig.Builder =
        software.amazon.awscdk.services.s3.deployment.MarkersConfig.builder()

    /**
     * @param jsonEscape If set to `true`, the marker substitution will make ure the value inserted
     * in the file will be a valid JSON string.
     */
    override fun jsonEscape(jsonEscape: Boolean) {
      cdkBuilder.jsonEscape(jsonEscape)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.MarkersConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.deployment.MarkersConfig,
  ) : CdkObject(cdkObject),
      MarkersConfig {
    /**
     * If set to `true`, the marker substitution will make ure the value inserted in the file will
     * be a valid JSON string.
     *
     * Default: - false
     */
    override fun jsonEscape(): Boolean? = unwrap(this).getJsonEscape()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MarkersConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.MarkersConfig):
        MarkersConfig = CdkObjectWrappers.wrap(cdkObject) as? MarkersConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MarkersConfig):
        software.amazon.awscdk.services.s3.deployment.MarkersConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.deployment.MarkersConfig
  }
}
