@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnEndpointProps {
  public fun accessType(): String? = unwrap(this).getAccessType()

  public fun customerOwnedIpv4Pool(): String? = unwrap(this).getCustomerOwnedIpv4Pool()

  public fun failedReason(): Any? = unwrap(this).getFailedReason()

  public fun outpostId(): String

  public fun securityGroupId(): String

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun accessType(accessType: String)

    public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String)

    public fun failedReason(failedReason: IResolvable)

    public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c3d089c3e8c476b9e0b8ed9c67237d0b84df83caf99db01bf3d9f2b32b5082d")
    public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty.Builder.() -> Unit)

    public fun outpostId(outpostId: String)

    public fun securityGroupId(securityGroupId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.s3outposts.CfnEndpointProps.builder()

    override fun accessType(accessType: String) {
      cdkBuilder.accessType(accessType)
    }

    override fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
      cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
    }

    override fun failedReason(failedReason: IResolvable) {
      cdkBuilder.failedReason(failedReason.let(IResolvable::unwrap))
    }

    override fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty) {
      cdkBuilder.failedReason(failedReason.let(CfnEndpoint.FailedReasonProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c3d089c3e8c476b9e0b8ed9c67237d0b84df83caf99db01bf3d9f2b32b5082d")
    override fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty.Builder.() -> Unit):
        Unit = failedReason(CfnEndpoint.FailedReasonProperty(failedReason))

    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpointProps,
  ) : CdkObject(cdkObject), CfnEndpointProps {
    override fun accessType(): String? = unwrap(this).getAccessType()

    override fun customerOwnedIpv4Pool(): String? = unwrap(this).getCustomerOwnedIpv4Pool()

    override fun failedReason(): Any? = unwrap(this).getFailedReason()

    override fun outpostId(): String = unwrap(this).getOutpostId()

    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpointProps):
        CfnEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.s3outposts.CfnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3outposts.CfnEndpointProps
  }
}
