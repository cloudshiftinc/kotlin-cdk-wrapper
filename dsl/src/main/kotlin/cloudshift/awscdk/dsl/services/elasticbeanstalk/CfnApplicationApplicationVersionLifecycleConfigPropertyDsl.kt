@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

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
