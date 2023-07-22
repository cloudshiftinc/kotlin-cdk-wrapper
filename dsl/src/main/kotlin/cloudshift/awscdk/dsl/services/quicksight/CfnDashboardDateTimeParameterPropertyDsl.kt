@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A date-time parameter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimeParameterProperty dateTimeParameterProperty = DateTimeParameterProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datetimeparameter.html)
 */
@CdkDslMarker
public class CfnDashboardDateTimeParameterPropertyDsl {
  private val cdkBuilder: CfnDashboard.DateTimeParameterProperty.Builder =
      CfnDashboard.DateTimeParameterProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param name A display name for the date-time parameter. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param values The values for the date-time parameter. 
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The values for the date-time parameter. 
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnDashboard.DateTimeParameterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
