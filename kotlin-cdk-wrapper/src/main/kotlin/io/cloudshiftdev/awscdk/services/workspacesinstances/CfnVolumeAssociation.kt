@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesinstances

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource Type definition for AWS::WorkspacesInstances::VolumeAssociation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
 * CfnVolumeAssociation cfnVolumeAssociation = CfnVolumeAssociation.Builder.create(this,
 * "MyCfnVolumeAssociation")
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
public open class CfnVolumeAssociation(
  cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVolumeAssociationProps,
  ) :
      this(software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVolumeAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVolumeAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVolumeAssociationProps(props)
  )

  /**
   * The device name for the volume attachment.
   */
  public open fun device(): String = unwrap(this).getDevice()

  /**
   * The device name for the volume attachment.
   */
  public open fun device(`value`: String) {
    unwrap(this).setDevice(`value`)
  }

  /**
   * Mode to use when disassociating the volume.
   */
  public open fun disassociateMode(): String? = unwrap(this).getDisassociateMode()

  /**
   * Mode to use when disassociating the volume.
   */
  public open fun disassociateMode(`value`: String) {
    unwrap(this).setDisassociateMode(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * ID of the volume to attach to the workspace instance.
   */
  public open fun volumeId(): String = unwrap(this).getVolumeId()

  /**
   * ID of the volume to attach to the workspace instance.
   */
  public open fun volumeId(`value`: String) {
    unwrap(this).setVolumeId(`value`)
  }

  /**
   * ID of the workspace instance to associate with the volume.
   */
  public open fun workspaceInstanceId(): String = unwrap(this).getWorkspaceInstanceId()

  /**
   * ID of the workspace instance to associate with the volume.
   */
  public open fun workspaceInstanceId(`value`: String) {
    unwrap(this).setWorkspaceInstanceId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.workspacesinstances.CfnVolumeAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The device name for the volume attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-device)
     * @param device The device name for the volume attachment. 
     */
    public fun device(device: String)

    /**
     * Mode to use when disassociating the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-disassociatemode)
     * @param disassociateMode Mode to use when disassociating the volume. 
     */
    public fun disassociateMode(disassociateMode: String)

    /**
     * ID of the volume to attach to the workspace instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-volumeid)
     * @param volumeId ID of the volume to attach to the workspace instance. 
     */
    public fun volumeId(volumeId: String)

    /**
     * ID of the workspace instance to associate with the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-workspaceinstanceid)
     * @param workspaceInstanceId ID of the workspace instance to associate with the volume. 
     */
    public fun workspaceInstanceId(workspaceInstanceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation.Builder =
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation.Builder.create(scope,
        id)

    /**
     * The device name for the volume attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-device)
     * @param device The device name for the volume attachment. 
     */
    override fun device(device: String) {
      cdkBuilder.device(device)
    }

    /**
     * Mode to use when disassociating the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-disassociatemode)
     * @param disassociateMode Mode to use when disassociating the volume. 
     */
    override fun disassociateMode(disassociateMode: String) {
      cdkBuilder.disassociateMode(disassociateMode)
    }

    /**
     * ID of the volume to attach to the workspace instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-volumeid)
     * @param volumeId ID of the volume to attach to the workspace instance. 
     */
    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    /**
     * ID of the workspace instance to associate with the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volumeassociation.html#cfn-workspacesinstances-volumeassociation-workspaceinstanceid)
     * @param workspaceInstanceId ID of the workspace instance to associate with the volume. 
     */
    override fun workspaceInstanceId(workspaceInstanceId: String) {
      cdkBuilder.workspaceInstanceId(workspaceInstanceId)
    }

    public fun build(): software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolumeAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolumeAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation):
        CfnVolumeAssociation = CfnVolumeAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeAssociation):
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation = wrapped.cdkObject
        as software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation
  }
}
