@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a Fail state.
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
public interface FailProps {
  /**
   * A description for the cause of the failure.
   *
   * Default: - No description
   */
  public fun cause(): String? = unwrap(this).getCause()

  /**
   * JsonPath expression to select part of the state to be the cause to this state.
   *
   * You can also use an intrinsic function that returns a string to specify this property.
   * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
   * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
   *
   * Default: - No cause path
   */
  public fun causePath(): String? = unwrap(this).getCausePath()

  /**
   * An optional description for this state.
   *
   * Default: - No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * Error code used to represent this failure.
   *
   * Default: - No error code
   */
  public fun error(): String? = unwrap(this).getError()

  /**
   * JsonPath expression to select part of the state to be the error to this state.
   *
   * You can also use an intrinsic function that returns a string to specify this property.
   * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
   * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
   *
   * Default: - No error path
   */
  public fun errorPath(): String? = unwrap(this).getErrorPath()

  /**
   * Optional name for this state.
   *
   * Default: - The construct ID will be used as state name
   */
  public fun stateName(): String? = unwrap(this).getStateName()

  /**
   * A builder for [FailProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cause A description for the cause of the failure.
     */
    public fun cause(cause: String)

    /**
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     * state.
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     */
    public fun causePath(causePath: String)

    /**
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String)

    /**
     * @param error Error code used to represent this failure.
     */
    public fun error(error: String)

    /**
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     * state.
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     */
    public fun errorPath(errorPath: String)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FailProps.Builder =
        software.amazon.awscdk.services.stepfunctions.FailProps.builder()

    /**
     * @param cause A description for the cause of the failure.
     */
    override fun cause(cause: String) {
      cdkBuilder.cause(cause)
    }

    /**
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     * state.
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     */
    override fun causePath(causePath: String) {
      cdkBuilder.causePath(causePath)
    }

    /**
     * @param comment An optional description for this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param error Error code used to represent this failure.
     */
    override fun error(error: String) {
      cdkBuilder.error(error)
    }

    /**
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     * state.
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     */
    override fun errorPath(errorPath: String) {
      cdkBuilder.errorPath(errorPath)
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.FailProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.FailProps,
  ) : CdkObject(cdkObject),
      FailProps {
    /**
     * A description for the cause of the failure.
     *
     * Default: - No description
     */
    override fun cause(): String? = unwrap(this).getCause()

    /**
     * JsonPath expression to select part of the state to be the cause to this state.
     *
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     *
     * Default: - No cause path
     */
    override fun causePath(): String? = unwrap(this).getCausePath()

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Error code used to represent this failure.
     *
     * Default: - No error code
     */
    override fun error(): String? = unwrap(this).getError()

    /**
     * JsonPath expression to select part of the state to be the error to this state.
     *
     * You can also use an intrinsic function that returns a string to specify this property.
     * The allowed functions include States.Format, States.JsonToString, States.ArrayGetItem,
     * States.Base64Encode, States.Base64Decode, States.Hash, and States.UUID.
     *
     * Default: - No error path
     */
    override fun errorPath(): String? = unwrap(this).getErrorPath()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FailProps): FailProps
        = CdkObjectWrappers.wrap(cdkObject) as? FailProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FailProps): software.amazon.awscdk.services.stepfunctions.FailProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.FailProps
  }
}
