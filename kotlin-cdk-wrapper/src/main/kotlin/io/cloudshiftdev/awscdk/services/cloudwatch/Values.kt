@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A class for providing values for use with [VariableInputType.SELECT] and
 * [VariableInputType.RADIO] dashboard variables.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
 * .defaultInterval(Duration.days(7))
 * .variables(List.of(DashboardVariable.Builder.create()
 * .id("region")
 * .type(VariableType.PROPERTY)
 * .label("Region")
 * .inputType(VariableInputType.RADIO)
 * .value("region")
 * .values(Values.fromValues(VariableValue.builder().label("IAD").value("us-east-1").build(),
 * VariableValue.builder().label("DUB").value("us-west-2").build()))
 * .defaultValue(DefaultValue.value("us-east-1"))
 * .visible(true)
 * .build()))
 * .build();
 * ```
 */
public abstract class Values internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.Values,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun toJson(): Any = unwrap(this).toJson()

  public companion object {
    public fun fromSearch(expression: String, populateFrom: String): Values =
        software.amazon.awscdk.services.cloudwatch.Values.fromSearch(expression,
        populateFrom).let(Values::wrap)

    public fun fromSearchComponents(components: SearchComponents): Values =
        software.amazon.awscdk.services.cloudwatch.Values.fromSearchComponents(components.let(SearchComponents::unwrap)).let(Values::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9623a062a74e6ff7a42651de1c7ce36b5ddbbeb062710b7565cad07d0811bbf6")
    public fun fromSearchComponents(components: SearchComponents.Builder.() -> Unit): Values =
        fromSearchComponents(SearchComponents(components))

    public fun fromValues(values: VariableValue): Values =
        software.amazon.awscdk.services.cloudwatch.Values.fromValues(values.let(VariableValue::unwrap)).let(Values::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0d0475001a2a4bae2c4295fcb71128cbbbb828937bcbe598fef90575cefde17")
    public fun fromValues(values: VariableValue.Builder.() -> Unit): Values =
        fromValues(VariableValue(values))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Values): Values =
        CdkObjectWrappers.wrap(cdkObject) as Values

    internal fun unwrap(wrapped: Values): software.amazon.awscdk.services.cloudwatch.Values =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.Values
  }
}
