@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Non runtime options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * LayerVersionOptions layerVersionOptions = LayerVersionOptions.builder()
 * .description("description")
 * .layerVersionName("layerVersionName")
 * .license("license")
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
public interface LayerVersionOptions {
  /**
   * The description the this Lambda Layer.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the layer.
   *
   * Default: - A name will be generated.
   */
  public fun layerVersionName(): String? = unwrap(this).getLayerVersionName()

  /**
   * The SPDX licence identifier or URL to the license file for this layer.
   *
   * Default: - No license information will be recorded.
   */
  public fun license(): String? = unwrap(this).getLicense()

  /**
   * Whether to retain this version of the layer when a new version is added or when the stack is
   * deleted.
   *
   * Default: RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [LayerVersionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description the this Lambda Layer.
     */
    public fun description(description: String)

    /**
     * @param layerVersionName The name of the layer.
     */
    public fun layerVersionName(layerVersionName: String)

    /**
     * @param license The SPDX licence identifier or URL to the license file for this layer.
     */
    public fun license(license: String)

    /**
     * @param removalPolicy Whether to retain this version of the layer when a new version is added
     * or when the stack is deleted.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionOptions.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionOptions.builder()

    /**
     * @param description The description the this Lambda Layer.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param layerVersionName The name of the layer.
     */
    override fun layerVersionName(layerVersionName: String) {
      cdkBuilder.layerVersionName(layerVersionName)
    }

    /**
     * @param license The SPDX licence identifier or URL to the license file for this layer.
     */
    override fun license(license: String) {
      cdkBuilder.license(license)
    }

    /**
     * @param removalPolicy Whether to retain this version of the layer when a new version is added
     * or when the stack is deleted.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionOptions,
  ) : CdkObject(cdkObject), LayerVersionOptions {
    /**
     * The description the this Lambda Layer.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the layer.
     *
     * Default: - A name will be generated.
     */
    override fun layerVersionName(): String? = unwrap(this).getLayerVersionName()

    /**
     * The SPDX licence identifier or URL to the license file for this layer.
     *
     * Default: - No license information will be recorded.
     */
    override fun license(): String? = unwrap(this).getLicense()

    /**
     * Whether to retain this version of the layer when a new version is added or when the stack is
     * deleted.
     *
     * Default: RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionOptions):
        LayerVersionOptions = CdkObjectWrappers.wrap(cdkObject) as LayerVersionOptions

    internal fun unwrap(wrapped: LayerVersionOptions):
        software.amazon.awscdk.services.lambda.LayerVersionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LayerVersionOptions
  }
}
