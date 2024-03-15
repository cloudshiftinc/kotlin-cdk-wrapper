@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  public open fun accessPolicies(`value`: Any) {
    unwrap(this).setAccessPolicies(`value`)
  }

  public open fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

  public open fun advancedOptions(`value`: IResolvable) {
    unwrap(this).setAdvancedOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun advancedOptions(`value`: Map<String, String>) {
    unwrap(this).setAdvancedOptions(`value`)
  }

  public open fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

  public open fun advancedSecurityOptions(`value`: IResolvable) {
    unwrap(this).setAdvancedSecurityOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun advancedSecurityOptions(`value`: AdvancedSecurityOptionsInputProperty) {
    unwrap(this).setAdvancedSecurityOptions(`value`.let(AdvancedSecurityOptionsInputProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6c28b2da42ac3dc4442bbe6a9008f9d5a959103d9590cea7c6832ba6f41d03bf")
  public open
      fun advancedSecurityOptions(`value`: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
      Unit = advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(`value`))

  public open fun attrAdvancedSecurityOptionsAnonymousAuthDisableDate(): String =
      unwrap(this).getAttrAdvancedSecurityOptionsAnonymousAuthDisableDate()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDomainEndpoint(): String = unwrap(this).getAttrDomainEndpoint()

  public open fun attrDomainEndpointV2(): String = unwrap(this).getAttrDomainEndpointV2()

  public open fun attrDomainEndpoints(): IResolvable =
      unwrap(this).getAttrDomainEndpoints().let(IResolvable::wrap)

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrServiceSoftwareOptions(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptions().let(IResolvable::wrap)

  public open fun attrServiceSoftwareOptionsAutomatedUpdateDate(): String =
      unwrap(this).getAttrServiceSoftwareOptionsAutomatedUpdateDate()

  public open fun attrServiceSoftwareOptionsCancellable(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptionsCancellable().let(IResolvable::wrap)

  public open fun attrServiceSoftwareOptionsCurrentVersion(): String =
      unwrap(this).getAttrServiceSoftwareOptionsCurrentVersion()

  public open fun attrServiceSoftwareOptionsDescription(): String =
      unwrap(this).getAttrServiceSoftwareOptionsDescription()

  public open fun attrServiceSoftwareOptionsNewVersion(): String =
      unwrap(this).getAttrServiceSoftwareOptionsNewVersion()

  public open fun attrServiceSoftwareOptionsOptionalDeployment(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptionsOptionalDeployment().let(IResolvable::wrap)

  public open fun attrServiceSoftwareOptionsUpdateAvailable(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptionsUpdateAvailable().let(IResolvable::wrap)

  public open fun attrServiceSoftwareOptionsUpdateStatus(): String =
      unwrap(this).getAttrServiceSoftwareOptionsUpdateStatus()

  public open fun clusterConfig(): Any? = unwrap(this).getClusterConfig()

  public open fun clusterConfig(`value`: IResolvable) {
    unwrap(this).setClusterConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun clusterConfig(`value`: ClusterConfigProperty) {
    unwrap(this).setClusterConfig(`value`.let(ClusterConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9420330d8784c41caf9345373c326e9f5cce887def2ba5fe8bcc4f2e5f1ec38d")
  public open fun clusterConfig(`value`: ClusterConfigProperty.Builder.() -> Unit): Unit =
      clusterConfig(ClusterConfigProperty(`value`))

  public open fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  public open fun cognitoOptions(`value`: IResolvable) {
    unwrap(this).setCognitoOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun cognitoOptions(`value`: CognitoOptionsProperty) {
    unwrap(this).setCognitoOptions(`value`.let(CognitoOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed481c65110f14845c68832e48ec332101fb249aeb5f4d8aeeef1a8dc87c1034")
  public open fun cognitoOptions(`value`: CognitoOptionsProperty.Builder.() -> Unit): Unit =
      cognitoOptions(CognitoOptionsProperty(`value`))

  public open fun domainArn(): String? = unwrap(this).getDomainArn()

  public open fun domainArn(`value`: String) {
    unwrap(this).setDomainArn(`value`)
  }

  public open fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

  public open fun domainEndpointOptions(`value`: IResolvable) {
    unwrap(this).setDomainEndpointOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun domainEndpointOptions(`value`: DomainEndpointOptionsProperty) {
    unwrap(this).setDomainEndpointOptions(`value`.let(DomainEndpointOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a953a25005b1492f858a7d896f3a82e988cc72baac2a500d41e1aac1e57f3c7e")
  public open fun domainEndpointOptions(`value`: DomainEndpointOptionsProperty.Builder.() -> Unit):
      Unit = domainEndpointOptions(DomainEndpointOptionsProperty(`value`))

  public open fun domainName(): String? = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

  public open fun ebsOptions(`value`: IResolvable) {
    unwrap(this).setEbsOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun ebsOptions(`value`: EBSOptionsProperty) {
    unwrap(this).setEbsOptions(`value`.let(EBSOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("804b732196675b89ecc603c00e3f565cb6aec6fe0b49cb935514c6d9bda0f943")
  public open fun ebsOptions(`value`: EBSOptionsProperty.Builder.() -> Unit): Unit =
      ebsOptions(EBSOptionsProperty(`value`))

  public open fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  public open fun encryptionAtRestOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(EncryptionAtRestOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9cdbf6ec2ef8e9ca0b822a48221d6d133494b3fca448529843523cf8dacf5de7")
  public open
      fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty.Builder.() -> Unit): Unit
      = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(`value`))

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  public open fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  public open fun logPublishingOptions(`value`: IResolvable) {
    unwrap(this).setLogPublishingOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun logPublishingOptions(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setLogPublishingOptions(__item_ac66f0)
  }

  public open fun nodeToNodeEncryptionOptions(): Any? =
      unwrap(this).getNodeToNodeEncryptionOptions()

  public open fun nodeToNodeEncryptionOptions(`value`: IResolvable) {
    unwrap(this).setNodeToNodeEncryptionOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun nodeToNodeEncryptionOptions(`value`: NodeToNodeEncryptionOptionsProperty) {
    unwrap(this).setNodeToNodeEncryptionOptions(`value`.let(NodeToNodeEncryptionOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ef66184eba660b40227924b4ff7a02f3ad1abab98b663a43f6c87689398f1ee5")
  public open
      fun nodeToNodeEncryptionOptions(`value`: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
      Unit = nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(`value`))

  public open fun offPeakWindowOptions(): Any? = unwrap(this).getOffPeakWindowOptions()

  public open fun offPeakWindowOptions(`value`: IResolvable) {
    unwrap(this).setOffPeakWindowOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun offPeakWindowOptions(`value`: OffPeakWindowOptionsProperty) {
    unwrap(this).setOffPeakWindowOptions(`value`.let(OffPeakWindowOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10360d18cf0e8887df35f99efa1b24f31b6e2817cab33ff9cc997b316f616517")
  public open fun offPeakWindowOptions(`value`: OffPeakWindowOptionsProperty.Builder.() -> Unit):
      Unit = offPeakWindowOptions(OffPeakWindowOptionsProperty(`value`))

  public open fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

  public open fun snapshotOptions(`value`: IResolvable) {
    unwrap(this).setSnapshotOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun snapshotOptions(`value`: SnapshotOptionsProperty) {
    unwrap(this).setSnapshotOptions(`value`.let(SnapshotOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e1b191407712d8dd20c7d3f109bc313af9689418a592820e66798367e0072f8")
  public open fun snapshotOptions(`value`: SnapshotOptionsProperty.Builder.() -> Unit): Unit =
      snapshotOptions(SnapshotOptionsProperty(`value`))

  public open fun softwareUpdateOptions(): Any? = unwrap(this).getSoftwareUpdateOptions()

  public open fun softwareUpdateOptions(`value`: IResolvable) {
    unwrap(this).setSoftwareUpdateOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun softwareUpdateOptions(`value`: SoftwareUpdateOptionsProperty) {
    unwrap(this).setSoftwareUpdateOptions(`value`.let(SoftwareUpdateOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b6e5ec903a843bf8e3a0c6b0fda8663559168d1d78e76c80c3aacc84bd681ec")
  public open fun softwareUpdateOptions(`value`: SoftwareUpdateOptionsProperty.Builder.() -> Unit):
      Unit = softwareUpdateOptions(SoftwareUpdateOptionsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  public open fun vpcOptions(`value`: IResolvable) {
    unwrap(this).setVpcOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcOptions(`value`: VPCOptionsProperty) {
    unwrap(this).setVpcOptions(`value`.let(VPCOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e30ee28e2b442ea8b068cda6068651e547e362d019ae35ade105292b097dd295")
  public open fun vpcOptions(`value`: VPCOptionsProperty.Builder.() -> Unit): Unit =
      vpcOptions(VPCOptionsProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicies(accessPolicies: Any)

    public fun advancedOptions(advancedOptions: IResolvable)

    public fun advancedOptions(advancedOptions: Map<String, String>)

    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable)

    public
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cff95f06bbe4f718dcc8b3f07f1d447fa61aea2aab93bb2133840db36f656aef")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    public fun clusterConfig(clusterConfig: IResolvable)

    public fun clusterConfig(clusterConfig: ClusterConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b5dd218dbd779db471ccb326f7f4bf12c2df12a9ee4464f7e3bf4981c3bfa70")
    public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)

    public fun cognitoOptions(cognitoOptions: IResolvable)

    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bbf5b9c5171b1ae7b4aebdc4a06f730f24d5e5f5f024dfdc3e9ce4d90603359")
    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty.Builder.() -> Unit)

    public fun domainArn(domainArn: String)

    public fun domainEndpointOptions(domainEndpointOptions: IResolvable)

    public fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("254043fab7706a69964bd04ba00f4938efd89d3bcba72a854478c427e1aae7b4")
    public
        fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun ebsOptions(ebsOptions: IResolvable)

    public fun ebsOptions(ebsOptions: EBSOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a15cd8967fb7df8426143e70c8919d0fe344957f9fd90759af1760ec63b16ae")
    public fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2c540038a60d9380dcfbdae380d305126e72c3893df4fbf893a2051861b3e67")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    public fun engineVersion(engineVersion: String)

    public fun ipAddressType(ipAddressType: String)

    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>)

    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable)

    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cd2d31758310fde86c8260065275d297e7e1091f47c05666565eab12698cc81")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    public fun offPeakWindowOptions(offPeakWindowOptions: IResolvable)

    public fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e70e5778d97125c7fda25481a6d9e1dee790e8fcafaf024d5d7c4e554b4a6f72")
    public
        fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty.Builder.() -> Unit)

    public fun snapshotOptions(snapshotOptions: IResolvable)

    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bd4cd626caa011c00aedc195d48d59960c1e02bab0f3d5aa0f5923597e593e")
    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit)

    public fun softwareUpdateOptions(softwareUpdateOptions: IResolvable)

    public fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e26d3115ca890c89afa47f5ab6ffe5fb905dfa1a0a2a8f81deb379168fa8458")
    public
        fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcOptions(vpcOptions: IResolvable)

    public fun vpcOptions(vpcOptions: VPCOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19c2530da7c20d4902b3f93679f21fb0a9aa629f1fc4b216b31aa8fec75a0e0e")
    public fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CfnDomain.Builder =
        software.amazon.awscdk.services.opensearchservice.CfnDomain.Builder.create(scope, id)

    override fun accessPolicies(accessPolicies: Any) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    override fun advancedOptions(advancedOptions: IResolvable) {
      cdkBuilder.advancedOptions(advancedOptions.let(IResolvable::unwrap))
    }

    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    override fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(IResolvable::unwrap))
    }

    override
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(AdvancedSecurityOptionsInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cff95f06bbe4f718dcc8b3f07f1d447fa61aea2aab93bb2133840db36f656aef")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    override fun clusterConfig(clusterConfig: IResolvable) {
      cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
    }

    override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
      cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b5dd218dbd779db471ccb326f7f4bf12c2df12a9ee4464f7e3bf4981c3bfa70")
    override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
        clusterConfig(ClusterConfigProperty(clusterConfig))

    override fun cognitoOptions(cognitoOptions: IResolvable) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(IResolvable::unwrap))
    }

    override fun cognitoOptions(cognitoOptions: CognitoOptionsProperty) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(CognitoOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bbf5b9c5171b1ae7b4aebdc4a06f730f24d5e5f5f024dfdc3e9ce4d90603359")
    override fun cognitoOptions(cognitoOptions: CognitoOptionsProperty.Builder.() -> Unit): Unit =
        cognitoOptions(CognitoOptionsProperty(cognitoOptions))

    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    override fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(IResolvable::unwrap))
    }

    override fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(DomainEndpointOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("254043fab7706a69964bd04ba00f4938efd89d3bcba72a854478c427e1aae7b4")
    override
        fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty.Builder.() -> Unit):
        Unit = domainEndpointOptions(DomainEndpointOptionsProperty(domainEndpointOptions))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun ebsOptions(ebsOptions: IResolvable) {
      cdkBuilder.ebsOptions(ebsOptions.let(IResolvable::unwrap))
    }

    override fun ebsOptions(ebsOptions: EBSOptionsProperty) {
      cdkBuilder.ebsOptions(ebsOptions.let(EBSOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a15cd8967fb7df8426143e70c8919d0fe344957f9fd90759af1760ec63b16ae")
    override fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(EBSOptionsProperty(ebsOptions))

    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    override fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(EncryptionAtRestOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2c540038a60d9380dcfbdae380d305126e72c3893df4fbf893a2051861b3e67")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable::unwrap))
    }

    override fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
      cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    override fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(IResolvable::unwrap))
    }

    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(NodeToNodeEncryptionOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cd2d31758310fde86c8260065275d297e7e1091f47c05666565eab12698cc81")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    override fun offPeakWindowOptions(offPeakWindowOptions: IResolvable) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(IResolvable::unwrap))
    }

    override fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(OffPeakWindowOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e70e5778d97125c7fda25481a6d9e1dee790e8fcafaf024d5d7c4e554b4a6f72")
    override
        fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty.Builder.() -> Unit):
        Unit = offPeakWindowOptions(OffPeakWindowOptionsProperty(offPeakWindowOptions))

    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable::unwrap))
    }

    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(SnapshotOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bd4cd626caa011c00aedc195d48d59960c1e02bab0f3d5aa0f5923597e593e")
    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit): Unit
        = snapshotOptions(SnapshotOptionsProperty(snapshotOptions))

    override fun softwareUpdateOptions(softwareUpdateOptions: IResolvable) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(IResolvable::unwrap))
    }

    override fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(SoftwareUpdateOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e26d3115ca890c89afa47f5ab6ffe5fb905dfa1a0a2a8f81deb379168fa8458")
    override
        fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty.Builder.() -> Unit):
        Unit = softwareUpdateOptions(SoftwareUpdateOptionsProperty(softwareUpdateOptions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable::unwrap))
    }

    override fun vpcOptions(vpcOptions: VPCOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(VPCOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19c2530da7c20d4902b3f93679f21fb0a9aa629f1fc4b216b31aa8fec75a0e0e")
    override fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.opensearchservice.CfnDomain =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchservice.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain):
        CfnDomain = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain):
        software.amazon.awscdk.services.opensearchservice.CfnDomain = wrapped.cdkObject
  }

  public interface MasterUserOptionsProperty {
    public fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

    public fun masterUserName(): String? = unwrap(this).getMasterUserName()

    public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    @CdkDslMarker
    public interface Builder {
      public fun masterUserArn(masterUserArn: String)

      public fun masterUserName(masterUserName: String)

      public fun masterUserPassword(masterUserPassword: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty.builder()

      override fun masterUserArn(masterUserArn: String) {
        cdkBuilder.masterUserArn(masterUserArn)
      }

      override fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
      }

      override fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty,
    ) : CdkObject(cdkObject), MasterUserOptionsProperty {
      override fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

      override fun masterUserName(): String? = unwrap(this).getMasterUserName()

      override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MasterUserOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty):
          MasterUserOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty
    }
  }

  public interface AdvancedSecurityOptionsInputProperty {
    public fun anonymousAuthDisableDate(): String? = unwrap(this).getAnonymousAuthDisableDate()

    public fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun internalUserDatabaseEnabled(): Any? = unwrap(this).getInternalUserDatabaseEnabled()

    public fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()

    public fun samlOptions(): Any? = unwrap(this).getSamlOptions()

    @CdkDslMarker
    public interface Builder {
      public fun anonymousAuthDisableDate(anonymousAuthDisableDate: String)

      public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean)

      public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean)

      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable)

      public fun masterUserOptions(masterUserOptions: IResolvable)

      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db718d65484ad7164088f3bb85f48b915da76cb61cefa31caf55466a4df21631")
      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit)

      public fun samlOptions(samlOptions: IResolvable)

      public fun samlOptions(samlOptions: SAMLOptionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce753ad125cbf06be7919d8c6277eaf4989fa6029b9ca7fa095f124a48a12afb")
      public fun samlOptions(samlOptions: SAMLOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

      override fun anonymousAuthDisableDate(anonymousAuthDisableDate: String) {
        cdkBuilder.anonymousAuthDisableDate(anonymousAuthDisableDate)
      }

      override fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
      }

      override fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled.let(IResolvable::unwrap))
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
      }

      override fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled.let(IResolvable::unwrap))
      }

      override fun masterUserOptions(masterUserOptions: IResolvable) {
        cdkBuilder.masterUserOptions(masterUserOptions.let(IResolvable::unwrap))
      }

      override fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty) {
        cdkBuilder.masterUserOptions(masterUserOptions.let(MasterUserOptionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db718d65484ad7164088f3bb85f48b915da76cb61cefa31caf55466a4df21631")
      override
          fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit):
          Unit = masterUserOptions(MasterUserOptionsProperty(masterUserOptions))

      override fun samlOptions(samlOptions: IResolvable) {
        cdkBuilder.samlOptions(samlOptions.let(IResolvable::unwrap))
      }

      override fun samlOptions(samlOptions: SAMLOptionsProperty) {
        cdkBuilder.samlOptions(samlOptions.let(SAMLOptionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce753ad125cbf06be7919d8c6277eaf4989fa6029b9ca7fa095f124a48a12afb")
      override fun samlOptions(samlOptions: SAMLOptionsProperty.Builder.() -> Unit): Unit =
          samlOptions(SAMLOptionsProperty(samlOptions))

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty,
    ) : CdkObject(cdkObject), AdvancedSecurityOptionsInputProperty {
      override fun anonymousAuthDisableDate(): String? = unwrap(this).getAnonymousAuthDisableDate()

      override fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun internalUserDatabaseEnabled(): Any? =
          unwrap(this).getInternalUserDatabaseEnabled()

      override fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()

      override fun samlOptions(): Any? = unwrap(this).getSamlOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedSecurityOptionsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty):
          AdvancedSecurityOptionsInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedSecurityOptionsInputProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty
    }
  }

  public interface LogPublishingOptionProperty {
    public fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty.builder()

      override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty,
    ) : CdkObject(cdkObject), LogPublishingOptionProperty {
      override fun cloudWatchLogsLogGroupArn(): String? =
          unwrap(this).getCloudWatchLogsLogGroupArn()

      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogPublishingOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty):
          LogPublishingOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPublishingOptionProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty
    }
  }

  public interface IdpProperty {
    public fun entityId(): String

    public fun metadataContent(): String

    @CdkDslMarker
    public interface Builder {
      public fun entityId(entityId: String)

      public fun metadataContent(metadataContent: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty.builder()

      override fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
      }

      override fun metadataContent(metadataContent: String) {
        cdkBuilder.metadataContent(metadataContent)
      }

      public fun build(): software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty,
    ) : CdkObject(cdkObject), IdpProperty {
      override fun entityId(): String = unwrap(this).getEntityId()

      override fun metadataContent(): String = unwrap(this).getMetadataContent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty):
          IdpProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdpProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty
    }
  }

  public interface SoftwareUpdateOptionsProperty {
    public fun autoSoftwareUpdateEnabled(): Any? = unwrap(this).getAutoSoftwareUpdateEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: Boolean)

      public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty.builder()

      override fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: Boolean) {
        cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled)
      }

      override fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: IResolvable) {
        cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty,
    ) : CdkObject(cdkObject), SoftwareUpdateOptionsProperty {
      override fun autoSoftwareUpdateEnabled(): Any? = unwrap(this).getAutoSoftwareUpdateEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SoftwareUpdateOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty):
          SoftwareUpdateOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SoftwareUpdateOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty
    }
  }

  public interface OffPeakWindowProperty {
    public fun windowStartTime(): Any? = unwrap(this).getWindowStartTime()

    @CdkDslMarker
    public interface Builder {
      public fun windowStartTime(windowStartTime: IResolvable)

      public fun windowStartTime(windowStartTime: WindowStartTimeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc5262ef36470bc541159ef7d9a759a914ee2768b27431e784d1afc15afb33f3")
      public fun windowStartTime(windowStartTime: WindowStartTimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty.builder()

      override fun windowStartTime(windowStartTime: IResolvable) {
        cdkBuilder.windowStartTime(windowStartTime.let(IResolvable::unwrap))
      }

      override fun windowStartTime(windowStartTime: WindowStartTimeProperty) {
        cdkBuilder.windowStartTime(windowStartTime.let(WindowStartTimeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc5262ef36470bc541159ef7d9a759a914ee2768b27431e784d1afc15afb33f3")
      override fun windowStartTime(windowStartTime: WindowStartTimeProperty.Builder.() -> Unit):
          Unit = windowStartTime(WindowStartTimeProperty(windowStartTime))

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty,
    ) : CdkObject(cdkObject), OffPeakWindowProperty {
      override fun windowStartTime(): Any? = unwrap(this).getWindowStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OffPeakWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty):
          OffPeakWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OffPeakWindowProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty
    }
  }

  public interface SAMLOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun idp(): Any? = unwrap(this).getIdp()

    public fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

    public fun masterUserName(): String? = unwrap(this).getMasterUserName()

    public fun rolesKey(): String? = unwrap(this).getRolesKey()

    public fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

    public fun subjectKey(): String? = unwrap(this).getSubjectKey()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun idp(idp: IResolvable)

      public fun idp(idp: IdpProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f2e7eab165afbb620ad885b13a80a025703d8a9b6df570b0ab2364e8364860")
      public fun idp(idp: IdpProperty.Builder.() -> Unit)

      public fun masterBackendRole(masterBackendRole: String)

      public fun masterUserName(masterUserName: String)

      public fun rolesKey(rolesKey: String)

      public fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number)

      public fun subjectKey(subjectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun idp(idp: IResolvable) {
        cdkBuilder.idp(idp.let(IResolvable::unwrap))
      }

      override fun idp(idp: IdpProperty) {
        cdkBuilder.idp(idp.let(IdpProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f2e7eab165afbb620ad885b13a80a025703d8a9b6df570b0ab2364e8364860")
      override fun idp(idp: IdpProperty.Builder.() -> Unit): Unit = idp(IdpProperty(idp))

      override fun masterBackendRole(masterBackendRole: String) {
        cdkBuilder.masterBackendRole(masterBackendRole)
      }

      override fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
      }

      override fun rolesKey(rolesKey: String) {
        cdkBuilder.rolesKey(rolesKey)
      }

      override fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number) {
        cdkBuilder.sessionTimeoutMinutes(sessionTimeoutMinutes)
      }

      override fun subjectKey(subjectKey: String) {
        cdkBuilder.subjectKey(subjectKey)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty,
    ) : CdkObject(cdkObject), SAMLOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun idp(): Any? = unwrap(this).getIdp()

      override fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

      override fun masterUserName(): String? = unwrap(this).getMasterUserName()

      override fun rolesKey(): String? = unwrap(this).getRolesKey()

      override fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

      override fun subjectKey(): String? = unwrap(this).getSubjectKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SAMLOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty):
          SAMLOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAMLOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty
    }
  }

  public interface EncryptionAtRestOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty,
    ) : CdkObject(cdkObject), EncryptionAtRestOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty):
          EncryptionAtRestOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty
    }
  }

  public interface OffPeakWindowOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun offPeakWindow(): Any? = unwrap(this).getOffPeakWindow()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun offPeakWindow(offPeakWindow: IResolvable)

      public fun offPeakWindow(offPeakWindow: OffPeakWindowProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0816bae19b39183938b8f9bbfbcecebc689836be9c7c945c0fda0ba6d6bb8c40")
      public fun offPeakWindow(offPeakWindow: OffPeakWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun offPeakWindow(offPeakWindow: IResolvable) {
        cdkBuilder.offPeakWindow(offPeakWindow.let(IResolvable::unwrap))
      }

      override fun offPeakWindow(offPeakWindow: OffPeakWindowProperty) {
        cdkBuilder.offPeakWindow(offPeakWindow.let(OffPeakWindowProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0816bae19b39183938b8f9bbfbcecebc689836be9c7c945c0fda0ba6d6bb8c40")
      override fun offPeakWindow(offPeakWindow: OffPeakWindowProperty.Builder.() -> Unit): Unit =
          offPeakWindow(OffPeakWindowProperty(offPeakWindow))

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty,
    ) : CdkObject(cdkObject), OffPeakWindowOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun offPeakWindow(): Any? = unwrap(this).getOffPeakWindow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OffPeakWindowOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty):
          OffPeakWindowOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OffPeakWindowOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty
    }
  }

  public interface ClusterConfigProperty {
    public fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

    public fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

    public fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

    public fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun multiAzWithStandbyEnabled(): Any? = unwrap(this).getMultiAzWithStandbyEnabled()

    public fun warmCount(): Number? = unwrap(this).getWarmCount()

    public fun warmEnabled(): Any? = unwrap(this).getWarmEnabled()

    public fun warmType(): String? = unwrap(this).getWarmType()

    public fun zoneAwarenessConfig(): Any? = unwrap(this).getZoneAwarenessConfig()

    public fun zoneAwarenessEnabled(): Any? = unwrap(this).getZoneAwarenessEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun coldStorageOptions(coldStorageOptions: IResolvable)

      public fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1822352ea71203b92b2fbf8a9c574aa529cf46c3083eb8ea53e532de17da1635")
      public
          fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty.Builder.() -> Unit)

      public fun dedicatedMasterCount(dedicatedMasterCount: Number)

      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean)

      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable)

      public fun dedicatedMasterType(dedicatedMasterType: String)

      public fun instanceCount(instanceCount: Number)

      public fun instanceType(instanceType: String)

      public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean)

      public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: IResolvable)

      public fun warmCount(warmCount: Number)

      public fun warmEnabled(warmEnabled: Boolean)

      public fun warmEnabled(warmEnabled: IResolvable)

      public fun warmType(warmType: String)

      public fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable)

      public fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdc81f2f0fd336ad06569f2ff2c6451da52fa162b58311d6df529bf63527dbb0")
      public
          fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty.Builder.() -> Unit)

      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean)

      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty.builder()

      override fun coldStorageOptions(coldStorageOptions: IResolvable) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(IResolvable::unwrap))
      }

      override fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(ColdStorageOptionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1822352ea71203b92b2fbf8a9c574aa529cf46c3083eb8ea53e532de17da1635")
      override
          fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty.Builder.() -> Unit):
          Unit = coldStorageOptions(ColdStorageOptionsProperty(coldStorageOptions))

      override fun dedicatedMasterCount(dedicatedMasterCount: Number) {
        cdkBuilder.dedicatedMasterCount(dedicatedMasterCount)
      }

      override fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled)
      }

      override fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled.let(IResolvable::unwrap))
      }

      override fun dedicatedMasterType(dedicatedMasterType: String) {
        cdkBuilder.dedicatedMasterType(dedicatedMasterType)
      }

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
      }

      override fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: IResolvable) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled.let(IResolvable::unwrap))
      }

      override fun warmCount(warmCount: Number) {
        cdkBuilder.warmCount(warmCount)
      }

      override fun warmEnabled(warmEnabled: Boolean) {
        cdkBuilder.warmEnabled(warmEnabled)
      }

      override fun warmEnabled(warmEnabled: IResolvable) {
        cdkBuilder.warmEnabled(warmEnabled.let(IResolvable::unwrap))
      }

      override fun warmType(warmType: String) {
        cdkBuilder.warmType(warmType)
      }

      override fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig.let(IResolvable::unwrap))
      }

      override fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig.let(ZoneAwarenessConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdc81f2f0fd336ad06569f2ff2c6451da52fa162b58311d6df529bf63527dbb0")
      override
          fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty.Builder.() -> Unit):
          Unit = zoneAwarenessConfig(ZoneAwarenessConfigProperty(zoneAwarenessConfig))

      override fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled)
      }

      override fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty,
    ) : CdkObject(cdkObject), ClusterConfigProperty {
      override fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

      override fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

      override fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

      override fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun multiAzWithStandbyEnabled(): Any? = unwrap(this).getMultiAzWithStandbyEnabled()

      override fun warmCount(): Number? = unwrap(this).getWarmCount()

      override fun warmEnabled(): Any? = unwrap(this).getWarmEnabled()

      override fun warmType(): String? = unwrap(this).getWarmType()

      override fun zoneAwarenessConfig(): Any? = unwrap(this).getZoneAwarenessConfig()

      override fun zoneAwarenessEnabled(): Any? = unwrap(this).getZoneAwarenessEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty
    }
  }

  public interface NodeToNodeEncryptionOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty,
    ) : CdkObject(cdkObject), NodeToNodeEncryptionOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NodeToNodeEncryptionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty):
          NodeToNodeEncryptionOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeToNodeEncryptionOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty
    }
  }

  public interface SnapshotOptionsProperty {
    public fun automatedSnapshotStartHour(): Number? = unwrap(this).getAutomatedSnapshotStartHour()

    @CdkDslMarker
    public interface Builder {
      public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty.builder()

      override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty,
    ) : CdkObject(cdkObject), SnapshotOptionsProperty {
      override fun automatedSnapshotStartHour(): Number? =
          unwrap(this).getAutomatedSnapshotStartHour()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnapshotOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty):
          SnapshotOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapshotOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty
    }
  }

  public interface ZoneAwarenessConfigProperty {
    public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    @CdkDslMarker
    public interface Builder {
      public fun availabilityZoneCount(availabilityZoneCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty.builder()

      override fun availabilityZoneCount(availabilityZoneCount: Number) {
        cdkBuilder.availabilityZoneCount(availabilityZoneCount)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty,
    ) : CdkObject(cdkObject), ZoneAwarenessConfigProperty {
      override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty):
          ZoneAwarenessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZoneAwarenessConfigProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty
    }
  }

  public interface DomainEndpointOptionsProperty {
    public fun customEndpoint(): String? = unwrap(this).getCustomEndpoint()

    public fun customEndpointCertificateArn(): String? =
        unwrap(this).getCustomEndpointCertificateArn()

    public fun customEndpointEnabled(): Any? = unwrap(this).getCustomEndpointEnabled()

    public fun enforceHttps(): Any? = unwrap(this).getEnforceHttps()

    public fun tlsSecurityPolicy(): String? = unwrap(this).getTlsSecurityPolicy()

    @CdkDslMarker
    public interface Builder {
      public fun customEndpoint(customEndpoint: String)

      public fun customEndpointCertificateArn(customEndpointCertificateArn: String)

      public fun customEndpointEnabled(customEndpointEnabled: Boolean)

      public fun customEndpointEnabled(customEndpointEnabled: IResolvable)

      public fun enforceHttps(enforceHttps: Boolean)

      public fun enforceHttps(enforceHttps: IResolvable)

      public fun tlsSecurityPolicy(tlsSecurityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty.builder()

      override fun customEndpoint(customEndpoint: String) {
        cdkBuilder.customEndpoint(customEndpoint)
      }

      override fun customEndpointCertificateArn(customEndpointCertificateArn: String) {
        cdkBuilder.customEndpointCertificateArn(customEndpointCertificateArn)
      }

      override fun customEndpointEnabled(customEndpointEnabled: Boolean) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled)
      }

      override fun customEndpointEnabled(customEndpointEnabled: IResolvable) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled.let(IResolvable::unwrap))
      }

      override fun enforceHttps(enforceHttps: Boolean) {
        cdkBuilder.enforceHttps(enforceHttps)
      }

      override fun enforceHttps(enforceHttps: IResolvable) {
        cdkBuilder.enforceHttps(enforceHttps.let(IResolvable::unwrap))
      }

      override fun tlsSecurityPolicy(tlsSecurityPolicy: String) {
        cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty,
    ) : CdkObject(cdkObject), DomainEndpointOptionsProperty {
      override fun customEndpoint(): String? = unwrap(this).getCustomEndpoint()

      override fun customEndpointCertificateArn(): String? =
          unwrap(this).getCustomEndpointCertificateArn()

      override fun customEndpointEnabled(): Any? = unwrap(this).getCustomEndpointEnabled()

      override fun enforceHttps(): Any? = unwrap(this).getEnforceHttps()

      override fun tlsSecurityPolicy(): String? = unwrap(this).getTlsSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainEndpointOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty):
          DomainEndpointOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainEndpointOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty
    }
  }

  public interface ServiceSoftwareOptionsProperty {
    public fun automatedUpdateDate(): String? = unwrap(this).getAutomatedUpdateDate()

    public fun cancellable(): Any? = unwrap(this).getCancellable()

    public fun currentVersion(): String? = unwrap(this).getCurrentVersion()

    public fun description(): String? = unwrap(this).getDescription()

    public fun newVersion(): String? = unwrap(this).getNewVersion()

    public fun optionalDeployment(): Any? = unwrap(this).getOptionalDeployment()

    public fun updateAvailable(): Any? = unwrap(this).getUpdateAvailable()

    public fun updateStatus(): String? = unwrap(this).getUpdateStatus()

    @CdkDslMarker
    public interface Builder {
      public fun automatedUpdateDate(automatedUpdateDate: String)

      public fun cancellable(cancellable: Boolean)

      public fun cancellable(cancellable: IResolvable)

      public fun currentVersion(currentVersion: String)

      public fun description(description: String)

      public fun newVersion(newVersion: String)

      public fun optionalDeployment(optionalDeployment: Boolean)

      public fun optionalDeployment(optionalDeployment: IResolvable)

      public fun updateAvailable(updateAvailable: Boolean)

      public fun updateAvailable(updateAvailable: IResolvable)

      public fun updateStatus(updateStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty.builder()

      override fun automatedUpdateDate(automatedUpdateDate: String) {
        cdkBuilder.automatedUpdateDate(automatedUpdateDate)
      }

      override fun cancellable(cancellable: Boolean) {
        cdkBuilder.cancellable(cancellable)
      }

      override fun cancellable(cancellable: IResolvable) {
        cdkBuilder.cancellable(cancellable.let(IResolvable::unwrap))
      }

      override fun currentVersion(currentVersion: String) {
        cdkBuilder.currentVersion(currentVersion)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun newVersion(newVersion: String) {
        cdkBuilder.newVersion(newVersion)
      }

      override fun optionalDeployment(optionalDeployment: Boolean) {
        cdkBuilder.optionalDeployment(optionalDeployment)
      }

      override fun optionalDeployment(optionalDeployment: IResolvable) {
        cdkBuilder.optionalDeployment(optionalDeployment.let(IResolvable::unwrap))
      }

      override fun updateAvailable(updateAvailable: Boolean) {
        cdkBuilder.updateAvailable(updateAvailable)
      }

      override fun updateAvailable(updateAvailable: IResolvable) {
        cdkBuilder.updateAvailable(updateAvailable.let(IResolvable::unwrap))
      }

      override fun updateStatus(updateStatus: String) {
        cdkBuilder.updateStatus(updateStatus)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty,
    ) : CdkObject(cdkObject), ServiceSoftwareOptionsProperty {
      override fun automatedUpdateDate(): String? = unwrap(this).getAutomatedUpdateDate()

      override fun cancellable(): Any? = unwrap(this).getCancellable()

      override fun currentVersion(): String? = unwrap(this).getCurrentVersion()

      override fun description(): String? = unwrap(this).getDescription()

      override fun newVersion(): String? = unwrap(this).getNewVersion()

      override fun optionalDeployment(): Any? = unwrap(this).getOptionalDeployment()

      override fun updateAvailable(): Any? = unwrap(this).getUpdateAvailable()

      override fun updateStatus(): String? = unwrap(this).getUpdateStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceSoftwareOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty):
          ServiceSoftwareOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceSoftwareOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty
    }
  }

  public interface WindowStartTimeProperty {
    public fun hours(): Number

    public fun minutes(): Number

    @CdkDslMarker
    public interface Builder {
      public fun hours(hours: Number)

      public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty.builder()

      override fun hours(hours: Number) {
        cdkBuilder.hours(hours)
      }

      override fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty,
    ) : CdkObject(cdkObject), WindowStartTimeProperty {
      override fun hours(): Number = unwrap(this).getHours()

      override fun minutes(): Number = unwrap(this).getMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WindowStartTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty):
          WindowStartTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WindowStartTimeProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty
    }
  }

  public interface ColdStorageOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty,
    ) : CdkObject(cdkObject), ColdStorageOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColdStorageOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty):
          ColdStorageOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColdStorageOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty
    }
  }

  public interface VPCOptionsProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty,
    ) : CdkObject(cdkObject), VPCOptionsProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VPCOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty):
          VPCOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty
    }
  }

  public interface EBSOptionsProperty {
    public fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    @CdkDslMarker
    public interface Builder {
      public fun ebsEnabled(ebsEnabled: Boolean)

      public fun ebsEnabled(ebsEnabled: IResolvable)

      public fun iops(iops: Number)

      public fun throughput(throughput: Number)

      public fun volumeSize(volumeSize: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty.builder()

      override fun ebsEnabled(ebsEnabled: Boolean) {
        cdkBuilder.ebsEnabled(ebsEnabled)
      }

      override fun ebsEnabled(ebsEnabled: IResolvable) {
        cdkBuilder.ebsEnabled(ebsEnabled.let(IResolvable::unwrap))
      }

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty,
    ) : CdkObject(cdkObject), EBSOptionsProperty {
      override fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

      override fun iops(): Number? = unwrap(this).getIops()

      override fun throughput(): Number? = unwrap(this).getThroughput()

      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EBSOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty):
          EBSOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty
    }
  }

  public interface CognitoOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun userPoolId(): String? = unwrap(this).getUserPoolId()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun identityPoolId(identityPoolId: String)

      public fun roleArn(roleArn: String)

      public fun userPoolId(userPoolId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty,
    ) : CdkObject(cdkObject), CognitoOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun userPoolId(): String? = unwrap(this).getUserPoolId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty):
          CognitoOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty
    }
  }
}
