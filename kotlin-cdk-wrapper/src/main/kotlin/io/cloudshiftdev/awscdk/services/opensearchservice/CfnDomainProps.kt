@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnDomainProps {
  public fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  public fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

  public fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

  public fun clusterConfig(): Any? = unwrap(this).getClusterConfig()

  public fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  public fun domainArn(): String? = unwrap(this).getDomainArn()

  public fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

  public fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  public fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

  public fun offPeakWindowOptions(): Any? = unwrap(this).getOffPeakWindowOptions()

  public fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

  public fun softwareUpdateOptions(): Any? = unwrap(this).getSoftwareUpdateOptions()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicies(accessPolicies: Any)

    public fun advancedOptions(advancedOptions: IResolvable)

    public fun advancedOptions(advancedOptions: Map<String, String>)

    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable)

    public
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30ee01b6517988e016702c0105a13244fc39a2b67acb3b25d648b02bb1ca0315")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    public fun clusterConfig(clusterConfig: IResolvable)

    public fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("687c132b4b0ffd0bc9bac0e8de2446bab001c920a4d4af584fe3264ddce988de")
    public fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty.Builder.() -> Unit)

    public fun cognitoOptions(cognitoOptions: IResolvable)

    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118366a035fd8aafeeec90750d0fdc0e1b356259add40980f15d2d6304d50439")
    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty.Builder.() -> Unit)

    public fun domainArn(domainArn: String)

    public fun domainEndpointOptions(domainEndpointOptions: IResolvable)

    public fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("051edb339c8b160f809c4b2e5afe7f3e8443311c6d7eb20776d5c0335f15e280")
    public
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun ebsOptions(ebsOptions: IResolvable)

    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76604c52ddb45fa2e3e93fe73d14da85c5309704253238b37106c691b6737aff")
    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0675df4b91d7c60f2bfbcac7f144a25e595f44ffbddd0d51a6732e6d9180c804")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    public fun engineVersion(engineVersion: String)

    public fun ipAddressType(ipAddressType: String)

    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>)

    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable)

    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("126c70573ca5a4c41bc9c179ce3f17c9ffc4b4063175fa41cef1982653a46939")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    public fun offPeakWindowOptions(offPeakWindowOptions: IResolvable)

    public fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca9d785ff5be5741e5ec97deacd17bda8dd39a70da0db7a61d3efe04fba61c09")
    public
        fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty.Builder.() -> Unit)

    public fun snapshotOptions(snapshotOptions: IResolvable)

    public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc89ccf6c244ae00445f272cf807218ebe7041819bca81708fff0509fbec64a0")
    public
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit)

    public fun softwareUpdateOptions(softwareUpdateOptions: IResolvable)

    public fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d95b98ca239721610e8320b147a9a7e1391d4417a9640c6cd923653f27dfe5cb")
    public
        fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcOptions(vpcOptions: IResolvable)

    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39958d8993f1ed65d23a53c8c95a6418a976f01082d16479c3c32ab5c014c1c1")
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CfnDomainProps.Builder
        = software.amazon.awscdk.services.opensearchservice.CfnDomainProps.builder()

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
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(CfnDomain.AdvancedSecurityOptionsInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30ee01b6517988e016702c0105a13244fc39a2b67acb3b25d648b02bb1ca0315")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(CfnDomain.AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    override fun clusterConfig(clusterConfig: IResolvable) {
      cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
    }

    override fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty) {
      cdkBuilder.clusterConfig(clusterConfig.let(CfnDomain.ClusterConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("687c132b4b0ffd0bc9bac0e8de2446bab001c920a4d4af584fe3264ddce988de")
    override fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty.Builder.() -> Unit):
        Unit = clusterConfig(CfnDomain.ClusterConfigProperty(clusterConfig))

    override fun cognitoOptions(cognitoOptions: IResolvable) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(IResolvable::unwrap))
    }

    override fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(CfnDomain.CognitoOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118366a035fd8aafeeec90750d0fdc0e1b356259add40980f15d2d6304d50439")
    override
        fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty.Builder.() -> Unit):
        Unit = cognitoOptions(CfnDomain.CognitoOptionsProperty(cognitoOptions))

    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    override fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(IResolvable::unwrap))
    }

    override
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(CfnDomain.DomainEndpointOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("051edb339c8b160f809c4b2e5afe7f3e8443311c6d7eb20776d5c0335f15e280")
    override
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit):
        Unit = domainEndpointOptions(CfnDomain.DomainEndpointOptionsProperty(domainEndpointOptions))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun ebsOptions(ebsOptions: IResolvable) {
      cdkBuilder.ebsOptions(ebsOptions.let(IResolvable::unwrap))
    }

    override fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty) {
      cdkBuilder.ebsOptions(ebsOptions.let(CfnDomain.EBSOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76604c52ddb45fa2e3e93fe73d14da85c5309704253238b37106c691b6737aff")
    override fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(CfnDomain.EBSOptionsProperty(ebsOptions))

    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(CfnDomain.EncryptionAtRestOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0675df4b91d7c60f2bfbcac7f144a25e595f44ffbddd0d51a6732e6d9180c804")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit =
        encryptionAtRestOptions(CfnDomain.EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

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
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(CfnDomain.NodeToNodeEncryptionOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("126c70573ca5a4c41bc9c179ce3f17c9ffc4b4063175fa41cef1982653a46939")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(CfnDomain.NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    override fun offPeakWindowOptions(offPeakWindowOptions: IResolvable) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(IResolvable::unwrap))
    }

    override
        fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(CfnDomain.OffPeakWindowOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca9d785ff5be5741e5ec97deacd17bda8dd39a70da0db7a61d3efe04fba61c09")
    override
        fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty.Builder.() -> Unit):
        Unit = offPeakWindowOptions(CfnDomain.OffPeakWindowOptionsProperty(offPeakWindowOptions))

    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable::unwrap))
    }

    override fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(CfnDomain.SnapshotOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc89ccf6c244ae00445f272cf807218ebe7041819bca81708fff0509fbec64a0")
    override
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit):
        Unit = snapshotOptions(CfnDomain.SnapshotOptionsProperty(snapshotOptions))

    override fun softwareUpdateOptions(softwareUpdateOptions: IResolvable) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(IResolvable::unwrap))
    }

    override
        fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(CfnDomain.SoftwareUpdateOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d95b98ca239721610e8320b147a9a7e1391d4417a9640c6cd923653f27dfe5cb")
    override
        fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty.Builder.() -> Unit):
        Unit = softwareUpdateOptions(CfnDomain.SoftwareUpdateOptionsProperty(softwareUpdateOptions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable::unwrap))
    }

    override fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(CfnDomain.VPCOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39958d8993f1ed65d23a53c8c95a6418a976f01082d16479c3c32ab5c014c1c1")
    override fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(CfnDomain.VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.opensearchservice.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    override fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

    override fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

    override fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

    override fun clusterConfig(): Any? = unwrap(this).getClusterConfig()

    override fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

    override fun domainArn(): String? = unwrap(this).getDomainArn()

    override fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

    override fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    override fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

    override fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

    override fun offPeakWindowOptions(): Any? = unwrap(this).getOffPeakWindowOptions()

    override fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

    override fun softwareUpdateOptions(): Any? = unwrap(this).getSoftwareUpdateOptions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomainProps):
        CfnDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.opensearchservice.CfnDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.CfnDomainProps
  }
}
