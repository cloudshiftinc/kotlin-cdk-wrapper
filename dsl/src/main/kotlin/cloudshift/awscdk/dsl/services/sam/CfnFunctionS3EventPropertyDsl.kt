@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionS3EventPropertyDsl {
  private val cdkBuilder: CfnFunction.S3EventProperty.Builder =
      CfnFunction.S3EventProperty.builder()

  /**
   * @param bucket the value to be set. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param events the value to be set. 
   */
  public fun events(events: String) {
    cdkBuilder.events(events)
  }

  /**
   * @param filter the value to be set.
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filter the value to be set.
   */
  public fun filter(filter: CfnFunction.S3NotificationFilterProperty) {
    cdkBuilder.filter(filter)
  }

  public fun build(): CfnFunction.S3EventProperty = cdkBuilder.build()
}
