@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnDeliveryChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDeliveryChannel.Builder = CfnDeliveryChannel.Builder.create(scope, id)

  public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable) {
    cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties)
  }

  public
      fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty) {
    cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  public fun s3KmsKeyArn(s3KmsKeyArn: String) {
    cdkBuilder.s3KmsKeyArn(s3KmsKeyArn)
  }

  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun build(): CfnDeliveryChannel = cdkBuilder.build()
}
