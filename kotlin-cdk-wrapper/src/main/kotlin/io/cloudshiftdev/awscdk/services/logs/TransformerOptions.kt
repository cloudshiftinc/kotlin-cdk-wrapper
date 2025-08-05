@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for Transformer created from LogGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * IProcessor processor;
 * TransformerOptions transformerOptions = TransformerOptions.builder()
 * .transformerConfig(List.of(processor))
 * .transformerName("transformerName")
 * .build();
 * ```
 */
public interface TransformerOptions {
  /**
   * List of processors in a transformer.
   */
  public fun transformerConfig(): List<IProcessor>

  /**
   * Name of the transformer.
   */
  public fun transformerName(): String

  /**
   * A builder for [TransformerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param transformerConfig List of processors in a transformer. 
     */
    public fun transformerConfig(transformerConfig: List<IProcessor>)

    /**
     * @param transformerConfig List of processors in a transformer. 
     */
    public fun transformerConfig(vararg transformerConfig: IProcessor)

    /**
     * @param transformerName Name of the transformer. 
     */
    public fun transformerName(transformerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.TransformerOptions.Builder =
        software.amazon.awscdk.services.logs.TransformerOptions.builder()

    /**
     * @param transformerConfig List of processors in a transformer. 
     */
    override fun transformerConfig(transformerConfig: List<IProcessor>) {
      cdkBuilder.transformerConfig(transformerConfig.map(IProcessor.Companion::unwrap))
    }

    /**
     * @param transformerConfig List of processors in a transformer. 
     */
    override fun transformerConfig(vararg transformerConfig: IProcessor): Unit =
        transformerConfig(transformerConfig.toList())

    /**
     * @param transformerName Name of the transformer. 
     */
    override fun transformerName(transformerName: String) {
      cdkBuilder.transformerName(transformerName)
    }

    public fun build(): software.amazon.awscdk.services.logs.TransformerOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.TransformerOptions,
  ) : CdkObject(cdkObject),
      TransformerOptions {
    /**
     * List of processors in a transformer.
     */
    override fun transformerConfig(): List<IProcessor> =
        unwrap(this).getTransformerConfig().map(IProcessor::wrap)

    /**
     * Name of the transformer.
     */
    override fun transformerName(): String = unwrap(this).getTransformerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TransformerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.TransformerOptions):
        TransformerOptions = CdkObjectWrappers.wrap(cdkObject) as? TransformerOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformerOptions):
        software.amazon.awscdk.services.logs.TransformerOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.TransformerOptions
  }
}
