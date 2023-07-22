@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps

/**
 * Properties for defining a `CfnRegistryPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * Object policy;
 * CfnRegistryPolicyProps cfnRegistryPolicyProps = CfnRegistryPolicyProps.builder()
 * .policy(policy)
 * .registryName("registryName")
 * // the properties below are optional
 * .revisionId("revisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html)
 */
@CdkDslMarker
public class CfnRegistryPolicyPropsDsl {
  private val cdkBuilder: CfnRegistryPolicyProps.Builder = CfnRegistryPolicyProps.builder()

  /**
   * @param policy A resource-based policy. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy A resource-based policy. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param registryName The name of the registry. 
   */
  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  /**
   * @param revisionId The revision ID of the policy.
   */
  public fun revisionId(revisionId: String) {
    cdkBuilder.revisionId(revisionId)
  }

  public fun build(): CfnRegistryPolicyProps = cdkBuilder.build()
}
