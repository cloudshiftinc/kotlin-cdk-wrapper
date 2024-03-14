package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Fail internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Fail,
) : State(cdkObject) {
  /**
   * Continuable states of this Chainable.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

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
     * Default: - No cause path
     *
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     * state. 
     */
    public fun causePath(causePath: String)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
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
     * Default: - No error path
     *
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     * state. 
     */
    public fun errorPath(errorPath: String)

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
     * Default: - No cause path
     *
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     * state. 
     */
    override fun causePath(causePath: String) {
      cdkBuilder.causePath(causePath)
    }

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
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
     * Default: - No error path
     *
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     * state. 
     */
    override fun errorPath(errorPath: String) {
      cdkBuilder.errorPath(errorPath)
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
    init {

    }

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
        wrapped.cdkObject
  }
}
