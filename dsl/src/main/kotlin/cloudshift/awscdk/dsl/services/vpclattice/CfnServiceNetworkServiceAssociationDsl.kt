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
import software.constructs.Construct

/**
 * Associates a service with a service network.
 *
 * You can't use this operation if the service and service network are already associated or if
 * there is a disassociation or deletion in progress. If the association fails, you can retry the
 * operation by deleting the association and recreating it.
 *
 * You cannot associate a service and service network that are shared with a caller. The caller must
 * own either the service or the service network.
 *
 * As a result of this operation, the association is created in the service network account and the
 * association owner account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnServiceNetworkServiceAssociation cfnServiceNetworkServiceAssociation =
 * CfnServiceNetworkServiceAssociation.Builder.create(this, "MyCfnServiceNetworkServiceAssociation")
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
public class CfnServiceNetworkServiceAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnServiceNetworkServiceAssociation.Builder =
      CfnServiceNetworkServiceAssociation.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
   * @param dnsEntry 
   */
  public fun dnsEntry(dnsEntry: IResolvable) {
    cdkBuilder.dnsEntry(dnsEntry)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
   * @param dnsEntry 
   */
  public fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty) {
    cdkBuilder.dnsEntry(dnsEntry)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-serviceidentifier)
   * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
   */
  public fun serviceIdentifier(serviceIdentifier: String) {
    cdkBuilder.serviceIdentifier(serviceIdentifier)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   *
   * You must use the ARN if the resources specified in the operation are in different accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-servicenetworkidentifier)
   * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network. 
   */
  public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
    cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
  }

  /**
   * The tags for the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
   * @param tags The tags for the association. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
   * @param tags The tags for the association. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnServiceNetworkServiceAssociation {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
