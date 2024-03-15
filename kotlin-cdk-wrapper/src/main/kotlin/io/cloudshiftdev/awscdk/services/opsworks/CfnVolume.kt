@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.opsworks.CfnVolume,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun ec2VolumeId(): String = unwrap(this).getEc2VolumeId()

  public open fun ec2VolumeId(`value`: String) {
    unwrap(this).setEc2VolumeId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mountPoint(): String? = unwrap(this).getMountPoint()

  public open fun mountPoint(`value`: String) {
    unwrap(this).setMountPoint(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun stackId(): String = unwrap(this).getStackId()

  public open fun stackId(`value`: String) {
    unwrap(this).setStackId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun ec2VolumeId(ec2VolumeId: String)

    public fun mountPoint(mountPoint: String)

    public fun name(name: String)

    public fun stackId(stackId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnVolume.Builder =
        software.amazon.awscdk.services.opsworks.CfnVolume.Builder.create(scope, id)

    override fun ec2VolumeId(ec2VolumeId: String) {
      cdkBuilder.ec2VolumeId(ec2VolumeId)
    }

    override fun mountPoint(mountPoint: String) {
      cdkBuilder.mountPoint(mountPoint)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnVolume = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opsworks.CfnVolume.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnVolume): CfnVolume =
        CfnVolume(cdkObject)

    internal fun unwrap(wrapped: CfnVolume): software.amazon.awscdk.services.opsworks.CfnVolume =
        wrapped.cdkObject
  }
}
