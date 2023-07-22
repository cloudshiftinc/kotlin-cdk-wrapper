@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRegistryPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnRegistryPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRegistryPolicy.Builder = CfnRegistryPolicy.Builder.create(scope, id)

  /**
   * The JSON policy text for your registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
   * @param policyText The JSON policy text for your registry. 
   */
  public fun policyText(policyText: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyText)
    cdkBuilder.policyText(builder.map)
  }

  /**
   * The JSON policy text for your registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
   * @param policyText The JSON policy text for your registry. 
   */
  public fun policyText(policyText: Any) {
    cdkBuilder.policyText(policyText)
  }

  public fun build(): CfnRegistryPolicy = cdkBuilder.build()
}
