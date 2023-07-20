@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.ILogSubscriptionDestination
import software.amazon.awscdk.services.logs.SubscriptionFilterProps

@CdkDslMarker
public class SubscriptionFilterPropsDsl {
  private val cdkBuilder: SubscriptionFilterProps.Builder = SubscriptionFilterProps.builder()

  public fun destination(destination: ILogSubscriptionDestination) {
    cdkBuilder.destination(destination)
  }

  public fun filterPattern(filterPattern: IFilterPattern) {
    cdkBuilder.filterPattern(filterPattern)
  }

  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): SubscriptionFilterProps = cdkBuilder.build()
}
