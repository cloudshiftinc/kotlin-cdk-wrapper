@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardIntegerParameterPropertyDsl {
  private val cdkBuilder: CfnDashboard.IntegerParameterProperty.Builder =
      CfnDashboard.IntegerParameterProperty.builder()

  private val _values: MutableList<Number> = mutableListOf()

  /**
   * @param name The name of the integer parameter. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param values The values for the integer parameter. 
   */
  public fun values(vararg values: Number) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The values for the integer parameter. 
   */
  public fun values(values: Collection<Number>) {
    _values.addAll(values)
  }

  /**
   * @param values The values for the integer parameter. 
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnDashboard.IntegerParameterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
