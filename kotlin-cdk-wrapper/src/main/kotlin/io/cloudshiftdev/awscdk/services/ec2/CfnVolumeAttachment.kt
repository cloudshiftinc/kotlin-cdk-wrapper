@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVolumeAttachment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun device(): String? = unwrap(this).getDevice()

  public open fun device(`value`: String) {
    unwrap(this).setDevice(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun volumeId(): String = unwrap(this).getVolumeId()

  public open fun volumeId(`value`: String) {
    unwrap(this).setVolumeId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun device(device: String)

    public fun instanceId(instanceId: String)

    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVolumeAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment.Builder.create(scope, id)

    override fun device(device: String) {
      cdkBuilder.device(device)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVolumeAttachment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolumeAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolumeAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachment):
        CfnVolumeAttachment = CfnVolumeAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeAttachment):
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment = wrapped.cdkObject
  }
}
