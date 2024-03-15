@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnVolume`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
 * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
 * .ec2VolumeId("ec2VolumeId")
 * .stackId("stackId")
 * // the properties below are optional
 * .mountPoint("mountPoint")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
 */
public interface CfnVolumeProps {
  /**
   * The Amazon EC2 volume ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
   */
  public fun ec2VolumeId(): String

  /**
   * The volume mount point.
   *
   * For example, "/mnt/disk1".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
   */
  public fun mountPoint(): String? = unwrap(this).getMountPoint()

  /**
   * The volume name.
   *
   * Volume names are a maximum of 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The stack ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
   */
  public fun stackId(): String

  /**
   * A builder for [CfnVolumeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ec2VolumeId The Amazon EC2 volume ID. 
     */
    public fun ec2VolumeId(ec2VolumeId: String)

    /**
     * @param mountPoint The volume mount point.
     * For example, "/mnt/disk1".
     */
    public fun mountPoint(mountPoint: String)

    /**
     * @param name The volume name.
     * Volume names are a maximum of 128 characters.
     */
    public fun name(name: String)

    /**
     * @param stackId The stack ID. 
     */
    public fun stackId(stackId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnVolumeProps.builder()

    /**
     * @param ec2VolumeId The Amazon EC2 volume ID. 
     */
    override fun ec2VolumeId(ec2VolumeId: String) {
      cdkBuilder.ec2VolumeId(ec2VolumeId)
    }

    /**
     * @param mountPoint The volume mount point.
     * For example, "/mnt/disk1".
     */
    override fun mountPoint(mountPoint: String) {
      cdkBuilder.mountPoint(mountPoint)
    }

    /**
     * @param name The volume name.
     * Volume names are a maximum of 128 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param stackId The stack ID. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnVolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnVolumeProps,
  ) : CdkObject(cdkObject), CfnVolumeProps {
    /**
     * The Amazon EC2 volume ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
     */
    override fun ec2VolumeId(): String = unwrap(this).getEc2VolumeId()

    /**
     * The volume mount point.
     *
     * For example, "/mnt/disk1".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
     */
    override fun mountPoint(): String? = unwrap(this).getMountPoint()

    /**
     * The volume name.
     *
     * Volume names are a maximum of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
     */
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
