@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the
 * matching packet.
 *
 * This setting defines a CloudWatch dimension value to be published.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * PublishMetricActionProperty publishMetricActionProperty = PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-publishmetricaction.html)
 */
@CdkDslMarker
public class CfnRuleGroupPublishMetricActionPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.PublishMetricActionProperty.Builder =
      CfnRuleGroup.PublishMetricActionProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * @param dimensions the value to be set. 
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * @param dimensions the value to be set. 
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * @param dimensions the value to be set. 
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun build(): CfnRuleGroup.PublishMetricActionProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
