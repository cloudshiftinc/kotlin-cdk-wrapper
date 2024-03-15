@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnVolumeProps {
  public fun ec2VolumeId(): String

  public fun mountPoint(): String? = unwrap(this).getMountPoint()

  public fun name(): String? = unwrap(this).getName()

  public fun stackId(): String

  @CdkDslMarker
  public interface Builder {
    public fun ec2VolumeId(ec2VolumeId: String)

    public fun mountPoint(mountPoint: String)

    public fun name(name: String)

    public fun stackId(stackId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnVolumeProps.builder()

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

    public fun build(): software.amazon.awscdk.services.opsworks.CfnVolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnVolumeProps,
  ) : CdkObject(cdkObject), CfnVolumeProps {
    override fun ec2VolumeId(): String = unwrap(this).getEc2VolumeId()

    override fun mountPoint(): String? = unwrap(this).getMountPoint()

    override fun name(): String? = unwrap(this).getName()

    override fun stackId(): String = unwrap(this).getStackId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnVolumeProps):
        CfnVolumeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeProps):
        software.amazon.awscdk.services.opsworks.CfnVolumeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.opsworks.CfnVolumeProps
  }
}
