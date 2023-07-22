@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.managedblockchain.CfnAccessorProps

/**
 * Properties for defining a `CfnAccessor`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * CfnAccessorProps cfnAccessorProps = CfnAccessorProps.builder()
 * .accessorType("accessorType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html)
 */
@CdkDslMarker
public class CfnAccessorPropsDsl {
  private val cdkBuilder: CfnAccessorProps.Builder = CfnAccessorProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accessorType The type of the accessor. 
   *
   * Currently, accessor type is restricted to `BILLING_TOKEN` .
   */
  public fun accessorType(accessorType: String) {
    cdkBuilder.accessorType(accessorType)
  }

  /**
   * @param tags The tags assigned to the Accessor.
   * For more information about tags, see [Tagging
   * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
   * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
   * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
   * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags assigned to the Accessor.
   * For more information about tags, see [Tagging
   * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
   * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
   * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
   * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAccessorProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
