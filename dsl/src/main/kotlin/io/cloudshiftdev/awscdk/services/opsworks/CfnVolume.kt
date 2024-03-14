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
  private val cdkObject: software.amazon.awscdk.services.opsworks.CfnVolume,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon EC2 volume ID.
   */
  public open fun ec2VolumeId(): String = unwrap(this).getEc2VolumeId()

  /**
   * The Amazon EC2 volume ID.
   */
  public open fun ec2VolumeId(`value`: String) {
    unwrap(this).setEc2VolumeId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The volume mount point.
   */
  public open fun mountPoint(): String? = unwrap(this).getMountPoint()

  /**
   * The volume mount point.
   */
  public open fun mountPoint(`value`: String) {
    unwrap(this).setMountPoint(`value`)
  }

  /**
   * The volume name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The volume name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The stack ID.
   */
  public open fun stackId(): String = unwrap(this).getStackId()

  /**
   * The stack ID.
   */
  public open fun stackId(`value`: String) {
    unwrap(this).setStackId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opsworks.CfnVolume].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon EC2 volume ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
     * @param ec2VolumeId The Amazon EC2 volume ID. 
     */
    public fun ec2VolumeId(ec2VolumeId: String)

    /**
     * The volume mount point.
     *
     * For example, "/mnt/disk1".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
     * @param mountPoint The volume mount point. 
     */
    public fun mountPoint(mountPoint: String)

    /**
     * The volume name.
     *
     * Volume names are a maximum of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
     * @param name The volume name. 
     */
    public fun name(name: String)

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
     * @param stackId The stack ID. 
     */
    public fun stackId(stackId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnVolume.Builder =
        software.amazon.awscdk.services.opsworks.CfnVolume.Builder.create(scope, id)

    /**
     * The Amazon EC2 volume ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
     * @param ec2VolumeId The Amazon EC2 volume ID. 
     */
    override fun ec2VolumeId(ec2VolumeId: String) {
      cdkBuilder.ec2VolumeId(ec2VolumeId)
    }

    /**
     * The volume mount point.
     *
     * For example, "/mnt/disk1".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
     * @param mountPoint The volume mount point. 
     */
    override fun mountPoint(mountPoint: String) {
      cdkBuilder.mountPoint(mountPoint)
    }

    /**
     * The volume name.
     *
     * Volume names are a maximum of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
     * @param name The volume name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
     * @param stackId The stack ID. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnVolume = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
