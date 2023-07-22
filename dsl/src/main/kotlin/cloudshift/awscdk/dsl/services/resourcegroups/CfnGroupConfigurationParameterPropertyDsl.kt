@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.resourcegroups.CfnGroup

@CdkDslMarker
public class CfnGroupConfigurationParameterPropertyDsl {
  private val cdkBuilder: CfnGroup.ConfigurationParameterProperty.Builder =
      CfnGroup.ConfigurationParameterProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param name The name of the group configuration parameter.
   * For the list of parameters that you can use with each configuration item type, see [Supported
   * resource types and
   * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
   * in the *AWS Resource Groups User Guide* .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param values The value or values to be used for the specified parameter.
   * For the list of values you can use with each parameter, see [Supported resource types and
   * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types) .
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The value or values to be used for the specified parameter.
   * For the list of values you can use with each parameter, see [Supported resource types and
   * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types) .
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnGroup.ConfigurationParameterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
