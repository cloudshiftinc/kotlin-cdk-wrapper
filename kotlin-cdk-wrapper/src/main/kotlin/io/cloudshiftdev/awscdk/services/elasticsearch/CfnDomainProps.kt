@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

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

  public fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  public fun domainArn(): String? = unwrap(this).getDomainArn()

  public fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

  public fun elasticsearchClusterConfig(): Any? = unwrap(this).getElasticsearchClusterConfig()

  public fun elasticsearchVersion(): String? = unwrap(this).getElasticsearchVersion()

  public fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  public fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  public fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

  public fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

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
    @JvmName("50d069ce8363f0b61dbba673dbe267859dec462e47eb5705170d33440393c43e")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    public fun cognitoOptions(cognitoOptions: IResolvable)

    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89e6717344b3728e3cd25adc3343cde5ac8c9be469a2f271899674f19a76ae96")
    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty.Builder.() -> Unit)

    public fun domainArn(domainArn: String)

    public fun domainEndpointOptions(domainEndpointOptions: IResolvable)

    public fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f84379a8689372c0b471619ea2587600fdaab93d3355b719732a00352a0d4131")
    public
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun ebsOptions(ebsOptions: IResolvable)

    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5650cf1db98cb0af7433f5ba44cd71bde157d752274c6e9eea214e78761b167")
    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit)

    public fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable)

    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c066cb1f954b7830700b635d3a8aa99f7e44df883c1bb8d1a67f2f9ad8b8f7a0")
    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty.Builder.() -> Unit)

    public fun elasticsearchVersion(elasticsearchVersion: String)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4072ac921cbb0c2727d782a42bd58e69362114e428175970aeec397d2c8c2a7")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>)

    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable)

    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c228037ed4321e49b29dc77e8c0e144466ef1ff7bd5857ac200883f0ecfa7329")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    public fun snapshotOptions(snapshotOptions: IResolvable)

    public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fa0ba68714d54331505baf65e67e92cf187bcda367bf8ac2bb5eef1bed2adea")
    public
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcOptions(vpcOptions: IResolvable)

    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd085fa7b192f56cb1de104be3ad5979fd46f6c5045776f9400610a20b8cd0a9")
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder =
        software.amazon.awscdk.services.elasticsearch.CfnDomainProps.builder()

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
    @JvmName("50d069ce8363f0b61dbba673dbe267859dec462e47eb5705170d33440393c43e")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(CfnDomain.AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    override fun cognitoOptions(cognitoOptions: IResolvable) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(IResolvable::unwrap))
    }

    override fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(CfnDomain.CognitoOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89e6717344b3728e3cd25adc3343cde5ac8c9be469a2f271899674f19a76ae96")
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
    @JvmName("f84379a8689372c0b471619ea2587600fdaab93d3355b719732a00352a0d4131")
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
    @JvmName("c5650cf1db98cb0af7433f5ba44cd71bde157d752274c6e9eea214e78761b167")
    override fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(CfnDomain.EBSOptionsProperty(ebsOptions))

    override fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(IResolvable::unwrap))
    }

    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(CfnDomain.ElasticsearchClusterConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c066cb1f954b7830700b635d3a8aa99f7e44df883c1bb8d1a67f2f9ad8b8f7a0")
    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty.Builder.() -> Unit):
        Unit =
        elasticsearchClusterConfig(CfnDomain.ElasticsearchClusterConfigProperty(elasticsearchClusterConfig))

    override fun elasticsearchVersion(elasticsearchVersion: String) {
      cdkBuilder.elasticsearchVersion(elasticsearchVersion)
    }

    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(CfnDomain.EncryptionAtRestOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4072ac921cbb0c2727d782a42bd58e69362114e428175970aeec397d2c8c2a7")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit =
        encryptionAtRestOptions(CfnDomain.EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

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
    @JvmName("c228037ed4321e49b29dc77e8c0e144466ef1ff7bd5857ac200883f0ecfa7329")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(CfnDomain.NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable::unwrap))
    }

    override fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(CfnDomain.SnapshotOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fa0ba68714d54331505baf65e67e92cf187bcda367bf8ac2bb5eef1bed2adea")
    override
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit):
        Unit = snapshotOptions(CfnDomain.SnapshotOptionsProperty(snapshotOptions))

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
    @JvmName("bd085fa7b192f56cb1de104be3ad5979fd46f6c5045776f9400610a20b8cd0a9")
    override fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(CfnDomain.VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    override fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

    override fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

    override fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

    override fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

    override fun domainArn(): String? = unwrap(this).getDomainArn()

    override fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

    override fun elasticsearchClusterConfig(): Any? = unwrap(this).getElasticsearchClusterConfig()

    override fun elasticsearchVersion(): String? = unwrap(this).getElasticsearchVersion()

    override fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

    override fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

    override fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

    override fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomainProps):
        CfnDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.elasticsearch.CfnDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.CfnDomainProps
  }
}
