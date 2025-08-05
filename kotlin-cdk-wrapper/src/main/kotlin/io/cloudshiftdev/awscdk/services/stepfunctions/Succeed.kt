@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Succeed state in the state machine.
 *
 * Reaching a Succeed state terminates the state execution in success.
 *
 * Example:
 *
 * ```
 * Succeed success = new Succeed(this, "We did it!");
 * ```
 */
public open class Succeed(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Succeed,
) : State(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.Succeed(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SucceedProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Succeed(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(SucceedProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SucceedProps.Builder.() -> Unit,
  ) : this(scope, id, SucceedProps(props)
  )

  /**
   * Continuable states of this Chainable.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * Return the Amazon States Language object for this state.
   *
   * @param queryLanguage
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * Return the Amazon States Language object for this state.
   *
   * @param queryLanguage
   */
  public override fun toStateJson(queryLanguage: QueryLanguage): ObjectNode =
      unwrap(this).toStateJson(queryLanguage.let(QueryLanguage.Companion::unwrap))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Succeed].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     * @param outputs Used to specify and transform output from the state. 
     */
    public fun outputs(outputs: Any)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Succeed.Builder =
        software.amazon.awscdk.services.stepfunctions.Succeed.Builder.create(scope, id)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     * @param outputs Used to specify and transform output from the state. 
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Succeed = cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(scope: CloudshiftdevConstructsConstruct, id: String): Succeed =
        software.amazon.awscdk.services.stepfunctions.Succeed.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id).let(Succeed::wrap)

    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SucceedJsonPathProps,
    ): Succeed =
        software.amazon.awscdk.services.stepfunctions.Succeed.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(SucceedJsonPathProps.Companion::unwrap)).let(Succeed::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a35286065a80688584ea09dab5c71b62b36aa0c0e2da22589d8b31612cdd380d")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SucceedJsonPathProps.Builder.() -> Unit,
    ): Succeed = jsonPath(scope, id, SucceedJsonPathProps(props))

    public fun jsonata(scope: CloudshiftdevConstructsConstruct, id: String): Succeed =
        software.amazon.awscdk.services.stepfunctions.Succeed.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id).let(Succeed::wrap)

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SucceedJsonataProps,
    ): Succeed =
        software.amazon.awscdk.services.stepfunctions.Succeed.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(SucceedJsonataProps.Companion::unwrap)).let(Succeed::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("785e5101e9f48d3c6e9fa4538ffa29a8546a67e83d942bd93d347bca2261e536")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SucceedJsonataProps.Builder.() -> Unit,
    ): Succeed = jsonata(scope, id, SucceedJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Succeed {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Succeed(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Succeed): Succeed =
        Succeed(cdkObject)

    internal fun unwrap(wrapped: Succeed): software.amazon.awscdk.services.stepfunctions.Succeed =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Succeed
  }
}
