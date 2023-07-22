@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import software.constructs.Construct

/**
 * The `AWS::WorkSpaces::Workspace` resource specifies a WorkSpace.
 *
 * Updates are not supported for the `BundleId` , `RootVolumeEncryptionEnabled` ,
 * `UserVolumeEncryptionEnabled` , or `VolumeEncryptionKey` properties. To update these properties, you
 * must also update a property that triggers a replacement, such as the `UserName` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspaces.*;
 * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
 * .bundleId("bundleId")
 * .directoryId("directoryId")
 * .userName("userName")
 * // the properties below are optional
 * .rootVolumeEncryptionEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userVolumeEncryptionEnabled(false)
 * .volumeEncryptionKey("volumeEncryptionKey")
 * .workspaceProperties(WorkspacePropertiesProperty.builder()
 * .computeTypeName("computeTypeName")
 * .rootVolumeSizeGib(123)
 * .runningMode("runningMode")
 * .runningModeAutoStopTimeoutInMinutes(123)
 * .userVolumeSizeGib(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html)
 */
@CdkDslMarker
public class CfnWorkspaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkspace.Builder = CfnWorkspace.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The identifier of the bundle for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
   * @param bundleId The identifier of the bundle for the WorkSpace. 
   */
  public fun bundleId(bundleId: String) {
    cdkBuilder.bundleId(bundleId)
  }

  /**
   * The identifier of the AWS Directory Service directory for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
   * @param directoryId The identifier of the AWS Directory Service directory for the WorkSpace. 
   */
  public fun directoryId(directoryId: String) {
    cdkBuilder.directoryId(directoryId)
  }

  /**
   * Indicates whether the data stored on the root volume is encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
   * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
   * encrypted. 
   */
  public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
    cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
  }

  /**
   * Indicates whether the data stored on the root volume is encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
   * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
   * encrypted. 
   */
  public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
    cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
  }

  /**
   * The tags for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
   * @param tags The tags for the WorkSpace. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
   * @param tags The tags for the WorkSpace. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The user name of the user for the WorkSpace.
   *
   * This user name must exist in the AWS Directory Service directory for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
   * @param userName The user name of the user for the WorkSpace. 
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  /**
   * Indicates whether the data stored on the user volume is encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
   * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
   * encrypted. 
   */
  public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
    cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
  }

  /**
   * Indicates whether the data stored on the user volume is encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
   * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
   * encrypted. 
   */
  public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
    cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
  }

  /**
   * The symmetric AWS KMS key used to encrypt data stored on your WorkSpace.
   *
   * Amazon WorkSpaces does not support asymmetric KMS keys.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
   * @param volumeEncryptionKey The symmetric AWS KMS key used to encrypt data stored on your
   * WorkSpace. 
   */
  public fun volumeEncryptionKey(volumeEncryptionKey: String) {
    cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
  }

  /**
   * The WorkSpace properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
   * @param workspaceProperties The WorkSpace properties. 
   */
  public fun workspaceProperties(workspaceProperties: IResolvable) {
    cdkBuilder.workspaceProperties(workspaceProperties)
  }

  /**
   * The WorkSpace properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
   * @param workspaceProperties The WorkSpace properties. 
   */
  public fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty) {
    cdkBuilder.workspaceProperties(workspaceProperties)
  }

  public fun build(): CfnWorkspace {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
