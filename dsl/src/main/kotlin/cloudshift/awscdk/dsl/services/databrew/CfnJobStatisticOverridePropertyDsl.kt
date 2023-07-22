@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobStatisticOverridePropertyDsl {
  private val cdkBuilder: CfnJob.StatisticOverrideProperty.Builder =
      CfnJob.StatisticOverrideProperty.builder()

  /**
   * @param parameters A map that includes overrides of an evaluation’s parameters. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters A map that includes overrides of an evaluation’s parameters. 
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param statistic The name of an evaluation. 
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun build(): CfnJob.StatisticOverrideProperty = cdkBuilder.build()
}
