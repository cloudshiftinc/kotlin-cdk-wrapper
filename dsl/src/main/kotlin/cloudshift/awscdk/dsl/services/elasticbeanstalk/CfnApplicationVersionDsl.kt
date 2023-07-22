@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.constructs.Construct

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
