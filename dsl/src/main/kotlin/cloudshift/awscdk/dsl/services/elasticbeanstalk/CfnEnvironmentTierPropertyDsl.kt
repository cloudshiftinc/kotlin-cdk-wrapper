@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment

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
