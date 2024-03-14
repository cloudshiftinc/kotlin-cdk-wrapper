package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInsightsAnalysis internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalAccounts(): List<String> = unwrap(this).getAdditionalAccounts() ?:
      emptyList()

  public open fun additionalAccounts(`value`: List<String>) {
    unwrap(this).setAdditionalAccounts(`value`)
  }

  public open fun attrAlternatePathHints(): IResolvable =
      unwrap(this).getAttrAlternatePathHints().let(IResolvable::wrap)

  public open fun attrExplanations(): IResolvable =
      unwrap(this).getAttrExplanations().let(IResolvable::wrap)

  public open fun attrForwardPathComponents(): IResolvable =
      unwrap(this).getAttrForwardPathComponents().let(IResolvable::wrap)

  public open fun attrNetworkInsightsAnalysisArn(): String =
      unwrap(this).getAttrNetworkInsightsAnalysisArn()

  public open fun attrNetworkInsightsAnalysisId(): String =
      unwrap(this).getAttrNetworkInsightsAnalysisId()

  public open fun attrNetworkPathFound(): IResolvable =
      unwrap(this).getAttrNetworkPathFound().let(IResolvable::wrap)

  public open fun attrReturnPathComponents(): IResolvable =
      unwrap(this).getAttrReturnPathComponents().let(IResolvable::wrap)

  public open fun attrStartDate(): String = unwrap(this).getAttrStartDate()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public open fun attrSuggestedAccounts(): List<String> = unwrap(this).getAttrSuggestedAccounts() ?:
      emptyList()

  public open fun filterInArns(): List<String> = unwrap(this).getFilterInArns() ?: emptyList()

  public open fun filterInArns(`value`: List<String>) {
    unwrap(this).setFilterInArns(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkInsightsPathId(): String = unwrap(this).getNetworkInsightsPathId()

  public open fun networkInsightsPathId(`value`: String) {
    unwrap(this).setNetworkInsightsPathId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun additionalAccounts(additionalAccounts: List<String>) {
    }

    public fun filterInArns(filterInArns: List<String>) {
    }

    public fun networkInsightsPathId(networkInsightsPathId: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.Builder.create(scope, id)

    public override fun additionalAccounts(additionalAccounts: List<String>) {
      cdkBuilder.additionalAccounts(additionalAccounts)
    }

    public override fun filterInArns(filterInArns: List<String>) {
      cdkBuilder.filterInArns(filterInArns)
    }

    public override fun networkInsightsPathId(networkInsightsPathId: String) {
      cdkBuilder.networkInsightsPathId(networkInsightsPathId)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInsightsAnalysis {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInsightsAnalysis(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis):
        CfnNetworkInsightsAnalysis = CfnNetworkInsightsAnalysis(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAnalysis):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis = wrapped.cdkObject
  }

  public interface AnalysisLoadBalancerTargetProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun instance(): Any? = unwrap(this).getInstance()

    public fun port(): Number? = unwrap(this).getPort()

    public interface Builder {
      public fun address(address: String) {
      }

      public fun availabilityZone(availabilityZone: String) {
      }

      public fun instance(instance: IResolvable) {
      }

      public fun instance(instance: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99c0121ac134ff4330b632d0cf7673bb9de5076daaf8656dadfc64ce2b0c9d44")
      public fun instance(instance: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun port(port: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public override fun instance(instance: IResolvable) {
        cdkBuilder.instance(instance.let(IResolvable::unwrap))
      }

      public override fun instance(instance: AnalysisComponentProperty) {
        cdkBuilder.instance(instance.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99c0121ac134ff4330b632d0cf7673bb9de5076daaf8656dadfc64ce2b0c9d44")
      public override fun instance(instance: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          instance(AnalysisComponentProperty(instance))

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty,
    ) : AnalysisLoadBalancerTargetProperty {
      public override fun address(): String? = unwrap(this).getAddress()

      public override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      public override fun instance(): Any? = unwrap(this).getInstance()

      public override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisLoadBalancerTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty):
          AnalysisLoadBalancerTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisLoadBalancerTargetProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExplanationProperty {
    public fun acl(): Any? = unwrap(this).getAcl()

    public fun aclRule(): Any? = unwrap(this).getAclRule()

    public fun address(): String? = unwrap(this).getAddress()

    public fun addresses(): List<String> = unwrap(this).getAddresses() ?: emptyList()

    public fun attachedTo(): Any? = unwrap(this).getAttachedTo()

    public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    public fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

    public fun classicLoadBalancerListener(): Any? = unwrap(this).getClassicLoadBalancerListener()

    public fun component(): Any? = unwrap(this).getComponent()

    public fun componentAccount(): String? = unwrap(this).getComponentAccount()

    public fun componentRegion(): String? = unwrap(this).getComponentRegion()

    public fun customerGateway(): Any? = unwrap(this).getCustomerGateway()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

    public fun direction(): String? = unwrap(this).getDirection()

    public fun elasticLoadBalancerListener(): Any? = unwrap(this).getElasticLoadBalancerListener()

    public fun explanationCode(): String? = unwrap(this).getExplanationCode()

    public fun ingressRouteTable(): Any? = unwrap(this).getIngressRouteTable()

    public fun internetGateway(): Any? = unwrap(this).getInternetGateway()

    public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    public fun loadBalancerListenerPort(): Number? = unwrap(this).getLoadBalancerListenerPort()

    public fun loadBalancerTarget(): Any? = unwrap(this).getLoadBalancerTarget()

    public fun loadBalancerTargetGroup(): Any? = unwrap(this).getLoadBalancerTargetGroup()

    public fun loadBalancerTargetGroups(): Any? = unwrap(this).getLoadBalancerTargetGroups()

    public fun loadBalancerTargetPort(): Number? = unwrap(this).getLoadBalancerTargetPort()

    public fun missingComponent(): String? = unwrap(this).getMissingComponent()

    public fun natGateway(): Any? = unwrap(this).getNatGateway()

    public fun networkInterface(): Any? = unwrap(this).getNetworkInterface()

    public fun packetField(): String? = unwrap(this).getPacketField()

    public fun port(): Number? = unwrap(this).getPort()

    public fun portRanges(): Any? = unwrap(this).getPortRanges()

    public fun prefixList(): Any? = unwrap(this).getPrefixList()

    public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    public fun routeTable(): Any? = unwrap(this).getRouteTable()

    public fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

    public fun securityGroup(): Any? = unwrap(this).getSecurityGroup()

    public fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

    public fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

    public fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

    public fun state(): String? = unwrap(this).getState()

    public fun subnet(): Any? = unwrap(this).getSubnet()

    public fun subnetRouteTable(): Any? = unwrap(this).getSubnetRouteTable()

    public fun transitGateway(): Any? = unwrap(this).getTransitGateway()

    public fun transitGatewayAttachment(): Any? = unwrap(this).getTransitGatewayAttachment()

    public fun transitGatewayRouteTable(): Any? = unwrap(this).getTransitGatewayRouteTable()

    public fun transitGatewayRouteTableRoute(): Any? =
        unwrap(this).getTransitGatewayRouteTableRoute()

    public fun vpc(): Any? = unwrap(this).getVpc()

    public fun vpcEndpoint(): Any? = unwrap(this).getVpcEndpoint()

    public fun vpcPeeringConnection(): Any? = unwrap(this).getVpcPeeringConnection()

    public fun vpnConnection(): Any? = unwrap(this).getVpnConnection()

    public fun vpnGateway(): Any? = unwrap(this).getVpnGateway()

    public interface Builder {
      public fun acl(acl: IResolvable) {
      }

      public fun acl(acl: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1998d6412063241d81e90c6c0031c5d022f5ff74947e8a227d51c691d9aee28")
      public fun acl(acl: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun aclRule(aclRule: IResolvable) {
      }

      public fun aclRule(aclRule: AnalysisAclRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d19fce45f2a87810c3b586a351e9a18be3ae9e512b24a79482722ce2d9fa2a86")
      public fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit) {
      }

      public fun address(address: String) {
      }

      public fun addresses(addresses: List<String>) {
      }

      public fun attachedTo(attachedTo: IResolvable) {
      }

      public fun attachedTo(attachedTo: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01150afd5fcce850597a9a8c13865b687d2babebc2e550c94c6861feafe33bc6")
      public fun attachedTo(attachedTo: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun availabilityZones(availabilityZones: List<String>) {
      }

      public fun cidrs(cidrs: List<String>) {
      }

      public fun classicLoadBalancerListener(classicLoadBalancerListener: IResolvable) {
      }

      public
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9451419d8679443564bc955972142fb9e76cc03f8ba4b83eec108d87c301a6ea")
      public
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty.Builder.() -> Unit) {
      }

      public fun component(component: IResolvable) {
      }

      public fun component(component: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da032909557b7fe260b797a54e345e5f8b7205724950b2330594af4c85e2bc6")
      public fun component(component: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun componentAccount(componentAccount: String) {
      }

      public fun componentRegion(componentRegion: String) {
      }

      public fun customerGateway(customerGateway: IResolvable) {
      }

      public fun customerGateway(customerGateway: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d11e5a080e9afebbc359fd3635c20be04c5f664ada5e55f279cc81e8d2cd4a")
      public fun customerGateway(customerGateway: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a686803273cded7f10780e613aaa8e09a3f9e725007ebd45cc620046de307505")
      public fun destination(destination: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun destinationVpc(destinationVpc: IResolvable) {
      }

      public fun destinationVpc(destinationVpc: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f51af5adec137b322543aa5b0b0d2b9894b124914af8bb8ad9a0aa98f1c9c2ea")
      public fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun direction(direction: String) {
      }

      public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
      }

      public
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1fdfba6aeeb3261bf38a00eb32725b5dc751dbf2a0606d7e257de9d71ee93b")
      public
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun explanationCode(explanationCode: String) {
      }

      public fun ingressRouteTable(ingressRouteTable: IResolvable) {
      }

      public fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773755699fd1941dfadb46cba6b17aabf027d523e82b5f1d6dcc0d910c59cb58")
      public
          fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun internetGateway(internetGateway: IResolvable) {
      }

      public fun internetGateway(internetGateway: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7610131dafb58869d284817acb538b96dc622ac86180ea6244101ffc8ab185af")
      public fun internetGateway(internetGateway: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun loadBalancerArn(loadBalancerArn: String) {
      }

      public fun loadBalancerListenerPort(loadBalancerListenerPort: Number) {
      }

      public fun loadBalancerTarget(loadBalancerTarget: IResolvable) {
      }

      public fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61717c60f169baa5bb513b1dea51b8c8aa9dfd236d5775835d402c8ba86819ea")
      public
          fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty.Builder.() -> Unit) {
      }

      public fun loadBalancerTargetGroup(loadBalancerTargetGroup: IResolvable) {
      }

      public fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fce53699efcc97f67cbae9f09981daf56e3e0705f08614d046cf91c1a234404")
      public
          fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun loadBalancerTargetGroups(loadBalancerTargetGroups: IResolvable) {
      }

      public fun loadBalancerTargetGroups(loadBalancerTargetGroups: List<Any>) {
      }

      public fun loadBalancerTargetPort(loadBalancerTargetPort: Number) {
      }

      public fun missingComponent(missingComponent: String) {
      }

      public fun natGateway(natGateway: IResolvable) {
      }

      public fun natGateway(natGateway: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa801e01d40ce33c9b25562393ea028bfe9c43f5ed7d605725a8f56615b919ac")
      public fun natGateway(natGateway: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun networkInterface(networkInterface: IResolvable) {
      }

      public fun networkInterface(networkInterface: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7450aedbd567f718c75cede2762de6ba2186748203910a6d9a1a34a52354f9e7")
      public fun networkInterface(networkInterface: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun packetField(packetField: String) {
      }

      public fun port(port: Number) {
      }

      public fun portRanges(portRanges: IResolvable) {
      }

      public fun portRanges(portRanges: List<Any>) {
      }

      public fun prefixList(prefixList: IResolvable) {
      }

      public fun prefixList(prefixList: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da1c72a17748568ee9f55443dff6778305e20c538f7276338708663554a72e6")
      public fun prefixList(prefixList: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun protocols(protocols: List<String>) {
      }

      public fun routeTable(routeTable: IResolvable) {
      }

      public fun routeTable(routeTable: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("addd8d3e5338b52fe2640bcbabf54aadd69b710bdd658262a9d5d87ca019e953")
      public fun routeTable(routeTable: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun routeTableRoute(routeTableRoute: IResolvable) {
      }

      public fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("077f21603e1c6ac087e6d67c0b048cc3951551a991fb719bd1d193325f1101ff")
      public
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit) {
      }

      public fun securityGroup(securityGroup: IResolvable) {
      }

      public fun securityGroup(securityGroup: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a57eb2f9eb9322cb9ff3b93a37f91e6352d6bd8f90fe4feba0989e1ee56e9cbf")
      public fun securityGroup(securityGroup: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun securityGroupRule(securityGroupRule: IResolvable) {
      }

      public fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e492823be51adb2a2414d80236e38df04a8dc309a590a9df62e986acbdfa6e87")
      public
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit) {
      }

      public fun securityGroups(securityGroups: IResolvable) {
      }

      public fun securityGroups(securityGroups: List<Any>) {
      }

      public fun sourceVpc(sourceVpc: IResolvable) {
      }

      public fun sourceVpc(sourceVpc: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27af9107563805c956e34b6cd29236fe3f85d8c6a90cf764db26f60685a9b2e5")
      public fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun state(state: String) {
      }

      public fun subnet(subnet: IResolvable) {
      }

      public fun subnet(subnet: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b128827dcace50aa299c80150525f5fec902a4ed3a2546229850bb96682ca78")
      public fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun subnetRouteTable(subnetRouteTable: IResolvable) {
      }

      public fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a40c9d124152a53b14f80b23a58e155706f768bb73eb83d38b6967b3f2ee4d2")
      public fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun transitGateway(transitGateway: IResolvable) {
      }

      public fun transitGateway(transitGateway: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50266278c0845fca742e5d73d33fa93efb0b72c2fb8141dc083edc1228c4409d")
      public fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun transitGatewayAttachment(transitGatewayAttachment: IResolvable) {
      }

      public fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e6dad8a30a668f3899dccee9584f41c7eaec54585d826bd02217e01d514f914")
      public
          fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun transitGatewayRouteTable(transitGatewayRouteTable: IResolvable) {
      }

      public fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a7e4cca421d1ea8cc6c7407dd2ac9e6357d695efff1399351669ca0c03d761e")
      public
          fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
      }

      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c4950e82f10db35eb78952cfc65d01e2463d6ff92f05eb0e0f7e1c02df89fcc")
      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit) {
      }

      public fun vpc(vpc: IResolvable) {
      }

      public fun vpc(vpc: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b9579f79b35a2679bdc9a34d7b81d4de6f4b4df83097553d8fd0e8f47ac433")
      public fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun vpcEndpoint(vpcEndpoint: IResolvable) {
      }

      public fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf6c7e8e6abb4afdf2a4fcec210177d1c2cbc27eb69931f026da17bc8c57f925")
      public fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun vpcPeeringConnection(vpcPeeringConnection: IResolvable) {
      }

      public fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fb68077a808fd6bb36e2bb7582c7b0d6c7a4e55663ab7f4e19ef9207233ef52")
      public
          fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun vpnConnection(vpnConnection: IResolvable) {
      }

      public fun vpnConnection(vpnConnection: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a06080ec27a8e104f495416404d4065e86ad807d4c24b86ad554ec55bb6704c0")
      public fun vpnConnection(vpnConnection: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun vpnGateway(vpnGateway: IResolvable) {
      }

      public fun vpnGateway(vpnGateway: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc28fbd01369a3708d7b71693a81ceb38cdc4ba3d0de7d8b77fd55f13281aecb")
      public fun vpnGateway(vpnGateway: AnalysisComponentProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty.builder()

      public override fun acl(acl: IResolvable) {
        cdkBuilder.acl(acl.let(IResolvable::unwrap))
      }

      public override fun acl(acl: AnalysisComponentProperty) {
        cdkBuilder.acl(acl.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1998d6412063241d81e90c6c0031c5d022f5ff74947e8a227d51c691d9aee28")
      public override fun acl(acl: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          acl(AnalysisComponentProperty(acl))

      public override fun aclRule(aclRule: IResolvable) {
        cdkBuilder.aclRule(aclRule.let(IResolvable::unwrap))
      }

      public override fun aclRule(aclRule: AnalysisAclRuleProperty) {
        cdkBuilder.aclRule(aclRule.let(AnalysisAclRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d19fce45f2a87810c3b586a351e9a18be3ae9e512b24a79482722ce2d9fa2a86")
      public override fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit): Unit =
          aclRule(AnalysisAclRuleProperty(aclRule))

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun addresses(addresses: List<String>) {
        cdkBuilder.addresses(addresses)
      }

      public override fun attachedTo(attachedTo: IResolvable) {
        cdkBuilder.attachedTo(attachedTo.let(IResolvable::unwrap))
      }

      public override fun attachedTo(attachedTo: AnalysisComponentProperty) {
        cdkBuilder.attachedTo(attachedTo.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01150afd5fcce850597a9a8c13865b687d2babebc2e550c94c6861feafe33bc6")
      public override fun attachedTo(attachedTo: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = attachedTo(AnalysisComponentProperty(attachedTo))

      public override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      public override fun cidrs(cidrs: List<String>) {
        cdkBuilder.cidrs(cidrs)
      }

      public override fun classicLoadBalancerListener(classicLoadBalancerListener: IResolvable) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener.let(IResolvable::unwrap))
      }

      public override
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener.let(AnalysisLoadBalancerListenerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9451419d8679443564bc955972142fb9e76cc03f8ba4b83eec108d87c301a6ea")
      public override
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty.Builder.() -> Unit):
          Unit =
          classicLoadBalancerListener(AnalysisLoadBalancerListenerProperty(classicLoadBalancerListener))

      public override fun component(component: IResolvable) {
        cdkBuilder.component(component.let(IResolvable::unwrap))
      }

      public override fun component(component: AnalysisComponentProperty) {
        cdkBuilder.component(component.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da032909557b7fe260b797a54e345e5f8b7205724950b2330594af4c85e2bc6")
      public override fun component(component: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          component(AnalysisComponentProperty(component))

      public override fun componentAccount(componentAccount: String) {
        cdkBuilder.componentAccount(componentAccount)
      }

      public override fun componentRegion(componentRegion: String) {
        cdkBuilder.componentRegion(componentRegion)
      }

      public override fun customerGateway(customerGateway: IResolvable) {
        cdkBuilder.customerGateway(customerGateway.let(IResolvable::unwrap))
      }

      public override fun customerGateway(customerGateway: AnalysisComponentProperty) {
        cdkBuilder.customerGateway(customerGateway.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d11e5a080e9afebbc359fd3635c20be04c5f664ada5e55f279cc81e8d2cd4a")
      public override
          fun customerGateway(customerGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          customerGateway(AnalysisComponentProperty(customerGateway))

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: AnalysisComponentProperty) {
        cdkBuilder.destination(destination.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a686803273cded7f10780e613aaa8e09a3f9e725007ebd45cc620046de307505")
      public override fun destination(destination: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = destination(AnalysisComponentProperty(destination))

      public override fun destinationVpc(destinationVpc: IResolvable) {
        cdkBuilder.destinationVpc(destinationVpc.let(IResolvable::unwrap))
      }

      public override fun destinationVpc(destinationVpc: AnalysisComponentProperty) {
        cdkBuilder.destinationVpc(destinationVpc.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f51af5adec137b322543aa5b0b0d2b9894b124914af8bb8ad9a0aa98f1c9c2ea")
      public override
          fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          destinationVpc(AnalysisComponentProperty(destinationVpc))

      public override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      public override fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(IResolvable::unwrap))
      }

      public override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1fdfba6aeeb3261bf38a00eb32725b5dc751dbf2a0606d7e257de9d71ee93b")
      public override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = elasticLoadBalancerListener(AnalysisComponentProperty(elasticLoadBalancerListener))

      public override fun explanationCode(explanationCode: String) {
        cdkBuilder.explanationCode(explanationCode)
      }

      public override fun ingressRouteTable(ingressRouteTable: IResolvable) {
        cdkBuilder.ingressRouteTable(ingressRouteTable.let(IResolvable::unwrap))
      }

      public override fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty) {
        cdkBuilder.ingressRouteTable(ingressRouteTable.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773755699fd1941dfadb46cba6b17aabf027d523e82b5f1d6dcc0d910c59cb58")
      public override
          fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = ingressRouteTable(AnalysisComponentProperty(ingressRouteTable))

      public override fun internetGateway(internetGateway: IResolvable) {
        cdkBuilder.internetGateway(internetGateway.let(IResolvable::unwrap))
      }

      public override fun internetGateway(internetGateway: AnalysisComponentProperty) {
        cdkBuilder.internetGateway(internetGateway.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7610131dafb58869d284817acb538b96dc622ac86180ea6244101ffc8ab185af")
      public override
          fun internetGateway(internetGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          internetGateway(AnalysisComponentProperty(internetGateway))

      public override fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
      }

      public override fun loadBalancerListenerPort(loadBalancerListenerPort: Number) {
        cdkBuilder.loadBalancerListenerPort(loadBalancerListenerPort)
      }

      public override fun loadBalancerTarget(loadBalancerTarget: IResolvable) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget.let(IResolvable::unwrap))
      }

      public override
          fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget.let(AnalysisLoadBalancerTargetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61717c60f169baa5bb513b1dea51b8c8aa9dfd236d5775835d402c8ba86819ea")
      public override
          fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty.Builder.() -> Unit):
          Unit = loadBalancerTarget(AnalysisLoadBalancerTargetProperty(loadBalancerTarget))

      public override fun loadBalancerTargetGroup(loadBalancerTargetGroup: IResolvable) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup.let(IResolvable::unwrap))
      }

      public override
          fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fce53699efcc97f67cbae9f09981daf56e3e0705f08614d046cf91c1a234404")
      public override
          fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = loadBalancerTargetGroup(AnalysisComponentProperty(loadBalancerTargetGroup))

      public override fun loadBalancerTargetGroups(loadBalancerTargetGroups: IResolvable) {
        cdkBuilder.loadBalancerTargetGroups(loadBalancerTargetGroups.let(IResolvable::unwrap))
      }

      public override fun loadBalancerTargetGroups(loadBalancerTargetGroups: List<Any>) {
        cdkBuilder.loadBalancerTargetGroups(loadBalancerTargetGroups)
      }

      public override fun loadBalancerTargetPort(loadBalancerTargetPort: Number) {
        cdkBuilder.loadBalancerTargetPort(loadBalancerTargetPort)
      }

      public override fun missingComponent(missingComponent: String) {
        cdkBuilder.missingComponent(missingComponent)
      }

      public override fun natGateway(natGateway: IResolvable) {
        cdkBuilder.natGateway(natGateway.let(IResolvable::unwrap))
      }

      public override fun natGateway(natGateway: AnalysisComponentProperty) {
        cdkBuilder.natGateway(natGateway.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa801e01d40ce33c9b25562393ea028bfe9c43f5ed7d605725a8f56615b919ac")
      public override fun natGateway(natGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = natGateway(AnalysisComponentProperty(natGateway))

      public override fun networkInterface(networkInterface: IResolvable) {
        cdkBuilder.networkInterface(networkInterface.let(IResolvable::unwrap))
      }

      public override fun networkInterface(networkInterface: AnalysisComponentProperty) {
        cdkBuilder.networkInterface(networkInterface.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7450aedbd567f718c75cede2762de6ba2186748203910a6d9a1a34a52354f9e7")
      public override
          fun networkInterface(networkInterface: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = networkInterface(AnalysisComponentProperty(networkInterface))

      public override fun packetField(packetField: String) {
        cdkBuilder.packetField(packetField)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun portRanges(portRanges: IResolvable) {
        cdkBuilder.portRanges(portRanges.let(IResolvable::unwrap))
      }

      public override fun portRanges(portRanges: List<Any>) {
        cdkBuilder.portRanges(portRanges)
      }

      public override fun prefixList(prefixList: IResolvable) {
        cdkBuilder.prefixList(prefixList.let(IResolvable::unwrap))
      }

      public override fun prefixList(prefixList: AnalysisComponentProperty) {
        cdkBuilder.prefixList(prefixList.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da1c72a17748568ee9f55443dff6778305e20c538f7276338708663554a72e6")
      public override fun prefixList(prefixList: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = prefixList(AnalysisComponentProperty(prefixList))

      public override fun protocols(protocols: List<String>) {
        cdkBuilder.protocols(protocols)
      }

      public override fun routeTable(routeTable: IResolvable) {
        cdkBuilder.routeTable(routeTable.let(IResolvable::unwrap))
      }

      public override fun routeTable(routeTable: AnalysisComponentProperty) {
        cdkBuilder.routeTable(routeTable.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("addd8d3e5338b52fe2640bcbabf54aadd69b710bdd658262a9d5d87ca019e953")
      public override fun routeTable(routeTable: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = routeTable(AnalysisComponentProperty(routeTable))

      public override fun routeTableRoute(routeTableRoute: IResolvable) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(IResolvable::unwrap))
      }

      public override fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(AnalysisRouteTableRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("077f21603e1c6ac087e6d67c0b048cc3951551a991fb719bd1d193325f1101ff")
      public override
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit):
          Unit = routeTableRoute(AnalysisRouteTableRouteProperty(routeTableRoute))

      public override fun securityGroup(securityGroup: IResolvable) {
        cdkBuilder.securityGroup(securityGroup.let(IResolvable::unwrap))
      }

      public override fun securityGroup(securityGroup: AnalysisComponentProperty) {
        cdkBuilder.securityGroup(securityGroup.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a57eb2f9eb9322cb9ff3b93a37f91e6352d6bd8f90fe4feba0989e1ee56e9cbf")
      public override
          fun securityGroup(securityGroup: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          securityGroup(AnalysisComponentProperty(securityGroup))

      public override fun securityGroupRule(securityGroupRule: IResolvable) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(IResolvable::unwrap))
      }

      public override fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(AnalysisSecurityGroupRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e492823be51adb2a2414d80236e38df04a8dc309a590a9df62e986acbdfa6e87")
      public override
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit):
          Unit = securityGroupRule(AnalysisSecurityGroupRuleProperty(securityGroupRule))

      public override fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups.let(IResolvable::unwrap))
      }

      public override fun securityGroups(securityGroups: List<Any>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      public override fun sourceVpc(sourceVpc: IResolvable) {
        cdkBuilder.sourceVpc(sourceVpc.let(IResolvable::unwrap))
      }

      public override fun sourceVpc(sourceVpc: AnalysisComponentProperty) {
        cdkBuilder.sourceVpc(sourceVpc.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27af9107563805c956e34b6cd29236fe3f85d8c6a90cf764db26f60685a9b2e5")
      public override fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          sourceVpc(AnalysisComponentProperty(sourceVpc))

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public override fun subnet(subnet: IResolvable) {
        cdkBuilder.subnet(subnet.let(IResolvable::unwrap))
      }

      public override fun subnet(subnet: AnalysisComponentProperty) {
        cdkBuilder.subnet(subnet.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b128827dcace50aa299c80150525f5fec902a4ed3a2546229850bb96682ca78")
      public override fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          subnet(AnalysisComponentProperty(subnet))

      public override fun subnetRouteTable(subnetRouteTable: IResolvable) {
        cdkBuilder.subnetRouteTable(subnetRouteTable.let(IResolvable::unwrap))
      }

      public override fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty) {
        cdkBuilder.subnetRouteTable(subnetRouteTable.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a40c9d124152a53b14f80b23a58e155706f768bb73eb83d38b6967b3f2ee4d2")
      public override
          fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = subnetRouteTable(AnalysisComponentProperty(subnetRouteTable))

      public override fun transitGateway(transitGateway: IResolvable) {
        cdkBuilder.transitGateway(transitGateway.let(IResolvable::unwrap))
      }

      public override fun transitGateway(transitGateway: AnalysisComponentProperty) {
        cdkBuilder.transitGateway(transitGateway.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50266278c0845fca742e5d73d33fa93efb0b72c2fb8141dc083edc1228c4409d")
      public override
          fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          transitGateway(AnalysisComponentProperty(transitGateway))

      public override fun transitGatewayAttachment(transitGatewayAttachment: IResolvable) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment.let(IResolvable::unwrap))
      }

      public override
          fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e6dad8a30a668f3899dccee9584f41c7eaec54585d826bd02217e01d514f914")
      public override
          fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = transitGatewayAttachment(AnalysisComponentProperty(transitGatewayAttachment))

      public override fun transitGatewayRouteTable(transitGatewayRouteTable: IResolvable) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable.let(IResolvable::unwrap))
      }

      public override
          fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a7e4cca421d1ea8cc6c7407dd2ac9e6357d695efff1399351669ca0c03d761e")
      public override
          fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = transitGatewayRouteTable(AnalysisComponentProperty(transitGatewayRouteTable))

      public override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(IResolvable::unwrap))
      }

      public override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(TransitGatewayRouteTableRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c4950e82f10db35eb78952cfc65d01e2463d6ff92f05eb0e0f7e1c02df89fcc")
      public override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit):
          Unit =
          transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty(transitGatewayRouteTableRoute))

      public override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
      }

      public override fun vpc(vpc: AnalysisComponentProperty) {
        cdkBuilder.vpc(vpc.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b9579f79b35a2679bdc9a34d7b81d4de6f4b4df83097553d8fd0e8f47ac433")
      public override fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          vpc(AnalysisComponentProperty(vpc))

      public override fun vpcEndpoint(vpcEndpoint: IResolvable) {
        cdkBuilder.vpcEndpoint(vpcEndpoint.let(IResolvable::unwrap))
      }

      public override fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty) {
        cdkBuilder.vpcEndpoint(vpcEndpoint.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf6c7e8e6abb4afdf2a4fcec210177d1c2cbc27eb69931f026da17bc8c57f925")
      public override fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = vpcEndpoint(AnalysisComponentProperty(vpcEndpoint))

      public override fun vpcPeeringConnection(vpcPeeringConnection: IResolvable) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection.let(IResolvable::unwrap))
      }

      public override fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fb68077a808fd6bb36e2bb7582c7b0d6c7a4e55663ab7f4e19ef9207233ef52")
      public override
          fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = vpcPeeringConnection(AnalysisComponentProperty(vpcPeeringConnection))

      public override fun vpnConnection(vpnConnection: IResolvable) {
        cdkBuilder.vpnConnection(vpnConnection.let(IResolvable::unwrap))
      }

      public override fun vpnConnection(vpnConnection: AnalysisComponentProperty) {
        cdkBuilder.vpnConnection(vpnConnection.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a06080ec27a8e104f495416404d4065e86ad807d4c24b86ad554ec55bb6704c0")
      public override
          fun vpnConnection(vpnConnection: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          vpnConnection(AnalysisComponentProperty(vpnConnection))

      public override fun vpnGateway(vpnGateway: IResolvable) {
        cdkBuilder.vpnGateway(vpnGateway.let(IResolvable::unwrap))
      }

      public override fun vpnGateway(vpnGateway: AnalysisComponentProperty) {
        cdkBuilder.vpnGateway(vpnGateway.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc28fbd01369a3708d7b71693a81ceb38cdc4ba3d0de7d8b77fd55f13281aecb")
      public override fun vpnGateway(vpnGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = vpnGateway(AnalysisComponentProperty(vpnGateway))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty,
    ) : ExplanationProperty {
      public override fun acl(): Any? = unwrap(this).getAcl()

      public override fun aclRule(): Any? = unwrap(this).getAclRule()

      public override fun address(): String? = unwrap(this).getAddress()

      public override fun addresses(): List<String> = unwrap(this).getAddresses() ?: emptyList()

      public override fun attachedTo(): Any? = unwrap(this).getAttachedTo()

      public override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()

      public override fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

      public override fun classicLoadBalancerListener(): Any? =
          unwrap(this).getClassicLoadBalancerListener()

      public override fun component(): Any? = unwrap(this).getComponent()

      public override fun componentAccount(): String? = unwrap(this).getComponentAccount()

      public override fun componentRegion(): String? = unwrap(this).getComponentRegion()

      public override fun customerGateway(): Any? = unwrap(this).getCustomerGateway()

      public override fun destination(): Any? = unwrap(this).getDestination()

      public override fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

      public override fun direction(): String? = unwrap(this).getDirection()

      public override fun elasticLoadBalancerListener(): Any? =
          unwrap(this).getElasticLoadBalancerListener()

      public override fun explanationCode(): String? = unwrap(this).getExplanationCode()

      public override fun ingressRouteTable(): Any? = unwrap(this).getIngressRouteTable()

      public override fun internetGateway(): Any? = unwrap(this).getInternetGateway()

      public override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

      public override fun loadBalancerListenerPort(): Number? =
          unwrap(this).getLoadBalancerListenerPort()

      public override fun loadBalancerTarget(): Any? = unwrap(this).getLoadBalancerTarget()

      public override fun loadBalancerTargetGroup(): Any? =
          unwrap(this).getLoadBalancerTargetGroup()

      public override fun loadBalancerTargetGroups(): Any? =
          unwrap(this).getLoadBalancerTargetGroups()

      public override fun loadBalancerTargetPort(): Number? =
          unwrap(this).getLoadBalancerTargetPort()

      public override fun missingComponent(): String? = unwrap(this).getMissingComponent()

      public override fun natGateway(): Any? = unwrap(this).getNatGateway()

      public override fun networkInterface(): Any? = unwrap(this).getNetworkInterface()

      public override fun packetField(): String? = unwrap(this).getPacketField()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun portRanges(): Any? = unwrap(this).getPortRanges()

      public override fun prefixList(): Any? = unwrap(this).getPrefixList()

      public override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

      public override fun routeTable(): Any? = unwrap(this).getRouteTable()

      public override fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

      public override fun securityGroup(): Any? = unwrap(this).getSecurityGroup()

      public override fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

      public override fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

      public override fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

      public override fun state(): String? = unwrap(this).getState()

      public override fun subnet(): Any? = unwrap(this).getSubnet()

      public override fun subnetRouteTable(): Any? = unwrap(this).getSubnetRouteTable()

      public override fun transitGateway(): Any? = unwrap(this).getTransitGateway()

      public override fun transitGatewayAttachment(): Any? =
          unwrap(this).getTransitGatewayAttachment()

      public override fun transitGatewayRouteTable(): Any? =
          unwrap(this).getTransitGatewayRouteTable()

      public override fun transitGatewayRouteTableRoute(): Any? =
          unwrap(this).getTransitGatewayRouteTableRoute()

      public override fun vpc(): Any? = unwrap(this).getVpc()

      public override fun vpcEndpoint(): Any? = unwrap(this).getVpcEndpoint()

      public override fun vpcPeeringConnection(): Any? = unwrap(this).getVpcPeeringConnection()

      public override fun vpnConnection(): Any? = unwrap(this).getVpnConnection()

      public override fun vpnGateway(): Any? = unwrap(this).getVpnGateway()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExplanationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty):
          ExplanationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExplanationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisPacketHeaderProperty {
    public fun destinationAddresses(): List<String> = unwrap(this).getDestinationAddresses() ?:
        emptyList()

    public fun destinationPortRanges(): Any? = unwrap(this).getDestinationPortRanges()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?: emptyList()

    public fun sourcePortRanges(): Any? = unwrap(this).getSourcePortRanges()

    public interface Builder {
      public fun destinationAddresses(destinationAddresses: List<String>) {
      }

      public fun destinationPortRanges(destinationPortRanges: IResolvable) {
      }

      public fun destinationPortRanges(destinationPortRanges: List<Any>) {
      }

      public fun protocol(protocol: String) {
      }

      public fun sourceAddresses(sourceAddresses: List<String>) {
      }

      public fun sourcePortRanges(sourcePortRanges: IResolvable) {
      }

      public fun sourcePortRanges(sourcePortRanges: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.builder()

      public override fun destinationAddresses(destinationAddresses: List<String>) {
        cdkBuilder.destinationAddresses(destinationAddresses)
      }

      public override fun destinationPortRanges(destinationPortRanges: IResolvable) {
        cdkBuilder.destinationPortRanges(destinationPortRanges.let(IResolvable::unwrap))
      }

      public override fun destinationPortRanges(destinationPortRanges: List<Any>) {
        cdkBuilder.destinationPortRanges(destinationPortRanges)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public override fun sourceAddresses(sourceAddresses: List<String>) {
        cdkBuilder.sourceAddresses(sourceAddresses)
      }

      public override fun sourcePortRanges(sourcePortRanges: IResolvable) {
        cdkBuilder.sourcePortRanges(sourcePortRanges.let(IResolvable::unwrap))
      }

      public override fun sourcePortRanges(sourcePortRanges: List<Any>) {
        cdkBuilder.sourcePortRanges(sourcePortRanges)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty,
    ) : AnalysisPacketHeaderProperty {
      public override fun destinationAddresses(): List<String> =
          unwrap(this).getDestinationAddresses() ?: emptyList()

      public override fun destinationPortRanges(): Any? = unwrap(this).getDestinationPortRanges()

      public override fun protocol(): String? = unwrap(this).getProtocol()

      public override fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?:
          emptyList()

      public override fun sourcePortRanges(): Any? = unwrap(this).getSourcePortRanges()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisPacketHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty):
          AnalysisPacketHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisPacketHeaderProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisComponentProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun id(): String? = unwrap(this).getId()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun id(id: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty,
    ) : AnalysisComponentProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty):
          AnalysisComponentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisComponentProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PortRangeProperty {
    public fun from(): Number? = unwrap(this).getFrom()

    public fun to(): Number? = unwrap(this).getTo()

    public interface Builder {
      public fun from(from: Number) {
      }

      public fun to(to: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty.builder()

      public override fun from(from: Number) {
        cdkBuilder.from(from)
      }

      public override fun to(to: Number) {
        cdkBuilder.to(to)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty,
    ) : PortRangeProperty {
      public override fun from(): Number? = unwrap(this).getFrom()

      public override fun to(): Number? = unwrap(this).getTo()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty):
          PortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AlternatePathHintProperty {
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    public fun componentId(): String? = unwrap(this).getComponentId()

    public interface Builder {
      public fun componentArn(componentArn: String) {
      }

      public fun componentId(componentId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty.builder()

      public override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      public override fun componentId(componentId: String) {
        cdkBuilder.componentId(componentId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty,
    ) : AlternatePathHintProperty {
      public override fun componentArn(): String? = unwrap(this).getComponentArn()

      public override fun componentId(): String? = unwrap(this).getComponentId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlternatePathHintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty):
          AlternatePathHintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlternatePathHintProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisLoadBalancerListenerProperty {
    public fun instancePort(): Number? = unwrap(this).getInstancePort()

    public fun loadBalancerPort(): Number? = unwrap(this).getLoadBalancerPort()

    public interface Builder {
      public fun instancePort(instancePort: Number) {
      }

      public fun loadBalancerPort(loadBalancerPort: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.builder()

      public override fun instancePort(instancePort: Number) {
        cdkBuilder.instancePort(instancePort)
      }

      public override fun loadBalancerPort(loadBalancerPort: Number) {
        cdkBuilder.loadBalancerPort(loadBalancerPort)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty,
    ) : AnalysisLoadBalancerListenerProperty {
      public override fun instancePort(): Number? = unwrap(this).getInstancePort()

      public override fun loadBalancerPort(): Number? = unwrap(this).getLoadBalancerPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisLoadBalancerListenerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty):
          AnalysisLoadBalancerListenerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisLoadBalancerListenerProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisAclRuleProperty {
    public fun cidr(): String? = unwrap(this).getCidr()

    public fun egress(): Any? = unwrap(this).getEgress()

    public fun portRange(): Any? = unwrap(this).getPortRange()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun ruleAction(): String? = unwrap(this).getRuleAction()

    public fun ruleNumber(): Number? = unwrap(this).getRuleNumber()

    public interface Builder {
      public fun cidr(cidr: String) {
      }

      public fun egress(egress: Boolean) {
      }

      public fun egress(egress: IResolvable) {
      }

      public fun portRange(portRange: IResolvable) {
      }

      public fun portRange(portRange: PortRangeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a94b034e546168f34c45588194133a56e943d3e9aeabfc5e67024cee93f1186c")
      public fun portRange(portRange: PortRangeProperty.Builder.() -> Unit) {
      }

      public fun protocol(protocol: String) {
      }

      public fun ruleAction(ruleAction: String) {
      }

      public fun ruleNumber(ruleNumber: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.builder()

      public override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public override fun egress(egress: Boolean) {
        cdkBuilder.egress(egress)
      }

      public override fun egress(egress: IResolvable) {
        cdkBuilder.egress(egress.let(IResolvable::unwrap))
      }

      public override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
      }

      public override fun portRange(portRange: PortRangeProperty) {
        cdkBuilder.portRange(portRange.let(PortRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a94b034e546168f34c45588194133a56e943d3e9aeabfc5e67024cee93f1186c")
      public override fun portRange(portRange: PortRangeProperty.Builder.() -> Unit): Unit =
          portRange(PortRangeProperty(portRange))

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public override fun ruleAction(ruleAction: String) {
        cdkBuilder.ruleAction(ruleAction)
      }

      public override fun ruleNumber(ruleNumber: Number) {
        cdkBuilder.ruleNumber(ruleNumber)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty,
    ) : AnalysisAclRuleProperty {
      public override fun cidr(): String? = unwrap(this).getCidr()

      public override fun egress(): Any? = unwrap(this).getEgress()

      public override fun portRange(): Any? = unwrap(this).getPortRange()

      public override fun protocol(): String? = unwrap(this).getProtocol()

      public override fun ruleAction(): String? = unwrap(this).getRuleAction()

      public override fun ruleNumber(): Number? = unwrap(this).getRuleNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisAclRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty):
          AnalysisAclRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisAclRuleProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PathComponentProperty {
    public fun aclRule(): Any? = unwrap(this).getAclRule()

    public fun additionalDetails(): Any? = unwrap(this).getAdditionalDetails()

    public fun component(): Any? = unwrap(this).getComponent()

    public fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

    public fun elasticLoadBalancerListener(): Any? = unwrap(this).getElasticLoadBalancerListener()

    public fun explanations(): Any? = unwrap(this).getExplanations()

    public fun inboundHeader(): Any? = unwrap(this).getInboundHeader()

    public fun outboundHeader(): Any? = unwrap(this).getOutboundHeader()

    public fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

    public fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

    public fun sequenceNumber(): Number? = unwrap(this).getSequenceNumber()

    public fun serviceName(): String? = unwrap(this).getServiceName()

    public fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

    public fun subnet(): Any? = unwrap(this).getSubnet()

    public fun transitGateway(): Any? = unwrap(this).getTransitGateway()

    public fun transitGatewayRouteTableRoute(): Any? =
        unwrap(this).getTransitGatewayRouteTableRoute()

    public fun vpc(): Any? = unwrap(this).getVpc()

    public interface Builder {
      public fun aclRule(aclRule: IResolvable) {
      }

      public fun aclRule(aclRule: AnalysisAclRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6b9e5fb37bcac949994745804b82ed1c033b30e301a5f31406638f2fb0f3599")
      public fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit) {
      }

      public fun additionalDetails(additionalDetails: IResolvable) {
      }

      public fun additionalDetails(additionalDetails: List<Any>) {
      }

      public fun component(component: IResolvable) {
      }

      public fun component(component: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b42bab06edf148158b45f7f08ad246cd07cac9a9629b302bcb7934466b09c37")
      public fun component(component: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun destinationVpc(destinationVpc: IResolvable) {
      }

      public fun destinationVpc(destinationVpc: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aed0b38314c416675bcc02fc84208d4a40fbb5175e08ff5e6f66e7298554bb73")
      public fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
      }

      public
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c150567e448b95a9f8005a637d7dc5e8e7abdee7b2374aad96d90494b32f8fc")
      public
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun explanations(explanations: IResolvable) {
      }

      public fun explanations(explanations: List<Any>) {
      }

      public fun inboundHeader(inboundHeader: IResolvable) {
      }

      public fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30358ec3aab04fe98b5ec1f273f7c7891cc1e763d58e4161226b193769c2b2")
      public fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit) {
      }

      public fun outboundHeader(outboundHeader: IResolvable) {
      }

      public fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09929f1c3deb93a0b48c6d82717bf6973911749885f3554b2e9a83006bfac9bd")
      public fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit) {
      }

      public fun routeTableRoute(routeTableRoute: IResolvable) {
      }

      public fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7719d7835b51b6c4c20ba31ae1fedded99239437cee91be48e368d6406fa327")
      public
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit) {
      }

      public fun securityGroupRule(securityGroupRule: IResolvable) {
      }

      public fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f532a27067fb898e19c5feefd6c95abe008985a3c6053993feb740f16b3d26f")
      public
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit) {
      }

      public fun sequenceNumber(sequenceNumber: Number) {
      }

      public fun serviceName(serviceName: String) {
      }

      public fun sourceVpc(sourceVpc: IResolvable) {
      }

      public fun sourceVpc(sourceVpc: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271f8f4e3a7f246fbe06724418b45c28666322412722a196c2dbae2c981ed375")
      public fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun subnet(subnet: IResolvable) {
      }

      public fun subnet(subnet: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b14366b69f50d7901a17c23afe28dd824736b469bdd521fbc60c58a79d0977a4")
      public fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun transitGateway(transitGateway: IResolvable) {
      }

      public fun transitGateway(transitGateway: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75d76e94aa4d558d65be90501539df3965f1297e1baa9343ddf3a19db4ee7c8e")
      public fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
      }

      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae17e92a57364345367ca205b5cb743f89bfac694116f8a02f4a062e51962c2e")
      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit) {
      }

      public fun vpc(vpc: IResolvable) {
      }

      public fun vpc(vpc: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d2d6ccc47cf0bcb91e49542b88c4e4c3cb9ef578ab573f3f08687df866239f2")
      public fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty.builder()

      public override fun aclRule(aclRule: IResolvable) {
        cdkBuilder.aclRule(aclRule.let(IResolvable::unwrap))
      }

      public override fun aclRule(aclRule: AnalysisAclRuleProperty) {
        cdkBuilder.aclRule(aclRule.let(AnalysisAclRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6b9e5fb37bcac949994745804b82ed1c033b30e301a5f31406638f2fb0f3599")
      public override fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit): Unit =
          aclRule(AnalysisAclRuleProperty(aclRule))

      public override fun additionalDetails(additionalDetails: IResolvable) {
        cdkBuilder.additionalDetails(additionalDetails.let(IResolvable::unwrap))
      }

      public override fun additionalDetails(additionalDetails: List<Any>) {
        cdkBuilder.additionalDetails(additionalDetails)
      }

      public override fun component(component: IResolvable) {
        cdkBuilder.component(component.let(IResolvable::unwrap))
      }

      public override fun component(component: AnalysisComponentProperty) {
        cdkBuilder.component(component.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b42bab06edf148158b45f7f08ad246cd07cac9a9629b302bcb7934466b09c37")
      public override fun component(component: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          component(AnalysisComponentProperty(component))

      public override fun destinationVpc(destinationVpc: IResolvable) {
        cdkBuilder.destinationVpc(destinationVpc.let(IResolvable::unwrap))
      }

      public override fun destinationVpc(destinationVpc: AnalysisComponentProperty) {
        cdkBuilder.destinationVpc(destinationVpc.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aed0b38314c416675bcc02fc84208d4a40fbb5175e08ff5e6f66e7298554bb73")
      public override
          fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          destinationVpc(AnalysisComponentProperty(destinationVpc))

      public override fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(IResolvable::unwrap))
      }

      public override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c150567e448b95a9f8005a637d7dc5e8e7abdee7b2374aad96d90494b32f8fc")
      public override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = elasticLoadBalancerListener(AnalysisComponentProperty(elasticLoadBalancerListener))

      public override fun explanations(explanations: IResolvable) {
        cdkBuilder.explanations(explanations.let(IResolvable::unwrap))
      }

      public override fun explanations(explanations: List<Any>) {
        cdkBuilder.explanations(explanations)
      }

      public override fun inboundHeader(inboundHeader: IResolvable) {
        cdkBuilder.inboundHeader(inboundHeader.let(IResolvable::unwrap))
      }

      public override fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty) {
        cdkBuilder.inboundHeader(inboundHeader.let(AnalysisPacketHeaderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30358ec3aab04fe98b5ec1f273f7c7891cc1e763d58e4161226b193769c2b2")
      public override
          fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit): Unit =
          inboundHeader(AnalysisPacketHeaderProperty(inboundHeader))

      public override fun outboundHeader(outboundHeader: IResolvable) {
        cdkBuilder.outboundHeader(outboundHeader.let(IResolvable::unwrap))
      }

      public override fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty) {
        cdkBuilder.outboundHeader(outboundHeader.let(AnalysisPacketHeaderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09929f1c3deb93a0b48c6d82717bf6973911749885f3554b2e9a83006bfac9bd")
      public override
          fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit): Unit
          = outboundHeader(AnalysisPacketHeaderProperty(outboundHeader))

      public override fun routeTableRoute(routeTableRoute: IResolvable) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(IResolvable::unwrap))
      }

      public override fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(AnalysisRouteTableRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7719d7835b51b6c4c20ba31ae1fedded99239437cee91be48e368d6406fa327")
      public override
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit):
          Unit = routeTableRoute(AnalysisRouteTableRouteProperty(routeTableRoute))

      public override fun securityGroupRule(securityGroupRule: IResolvable) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(IResolvable::unwrap))
      }

      public override fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(AnalysisSecurityGroupRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f532a27067fb898e19c5feefd6c95abe008985a3c6053993feb740f16b3d26f")
      public override
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit):
          Unit = securityGroupRule(AnalysisSecurityGroupRuleProperty(securityGroupRule))

      public override fun sequenceNumber(sequenceNumber: Number) {
        cdkBuilder.sequenceNumber(sequenceNumber)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public override fun sourceVpc(sourceVpc: IResolvable) {
        cdkBuilder.sourceVpc(sourceVpc.let(IResolvable::unwrap))
      }

      public override fun sourceVpc(sourceVpc: AnalysisComponentProperty) {
        cdkBuilder.sourceVpc(sourceVpc.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271f8f4e3a7f246fbe06724418b45c28666322412722a196c2dbae2c981ed375")
      public override fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          sourceVpc(AnalysisComponentProperty(sourceVpc))

      public override fun subnet(subnet: IResolvable) {
        cdkBuilder.subnet(subnet.let(IResolvable::unwrap))
      }

      public override fun subnet(subnet: AnalysisComponentProperty) {
        cdkBuilder.subnet(subnet.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b14366b69f50d7901a17c23afe28dd824736b469bdd521fbc60c58a79d0977a4")
      public override fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          subnet(AnalysisComponentProperty(subnet))

      public override fun transitGateway(transitGateway: IResolvable) {
        cdkBuilder.transitGateway(transitGateway.let(IResolvable::unwrap))
      }

      public override fun transitGateway(transitGateway: AnalysisComponentProperty) {
        cdkBuilder.transitGateway(transitGateway.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75d76e94aa4d558d65be90501539df3965f1297e1baa9343ddf3a19db4ee7c8e")
      public override
          fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          transitGateway(AnalysisComponentProperty(transitGateway))

      public override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(IResolvable::unwrap))
      }

      public override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(TransitGatewayRouteTableRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae17e92a57364345367ca205b5cb743f89bfac694116f8a02f4a062e51962c2e")
      public override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit):
          Unit =
          transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty(transitGatewayRouteTableRoute))

      public override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
      }

      public override fun vpc(vpc: AnalysisComponentProperty) {
        cdkBuilder.vpc(vpc.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d2d6ccc47cf0bcb91e49542b88c4e4c3cb9ef578ab573f3f08687df866239f2")
      public override fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          vpc(AnalysisComponentProperty(vpc))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty,
    ) : PathComponentProperty {
      public override fun aclRule(): Any? = unwrap(this).getAclRule()

      public override fun additionalDetails(): Any? = unwrap(this).getAdditionalDetails()

      public override fun component(): Any? = unwrap(this).getComponent()

      public override fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

      public override fun elasticLoadBalancerListener(): Any? =
          unwrap(this).getElasticLoadBalancerListener()

      public override fun explanations(): Any? = unwrap(this).getExplanations()

      public override fun inboundHeader(): Any? = unwrap(this).getInboundHeader()

      public override fun outboundHeader(): Any? = unwrap(this).getOutboundHeader()

      public override fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

      public override fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

      public override fun sequenceNumber(): Number? = unwrap(this).getSequenceNumber()

      public override fun serviceName(): String? = unwrap(this).getServiceName()

      public override fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

      public override fun subnet(): Any? = unwrap(this).getSubnet()

      public override fun transitGateway(): Any? = unwrap(this).getTransitGateway()

      public override fun transitGatewayRouteTableRoute(): Any? =
          unwrap(this).getTransitGatewayRouteTableRoute()

      public override fun vpc(): Any? = unwrap(this).getVpc()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PathComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty):
          PathComponentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathComponentProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TransitGatewayRouteTableRouteProperty {
    public fun attachmentId(): String? = unwrap(this).getAttachmentId()

    public fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

    public fun prefixListId(): String? = unwrap(this).getPrefixListId()

    public fun resourceId(): String? = unwrap(this).getResourceId()

    public fun resourceType(): String? = unwrap(this).getResourceType()

    public fun routeOrigin(): String? = unwrap(this).getRouteOrigin()

    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun attachmentId(attachmentId: String) {
      }

      public fun destinationCidr(destinationCidr: String) {
      }

      public fun prefixListId(prefixListId: String) {
      }

      public fun resourceId(resourceId: String) {
      }

      public fun resourceType(resourceType: String) {
      }

      public fun routeOrigin(routeOrigin: String) {
      }

      public fun state(state: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.builder()

      public override fun attachmentId(attachmentId: String) {
        cdkBuilder.attachmentId(attachmentId)
      }

      public override fun destinationCidr(destinationCidr: String) {
        cdkBuilder.destinationCidr(destinationCidr)
      }

      public override fun prefixListId(prefixListId: String) {
        cdkBuilder.prefixListId(prefixListId)
      }

      public override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public override fun routeOrigin(routeOrigin: String) {
        cdkBuilder.routeOrigin(routeOrigin)
      }

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty,
    ) : TransitGatewayRouteTableRouteProperty {
      public override fun attachmentId(): String? = unwrap(this).getAttachmentId()

      public override fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

      public override fun prefixListId(): String? = unwrap(this).getPrefixListId()

      public override fun resourceId(): String? = unwrap(this).getResourceId()

      public override fun resourceType(): String? = unwrap(this).getResourceType()

      public override fun routeOrigin(): String? = unwrap(this).getRouteOrigin()

      public override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TransitGatewayRouteTableRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty):
          TransitGatewayRouteTableRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitGatewayRouteTableRouteProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisSecurityGroupRuleProperty {
    public fun cidr(): String? = unwrap(this).getCidr()

    public fun direction(): String? = unwrap(this).getDirection()

    public fun portRange(): Any? = unwrap(this).getPortRange()

    public fun prefixListId(): String? = unwrap(this).getPrefixListId()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

    public interface Builder {
      public fun cidr(cidr: String) {
      }

      public fun direction(direction: String) {
      }

      public fun portRange(portRange: IResolvable) {
      }

      public fun portRange(portRange: PortRangeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca53e01c09765cffc504e3e8819a897e42887deeeaa81072f360fd666dbfa09d")
      public fun portRange(portRange: PortRangeProperty.Builder.() -> Unit) {
      }

      public fun prefixListId(prefixListId: String) {
      }

      public fun protocol(protocol: String) {
      }

      public fun securityGroupId(securityGroupId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.builder()

      public override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      public override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
      }

      public override fun portRange(portRange: PortRangeProperty) {
        cdkBuilder.portRange(portRange.let(PortRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca53e01c09765cffc504e3e8819a897e42887deeeaa81072f360fd666dbfa09d")
      public override fun portRange(portRange: PortRangeProperty.Builder.() -> Unit): Unit =
          portRange(PortRangeProperty(portRange))

      public override fun prefixListId(prefixListId: String) {
        cdkBuilder.prefixListId(prefixListId)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public override fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty,
    ) : AnalysisSecurityGroupRuleProperty {
      public override fun cidr(): String? = unwrap(this).getCidr()

      public override fun direction(): String? = unwrap(this).getDirection()

      public override fun portRange(): Any? = unwrap(this).getPortRange()

      public override fun prefixListId(): String? = unwrap(this).getPrefixListId()

      public override fun protocol(): String? = unwrap(this).getProtocol()

      public override fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisSecurityGroupRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty):
          AnalysisSecurityGroupRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSecurityGroupRuleProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AdditionalDetailProperty {
    public fun additionalDetailType(): String? = unwrap(this).getAdditionalDetailType()

    public fun component(): Any? = unwrap(this).getComponent()

    public fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

    public fun serviceName(): String? = unwrap(this).getServiceName()

    public interface Builder {
      public fun additionalDetailType(additionalDetailType: String) {
      }

      public fun component(component: IResolvable) {
      }

      public fun component(component: AnalysisComponentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f87cbbad2b80f87041b5c71b87006ec83d7455fa611376c460436099063db586")
      public fun component(component: AnalysisComponentProperty.Builder.() -> Unit) {
      }

      public fun loadBalancers(loadBalancers: IResolvable) {
      }

      public fun loadBalancers(loadBalancers: List<Any>) {
      }

      public fun serviceName(serviceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty.builder()

      public override fun additionalDetailType(additionalDetailType: String) {
        cdkBuilder.additionalDetailType(additionalDetailType)
      }

      public override fun component(component: IResolvable) {
        cdkBuilder.component(component.let(IResolvable::unwrap))
      }

      public override fun component(component: AnalysisComponentProperty) {
        cdkBuilder.component(component.let(AnalysisComponentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f87cbbad2b80f87041b5c71b87006ec83d7455fa611376c460436099063db586")
      public override fun component(component: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          component(AnalysisComponentProperty(component))

      public override fun loadBalancers(loadBalancers: IResolvable) {
        cdkBuilder.loadBalancers(loadBalancers.let(IResolvable::unwrap))
      }

      public override fun loadBalancers(loadBalancers: List<Any>) {
        cdkBuilder.loadBalancers(loadBalancers)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty,
    ) : AdditionalDetailProperty {
      public override fun additionalDetailType(): String? = unwrap(this).getAdditionalDetailType()

      public override fun component(): Any? = unwrap(this).getComponent()

      public override fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

      public override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AdditionalDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty):
          AdditionalDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalDetailProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisRouteTableRouteProperty {
    public fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

    public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    public fun egressOnlyInternetGatewayId(): String? =
        unwrap(this).getEgressOnlyInternetGatewayId()

    public fun gatewayId(): String? = unwrap(this).getGatewayId()

    public fun instanceId(): String? = unwrap(this).getInstanceId()

    public fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun origin(): String? = unwrap(this).getOrigin()

    public fun state(): String? = unwrap(this).getState()

    public fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

    public fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()

    public interface Builder {
      public fun destinationCidr(destinationCidr: String) {
      }

      public fun destinationPrefixListId(destinationPrefixListId: String) {
      }

      public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
      }

      public fun gatewayId(gatewayId: String) {
      }

      public fun instanceId(instanceId: String) {
      }

      public fun natGatewayId(natGatewayId: String) {
      }

      public fun networkInterfaceId(networkInterfaceId: String) {
      }

      public fun origin(origin: String) {
      }

      public fun state(state: String) {
      }

      public fun transitGatewayId(transitGatewayId: String) {
      }

      public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.builder()

      public override fun destinationCidr(destinationCidr: String) {
        cdkBuilder.destinationCidr(destinationCidr)
      }

      public override fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
      }

      public override fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
        cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
      }

      public override fun gatewayId(gatewayId: String) {
        cdkBuilder.gatewayId(gatewayId)
      }

      public override fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
      }

      public override fun natGatewayId(natGatewayId: String) {
        cdkBuilder.natGatewayId(natGatewayId)
      }

      public override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      public override fun origin(origin: String) {
        cdkBuilder.origin(origin)
      }

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public override fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
      }

      public override fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
        cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty,
    ) : AnalysisRouteTableRouteProperty {
      public override fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

      public override fun destinationPrefixListId(): String? =
          unwrap(this).getDestinationPrefixListId()

      public override fun egressOnlyInternetGatewayId(): String? =
          unwrap(this).getEgressOnlyInternetGatewayId()

      public override fun gatewayId(): String? = unwrap(this).getGatewayId()

      public override fun instanceId(): String? = unwrap(this).getInstanceId()

      public override fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

      public override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      public override fun origin(): String? = unwrap(this).getOrigin()

      public override fun state(): String? = unwrap(this).getState()

      public override fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

      public override fun vpcPeeringConnectionId(): String? =
          unwrap(this).getVpcPeeringConnectionId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRouteTableRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty):
          AnalysisRouteTableRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRouteTableRouteProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
