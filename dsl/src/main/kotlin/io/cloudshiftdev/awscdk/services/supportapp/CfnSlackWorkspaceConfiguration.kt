package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSlackWorkspaceConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The team ID in Slack.
   */
  public open fun teamId(): String = unwrap(this).getTeamId()

  /**
   * The team ID in Slack.
   */
  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  /**
   * An identifier used to update an existing Slack workspace configuration in AWS CloudFormation ,
   * such as `100` .
   */
  public open fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * An identifier used to update an existing Slack workspace configuration in AWS CloudFormation ,
   * such as `100` .
   */
  public open fun versionId(`value`: String) {
    unwrap(this).setVersionId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The team ID in Slack.
     *
     * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-teamid)
     * @param teamId The team ID in Slack. 
     */
    public fun teamId(teamId: String)

    /**
     * An identifier used to update an existing Slack workspace configuration in AWS CloudFormation
     * , such as `100` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-versionid)
     * @param versionId An identifier used to update an existing Slack workspace configuration in
     * AWS CloudFormation , such as `100` . 
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration.Builder.create(scope,
        id)

    /**
     * The team ID in Slack.
     *
     * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-teamid)
     * @param teamId The team ID in Slack. 
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * An identifier used to update an existing Slack workspace configuration in AWS CloudFormation
     * , such as `100` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-versionid)
     * @param versionId An identifier used to update an existing Slack workspace configuration in
     * AWS CloudFormation , such as `100` . 
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSlackWorkspaceConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSlackWorkspaceConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration):
        CfnSlackWorkspaceConfiguration = CfnSlackWorkspaceConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSlackWorkspaceConfiguration):
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration =
        wrapped.cdkObject
  }
}
