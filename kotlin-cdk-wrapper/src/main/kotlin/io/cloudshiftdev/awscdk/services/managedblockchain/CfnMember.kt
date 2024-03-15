@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a member within a Managed Blockchain network.
 *
 * Applies only to Hyperledger Fabric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
 * CfnMember cfnMember = CfnMember.Builder.create(this, "MyCfnMember")
 * .memberConfiguration(MemberConfigurationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .memberFrameworkConfiguration(MemberFrameworkConfigurationProperty.builder()
 * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
 * .adminPassword("adminPassword")
 * .adminUsername("adminUsername")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .invitationId("invitationId")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .name("name")
 * .votingPolicy(VotingPolicyProperty.builder()
 * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
 * .proposalDurationInHours(123)
 * .thresholdComparator("thresholdComparator")
 * .thresholdPercentage(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty.builder()
 * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
 * .edition("edition")
 * .build())
 * .build())
 * .build())
 * .networkId("networkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html)
 */
public open class CfnMember internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The unique identifier of the member.
   */
  public open fun attrMemberId(): String = unwrap(this).getAttrMemberId()

  /**
   * The unique identifier of the network to which the member belongs.
   */
  public open fun attrNetworkId(): String = unwrap(this).getAttrNetworkId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The unique identifier of the invitation to join the network sent to the account that creates
   * the member.
   */
  public open fun invitationId(): String? = unwrap(this).getInvitationId()

  /**
   * The unique identifier of the invitation to join the network sent to the account that creates
   * the member.
   */
  public open fun invitationId(`value`: String) {
    unwrap(this).setInvitationId(`value`)
  }

  /**
   * Configuration properties of the member.
   */
  public open fun memberConfiguration(): Any = unwrap(this).getMemberConfiguration()

  /**
   * Configuration properties of the member.
   */
  public open fun memberConfiguration(`value`: IResolvable) {
    unwrap(this).setMemberConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration properties of the member.
   */
  public open fun memberConfiguration(`value`: MemberConfigurationProperty) {
    unwrap(this).setMemberConfiguration(`value`.let(MemberConfigurationProperty::unwrap))
  }

  /**
   * Configuration properties of the member.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("94e5476ecdba6f3b2d86749c8842f2cca2fb03d8d00fefe740ff0d0c4fda6697")
  public open fun memberConfiguration(`value`: MemberConfigurationProperty.Builder.() -> Unit): Unit
      = memberConfiguration(MemberConfigurationProperty(`value`))

  /**
   * Configuration properties of the network to which the member belongs.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * Configuration properties of the network to which the member belongs.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration properties of the network to which the member belongs.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  /**
   * Configuration properties of the network to which the member belongs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83eeb82fcfdfbddb37f14356c28fa06f003a732f8633b03d36e5ebf3a821f7f7")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  /**
   * The unique identifier of the network to which the member belongs.
   */
  public open fun networkId(): String? = unwrap(this).getNetworkId()

  /**
   * The unique identifier of the network to which the member belongs.
   */
  public open fun networkId(`value`: String) {
    unwrap(this).setNetworkId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.managedblockchain.CfnMember].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the invitation to join the network sent to the account that creates
     * the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid)
     * @param invitationId The unique identifier of the invitation to join the network sent to the
     * account that creates the member. 
     */
    public fun invitationId(invitationId: String)

    /**
     * Configuration properties of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
     * @param memberConfiguration Configuration properties of the member. 
     */
    public fun memberConfiguration(memberConfiguration: IResolvable)

    /**
     * Configuration properties of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
     * @param memberConfiguration Configuration properties of the member. 
     */
    public fun memberConfiguration(memberConfiguration: MemberConfigurationProperty)

    /**
     * Configuration properties of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
     * @param memberConfiguration Configuration properties of the member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19fa8a7d67747633bb1899828e09039b0c6804f6c4091c3bee870507b04f9ccb")
    public
        fun memberConfiguration(memberConfiguration: MemberConfigurationProperty.Builder.() -> Unit)

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs. 
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs. 
     */
    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8ed69e40a7259bad3ff11dc97008319d48902bad94b785e5c3f609442c293f")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * The unique identifier of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid)
     * @param networkId The unique identifier of the network to which the member belongs. 
     */
    public fun networkId(networkId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnMember.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnMember.Builder.create(scope, id)

    /**
     * The unique identifier of the invitation to join the network sent to the account that creates
     * the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid)
     * @param invitationId The unique identifier of the invitation to join the network sent to the
     * account that creates the member. 
     */
    override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    /**
     * Configuration properties of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
     * @param memberConfiguration Configuration properties of the member. 
     */
    override fun memberConfiguration(memberConfiguration: IResolvable) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration properties of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
     * @param memberConfiguration Configuration properties of the member. 
     */
    override fun memberConfiguration(memberConfiguration: MemberConfigurationProperty) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(MemberConfigurationProperty::unwrap))
    }

    /**
     * Configuration properties of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
     * @param memberConfiguration Configuration properties of the member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19fa8a7d67747633bb1899828e09039b0c6804f6c4091c3bee870507b04f9ccb")
    override
        fun memberConfiguration(memberConfiguration: MemberConfigurationProperty.Builder.() -> Unit):
        Unit = memberConfiguration(MemberConfigurationProperty(memberConfiguration))

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs. 
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs. 
     */
    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8ed69e40a7259bad3ff11dc97008319d48902bad94b785e5c3f609442c293f")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    /**
     * The unique identifier of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid)
     * @param networkId The unique identifier of the network to which the member belongs. 
     */
    override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnMember =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.managedblockchain.CfnMember.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMember {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMember(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember):
        CfnMember = CfnMember(cdkObject)

    internal fun unwrap(wrapped: CfnMember):
        software.amazon.awscdk.services.managedblockchain.CfnMember = wrapped.cdkObject
  }

  /**
   * A policy type that defines the voting rules for the network.
   *
   * The rules decide if a proposal is approved. Approval may be based on criteria such as the
   * percentage of `YES` votes and the duration of the proposal. The policy applies to all proposals
   * and is specified when the network is created.
   *
   * Applies only to Hyperledger Fabric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * ApprovalThresholdPolicyProperty approvalThresholdPolicyProperty =
   * ApprovalThresholdPolicyProperty.builder()
   * .proposalDurationInHours(123)
   * .thresholdComparator("thresholdComparator")
   * .thresholdPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html)
   */
  public interface ApprovalThresholdPolicyProperty {
    /**
     * The duration from the time that a proposal is created until it expires.
     *
     * If members cast neither the required number of `YES` votes to approve the proposal nor the
     * number of `NO` votes required to reject it before the duration expires, the proposal is
     * `EXPIRED` and `ProposalActions` aren't carried out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-proposaldurationinhours)
     */
    public fun proposalDurationInHours(): Number? = unwrap(this).getProposalDurationInHours()

    /**
     * Determines whether the vote percentage must be greater than the `ThresholdPercentage` or must
     * be greater than or equal to the `ThresholdPercentage` to be approved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdcomparator)
     */
    public fun thresholdComparator(): String? = unwrap(this).getThresholdComparator()

    /**
     * The percentage of votes among all members that must be `YES` for a proposal to be approved.
     *
     * For example, a `ThresholdPercentage` value of `50` indicates 50%. The `ThresholdComparator`
     * determines the precise comparison. If a `ThresholdPercentage` value of `50` is specified on a
     * network with 10 members, along with a `ThresholdComparator` value of `GREATER_THAN` , this
     * indicates that 6 `YES` votes are required for the proposal to be approved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdpercentage)
     */
    public fun thresholdPercentage(): Number? = unwrap(this).getThresholdPercentage()

    /**
     * A builder for [ApprovalThresholdPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param proposalDurationInHours The duration from the time that a proposal is created until
       * it expires.
       * If members cast neither the required number of `YES` votes to approve the proposal nor the
       * number of `NO` votes required to reject it before the duration expires, the proposal is
       * `EXPIRED` and `ProposalActions` aren't carried out.
       */
      public fun proposalDurationInHours(proposalDurationInHours: Number)

      /**
       * @param thresholdComparator Determines whether the vote percentage must be greater than the
       * `ThresholdPercentage` or must be greater than or equal to the `ThresholdPercentage` to be
       * approved.
       */
      public fun thresholdComparator(thresholdComparator: String)

      /**
       * @param thresholdPercentage The percentage of votes among all members that must be `YES` for
       * a proposal to be approved.
       * For example, a `ThresholdPercentage` value of `50` indicates 50%. The `ThresholdComparator`
       * determines the precise comparison. If a `ThresholdPercentage` value of `50` is specified on a
       * network with 10 members, along with a `ThresholdComparator` value of `GREATER_THAN` , this
       * indicates that 6 `YES` votes are required for the proposal to be approved.
       */
      public fun thresholdPercentage(thresholdPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty.builder()

      /**
       * @param proposalDurationInHours The duration from the time that a proposal is created until
       * it expires.
       * If members cast neither the required number of `YES` votes to approve the proposal nor the
       * number of `NO` votes required to reject it before the duration expires, the proposal is
       * `EXPIRED` and `ProposalActions` aren't carried out.
       */
      override fun proposalDurationInHours(proposalDurationInHours: Number) {
        cdkBuilder.proposalDurationInHours(proposalDurationInHours)
      }

      /**
       * @param thresholdComparator Determines whether the vote percentage must be greater than the
       * `ThresholdPercentage` or must be greater than or equal to the `ThresholdPercentage` to be
       * approved.
       */
      override fun thresholdComparator(thresholdComparator: String) {
        cdkBuilder.thresholdComparator(thresholdComparator)
      }

      /**
       * @param thresholdPercentage The percentage of votes among all members that must be `YES` for
       * a proposal to be approved.
       * For example, a `ThresholdPercentage` value of `50` indicates 50%. The `ThresholdComparator`
       * determines the precise comparison. If a `ThresholdPercentage` value of `50` is specified on a
       * network with 10 members, along with a `ThresholdComparator` value of `GREATER_THAN` , this
       * indicates that 6 `YES` votes are required for the proposal to be approved.
       */
      override fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty,
    ) : CdkObject(cdkObject), ApprovalThresholdPolicyProperty {
      /**
       * The duration from the time that a proposal is created until it expires.
       *
       * If members cast neither the required number of `YES` votes to approve the proposal nor the
       * number of `NO` votes required to reject it before the duration expires, the proposal is
       * `EXPIRED` and `ProposalActions` aren't carried out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-proposaldurationinhours)
       */
      override fun proposalDurationInHours(): Number? = unwrap(this).getProposalDurationInHours()

      /**
       * Determines whether the vote percentage must be greater than the `ThresholdPercentage` or
       * must be greater than or equal to the `ThresholdPercentage` to be approved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdcomparator)
       */
      override fun thresholdComparator(): String? = unwrap(this).getThresholdComparator()

      /**
       * The percentage of votes among all members that must be `YES` for a proposal to be approved.
       *
       * For example, a `ThresholdPercentage` value of `50` indicates 50%. The `ThresholdComparator`
       * determines the precise comparison. If a `ThresholdPercentage` value of `50` is specified on a
       * network with 10 members, along with a `ThresholdComparator` value of `GREATER_THAN` , this
       * indicates that 6 `YES` votes are required for the proposal to be approved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdpercentage)
       */
      override fun thresholdPercentage(): Number? = unwrap(this).getThresholdPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApprovalThresholdPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty):
          ApprovalThresholdPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApprovalThresholdPolicyProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty
    }
  }

  /**
   * Configuration properties of the member.
   *
   * Applies only to Hyperledger Fabric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * MemberConfigurationProperty memberConfigurationProperty = MemberConfigurationProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .memberFrameworkConfiguration(MemberFrameworkConfigurationProperty.builder()
   * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
   * .adminPassword("adminPassword")
   * .adminUsername("adminUsername")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html)
   */
  public interface MemberConfigurationProperty {
    /**
     * An optional description of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html#cfn-managedblockchain-member-memberconfiguration-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Configuration properties of the blockchain framework relevant to the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html#cfn-managedblockchain-member-memberconfiguration-memberframeworkconfiguration)
     */
    public fun memberFrameworkConfiguration(): Any? = unwrap(this).getMemberFrameworkConfiguration()

    /**
     * The name of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html#cfn-managedblockchain-member-memberconfiguration-name)
     */
    public fun name(): String

    /**
     * A builder for [MemberConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description An optional description of the member.
       */
      public fun description(description: String)

      /**
       * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
       * relevant to the member.
       */
      public fun memberFrameworkConfiguration(memberFrameworkConfiguration: IResolvable)

      /**
       * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
       * relevant to the member.
       */
      public
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty)

      /**
       * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
       * relevant to the member.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cffad2b009361d2e9c1eaf09696c669a50fea7836c4859b0d6200e8927d11e1")
      public
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param name The name of the member. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty.builder()

      /**
       * @param description An optional description of the member.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
       * relevant to the member.
       */
      override fun memberFrameworkConfiguration(memberFrameworkConfiguration: IResolvable) {
        cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
       * relevant to the member.
       */
      override
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty) {
        cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration.let(MemberFrameworkConfigurationProperty::unwrap))
      }

      /**
       * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
       * relevant to the member.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cffad2b009361d2e9c1eaf09696c669a50fea7836c4859b0d6200e8927d11e1")
      override
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty.Builder.() -> Unit):
          Unit =
          memberFrameworkConfiguration(MemberFrameworkConfigurationProperty(memberFrameworkConfiguration))

      /**
       * @param name The name of the member. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty,
    ) : CdkObject(cdkObject), MemberConfigurationProperty {
      /**
       * An optional description of the member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html#cfn-managedblockchain-member-memberconfiguration-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Configuration properties of the blockchain framework relevant to the member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html#cfn-managedblockchain-member-memberconfiguration-memberframeworkconfiguration)
       */
      override fun memberFrameworkConfiguration(): Any? =
          unwrap(this).getMemberFrameworkConfiguration()

      /**
       * The name of the member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html#cfn-managedblockchain-member-memberconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemberConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty):
          MemberConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty
    }
  }

  /**
   * Configuration properties of the network to which the member belongs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * NetworkConfigurationProperty networkConfigurationProperty =
   * NetworkConfigurationProperty.builder()
   * .framework("framework")
   * .frameworkVersion("frameworkVersion")
   * .name("name")
   * .votingPolicy(VotingPolicyProperty.builder()
   * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
   * .proposalDurationInHours(123)
   * .thresholdComparator("thresholdComparator")
   * .thresholdPercentage(123)
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty.builder()
   * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
   * .edition("edition")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html)
   */
  public interface NetworkConfigurationProperty {
    /**
     * Attributes of the blockchain framework for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The blockchain framework that the network uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-framework)
     */
    public fun framework(): String

    /**
     * The version of the blockchain framework that the network uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-frameworkversion)
     */
    public fun frameworkVersion(): String

    /**
     * The name of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-name)
     */
    public fun name(): String

    /**
     * Configuration properties relevant to the network for the blockchain framework that the
     * network uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-networkframeworkconfiguration)
     */
    public fun networkFrameworkConfiguration(): Any? =
        unwrap(this).getNetworkFrameworkConfiguration()

    /**
     * The voting rules that the network uses to decide if a proposal is accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-votingpolicy)
     */
    public fun votingPolicy(): Any

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description Attributes of the blockchain framework for the network.
       */
      public fun description(description: String)

      /**
       * @param framework The blockchain framework that the network uses. 
       */
      public fun framework(framework: String)

      /**
       * @param frameworkVersion The version of the blockchain framework that the network uses. 
       */
      public fun frameworkVersion(frameworkVersion: String)

      /**
       * @param name The name of the network. 
       */
      public fun name(name: String)

      /**
       * @param networkFrameworkConfiguration Configuration properties relevant to the network for
       * the blockchain framework that the network uses.
       */
      public fun networkFrameworkConfiguration(networkFrameworkConfiguration: IResolvable)

      /**
       * @param networkFrameworkConfiguration Configuration properties relevant to the network for
       * the blockchain framework that the network uses.
       */
      public
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty)

      /**
       * @param networkFrameworkConfiguration Configuration properties relevant to the network for
       * the blockchain framework that the network uses.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bacded8dd6675d03acb70e2bda8dfbd3ade76beeb5eaf73cf9a547d9ad05c94d")
      public
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param votingPolicy The voting rules that the network uses to decide if a proposal is
       * accepted. 
       */
      public fun votingPolicy(votingPolicy: IResolvable)

      /**
       * @param votingPolicy The voting rules that the network uses to decide if a proposal is
       * accepted. 
       */
      public fun votingPolicy(votingPolicy: VotingPolicyProperty)

      /**
       * @param votingPolicy The voting rules that the network uses to decide if a proposal is
       * accepted. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589679952e668736505c572d46bc4c108bdfc44d137efdb263fd5c9fed272177")
      public fun votingPolicy(votingPolicy: VotingPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty.builder()

      /**
       * @param description Attributes of the blockchain framework for the network.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param framework The blockchain framework that the network uses. 
       */
      override fun framework(framework: String) {
        cdkBuilder.framework(framework)
      }

      /**
       * @param frameworkVersion The version of the blockchain framework that the network uses. 
       */
      override fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
      }

      /**
       * @param name The name of the network. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param networkFrameworkConfiguration Configuration properties relevant to the network for
       * the blockchain framework that the network uses.
       */
      override fun networkFrameworkConfiguration(networkFrameworkConfiguration: IResolvable) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param networkFrameworkConfiguration Configuration properties relevant to the network for
       * the blockchain framework that the network uses.
       */
      override
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration.let(NetworkFrameworkConfigurationProperty::unwrap))
      }

      /**
       * @param networkFrameworkConfiguration Configuration properties relevant to the network for
       * the blockchain framework that the network uses.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bacded8dd6675d03acb70e2bda8dfbd3ade76beeb5eaf73cf9a547d9ad05c94d")
      override
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty.Builder.() -> Unit):
          Unit =
          networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty(networkFrameworkConfiguration))

      /**
       * @param votingPolicy The voting rules that the network uses to decide if a proposal is
       * accepted. 
       */
      override fun votingPolicy(votingPolicy: IResolvable) {
        cdkBuilder.votingPolicy(votingPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param votingPolicy The voting rules that the network uses to decide if a proposal is
       * accepted. 
       */
      override fun votingPolicy(votingPolicy: VotingPolicyProperty) {
        cdkBuilder.votingPolicy(votingPolicy.let(VotingPolicyProperty::unwrap))
      }

      /**
       * @param votingPolicy The voting rules that the network uses to decide if a proposal is
       * accepted. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589679952e668736505c572d46bc4c108bdfc44d137efdb263fd5c9fed272177")
      override fun votingPolicy(votingPolicy: VotingPolicyProperty.Builder.() -> Unit): Unit =
          votingPolicy(VotingPolicyProperty(votingPolicy))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * Attributes of the blockchain framework for the network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The blockchain framework that the network uses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-framework)
       */
      override fun framework(): String = unwrap(this).getFramework()

      /**
       * The version of the blockchain framework that the network uses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-frameworkversion)
       */
      override fun frameworkVersion(): String = unwrap(this).getFrameworkVersion()

      /**
       * The name of the network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Configuration properties relevant to the network for the blockchain framework that the
       * network uses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-networkframeworkconfiguration)
       */
      override fun networkFrameworkConfiguration(): Any? =
          unwrap(this).getNetworkFrameworkConfiguration()

      /**
       * The voting rules that the network uses to decide if a proposal is accepted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-votingpolicy)
       */
      override fun votingPolicy(): Any = unwrap(this).getVotingPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty
    }
  }

  /**
   * Hyperledger Fabric configuration properties for the network.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * NetworkFabricConfigurationProperty networkFabricConfigurationProperty =
   * NetworkFabricConfigurationProperty.builder()
   * .edition("edition")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html)
   */
  public interface NetworkFabricConfigurationProperty {
    /**
     * The edition of Amazon Managed Blockchain that the network uses.
     *
     * Valid values are `standard` and `starter` . For more information, see [Amazon Managed
     * Blockchain Pricing](https://docs.aws.amazon.com/managed-blockchain/pricing/)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html#cfn-managedblockchain-member-networkfabricconfiguration-edition)
     */
    public fun edition(): String

    /**
     * A builder for [NetworkFabricConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param edition The edition of Amazon Managed Blockchain that the network uses. 
       * Valid values are `standard` and `starter` . For more information, see [Amazon Managed
       * Blockchain Pricing](https://docs.aws.amazon.com/managed-blockchain/pricing/)
       */
      public fun edition(edition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty.builder()

      /**
       * @param edition The edition of Amazon Managed Blockchain that the network uses. 
       * Valid values are `standard` and `starter` . For more information, see [Amazon Managed
       * Blockchain Pricing](https://docs.aws.amazon.com/managed-blockchain/pricing/)
       */
      override fun edition(edition: String) {
        cdkBuilder.edition(edition)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkFabricConfigurationProperty {
      /**
       * The edition of Amazon Managed Blockchain that the network uses.
       *
       * Valid values are `standard` and `starter` . For more information, see [Amazon Managed
       * Blockchain Pricing](https://docs.aws.amazon.com/managed-blockchain/pricing/)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html#cfn-managedblockchain-member-networkfabricconfiguration-edition)
       */
      override fun edition(): String = unwrap(this).getEdition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkFabricConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty):
          NetworkFabricConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkFabricConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty
    }
  }

  /**
   * The voting rules for the network to decide if a proposal is accepted.
   *
   * Applies only to Hyperledger Fabric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * VotingPolicyProperty votingPolicyProperty = VotingPolicyProperty.builder()
   * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
   * .proposalDurationInHours(123)
   * .thresholdComparator("thresholdComparator")
   * .thresholdPercentage(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html)
   */
  public interface VotingPolicyProperty {
    /**
     * Defines the rules for the network for voting on proposals, such as the percentage of `YES`
     * votes required for the proposal to be approved and the duration of the proposal.
     *
     * The policy applies to all proposals and is specified when the network is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html#cfn-managedblockchain-member-votingpolicy-approvalthresholdpolicy)
     */
    public fun approvalThresholdPolicy(): Any? = unwrap(this).getApprovalThresholdPolicy()

    /**
     * A builder for [VotingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
       * such as the percentage of `YES` votes required for the proposal to be approved and the
       * duration of the proposal.
       * The policy applies to all proposals and is specified when the network is created.
       */
      public fun approvalThresholdPolicy(approvalThresholdPolicy: IResolvable)

      /**
       * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
       * such as the percentage of `YES` votes required for the proposal to be approved and the
       * duration of the proposal.
       * The policy applies to all proposals and is specified when the network is created.
       */
      public fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty)

      /**
       * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
       * such as the percentage of `YES` votes required for the proposal to be approved and the
       * duration of the proposal.
       * The policy applies to all proposals and is specified when the network is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ff3823482d8569df4315391fafa2f2e59ff5ee291eea70dabe5ed444a20a689")
      public
          fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty.Builder =
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty.builder()

      /**
       * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
       * such as the percentage of `YES` votes required for the proposal to be approved and the
       * duration of the proposal.
       * The policy applies to all proposals and is specified when the network is created.
       */
      override fun approvalThresholdPolicy(approvalThresholdPolicy: IResolvable) {
        cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
       * such as the percentage of `YES` votes required for the proposal to be approved and the
       * duration of the proposal.
       * The policy applies to all proposals and is specified when the network is created.
       */
      override
          fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty) {
        cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy.let(ApprovalThresholdPolicyProperty::unwrap))
      }

      /**
       * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
       * such as the percentage of `YES` votes required for the proposal to be approved and the
       * duration of the proposal.
       * The policy applies to all proposals and is specified when the network is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ff3823482d8569df4315391fafa2f2e59ff5ee291eea70dabe5ed444a20a689")
      override
          fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty.Builder.() -> Unit):
          Unit = approvalThresholdPolicy(ApprovalThresholdPolicyProperty(approvalThresholdPolicy))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty,
    ) : CdkObject(cdkObject), VotingPolicyProperty {
      /**
       * Defines the rules for the network for voting on proposals, such as the percentage of `YES`
       * votes required for the proposal to be approved and the duration of the proposal.
       *
       * The policy applies to all proposals and is specified when the network is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html#cfn-managedblockchain-member-votingpolicy-approvalthresholdpolicy)
       */
      override fun approvalThresholdPolicy(): Any? = unwrap(this).getApprovalThresholdPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VotingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty):
          VotingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VotingPolicyProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty
    }
  }

  /**
   * Configuration properties relevant to a member for the blockchain framework that the Managed
   * Blockchain network uses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * MemberFrameworkConfigurationProperty memberFrameworkConfigurationProperty =
   * MemberFrameworkConfigurationProperty.builder()
   * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
   * .adminPassword("adminPassword")
   * .adminUsername("adminUsername")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberframeworkconfiguration.html)
   */
  public interface MemberFrameworkConfigurationProperty {
    /**
     * Configuration properties for Hyperledger Fabric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberframeworkconfiguration.html#cfn-managedblockchain-member-memberframeworkconfiguration-memberfabricconfiguration)
     */
    public fun memberFabricConfiguration(): Any? = unwrap(this).getMemberFabricConfiguration()

    /**
     * A builder for [MemberFrameworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
       */
      public fun memberFabricConfiguration(memberFabricConfiguration: IResolvable)

      /**
       * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
       */
      public
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty)

      /**
       * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac243ffca22c14be7eac106cca3853c1972358665ec67aa7e75bef27844b52fb")
      public
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty.builder()

      /**
       * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
       */
      override fun memberFabricConfiguration(memberFabricConfiguration: IResolvable) {
        cdkBuilder.memberFabricConfiguration(memberFabricConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
       */
      override
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty) {
        cdkBuilder.memberFabricConfiguration(memberFabricConfiguration.let(MemberFabricConfigurationProperty::unwrap))
      }

      /**
       * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac243ffca22c14be7eac106cca3853c1972358665ec67aa7e75bef27844b52fb")
      override
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty.Builder.() -> Unit):
          Unit =
          memberFabricConfiguration(MemberFabricConfigurationProperty(memberFabricConfiguration))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty,
    ) : CdkObject(cdkObject), MemberFrameworkConfigurationProperty {
      /**
       * Configuration properties for Hyperledger Fabric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberframeworkconfiguration.html#cfn-managedblockchain-member-memberframeworkconfiguration-memberfabricconfiguration)
       */
      override fun memberFabricConfiguration(): Any? = unwrap(this).getMemberFabricConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MemberFrameworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty):
          MemberFrameworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberFrameworkConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty
    }
  }

  /**
   * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network
   * that is using the Hyperledger Fabric framework.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * MemberFabricConfigurationProperty memberFabricConfigurationProperty =
   * MemberFabricConfigurationProperty.builder()
   * .adminPassword("adminPassword")
   * .adminUsername("adminUsername")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html)
   */
  public interface MemberFabricConfigurationProperty {
    /**
     * The password for the member's initial administrative user.
     *
     * The `AdminPassword` must be at least 8 characters long and no more than 32 characters. It
     * must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot have
     * a single quotation mark (‘), a double quotation marks (“), a forward slash(/), a backward
     * slash(),
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminpassword)
     */
    public fun adminPassword(): String

    /**
     * The user name for the member's initial administrative user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminusername)
     */
    public fun adminUsername(): String

    /**
     * A builder for [MemberFabricConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adminPassword The password for the member's initial administrative user. 
       * The `AdminPassword` must be at least 8 characters long and no more than 32 characters. It
       * must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot
       * have a single quotation mark (‘), a double quotation marks (“), a forward slash(/), a backward
       * slash(),
       */
      public fun adminPassword(adminPassword: String)

      /**
       * @param adminUsername The user name for the member's initial administrative user. 
       */
      public fun adminUsername(adminUsername: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty.builder()

      /**
       * @param adminPassword The password for the member's initial administrative user. 
       * The `AdminPassword` must be at least 8 characters long and no more than 32 characters. It
       * must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot
       * have a single quotation mark (‘), a double quotation marks (“), a forward slash(/), a backward
       * slash(),
       */
      override fun adminPassword(adminPassword: String) {
        cdkBuilder.adminPassword(adminPassword)
      }

      /**
       * @param adminUsername The user name for the member's initial administrative user. 
       */
      override fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty,
    ) : CdkObject(cdkObject), MemberFabricConfigurationProperty {
      /**
       * The password for the member's initial administrative user.
       *
       * The `AdminPassword` must be at least 8 characters long and no more than 32 characters. It
       * must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot
       * have a single quotation mark (‘), a double quotation marks (“), a forward slash(/), a backward
       * slash(),
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminpassword)
       */
      override fun adminPassword(): String = unwrap(this).getAdminPassword()

      /**
       * The user name for the member's initial administrative user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminusername)
       */
      override fun adminUsername(): String = unwrap(this).getAdminUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MemberFabricConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty):
          MemberFabricConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberFabricConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty
    }
  }

  /**
   * Configuration properties relevant to the network for the blockchain framework that the network
   * uses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * NetworkFrameworkConfigurationProperty networkFrameworkConfigurationProperty =
   * NetworkFrameworkConfigurationProperty.builder()
   * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
   * .edition("edition")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html)
   */
  public interface NetworkFrameworkConfigurationProperty {
    /**
     * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network
     * that is using the Hyperledger Fabric framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html#cfn-managedblockchain-member-networkframeworkconfiguration-networkfabricconfiguration)
     */
    public fun networkFabricConfiguration(): Any? = unwrap(this).getNetworkFabricConfiguration()

    /**
     * A builder for [NetworkFrameworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
       * member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
       */
      public fun networkFabricConfiguration(networkFabricConfiguration: IResolvable)

      /**
       * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
       * member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
       */
      public
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty)

      /**
       * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
       * member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4491c5e51465df27d1fafff65e7d7024932678b533f6339c9920deace3998cfa")
      public
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty.builder()

      /**
       * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
       * member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
       */
      override fun networkFabricConfiguration(networkFabricConfiguration: IResolvable) {
        cdkBuilder.networkFabricConfiguration(networkFabricConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
       * member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
       */
      override
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty) {
        cdkBuilder.networkFabricConfiguration(networkFabricConfiguration.let(NetworkFabricConfigurationProperty::unwrap))
      }

      /**
       * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
       * member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4491c5e51465df27d1fafff65e7d7024932678b533f6339c9920deace3998cfa")
      override
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty.Builder.() -> Unit):
          Unit =
          networkFabricConfiguration(NetworkFabricConfigurationProperty(networkFabricConfiguration))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkFrameworkConfigurationProperty {
      /**
       * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain
       * network that is using the Hyperledger Fabric framework.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html#cfn-managedblockchain-member-networkframeworkconfiguration-networkfabricconfiguration)
       */
      override fun networkFabricConfiguration(): Any? = unwrap(this).getNetworkFabricConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkFrameworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty):
          NetworkFrameworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkFrameworkConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty
    }
  }
}
