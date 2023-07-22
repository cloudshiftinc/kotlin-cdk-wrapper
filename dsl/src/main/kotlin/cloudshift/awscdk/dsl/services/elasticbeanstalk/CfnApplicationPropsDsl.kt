@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .applicationName("applicationName")
 * .description("description")
 * .resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty.builder()
 * .serviceRole("serviceRole")
 * .versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty.builder()
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
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
  private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

  /**
   * @param applicationName A name for the Elastic Beanstalk application.
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the application name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param description Your description of the application.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
   * prevent your application from accumulating too many versions.
   */
  public fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
    cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig)
  }

  /**
   * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
   * prevent your application from accumulating too many versions.
   */
  public
      fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty) {
    cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig)
  }

  public fun build(): CfnApplicationProps = cdkBuilder.build()
}
