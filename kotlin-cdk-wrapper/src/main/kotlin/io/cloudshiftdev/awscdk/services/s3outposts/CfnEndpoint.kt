@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun accessType(): String? = unwrap(this).getAccessType()

  public open fun accessType(`value`: String) {
    unwrap(this).setAccessType(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrNetworkInterfaces(): IResolvable =
      unwrap(this).getAttrNetworkInterfaces().let(IResolvable::wrap)

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun customerOwnedIpv4Pool(): String? = unwrap(this).getCustomerOwnedIpv4Pool()

  public open fun customerOwnedIpv4Pool(`value`: String) {
    unwrap(this).setCustomerOwnedIpv4Pool(`value`)
  }

  public open fun failedReason(): Any? = unwrap(this).getFailedReason()

  public open fun failedReason(`value`: IResolvable) {
    unwrap(this).setFailedReason(`value`.let(IResolvable::unwrap))
  }

  public open fun failedReason(`value`: FailedReasonProperty) {
    unwrap(this).setFailedReason(`value`.let(FailedReasonProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f2ff391bfccd338cfbbf223cbf665cecd7cd1cc1a8a176e11954563609a9c97")
  public open fun failedReason(`value`: FailedReasonProperty.Builder.() -> Unit): Unit =
      failedReason(FailedReasonProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun outpostId(): String = unwrap(this).getOutpostId()

  public open fun outpostId(`value`: String) {
    unwrap(this).setOutpostId(`value`)
  }

  public open fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

  public open fun securityGroupId(`value`: String) {
    unwrap(this).setSecurityGroupId(`value`)
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accessType(accessType: String)

    public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String)

    public fun failedReason(failedReason: IResolvable)

    public fun failedReason(failedReason: FailedReasonProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2bf573711bed046c73a2b08df717f4c5cb82e06bd041f2269347a95c18c91d2")
    public fun failedReason(failedReason: FailedReasonProperty.Builder.() -> Unit)

    public fun outpostId(outpostId: String)

    public fun securityGroupId(securityGroupId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnEndpoint.Builder =
        software.amazon.awscdk.services.s3outposts.CfnEndpoint.Builder.create(scope, id)

    override fun accessType(accessType: String) {
      cdkBuilder.accessType(accessType)
    }

    override fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
      cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
    }

    override fun failedReason(failedReason: IResolvable) {
      cdkBuilder.failedReason(failedReason.let(IResolvable::unwrap))
    }

    override fun failedReason(failedReason: FailedReasonProperty) {
      cdkBuilder.failedReason(failedReason.let(FailedReasonProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2bf573711bed046c73a2b08df717f4c5cb82e06bd041f2269347a95c18c91d2")
    override fun failedReason(failedReason: FailedReasonProperty.Builder.() -> Unit): Unit =
        failedReason(FailedReasonProperty(failedReason))

    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3outposts.CfnEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint):
        CfnEndpoint = CfnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEndpoint):
        software.amazon.awscdk.services.s3outposts.CfnEndpoint = wrapped.cdkObject
  }

  public interface FailedReasonProperty {
    public fun errorCode(): String? = unwrap(this).getErrorCode()

    public fun message(): String? = unwrap(this).getMessage()

    @CdkDslMarker
    public interface Builder {
      public fun errorCode(errorCode: String)

      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty.builder()

      override fun errorCode(errorCode: String) {
        cdkBuilder.errorCode(errorCode)
      }

      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty,
    ) : CdkObject(cdkObject), FailedReasonProperty {
      override fun errorCode(): String? = unwrap(this).getErrorCode()

      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailedReasonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty):
          FailedReasonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailedReasonProperty):
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.FailedReasonProperty
    }
  }

  public interface NetworkInterfaceProperty {
    public fun networkInterfaceId(): String

    @CdkDslMarker
    public interface Builder {
      public fun networkInterfaceId(networkInterfaceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty.builder()

      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty):
          NetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty
    }
  }
}
