@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * Defines a parameter for an extension.
 *
 * Example:
 *
 * ```
 * Function fn;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new LambdaDestination(fn))
 * .build()))
 * .parameters(List.of(Parameter.required("testParam", "true"),
 * Parameter.notRequired("testNotRequiredParam")))
 * .build();
 * ```
 */
public open class Parameter(
  cdkObject: software.amazon.awscdk.services.appconfig.Parameter,
) : CdkObject(cdkObject) {
  /**
   * The description of the parameter.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A boolean that indicates if the parameter is required or optional.
   */
  public open fun isRequired(): Boolean = unwrap(this).getIsRequired()

  /**
   * The name of the parameter.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The value of the parameter.
   */
  public open fun `value`(): String? = unwrap(this).getValue()

  public companion object {
    public fun notRequired(name: String): Parameter =
        software.amazon.awscdk.services.appconfig.Parameter.notRequired(name).let(Parameter::wrap)

    public fun notRequired(name: String, `value`: String): Parameter =
        software.amazon.awscdk.services.appconfig.Parameter.notRequired(name,
        `value`).let(Parameter::wrap)

    public fun notRequired(
      name: String,
      `value`: String,
      description: String,
    ): Parameter = software.amazon.awscdk.services.appconfig.Parameter.notRequired(name, `value`,
        description).let(Parameter::wrap)

    public fun required(name: String, `value`: String): Parameter =
        software.amazon.awscdk.services.appconfig.Parameter.required(name,
        `value`).let(Parameter::wrap)

    public fun required(
      name: String,
      `value`: String,
      description: String,
    ): Parameter = software.amazon.awscdk.services.appconfig.Parameter.required(name, `value`,
        description).let(Parameter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Parameter): Parameter =
        Parameter(cdkObject)

    internal fun unwrap(wrapped: Parameter): software.amazon.awscdk.services.appconfig.Parameter =
        wrapped.cdkObject as software.amazon.awscdk.services.appconfig.Parameter
  }
}
