@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnNetworkInterfaceAttachmentProps {
  public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

  public fun deviceIndex(): String

  public fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

  public fun instanceId(): String

  public fun networkInterfaceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    public fun deleteOnTermination(deleteOnTermination: IResolvable)

    public fun deviceIndex(deviceIndex: String)

    public fun enaSrdSpecification(enaSrdSpecification: IResolvable)

    public
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b1dc0ecbc9c51385c4709e3e8f65751095bfdac61c3283e937b611eb7e43fcb")
    public
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.Builder.() -> Unit)

    public fun instanceId(instanceId: String)

    public fun networkInterfaceId(networkInterfaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps.builder()

    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    override fun deleteOnTermination(deleteOnTermination: IResolvable) {
      cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
    }

    override fun deviceIndex(deviceIndex: String) {
      cdkBuilder.deviceIndex(deviceIndex)
    }

    override fun enaSrdSpecification(enaSrdSpecification: IResolvable) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(IResolvable::unwrap))
    }

    override
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b1dc0ecbc9c51385c4709e3e8f65751095bfdac61c3283e937b611eb7e43fcb")
    override
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.Builder.() -> Unit):
        Unit =
        enaSrdSpecification(CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty(enaSrdSpecification))

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps,
  ) : CdkObject(cdkObject), CfnNetworkInterfaceAttachmentProps {
    override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    override fun deviceIndex(): String = unwrap(this).getDeviceIndex()

    override fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInterfaceAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps):
        CfnNetworkInterfaceAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfaceAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps
  }
}
