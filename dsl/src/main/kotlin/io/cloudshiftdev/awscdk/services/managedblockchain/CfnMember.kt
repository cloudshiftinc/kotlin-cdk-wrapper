package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMember internal constructor(
  private val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrMemberId(): String = unwrap(this).getAttrMemberId()

  public open fun attrNetworkId(): String = unwrap(this).getAttrNetworkId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun invitationId(): String? = unwrap(this).getInvitationId()

  public open fun invitationId(`value`: String) {
    unwrap(this).setInvitationId(`value`)
  }

  public open fun memberConfiguration(): Any = unwrap(this).getMemberConfiguration()

  public open fun memberConfiguration(`value`: IResolvable) {
    unwrap(this).setMemberConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun memberConfiguration(`value`: MemberConfigurationProperty) {
    unwrap(this).setMemberConfiguration(`value`.let(MemberConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("94e5476ecdba6f3b2d86749c8842f2cca2fb03d8d00fefe740ff0d0c4fda6697")
  public open fun memberConfiguration(`value`: MemberConfigurationProperty.Builder.() -> Unit): Unit
      = memberConfiguration(MemberConfigurationProperty(`value`))

  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83eeb82fcfdfbddb37f14356c28fa06f003a732f8633b03d36e5ebf3a821f7f7")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  public open fun networkId(): String? = unwrap(this).getNetworkId()

  public open fun networkId(`value`: String) {
    unwrap(this).setNetworkId(`value`)
  }

  public interface Builder {
    public fun invitationId(invitationId: String) {
    }

    public fun memberConfiguration(memberConfiguration: IResolvable) {
    }

    public fun memberConfiguration(memberConfiguration: MemberConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19fa8a7d67747633bb1899828e09039b0c6804f6c4091c3bee870507b04f9ccb")
    public
        fun memberConfiguration(memberConfiguration: MemberConfigurationProperty.Builder.() -> Unit) {
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
    }

    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8ed69e40a7259bad3ff11dc97008319d48902bad94b785e5c3f609442c293f")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit) {
    }

    public fun networkId(networkId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnMember.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnMember.Builder.create(scope, id)

    public override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    public override fun memberConfiguration(memberConfiguration: IResolvable) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(IResolvable::unwrap))
    }

    public override fun memberConfiguration(memberConfiguration: MemberConfigurationProperty) {
      cdkBuilder.memberConfiguration(memberConfiguration.let(MemberConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19fa8a7d67747633bb1899828e09039b0c6804f6c4091c3bee870507b04f9ccb")
    public override
        fun memberConfiguration(memberConfiguration: MemberConfigurationProperty.Builder.() -> Unit):
        Unit = memberConfiguration(MemberConfigurationProperty(memberConfiguration))

    public override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    public override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8ed69e40a7259bad3ff11dc97008319d48902bad94b785e5c3f609442c293f")
    public override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    public override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnMember =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface ApprovalThresholdPolicyProperty {
    public fun proposalDurationInHours(): Number? = unwrap(this).getProposalDurationInHours()

    public fun thresholdComparator(): String? = unwrap(this).getThresholdComparator()

    public fun thresholdPercentage(): Number? = unwrap(this).getThresholdPercentage()

    public interface Builder {
      public fun proposalDurationInHours(proposalDurationInHours: Number) {
      }

      public fun thresholdComparator(thresholdComparator: String) {
      }

      public fun thresholdPercentage(thresholdPercentage: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty.builder()

      public override fun proposalDurationInHours(proposalDurationInHours: Number) {
        cdkBuilder.proposalDurationInHours(proposalDurationInHours)
      }

      public override fun thresholdComparator(thresholdComparator: String) {
        cdkBuilder.thresholdComparator(thresholdComparator)
      }

      public override fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty,
    ) : ApprovalThresholdPolicyProperty {
      public override fun proposalDurationInHours(): Number? =
          unwrap(this).getProposalDurationInHours()

      public override fun thresholdComparator(): String? = unwrap(this).getThresholdComparator()

      public override fun thresholdPercentage(): Number? = unwrap(this).getThresholdPercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApprovalThresholdPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty):
          ApprovalThresholdPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApprovalThresholdPolicyProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemberConfigurationProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun memberFrameworkConfiguration(): Any? = unwrap(this).getMemberFrameworkConfiguration()

    public fun name(): String

    public interface Builder {
      public fun description(description: String) {
      }

      public fun memberFrameworkConfiguration(memberFrameworkConfiguration: IResolvable) {
      }

      public
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cffad2b009361d2e9c1eaf09696c669a50fea7836c4859b0d6200e8927d11e1")
      public
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun memberFrameworkConfiguration(memberFrameworkConfiguration: IResolvable) {
        cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty) {
        cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration.let(MemberFrameworkConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cffad2b009361d2e9c1eaf09696c669a50fea7836c4859b0d6200e8927d11e1")
      public override
          fun memberFrameworkConfiguration(memberFrameworkConfiguration: MemberFrameworkConfigurationProperty.Builder.() -> Unit):
          Unit =
          memberFrameworkConfiguration(MemberFrameworkConfigurationProperty(memberFrameworkConfiguration))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty,
    ) : MemberConfigurationProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun memberFrameworkConfiguration(): Any? =
          unwrap(this).getMemberFrameworkConfiguration()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemberConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty):
          MemberConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun framework(): String

    public fun frameworkVersion(): String

    public fun name(): String

    public fun networkFrameworkConfiguration(): Any? =
        unwrap(this).getNetworkFrameworkConfiguration()

    public fun votingPolicy(): Any

    public interface Builder {
      public fun description(description: String) {
      }

      public fun framework(framework: String) {
      }

      public fun frameworkVersion(frameworkVersion: String) {
      }

      public fun name(name: String) {
      }

      public fun networkFrameworkConfiguration(networkFrameworkConfiguration: IResolvable) {
      }

      public
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bacded8dd6675d03acb70e2bda8dfbd3ade76beeb5eaf73cf9a547d9ad05c94d")
      public
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty.Builder.() -> Unit) {
      }

      public fun votingPolicy(votingPolicy: IResolvable) {
      }

      public fun votingPolicy(votingPolicy: VotingPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589679952e668736505c572d46bc4c108bdfc44d137efdb263fd5c9fed272177")
      public fun votingPolicy(votingPolicy: VotingPolicyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun framework(framework: String) {
        cdkBuilder.framework(framework)
      }

      public override fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: IResolvable) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration.let(NetworkFrameworkConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bacded8dd6675d03acb70e2bda8dfbd3ade76beeb5eaf73cf9a547d9ad05c94d")
      public override
          fun networkFrameworkConfiguration(networkFrameworkConfiguration: NetworkFrameworkConfigurationProperty.Builder.() -> Unit):
          Unit =
          networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty(networkFrameworkConfiguration))

      public override fun votingPolicy(votingPolicy: IResolvable) {
        cdkBuilder.votingPolicy(votingPolicy.let(IResolvable::unwrap))
      }

      public override fun votingPolicy(votingPolicy: VotingPolicyProperty) {
        cdkBuilder.votingPolicy(votingPolicy.let(VotingPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589679952e668736505c572d46bc4c108bdfc44d137efdb263fd5c9fed272177")
      public override fun votingPolicy(votingPolicy: VotingPolicyProperty.Builder.() -> Unit): Unit
          = votingPolicy(VotingPolicyProperty(votingPolicy))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun framework(): String = unwrap(this).getFramework()

      public override fun frameworkVersion(): String = unwrap(this).getFrameworkVersion()

      public override fun name(): String = unwrap(this).getName()

      public override fun networkFrameworkConfiguration(): Any? =
          unwrap(this).getNetworkFrameworkConfiguration()

      public override fun votingPolicy(): Any = unwrap(this).getVotingPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkFabricConfigurationProperty {
    public fun edition(): String

    public interface Builder {
      public fun edition(edition: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty.builder()

      public override fun edition(edition: String) {
        cdkBuilder.edition(edition)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty,
    ) : NetworkFabricConfigurationProperty {
      public override fun edition(): String = unwrap(this).getEdition()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VotingPolicyProperty {
    public fun approvalThresholdPolicy(): Any? = unwrap(this).getApprovalThresholdPolicy()

    public interface Builder {
      public fun approvalThresholdPolicy(approvalThresholdPolicy: IResolvable) {
      }

      public fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ff3823482d8569df4315391fafa2f2e59ff5ee291eea70dabe5ed444a20a689")
      public
          fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty.Builder =
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty.builder()

      public override fun approvalThresholdPolicy(approvalThresholdPolicy: IResolvable) {
        cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy.let(IResolvable::unwrap))
      }

      public override
          fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty) {
        cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy.let(ApprovalThresholdPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ff3823482d8569df4315391fafa2f2e59ff5ee291eea70dabe5ed444a20a689")
      public override
          fun approvalThresholdPolicy(approvalThresholdPolicy: ApprovalThresholdPolicyProperty.Builder.() -> Unit):
          Unit = approvalThresholdPolicy(ApprovalThresholdPolicyProperty(approvalThresholdPolicy))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty,
    ) : VotingPolicyProperty {
      public override fun approvalThresholdPolicy(): Any? =
          unwrap(this).getApprovalThresholdPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VotingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty):
          VotingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VotingPolicyProperty):
          software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemberFrameworkConfigurationProperty {
    public fun memberFabricConfiguration(): Any? = unwrap(this).getMemberFabricConfiguration()

    public interface Builder {
      public fun memberFabricConfiguration(memberFabricConfiguration: IResolvable) {
      }

      public
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac243ffca22c14be7eac106cca3853c1972358665ec67aa7e75bef27844b52fb")
      public
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty.builder()

      public override fun memberFabricConfiguration(memberFabricConfiguration: IResolvable) {
        cdkBuilder.memberFabricConfiguration(memberFabricConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty) {
        cdkBuilder.memberFabricConfiguration(memberFabricConfiguration.let(MemberFabricConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac243ffca22c14be7eac106cca3853c1972358665ec67aa7e75bef27844b52fb")
      public override
          fun memberFabricConfiguration(memberFabricConfiguration: MemberFabricConfigurationProperty.Builder.() -> Unit):
          Unit =
          memberFabricConfiguration(MemberFabricConfigurationProperty(memberFabricConfiguration))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty,
    ) : MemberFrameworkConfigurationProperty {
      public override fun memberFabricConfiguration(): Any? =
          unwrap(this).getMemberFabricConfiguration()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemberFabricConfigurationProperty {
    public fun adminPassword(): String

    public fun adminUsername(): String

    public interface Builder {
      public fun adminPassword(adminPassword: String) {
      }

      public fun adminUsername(adminUsername: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty.builder()

      public override fun adminPassword(adminPassword: String) {
        cdkBuilder.adminPassword(adminPassword)
      }

      public override fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty,
    ) : MemberFabricConfigurationProperty {
      public override fun adminPassword(): String = unwrap(this).getAdminPassword()

      public override fun adminUsername(): String = unwrap(this).getAdminUsername()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkFrameworkConfigurationProperty {
    public fun networkFabricConfiguration(): Any? = unwrap(this).getNetworkFabricConfiguration()

    public interface Builder {
      public fun networkFabricConfiguration(networkFabricConfiguration: IResolvable) {
      }

      public
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4491c5e51465df27d1fafff65e7d7024932678b533f6339c9920deace3998cfa")
      public
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty.builder()

      public override fun networkFabricConfiguration(networkFabricConfiguration: IResolvable) {
        cdkBuilder.networkFabricConfiguration(networkFabricConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty) {
        cdkBuilder.networkFabricConfiguration(networkFabricConfiguration.let(NetworkFabricConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4491c5e51465df27d1fafff65e7d7024932678b533f6339c9920deace3998cfa")
      public override
          fun networkFabricConfiguration(networkFabricConfiguration: NetworkFabricConfigurationProperty.Builder.() -> Unit):
          Unit =
          networkFabricConfiguration(NetworkFabricConfigurationProperty(networkFabricConfiguration))

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty,
    ) : NetworkFrameworkConfigurationProperty {
      public override fun networkFabricConfiguration(): Any? =
          unwrap(this).getNetworkFabricConfiguration()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }
}
