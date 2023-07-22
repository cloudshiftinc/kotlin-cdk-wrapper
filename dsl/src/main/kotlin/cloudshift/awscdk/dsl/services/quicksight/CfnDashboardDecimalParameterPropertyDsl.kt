@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A decimal parameter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DecimalParameterProperty decimalParameterProperty = DecimalParameterProperty.builder()
 * .name("name")
 * .values(List.of(123))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-decimalparameter.html)
 */
@CdkDslMarker
public class CfnDashboardDecimalParameterPropertyDsl {
  private val cdkBuilder: CfnDashboard.DecimalParameterProperty.Builder =
      CfnDashboard.DecimalParameterProperty.builder()

  private val _values: MutableList<Number> = mutableListOf()

  /**
   * @param name A display name for the decimal parameter. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param values The values for the decimal parameter. 
   */
  public fun values(vararg values: Number) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The values for the decimal parameter. 
   */
  public fun values(values: Collection<Number>) {
    _values.addAll(values)
  }

  /**
   * @param values The values for the decimal parameter. 
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnDashboard.DecimalParameterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
