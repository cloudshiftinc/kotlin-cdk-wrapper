@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment

/**
 * Use the `Tier` property type to specify the environment tier for an AWS Elastic Beanstalk
 * environment when defining an AWS::ElasticBeanstalk::Environment resource in an AWS CloudFormation
 * template.
 *
 * Describes the environment tier for an
 * [AWS::ElasticBeanstalk::Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html)
 * resource. For more information, see [Environment
 * Tiers](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features-managing-env-tiers.html)
 * in the *AWS Elastic Beanstalk Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * TierProperty tierProperty = TierProperty.builder()
 * .name("name")
 * .type("type")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html)
 */
@CdkDslMarker
public class CfnEnvironmentTierPropertyDsl {
  private val cdkBuilder: CfnEnvironment.TierProperty.Builder =
      CfnEnvironment.TierProperty.builder()

  /**
   * @param name The name of this environment tier.
   * Valid values:
   *
   * * For *Web server tier* – `WebServer`
   * * For *Worker tier* – `Worker`
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type The type of this environment tier.
   * Valid values:
   *
   * * For *Web server tier* – `Standard`
   * * For *Worker tier* – `SQS/HTTP`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param version The version of this environment tier.
   * When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker tier
   * version.
   *
   *
   * This member is deprecated. Any specific version that you set may become out of date. We
   * recommend leaving it unspecified.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnEnvironment.TierProperty = cdkBuilder.build()
}
