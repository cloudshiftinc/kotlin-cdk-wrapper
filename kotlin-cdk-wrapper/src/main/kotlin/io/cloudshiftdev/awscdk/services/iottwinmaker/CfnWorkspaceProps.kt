@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
 * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
 * .role("role")
 * .s3Location("s3Location")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html)
 */
public interface CfnWorkspaceProps {
  /**
   * The description of the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ARN of the execution role associated with the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-role)
   */
  public fun role(): String

  /**
   * The ARN of the S3 bucket where resources associated with the workspace are stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-s3location)
   */
  public fun s3Location(): String

  /**
   * Metadata that you can use to manage the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ID of the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-workspaceid)
   */
  public fun workspaceId(): String

  /**
   * A builder for [CfnWorkspaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the workspace.
     */
    public fun description(description: String)

    /**
     * @param role The ARN of the execution role associated with the workspace. 
     */
    public fun role(role: String)

    /**
     * @param s3Location The ARN of the S3 bucket where resources associated with the workspace are
     * stored. 
     */
    public fun s3Location(s3Location: String)

    /**
     * @param tags Metadata that you can use to manage the workspace.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param workspaceId The ID of the workspace. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps.builder()

    /**
     * @param description The description of the workspace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param role The ARN of the execution role associated with the workspace. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param s3Location The ARN of the S3 bucket where resources associated with the workspace are
     * stored. 
     */
    override fun s3Location(s3Location: String) {
      cdkBuilder.s3Location(s3Location)
    }

    /**
     * @param tags Metadata that you can use to manage the workspace.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workspaceId The ID of the workspace. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps,
  ) : CdkObject(cdkObject),
      CfnWorkspaceProps {
    /**
     * The description of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ARN of the execution role associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-role)
     */
    override fun role(): String = unwrap(this).getRole()

    /**
     * The ARN of the S3 bucket where resources associated with the workspace are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-s3location)
     */
    override fun s3Location(): String = unwrap(this).getS3Location()

    /**
     * Metadata that you can use to manage the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ID of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-workspaceid)
     */
    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps):
        CfnWorkspaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkspaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps
  }
}
