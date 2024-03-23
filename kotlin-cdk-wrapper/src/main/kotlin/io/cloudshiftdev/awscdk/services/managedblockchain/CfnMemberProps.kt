@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMember`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
 * CfnMemberProps cfnMemberProps = CfnMemberProps.builder()
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
public interface CfnMemberProps {
  /**
   * The unique identifier of the invitation to join the network sent to the account that creates
   * the member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid)
   */
  public fun invitationId(): String? = unwrap(this).getInvitationId()

  /**
   * Configuration properties of the member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
   */
  public fun memberConfiguration(): Any

  /**
   * Configuration properties of the network to which the member belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
   */
  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The unique identifier of the network to which the member belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid)
   */
  public fun networkId(): String? = unwrap(this).getNetworkId()

  /**
   * A builder for [CfnMemberProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param invitationId The unique identifier of the invitation to join the network sent to the
     * account that creates the member.
     */
    public fun invitationId(invitationId: String)

    /**
     * @param memberConfiguration Configuration properties of the member. 
     */
    public fun memberConfiguration(memberConfiguration: IResolvable)

    /**
     * @param memberConfiguration Configuration properties of the member. 
     */
    public fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty)

    /**
     * @param memberConfiguration Configuration properties of the member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dec65a7e1986711377b40cf90333ded70fb709867307c90ee82e0bb534b9ff52")
    public
        fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty.Builder.() -> Unit)

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs.
     */
    public fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty)

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29fba991f72ac7bd26f8006d493b40a1d685ac842f74063bd2cc33f7294f2ed0")
    public
        fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * @param networkId The unique identifier of the network to which the member belongs.
     */
    public fun networkId(networkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnMemberProps.Builder
        = software.amazon.awscdk.services.managedblockchain.CfnMemberProps.builder()

    /**
     * @param invitationId The unique identifier of the invitation to join the network sent to the
     * account that creates the member.
     */
    override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    /**
     * @param memberConfiguration Configuration properties of the member. 
     */
    override fun memberConfiguration(memberConfiguration: IResolvable) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param memberConfiguration Configuration properties of the member. 
     */
    override fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(CfnMember.MemberConfigurationProperty::unwrap))
    }

    /**
     * @param memberConfiguration Configuration properties of the member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dec65a7e1986711377b40cf90333ded70fb709867307c90ee82e0bb534b9ff52")
    override
        fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty.Builder.() -> Unit):
        Unit = memberConfiguration(CfnMember.MemberConfigurationProperty(memberConfiguration))

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs.
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs.
     */
    override
        fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnMember.NetworkConfigurationProperty::unwrap))
    }

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     * belongs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29fba991f72ac7bd26f8006d493b40a1d685ac842f74063bd2cc33f7294f2ed0")
    override
        fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnMember.NetworkConfigurationProperty(networkConfiguration))

    /**
     * @param networkId The unique identifier of the network to which the member belongs.
     */
    override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnMemberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMemberProps,
  ) : CdkObject(cdkObject), CfnMemberProps {
    /**
     * The unique identifier of the invitation to join the network sent to the account that creates
     * the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid)
     */
    override fun invitationId(): String? = unwrap(this).getInvitationId()

    /**
     * Configuration properties of the member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
     */
    override fun memberConfiguration(): Any = unwrap(this).getMemberConfiguration()

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
     */
    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * The unique identifier of the network to which the member belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid)
     */
    override fun networkId(): String? = unwrap(this).getNetworkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMemberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMemberProps):
        CfnMemberProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMemberProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMemberProps):
        software.amazon.awscdk.services.managedblockchain.CfnMemberProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.managedblockchain.CfnMemberProps
  }
}
