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

  /**
   * @param destination The destination to send the filtered events to. 
   * For example, a Kinesis stream or a Lambda function.
   */
  public fun destination(destination: ILogSubscriptionDestination) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param filterPattern Log events matching this pattern will be sent to the destination. 
   */
  public fun filterPattern(filterPattern: IFilterPattern) {
    cdkBuilder.filterPattern(filterPattern)
  }

  /**
   * @param logGroup The log group to create the subscription on. 
   */
  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): SubscriptionFilterProps = cdkBuilder.build()
}
