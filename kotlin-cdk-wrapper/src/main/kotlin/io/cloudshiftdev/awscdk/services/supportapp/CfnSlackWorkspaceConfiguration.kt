@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * You can use the `AWS::SupportApp::SlackWorkspaceConfiguration` resource to specify your Slack
 * workspace configuration.
 *
 * This resource configures your AWS account so that you can use the specified Slack workspace in
 * the AWS Support App . This resource includes the following information:
 *
 * * The team ID for the Slack workspace
 * * The version ID of the resource to use with AWS CloudFormation
 *
 * For more information, see the following topics in the *User Guide* :
 *
 * * [AWS Support App in
 * Slack](https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html)
 * * [Creating AWS Support App in Slack resources with AWS
 * CloudFormation](https://docs.aws.amazon.com/awssupport/latest/user/creating-resources-with-cloudformation.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.supportapp.*;
 * CfnSlackWorkspaceConfiguration cfnSlackWorkspaceConfiguration =
 * CfnSlackWorkspaceConfiguration.Builder.create(this, "MyCfnSlackWorkspaceConfiguration")
 * .teamId("teamId")
 * // the properties below are optional
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html)
 */
public open class CfnSlackWorkspaceConfiguration(
  cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSlackWorkspaceConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSlackWorkspaceConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSlackWorkspaceConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSlackWorkspaceConfigurationProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration.CFN_RESOURCE_TYPE_NAME

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
        wrapped.cdkObject as
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
  }
}
