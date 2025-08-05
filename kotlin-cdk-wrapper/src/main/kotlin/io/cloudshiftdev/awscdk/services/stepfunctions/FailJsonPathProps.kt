@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a Fail state that using JSONPath.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * FailJsonPathProps failJsonPathProps = FailJsonPathProps.builder()
 * .cause("cause")
 * .causePath("causePath")
 * .comment("comment")
 * .error("error")
 * .errorPath("errorPath")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .build();
 * ```
 */
public interface FailJsonPathProps : StateBaseProps {
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
   * A builder for [FailJsonPathProps]
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
     * @param comment A comment describing this state.
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
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FailJsonPathProps.Builder
        = software.amazon.awscdk.services.stepfunctions.FailJsonPathProps.builder()

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
     * @param comment A comment describing this state.
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
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.FailJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.FailJsonPathProps,
  ) : CdkObject(cdkObject),
      FailJsonPathProps {
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
     * A comment describing this state.
     *
     * Default: No comment
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
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FailJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FailJsonPathProps):
        FailJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as? FailJsonPathProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FailJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.FailJsonPathProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.FailJsonPathProps
  }
}
