@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionS3NotificationFilterPropertyDsl {
  private val cdkBuilder: CfnFunction.S3NotificationFilterProperty.Builder =
      CfnFunction.S3NotificationFilterProperty.builder()

  /**
   * @param s3Key the value to be set. 
   */
  public fun s3Key(s3Key: IResolvable) {
    cdkBuilder.s3Key(s3Key)
  }

  /**
   * @param s3Key the value to be set. 
   */
  public fun s3Key(s3Key: CfnFunction.S3KeyFilterProperty) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnFunction.S3NotificationFilterProperty = cdkBuilder.build()
}
