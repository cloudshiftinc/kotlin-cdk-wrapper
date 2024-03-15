@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

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
  internal override val cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain,
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
  @JvmName("773ccefc549b2fa4e4123cae827637e6f1cffb6bb3ac66c5c9615023a04f7c5a")
  public open
      fun advancedSecurityOptions(`value`: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
      Unit = advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDomainEndpoint(): String = unwrap(this).getAttrDomainEndpoint()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  public open fun cognitoOptions(`value`: IResolvable) {
    unwrap(this).setCognitoOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun cognitoOptions(`value`: CognitoOptionsProperty) {
    unwrap(this).setCognitoOptions(`value`.let(CognitoOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("376ff02f0c45af686dcbcb6056dad195037e22f0171f6eddab7b10a5c794371a")
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
  @JvmName("d009ac74fb400129841db85366ad59b56e1718eb8e3980da47f79396489b3937")
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
  @JvmName("6768c00a3029573cc0cb79072789436e8391425507648ddc3c9d02be5261e712")
  public open fun ebsOptions(`value`: EBSOptionsProperty.Builder.() -> Unit): Unit =
      ebsOptions(EBSOptionsProperty(`value`))

  public open fun elasticsearchClusterConfig(): Any? = unwrap(this).getElasticsearchClusterConfig()

  public open fun elasticsearchClusterConfig(`value`: IResolvable) {
    unwrap(this).setElasticsearchClusterConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticsearchClusterConfig(`value`: ElasticsearchClusterConfigProperty) {
    unwrap(this).setElasticsearchClusterConfig(`value`.let(ElasticsearchClusterConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7ae7d596e4d54f29d7f6d9ff6714a6dfd7522ffa503bc13c56d2cdf331d6d37")
  public open
      fun elasticsearchClusterConfig(`value`: ElasticsearchClusterConfigProperty.Builder.() -> Unit):
      Unit = elasticsearchClusterConfig(ElasticsearchClusterConfigProperty(`value`))

  public open fun elasticsearchVersion(): String? = unwrap(this).getElasticsearchVersion()

  public open fun elasticsearchVersion(`value`: String) {
    unwrap(this).setElasticsearchVersion(`value`)
  }

  public open fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  public open fun encryptionAtRestOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(EncryptionAtRestOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bf46e4a8c2c129a1414c35e7de13148b1aef54052da188dc43acc672fd774c9c")
  public open
      fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty.Builder.() -> Unit): Unit
      = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
  @JvmName("8c9ff30a6a1b7e574775fad68c85f558198153c1046bd4193cc2dadb23755b78")
  public open
      fun nodeToNodeEncryptionOptions(`value`: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
      Unit = nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(`value`))

  public open fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

  public open fun snapshotOptions(`value`: IResolvable) {
    unwrap(this).setSnapshotOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun snapshotOptions(`value`: SnapshotOptionsProperty) {
    unwrap(this).setSnapshotOptions(`value`.let(SnapshotOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc4f150efb3c3973f06d2ca913e6a89d0cd541d421ce5b07116f3743b6965254")
  public open fun snapshotOptions(`value`: SnapshotOptionsProperty.Builder.() -> Unit): Unit =
      snapshotOptions(SnapshotOptionsProperty(`value`))

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
  @JvmName("ad36f4e76fe63ece9232840e75ac1284de33647ee6fcb250834483f35ed59775")
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
    @JvmName("bb504904a7587abeba267c32d0bffd3f6767f0a3c402604120a150b8bd1adb28")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    public fun cognitoOptions(cognitoOptions: IResolvable)

    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c04adaa73bbc4d4e9f4d7c0384f51585afcb7fc3101bc0b2d83833feab8b32")
    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty.Builder.() -> Unit)

    public fun domainArn(domainArn: String)

    public fun domainEndpointOptions(domainEndpointOptions: IResolvable)

    public fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4869c5dee7f082e87fa965a3be680763f6fd8c50c0efb261db8a3eb68e28921d")
    public
        fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun ebsOptions(ebsOptions: IResolvable)

    public fun ebsOptions(ebsOptions: EBSOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4e85df7c6b7a9001fa4bfc258e7863399aef3b1826404e2af4c7a38e646fe8a")
    public fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit)

    public fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable)

    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c39776ab909b055508fc1cee38bbcd6132a0d10196754b515ba262a40567e39c")
    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty.Builder.() -> Unit)

    public fun elasticsearchVersion(elasticsearchVersion: String)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8320db660a34415aa9d094cca4924d36f11e55e2b203728911494f3cd29df022")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>)

    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable)

    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b014ca6637b558a99492fd728be1f18159f43019e21def598d9569ea16e2fd3")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    public fun snapshotOptions(snapshotOptions: IResolvable)

    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46747f5623a38821047b996ba4524c1c648e164a66637321babaa37d159b2460")
    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcOptions(vpcOptions: IResolvable)

    public fun vpcOptions(vpcOptions: VPCOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656bc9229ee8294ec5c29f3bda4752a4b03621f0a008d7e5c593522f46ea35e3")
    public fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CfnDomain.Builder =
        software.amazon.awscdk.services.elasticsearch.CfnDomain.Builder.create(scope, id)

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
    @JvmName("bb504904a7587abeba267c32d0bffd3f6767f0a3c402604120a150b8bd1adb28")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    override fun cognitoOptions(cognitoOptions: IResolvable) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(IResolvable::unwrap))
    }

    override fun cognitoOptions(cognitoOptions: CognitoOptionsProperty) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(CognitoOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c04adaa73bbc4d4e9f4d7c0384f51585afcb7fc3101bc0b2d83833feab8b32")
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
    @JvmName("4869c5dee7f082e87fa965a3be680763f6fd8c50c0efb261db8a3eb68e28921d")
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
    @JvmName("c4e85df7c6b7a9001fa4bfc258e7863399aef3b1826404e2af4c7a38e646fe8a")
    override fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(EBSOptionsProperty(ebsOptions))

    override fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(IResolvable::unwrap))
    }

    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(ElasticsearchClusterConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c39776ab909b055508fc1cee38bbcd6132a0d10196754b515ba262a40567e39c")
    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty.Builder.() -> Unit):
        Unit =
        elasticsearchClusterConfig(ElasticsearchClusterConfigProperty(elasticsearchClusterConfig))

    override fun elasticsearchVersion(elasticsearchVersion: String) {
      cdkBuilder.elasticsearchVersion(elasticsearchVersion)
    }

    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    override fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(EncryptionAtRestOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8320db660a34415aa9d094cca4924d36f11e55e2b203728911494f3cd29df022")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

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
    @JvmName("0b014ca6637b558a99492fd728be1f18159f43019e21def598d9569ea16e2fd3")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable::unwrap))
    }

    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(SnapshotOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46747f5623a38821047b996ba4524c1c648e164a66637321babaa37d159b2460")
    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit): Unit
        = snapshotOptions(SnapshotOptionsProperty(snapshotOptions))

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
    @JvmName("656bc9229ee8294ec5c29f3bda4752a4b03621f0a008d7e5c593522f46ea35e3")
    override fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticsearch.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain): CfnDomain
        = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.elasticsearch.CfnDomain
        = wrapped.cdkObject
  }

  public interface ElasticsearchClusterConfigProperty {
    public fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

    public fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

    public fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

    public fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

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
      @JvmName("422146e369f2bd2058d64bd25b67c7c132c1c7cd214cc901c1b4df6c7519c19d")
      public
          fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty.Builder.() -> Unit)

      public fun dedicatedMasterCount(dedicatedMasterCount: Number)

      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean)

      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable)

      public fun dedicatedMasterType(dedicatedMasterType: String)

      public fun instanceCount(instanceCount: Number)

      public fun instanceType(instanceType: String)

      public fun warmCount(warmCount: Number)

      public fun warmEnabled(warmEnabled: Boolean)

      public fun warmEnabled(warmEnabled: IResolvable)

      public fun warmType(warmType: String)

      public fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable)

      public fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("934fdbf4a6c0696b943b2d5c8721ebac46efd04bbe642d45996d5fb74040eb3c")
      public
          fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty.Builder.() -> Unit)

      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean)

      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.builder()

      override fun coldStorageOptions(coldStorageOptions: IResolvable) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(IResolvable::unwrap))
      }

      override fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(ColdStorageOptionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("422146e369f2bd2058d64bd25b67c7c132c1c7cd214cc901c1b4df6c7519c19d")
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
      @JvmName("934fdbf4a6c0696b943b2d5c8721ebac46efd04bbe642d45996d5fb74040eb3c")
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty,
    ) : CdkObject(cdkObject), ElasticsearchClusterConfigProperty {
      override fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

      override fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

      override fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

      override fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun warmCount(): Number? = unwrap(this).getWarmCount()

      override fun warmEnabled(): Any? = unwrap(this).getWarmEnabled()

      override fun warmType(): String? = unwrap(this).getWarmType()

      override fun zoneAwarenessConfig(): Any? = unwrap(this).getZoneAwarenessConfig()

      override fun zoneAwarenessEnabled(): Any? = unwrap(this).getZoneAwarenessEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty):
          ElasticsearchClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchClusterConfigProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty
    }
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty.builder()

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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty):
          MasterUserOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty
    }
  }

  public interface AdvancedSecurityOptionsInputProperty {
    public fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun internalUserDatabaseEnabled(): Any? = unwrap(this).getInternalUserDatabaseEnabled()

    public fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()

    @CdkDslMarker
    public interface Builder {
      public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean)

      public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean)

      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable)

      public fun masterUserOptions(masterUserOptions: IResolvable)

      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8b99364a7a797efb4caa40815da91bc63a60a5bafb54620f1c05db76cda54b0")
      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

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
      @JvmName("f8b99364a7a797efb4caa40815da91bc63a60a5bafb54620f1c05db76cda54b0")
      override
          fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit):
          Unit = masterUserOptions(MasterUserOptionsProperty(masterUserOptions))

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty,
    ) : CdkObject(cdkObject), AdvancedSecurityOptionsInputProperty {
      override fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun internalUserDatabaseEnabled(): Any? =
          unwrap(this).getInternalUserDatabaseEnabled()

      override fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedSecurityOptionsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty):
          AdvancedSecurityOptionsInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedSecurityOptionsInputProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty.builder()

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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty):
          LogPublishingOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPublishingOptionProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.builder()

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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty):
          EncryptionAtRestOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty):
          NodeToNodeEncryptionOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeToNodeEncryptionOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.builder()

      override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty):
          SnapshotOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapshotOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty.builder()

      override fun availabilityZoneCount(availabilityZoneCount: Number) {
        cdkBuilder.availabilityZoneCount(availabilityZoneCount)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty,
    ) : CdkObject(cdkObject), ZoneAwarenessConfigProperty {
      override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty):
          ZoneAwarenessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZoneAwarenessConfigProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty.builder()

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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty):
          DomainEndpointOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainEndpointOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty,
    ) : CdkObject(cdkObject), ColdStorageOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColdStorageOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty):
          ColdStorageOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColdStorageOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty):
          VPCOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty
    }
  }

  public interface EBSOptionsProperty {
    public fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    @CdkDslMarker
    public interface Builder {
      public fun ebsEnabled(ebsEnabled: Boolean)

      public fun ebsEnabled(ebsEnabled: IResolvable)

      public fun iops(iops: Number)

      public fun volumeSize(volumeSize: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.builder()

      override fun ebsEnabled(ebsEnabled: Boolean) {
        cdkBuilder.ebsEnabled(ebsEnabled)
      }

      override fun ebsEnabled(ebsEnabled: IResolvable) {
        cdkBuilder.ebsEnabled(ebsEnabled.let(IResolvable::unwrap))
      }

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty,
    ) : CdkObject(cdkObject), EBSOptionsProperty {
      override fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

      override fun iops(): Number? = unwrap(this).getIops()

      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EBSOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty):
          EBSOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty
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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty.builder()

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
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty):
          CognitoOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty
    }
  }
}
