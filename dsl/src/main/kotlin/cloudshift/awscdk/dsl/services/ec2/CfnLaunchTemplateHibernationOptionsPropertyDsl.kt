@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateHibernationOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.HibernationOptionsProperty.Builder =
      CfnLaunchTemplate.HibernationOptionsProperty.builder()

  /**
   * @param configured If you set this parameter to `true` , the instance is enabled for
   * hibernation.
   * Default: `false`
   */
  public fun configured(configured: Boolean) {
    cdkBuilder.configured(configured)
  }

  /**
   * @param configured If you set this parameter to `true` , the instance is enabled for
   * hibernation.
   * Default: `false`
   */
  public fun configured(configured: IResolvable) {
    cdkBuilder.configured(configured)
  }

  public fun build(): CfnLaunchTemplate.HibernationOptionsProperty = cdkBuilder.build()
}
