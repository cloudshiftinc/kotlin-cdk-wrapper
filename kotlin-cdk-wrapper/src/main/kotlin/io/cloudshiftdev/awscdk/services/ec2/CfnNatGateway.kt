@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNatGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnNatGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allocationId(): String? = unwrap(this).getAllocationId()

  public open fun allocationId(`value`: String) {
    unwrap(this).setAllocationId(`value`)
  }

  public open fun attrNatGatewayId(): String = unwrap(this).getAttrNatGatewayId()

  public open fun connectivityType(): String? = unwrap(this).getConnectivityType()

  public open fun connectivityType(`value`: String) {
    unwrap(this).setConnectivityType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxDrainDurationSeconds(): Number? = unwrap(this).getMaxDrainDurationSeconds()

  public open fun maxDrainDurationSeconds(`value`: Number) {
    unwrap(this).setMaxDrainDurationSeconds(`value`)
  }

  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  public open fun secondaryAllocationIds(): List<String> = unwrap(this).getSecondaryAllocationIds()
      ?: emptyList()

  public open fun secondaryAllocationIds(`value`: List<String>) {
    unwrap(this).setSecondaryAllocationIds(`value`)
  }

  public open fun secondaryAllocationIds(vararg `value`: String): Unit =
      secondaryAllocationIds(`value`.toList())

  public open fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

  public open fun secondaryPrivateIpAddressCount(`value`: Number) {
    unwrap(this).setSecondaryPrivateIpAddressCount(`value`)
  }

  public open fun secondaryPrivateIpAddresses(): List<String> =
      unwrap(this).getSecondaryPrivateIpAddresses() ?: emptyList()

  public open fun secondaryPrivateIpAddresses(`value`: List<String>) {
    unwrap(this).setSecondaryPrivateIpAddresses(`value`)
  }

  public open fun secondaryPrivateIpAddresses(vararg `value`: String): Unit =
      secondaryPrivateIpAddresses(`value`.toList())

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun allocationId(allocationId: String)

    public fun connectivityType(connectivityType: String)

    public fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number)

    public fun privateIpAddress(privateIpAddress: String)

    public fun secondaryAllocationIds(secondaryAllocationIds: List<String>)

    public fun secondaryAllocationIds(vararg secondaryAllocationIds: String)

    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

    public fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>)

    public fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNatGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnNatGateway.Builder.create(scope, id)

    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    override fun connectivityType(connectivityType: String) {
      cdkBuilder.connectivityType(connectivityType)
    }

    override fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number) {
      cdkBuilder.maxDrainDurationSeconds(maxDrainDurationSeconds)
    }

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    override fun secondaryAllocationIds(secondaryAllocationIds: List<String>) {
      cdkBuilder.secondaryAllocationIds(secondaryAllocationIds)
    }

    override fun secondaryAllocationIds(vararg secondaryAllocationIds: String): Unit =
        secondaryAllocationIds(secondaryAllocationIds.toList())

    override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
      cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    override fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>) {
      cdkBuilder.secondaryPrivateIpAddresses(secondaryPrivateIpAddresses)
    }

    override fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String): Unit =
        secondaryPrivateIpAddresses(secondaryPrivateIpAddresses.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNatGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNatGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNatGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNatGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNatGateway): CfnNatGateway =
        CfnNatGateway(cdkObject)

    internal fun unwrap(wrapped: CfnNatGateway): software.amazon.awscdk.services.ec2.CfnNatGateway =
        wrapped.cdkObject
  }
}
