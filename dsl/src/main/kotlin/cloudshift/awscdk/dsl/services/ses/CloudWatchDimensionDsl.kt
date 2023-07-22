@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CloudWatchDimension
import software.amazon.awscdk.services.ses.CloudWatchDimensionSource

@CdkDslMarker
public class CloudWatchDimensionDsl {
  private val cdkBuilder: CloudWatchDimension.Builder = CloudWatchDimension.builder()

  /**
   * @param defaultValue The default value of the dimension that is published to Amazon CloudWatch
   * if you do not provide the value of the dimension when you send an email. 
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param name The name of an Amazon CloudWatch dimension associated with an email sending metric.
   * 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param source The place where Amazon SES finds the value of a dimension to publish to Amazon
   * CloudWatch. 
   */
  public fun source(source: CloudWatchDimensionSource) {
    cdkBuilder.source(source)
  }

  public fun build(): CloudWatchDimension = cdkBuilder.build()
}
