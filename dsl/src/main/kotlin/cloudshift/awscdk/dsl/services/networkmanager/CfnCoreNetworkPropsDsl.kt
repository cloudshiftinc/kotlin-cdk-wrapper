@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps

/**
 * Properties for defining a `CfnCoreNetwork`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * Object policyDocument;
 * CfnCoreNetworkProps cfnCoreNetworkProps = CfnCoreNetworkProps.builder()
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .description("description")
 * .policyDocument(policyDocument)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html)
 */
@CdkDslMarker
public class CfnCoreNetworkPropsDsl {
  private val cdkBuilder: CfnCoreNetworkProps.Builder = CfnCoreNetworkProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of a core network.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param globalNetworkId The ID of the global network that your core network is a part of. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * @param policyDocument Describes a core network policy. For more information, see [Core network
   * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
   * .
   * If you update the policy document, CloudFormation will apply the core network change set
   * generated from the updated policy document, and then set it as the LIVE policy.
   */
  public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.map)
  }

  /**
   * @param policyDocument Describes a core network policy. For more information, see [Core network
   * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
   * .
   * If you update the policy document, CloudFormation will apply the core network change set
   * generated from the updated policy document, and then set it as the LIVE policy.
   */
  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * @param tags The list of key-value tags associated with a core network.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The list of key-value tags associated with a core network.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCoreNetworkProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
