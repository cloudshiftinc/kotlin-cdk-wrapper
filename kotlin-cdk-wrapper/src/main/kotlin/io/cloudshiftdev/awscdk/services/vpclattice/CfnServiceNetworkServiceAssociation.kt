@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates a service with a service network.
 *
 * For more information, see [Manage service
 * associations](https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-service-associations)
 * in the *Amazon VPC Lattice User Guide* .
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
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
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
public open class CfnServiceNetworkServiceAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the association between the service network and the service.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the association was created, specified in ISO-8601 format.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The domain name of the service.
   */
  public open fun attrDnsEntryDomainName(): String = unwrap(this).getAttrDnsEntryDomainName()

  /**
   * The ID of the hosted zone.
   */
  public open fun attrDnsEntryHostedZoneId(): String = unwrap(this).getAttrDnsEntryHostedZoneId()

  /**
   * The ID of the of the association between the service network and the service.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the service.
   */
  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  /**
   * The ID of the service.
   */
  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  /**
   * The name of the service.
   */
  public open fun attrServiceName(): String = unwrap(this).getAttrServiceName()

  /**
   * The Amazon Resource Name (ARN) of the service network.
   */
  public open fun attrServiceNetworkArn(): String = unwrap(this).getAttrServiceNetworkArn()

  /**
   * The ID of the service network.
   */
  public open fun attrServiceNetworkId(): String = unwrap(this).getAttrServiceNetworkId()

  /**
   * The name of the service network.
   */
  public open fun attrServiceNetworkName(): String = unwrap(this).getAttrServiceNetworkName()

  /**
   * The status of the association between the service network and the service.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The DNS information of the service.
   */
  public open fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

  /**
   * The DNS information of the service.
   */
  public open fun dnsEntry(`value`: IResolvable) {
    unwrap(this).setDnsEntry(`value`.let(IResolvable::unwrap))
  }

  /**
   * The DNS information of the service.
   */
  public open fun dnsEntry(`value`: DnsEntryProperty) {
    unwrap(this).setDnsEntry(`value`.let(DnsEntryProperty::unwrap))
  }

  /**
   * The DNS information of the service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("286345466c63c9fc9562f56aed02421442fa6e09f970b231d637a7ca665e581c")
  public open fun dnsEntry(`value`: DnsEntryProperty.Builder.() -> Unit): Unit =
      dnsEntry(DnsEntryProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   */
  public open fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   */
  public open fun serviceIdentifier(`value`: String) {
    unwrap(this).setServiceIdentifier(`value`)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   */
  public open fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   */
  public open fun serviceNetworkIdentifier(`value`: String) {
    unwrap(this).setServiceNetworkIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the association.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the association.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the association.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
     * @param dnsEntry The DNS information of the service. 
     */
    public fun dnsEntry(dnsEntry: IResolvable)

    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
     * @param dnsEntry The DNS information of the service. 
     */
    public fun dnsEntry(dnsEntry: DnsEntryProperty)

    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
     * @param dnsEntry The DNS information of the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ad1387d452de79c879ccab8c9eb6ba9880df0588b344da8a7a79b571dad85f1")
    public fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit)

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-serviceidentifier)
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * The ID or Amazon Resource Name (ARN) of the service network.
     *
     * You must use the ARN if the resources specified in the operation are in different accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-servicenetworkidentifier)
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network. 
     */
    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String)

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
     * @param tags The tags for the association. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
     * @param tags The tags for the association. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.Builder.create(scope,
        id)

    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
     * @param dnsEntry The DNS information of the service. 
     */
    override fun dnsEntry(dnsEntry: IResolvable) {
      cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
    }

    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
     * @param dnsEntry The DNS information of the service. 
     */
    override fun dnsEntry(dnsEntry: DnsEntryProperty) {
      cdkBuilder.dnsEntry(dnsEntry.let(DnsEntryProperty::unwrap))
    }

    /**
     * The DNS information of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry)
     * @param dnsEntry The DNS information of the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ad1387d452de79c879ccab8c9eb6ba9880df0588b344da8a7a79b571dad85f1")
    override fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit): Unit =
        dnsEntry(DnsEntryProperty(dnsEntry))

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-serviceidentifier)
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
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
    override fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
      cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
     * @param tags The tags for the association. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html#cfn-vpclattice-servicenetworkserviceassociation-tags)
     * @param tags The tags for the association. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceNetworkServiceAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceNetworkServiceAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation):
        CfnServiceNetworkServiceAssociation = CfnServiceNetworkServiceAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkServiceAssociation):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation =
        wrapped.cdkObject
  }

  /**
   * The DNS information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * DnsEntryProperty dnsEntryProperty = DnsEntryProperty.builder()
   * .domainName("domainName")
   * .hostedZoneId("hostedZoneId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetworkserviceassociation-dnsentry.html)
   */
  public interface DnsEntryProperty {
    /**
     * The domain name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetworkserviceassociation-dnsentry.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry-domainname)
     */
    public fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The ID of the hosted zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetworkserviceassociation-dnsentry.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry-hostedzoneid)
     */
    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    /**
     * A builder for [DnsEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainName The domain name of the service.
       */
      public fun domainName(domainName: String)

      /**
       * @param hostedZoneId The ID of the hosted zone.
       */
      public fun hostedZoneId(hostedZoneId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty.builder()

      /**
       * @param domainName The domain name of the service.
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param hostedZoneId The ID of the hosted zone.
       */
      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty,
    ) : CdkObject(cdkObject), DnsEntryProperty {
      /**
       * The domain name of the service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetworkserviceassociation-dnsentry.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry-domainname)
       */
      override fun domainName(): String? = unwrap(this).getDomainName()

      /**
       * The ID of the hosted zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetworkserviceassociation-dnsentry.html#cfn-vpclattice-servicenetworkserviceassociation-dnsentry-hostedzoneid)
       */
      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DnsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty):
          DnsEntryProperty = CdkObjectWrappers.wrap(cdkObject) as DnsEntryProperty

      internal fun unwrap(wrapped: DnsEntryProperty):
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty
    }
  }
}
