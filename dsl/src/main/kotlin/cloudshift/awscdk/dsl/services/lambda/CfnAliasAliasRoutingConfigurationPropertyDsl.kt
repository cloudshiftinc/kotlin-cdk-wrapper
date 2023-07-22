@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnAlias

@CdkDslMarker
public class CfnAliasAliasRoutingConfigurationPropertyDsl {
  private val cdkBuilder: CfnAlias.AliasRoutingConfigurationProperty.Builder =
      CfnAlias.AliasRoutingConfigurationProperty.builder()

  private val _additionalVersionWeights: MutableList<Any> = mutableListOf()

  /**
   * @param additionalVersionWeights The second version, and the percentage of traffic that's routed
   * to it. 
   */
  public fun additionalVersionWeights(vararg additionalVersionWeights: Any) {
    _additionalVersionWeights.addAll(listOf(*additionalVersionWeights))
  }

  /**
   * @param additionalVersionWeights The second version, and the percentage of traffic that's routed
   * to it. 
   */
  public fun additionalVersionWeights(additionalVersionWeights: Collection<Any>) {
    _additionalVersionWeights.addAll(additionalVersionWeights)
  }

  /**
   * @param additionalVersionWeights The second version, and the percentage of traffic that's routed
   * to it. 
   */
  public fun additionalVersionWeights(additionalVersionWeights: IResolvable) {
    cdkBuilder.additionalVersionWeights(additionalVersionWeights)
  }

  public fun build(): CfnAlias.AliasRoutingConfigurationProperty {
    if(_additionalVersionWeights.isNotEmpty())
        cdkBuilder.additionalVersionWeights(_additionalVersionWeights)
    return cdkBuilder.build()
  }
}
