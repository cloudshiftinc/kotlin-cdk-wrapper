@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketEventBridgeConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.EventBridgeConfigurationProperty.Builder =
      CfnBucket.EventBridgeConfigurationProperty.builder()

  public fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
    cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
  }

  public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
    cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
  }

  public fun build(): CfnBucket.EventBridgeConfigurationProperty = cdkBuilder.build()
}
