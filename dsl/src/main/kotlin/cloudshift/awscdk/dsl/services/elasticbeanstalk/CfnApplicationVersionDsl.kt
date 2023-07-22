@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.constructs.Construct

/**
 * Specify an AWS Elastic Beanstalk application version by using the
 * AWS::ElasticBeanstalk::ApplicationVersion resource in an AWS CloudFormation template.
 *
 * The AWS::ElasticBeanstalk::ApplicationVersion resource is an AWS Elastic Beanstalk resource type
 * that specifies an application version, an iteration of deployable code, for an Elastic Beanstalk
 * application.
 *
 *
 * After you create an application version with a specified Amazon S3 bucket and key location, you
 * can't change that Amazon S3 location. If you change the Amazon S3 location, an attempt to launch an
 * environment from the application version will fail.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * CfnApplicationVersion cfnApplicationVersion = CfnApplicationVersion.Builder.create(this,
 * "MyCfnApplicationVersion")
 * .applicationName("applicationName")
 * .sourceBundle(SourceBundleProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html)
 */
@CdkDslMarker
public class CfnApplicationVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationVersion.Builder =
      CfnApplicationVersion.Builder.create(scope, id)

  /**
   * The name of the Elastic Beanstalk application that is associated with this application version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-applicationname)
   * @param applicationName The name of the Elastic Beanstalk application that is associated with
   * this application version. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * A description of this application version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-description)
   * @param description A description of this application version. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
   *
   *
   * The Amazon S3 bucket must be in the same region as the environment.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
   * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
   * bundle for this version. 
   */
  public fun sourceBundle(sourceBundle: IResolvable) {
    cdkBuilder.sourceBundle(sourceBundle)
  }

  /**
   * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
   *
   *
   * The Amazon S3 bucket must be in the same region as the environment.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
   * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
   * bundle for this version. 
   */
  public fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty) {
    cdkBuilder.sourceBundle(sourceBundle)
  }

  public fun build(): CfnApplicationVersion = cdkBuilder.build()
}
