@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSlackWorkspaceConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.supportapp.*;
 * CfnSlackWorkspaceConfigurationProps cfnSlackWorkspaceConfigurationProps =
 * CfnSlackWorkspaceConfigurationProps.builder()
 * .teamId("teamId")
 * // the properties below are optional
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html)
 */
public interface CfnSlackWorkspaceConfigurationProps {
  /**
   * The team ID in Slack.
   *
   * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-teamid)
   */
  public fun teamId(): String

  /**
   * An identifier used to update an existing Slack workspace configuration in AWS CloudFormation ,
   * such as `100` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-versionid)
   */
  public fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * A builder for [CfnSlackWorkspaceConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param teamId The team ID in Slack. 
     * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
     */
    public fun teamId(teamId: String)

    /**
     * @param versionId An identifier used to update an existing Slack workspace configuration in
     * AWS CloudFormation , such as `100` .
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps.builder()

    /**
     * @param teamId The team ID in Slack. 
     * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * @param versionId An identifier used to update an existing Slack workspace configuration in
     * AWS CloudFormation , such as `100` .
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build():
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps,
  ) : CdkObject(cdkObject), CfnSlackWorkspaceConfigurationProps {
    /**
     * The team ID in Slack.
     *
     * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-teamid)
     */
    override fun teamId(): String = unwrap(this).getTeamId()

    /**
     * An identifier used to update an existing Slack workspace configuration in AWS CloudFormation
     * , such as `100` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-versionid)
     */
    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSlackWorkspaceConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps):
        CfnSlackWorkspaceConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSlackWorkspaceConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSlackWorkspaceConfigurationProps):
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps
  }
}
