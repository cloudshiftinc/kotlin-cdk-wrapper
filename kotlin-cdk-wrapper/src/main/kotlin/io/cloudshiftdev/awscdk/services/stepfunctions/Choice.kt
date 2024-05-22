@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Choice in the state machine.
 *
 * A choice state can be used to make decisions based on the execution
 * state.
 *
 * Example:
 *
 * ```
 * Map map = Map.Builder.create(this, "Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .itemSelector(Map.of(
 * "item", JsonPath.stringAt("$.Map.Item.Value")))
 * .resultPath("$.mapOutput")
 * .build();
 * // The Map iterator can contain a IChainable, which can be an individual or multiple steps
 * chained together.
 * // Below example is with a Choice and Pass step
 * Choice choice = new Choice(this, "Choice");
 * Condition condition1 = Condition.stringEquals("$.item.status", "SUCCESS");
 * Pass step1 = new Pass(this, "Step1");
 * Pass step2 = new Pass(this, "Step2");
 * Pass finish = new Pass(this, "Finish");
 * Chain definition = choice.when(condition1, step1).otherwise(step2).afterwards().next(finish);
 * map.itemProcessor(definition);
 * ```
 */
public open class Choice(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Choice,
) : State(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.Choice(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ChoiceProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Choice(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ChoiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ChoiceProps.Builder.() -> Unit,
  ) : this(scope, id, ChoiceProps(props)
  )

  /**
   * Return a Chain that contains all reachable end states from this Choice.
   *
   * Use this to combine all possible choice paths back.
   *
   * @param options
   */
  public open fun afterwards(): Chain = unwrap(this).afterwards().let(Chain::wrap)

  /**
   * Return a Chain that contains all reachable end states from this Choice.
   *
   * Use this to combine all possible choice paths back.
   *
   * @param options
   */
  public open fun afterwards(options: AfterwardsOptions): Chain =
      unwrap(this).afterwards(options.let(AfterwardsOptions.Companion::unwrap)).let(Chain::wrap)

  /**
   * Return a Chain that contains all reachable end states from this Choice.
   *
   * Use this to combine all possible choice paths back.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9699f0c64c312dd5a726d45dae6f492949716da99d33bdd5412b1829250ebae3")
  public open fun afterwards(options: AfterwardsOptions.Builder.() -> Unit): Chain =
      afterwards(AfterwardsOptions(options))

  /**
   * Continuable states of this Chainable.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * If none of the given conditions match, continue execution with the given state.
   *
   * If no conditions match and no otherwise() has been given, an execution
   * error will be raised.
   *
   * @param def 
   */
  public open fun otherwise(def: IChainable): Choice =
      unwrap(this).otherwise(def.let(IChainable.Companion::unwrap)).let(Choice::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * If the given condition matches, continue execution with the given state.
   *
   * @param condition 
   * @param next 
   * @param options
   */
  public open fun `when`(condition: Condition, next: IChainable): Choice =
      unwrap(this).`when`(condition.let(Condition.Companion::unwrap),
      next.let(IChainable.Companion::unwrap)).let(Choice::wrap)

  /**
   * If the given condition matches, continue execution with the given state.
   *
   * @param condition 
   * @param next 
   * @param options
   */
  public open fun `when`(
    condition: Condition,
    next: IChainable,
    options: ChoiceTransitionOptions,
  ): Choice = unwrap(this).`when`(condition.let(Condition.Companion::unwrap),
      next.let(IChainable.Companion::unwrap),
      options.let(ChoiceTransitionOptions.Companion::unwrap)).let(Choice::wrap)

  /**
   * If the given condition matches, continue execution with the given state.
   *
   * @param condition 
   * @param next 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b780bf6265e81ac5f288c8abd8690e33fbec50c1de8b536e181e664673041650")
  public open fun `when`(
    condition: Condition,
    next: IChainable,
    options: ChoiceTransitionOptions.Builder.() -> Unit,
  ): Choice = `when`(condition, next, ChoiceTransitionOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Choice].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state. 
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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Choice.Builder =
        software.amazon.awscdk.services.stepfunctions.Choice.Builder.create(scope, id)

    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state. 
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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Choice = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Choice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Choice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Choice): Choice =
        Choice(cdkObject)

    internal fun unwrap(wrapped: Choice): software.amazon.awscdk.services.stepfunctions.Choice =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Choice
  }
}
