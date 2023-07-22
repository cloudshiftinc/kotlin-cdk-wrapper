@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps

@CdkDslMarker
public class CfnApplicationVersionPropsDsl {
  private val cdkBuilder: CfnApplicationVersionProps.Builder = CfnApplicationVersionProps.builder()

  /**
   * @param applicationName The name of the Elastic Beanstalk application that is associated with
   * this application version. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param description A description of this application version.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
   * bundle for this version. 
   *
   * The Amazon S3 bucket must be in the same region as the environment.
   */
  public fun sourceBundle(sourceBundle: IResolvable) {
    cdkBuilder.sourceBundle(sourceBundle)
  }

  /**
   * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
   * bundle for this version. 
   *
   * The Amazon S3 bucket must be in the same region as the environment.
   */
  public fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty) {
    cdkBuilder.sourceBundle(sourceBundle)
  }

  public fun build(): CfnApplicationVersionProps = cdkBuilder.build()
}
