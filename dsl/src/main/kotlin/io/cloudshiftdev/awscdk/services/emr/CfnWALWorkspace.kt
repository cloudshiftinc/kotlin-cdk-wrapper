package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWALWorkspace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * You can add tags when you create a new workspace.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * You can add tags when you create a new workspace.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * You can add tags when you create a new workspace.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the WAL workspace.
   */
  public open fun walWorkspaceName(): String? = unwrap(this).getWalWorkspaceName()

  /**
   * The name of the WAL workspace.
   */
  public open fun walWorkspaceName(`value`: String) {
    unwrap(this).setWalWorkspaceName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnWALWorkspace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * You can add tags when you create a new workspace.
     *
     * You can add, remove, or list tags from an active workspace, but you can't update tags.
     * Instead, remove the tag and add a new one. For more information, see see [Tag your Amazon EMR
     * WAL
     * workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
     * @param tags You can add tags when you create a new workspace. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * You can add tags when you create a new workspace.
     *
     * You can add, remove, or list tags from an active workspace, but you can't update tags.
     * Instead, remove the tag and add a new one. For more information, see see [Tag your Amazon EMR
     * WAL
     * workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
     * @param tags You can add tags when you create a new workspace. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the WAL workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-walworkspacename)
     * @param walWorkspaceName The name of the WAL workspace. 
     */
    public fun walWorkspaceName(walWorkspaceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnWALWorkspace.Builder =
        software.amazon.awscdk.services.emr.CfnWALWorkspace.Builder.create(scope, id)

    /**
     * You can add tags when you create a new workspace.
     *
     * You can add, remove, or list tags from an active workspace, but you can't update tags.
     * Instead, remove the tag and add a new one. For more information, see see [Tag your Amazon EMR
     * WAL
     * workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
     * @param tags You can add tags when you create a new workspace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * You can add tags when you create a new workspace.
     *
     * You can add, remove, or list tags from an active workspace, but you can't update tags.
     * Instead, remove the tag and add a new one. For more information, see see [Tag your Amazon EMR
     * WAL
     * workspaces](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-hbase-wal.html#emr-hbase-wal-tagging)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
     * @param tags You can add tags when you create a new workspace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the WAL workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-walworkspacename)
     * @param walWorkspaceName The name of the WAL workspace. 
     */
    override fun walWorkspaceName(walWorkspaceName: String) {
      cdkBuilder.walWorkspaceName(walWorkspaceName)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnWALWorkspace = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWALWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWALWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspace):
        CfnWALWorkspace = CfnWALWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWALWorkspace):
        software.amazon.awscdk.services.emr.CfnWALWorkspace = wrapped.cdkObject
  }
}
