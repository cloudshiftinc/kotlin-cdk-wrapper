@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps

@CdkDslMarker
public class CfnServiceNetworkServiceAssociationPropsDsl {
  private val cdkBuilder: CfnServiceNetworkServiceAssociationProps.Builder =
      CfnServiceNetworkServiceAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param dnsEntry the value to be set.
   */
  public fun dnsEntry(dnsEntry: IResolvable) {
    cdkBuilder.dnsEntry(dnsEntry)
  }

  /**
   * @param dnsEntry the value to be set.
   */
  public fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty) {
    cdkBuilder.dnsEntry(dnsEntry)
  }

  /**
   * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service.
   */
  public fun serviceIdentifier(serviceIdentifier: String) {
    cdkBuilder.serviceIdentifier(serviceIdentifier)
  }

  /**
   * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network.
   * You must use the ARN if the resources specified in the operation are in different accounts.
   */
  public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
    cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
  }

  /**
   * @param tags The tags for the association.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the association.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnServiceNetworkServiceAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
