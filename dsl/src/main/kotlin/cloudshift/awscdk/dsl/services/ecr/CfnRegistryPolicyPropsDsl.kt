@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps

@CdkDslMarker
public class CfnRegistryPolicyPropsDsl {
  private val cdkBuilder: CfnRegistryPolicyProps.Builder = CfnRegistryPolicyProps.builder()

  /**
   * @param policyText The JSON policy text for your registry. 
   */
  public fun policyText(policyText: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyText)
    cdkBuilder.policyText(builder.map)
  }

  /**
   * @param policyText The JSON policy text for your registry. 
   */
  public fun policyText(policyText: Any) {
    cdkBuilder.policyText(policyText)
  }

  public fun build(): CfnRegistryPolicyProps = cdkBuilder.build()
}
