@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnRegistryPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRegistryPolicy.Builder = CfnRegistryPolicy.Builder.create(scope, id)

  /**
   * A resource-based policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy)
   * @param policy A resource-based policy. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * A resource-based policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy)
   * @param policy A resource-based policy. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * The name of the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname)
   * @param registryName The name of the registry. 
   */
  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  /**
   * The revision ID of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid)
   * @param revisionId The revision ID of the policy. 
   */
  public fun revisionId(revisionId: String) {
    cdkBuilder.revisionId(revisionId)
  }

  public fun build(): CfnRegistryPolicy = cdkBuilder.build()
}
