package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.Boolean
import kotlin.String

public open class Parameter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.Parameter,
) {
  public open fun description(): String? = unwrap(this).getDescription()

  public open fun isRequired(): Boolean = unwrap(this).getIsRequired()

  public open fun name(): String = unwrap(this).getName()

  public open fun `value`(): String? = unwrap(this).getValue()

  public companion object {
    public open fun notRequired(name: String): Parameter =
        software.amazon.awscdk.services.appconfig.Parameter.notRequired(name).let(Parameter::wrap)

    public open fun notRequired(name: String, `value`: String): Parameter =
        software.amazon.awscdk.services.appconfig.Parameter.notRequired(name,
        `value`).let(Parameter::wrap)

    public open fun notRequired(
      name: String,
      `value`: String,
      description: String,
    ): Parameter = software.amazon.awscdk.services.appconfig.Parameter.notRequired(name, `value`,
        description).let(Parameter::wrap)

    public open fun required(name: String, `value`: String): Parameter =
        software.amazon.awscdk.services.appconfig.Parameter.required(name,
        `value`).let(Parameter::wrap)

    public open fun required(
      name: String,
      `value`: String,
      description: String,
    ): Parameter = software.amazon.awscdk.services.appconfig.Parameter.required(name, `value`,
        description).let(Parameter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Parameter): Parameter =
        Parameter(cdkObject)

    internal fun unwrap(wrapped: Parameter): software.amazon.awscdk.services.appconfig.Parameter =
        wrapped.cdkObject
  }
}
