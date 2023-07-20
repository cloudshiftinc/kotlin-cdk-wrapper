@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps

@CdkDslMarker
public class CfnSubscriptionFilterPropsDsl {
  private val cdkBuilder: CfnSubscriptionFilterProps.Builder = CfnSubscriptionFilterProps.builder()

  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  public fun distribution(distribution: String) {
    cdkBuilder.distribution(distribution)
  }

  public fun filterName(filterName: String) {
    cdkBuilder.filterName(filterName)
  }

  public fun filterPattern(filterPattern: String) {
    cdkBuilder.filterPattern(filterPattern)
  }

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnSubscriptionFilterProps = cdkBuilder.build()
}
