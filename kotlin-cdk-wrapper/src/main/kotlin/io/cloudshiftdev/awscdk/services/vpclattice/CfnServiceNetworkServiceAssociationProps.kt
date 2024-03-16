@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnServiceNetworkServiceAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
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
public interface CfnServiceNetworkServiceAssociationProps {
  /**
   * The DNS information of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
   */
  public fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-serviceidentifier)
   */
  public fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   *
   * You must use the ARN if the resources specified in the operation are in different accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-servicenetworkidentifier)
   */
  public fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  /**
   * The tags for the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceNetworkServiceAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dnsEntry The DNS information of the service.
     */
    public fun dnsEntry(dnsEntry: IResolvable)

    /**
     * @param dnsEntry The DNS information of the service.
     */
    public fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty)

    /**
     * @param dnsEntry The DNS information of the service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99183e5e6a292090a3f0e8de85d98eb2ed2f27f781d8b3aae196eea08cacd0dc")
    public
        fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder.() -> Unit)

    /**
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service.
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network.
     * You must use the ARN if the resources specified in the operation are in different accounts.
     */
    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String)

    /**
     * @param tags The tags for the association.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the association.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps.Builder
        =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps.builder()

    /**
     * @param dnsEntry The DNS information of the service.
     */
    override fun dnsEntry(dnsEntry: IResolvable) {
      cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
    }

    /**
     * @param dnsEntry The DNS information of the service.
     */
    override fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty) {
      cdkBuilder.dnsEntry(dnsEntry.let(CfnServiceNetworkServiceAssociation.DnsEntryProperty::unwrap))
    }

    /**
     * @param dnsEntry The DNS information of the service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99183e5e6a292090a3f0e8de85d98eb2ed2f27f781d8b3aae196eea08cacd0dc")
    override
        fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder.() -> Unit):
        Unit = dnsEntry(CfnServiceNetworkServiceAssociation.DnsEntryProperty(dnsEntry))

    /**
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service.
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /**
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network.
     * You must use the ARN if the resources specified in the operation are in different accounts.
     */
    override fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
      cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    /**
     * @param tags The tags for the association.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the association.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps,
  ) : CdkObject(cdkObject), CfnServiceNetworkServiceAssociationProps {
    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
     */
    override fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-serviceidentifier)
     */
    override fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

    /**
     * The ID or Amazon Resource Name (ARN) of the service network.
     *
     * You must use the ARN if the resources specified in the operation are in different accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-servicenetworkidentifier)
     */
    override fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnServiceNetworkServiceAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps):
        CfnServiceNetworkServiceAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnServiceNetworkServiceAssociationProps

    internal fun unwrap(wrapped: CfnServiceNetworkServiceAssociationProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps
  }
}
