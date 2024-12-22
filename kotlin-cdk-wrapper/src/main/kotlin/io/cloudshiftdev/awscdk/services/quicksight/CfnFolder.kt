@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an empty shared folder.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnFolder cfnFolder = CfnFolder.Builder.create(this, "MyCfnFolder")
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
public open class CfnFolder(
  cdkObject: software.amazon.awscdk.services.quicksight.CfnFolder,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.quicksight.CfnFolder(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFolderProps,
  ) :
      this(software.amazon.awscdk.services.quicksight.CfnFolder(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFolderProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFolderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFolderProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the folder.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time that the folder was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The time that the folder was last updated.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The ID for the AWS account where you want to create the folder.
   */
  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The ID for the AWS account where you want to create the folder.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ID of the folder.
   */
  public open fun folderId(): String? = unwrap(this).getFolderId()

  /**
   * The ID of the folder.
   */
  public open fun folderId(`value`: String) {
    unwrap(this).setFolderId(`value`)
  }

  /**
   * The type of folder it is.
   */
  public open fun folderType(): String? = unwrap(this).getFolderType()

  /**
   * The type of folder it is.
   */
  public open fun folderType(`value`: String) {
    unwrap(this).setFolderType(`value`)
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
   * A display name for the folder.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A display name for the folder.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) for the folder.
   */
  public open fun parentFolderArn(): String? = unwrap(this).getParentFolderArn()

  /**
   * The Amazon Resource Name (ARN) for the folder.
   */
  public open fun parentFolderArn(`value`: String) {
    unwrap(this).setParentFolderArn(`value`)
  }

  /**
   * A structure that describes the principals and the resource-level permissions of a folder.
   */
  public open fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * A structure that describes the principals and the resource-level permissions of a folder.
   */
  public open fun permissions(`value`: IResolvable) {
    unwrap(this).setPermissions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure that describes the principals and the resource-level permissions of a folder.
   */
  public open fun permissions(`value`: List<Any>) {
    unwrap(this).setPermissions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A structure that describes the principals and the resource-level permissions of a folder.
   */
  public open fun permissions(vararg `value`: Any): Unit = permissions(`value`.toList())

  /**
   * The sharing scope of the folder.
   */
  public open fun sharingModel(): String? = unwrap(this).getSharingModel()

  /**
   * The sharing scope of the folder.
   */
  public open fun sharingModel(`value`: String) {
    unwrap(this).setSharingModel(`value`)
  }

  /**
   * A list of tags for the folders that you want to apply overrides to.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags for the folders that you want to apply overrides to.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags for the folders that you want to apply overrides to.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnFolder].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID for the AWS account where you want to create the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-awsaccountid)
     * @param awsAccountId The ID for the AWS account where you want to create the folder. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * The ID of the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-folderid)
     * @param folderId The ID of the folder. 
     */
    public fun folderId(folderId: String)

    /**
     * The type of folder it is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-foldertype)
     * @param folderType The type of folder it is. 
     */
    public fun folderType(folderType: String)

    /**
     * A display name for the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-name)
     * @param name A display name for the folder. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) for the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-parentfolderarn)
     * @param parentFolderArn The Amazon Resource Name (ARN) for the folder. 
     */
    public fun parentFolderArn(parentFolderArn: String)

    /**
     * A structure that describes the principals and the resource-level permissions of a folder.
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder. 
     */
    public fun permissions(permissions: IResolvable)

    /**
     * A structure that describes the principals and the resource-level permissions of a folder.
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder. 
     */
    public fun permissions(permissions: List<Any>)

    /**
     * A structure that describes the principals and the resource-level permissions of a folder.
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder. 
     */
    public fun permissions(vararg permissions: Any)

    /**
     * The sharing scope of the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-sharingmodel)
     * @param sharingModel The sharing scope of the folder. 
     */
    public fun sharingModel(sharingModel: String)

    /**
     * A list of tags for the folders that you want to apply overrides to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-tags)
     * @param tags A list of tags for the folders that you want to apply overrides to. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags for the folders that you want to apply overrides to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-tags)
     * @param tags A list of tags for the folders that you want to apply overrides to. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnFolder.Builder =
        software.amazon.awscdk.services.quicksight.CfnFolder.Builder.create(scope, id)

    /**
     * The ID for the AWS account where you want to create the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-awsaccountid)
     * @param awsAccountId The ID for the AWS account where you want to create the folder. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The ID of the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-folderid)
     * @param folderId The ID of the folder. 
     */
    override fun folderId(folderId: String) {
      cdkBuilder.folderId(folderId)
    }

    /**
     * The type of folder it is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-foldertype)
     * @param folderType The type of folder it is. 
     */
    override fun folderType(folderType: String) {
      cdkBuilder.folderType(folderType)
    }

    /**
     * A display name for the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-name)
     * @param name A display name for the folder. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) for the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-parentfolderarn)
     * @param parentFolderArn The Amazon Resource Name (ARN) for the folder. 
     */
    override fun parentFolderArn(parentFolderArn: String) {
      cdkBuilder.parentFolderArn(parentFolderArn)
    }

    /**
     * A structure that describes the principals and the resource-level permissions of a folder.
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder. 
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure that describes the principals and the resource-level permissions of a folder.
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder. 
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A structure that describes the principals and the resource-level permissions of a folder.
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-permissions)
     * @param permissions A structure that describes the principals and the resource-level
     * permissions of a folder. 
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * The sharing scope of the folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-sharingmodel)
     * @param sharingModel The sharing scope of the folder. 
     */
    override fun sharingModel(sharingModel: String) {
      cdkBuilder.sharingModel(sharingModel)
    }

    /**
     * A list of tags for the folders that you want to apply overrides to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-tags)
     * @param tags A list of tags for the folders that you want to apply overrides to. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags for the folders that you want to apply overrides to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-folder.html#cfn-quicksight-folder-tags)
     * @param tags A list of tags for the folders that you want to apply overrides to. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnFolder = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnFolder.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFolder {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFolder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnFolder): CfnFolder =
        CfnFolder(cdkObject)

    internal fun unwrap(wrapped: CfnFolder): software.amazon.awscdk.services.quicksight.CfnFolder =
        wrapped.cdkObject as software.amazon.awscdk.services.quicksight.CfnFolder
  }

  /**
   * Permission for the resource.</p>.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ResourcePermissionProperty resourcePermissionProperty = ResourcePermissionProperty.builder()
   * .actions(List.of("actions"))
   * .principal("principal")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-folder-resourcepermission.html)
   */
  public interface ResourcePermissionProperty {
    /**
     * The IAM action to grant or revoke permissions on.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-folder-resourcepermission.html#cfn-quicksight-folder-resourcepermission-actions)
     */
    public fun actions(): List<String>

    /**
     * The Amazon Resource Name (ARN) of the principal.
     *
     * This can be one of the
     * following:</p>
     *
     * * 
     * The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This
     * is common.)</p>
     *
     * * 
     * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
     * dashboard, template, or theme. (This is common.)</p>
     *
     * * 
     * The ARN of an Amazon Web Services account root: This is an IAM ARN rather than a QuickSight
     * ARN. Use this option only to share resources (templates) across Amazon Web Services accounts.
     * (This is less common.) </p>
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-folder-resourcepermission.html#cfn-quicksight-folder-resourcepermission-principal)
     */
    public fun principal(): String

    /**
     * A builder for [ResourcePermissionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The IAM action to grant or revoke permissions on.</p>. 
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions The IAM action to grant or revoke permissions on.</p>. 
       */
      public fun actions(vararg actions: String)

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. 
       * This can be one of the
       * following:</p>
       *
       * * 
       * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)</p>
       *
       * * 
       * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)</p>
       *
       * * 
       * The ARN of an Amazon Web Services account root: This is an IAM ARN rather than a QuickSight
       * ARN. Use this option only to share resources (templates) across Amazon Web Services
       * accounts.
       * (This is less common.) </p>
       */
      public fun principal(principal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnFolder.ResourcePermissionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnFolder.ResourcePermissionProperty.builder()

      /**
       * @param actions The IAM action to grant or revoke permissions on.</p>. 
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The IAM action to grant or revoke permissions on.</p>. 
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. 
       * This can be one of the
       * following:</p>
       *
       * * 
       * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)</p>
       *
       * * 
       * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)</p>
       *
       * * 
       * The ARN of an Amazon Web Services account root: This is an IAM ARN rather than a QuickSight
       * ARN. Use this option only to share resources (templates) across Amazon Web Services
       * accounts.
       * (This is less common.) </p>
       */
      override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnFolder.ResourcePermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnFolder.ResourcePermissionProperty,
    ) : CdkObject(cdkObject),
        ResourcePermissionProperty {
      /**
       * The IAM action to grant or revoke permissions on.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-folder-resourcepermission.html#cfn-quicksight-folder-resourcepermission-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions()

      /**
       * The Amazon Resource Name (ARN) of the principal.
       *
       * This can be one of the
       * following:</p>
       *
       * * 
       * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)</p>
       *
       * * 
       * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)</p>
       *
       * * 
       * The ARN of an Amazon Web Services account root: This is an IAM ARN rather than a QuickSight
       * ARN. Use this option only to share resources (templates) across Amazon Web Services
       * accounts.
       * (This is less common.) </p>
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-folder-resourcepermission.html#cfn-quicksight-folder-resourcepermission-principal)
       */
      override fun principal(): String = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnFolder.ResourcePermissionProperty):
          ResourcePermissionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourcePermissionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcePermissionProperty):
          software.amazon.awscdk.services.quicksight.CfnFolder.ResourcePermissionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnFolder.ResourcePermissionProperty
    }
  }
}
