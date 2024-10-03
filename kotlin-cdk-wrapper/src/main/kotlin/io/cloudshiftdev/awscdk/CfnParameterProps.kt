@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * CfnParameter.Builder.create(this, "MyParameter")
 * .type("Number")
 * .default(1337)
 * .build();
 * ```
 */
public interface CfnParameterProps {
  /**
   * A regular expression that represents the patterns to allow for String types.
   *
   * Default: - No constraints on patterns allowed for parameter.
   */
  public fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  /**
   * An array containing the list of values allowed for the parameter.
   *
   * Default: - No constraints on values allowed for parameter.
   */
  public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

  /**
   * A string that explains a constraint when the constraint is violated.
   *
   * For example, without a constraint description, a parameter that has an allowed
   * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
   * an invalid value:
   *
   * Default: - No description with customized error message when user specifies invalid values.
   */
  public fun constraintDescription(): String? = unwrap(this).getConstraintDescription()

  /**
   * A value of the appropriate type for the template to use if no value is specified when a stack
   * is created.
   *
   * If you define constraints for the parameter, you must specify
   * a value that adheres to those constraints.
   *
   * Default: - No default value for parameter.
   */
  public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  /**
   * A string of up to 4000 characters that describes the parameter.
   *
   * Default: - No description for the parameter.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An integer value that determines the largest number of characters you want to allow for String
   * types.
   *
   * Default: - None.
   */
  public fun maxLength(): Number? = unwrap(this).getMaxLength()

  /**
   * A numeric value that determines the largest numeric value you want to allow for Number types.
   *
   * Default: - None.
   */
  public fun maxValue(): Number? = unwrap(this).getMaxValue()

  /**
   * An integer value that determines the smallest number of characters you want to allow for String
   * types.
   *
   * Default: - None.
   */
  public fun minLength(): Number? = unwrap(this).getMinLength()

  /**
   * A numeric value that determines the smallest numeric value you want to allow for Number types.
   *
   * Default: - None.
   */
  public fun minValue(): Number? = unwrap(this).getMinValue()

  /**
   * Whether to mask the parameter value when anyone makes a call that describes the stack.
   *
   * If you set the value to `true`, the parameter value is masked with asterisks (`*****`).
   *
   * Default: - Parameter values are not masked.
   */
  public fun noEcho(): Boolean? = unwrap(this).getNoEcho()

  /**
   * The data type for the parameter (DataType).
   *
   * Default: String
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnParameterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedPattern A regular expression that represents the patterns to allow for String
     * types.
     */
    public fun allowedPattern(allowedPattern: String)

    /**
     * @param allowedValues An array containing the list of values allowed for the parameter.
     */
    public fun allowedValues(allowedValues: List<String>)

    /**
     * @param allowedValues An array containing the list of values allowed for the parameter.
     */
    public fun allowedValues(vararg allowedValues: String)

    /**
     * @param constraintDescription A string that explains a constraint when the constraint is
     * violated.
     * For example, without a constraint description, a parameter that has an allowed
     * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
     * an invalid value:
     */
    public fun constraintDescription(constraintDescription: String)

    /**
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     * specified when a stack is created.
     * If you define constraints for the parameter, you must specify
     * a value that adheres to those constraints.
     */
    public fun defaultValue(defaultValue: Any)

    /**
     * @param description A string of up to 4000 characters that describes the parameter.
     */
    public fun description(description: String)

    /**
     * @param maxLength An integer value that determines the largest number of characters you want
     * to allow for String types.
     */
    public fun maxLength(maxLength: Number)

    /**
     * @param maxValue A numeric value that determines the largest numeric value you want to allow
     * for Number types.
     */
    public fun maxValue(maxValue: Number)

    /**
     * @param minLength An integer value that determines the smallest number of characters you want
     * to allow for String types.
     */
    public fun minLength(minLength: Number)

    /**
     * @param minValue A numeric value that determines the smallest numeric value you want to allow
     * for Number types.
     */
    public fun minValue(minValue: Number)

    /**
     * @param noEcho Whether to mask the parameter value when anyone makes a call that describes the
     * stack.
     * If you set the value to `true`, the parameter value is masked with asterisks (`*****`).
     */
    public fun noEcho(noEcho: Boolean)

    /**
     * @param type The data type for the parameter (DataType).
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnParameterProps.Builder =
        software.amazon.awscdk.CfnParameterProps.builder()

    /**
     * @param allowedPattern A regular expression that represents the patterns to allow for String
     * types.
     */
    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * @param allowedValues An array containing the list of values allowed for the parameter.
     */
    override fun allowedValues(allowedValues: List<String>) {
      cdkBuilder.allowedValues(allowedValues)
    }

    /**
     * @param allowedValues An array containing the list of values allowed for the parameter.
     */
    override fun allowedValues(vararg allowedValues: String): Unit =
        allowedValues(allowedValues.toList())

    /**
     * @param constraintDescription A string that explains a constraint when the constraint is
     * violated.
     * For example, without a constraint description, a parameter that has an allowed
     * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
     * an invalid value:
     */
    override fun constraintDescription(constraintDescription: String) {
      cdkBuilder.constraintDescription(constraintDescription)
    }

    /**
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     * specified when a stack is created.
     * If you define constraints for the parameter, you must specify
     * a value that adheres to those constraints.
     */
    override fun defaultValue(defaultValue: Any) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param description A string of up to 4000 characters that describes the parameter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param maxLength An integer value that determines the largest number of characters you want
     * to allow for String types.
     */
    override fun maxLength(maxLength: Number) {
      cdkBuilder.maxLength(maxLength)
    }

    /**
     * @param maxValue A numeric value that determines the largest numeric value you want to allow
     * for Number types.
     */
    override fun maxValue(maxValue: Number) {
      cdkBuilder.maxValue(maxValue)
    }

    /**
     * @param minLength An integer value that determines the smallest number of characters you want
     * to allow for String types.
     */
    override fun minLength(minLength: Number) {
      cdkBuilder.minLength(minLength)
    }

    /**
     * @param minValue A numeric value that determines the smallest numeric value you want to allow
     * for Number types.
     */
    override fun minValue(minValue: Number) {
      cdkBuilder.minValue(minValue)
    }

    /**
     * @param noEcho Whether to mask the parameter value when anyone makes a call that describes the
     * stack.
     * If you set the value to `true`, the parameter value is masked with asterisks (`*****`).
     */
    override fun noEcho(noEcho: Boolean) {
      cdkBuilder.noEcho(noEcho)
    }

    /**
     * @param type The data type for the parameter (DataType).
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnParameterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnParameterProps,
  ) : CdkObject(cdkObject),
      CfnParameterProps {
    /**
     * A regular expression that represents the patterns to allow for String types.
     *
     * Default: - No constraints on patterns allowed for parameter.
     */
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    /**
     * An array containing the list of values allowed for the parameter.
     *
     * Default: - No constraints on values allowed for parameter.
     */
    override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    /**
     * A string that explains a constraint when the constraint is violated.
     *
     * For example, without a constraint description, a parameter that has an allowed
     * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
     * an invalid value:
     *
     * Default: - No description with customized error message when user specifies invalid values.
     */
    override fun constraintDescription(): String? = unwrap(this).getConstraintDescription()

    /**
     * A value of the appropriate type for the template to use if no value is specified when a stack
     * is created.
     *
     * If you define constraints for the parameter, you must specify
     * a value that adheres to those constraints.
     *
     * Default: - No default value for parameter.
     */
    override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    /**
     * A string of up to 4000 characters that describes the parameter.
     *
     * Default: - No description for the parameter.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An integer value that determines the largest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     */
    override fun maxLength(): Number? = unwrap(this).getMaxLength()

    /**
     * A numeric value that determines the largest numeric value you want to allow for Number types.
     *
     * Default: - None.
     */
    override fun maxValue(): Number? = unwrap(this).getMaxValue()

    /**
     * An integer value that determines the smallest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     */
    override fun minLength(): Number? = unwrap(this).getMinLength()

    /**
     * A numeric value that determines the smallest numeric value you want to allow for Number
     * types.
     *
     * Default: - None.
     */
    override fun minValue(): Number? = unwrap(this).getMinValue()

    /**
     * Whether to mask the parameter value when anyone makes a call that describes the stack.
     *
     * If you set the value to `true`, the parameter value is masked with asterisks (`*****`).
     *
     * Default: - Parameter values are not masked.
     */
    override fun noEcho(): Boolean? = unwrap(this).getNoEcho()

    /**
     * The data type for the parameter (DataType).
     *
     * Default: String
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnParameterProps): CfnParameterProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnParameterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterProps): software.amazon.awscdk.CfnParameterProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnParameterProps
  }
}
