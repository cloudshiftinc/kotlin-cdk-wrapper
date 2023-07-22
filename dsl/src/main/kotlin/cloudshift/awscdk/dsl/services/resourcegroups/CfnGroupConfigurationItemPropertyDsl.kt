@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup

/**
 * One of the items in the service configuration assigned to a resource group.
 *
 * A service configuration can consist of one or more items. For details service configurations and
 * how to construct them, see [Service configurations for resource
 * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS Resource
 * Groups User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourcegroups.*;
 * ConfigurationItemProperty configurationItemProperty = ConfigurationItemProperty.builder()
 * .parameters(List.of(ConfigurationParameterProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationitem.html)
 */
@CdkDslMarker
public class CfnGroupConfigurationItemPropertyDsl {
  private val cdkBuilder: CfnGroup.ConfigurationItemProperty.Builder =
      CfnGroup.ConfigurationItemProperty.builder()

  private val _parameters: MutableList<Any> = mutableListOf()

  /**
   * @param parameters A collection of parameters for this configuration item.
   * For the list of parameters that you can use with each configuration item `Type` , see
   * [Supported resource types and
   * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types) in
   * the *AWS Resource Groups User Guide* .
   */
  public fun parameters(vararg parameters: Any) {
    _parameters.addAll(listOf(*parameters))
  }

  /**
   * @param parameters A collection of parameters for this configuration item.
   * For the list of parameters that you can use with each configuration item `Type` , see
   * [Supported resource types and
   * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types) in
   * the *AWS Resource Groups User Guide* .
   */
  public fun parameters(parameters: Collection<Any>) {
    _parameters.addAll(parameters)
  }

  /**
   * @param parameters A collection of parameters for this configuration item.
   * For the list of parameters that you can use with each configuration item `Type` , see
   * [Supported resource types and
   * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types) in
   * the *AWS Resource Groups User Guide* .
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param type Specifies the type of configuration item.
   * Each item must have a unique value for type. For the list of the types that you can specify for
   * a configuration item, see [Supported resource types and
   * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types) in
   * the *AWS Resource Groups User Guide* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnGroup.ConfigurationItemProperty {
    if(_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
    return cdkBuilder.build()
  }
}
