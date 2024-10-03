@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
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
public interface VariableValue {
  /**
   * Optional label for the selected item.
   *
   * Default: - the variable's value
   */
  public fun label(): String? = unwrap(this).getLabel()

  /**
   * Value of the selected item.
   */
  public fun `value`(): String

  /**
   * A builder for [VariableValue]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param label Optional label for the selected item.
     */
    public fun label(label: String)

    /**
     * @param value Value of the selected item. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.VariableValue.Builder =
        software.amazon.awscdk.services.cloudwatch.VariableValue.builder()

    /**
     * @param label Optional label for the selected item.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param value Value of the selected item. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.VariableValue =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.VariableValue,
  ) : CdkObject(cdkObject),
      VariableValue {
    /**
     * Optional label for the selected item.
     *
     * Default: - the variable's value
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * Value of the selected item.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VariableValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.VariableValue):
        VariableValue = CdkObjectWrappers.wrap(cdkObject) as? VariableValue ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VariableValue):
        software.amazon.awscdk.services.cloudwatch.VariableValue = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.VariableValue
  }
}
