@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination
import software.constructs.Construct

@CdkDslMarker
public class CfnTopicRuleDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTopicRuleDestination.Builder =
      CfnTopicRuleDestination.Builder.create(scope, id)

  public fun httpUrlProperties(httpUrlProperties: IResolvable) {
    cdkBuilder.httpUrlProperties(httpUrlProperties)
  }

  public
      fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty) {
    cdkBuilder.httpUrlProperties(httpUrlProperties)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun vpcProperties(vpcProperties: IResolvable) {
    cdkBuilder.vpcProperties(vpcProperties)
  }

  public
      fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty) {
    cdkBuilder.vpcProperties(vpcProperties)
  }

  public fun build(): CfnTopicRuleDestination = cdkBuilder.build()
}
