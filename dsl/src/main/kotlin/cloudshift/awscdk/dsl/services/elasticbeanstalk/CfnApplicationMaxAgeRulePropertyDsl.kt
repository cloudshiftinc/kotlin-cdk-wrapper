@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

@CdkDslMarker
public class CfnApplicationMaxAgeRulePropertyDsl {
  private val cdkBuilder: CfnApplication.MaxAgeRuleProperty.Builder =
      CfnApplication.MaxAgeRuleProperty.builder()

  /**
   * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3 when
   * Elastic Beanstalk deletes the application version.
   */
  public fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
    cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
  }

  /**
   * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3 when
   * Elastic Beanstalk deletes the application version.
   */
  public fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
    cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
  }

  /**
   * @param enabled Specify `true` to apply the rule, or `false` to disable it.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specify `true` to apply the rule, or `false` to disable it.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param maxAgeInDays Specify the number of days to retain an application versions.
   */
  public fun maxAgeInDays(maxAgeInDays: Number) {
    cdkBuilder.maxAgeInDays(maxAgeInDays)
  }

  public fun build(): CfnApplication.MaxAgeRuleProperty = cdkBuilder.build()
}
