@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The SyncJob.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
 * CfnSyncJob cfnSyncJob = CfnSyncJob.Builder.create(this, "MyCfnSyncJob")
 * .syncRole("syncRole")
 * .syncSource("syncSource")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html)
 */
public open class CfnSyncJob internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSyncJob,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The SyncJob ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The creation date and time of the SyncJob.
   */
  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  /**
   * The SyncJob's state.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The update date and time.
   */
  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The SyncJob IAM role.
   */
  public open fun syncRole(): String = unwrap(this).getSyncRole()

  /**
   * The SyncJob IAM role.
   */
  public open fun syncRole(`value`: String) {
    unwrap(this).setSyncRole(`value`)
  }

  /**
   * The sync source.
   */
  public open fun syncSource(): String = unwrap(this).getSyncSource()

  /**
   * The sync source.
   */
  public open fun syncSource(`value`: String) {
    unwrap(this).setSyncSource(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata you can use to manage the SyncJob.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Metadata you can use to manage the SyncJob.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The ID of the workspace that contains the sync job.
   */
  public open fun workspaceId(): String = unwrap(this).getWorkspaceId()

  /**
   * The ID of the workspace that contains the sync job.
   */
  public open fun workspaceId(`value`: String) {
    unwrap(this).setWorkspaceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iottwinmaker.CfnSyncJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The SyncJob IAM role.
     *
     * This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncrole)
     * @param syncRole The SyncJob IAM role. 
     */
    public fun syncRole(syncRole: String)

    /**
     * The sync source.
     *
     *
     * Currently the only supported syncSoucre is `SITEWISE` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncsource)
     * @param syncSource The sync source. 
     */
    public fun syncSource(syncSource: String)

    /**
     * Metadata you can use to manage the SyncJob.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-tags)
     * @param tags Metadata you can use to manage the SyncJob. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The ID of the workspace that contains the sync job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-workspaceid)
     * @param workspaceId The ID of the workspace that contains the sync job. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnSyncJob.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnSyncJob.Builder.create(scope, id)

    /**
     * The SyncJob IAM role.
     *
     * This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncrole)
     * @param syncRole The SyncJob IAM role. 
     */
    override fun syncRole(syncRole: String) {
      cdkBuilder.syncRole(syncRole)
    }

    /**
     * The sync source.
     *
     *
     * Currently the only supported syncSoucre is `SITEWISE` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncsource)
     * @param syncSource The sync source. 
     */
    override fun syncSource(syncSource: String) {
      cdkBuilder.syncSource(syncSource)
    }

    /**
     * Metadata you can use to manage the SyncJob.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-tags)
     * @param tags Metadata you can use to manage the SyncJob. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The ID of the workspace that contains the sync job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-workspaceid)
     * @param workspaceId The ID of the workspace that contains the sync job. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnSyncJob = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iottwinmaker.CfnSyncJob.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSyncJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSyncJob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSyncJob):
        CfnSyncJob = CfnSyncJob(cdkObject)

    internal fun unwrap(wrapped: CfnSyncJob):
        software.amazon.awscdk.services.iottwinmaker.CfnSyncJob = wrapped.cdkObject
  }
}
