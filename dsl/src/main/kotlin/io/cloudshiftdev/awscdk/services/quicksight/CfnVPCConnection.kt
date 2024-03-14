package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrNetworkInterfaces(): IResolvable =
      unwrap(this).getAttrNetworkInterfaces().let(IResolvable::wrap)

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public open fun availabilityStatus(): String? = unwrap(this).getAvailabilityStatus()

  public open fun availabilityStatus(`value`: String) {
    unwrap(this).setAvailabilityStatus(`value`)
  }

  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public open fun dnsResolvers(): List<String> = unwrap(this).getDnsResolvers() ?: emptyList()

  public open fun dnsResolvers(`value`: List<String>) {
    unwrap(this).setDnsResolvers(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcConnectionId(): String? = unwrap(this).getVpcConnectionId()

  public open fun vpcConnectionId(`value`: String) {
    unwrap(this).setVpcConnectionId(`value`)
  }

  public interface Builder {
    public fun availabilityStatus(availabilityStatus: String)

    public fun awsAccountId(awsAccountId: String)

    public fun dnsResolvers(dnsResolvers: List<String>)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun subnetIds(subnetIds: List<String>)

    public fun tags(tags: List<CfnTag>)

    public fun vpcConnectionId(vpcConnectionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnVPCConnection.Builder =
        software.amazon.awscdk.services.quicksight.CfnVPCConnection.Builder.create(scope, id)

    override fun availabilityStatus(availabilityStatus: String) {
      cdkBuilder.availabilityStatus(availabilityStatus)
    }

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun dnsResolvers(dnsResolvers: List<String>) {
      cdkBuilder.dnsResolvers(dnsResolvers)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpcConnectionId(vpcConnectionId: String) {
      cdkBuilder.vpcConnectionId(vpcConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnVPCConnection =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnection):
        CfnVPCConnection = CfnVPCConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVPCConnection):
        software.amazon.awscdk.services.quicksight.CfnVPCConnection = wrapped.cdkObject
  }

  public interface NetworkInterfaceProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun errorMessage(): String? = unwrap(this).getErrorMessage()

    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun status(): String? = unwrap(this).getStatus()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun errorMessage(errorMessage: String)

      public fun networkInterfaceId(networkInterfaceId: String)

      public fun status(status: String)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun errorMessage(errorMessage: String) {
        cdkBuilder.errorMessage(errorMessage)
      }

      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty,
    ) : NetworkInterfaceProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun errorMessage(): String? = unwrap(this).getErrorMessage()

      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      override fun status(): String? = unwrap(this).getStatus()

      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty):
          NetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
