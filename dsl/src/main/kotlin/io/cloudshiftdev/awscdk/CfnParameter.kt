package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnParameter,
) : CfnElement(cdkObject) {
  /**
   * A regular expression that represents the patterns to allow for String types.
   *
   * Default: - No constraints on patterns allowed for parameter.
   */
  public open fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  /**
   * A regular expression that represents the patterns to allow for String types.
   *
   * Default: - No constraints on patterns allowed for parameter.
   */
  public open fun allowedPattern(`value`: String) {
    unwrap(this).setAllowedPattern(`value`)
  }

  /**
   * An array containing the list of values allowed for the parameter.
   *
   * Default: - No constraints on values allowed for parameter.
   */
  public open fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

  /**
   * An array containing the list of values allowed for the parameter.
   *
   * Default: - No constraints on values allowed for parameter.
   */
  public open fun allowedValues(`value`: List<String>) {
    unwrap(this).setAllowedValues(`value`)
  }

  /**
   * An array containing the list of values allowed for the parameter.
   *
   * Default: - No constraints on values allowed for parameter.
   */
  public open fun allowedValues(vararg `value`: String): Unit = allowedValues(`value`.toList())

  /**
   * A string that explains a constraint when the constraint is violated.
   *
   * For example, without a constraint description, a parameter that has an allowed
   * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
   * an invalid value:
   *
   * Default: - No description with customized error message when user specifies invalid values.
   */
  public open fun constraintDescription(): String? = unwrap(this).getConstraintDescription()

  /**
   * A string that explains a constraint when the constraint is violated.
   *
   * For example, without a constraint description, a parameter that has an allowed
   * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
   * an invalid value:
   *
   * Default: - No description with customized error message when user specifies invalid values.
   */
  public open fun constraintDescription(`value`: String) {
    unwrap(this).setConstraintDescription(`value`)
  }

  /**
   * A value of the appropriate type for the template to use if no value is specified when a stack
   * is created.
   *
   * If you define constraints for the parameter, you must specify
   * a value that adheres to those constraints.
   *
   * Default: - No default value for parameter.
   */
  public open fun defaultValue(): Any = unwrap(this).getDefaultValue()

  /**
   * A value of the appropriate type for the template to use if no value is specified when a stack
   * is created.
   *
   * If you define constraints for the parameter, you must specify
   * a value that adheres to those constraints.
   *
   * Default: - No default value for parameter.
   */
  public open fun defaultValue(`value`: Any) {
    unwrap(this).setDefaultValue(`value`)
  }

  /**
   * A string of up to 4000 characters that describes the parameter.
   *
   * Default: - No description for the parameter.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A string of up to 4000 characters that describes the parameter.
   *
   * Default: - No description for the parameter.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * An integer value that determines the largest number of characters you want to allow for String
   * types.
   *
   * Default: - None.
   */
  public open fun maxLength(): Number? = unwrap(this).getMaxLength()

  /**
   * An integer value that determines the largest number of characters you want to allow for String
   * types.
   *
   * Default: - None.
   */
  public open fun maxLength(`value`: Number) {
    unwrap(this).setMaxLength(`value`)
  }

  /**
   * A numeric value that determines the largest numeric value you want to allow for Number types.
   *
   * Default: - None.
   */
  public open fun maxValue(): Number? = unwrap(this).getMaxValue()

  /**
   * A numeric value that determines the largest numeric value you want to allow for Number types.
   *
   * Default: - None.
   */
  public open fun maxValue(`value`: Number) {
    unwrap(this).setMaxValue(`value`)
  }

  /**
   * An integer value that determines the smallest number of characters you want to allow for String
   * types.
   *
   * Default: - None.
   */
  public open fun minLength(): Number? = unwrap(this).getMinLength()

  /**
   * An integer value that determines the smallest number of characters you want to allow for String
   * types.
   *
   * Default: - None.
   */
  public open fun minLength(`value`: Number) {
    unwrap(this).setMinLength(`value`)
  }

  /**
   * A numeric value that determines the smallest numeric value you want to allow for Number types.
   *
   * Default: - None.
   */
  public open fun minValue(): Number? = unwrap(this).getMinValue()

  /**
   * A numeric value that determines the smallest numeric value you want to allow for Number types.
   *
   * Default: - None.
   */
  public open fun minValue(`value`: Number) {
    unwrap(this).setMinValue(`value`)
  }

  /**
   * Indicates if this parameter is configured with "NoEcho" enabled.
   */
  public open fun noEcho(): Boolean = unwrap(this).getNoEcho()

  /**
   * Indicates if this parameter is configured with "NoEcho" enabled.
   */
  public open fun noEcho(`value`: Boolean) {
    unwrap(this).setNoEcho(`value`)
  }

  /**
   * @param _context 
   */
  public open fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  /**
   * The data type for the parameter (DataType).
   *
   * Default: String
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The data type for the parameter (DataType).
   *
   * Default: String
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The parameter value as a Token.
   */
  public open fun `value`(): IResolvable = unwrap(this).getValue().let(IResolvable::wrap)

  /**
   * The parameter value, if it represents a string list.
   */
  public open fun valueAsList(): List<String> = unwrap(this).getValueAsList()

  /**
   * The parameter value, if it represents a number.
   */
  public open fun valueAsNumber(): Number = unwrap(this).getValueAsNumber()

  /**
   * The parameter value, if it represents a string.
   */
  public open fun valueAsString(): String = unwrap(this).getValueAsString()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnParameter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A regular expression that represents the patterns to allow for String types.
     *
     * Default: - No constraints on patterns allowed for parameter.
     *
     * @param allowedPattern A regular expression that represents the patterns to allow for String
     * types. 
     */
    public fun allowedPattern(allowedPattern: String)

    /**
     * An array containing the list of values allowed for the parameter.
     *
     * Default: - No constraints on values allowed for parameter.
     *
     * @param allowedValues An array containing the list of values allowed for the parameter. 
     */
    public fun allowedValues(allowedValues: List<String>)

    /**
     * An array containing the list of values allowed for the parameter.
     *
     * Default: - No constraints on values allowed for parameter.
     *
     * @param allowedValues An array containing the list of values allowed for the parameter. 
     */
    public fun allowedValues(vararg allowedValues: String)

    /**
     * A string that explains a constraint when the constraint is violated.
     *
     * For example, without a constraint description, a parameter that has an allowed
     * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
     * an invalid value:
     *
     * Default: - No description with customized error message when user specifies invalid values.
     *
     * @param constraintDescription A string that explains a constraint when the constraint is
     * violated. 
     */
    public fun constraintDescription(constraintDescription: String)

    /**
     * A value of the appropriate type for the template to use if no value is specified when a stack
     * is created.
     *
     * If you define constraints for the parameter, you must specify
     * a value that adheres to those constraints.
     *
     * Default: - No default value for parameter.
     *
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     * specified when a stack is created. 
     */
    public fun defaultValue(defaultValue: Any)

    /**
     * A string of up to 4000 characters that describes the parameter.
     *
     * Default: - No description for the parameter.
     *
     * @param description A string of up to 4000 characters that describes the parameter. 
     */
    public fun description(description: String)

    /**
     * An integer value that determines the largest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     *
     * @param maxLength An integer value that determines the largest number of characters you want
     * to allow for String types. 
     */
    public fun maxLength(maxLength: Number)

    /**
     * A numeric value that determines the largest numeric value you want to allow for Number types.
     *
     * Default: - None.
     *
     * @param maxValue A numeric value that determines the largest numeric value you want to allow
     * for Number types. 
     */
    public fun maxValue(maxValue: Number)

    /**
     * An integer value that determines the smallest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     *
     * @param minLength An integer value that determines the smallest number of characters you want
     * to allow for String types. 
     */
    public fun minLength(minLength: Number)

    /**
     * A numeric value that determines the smallest numeric value you want to allow for Number
     * types.
     *
     * Default: - None.
     *
     * @param minValue A numeric value that determines the smallest numeric value you want to allow
     * for Number types. 
     */
    public fun minValue(minValue: Number)

    /**
     * Whether to mask the parameter value when anyone makes a call that describes the stack.
     *
     * If you set the value to `true`, the parameter value is masked with asterisks (`*****`).
     *
     * Default: - Parameter values are not masked.
     *
     * @param noEcho Whether to mask the parameter value when anyone makes a call that describes the
     * stack. 
     */
    public fun noEcho(noEcho: Boolean)

    /**
     * The data type for the parameter (DataType).
     *
     * Default: String
     *
     * @param type The data type for the parameter (DataType). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnParameter.Builder =
        software.amazon.awscdk.CfnParameter.Builder.create(scope, id)

    /**
     * A regular expression that represents the patterns to allow for String types.
     *
     * Default: - No constraints on patterns allowed for parameter.
     *
     * @param allowedPattern A regular expression that represents the patterns to allow for String
     * types. 
     */
    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * An array containing the list of values allowed for the parameter.
     *
     * Default: - No constraints on values allowed for parameter.
     *
     * @param allowedValues An array containing the list of values allowed for the parameter. 
     */
    override fun allowedValues(allowedValues: List<String>) {
      cdkBuilder.allowedValues(allowedValues)
    }

    /**
     * An array containing the list of values allowed for the parameter.
     *
     * Default: - No constraints on values allowed for parameter.
     *
     * @param allowedValues An array containing the list of values allowed for the parameter. 
     */
    override fun allowedValues(vararg allowedValues: String): Unit =
        allowedValues(allowedValues.toList())

    /**
     * A string that explains a constraint when the constraint is violated.
     *
     * For example, without a constraint description, a parameter that has an allowed
     * pattern of [A-Za-z0-9]+ displays the following error message when the user specifies
     * an invalid value:
     *
     * Default: - No description with customized error message when user specifies invalid values.
     *
     * @param constraintDescription A string that explains a constraint when the constraint is
     * violated. 
     */
    override fun constraintDescription(constraintDescription: String) {
      cdkBuilder.constraintDescription(constraintDescription)
    }

    /**
     * A value of the appropriate type for the template to use if no value is specified when a stack
     * is created.
     *
     * If you define constraints for the parameter, you must specify
     * a value that adheres to those constraints.
     *
     * Default: - No default value for parameter.
     *
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     * specified when a stack is created. 
     */
    override fun defaultValue(defaultValue: Any) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * A string of up to 4000 characters that describes the parameter.
     *
     * Default: - No description for the parameter.
     *
     * @param description A string of up to 4000 characters that describes the parameter. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An integer value that determines the largest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     *
     * @param maxLength An integer value that determines the largest number of characters you want
     * to allow for String types. 
     */
    override fun maxLength(maxLength: Number) {
      cdkBuilder.maxLength(maxLength)
    }

    /**
     * A numeric value that determines the largest numeric value you want to allow for Number types.
     *
     * Default: - None.
     *
     * @param maxValue A numeric value that determines the largest numeric value you want to allow
     * for Number types. 
     */
    override fun maxValue(maxValue: Number) {
      cdkBuilder.maxValue(maxValue)
    }

    /**
     * An integer value that determines the smallest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     *
     * @param minLength An integer value that determines the smallest number of characters you want
     * to allow for String types. 
     */
    override fun minLength(minLength: Number) {
      cdkBuilder.minLength(minLength)
    }

    /**
     * A numeric value that determines the smallest numeric value you want to allow for Number
     * types.
     *
     * Default: - None.
     *
     * @param minValue A numeric value that determines the smallest numeric value you want to allow
     * for Number types. 
     */
    override fun minValue(minValue: Number) {
      cdkBuilder.minValue(minValue)
    }

    /**
     * Whether to mask the parameter value when anyone makes a call that describes the stack.
     *
     * If you set the value to `true`, the parameter value is masked with asterisks (`*****`).
     *
     * Default: - Parameter values are not masked.
     *
     * @param noEcho Whether to mask the parameter value when anyone makes a call that describes the
     * stack. 
     */
    override fun noEcho(noEcho: Boolean) {
      cdkBuilder.noEcho(noEcho)
    }

    /**
     * The data type for the parameter (DataType).
     *
     * Default: String
     *
     * @param type The data type for the parameter (DataType). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnParameter = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnParameter): CfnParameter =
        CfnParameter(cdkObject)

    internal fun unwrap(wrapped: CfnParameter): software.amazon.awscdk.CfnParameter =
        wrapped.cdkObject
  }
}
