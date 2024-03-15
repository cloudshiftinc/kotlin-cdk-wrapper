@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnParameterProps {
  public fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

  public fun constraintDescription(): String? = unwrap(this).getConstraintDescription()

  public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  public fun description(): String? = unwrap(this).getDescription()

  public fun maxLength(): Number? = unwrap(this).getMaxLength()

  public fun maxValue(): Number? = unwrap(this).getMaxValue()

  public fun minLength(): Number? = unwrap(this).getMinLength()

  public fun minValue(): Number? = unwrap(this).getMinValue()

  public fun noEcho(): Boolean? = unwrap(this).getNoEcho()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun allowedPattern(allowedPattern: String)

    public fun allowedValues(allowedValues: List<String>)

    public fun allowedValues(vararg allowedValues: String)

    public fun constraintDescription(constraintDescription: String)

    public fun defaultValue(defaultValue: Any)

    public fun description(description: String)

    public fun maxLength(maxLength: Number)

    public fun maxValue(maxValue: Number)

    public fun minLength(minLength: Number)

    public fun minValue(minValue: Number)

    public fun noEcho(noEcho: Boolean)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnParameterProps.Builder =
        software.amazon.awscdk.CfnParameterProps.builder()

    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    override fun allowedValues(allowedValues: List<String>) {
      cdkBuilder.allowedValues(allowedValues)
    }

    override fun allowedValues(vararg allowedValues: String): Unit =
        allowedValues(allowedValues.toList())

    override fun constraintDescription(constraintDescription: String) {
      cdkBuilder.constraintDescription(constraintDescription)
    }

    override fun defaultValue(defaultValue: Any) {
      cdkBuilder.defaultValue(defaultValue)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun maxLength(maxLength: Number) {
      cdkBuilder.maxLength(maxLength)
    }

    override fun maxValue(maxValue: Number) {
      cdkBuilder.maxValue(maxValue)
    }

    override fun minLength(minLength: Number) {
      cdkBuilder.minLength(minLength)
    }

    override fun minValue(minValue: Number) {
      cdkBuilder.minValue(minValue)
    }

    override fun noEcho(noEcho: Boolean) {
      cdkBuilder.noEcho(noEcho)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnParameterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnParameterProps,
  ) : CdkObject(cdkObject), CfnParameterProps {
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    override fun constraintDescription(): String? = unwrap(this).getConstraintDescription()

    override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    override fun description(): String? = unwrap(this).getDescription()

    override fun maxLength(): Number? = unwrap(this).getMaxLength()

    override fun maxValue(): Number? = unwrap(this).getMaxValue()

    override fun minLength(): Number? = unwrap(this).getMinLength()

    override fun minValue(): Number? = unwrap(this).getMinValue()

    override fun noEcho(): Boolean? = unwrap(this).getNoEcho()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnParameterProps): CfnParameterProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterProps): software.amazon.awscdk.CfnParameterProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnParameterProps
  }
}
