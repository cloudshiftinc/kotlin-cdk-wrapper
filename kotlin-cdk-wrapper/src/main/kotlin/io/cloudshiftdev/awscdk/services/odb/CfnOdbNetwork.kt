@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.odb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ODB::OdbNetwork` resource creates an ODB network.
 *
 * An ODB network provides the networking foundation for Oracle Database resources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnOdbNetwork cfnOdbNetwork = CfnOdbNetwork.Builder.create(this, "MyCfnOdbNetwork")
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
public open class CfnOdbNetwork(
  cdkObject: software.amazon.awscdk.services.odb.CfnOdbNetwork,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.odb.CfnOdbNetwork(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOdbNetworkProps,
  ) :
      this(software.amazon.awscdk.services.odb.CfnOdbNetwork(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnOdbNetworkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOdbNetworkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOdbNetworkProps(props)
  )

  /**
   * The unique identifier of the OCI network anchor for the ODB network.
   */
  public open fun attrOciNetworkAnchorId(): String = unwrap(this).getAttrOciNetworkAnchorId()

  /**
   * The name of the OCI resource anchor that's associated with the ODB network.
   */
  public open fun attrOciResourceAnchorName(): String = unwrap(this).getAttrOciResourceAnchorName()

  /**
   * The URL for the VCN that's associated with the ODB network.
   */
  public open fun attrOciVcnUrl(): String = unwrap(this).getAttrOciVcnUrl()

  /**
   * The Amazon Resource Name (ARN) of the ODB network.
   */
  public open fun attrOdbNetworkArn(): String = unwrap(this).getAttrOdbNetworkArn()

  /**
   * The unique identifier of the ODB network.
   */
  public open fun attrOdbNetworkId(): String = unwrap(this).getAttrOdbNetworkId()

  /**
   * The Availability Zone (AZ) where the ODB network is located.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone (AZ) where the ODB network is located.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The AZ ID of the AZ where the ODB network is located.
   */
  public open fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  /**
   * The AZ ID of the AZ where the ODB network is located.
   */
  public open fun availabilityZoneId(`value`: String) {
    unwrap(this).setAvailabilityZoneId(`value`)
  }

  /**
   * The CIDR range of the backup subnet in the ODB network.
   */
  public open fun backupSubnetCidr(): String? = unwrap(this).getBackupSubnetCidr()

  /**
   * The CIDR range of the backup subnet in the ODB network.
   */
  public open fun backupSubnetCidr(`value`: String) {
    unwrap(this).setBackupSubnetCidr(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The CIDR range of the client subnet in the ODB network.
   */
  public open fun clientSubnetCidr(): String? = unwrap(this).getClientSubnetCidr()

  /**
   * The CIDR range of the client subnet in the ODB network.
   */
  public open fun clientSubnetCidr(`value`: String) {
    unwrap(this).setClientSubnetCidr(`value`)
  }

  /**
   * The DNS prefix to the default DNS domain name.
   */
  public open fun defaultDnsPrefix(): String? = unwrap(this).getDefaultDnsPrefix()

  /**
   * The DNS prefix to the default DNS domain name.
   */
  public open fun defaultDnsPrefix(`value`: String) {
    unwrap(this).setDefaultDnsPrefix(`value`)
  }

  /**
   * Specifies whether to delete associated OCI networking resources along with the ODB network.
   */
  public open fun deleteAssociatedResources(): Any? = unwrap(this).getDeleteAssociatedResources()

  /**
   * Specifies whether to delete associated OCI networking resources along with the ODB network.
   */
  public open fun deleteAssociatedResources(`value`: Boolean) {
    unwrap(this).setDeleteAssociatedResources(`value`)
  }

  /**
   * Specifies whether to delete associated OCI networking resources along with the ODB network.
   */
  public open fun deleteAssociatedResources(`value`: IResolvable) {
    unwrap(this).setDeleteAssociatedResources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The user-friendly name of the ODB network.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The user-friendly name of the ODB network.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tags to assign to the Odb Network.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to assign to the Odb Network.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to assign to the Odb Network.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.odb.CfnOdbNetwork].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Availability Zone (AZ) where the ODB network is located.
     *
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzone)
     * @param availabilityZone The Availability Zone (AZ) where the ODB network is located. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The AZ ID of the AZ where the ODB network is located.
     *
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzoneid)
     * @param availabilityZoneId The AZ ID of the AZ where the ODB network is located. 
     */
    public fun availabilityZoneId(availabilityZoneId: String)

    /**
     * The CIDR range of the backup subnet in the ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-backupsubnetcidr)
     * @param backupSubnetCidr The CIDR range of the backup subnet in the ODB network. 
     */
    public fun backupSubnetCidr(backupSubnetCidr: String)

    /**
     * The CIDR range of the client subnet in the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-clientsubnetcidr)
     * @param clientSubnetCidr The CIDR range of the client subnet in the ODB network. 
     */
    public fun clientSubnetCidr(clientSubnetCidr: String)

    /**
     * The DNS prefix to the default DNS domain name.
     *
     * The default DNS domain name is oraclevcn.com.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-defaultdnsprefix)
     * @param defaultDnsPrefix The DNS prefix to the default DNS domain name. 
     */
    public fun defaultDnsPrefix(defaultDnsPrefix: String)

    /**
     * Specifies whether to delete associated OCI networking resources along with the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-deleteassociatedresources)
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network. 
     */
    public fun deleteAssociatedResources(deleteAssociatedResources: Boolean)

    /**
     * Specifies whether to delete associated OCI networking resources along with the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-deleteassociatedresources)
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network. 
     */
    public fun deleteAssociatedResources(deleteAssociatedResources: IResolvable)

    /**
     * The user-friendly name of the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-displayname)
     * @param displayName The user-friendly name of the ODB network. 
     */
    public fun displayName(displayName: String)

    /**
     * Tags to assign to the Odb Network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-tags)
     * @param tags Tags to assign to the Odb Network. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to assign to the Odb Network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-tags)
     * @param tags Tags to assign to the Odb Network. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.odb.CfnOdbNetwork.Builder =
        software.amazon.awscdk.services.odb.CfnOdbNetwork.Builder.create(scope, id)

    /**
     * The Availability Zone (AZ) where the ODB network is located.
     *
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzone)
     * @param availabilityZone The Availability Zone (AZ) where the ODB network is located. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The AZ ID of the AZ where the ODB network is located.
     *
     * Required when creating an ODB network. Specify either AvailabilityZone or AvailabilityZoneId
     * to define the location of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-availabilityzoneid)
     * @param availabilityZoneId The AZ ID of the AZ where the ODB network is located. 
     */
    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    /**
     * The CIDR range of the backup subnet in the ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-backupsubnetcidr)
     * @param backupSubnetCidr The CIDR range of the backup subnet in the ODB network. 
     */
    override fun backupSubnetCidr(backupSubnetCidr: String) {
      cdkBuilder.backupSubnetCidr(backupSubnetCidr)
    }

    /**
     * The CIDR range of the client subnet in the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-clientsubnetcidr)
     * @param clientSubnetCidr The CIDR range of the client subnet in the ODB network. 
     */
    override fun clientSubnetCidr(clientSubnetCidr: String) {
      cdkBuilder.clientSubnetCidr(clientSubnetCidr)
    }

    /**
     * The DNS prefix to the default DNS domain name.
     *
     * The default DNS domain name is oraclevcn.com.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-defaultdnsprefix)
     * @param defaultDnsPrefix The DNS prefix to the default DNS domain name. 
     */
    override fun defaultDnsPrefix(defaultDnsPrefix: String) {
      cdkBuilder.defaultDnsPrefix(defaultDnsPrefix)
    }

    /**
     * Specifies whether to delete associated OCI networking resources along with the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-deleteassociatedresources)
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network. 
     */
    override fun deleteAssociatedResources(deleteAssociatedResources: Boolean) {
      cdkBuilder.deleteAssociatedResources(deleteAssociatedResources)
    }

    /**
     * Specifies whether to delete associated OCI networking resources along with the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-deleteassociatedresources)
     * @param deleteAssociatedResources Specifies whether to delete associated OCI networking
     * resources along with the ODB network. 
     */
    override fun deleteAssociatedResources(deleteAssociatedResources: IResolvable) {
      cdkBuilder.deleteAssociatedResources(deleteAssociatedResources.let(IResolvable.Companion::unwrap))
    }

    /**
     * The user-friendly name of the ODB network.
     *
     * Required when creating an ODB network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-displayname)
     * @param displayName The user-friendly name of the ODB network. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Tags to assign to the Odb Network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-tags)
     * @param tags Tags to assign to the Odb Network. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to assign to the Odb Network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-odbnetwork.html#cfn-odb-odbnetwork-tags)
     * @param tags Tags to assign to the Odb Network. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.odb.CfnOdbNetwork = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.odb.CfnOdbNetwork.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOdbNetwork {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOdbNetwork(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnOdbNetwork): CfnOdbNetwork =
        CfnOdbNetwork(cdkObject)

    internal fun unwrap(wrapped: CfnOdbNetwork): software.amazon.awscdk.services.odb.CfnOdbNetwork =
        wrapped.cdkObject as software.amazon.awscdk.services.odb.CfnOdbNetwork
  }
}
