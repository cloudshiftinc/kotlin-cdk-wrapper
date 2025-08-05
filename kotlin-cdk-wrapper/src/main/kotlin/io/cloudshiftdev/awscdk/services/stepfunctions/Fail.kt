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
 * Define a Fail state in the state machine.
 *
 * Reaching a Fail state terminates the state execution in failure.
 *
 * Example:
 *
 * ```
 * Fail fail = Fail.Builder.create(this, "Fail")
 * .errorPath(JsonPath.format("error: {}.", JsonPath.stringAt("$.someError")))
 * .causePath("States.Format('cause: {}.', $.someCause)")
 * .build();
 * ```
 */
public open class Fail(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Fail,
) : State(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.Fail(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FailProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Fail(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FailProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FailProps.Builder.() -> Unit,
  ) : this(scope, id, FailProps(props)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Fail].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the cause of the failure.
     *
     * Default: - No description
     *
     * @param cause A description for the cause of the failure. 
     */
    public fun cause(cause: String)

    /**
     * JsonPath expression to select part of the state to be the cause to this state.
     *
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     *
     * Default: - No cause path
     *
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     * state. 
     */
    public fun causePath(causePath: String)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * Error code used to represent this failure.
     *
     * Default: - No error code
     *
     * @param error Error code used to represent this failure. 
     */
    public fun error(error: String)

    /**
     * JsonPath expression to select part of the state to be the error to this state.
     *
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     *
     * Default: - No error path
     *
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     * state. 
     */
    public fun errorPath(errorPath: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Fail.Builder =
        software.amazon.awscdk.services.stepfunctions.Fail.Builder.create(scope, id)

    /**
     * A description for the cause of the failure.
     *
     * Default: - No description
     *
     * @param cause A description for the cause of the failure. 
     */
    override fun cause(cause: String) {
      cdkBuilder.cause(cause)
    }

    /**
     * JsonPath expression to select part of the state to be the cause to this state.
     *
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     *
     * Default: - No cause path
     *
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     * state. 
     */
    override fun causePath(causePath: String) {
      cdkBuilder.causePath(causePath)
    }

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
     * Error code used to represent this failure.
     *
     * Default: - No error code
     *
     * @param error Error code used to represent this failure. 
     */
    override fun error(error: String) {
      cdkBuilder.error(error)
    }

    /**
     * JsonPath expression to select part of the state to be the error to this state.
     *
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     *
     * Default: - No error path
     *
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     * state. 
     */
    override fun errorPath(errorPath: String) {
      cdkBuilder.errorPath(errorPath)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.Fail = cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(scope: CloudshiftdevConstructsConstruct, id: String): Fail =
        software.amazon.awscdk.services.stepfunctions.Fail.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id).let(Fail::wrap)

    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: FailJsonPathProps,
    ): Fail =
        software.amazon.awscdk.services.stepfunctions.Fail.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(FailJsonPathProps.Companion::unwrap)).let(Fail::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf092d921d49fe0fdbdf85199e956ba67633d556333e83ee3b3a3928c89540b2")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: FailJsonPathProps.Builder.() -> Unit,
    ): Fail = jsonPath(scope, id, FailJsonPathProps(props))

    public fun jsonata(scope: CloudshiftdevConstructsConstruct, id: String): Fail =
        software.amazon.awscdk.services.stepfunctions.Fail.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id).let(Fail::wrap)

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: FailJsonataProps,
    ): Fail =
        software.amazon.awscdk.services.stepfunctions.Fail.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(FailJsonataProps.Companion::unwrap)).let(Fail::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c123b56c2cbe8fde4671dc00a8313cd24f68f1d60733fc04d554e14a9c086bed")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: FailJsonataProps.Builder.() -> Unit,
    ): Fail = jsonata(scope, id, FailJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Fail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Fail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Fail): Fail =
        Fail(cdkObject)

    internal fun unwrap(wrapped: Fail): software.amazon.awscdk.services.stepfunctions.Fail =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Fail
  }
}
