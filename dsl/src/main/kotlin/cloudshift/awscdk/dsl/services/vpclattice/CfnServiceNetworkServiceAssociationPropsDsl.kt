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

/**
 * Properties for defining a `CfnServiceNetworkServiceAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnServiceNetworkServiceAssociationProps cfnServiceNetworkServiceAssociationProps =
 * CfnServiceNetworkServiceAssociationProps.builder()
 * .dnsEntry(DnsEntryProperty.builder()
 * .domainName("domainName")
 * .hostedZoneId("hostedZoneId")
 * .build())
 * .serviceIdentifier("serviceIdentifier")
 * .serviceNetworkIdentifier("serviceNetworkIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html)
 */
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
