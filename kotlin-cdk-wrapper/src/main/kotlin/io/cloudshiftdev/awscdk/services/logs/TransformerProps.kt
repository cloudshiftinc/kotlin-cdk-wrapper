@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The Resource properties for AWS::Logs::Transformer resource.
 *
 * This
 * interface defines all configuration options for the CfnTransformer construct.
 *
 * Example:
 *
 * ```
 * // Create a log group
 * LogGroup logGroup = new LogGroup(this, "MyLogGroup");
 * // Create a JSON parser processor
 * ParserProcessor jsonParser = ParserProcessor.Builder.create()
 * .type(ParserProcessorType.JSON)
 * .build();
 * // Create a processor to add keys
 * JsonMutatorProcessor addKeysProcessor = JsonMutatorProcessor.Builder.create()
 * .type(JsonMutatorType.ADD_KEYS)
 * .addKeysOptions(AddKeysProperty.builder()
 * .entries(List.of(AddKeyEntryProperty.builder()
 * .key("metadata.transformed_in")
 * .value("CloudWatchLogs")
 * .build()))
 * .build())
 * .build();
 * // Create a transformer with these processors
 * // Create a transformer with these processors
 * Transformer.Builder.create(this, "Transformer")
 * .transformerName("MyTransformer")
 * .logGroup(logGroup)
 * .transformerConfig(List.of(jsonParser, addKeysProcessor))
 * .build();
 * ```
 */
public interface TransformerProps {
  /**
   * Existing log group that you want to associate with this transformer.
   */
  public fun logGroup(): ILogGroup

  /**
   * List of processors in a transformer.
   */
  public fun transformerConfig(): List<IProcessor>

  /**
   * Name of the transformer.
   */
  public fun transformerName(): String

  /**
   * A builder for [TransformerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logGroup Existing log group that you want to associate with this transformer. 
     */
    public fun logGroup(logGroup: ILogGroup)

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
    private val cdkBuilder: software.amazon.awscdk.services.logs.TransformerProps.Builder =
        software.amazon.awscdk.services.logs.TransformerProps.builder()

    /**
     * @param logGroup Existing log group that you want to associate with this transformer. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.logs.TransformerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.TransformerProps,
  ) : CdkObject(cdkObject),
      TransformerProps {
    /**
     * Existing log group that you want to associate with this transformer.
     */
    override fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): TransformerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.TransformerProps):
        TransformerProps = CdkObjectWrappers.wrap(cdkObject) as? TransformerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformerProps):
        software.amazon.awscdk.services.logs.TransformerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.TransformerProps
  }
}
