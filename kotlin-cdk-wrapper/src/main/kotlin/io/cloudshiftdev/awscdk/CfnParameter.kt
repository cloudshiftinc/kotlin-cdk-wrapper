@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
  public open fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  public open fun allowedPattern(`value`: String) {
    unwrap(this).setAllowedPattern(`value`)
  }

  public open fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

  public open fun allowedValues(`value`: List<String>) {
    unwrap(this).setAllowedValues(`value`)
  }

  public open fun allowedValues(vararg `value`: String): Unit = allowedValues(`value`.toList())

  public open fun constraintDescription(): String? = unwrap(this).getConstraintDescription()

  public open fun constraintDescription(`value`: String) {
    unwrap(this).setConstraintDescription(`value`)
  }

  public open fun defaultValue(): Any = unwrap(this).getDefaultValue()

  public open fun defaultValue(`value`: Any) {
    unwrap(this).setDefaultValue(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun maxLength(): Number? = unwrap(this).getMaxLength()

  public open fun maxLength(`value`: Number) {
    unwrap(this).setMaxLength(`value`)
  }

  public open fun maxValue(): Number? = unwrap(this).getMaxValue()

  public open fun maxValue(`value`: Number) {
    unwrap(this).setMaxValue(`value`)
  }

  public open fun minLength(): Number? = unwrap(this).getMinLength()

  public open fun minLength(`value`: Number) {
    unwrap(this).setMinLength(`value`)
  }

  public open fun minValue(): Number? = unwrap(this).getMinValue()

  public open fun minValue(`value`: Number) {
    unwrap(this).setMinValue(`value`)
  }

  public open fun noEcho(): Boolean = unwrap(this).getNoEcho()

  public open fun noEcho(`value`: Boolean) {
    unwrap(this).setNoEcho(`value`)
  }

  public open fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun `value`(): IResolvable = unwrap(this).getValue().let(IResolvable::wrap)

  public open fun valueAsList(): List<String> = unwrap(this).getValueAsList()

  public open fun valueAsNumber(): Number = unwrap(this).getValueAsNumber()

  public open fun valueAsString(): String = unwrap(this).getValueAsString()

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnParameter.Builder =
        software.amazon.awscdk.CfnParameter.Builder.create(scope, id)

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
