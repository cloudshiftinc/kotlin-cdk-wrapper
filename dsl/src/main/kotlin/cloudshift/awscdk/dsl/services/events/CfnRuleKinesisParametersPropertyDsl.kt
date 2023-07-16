@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleKinesisParametersPropertyDsl {
  private val cdkBuilder: CfnRule.KinesisParametersProperty.Builder =
      CfnRule.KinesisParametersProperty.builder()

  public fun partitionKeyPath(partitionKeyPath: String) {
    cdkBuilder.partitionKeyPath(partitionKeyPath)
  }

  public fun build(): CfnRule.KinesisParametersProperty = cdkBuilder.build()
}
