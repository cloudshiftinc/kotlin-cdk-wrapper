@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps

@CdkDslMarker
public class CfnDistributionConfigurationPropsDsl {
  private val cdkBuilder: CfnDistributionConfigurationProps.Builder =
      CfnDistributionConfigurationProps.builder()

  private val _distributions: MutableList<Any> = mutableListOf()

  /**
   * @param description The description of this distribution configuration.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param distributions The distributions of this distribution configuration formatted as an array
   * of Distribution objects. 
   */
  public fun distributions(vararg distributions: Any) {
    _distributions.addAll(listOf(*distributions))
  }

  /**
   * @param distributions The distributions of this distribution configuration formatted as an array
   * of Distribution objects. 
   */
  public fun distributions(distributions: Collection<Any>) {
    _distributions.addAll(distributions)
  }

  /**
   * @param distributions The distributions of this distribution configuration formatted as an array
   * of Distribution objects. 
   */
  public fun distributions(distributions: IResolvable) {
    cdkBuilder.distributions(distributions)
  }

  /**
   * @param name The name of this distribution configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The tags of this distribution configuration.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnDistributionConfigurationProps {
    if(_distributions.isNotEmpty()) cdkBuilder.distributions(_distributions)
    return cdkBuilder.build()
  }
}
