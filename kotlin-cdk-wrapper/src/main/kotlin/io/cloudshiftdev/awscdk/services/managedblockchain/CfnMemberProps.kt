@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnMemberProps {
  public fun invitationId(): String? = unwrap(this).getInvitationId()

  public fun memberConfiguration(): Any

  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public fun networkId(): String? = unwrap(this).getNetworkId()

  @CdkDslMarker
  public interface Builder {
    public fun invitationId(invitationId: String)

    public fun memberConfiguration(memberConfiguration: IResolvable)

    public fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dec65a7e1986711377b40cf90333ded70fb709867307c90ee82e0bb534b9ff52")
    public
        fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty.Builder.() -> Unit)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29fba991f72ac7bd26f8006d493b40a1d685ac842f74063bd2cc33f7294f2ed0")
    public
        fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty.Builder.() -> Unit)

    public fun networkId(networkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnMemberProps.Builder
        = software.amazon.awscdk.services.managedblockchain.CfnMemberProps.builder()

    override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    override fun memberConfiguration(memberConfiguration: IResolvable) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(IResolvable::unwrap))
    }

    override fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(CfnMember.MemberConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dec65a7e1986711377b40cf90333ded70fb709867307c90ee82e0bb534b9ff52")
    override
        fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty.Builder.() -> Unit):
        Unit = memberConfiguration(CfnMember.MemberConfigurationProperty(memberConfiguration))

    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    override
        fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnMember.NetworkConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29fba991f72ac7bd26f8006d493b40a1d685ac842f74063bd2cc33f7294f2ed0")
    override
        fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnMember.NetworkConfigurationProperty(networkConfiguration))

    override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnMemberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMemberProps,
  ) : CdkObject(cdkObject), CfnMemberProps {
    override fun invitationId(): String? = unwrap(this).getInvitationId()

    override fun memberConfiguration(): Any = unwrap(this).getMemberConfiguration()

    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    override fun networkId(): String? = unwrap(this).getNetworkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMemberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMemberProps):
        CfnMemberProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMemberProps):
        software.amazon.awscdk.services.managedblockchain.CfnMemberProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.managedblockchain.CfnMemberProps
  }
}
