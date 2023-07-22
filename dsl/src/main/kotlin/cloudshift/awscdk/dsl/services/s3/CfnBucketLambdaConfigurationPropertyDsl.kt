@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketLambdaConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.LambdaConfigurationProperty.Builder =
      CfnBucket.LambdaConfigurationProperty.builder()

  /**
   * @param event The Amazon S3 bucket event for which to invoke the AWS Lambda function. 
   * For more information, see [Supported Event
   * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon S3
   * User Guide* .
   */
  public fun event(event: String) {
    cdkBuilder.event(event)
  }

  /**
   * @param filter The filtering rules that determine which objects invoke the AWS Lambda function.
   * For example, you can create a filter so that only image files with a `.jpg` extension invoke
   * the function when they are added to the Amazon S3 bucket.
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filter The filtering rules that determine which objects invoke the AWS Lambda function.
   * For example, you can create a filter so that only image files with a `.jpg` extension invoke
   * the function when they are added to the Amazon S3 bucket.
   */
  public fun filter(filter: CfnBucket.NotificationFilterProperty) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param function The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
   * invokes when the specified event type occurs. 
   */
  public fun function(function: String) {
    cdkBuilder.function(function)
  }

  public fun build(): CfnBucket.LambdaConfigurationProperty = cdkBuilder.build()
}
