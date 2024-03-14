package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnSyncJobProps {
  /**
   * The SyncJob IAM role.
   *
   * This IAM role is used by the sync job to read from the syncSource, and create, update or delete
   * the corresponding resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncrole)
   */
  public fun syncRole(): String

  /**
   * The sync source.
   *
   *
   * Currently the only supported syncSoucre is `SITEWISE` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncsource)
   */
  public fun syncSource(): String

  /**
   * Metadata you can use to manage the SyncJob.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ID of the workspace that contains the sync job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-workspaceid)
   */
  public fun workspaceId(): String

  /**
   * A builder for [CfnSyncJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param syncRole The SyncJob IAM role. 
     * This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     */
    public fun syncRole(syncRole: String)

    /**
     * @param syncSource The sync source. 
     *
     * Currently the only supported syncSoucre is `SITEWISE` .
     */
    public fun syncSource(syncSource: String)

    /**
     * @param tags Metadata you can use to manage the SyncJob.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param workspaceId The ID of the workspace that contains the sync job. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps.builder()

    /**
     * @param syncRole The SyncJob IAM role. 
     * This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     */
    override fun syncRole(syncRole: String) {
      cdkBuilder.syncRole(syncRole)
    }

    /**
     * @param syncSource The sync source. 
     *
     * Currently the only supported syncSoucre is `SITEWISE` .
     */
    override fun syncSource(syncSource: String) {
      cdkBuilder.syncSource(syncSource)
    }

    /**
     * @param tags Metadata you can use to manage the SyncJob.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workspaceId The ID of the workspace that contains the sync job. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps,
  ) : CdkObject(cdkObject), CfnSyncJobProps {
    /**
     * The SyncJob IAM role.
     *
     * This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncrole)
     */
    override fun syncRole(): String = unwrap(this).getSyncRole()

    /**
     * The sync source.
     *
     *
     * Currently the only supported syncSoucre is `SITEWISE` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncsource)
     */
    override fun syncSource(): String = unwrap(this).getSyncSource()

    /**
     * Metadata you can use to manage the SyncJob.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ID of the workspace that contains the sync job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-workspaceid)
     */
    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSyncJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps):
        CfnSyncJobProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSyncJobProps):
        software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps
  }
}
