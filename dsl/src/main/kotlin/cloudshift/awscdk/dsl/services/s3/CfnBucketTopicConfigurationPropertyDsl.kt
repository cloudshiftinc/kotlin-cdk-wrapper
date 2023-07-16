@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketTopicConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.TopicConfigurationProperty.Builder =
      CfnBucket.TopicConfigurationProperty.builder()

  public fun event(event: String) {
    cdkBuilder.event(event)
  }

  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  public fun filter(filter: CfnBucket.NotificationFilterProperty) {
    cdkBuilder.filter(filter)
  }

  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  public fun build(): CfnBucket.TopicConfigurationProperty = cdkBuilder.build()
}
