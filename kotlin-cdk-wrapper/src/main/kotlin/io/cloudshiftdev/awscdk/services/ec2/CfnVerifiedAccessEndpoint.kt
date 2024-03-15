@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVerifiedAccessEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationDomain(): String = unwrap(this).getApplicationDomain()

  public open fun applicationDomain(`value`: String) {
    unwrap(this).setApplicationDomain(`value`)
  }

  public open fun attachmentType(): String = unwrap(this).getAttachmentType()

  public open fun attachmentType(`value`: String) {
    unwrap(this).setAttachmentType(`value`)
  }

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrDeviceValidationDomain(): String =
      unwrap(this).getAttrDeviceValidationDomain()

  public open fun attrEndpointDomain(): String = unwrap(this).getAttrEndpointDomain()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrVerifiedAccessEndpointId(): String =
      unwrap(this).getAttrVerifiedAccessEndpointId()

  public open fun attrVerifiedAccessInstanceId(): String =
      unwrap(this).getAttrVerifiedAccessInstanceId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainCertificateArn(): String = unwrap(this).getDomainCertificateArn()

  public open fun domainCertificateArn(`value`: String) {
    unwrap(this).setDomainCertificateArn(`value`)
  }

  public open fun endpointDomainPrefix(): String = unwrap(this).getEndpointDomainPrefix()

  public open fun endpointDomainPrefix(`value`: String) {
    unwrap(this).setEndpointDomainPrefix(`value`)
  }

  public open fun endpointType(): String = unwrap(this).getEndpointType()

  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loadBalancerOptions(): Any? = unwrap(this).getLoadBalancerOptions()

  public open fun loadBalancerOptions(`value`: IResolvable) {
    unwrap(this).setLoadBalancerOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun loadBalancerOptions(`value`: LoadBalancerOptionsProperty) {
    unwrap(this).setLoadBalancerOptions(`value`.let(LoadBalancerOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a124788efaf0789ac8ba6402764765993e15413edebaed50f0fd022ca6528b6")
  public open fun loadBalancerOptions(`value`: LoadBalancerOptionsProperty.Builder.() -> Unit): Unit
      = loadBalancerOptions(LoadBalancerOptionsProperty(`value`))

  public open fun networkInterfaceOptions(): Any? = unwrap(this).getNetworkInterfaceOptions()

  public open fun networkInterfaceOptions(`value`: IResolvable) {
    unwrap(this).setNetworkInterfaceOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun networkInterfaceOptions(`value`: NetworkInterfaceOptionsProperty) {
    unwrap(this).setNetworkInterfaceOptions(`value`.let(NetworkInterfaceOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8337e634bb339ea7c0b6c5700f18e57880bbed9f22f8e02d7ce517292a2e577")
  public open
      fun networkInterfaceOptions(`value`: NetworkInterfaceOptionsProperty.Builder.() -> Unit): Unit
      = networkInterfaceOptions(NetworkInterfaceOptionsProperty(`value`))

  public open fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: String) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  public open fun policyEnabled(`value`: Boolean) {
    unwrap(this).setPolicyEnabled(`value`)
  }

  public open fun policyEnabled(`value`: IResolvable) {
    unwrap(this).setPolicyEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun sseSpecification(`value`: SseSpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SseSpecificationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f32d85d924ae65480defb821300c1182d571b5d5dbd7911712e1ba2c787447ff")
  public open fun sseSpecification(`value`: SseSpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SseSpecificationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun verifiedAccessGroupId(): String = unwrap(this).getVerifiedAccessGroupId()

  public open fun verifiedAccessGroupId(`value`: String) {
    unwrap(this).setVerifiedAccessGroupId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun applicationDomain(applicationDomain: String)

    public fun attachmentType(attachmentType: String)

    public fun description(description: String)

    public fun domainCertificateArn(domainCertificateArn: String)

    public fun endpointDomainPrefix(endpointDomainPrefix: String)

    public fun endpointType(endpointType: String)

    public fun loadBalancerOptions(loadBalancerOptions: IResolvable)

    public fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("143e30768e84ff117f0de95a9204553a81b007de64b519d78dda6c2e926011c5")
    public
        fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty.Builder.() -> Unit)

    public fun networkInterfaceOptions(networkInterfaceOptions: IResolvable)

    public fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93b2625a3c0c0e0f890aae64cb437a3d456fd501658d5fff8b2c449e92f2d719")
    public
        fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty.Builder.() -> Unit)

    public fun policyDocument(policyDocument: String)

    public fun policyEnabled(policyEnabled: Boolean)

    public fun policyEnabled(policyEnabled: IResolvable)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: SseSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90791316987fd26f73cbd2cfebc78c4966a8f66169472336106115aafd42b831")
    public fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun verifiedAccessGroupId(verifiedAccessGroupId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.Builder.create(scope, id)

    override fun applicationDomain(applicationDomain: String) {
      cdkBuilder.applicationDomain(applicationDomain)
    }

    override fun attachmentType(attachmentType: String) {
      cdkBuilder.attachmentType(attachmentType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainCertificateArn(domainCertificateArn: String) {
      cdkBuilder.domainCertificateArn(domainCertificateArn)
    }

    override fun endpointDomainPrefix(endpointDomainPrefix: String) {
      cdkBuilder.endpointDomainPrefix(endpointDomainPrefix)
    }

    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    override fun loadBalancerOptions(loadBalancerOptions: IResolvable) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(IResolvable::unwrap))
    }

    override fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(LoadBalancerOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("143e30768e84ff117f0de95a9204553a81b007de64b519d78dda6c2e926011c5")
    override
        fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty.Builder.() -> Unit):
        Unit = loadBalancerOptions(LoadBalancerOptionsProperty(loadBalancerOptions))

    override fun networkInterfaceOptions(networkInterfaceOptions: IResolvable) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(IResolvable::unwrap))
    }

    override fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(NetworkInterfaceOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93b2625a3c0c0e0f890aae64cb437a3d456fd501658d5fff8b2c449e92f2d719")
    override
        fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty.Builder.() -> Unit):
        Unit = networkInterfaceOptions(NetworkInterfaceOptionsProperty(networkInterfaceOptions))

    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable::unwrap))
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SseSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90791316987fd26f73cbd2cfebc78c4966a8f66169472336106115aafd42b831")
    override fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SseSpecificationProperty(sseSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun verifiedAccessGroupId(verifiedAccessGroupId: String) {
      cdkBuilder.verifiedAccessGroupId(verifiedAccessGroupId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint):
        CfnVerifiedAccessEndpoint = CfnVerifiedAccessEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessEndpoint):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint = wrapped.cdkObject
  }

  public interface NetworkInterfaceOptionsProperty {
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun port(): Number? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    @CdkDslMarker
    public interface Builder {
      public fun networkInterfaceId(networkInterfaceId: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.builder()

      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceOptionsProperty {
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      override fun port(): Number? = unwrap(this).getPort()

      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty):
          NetworkInterfaceOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
    }
  }

  public interface SseSpecificationProperty {
    public fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    @CdkDslMarker
    public interface Builder {
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean)

      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable)

      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty.builder()

      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
      }

      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled.let(IResolvable::unwrap))
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty,
    ) : CdkObject(cdkObject), SseSpecificationProperty {
      override fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty):
          SseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty
    }
  }

  public interface LoadBalancerOptionsProperty {
    public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    public fun port(): Number? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun loadBalancerArn(loadBalancerArn: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.builder()

      override fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty,
    ) : CdkObject(cdkObject), LoadBalancerOptionsProperty {
      override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

      override fun port(): Number? = unwrap(this).getPort()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty):
          LoadBalancerOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
    }
  }
}
