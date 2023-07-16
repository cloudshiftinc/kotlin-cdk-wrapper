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

  public fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
    cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
  }

  public fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
    cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun maxAgeInDays(maxAgeInDays: Number) {
    cdkBuilder.maxAgeInDays(maxAgeInDays)
  }

  public fun build(): CfnApplication.MaxAgeRuleProperty = cdkBuilder.build()
}
