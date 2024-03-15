@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspaces.*;
 * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
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
public interface CfnWorkspaceProps {
  /**
   * The identifier of the bundle for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
   */
  public fun bundleId(): String

  /**
   * The identifier of the AWS Directory Service directory for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
   */
  public fun directoryId(): String

  /**
   * Indicates whether the data stored on the root volume is encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
   */
  public fun rootVolumeEncryptionEnabled(): Any? = unwrap(this).getRootVolumeEncryptionEnabled()

  /**
   * The tags for the WorkSpace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The user name of the user for the WorkSpace.
   *
   * This user name must exist in the AWS Directory Service directory for the WorkSpace.
   *
   * The reserved keyword, `[UNDEFINED]` , is used when creating user-decoupled WorkSpaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
   */
  public fun userName(): String

  /**
   * Indicates whether the data stored on the user volume is encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
   */
  public fun userVolumeEncryptionEnabled(): Any? = unwrap(this).getUserVolumeEncryptionEnabled()

  /**
   * The ARN of the symmetric AWS KMS key used to encrypt data stored on your WorkSpace.
   *
   * Amazon WorkSpaces does not support asymmetric KMS keys.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
   */
  public fun volumeEncryptionKey(): String? = unwrap(this).getVolumeEncryptionKey()

  /**
   * The WorkSpace properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
   */
  public fun workspaceProperties(): Any? = unwrap(this).getWorkspaceProperties()

  /**
   * A builder for [CfnWorkspaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bundleId The identifier of the bundle for the WorkSpace. 
     */
    public fun bundleId(bundleId: String)

    /**
     * @param directoryId The identifier of the AWS Directory Service directory for the WorkSpace. 
     */
    public fun directoryId(directoryId: String)

    /**
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted.
     */
    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean)

    /**
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted.
     */
    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable)

    /**
     * @param tags The tags for the WorkSpace.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the WorkSpace.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userName The user name of the user for the WorkSpace. 
     * This user name must exist in the AWS Directory Service directory for the WorkSpace.
     *
     * The reserved keyword, `[UNDEFINED]` , is used when creating user-decoupled WorkSpaces.
     */
    public fun userName(userName: String)

    /**
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted.
     */
    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean)

    /**
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted.
     */
    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable)

    /**
     * @param volumeEncryptionKey The ARN of the symmetric AWS KMS key used to encrypt data stored
     * on your WorkSpace.
     * Amazon WorkSpaces does not support asymmetric KMS keys.
     */
    public fun volumeEncryptionKey(volumeEncryptionKey: String)

    /**
     * @param workspaceProperties The WorkSpace properties.
     */
    public fun workspaceProperties(workspaceProperties: IResolvable)

    /**
     * @param workspaceProperties The WorkSpace properties.
     */
    public fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty)

    /**
     * @param workspaceProperties The WorkSpace properties.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfcdd4ee7d9d252c6ce7284cbe74b7b230029def700a5196f835c827f7d37b1a")
    public
        fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.builder()

    /**
     * @param bundleId The identifier of the bundle for the WorkSpace. 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param directoryId The identifier of the AWS Directory Service directory for the WorkSpace. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted.
     */
    override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    /**
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted.
     */
    override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param tags The tags for the WorkSpace.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the WorkSpace.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userName The user name of the user for the WorkSpace. 
     * This user name must exist in the AWS Directory Service directory for the WorkSpace.
     *
     * The reserved keyword, `[UNDEFINED]` , is used when creating user-decoupled WorkSpaces.
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    /**
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted.
     */
    override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    /**
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted.
     */
    override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param volumeEncryptionKey The ARN of the symmetric AWS KMS key used to encrypt data stored
     * on your WorkSpace.
     * Amazon WorkSpaces does not support asymmetric KMS keys.
     */
    override fun volumeEncryptionKey(volumeEncryptionKey: String) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    /**
     * @param workspaceProperties The WorkSpace properties.
     */
    override fun workspaceProperties(workspaceProperties: IResolvable) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(IResolvable::unwrap))
    }

    /**
     * @param workspaceProperties The WorkSpace properties.
     */
    override
        fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(CfnWorkspace.WorkspacePropertiesProperty::unwrap))
    }

    /**
     * @param workspaceProperties The WorkSpace properties.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfcdd4ee7d9d252c6ce7284cbe74b7b230029def700a5196f835c827f7d37b1a")
    override
        fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty.Builder.() -> Unit):
        Unit = workspaceProperties(CfnWorkspace.WorkspacePropertiesProperty(workspaceProperties))

    public fun build(): software.amazon.awscdk.services.workspaces.CfnWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps,
  ) : CdkObject(cdkObject), CfnWorkspaceProps {
    /**
     * The identifier of the bundle for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
     */
    override fun bundleId(): String = unwrap(this).getBundleId()

    /**
     * The identifier of the AWS Directory Service directory for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
     */
    override fun directoryId(): String = unwrap(this).getDirectoryId()

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
     */
    override fun rootVolumeEncryptionEnabled(): Any? = unwrap(this).getRootVolumeEncryptionEnabled()

    /**
     * The tags for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The user name of the user for the WorkSpace.
     *
     * This user name must exist in the AWS Directory Service directory for the WorkSpace.
     *
     * The reserved keyword, `[UNDEFINED]` , is used when creating user-decoupled WorkSpaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
     */
    override fun userName(): String = unwrap(this).getUserName()

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
     */
    override fun userVolumeEncryptionEnabled(): Any? = unwrap(this).getUserVolumeEncryptionEnabled()

    /**
     * The ARN of the symmetric AWS KMS key used to encrypt data stored on your WorkSpace.
     *
     * Amazon WorkSpaces does not support asymmetric KMS keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
     */
    override fun volumeEncryptionKey(): String? = unwrap(this).getVolumeEncryptionKey()

    /**
     * The WorkSpace properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
     */
    override fun workspaceProperties(): Any? = unwrap(this).getWorkspaceProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps):
        CfnWorkspaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.workspaces.CfnWorkspaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspaces.CfnWorkspaceProps
  }
}
