@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesinstances

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnVolumeAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
 * CfnVolumeAssociationProps cfnVolumeAssociationProps = CfnVolumeAssociationProps.builder()
 * .device("device")
 * .volumeId("volumeId")
 * .workspaceInstanceId("workspaceInstanceId")
 * // the properties below are optional
 * .disassociateMode("disassociateMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html)
 */
public interface CfnVolumeAssociationProps {
  /**
   * The device name for the volume attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-device)
   */
  public fun device(): String

  /**
   * Mode to use when disassociating the volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-disassociatemode)
   */
  public fun disassociateMode(): String? = unwrap(this).getDisassociateMode()

  /**
   * ID of the volume to attach to the workspace instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-volumeid)
   */
  public fun volumeId(): String

  /**
   * ID of the workspace instance to associate with the volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-workspaceinstanceid)
   */
  public fun workspaceInstanceId(): String

  /**
   * A builder for [CfnVolumeAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param device The device name for the volume attachment. 
     */
    public fun device(device: String)

    /**
     * @param disassociateMode Mode to use when disassociating the volume.
     */
    public fun disassociateMode(disassociateMode: String)

    /**
     * @param volumeId ID of the volume to attach to the workspace instance. 
     */
    public fun volumeId(volumeId: String)

    /**
     * @param workspaceInstanceId ID of the workspace instance to associate with the volume. 
     */
    public fun workspaceInstanceId(workspaceInstanceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps.Builder =
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps.builder()

    /**
     * @param device The device name for the volume attachment. 
     */
    override fun device(device: String) {
      cdkBuilder.device(device)
    }

    /**
     * @param disassociateMode Mode to use when disassociating the volume.
     */
    override fun disassociateMode(disassociateMode: String) {
      cdkBuilder.disassociateMode(disassociateMode)
    }

    /**
     * @param volumeId ID of the volume to attach to the workspace instance. 
     */
    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    /**
     * @param workspaceInstanceId ID of the workspace instance to associate with the volume. 
     */
    override fun workspaceInstanceId(workspaceInstanceId: String) {
      cdkBuilder.workspaceInstanceId(workspaceInstanceId)
    }

    public fun build():
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps,
  ) : CdkObject(cdkObject),
      CfnVolumeAssociationProps {
    /**
     * The device name for the volume attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-device)
     */
    override fun device(): String = unwrap(this).getDevice()

    /**
     * Mode to use when disassociating the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-disassociatemode)
     */
    override fun disassociateMode(): String? = unwrap(this).getDisassociateMode()

    /**
     * ID of the volume to attach to the workspace instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-volumeid)
     */
    override fun volumeId(): String = unwrap(this).getVolumeId()

    /**
     * ID of the workspace instance to associate with the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-workspaceinstanceid)
     */
    override fun workspaceInstanceId(): String = unwrap(this).getWorkspaceInstanceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps):
        CfnVolumeAssociationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVolumeAssociationProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeAssociationProps):
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps
  }
}
