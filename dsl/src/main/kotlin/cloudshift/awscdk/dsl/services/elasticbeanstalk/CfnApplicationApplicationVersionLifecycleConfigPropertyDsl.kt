@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

/**
 * Use the `ApplicationVersionLifecycleConfig` property type to specify application version
 * lifecycle settings for an AWS Elastic Beanstalk application when defining an
 * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
 *
 * The application version lifecycle settings for an application. Defines the rules that Elastic
 * Beanstalk applies to an application's versions in order to avoid hitting the per-region limit for
 * application versions.
 *
 * When Elastic Beanstalk deletes an application version from its database, you can no longer deploy
 * that version to an environment. The source bundle remains in S3 unless you configure the rule to
 * delete it.
 *
 * `ApplicationVersionLifecycleConfig` is a property of the
 * [ApplicationResourceLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * ApplicationVersionLifecycleConfigProperty applicationVersionLifecycleConfigProperty =
 * ApplicationVersionLifecycleConfigProperty.builder()
 * .maxAgeRule(MaxAgeRuleProperty.builder()
 * .deleteSourceFromS3(false)
 * .enabled(false)
 * .maxAgeInDays(123)
 * .build())
 * .maxCountRule(MaxCountRuleProperty.builder()
 * .deleteSourceFromS3(false)
 * .enabled(false)
 * .maxCount(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
 */
@CdkDslMarker
public class CfnApplicationApplicationVersionLifecycleConfigPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder =
      CfnApplication.ApplicationVersionLifecycleConfigProperty.builder()

  /**
   * @param maxAgeRule Specify a max age rule to restrict the length of time that application
   * versions are retained for an application.
   */
  public fun maxAgeRule(maxAgeRule: IResolvable) {
    cdkBuilder.maxAgeRule(maxAgeRule)
  }

  /**
   * @param maxAgeRule Specify a max age rule to restrict the length of time that application
   * versions are retained for an application.
   */
  public fun maxAgeRule(maxAgeRule: CfnApplication.MaxAgeRuleProperty) {
    cdkBuilder.maxAgeRule(maxAgeRule)
  }

  /**
   * @param maxCountRule Specify a max count rule to restrict the number of application versions
   * that are retained for an application.
   */
  public fun maxCountRule(maxCountRule: IResolvable) {
    cdkBuilder.maxCountRule(maxCountRule)
  }

  /**
   * @param maxCountRule Specify a max count rule to restrict the number of application versions
   * that are retained for an application.
   */
  public fun maxCountRule(maxCountRule: CfnApplication.MaxCountRuleProperty) {
    cdkBuilder.maxCountRule(maxCountRule)
  }

  public fun build(): CfnApplication.ApplicationVersionLifecycleConfigProperty = cdkBuilder.build()
}
