@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.odb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnOdbNetwork`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnOdbNetworkProps cfnOdbNetworkProps = CfnOdbNetworkProps.builder()
 * .availabilityZone("availabilityZone")
 * .availabilityZoneId("availabilityZoneId")
 * .backupSubnetCidr("backupSubnetCidr")
 * .clientSubnetCidr("clientSubnetCidr")
 * .defaultDnsPrefix("defaultDnsPrefix")
 * .deleteAssociatedResources(false)
 * .displayName("displayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html)
 */
public interface CfnOdbNetworkProps {
  /**
   * The Availability Zone (AZ) where the ODB network is located.
   *
   * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId to
   * define the location of the network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The AZ ID of the AZ where the ODB network is located.
   *
   * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId to
   * define the location of the network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzoneid)
   */
  public fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  /**
   * The CIDR range of the backup subnet in the ODB network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-backupsubnetcidr)
   */
  public fun backupSubnetCidr(): String? = unwrap(this).getBackupSubnetCidr()

  /**
   * The CIDR range of the client subnet in the ODB network.
   *
   * Required when creating an ODB network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-clientsubnetcidr)
   */
  public fun clientSubnetCidr(): String? = unwrap(this).getClientSubnetCidr()

  /**
   * The DNS prefix to the default DNS domain name.
   *
   * The default DNS domain name is oraclevcn.com.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-defaultdnsprefix)
   */
  public fun defaultDnsPrefix(): String? = unwrap(this).getDefaultDnsPrefix()

  /**
   * Specifies whether to delete associated OCI networking resources along with the ODB network.
   *
   * Required when creating an ODB network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-deleteassociatedresources)
   */
  public fun deleteAssociatedResources(): Any? = unwrap(this).getDeleteAssociatedResources()

  /**
   * The user-friendly name of the ODB network.
   *
   * Required when creating an ODB network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * Tags to assign to the Odb Network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnOdbNetworkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The Availability Zone (AZ) where the ODB network is located.
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param availabilityZoneId The AZ ID of the AZ where the ODB network is located.
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     */
    public fun availabilityZoneId(availabilityZoneId: String)

    /**
     * @param backupSubnetCidr The CIDR range of the backup subnet in the ODB network.
     */
    public fun backupSubnetCidr(backupSubnetCidr: String)

    /**
     * @param clientSubnetCidr The CIDR range of the client subnet in the ODB network.
     * Required when creating an ODB network.
     */
    public fun clientSubnetCidr(clientSubnetCidr: String)

    /**
     * @param defaultDnsPrefix The DNS prefix to the default DNS domain name.
     * The default DNS domain name is oraclevcn.com.
     */
    public fun defaultDnsPrefix(defaultDnsPrefix: String)

    /**
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network.
     * Required when creating an ODB network.
     */
    public fun deleteAssociatedResources(deleteAssociatedResources: Boolean)

    /**
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network.
     * Required when creating an ODB network.
     */
    public fun deleteAssociatedResources(deleteAssociatedResources: IResolvable)

    /**
     * @param displayName The user-friendly name of the ODB network.
     * Required when creating an ODB network.
     */
    public fun displayName(displayName: String)

    /**
     * @param tags Tags to assign to the Odb Network.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to assign to the Odb Network.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.odb.CfnOdbNetworkProps.Builder =
        software.amazon.awscdk.services.odb.CfnOdbNetworkProps.builder()

    /**
     * @param availabilityZone The Availability Zone (AZ) where the ODB network is located.
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param availabilityZoneId The AZ ID of the AZ where the ODB network is located.
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     */
    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    /**
     * @param backupSubnetCidr The CIDR range of the backup subnet in the ODB network.
     */
    override fun backupSubnetCidr(backupSubnetCidr: String) {
      cdkBuilder.backupSubnetCidr(backupSubnetCidr)
    }

    /**
     * @param clientSubnetCidr The CIDR range of the client subnet in the ODB network.
     * Required when creating an ODB network.
     */
    override fun clientSubnetCidr(clientSubnetCidr: String) {
      cdkBuilder.clientSubnetCidr(clientSubnetCidr)
    }

    /**
     * @param defaultDnsPrefix The DNS prefix to the default DNS domain name.
     * The default DNS domain name is oraclevcn.com.
     */
    override fun defaultDnsPrefix(defaultDnsPrefix: String) {
      cdkBuilder.defaultDnsPrefix(defaultDnsPrefix)
    }

    /**
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network.
     * Required when creating an ODB network.
     */
    override fun deleteAssociatedResources(deleteAssociatedResources: Boolean) {
      cdkBuilder.deleteAssociatedResources(deleteAssociatedResources)
    }

    /**
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network.
     * Required when creating an ODB network.
     */
    override fun deleteAssociatedResources(deleteAssociatedResources: IResolvable) {
      cdkBuilder.deleteAssociatedResources(deleteAssociatedResources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param displayName The user-friendly name of the ODB network.
     * Required when creating an ODB network.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param tags Tags to assign to the Odb Network.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to assign to the Odb Network.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.odb.CfnOdbNetworkProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.odb.CfnOdbNetworkProps,
  ) : CdkObject(cdkObject),
      CfnOdbNetworkProps {
    /**
     * The Availability Zone (AZ) where the ODB network is located.
     *
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The AZ ID of the AZ where the ODB network is located.
     *
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzoneid)
     */
    override fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

    /**
     * The CIDR range of the backup subnet in the ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-backupsubnetcidr)
     */
    override fun backupSubnetCidr(): String? = unwrap(this).getBackupSubnetCidr()

    /**
     * The CIDR range of the client subnet in the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-clientsubnetcidr)
     */
    override fun clientSubnetCidr(): String? = unwrap(this).getClientSubnetCidr()

    /**
     * The DNS prefix to the default DNS domain name.
     *
     * The default DNS domain name is oraclevcn.com.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-defaultdnsprefix)
     */
    override fun defaultDnsPrefix(): String? = unwrap(this).getDefaultDnsPrefix()

    /**
     * Specifies whether to delete associated OCI networking resources along with the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-deleteassociatedresources)
     */
    override fun deleteAssociatedResources(): Any? = unwrap(this).getDeleteAssociatedResources()

    /**
     * The user-friendly name of the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * Tags to assign to the Odb Network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOdbNetworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnOdbNetworkProps):
        CfnOdbNetworkProps = CdkObjectWrappers.wrap(cdkObject) as? CfnOdbNetworkProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOdbNetworkProps):
        software.amazon.awscdk.services.odb.CfnOdbNetworkProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.odb.CfnOdbNetworkProps
  }
}
