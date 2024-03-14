package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFirewallRuleGroupAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the firewall rule group association.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the association was created, in Unix time format and Coordinated
   * Universal Time (UTC).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * A unique string defined by you to identify the request.
   *
   * This allows you to retry failed requests without the risk of running the operation twice. This
   * can be any unique string, for example, a timestamp.
   */
  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  /**
   * The identifier for the association.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The owner of the association, used only for associations that are not managed by you.
   *
   * If you use AWS Firewall Manager to manage your firewallls from DNS Firewall, then this reports
   * Firewall Manager as the managed owner.
   */
  public open fun attrManagedOwnerName(): String = unwrap(this).getAttrManagedOwnerName()

  /**
   * The date and time that the association was last modified, in Unix time format and Coordinated
   * Universal Time (UTC).
   */
  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  /**
   * The current status of the association.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Additional information about the status of the response, if available.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * The unique identifier of the firewall rule group.
   */
  public open fun firewallRuleGroupId(): String = unwrap(this).getFirewallRuleGroupId()

  /**
   * The unique identifier of the firewall rule group.
   */
  public open fun firewallRuleGroupId(`value`: String) {
    unwrap(this).setFirewallRuleGroupId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * If enabled, this setting disallows modification or removal of the association, to help prevent
   * against accidentally altering DNS firewall protections.
   */
  public open fun mutationProtection(): String? = unwrap(this).getMutationProtection()

  /**
   * If enabled, this setting disallows modification or removal of the association, to help prevent
   * against accidentally altering DNS firewall protections.
   */
  public open fun mutationProtection(`value`: String) {
    unwrap(this).setMutationProtection(`value`)
  }

  /**
   * The name of the association.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the association.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The setting that determines the processing order of the rule group among the rule groups that
   * are associated with a single VPC.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * The setting that determines the processing order of the rule group among the rule groups that
   * are associated with a single VPC.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The unique identifier of the VPC that is associated with the rule group.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The unique identifier of the VPC that is associated with the rule group.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the firewall rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-firewallrulegroupid)
     * @param firewallRuleGroupId The unique identifier of the firewall rule group. 
     */
    public fun firewallRuleGroupId(firewallRuleGroupId: String)

    /**
     * If enabled, this setting disallows modification or removal of the association, to help
     * prevent against accidentally altering DNS firewall protections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-mutationprotection)
     * @param mutationProtection If enabled, this setting disallows modification or removal of the
     * association, to help prevent against accidentally altering DNS firewall protections. 
     */
    public fun mutationProtection(mutationProtection: String)

    /**
     * The name of the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-name)
     * @param name The name of the association. 
     */
    public fun name(name: String)

    /**
     * The setting that determines the processing order of the rule group among the rule groups that
     * are associated with a single VPC.
     *
     * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
     * setting.
     *
     * You must specify a unique priority for each rule group that you associate with a single VPC.
     * To make it easier to insert rule groups later, leave space between the numbers, for example, use
     * 101, 200, and so on. You can change the priority setting for a rule group association after you
     * create it.
     *
     * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-priority)
     * @param priority The setting that determines the processing order of the rule group among the
     * rule groups that are associated with a single VPC. 
     */
    public fun priority(priority: Number)

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The unique identifier of the VPC that is associated with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-vpcid)
     * @param vpcId The unique identifier of the VPC that is associated with the rule group. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation.Builder.create(scope,
        id)

    /**
     * The unique identifier of the firewall rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-firewallrulegroupid)
     * @param firewallRuleGroupId The unique identifier of the firewall rule group. 
     */
    override fun firewallRuleGroupId(firewallRuleGroupId: String) {
      cdkBuilder.firewallRuleGroupId(firewallRuleGroupId)
    }

    /**
     * If enabled, this setting disallows modification or removal of the association, to help
     * prevent against accidentally altering DNS firewall protections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-mutationprotection)
     * @param mutationProtection If enabled, this setting disallows modification or removal of the
     * association, to help prevent against accidentally altering DNS firewall protections. 
     */
    override fun mutationProtection(mutationProtection: String) {
      cdkBuilder.mutationProtection(mutationProtection)
    }

    /**
     * The name of the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-name)
     * @param name The name of the association. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The setting that determines the processing order of the rule group among the rule groups that
     * are associated with a single VPC.
     *
     * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
     * setting.
     *
     * You must specify a unique priority for each rule group that you associate with a single VPC.
     * To make it easier to insert rule groups later, leave space between the numbers, for example, use
     * 101, 200, and so on. You can change the priority setting for a rule group association after you
     * create it.
     *
     * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-priority)
     * @param priority The setting that determines the processing order of the rule group among the
     * rule groups that are associated with a single VPC. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The unique identifier of the VPC that is associated with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-vpcid)
     * @param vpcId The unique identifier of the VPC that is associated with the rule group. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewallRuleGroupAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewallRuleGroupAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation):
        CfnFirewallRuleGroupAssociation = CfnFirewallRuleGroupAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallRuleGroupAssociation):
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation =
        wrapped.cdkObject
  }
}
