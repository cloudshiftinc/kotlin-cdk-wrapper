@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represent the L2 construct for the AWS::Logs::Transformer CloudFormation resource.
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
public open class Transformer(
  cdkObject: software.amazon.awscdk.services.logs.Transformer,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TransformerProps,
  ) :
      this(software.amazon.awscdk.services.logs.Transformer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TransformerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TransformerProps.Builder.() -> Unit,
  ) : this(scope, id, TransformerProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.Transformer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Existing log group that you want to associate with this transformer.
     *
     * @param logGroup Existing log group that you want to associate with this transformer. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * List of processors in a transformer.
     *
     * @param transformerConfig List of processors in a transformer. 
     */
    public fun transformerConfig(transformerConfig: List<IProcessor>)

    /**
     * List of processors in a transformer.
     *
     * @param transformerConfig List of processors in a transformer. 
     */
    public fun transformerConfig(vararg transformerConfig: IProcessor)

    /**
     * Name of the transformer.
     *
     * @param transformerName Name of the transformer. 
     */
    public fun transformerName(transformerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.Transformer.Builder =
        software.amazon.awscdk.services.logs.Transformer.Builder.create(scope, id)

    /**
     * Existing log group that you want to associate with this transformer.
     *
     * @param logGroup Existing log group that you want to associate with this transformer. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

    /**
     * List of processors in a transformer.
     *
     * @param transformerConfig List of processors in a transformer. 
     */
    override fun transformerConfig(transformerConfig: List<IProcessor>) {
      cdkBuilder.transformerConfig(transformerConfig.map(IProcessor.Companion::unwrap))
    }

    /**
     * List of processors in a transformer.
     *
     * @param transformerConfig List of processors in a transformer. 
     */
    override fun transformerConfig(vararg transformerConfig: IProcessor): Unit =
        transformerConfig(transformerConfig.toList())

    /**
     * Name of the transformer.
     *
     * @param transformerName Name of the transformer. 
     */
    override fun transformerName(transformerName: String) {
      cdkBuilder.transformerName(transformerName)
    }

    public fun build(): software.amazon.awscdk.services.logs.Transformer = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.logs.Transformer.PROPERTY_INJECTION_ID

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Transformer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Transformer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.Transformer): Transformer =
        Transformer(cdkObject)

    internal fun unwrap(wrapped: Transformer): software.amazon.awscdk.services.logs.Transformer =
        wrapped.cdkObject as software.amazon.awscdk.services.logs.Transformer
  }
}
