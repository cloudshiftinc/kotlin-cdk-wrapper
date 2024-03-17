@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.workspaces.*;
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
public open class CfnWorkspace internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The identifier of the WorkSpace, returned as a string.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The identifier of the bundle for the WorkSpace.
   */
  public open fun bundleId(): String = unwrap(this).getBundleId()

  /**
   * The identifier of the bundle for the WorkSpace.
   */
  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  /**
   * The identifier of the AWS Directory Service directory for the WorkSpace.
   */
  public open fun directoryId(): String = unwrap(this).getDirectoryId()

  /**
   * The identifier of the AWS Directory Service directory for the WorkSpace.
   */
  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
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
   * Indicates whether the data stored on the root volume is encrypted.
   */
  public open fun rootVolumeEncryptionEnabled(): Any? =
      unwrap(this).getRootVolumeEncryptionEnabled()

  /**
   * Indicates whether the data stored on the root volume is encrypted.
   */
  public open fun rootVolumeEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setRootVolumeEncryptionEnabled(`value`)
  }

  /**
   * Indicates whether the data stored on the root volume is encrypted.
   */
  public open fun rootVolumeEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setRootVolumeEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the WorkSpace.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the WorkSpace.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the WorkSpace.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The user name of the user for the WorkSpace.
   */
  public open fun userName(): String = unwrap(this).getUserName()

  /**
   * The user name of the user for the WorkSpace.
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * Indicates whether the data stored on the user volume is encrypted.
   */
  public open fun userVolumeEncryptionEnabled(): Any? =
      unwrap(this).getUserVolumeEncryptionEnabled()

  /**
   * Indicates whether the data stored on the user volume is encrypted.
   */
  public open fun userVolumeEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setUserVolumeEncryptionEnabled(`value`)
  }

  /**
   * Indicates whether the data stored on the user volume is encrypted.
   */
  public open fun userVolumeEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setUserVolumeEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ARN of the symmetric AWS KMS key used to encrypt data stored on your WorkSpace.
   */
  public open fun volumeEncryptionKey(): String? = unwrap(this).getVolumeEncryptionKey()

  /**
   * The ARN of the symmetric AWS KMS key used to encrypt data stored on your WorkSpace.
   */
  public open fun volumeEncryptionKey(`value`: String) {
    unwrap(this).setVolumeEncryptionKey(`value`)
  }

  /**
   * The WorkSpace properties.
   */
  public open fun workspaceProperties(): Any? = unwrap(this).getWorkspaceProperties()

  /**
   * The WorkSpace properties.
   */
  public open fun workspaceProperties(`value`: IResolvable) {
    unwrap(this).setWorkspaceProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The WorkSpace properties.
   */
  public open fun workspaceProperties(`value`: WorkspacePropertiesProperty) {
    unwrap(this).setWorkspaceProperties(`value`.let(WorkspacePropertiesProperty::unwrap))
  }

  /**
   * The WorkSpace properties.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5106cf308affef8a381cdba948e2b0384febdcba5fd4b6f9b44f6b4f47d93673")
  public open fun workspaceProperties(`value`: WorkspacePropertiesProperty.Builder.() -> Unit): Unit
      = workspaceProperties(WorkspacePropertiesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspaces.CfnWorkspace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the bundle for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
     * @param bundleId The identifier of the bundle for the WorkSpace. 
     */
    public fun bundleId(bundleId: String)

    /**
     * The identifier of the AWS Directory Service directory for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
     * @param directoryId The identifier of the AWS Directory Service directory for the WorkSpace. 
     */
    public fun directoryId(directoryId: String)

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted. 
     */
    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean)

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted. 
     */
    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable)

    /**
     * The tags for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
     * @param tags The tags for the WorkSpace. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
     * @param tags The tags for the WorkSpace. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The user name of the user for the WorkSpace.
     *
     * This user name must exist in the AWS Directory Service directory for the WorkSpace.
     *
     * The reserved keyword, `[UNDEFINED]` , is used when creating user-decoupled WorkSpaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
     * @param userName The user name of the user for the WorkSpace. 
     */
    public fun userName(userName: String)

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted. 
     */
    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean)

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted. 
     */
    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable)

    /**
     * The ARN of the symmetric AWS KMS key used to encrypt data stored on your WorkSpace.
     *
     * Amazon WorkSpaces does not support asymmetric KMS keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
     * @param volumeEncryptionKey The ARN of the symmetric AWS KMS key used to encrypt data stored
     * on your WorkSpace. 
     */
    public fun volumeEncryptionKey(volumeEncryptionKey: String)

    /**
     * The WorkSpace properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
     * @param workspaceProperties The WorkSpace properties. 
     */
    public fun workspaceProperties(workspaceProperties: IResolvable)

    /**
     * The WorkSpace properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
     * @param workspaceProperties The WorkSpace properties. 
     */
    public fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty)

    /**
     * The WorkSpace properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
     * @param workspaceProperties The WorkSpace properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c513f7198f435a1a76ee09cbc2718464f34127212b93b77acf4625ed6f422f3")
    public
        fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspaces.CfnWorkspace.Builder =
        software.amazon.awscdk.services.workspaces.CfnWorkspace.Builder.create(scope, id)

    /**
     * The identifier of the bundle for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
     * @param bundleId The identifier of the bundle for the WorkSpace. 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * The identifier of the AWS Directory Service directory for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
     * @param directoryId The identifier of the AWS Directory Service directory for the WorkSpace. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted. 
     */
    override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     * encrypted. 
     */
    override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * The tags for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
     * @param tags The tags for the WorkSpace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the WorkSpace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags)
     * @param tags The tags for the WorkSpace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The user name of the user for the WorkSpace.
     *
     * This user name must exist in the AWS Directory Service directory for the WorkSpace.
     *
     * The reserved keyword, `[UNDEFINED]` , is used when creating user-decoupled WorkSpaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
     * @param userName The user name of the user for the WorkSpace. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted. 
     */
    override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     * encrypted. 
     */
    override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * The ARN of the symmetric AWS KMS key used to encrypt data stored on your WorkSpace.
     *
     * Amazon WorkSpaces does not support asymmetric KMS keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
     * @param volumeEncryptionKey The ARN of the symmetric AWS KMS key used to encrypt data stored
     * on your WorkSpace. 
     */
    override fun volumeEncryptionKey(volumeEncryptionKey: String) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    /**
     * The WorkSpace properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
     * @param workspaceProperties The WorkSpace properties. 
     */
    override fun workspaceProperties(workspaceProperties: IResolvable) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(IResolvable::unwrap))
    }

    /**
     * The WorkSpace properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
     * @param workspaceProperties The WorkSpace properties. 
     */
    override fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(WorkspacePropertiesProperty::unwrap))
    }

    /**
     * The WorkSpace properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-workspaceproperties)
     * @param workspaceProperties The WorkSpace properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c513f7198f435a1a76ee09cbc2718464f34127212b93b77acf4625ed6f422f3")
    override
        fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty.Builder.() -> Unit):
        Unit = workspaceProperties(WorkspacePropertiesProperty(workspaceProperties))

    public fun build(): software.amazon.awscdk.services.workspaces.CfnWorkspace = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspaces.CfnWorkspace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspace):
        CfnWorkspace = CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace):
        software.amazon.awscdk.services.workspaces.CfnWorkspace = wrapped.cdkObject
  }

  /**
   * Information about a WorkSpace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspaces.*;
   * WorkspacePropertiesProperty workspacePropertiesProperty = WorkspacePropertiesProperty.builder()
   * .computeTypeName("computeTypeName")
   * .rootVolumeSizeGib(123)
   * .runningMode("runningMode")
   * .runningModeAutoStopTimeoutInMinutes(123)
   * .userVolumeSizeGib(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html)
   */
  public interface WorkspacePropertiesProperty {
    /**
     * The compute type.
     *
     * For more information, see [Amazon WorkSpaces
     * Bundles](https://docs.aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-computetypename)
     */
    public fun computeTypeName(): String? = unwrap(this).getComputeTypeName()

    /**
     * The size of the root volume.
     *
     * For important information about how to modify the size of the root and user volumes, see
     * [Modify a
     * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-rootvolumesizegib)
     */
    public fun rootVolumeSizeGib(): Number? = unwrap(this).getRootVolumeSizeGib()

    /**
     * The running mode. For more information, see [Manage the WorkSpace Running
     * Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html) .
     *
     *
     * The `MANUAL` value is only supported by Amazon WorkSpaces Core. Contact your account team to
     * be allow-listed to use this value. For more information, see [Amazon WorkSpaces
     * Core](https://docs.aws.amazon.com/workspaces/core/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmode)
     */
    public fun runningMode(): String? = unwrap(this).getRunningMode()

    /**
     * The time after a user logs off when WorkSpaces are automatically stopped.
     *
     * Configured in 60-minute intervals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmodeautostoptimeoutinminutes)
     */
    public fun runningModeAutoStopTimeoutInMinutes(): Number? =
        unwrap(this).getRunningModeAutoStopTimeoutInMinutes()

    /**
     * The size of the user storage.
     *
     * For important information about how to modify the size of the root and user volumes, see
     * [Modify a
     * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-uservolumesizegib)
     */
    public fun userVolumeSizeGib(): Number? = unwrap(this).getUserVolumeSizeGib()

    /**
     * A builder for [WorkspacePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeTypeName The compute type.
       * For more information, see [Amazon WorkSpaces
       * Bundles](https://docs.aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles) .
       */
      public fun computeTypeName(computeTypeName: String)

      /**
       * @param rootVolumeSizeGib The size of the root volume.
       * For important information about how to modify the size of the root and user volumes, see
       * [Modify a
       * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
       */
      public fun rootVolumeSizeGib(rootVolumeSizeGib: Number)

      /**
       * @param runningMode The running mode. For more information, see [Manage the WorkSpace
       * Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html) .
       *
       * The `MANUAL` value is only supported by Amazon WorkSpaces Core. Contact your account team
       * to be allow-listed to use this value. For more information, see [Amazon WorkSpaces
       * Core](https://docs.aws.amazon.com/workspaces/core/) .
       */
      public fun runningMode(runningMode: String)

      /**
       * @param runningModeAutoStopTimeoutInMinutes The time after a user logs off when WorkSpaces
       * are automatically stopped.
       * Configured in 60-minute intervals.
       */
      public fun runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes: Number)

      /**
       * @param userVolumeSizeGib The size of the user storage.
       * For important information about how to modify the size of the root and user volumes, see
       * [Modify a
       * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
       */
      public fun userVolumeSizeGib(userVolumeSizeGib: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.builder()

      /**
       * @param computeTypeName The compute type.
       * For more information, see [Amazon WorkSpaces
       * Bundles](https://docs.aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles) .
       */
      override fun computeTypeName(computeTypeName: String) {
        cdkBuilder.computeTypeName(computeTypeName)
      }

      /**
       * @param rootVolumeSizeGib The size of the root volume.
       * For important information about how to modify the size of the root and user volumes, see
       * [Modify a
       * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
       */
      override fun rootVolumeSizeGib(rootVolumeSizeGib: Number) {
        cdkBuilder.rootVolumeSizeGib(rootVolumeSizeGib)
      }

      /**
       * @param runningMode The running mode. For more information, see [Manage the WorkSpace
       * Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html) .
       *
       * The `MANUAL` value is only supported by Amazon WorkSpaces Core. Contact your account team
       * to be allow-listed to use this value. For more information, see [Amazon WorkSpaces
       * Core](https://docs.aws.amazon.com/workspaces/core/) .
       */
      override fun runningMode(runningMode: String) {
        cdkBuilder.runningMode(runningMode)
      }

      /**
       * @param runningModeAutoStopTimeoutInMinutes The time after a user logs off when WorkSpaces
       * are automatically stopped.
       * Configured in 60-minute intervals.
       */
      override
          fun runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes: Number) {
        cdkBuilder.runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes)
      }

      /**
       * @param userVolumeSizeGib The size of the user storage.
       * For important information about how to modify the size of the root and user volumes, see
       * [Modify a
       * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
       */
      override fun userVolumeSizeGib(userVolumeSizeGib: Number) {
        cdkBuilder.userVolumeSizeGib(userVolumeSizeGib)
      }

      public fun build():
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty,
    ) : CdkObject(cdkObject), WorkspacePropertiesProperty {
      /**
       * The compute type.
       *
       * For more information, see [Amazon WorkSpaces
       * Bundles](https://docs.aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-computetypename)
       */
      override fun computeTypeName(): String? = unwrap(this).getComputeTypeName()

      /**
       * The size of the root volume.
       *
       * For important information about how to modify the size of the root and user volumes, see
       * [Modify a
       * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-rootvolumesizegib)
       */
      override fun rootVolumeSizeGib(): Number? = unwrap(this).getRootVolumeSizeGib()

      /**
       * The running mode. For more information, see [Manage the WorkSpace Running
       * Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html) .
       *
       *
       * The `MANUAL` value is only supported by Amazon WorkSpaces Core. Contact your account team
       * to be allow-listed to use this value. For more information, see [Amazon WorkSpaces
       * Core](https://docs.aws.amazon.com/workspaces/core/) .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmode)
       */
      override fun runningMode(): String? = unwrap(this).getRunningMode()

      /**
       * The time after a user logs off when WorkSpaces are automatically stopped.
       *
       * Configured in 60-minute intervals.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmodeautostoptimeoutinminutes)
       */
      override fun runningModeAutoStopTimeoutInMinutes(): Number? =
          unwrap(this).getRunningModeAutoStopTimeoutInMinutes()

      /**
       * The size of the user storage.
       *
       * For important information about how to modify the size of the root and user volumes, see
       * [Modify a
       * WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-uservolumesizegib)
       */
      override fun userVolumeSizeGib(): Number? = unwrap(this).getUserVolumeSizeGib()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkspacePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty):
          WorkspacePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkspacePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkspacePropertiesProperty):
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty
    }
  }
}
