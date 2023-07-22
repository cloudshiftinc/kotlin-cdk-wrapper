@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupEC2TagFilterPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.EC2TagFilterProperty.Builder =
      CfnDeploymentGroup.EC2TagFilterProperty.builder()

  /**
   * @param key The tag filter key.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param type The tag filter type:.
   * * `KEY_ONLY` : Key only.
   * * `VALUE_ONLY` : Value only.
   * * `KEY_AND_VALUE` : Key and value.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The tag filter value.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDeploymentGroup.EC2TagFilterProperty = cdkBuilder.build()
}
