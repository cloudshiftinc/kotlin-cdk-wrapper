@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * LayerVersion.Builder.create(this, "MyLayer")
 * .removalPolicy(RemovalPolicy.RETAIN)
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .compatibleArchitectures(List.of(Architecture.X86_64, Architecture.ARM_64))
 * .build();
 * ```
 */
public interface LayerVersionProps : LayerVersionOptions {
  /**
   * The content of this Layer.
   *
   * Using `Code.fromInline` is not supported.
   */
  public fun code(): Code

  /**
   * The system architectures compatible with this layer.
   *
   * Default: [Architecture.X86_64]
   */
  public fun compatibleArchitectures(): List<Architecture> =
      unwrap(this).getCompatibleArchitectures()?.map(Architecture::wrap) ?: emptyList()

  /**
   * The runtimes compatible with this Layer.
   *
   * Default: - All runtimes are supported.
   */
  public fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  /**
   * A builder for [LayerVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code The content of this Layer. 
     * Using `Code.fromInline` is not supported.
     */
    public fun code(code: Code)

    /**
     * @param compatibleArchitectures The system architectures compatible with this layer.
     */
    public fun compatibleArchitectures(compatibleArchitectures: List<Architecture>)

    /**
     * @param compatibleArchitectures The system architectures compatible with this layer.
     */
    public fun compatibleArchitectures(vararg compatibleArchitectures: Architecture)

    /**
     * @param compatibleRuntimes The runtimes compatible with this Layer.
     */
    public fun compatibleRuntimes(compatibleRuntimes: List<Runtime>)

    /**
     * @param compatibleRuntimes The runtimes compatible with this Layer.
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime)

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
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionProps.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionProps.builder()

    /**
     * @param code The content of this Layer. 
     * Using `Code.fromInline` is not supported.
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * @param compatibleArchitectures The system architectures compatible with this layer.
     */
    override fun compatibleArchitectures(compatibleArchitectures: List<Architecture>) {
      cdkBuilder.compatibleArchitectures(compatibleArchitectures.map(Architecture::unwrap))
    }

    /**
     * @param compatibleArchitectures The system architectures compatible with this layer.
     */
    override fun compatibleArchitectures(vararg compatibleArchitectures: Architecture): Unit =
        compatibleArchitectures(compatibleArchitectures.toList())

    /**
     * @param compatibleRuntimes The runtimes compatible with this Layer.
     */
    override fun compatibleRuntimes(compatibleRuntimes: List<Runtime>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes.map(Runtime::unwrap))
    }

    /**
     * @param compatibleRuntimes The runtimes compatible with this Layer.
     */
    override fun compatibleRuntimes(vararg compatibleRuntimes: Runtime): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

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

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionProps,
  ) : CdkObject(cdkObject), LayerVersionProps {
    /**
     * The content of this Layer.
     *
     * Using `Code.fromInline` is not supported.
     */
    override fun code(): Code = unwrap(this).getCode().let(Code::wrap)

    /**
     * The system architectures compatible with this layer.
     *
     * Default: [Architecture.X86_64]
     */
    override fun compatibleArchitectures(): List<Architecture> =
        unwrap(this).getCompatibleArchitectures()?.map(Architecture::wrap) ?: emptyList()

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: - All runtimes are supported.
     */
    override fun compatibleRuntimes(): List<Runtime> =
        unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionProps):
        LayerVersionProps = CdkObjectWrappers.wrap(cdkObject) as LayerVersionProps

    internal fun unwrap(wrapped: LayerVersionProps):
        software.amazon.awscdk.services.lambda.LayerVersionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.LayerVersionProps
  }
}
