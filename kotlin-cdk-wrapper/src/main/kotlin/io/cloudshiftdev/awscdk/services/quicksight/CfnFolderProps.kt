@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFolder`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnFolderProps cfnFolderProps = CfnFolderProps.builder()
 * .awsAccountId("awsAccountId")
 * .folderId("folderId")
 * .folderType("folderType")
 * .name("name")
 * .parentFolderArn("parentFolderArn")
 * .permissions(List.of(ResourcePermissionProperty.builder()
 * .actions(List.of("actions"))
 * .principal("principal")
 * .build()))
 * .sharingModel("sharingModel")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html)
 */
public interface CfnFolderProps {
  /**
   * The ID for the AWS account where you want to create the folder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-awsaccountid)
   */
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The ID of the folder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-folderid)
   */
  public fun folderId(): String? = unwrap(this).getFolderId()

  /**
   * The type of folder it is.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-foldertype)
   */
  public fun folderType(): String? = unwrap(this).getFolderType()

  /**
   * A display name for the folder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The Amazon Resource Name (ARN) for the folder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-parentfolderarn)
   */
  public fun parentFolderArn(): String? = unwrap(this).getParentFolderArn()

  /**
   * A structure that describes the principals and the resource-level permissions of a folder.
   *
   * To specify no permissions, omit `Permissions` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
   */
  public fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * The sharing scope of the folder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-sharingmodel)
   */
  public fun sharingModel(): String? = unwrap(this).getSharingModel()

  /**
   * A list of tags for the folders that you want to apply overrides to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFolderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The ID for the AWS account where you want to create the folder.
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param folderId The ID of the folder.
     */
    public fun folderId(folderId: String)

    /**
     * @param folderType The type of folder it is.
     */
    public fun folderType(folderType: String)

    /**
     * @param name A display name for the folder.
     */
    public fun name(name: String)

    /**
     * @param parentFolderArn The Amazon Resource Name (ARN) for the folder.
     */
    public fun parentFolderArn(parentFolderArn: String)

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder.
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(permissions: IResolvable)

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder.
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(permissions: List<Any>)

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder.
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(vararg permissions: Any)

    /**
     * @param sharingModel The sharing scope of the folder.
     */
    public fun sharingModel(sharingModel: String)

    /**
     * @param tags A list of tags for the folders that you want to apply overrides to.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags for the folders that you want to apply overrides to.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnFolderProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnFolderProps.builder()

    /**
     * @param awsAccountId The ID for the AWS account where you want to create the folder.
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param folderId The ID of the folder.
     */
    override fun folderId(folderId: String) {
      cdkBuilder.folderId(folderId)
    }

    /**
     * @param folderType The type of folder it is.
     */
    override fun folderType(folderType: String) {
      cdkBuilder.folderType(folderType)
    }

    /**
     * @param name A display name for the folder.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parentFolderArn The Amazon Resource Name (ARN) for the folder.
     */
    override fun parentFolderArn(parentFolderArn: String) {
      cdkBuilder.parentFolderArn(parentFolderArn)
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder.
     * To specify no permissions, omit `Permissions` .
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder.
     * To specify no permissions, omit `Permissions` .
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder.
     * To specify no permissions, omit `Permissions` .
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * @param sharingModel The sharing scope of the folder.
     */
    override fun sharingModel(sharingModel: String) {
      cdkBuilder.sharingModel(sharingModel)
    }

    /**
     * @param tags A list of tags for the folders that you want to apply overrides to.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags for the folders that you want to apply overrides to.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnFolderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.quicksight.CfnFolderProps,
  ) : CdkObject(cdkObject),
      CfnFolderProps {
    /**
     * The ID for the AWS account where you want to create the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-awsaccountid)
     */
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * The ID of the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-folderid)
     */
    override fun folderId(): String? = unwrap(this).getFolderId()

    /**
     * The type of folder it is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-foldertype)
     */
    override fun folderType(): String? = unwrap(this).getFolderType()

    /**
     * A display name for the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) for the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-parentfolderarn)
     */
    override fun parentFolderArn(): String? = unwrap(this).getParentFolderArn()

    /**
     * A structure that describes the principals and the resource-level permissions of a folder.
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
     */
    override fun permissions(): Any? = unwrap(this).getPermissions()

    /**
     * The sharing scope of the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-sharingmodel)
     */
    override fun sharingModel(): String? = unwrap(this).getSharingModel()

    /**
     * A list of tags for the folders that you want to apply overrides to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFolderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnFolderProps):
        CfnFolderProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFolderProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFolderProps):
        software.amazon.awscdk.services.quicksight.CfnFolderProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.quicksight.CfnFolderProps
  }
}
