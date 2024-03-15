@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnVolumeAttachmentProps {
  public fun device(): String? = unwrap(this).getDevice()

  public fun instanceId(): String

  public fun volumeId(): String

  @CdkDslMarker
  public interface Builder {
    public fun device(device: String)

    public fun instanceId(instanceId: String)

    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps.builder()

    override fun device(device: String) {
      cdkBuilder.device(device)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps,
  ) : CdkObject(cdkObject), CfnVolumeAttachmentProps {
    override fun device(): String? = unwrap(this).getDevice()

    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun volumeId(): String = unwrap(this).getVolumeId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps):
        CfnVolumeAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps
  }
}
