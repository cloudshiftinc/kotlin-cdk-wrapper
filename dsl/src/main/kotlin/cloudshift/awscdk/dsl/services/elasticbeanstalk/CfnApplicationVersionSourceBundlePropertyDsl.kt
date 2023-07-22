@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion

/**
 * Use the `SourceBundle` property type to specify the Amazon S3 location of the source bundle for
 * an AWS Elastic Beanstalk application version when defining an
 * AWS::ElasticBeanstalk::ApplicationVersion resource in an AWS CloudFormation template.
 *
 * The `SourceBundle` property is an embedded property of the
 * [AWS::ElasticBeanstalk::ApplicationVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html)
 * resource. It specifies the Amazon S3 location of the source bundle for an AWS Elastic Beanstalk
 * application version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * SourceBundleProperty sourceBundleProperty = SourceBundleProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-applicationversion-sourcebundle.html)
 */
@CdkDslMarker
public class CfnApplicationVersionSourceBundlePropertyDsl {
  private val cdkBuilder: CfnApplicationVersion.SourceBundleProperty.Builder =
      CfnApplicationVersion.SourceBundleProperty.builder()

  /**
   * @param s3Bucket The Amazon S3 bucket where the data is located. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Key The Amazon S3 key where the data is located. 
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnApplicationVersion.SourceBundleProperty = cdkBuilder.build()
}
