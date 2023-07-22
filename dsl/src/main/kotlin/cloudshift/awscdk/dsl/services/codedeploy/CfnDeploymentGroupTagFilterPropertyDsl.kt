@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupTagFilterPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.TagFilterProperty.Builder =
      CfnDeploymentGroup.TagFilterProperty.builder()

  /**
   * @param key The on-premises instance tag filter key.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param type The on-premises instance tag filter type:.
   * * KEY_ONLY: Key only.
   * * VALUE_ONLY: Value only.
   * * KEY_AND_VALUE: Key and value.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The on-premises instance tag filter value.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDeploymentGroup.TagFilterProperty = cdkBuilder.build()
}
