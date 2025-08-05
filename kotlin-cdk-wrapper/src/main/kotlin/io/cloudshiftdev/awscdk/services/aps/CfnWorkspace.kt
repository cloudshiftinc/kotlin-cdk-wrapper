@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Amazon Managed Service for Prometheus workspace is a logical and isolated Prometheus server
 * dedicated to ingesting, storing, and querying your Prometheus-compatible metrics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aps.*;
 * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
 * .alertManagerDefinition("alertManagerDefinition")
 * .alias("alias")
 * .kmsKeyArn("kmsKeyArn")
 * .loggingConfiguration(LoggingConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .queryLoggingConfiguration(QueryLoggingConfigurationProperty.builder()
 * .destinations(List.of(LoggingDestinationProperty.builder()
 * .cloudWatchLogs(CloudWatchLogDestinationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .filters(LoggingFilterProperty.builder()
 * .qspThreshold(123)
 * .build())
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workspaceConfiguration(WorkspaceConfigurationProperty.builder()
 * .limitsPerLabelSets(List.of(LimitsPerLabelSetProperty.builder()
 * .labelSet(List.of(LabelProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .limits(LimitsPerLabelSetEntryProperty.builder()
 * .maxSeries(123)
 * .build())
 * .build()))
 * .retentionPeriodInDays(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html)
 */
public open class CfnWorkspace(
  cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.aps.CfnWorkspace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkspaceProps,
  ) :
      this(software.amazon.awscdk.services.aps.CfnWorkspace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWorkspaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkspaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkspaceProps(props)
  )

  /**
   * The alert manager definition, a YAML configuration for the alert manager in your Amazon Managed
   * Service for Prometheus workspace.
   */
  public open fun alertManagerDefinition(): String? = unwrap(this).getAlertManagerDefinition()

  /**
   * The alert manager definition, a YAML configuration for the alert manager in your Amazon Managed
   * Service for Prometheus workspace.
   */
  public open fun alertManagerDefinition(`value`: String) {
    unwrap(this).setAlertManagerDefinition(`value`)
  }

  /**
   * The alias that is assigned to this workspace to help identify it.
   */
  public open fun alias(): String? = unwrap(this).getAlias()

  /**
   * The alias that is assigned to this workspace to help identify it.
   */
  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  /**
   * The ARN of the workspace.
   *
   * For example,
   * `arn:aws:aps:&lt;region&gt;:123456789012:workspace/ws-example1-1234-abcd-5678-ef90abcd1234` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Prometheus endpoint available for this workspace.
   *
   * For example,
   * `https://aps-workspaces.&lt;region&gt;.amazonaws.com/workspaces/ws-example1-1234-abcd-5678-ef90abcd1234/api/v1/`
   * .
   */
  public open fun attrPrometheusEndpoint(): String = unwrap(this).getAttrPrometheusEndpoint()

  /**
   * The unique ID for the workspace.
   *
   * For example, `ws-example1-1234-abcd-5678-ef90abcd1234` .
   */
  public open fun attrWorkspaceId(): String = unwrap(this).getAttrWorkspaceId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * (optional) The ARN for a customer managed AWS KMS key to use for encrypting data within your
   * workspace.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * (optional) The ARN for a customer managed AWS KMS key to use for encrypting data within your
   * workspace.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * Contains information about the current rules and alerting logging configuration for the
   * workspace.
   */
  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * Contains information about the current rules and alerting logging configuration for the
   * workspace.
   */
  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains information about the current rules and alerting logging configuration for the
   * workspace.
   */
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains information about the current rules and alerting logging configuration for the
   * workspace.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db25d63fa46e0689793f9663994b31dfaa952181e3c28cb74551005428db0b28")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  /**
   * The definition of logging configuration in an Amazon Managed Service for Prometheus workspace.
   */
  public open fun queryLoggingConfiguration(): Any? = unwrap(this).getQueryLoggingConfiguration()

  /**
   * The definition of logging configuration in an Amazon Managed Service for Prometheus workspace.
   */
  public open fun queryLoggingConfiguration(`value`: IResolvable) {
    unwrap(this).setQueryLoggingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The definition of logging configuration in an Amazon Managed Service for Prometheus workspace.
   */
  public open fun queryLoggingConfiguration(`value`: QueryLoggingConfigurationProperty) {
    unwrap(this).setQueryLoggingConfiguration(`value`.let(QueryLoggingConfigurationProperty.Companion::unwrap))
  }

  /**
   * The definition of logging configuration in an Amazon Managed Service for Prometheus workspace.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2ef41e4ffebb3f7ce410b4cbfbb6a06f93bb8c7912db1c8f136c5f1a279bc8e")
  public open
      fun queryLoggingConfiguration(`value`: QueryLoggingConfigurationProperty.Builder.() -> Unit):
      Unit = queryLoggingConfiguration(QueryLoggingConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of tag keys and values that are associated with the workspace.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of tag keys and values that are associated with the workspace.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The list of tag keys and values that are associated with the workspace.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Use this structure to define label sets and the ingestion limits for time series that match
   * label sets, and to specify the retention period of the workspace.
   */
  public open fun workspaceConfiguration(): Any? = unwrap(this).getWorkspaceConfiguration()

  /**
   * Use this structure to define label sets and the ingestion limits for time series that match
   * label sets, and to specify the retention period of the workspace.
   */
  public open fun workspaceConfiguration(`value`: IResolvable) {
    unwrap(this).setWorkspaceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Use this structure to define label sets and the ingestion limits for time series that match
   * label sets, and to specify the retention period of the workspace.
   */
  public open fun workspaceConfiguration(`value`: WorkspaceConfigurationProperty) {
    unwrap(this).setWorkspaceConfiguration(`value`.let(WorkspaceConfigurationProperty.Companion::unwrap))
  }

  /**
   * Use this structure to define label sets and the ingestion limits for time series that match
   * label sets, and to specify the retention period of the workspace.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10d65ef2e10b3972f0f00b713bf8110ddba126ff919a9678a79129e7a1e7fbfd")
  public open
      fun workspaceConfiguration(`value`: WorkspaceConfigurationProperty.Builder.() -> Unit): Unit =
      workspaceConfiguration(WorkspaceConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.aps.CfnWorkspace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The alert manager definition, a YAML configuration for the alert manager in your Amazon
     * Managed Service for Prometheus workspace.
     *
     * For details about the alert manager definition, see [Creating an alert manager configuration
     * files](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alertmanager-config.html) in
     * the *Amazon Managed Service for Prometheus User Guide* .
     *
     * The following example shows part of a CloudFormation YAML file with an embedded alert manager
     * definition (following the `- |-` ).
     *
     * `Workspace: Type: AWS::APS::Workspace .... Properties: .... AlertManagerDefinition:
     * Fn::Sub: - |- alertmanager_config: | templates: - 'default_template' route: receiver:
     * example-sns receivers: - name: example-sns sns_configs: - topic_arn:
     * 'arn:aws:sns:${AWS::Region}:${AWS::AccountId}:${TopicName}' -`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alertmanagerdefinition)
     * @param alertManagerDefinition The alert manager definition, a YAML configuration for the
     * alert manager in your Amazon Managed Service for Prometheus workspace. 
     */
    public fun alertManagerDefinition(alertManagerDefinition: String)

    /**
     * The alias that is assigned to this workspace to help identify it.
     *
     * It does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alias)
     * @param alias The alias that is assigned to this workspace to help identify it. 
     */
    public fun alias(alias: String)

    /**
     * (optional) The ARN for a customer managed AWS KMS key to use for encrypting data within your
     * workspace.
     *
     * For more information about using your own key in your workspace, see [Encryption at
     * rest](https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html)
     * in the *Amazon Managed Service for Prometheus User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-kmskeyarn)
     * @param kmsKeyArn (optional) The ARN for a customer managed AWS KMS key to use for encrypting
     * data within your workspace. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * Contains information about the current rules and alerting logging configuration for the
     * workspace.
     *
     *
     * These logging configurations are only for rules and alerting logs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the current rules and alerting logging
     * configuration for the workspace. 
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * Contains information about the current rules and alerting logging configuration for the
     * workspace.
     *
     *
     * These logging configurations are only for rules and alerting logs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the current rules and alerting logging
     * configuration for the workspace. 
     */
    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    /**
     * Contains information about the current rules and alerting logging configuration for the
     * workspace.
     *
     *
     * These logging configurations are only for rules and alerting logs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the current rules and alerting logging
     * configuration for the workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c4a45ee9be8e4123c77e913c4dfa7afd640aac94bd113c210c15cd523e8489")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * The definition of logging configuration in an Amazon Managed Service for Prometheus
     * workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-queryloggingconfiguration)
     * @param queryLoggingConfiguration The definition of logging configuration in an Amazon Managed
     * Service for Prometheus workspace. 
     */
    public fun queryLoggingConfiguration(queryLoggingConfiguration: IResolvable)

    /**
     * The definition of logging configuration in an Amazon Managed Service for Prometheus
     * workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-queryloggingconfiguration)
     * @param queryLoggingConfiguration The definition of logging configuration in an Amazon Managed
     * Service for Prometheus workspace. 
     */
    public
        fun queryLoggingConfiguration(queryLoggingConfiguration: QueryLoggingConfigurationProperty)

    /**
     * The definition of logging configuration in an Amazon Managed Service for Prometheus
     * workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-queryloggingconfiguration)
     * @param queryLoggingConfiguration The definition of logging configuration in an Amazon Managed
     * Service for Prometheus workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9ebfbcfec95d43c35c33e0282db9abb4c5da1d5203133fc80ff4e8c969ca2d5")
    public
        fun queryLoggingConfiguration(queryLoggingConfiguration: QueryLoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * The list of tag keys and values that are associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
     * @param tags The list of tag keys and values that are associated with the workspace. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of tag keys and values that are associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
     * @param tags The list of tag keys and values that are associated with the workspace. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Use this structure to define label sets and the ingestion limits for time series that match
     * label sets, and to specify the retention period of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-workspaceconfiguration)
     * @param workspaceConfiguration Use this structure to define label sets and the ingestion
     * limits for time series that match label sets, and to specify the retention period of the
     * workspace. 
     */
    public fun workspaceConfiguration(workspaceConfiguration: IResolvable)

    /**
     * Use this structure to define label sets and the ingestion limits for time series that match
     * label sets, and to specify the retention period of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-workspaceconfiguration)
     * @param workspaceConfiguration Use this structure to define label sets and the ingestion
     * limits for time series that match label sets, and to specify the retention period of the
     * workspace. 
     */
    public fun workspaceConfiguration(workspaceConfiguration: WorkspaceConfigurationProperty)

    /**
     * Use this structure to define label sets and the ingestion limits for time series that match
     * label sets, and to specify the retention period of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-workspaceconfiguration)
     * @param workspaceConfiguration Use this structure to define label sets and the ingestion
     * limits for time series that match label sets, and to specify the retention period of the
     * workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df83ee6e6882bc86540f28cbf8cc40c766a58c6ffcfd432caaa986ae8aadf384")
    public
        fun workspaceConfiguration(workspaceConfiguration: WorkspaceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnWorkspace.Builder =
        software.amazon.awscdk.services.aps.CfnWorkspace.Builder.create(scope, id)

    /**
     * The alert manager definition, a YAML configuration for the alert manager in your Amazon
     * Managed Service for Prometheus workspace.
     *
     * For details about the alert manager definition, see [Creating an alert manager configuration
     * files](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alertmanager-config.html) in
     * the *Amazon Managed Service for Prometheus User Guide* .
     *
     * The following example shows part of a CloudFormation YAML file with an embedded alert manager
     * definition (following the `- |-` ).
     *
     * `Workspace: Type: AWS::APS::Workspace .... Properties: .... AlertManagerDefinition:
     * Fn::Sub: - |- alertmanager_config: | templates: - 'default_template' route: receiver:
     * example-sns receivers: - name: example-sns sns_configs: - topic_arn:
     * 'arn:aws:sns:${AWS::Region}:${AWS::AccountId}:${TopicName}' -`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alertmanagerdefinition)
     * @param alertManagerDefinition The alert manager definition, a YAML configuration for the
     * alert manager in your Amazon Managed Service for Prometheus workspace. 
     */
    override fun alertManagerDefinition(alertManagerDefinition: String) {
      cdkBuilder.alertManagerDefinition(alertManagerDefinition)
    }

    /**
     * The alias that is assigned to this workspace to help identify it.
     *
     * It does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alias)
     * @param alias The alias that is assigned to this workspace to help identify it. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * (optional) The ARN for a customer managed AWS KMS key to use for encrypting data within your
     * workspace.
     *
     * For more information about using your own key in your workspace, see [Encryption at
     * rest](https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html)
     * in the *Amazon Managed Service for Prometheus User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-kmskeyarn)
     * @param kmsKeyArn (optional) The ARN for a customer managed AWS KMS key to use for encrypting
     * data within your workspace. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * Contains information about the current rules and alerting logging configuration for the
     * workspace.
     *
     *
     * These logging configurations are only for rules and alerting logs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the current rules and alerting logging
     * configuration for the workspace. 
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains information about the current rules and alerting logging configuration for the
     * workspace.
     *
     *
     * These logging configurations are only for rules and alerting logs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the current rules and alerting logging
     * configuration for the workspace. 
     */
    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains information about the current rules and alerting logging configuration for the
     * workspace.
     *
     *
     * These logging configurations are only for rules and alerting logs.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the current rules and alerting logging
     * configuration for the workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c4a45ee9be8e4123c77e913c4dfa7afd640aac94bd113c210c15cd523e8489")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    /**
     * The definition of logging configuration in an Amazon Managed Service for Prometheus
     * workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-queryloggingconfiguration)
     * @param queryLoggingConfiguration The definition of logging configuration in an Amazon Managed
     * Service for Prometheus workspace. 
     */
    override fun queryLoggingConfiguration(queryLoggingConfiguration: IResolvable) {
      cdkBuilder.queryLoggingConfiguration(queryLoggingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The definition of logging configuration in an Amazon Managed Service for Prometheus
     * workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-queryloggingconfiguration)
     * @param queryLoggingConfiguration The definition of logging configuration in an Amazon Managed
     * Service for Prometheus workspace. 
     */
    override
        fun queryLoggingConfiguration(queryLoggingConfiguration: QueryLoggingConfigurationProperty) {
      cdkBuilder.queryLoggingConfiguration(queryLoggingConfiguration.let(QueryLoggingConfigurationProperty.Companion::unwrap))
    }

    /**
     * The definition of logging configuration in an Amazon Managed Service for Prometheus
     * workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-queryloggingconfiguration)
     * @param queryLoggingConfiguration The definition of logging configuration in an Amazon Managed
     * Service for Prometheus workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9ebfbcfec95d43c35c33e0282db9abb4c5da1d5203133fc80ff4e8c969ca2d5")
    override
        fun queryLoggingConfiguration(queryLoggingConfiguration: QueryLoggingConfigurationProperty.Builder.() -> Unit):
        Unit =
        queryLoggingConfiguration(QueryLoggingConfigurationProperty(queryLoggingConfiguration))

    /**
     * The list of tag keys and values that are associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
     * @param tags The list of tag keys and values that are associated with the workspace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The list of tag keys and values that are associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
     * @param tags The list of tag keys and values that are associated with the workspace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Use this structure to define label sets and the ingestion limits for time series that match
     * label sets, and to specify the retention period of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-workspaceconfiguration)
     * @param workspaceConfiguration Use this structure to define label sets and the ingestion
     * limits for time series that match label sets, and to specify the retention period of the
     * workspace. 
     */
    override fun workspaceConfiguration(workspaceConfiguration: IResolvable) {
      cdkBuilder.workspaceConfiguration(workspaceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Use this structure to define label sets and the ingestion limits for time series that match
     * label sets, and to specify the retention period of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-workspaceconfiguration)
     * @param workspaceConfiguration Use this structure to define label sets and the ingestion
     * limits for time series that match label sets, and to specify the retention period of the
     * workspace. 
     */
    override fun workspaceConfiguration(workspaceConfiguration: WorkspaceConfigurationProperty) {
      cdkBuilder.workspaceConfiguration(workspaceConfiguration.let(WorkspaceConfigurationProperty.Companion::unwrap))
    }

    /**
     * Use this structure to define label sets and the ingestion limits for time series that match
     * label sets, and to specify the retention period of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-workspaceconfiguration)
     * @param workspaceConfiguration Use this structure to define label sets and the ingestion
     * limits for time series that match label sets, and to specify the retention period of the
     * workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df83ee6e6882bc86540f28cbf8cc40c766a58c6ffcfd432caaa986ae8aadf384")
    override
        fun workspaceConfiguration(workspaceConfiguration: WorkspaceConfigurationProperty.Builder.() -> Unit):
        Unit = workspaceConfiguration(WorkspaceConfigurationProperty(workspaceConfiguration))

    public fun build(): software.amazon.awscdk.services.aps.CfnWorkspace = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.aps.CfnWorkspace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace): CfnWorkspace =
        CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace): software.amazon.awscdk.services.aps.CfnWorkspace =
        wrapped.cdkObject as software.amazon.awscdk.services.aps.CfnWorkspace
  }

  /**
   * Configuration details for logging to CloudWatch Logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * CloudWatchLogDestinationProperty cloudWatchLogDestinationProperty =
   * CloudWatchLogDestinationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-cloudwatchlogdestination.html)
   */
  public interface CloudWatchLogDestinationProperty {
    /**
     * The ARN of the CloudWatch log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-cloudwatchlogdestination.html#cfn-aps-workspace-cloudwatchlogdestination-loggrouparn)
     */
    public fun logGroupArn(): String

    /**
     * A builder for [CloudWatchLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupArn The ARN of the CloudWatch log group. 
       */
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.CloudWatchLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.aps.CfnWorkspace.CloudWatchLogDestinationProperty.builder()

      /**
       * @param logGroupArn The ARN of the CloudWatch log group. 
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.aps.CfnWorkspace.CloudWatchLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.CloudWatchLogDestinationProperty,
    ) : CdkObject(cdkObject),
        CloudWatchLogDestinationProperty {
      /**
       * The ARN of the CloudWatch log group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-cloudwatchlogdestination.html#cfn-aps-workspace-cloudwatchlogdestination-loggrouparn)
       */
      override fun logGroupArn(): String = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.CloudWatchLogDestinationProperty):
          CloudWatchLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogDestinationProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.CloudWatchLogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.CloudWatchLogDestinationProperty
    }
  }

  /**
   * A label is a name:value pair used to add context to ingested metrics.
   *
   * This structure defines the name and value for one label that is used in a label set. You can
   * set ingestion limits on time series that match defined label sets, to help prevent a workspace
   * from being overwhelmed with unexpected spikes in time series ingestion.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * LabelProperty labelProperty = LabelProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-label.html)
   */
  public interface LabelProperty {
    /**
     * The name for this label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-label.html#cfn-aps-workspace-label-name)
     */
    public fun name(): String

    /**
     * The value for this label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-label.html#cfn-aps-workspace-label-value)
     */
    public fun `value`(): String

    /**
     * A builder for [LabelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name for this label. 
       */
      public fun name(name: String)

      /**
       * @param value The value for this label. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.aps.CfnWorkspace.LabelProperty.Builder
          = software.amazon.awscdk.services.aps.CfnWorkspace.LabelProperty.builder()

      /**
       * @param name The name for this label. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value for this label. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.aps.CfnWorkspace.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LabelProperty,
    ) : CdkObject(cdkObject),
        LabelProperty {
      /**
       * The name for this label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-label.html#cfn-aps-workspace-label-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value for this label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-label.html#cfn-aps-workspace-label-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LabelProperty):
          LabelProperty = CdkObjectWrappers.wrap(cdkObject) as? LabelProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.LabelProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.aps.CfnWorkspace.LabelProperty
    }
  }

  /**
   * This structure contains the limits that apply to time series that match one label set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * LimitsPerLabelSetEntryProperty limitsPerLabelSetEntryProperty =
   * LimitsPerLabelSetEntryProperty.builder()
   * .maxSeries(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelsetentry.html)
   */
  public interface LimitsPerLabelSetEntryProperty {
    /**
     * The maximum number of active series that can be ingested that match this label set.
     *
     * Setting this to 0 causes no label set limit to be enforced, but it does cause Amazon Managed
     * Service for Prometheus to vend label set metrics to CloudWatch
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelsetentry.html#cfn-aps-workspace-limitsperlabelsetentry-maxseries)
     */
    public fun maxSeries(): Number? = unwrap(this).getMaxSeries()

    /**
     * A builder for [LimitsPerLabelSetEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxSeries The maximum number of active series that can be ingested that match this
       * label set.
       * Setting this to 0 causes no label set limit to be enforced, but it does cause Amazon
       * Managed Service for Prometheus to vend label set metrics to CloudWatch
       */
      public fun maxSeries(maxSeries: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetEntryProperty.Builder =
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetEntryProperty.builder()

      /**
       * @param maxSeries The maximum number of active series that can be ingested that match this
       * label set.
       * Setting this to 0 causes no label set limit to be enforced, but it does cause Amazon
       * Managed Service for Prometheus to vend label set metrics to CloudWatch
       */
      override fun maxSeries(maxSeries: Number) {
        cdkBuilder.maxSeries(maxSeries)
      }

      public fun build():
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetEntryProperty,
    ) : CdkObject(cdkObject),
        LimitsPerLabelSetEntryProperty {
      /**
       * The maximum number of active series that can be ingested that match this label set.
       *
       * Setting this to 0 causes no label set limit to be enforced, but it does cause Amazon
       * Managed Service for Prometheus to vend label set metrics to CloudWatch
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelsetentry.html#cfn-aps-workspace-limitsperlabelsetentry-maxseries)
       */
      override fun maxSeries(): Number? = unwrap(this).getMaxSeries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LimitsPerLabelSetEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetEntryProperty):
          LimitsPerLabelSetEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LimitsPerLabelSetEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LimitsPerLabelSetEntryProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetEntryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetEntryProperty
    }
  }

  /**
   * This defines a label set for the workspace, and defines the ingestion limit for active time
   * series that match that label set.
   *
   * Each label name in a label set must be unique.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * LimitsPerLabelSetProperty limitsPerLabelSetProperty = LimitsPerLabelSetProperty.builder()
   * .labelSet(List.of(LabelProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .limits(LimitsPerLabelSetEntryProperty.builder()
   * .maxSeries(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelset.html)
   */
  public interface LimitsPerLabelSetProperty {
    /**
     * This defines one label set that will have an enforced ingestion limit.
     *
     * You can set ingestion limits on time series that match defined label sets, to help prevent a
     * workspace from being overwhelmed with unexpected spikes in time series ingestion.
     *
     * Label values accept all UTF-8 characters with one exception. If the label name is metric name
     * label `__ *name* __` , then the *metric* part of the name must conform to the following pattern:
     * `[a-zA-Z_:][a-zA-Z0-9_:]*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelset.html#cfn-aps-workspace-limitsperlabelset-labelset)
     */
    public fun labelSet(): Any

    /**
     * This structure contains the information about the limits that apply to time series that match
     * this label set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelset.html#cfn-aps-workspace-limitsperlabelset-limits)
     */
    public fun limits(): Any

    /**
     * A builder for [LimitsPerLabelSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param labelSet This defines one label set that will have an enforced ingestion limit. 
       * You can set ingestion limits on time series that match defined label sets, to help prevent
       * a workspace from being overwhelmed with unexpected spikes in time series ingestion.
       *
       * Label values accept all UTF-8 characters with one exception. If the label name is metric
       * name label `__ *name* __` , then the *metric* part of the name must conform to the following
       * pattern: `[a-zA-Z_:][a-zA-Z0-9_:]*`
       */
      public fun labelSet(labelSet: IResolvable)

      /**
       * @param labelSet This defines one label set that will have an enforced ingestion limit. 
       * You can set ingestion limits on time series that match defined label sets, to help prevent
       * a workspace from being overwhelmed with unexpected spikes in time series ingestion.
       *
       * Label values accept all UTF-8 characters with one exception. If the label name is metric
       * name label `__ *name* __` , then the *metric* part of the name must conform to the following
       * pattern: `[a-zA-Z_:][a-zA-Z0-9_:]*`
       */
      public fun labelSet(labelSet: List<Any>)

      /**
       * @param labelSet This defines one label set that will have an enforced ingestion limit. 
       * You can set ingestion limits on time series that match defined label sets, to help prevent
       * a workspace from being overwhelmed with unexpected spikes in time series ingestion.
       *
       * Label values accept all UTF-8 characters with one exception. If the label name is metric
       * name label `__ *name* __` , then the *metric* part of the name must conform to the following
       * pattern: `[a-zA-Z_:][a-zA-Z0-9_:]*`
       */
      public fun labelSet(vararg labelSet: Any)

      /**
       * @param limits This structure contains the information about the limits that apply to time
       * series that match this label set. 
       */
      public fun limits(limits: IResolvable)

      /**
       * @param limits This structure contains the information about the limits that apply to time
       * series that match this label set. 
       */
      public fun limits(limits: LimitsPerLabelSetEntryProperty)

      /**
       * @param limits This structure contains the information about the limits that apply to time
       * series that match this label set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cec849e348ccf8a36807ad306c6a79c383ceeff4c0e2f2e89d280a85de68bc38")
      public fun limits(limits: LimitsPerLabelSetEntryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetProperty.Builder =
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetProperty.builder()

      /**
       * @param labelSet This defines one label set that will have an enforced ingestion limit. 
       * You can set ingestion limits on time series that match defined label sets, to help prevent
       * a workspace from being overwhelmed with unexpected spikes in time series ingestion.
       *
       * Label values accept all UTF-8 characters with one exception. If the label name is metric
       * name label `__ *name* __` , then the *metric* part of the name must conform to the following
       * pattern: `[a-zA-Z_:][a-zA-Z0-9_:]*`
       */
      override fun labelSet(labelSet: IResolvable) {
        cdkBuilder.labelSet(labelSet.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param labelSet This defines one label set that will have an enforced ingestion limit. 
       * You can set ingestion limits on time series that match defined label sets, to help prevent
       * a workspace from being overwhelmed with unexpected spikes in time series ingestion.
       *
       * Label values accept all UTF-8 characters with one exception. If the label name is metric
       * name label `__ *name* __` , then the *metric* part of the name must conform to the following
       * pattern: `[a-zA-Z_:][a-zA-Z0-9_:]*`
       */
      override fun labelSet(labelSet: List<Any>) {
        cdkBuilder.labelSet(labelSet.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param labelSet This defines one label set that will have an enforced ingestion limit. 
       * You can set ingestion limits on time series that match defined label sets, to help prevent
       * a workspace from being overwhelmed with unexpected spikes in time series ingestion.
       *
       * Label values accept all UTF-8 characters with one exception. If the label name is metric
       * name label `__ *name* __` , then the *metric* part of the name must conform to the following
       * pattern: `[a-zA-Z_:][a-zA-Z0-9_:]*`
       */
      override fun labelSet(vararg labelSet: Any): Unit = labelSet(labelSet.toList())

      /**
       * @param limits This structure contains the information about the limits that apply to time
       * series that match this label set. 
       */
      override fun limits(limits: IResolvable) {
        cdkBuilder.limits(limits.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param limits This structure contains the information about the limits that apply to time
       * series that match this label set. 
       */
      override fun limits(limits: LimitsPerLabelSetEntryProperty) {
        cdkBuilder.limits(limits.let(LimitsPerLabelSetEntryProperty.Companion::unwrap))
      }

      /**
       * @param limits This structure contains the information about the limits that apply to time
       * series that match this label set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cec849e348ccf8a36807ad306c6a79c383ceeff4c0e2f2e89d280a85de68bc38")
      override fun limits(limits: LimitsPerLabelSetEntryProperty.Builder.() -> Unit): Unit =
          limits(LimitsPerLabelSetEntryProperty(limits))

      public fun build(): software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetProperty,
    ) : CdkObject(cdkObject),
        LimitsPerLabelSetProperty {
      /**
       * This defines one label set that will have an enforced ingestion limit.
       *
       * You can set ingestion limits on time series that match defined label sets, to help prevent
       * a workspace from being overwhelmed with unexpected spikes in time series ingestion.
       *
       * Label values accept all UTF-8 characters with one exception. If the label name is metric
       * name label `__ *name* __` , then the *metric* part of the name must conform to the following
       * pattern: `[a-zA-Z_:][a-zA-Z0-9_:]*`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelset.html#cfn-aps-workspace-limitsperlabelset-labelset)
       */
      override fun labelSet(): Any = unwrap(this).getLabelSet()

      /**
       * This structure contains the information about the limits that apply to time series that
       * match this label set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-limitsperlabelset.html#cfn-aps-workspace-limitsperlabelset-limits)
       */
      override fun limits(): Any = unwrap(this).getLimits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LimitsPerLabelSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetProperty):
          LimitsPerLabelSetProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LimitsPerLabelSetProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LimitsPerLabelSetProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.LimitsPerLabelSetProperty
    }
  }

  /**
   * Contains information about the rules and alerting logging configuration for the workspace.
   *
   *
   * These logging configurations are only for rules and alerting logs.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * LoggingConfigurationProperty loggingConfigurationProperty =
   * LoggingConfigurationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingconfiguration.html)
   */
  public interface LoggingConfigurationProperty {
    /**
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     *
     * This log group must exist prior to calling this operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingconfiguration.html#cfn-aps-workspace-loggingconfiguration-loggrouparn)
     */
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    /**
     * A builder for [LoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupArn The ARN of the CloudWatch log group to which the vended log data will be
       * published.
       * This log group must exist prior to calling this operation.
       */
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty.builder()

      /**
       * @param logGroupArn The ARN of the CloudWatch log group to which the vended log data will be
       * published.
       * This log group must exist prior to calling this operation.
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject),
        LoggingConfigurationProperty {
      /**
       * The ARN of the CloudWatch log group to which the vended log data will be published.
       *
       * This log group must exist prior to calling this operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingconfiguration.html#cfn-aps-workspace-loggingconfiguration-loggrouparn)
       */
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty):
          LoggingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoggingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty
    }
  }

  /**
   * The logging destination in an Amazon Managed Service for Prometheus workspace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * LoggingDestinationProperty loggingDestinationProperty = LoggingDestinationProperty.builder()
   * .cloudWatchLogs(CloudWatchLogDestinationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build())
   * .filters(LoggingFilterProperty.builder()
   * .qspThreshold(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingdestination.html)
   */
  public interface LoggingDestinationProperty {
    /**
     * Configuration details for logging to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingdestination.html#cfn-aps-workspace-loggingdestination-cloudwatchlogs)
     */
    public fun cloudWatchLogs(): Any

    /**
     * Filtering criteria that determine which queries are logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingdestination.html#cfn-aps-workspace-loggingdestination-filters)
     */
    public fun filters(): Any

    /**
     * A builder for [LoggingDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogs Configuration details for logging to CloudWatch Logs. 
       */
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      /**
       * @param cloudWatchLogs Configuration details for logging to CloudWatch Logs. 
       */
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogDestinationProperty)

      /**
       * @param cloudWatchLogs Configuration details for logging to CloudWatch Logs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcdb5616f394e3579e316a52a65dc861e9eb23293d3384bd68e656e1a5c9046a")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogDestinationProperty.Builder.() -> Unit)

      /**
       * @param filters Filtering criteria that determine which queries are logged. 
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters Filtering criteria that determine which queries are logged. 
       */
      public fun filters(filters: LoggingFilterProperty)

      /**
       * @param filters Filtering criteria that determine which queries are logged. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73c4286c7608ccf967d2a679408a6ae97f7e3540d38de7a7c37081f82785a614")
      public fun filters(filters: LoggingFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingDestinationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingDestinationProperty.builder()

      /**
       * @param cloudWatchLogs Configuration details for logging to CloudWatch Logs. 
       */
      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogs Configuration details for logging to CloudWatch Logs. 
       */
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogDestinationProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogDestinationProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogs Configuration details for logging to CloudWatch Logs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcdb5616f394e3579e316a52a65dc861e9eb23293d3384bd68e656e1a5c9046a")
      override
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogDestinationProperty(cloudWatchLogs))

      /**
       * @param filters Filtering criteria that determine which queries are logged. 
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filters Filtering criteria that determine which queries are logged. 
       */
      override fun filters(filters: LoggingFilterProperty) {
        cdkBuilder.filters(filters.let(LoggingFilterProperty.Companion::unwrap))
      }

      /**
       * @param filters Filtering criteria that determine which queries are logged. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73c4286c7608ccf967d2a679408a6ae97f7e3540d38de7a7c37081f82785a614")
      override fun filters(filters: LoggingFilterProperty.Builder.() -> Unit): Unit =
          filters(LoggingFilterProperty(filters))

      public fun build():
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LoggingDestinationProperty,
    ) : CdkObject(cdkObject),
        LoggingDestinationProperty {
      /**
       * Configuration details for logging to CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingdestination.html#cfn-aps-workspace-loggingdestination-cloudwatchlogs)
       */
      override fun cloudWatchLogs(): Any = unwrap(this).getCloudWatchLogs()

      /**
       * Filtering criteria that determine which queries are logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingdestination.html#cfn-aps-workspace-loggingdestination-filters)
       */
      override fun filters(): Any = unwrap(this).getFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LoggingDestinationProperty):
          LoggingDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoggingDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingDestinationProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingDestinationProperty
    }
  }

  /**
   * Filtering criteria that determine which queries are logged.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * LoggingFilterProperty loggingFilterProperty = LoggingFilterProperty.builder()
   * .qspThreshold(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingfilter.html)
   */
  public interface LoggingFilterProperty {
    /**
     * Query logs with QSP above this limit are vended.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingfilter.html#cfn-aps-workspace-loggingfilter-qspthreshold)
     */
    public fun qspThreshold(): Number

    /**
     * A builder for [LoggingFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param qspThreshold Query logs with QSP above this limit are vended. 
       */
      public fun qspThreshold(qspThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingFilterProperty.Builder =
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingFilterProperty.builder()

      /**
       * @param qspThreshold Query logs with QSP above this limit are vended. 
       */
      override fun qspThreshold(qspThreshold: Number) {
        cdkBuilder.qspThreshold(qspThreshold)
      }

      public fun build(): software.amazon.awscdk.services.aps.CfnWorkspace.LoggingFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LoggingFilterProperty,
    ) : CdkObject(cdkObject),
        LoggingFilterProperty {
      /**
       * Query logs with QSP above this limit are vended.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingfilter.html#cfn-aps-workspace-loggingfilter-qspthreshold)
       */
      override fun qspThreshold(): Number = unwrap(this).getQspThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LoggingFilterProperty):
          LoggingFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingFilterProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingFilterProperty
    }
  }

  /**
   * The query logging configuration in an Amazon Managed Service for Prometheus workspace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * QueryLoggingConfigurationProperty queryLoggingConfigurationProperty =
   * QueryLoggingConfigurationProperty.builder()
   * .destinations(List.of(LoggingDestinationProperty.builder()
   * .cloudWatchLogs(CloudWatchLogDestinationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build())
   * .filters(LoggingFilterProperty.builder()
   * .qspThreshold(123)
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-queryloggingconfiguration.html)
   */
  public interface QueryLoggingConfigurationProperty {
    /**
     * Defines a destination and its associated filtering criteria for query logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-queryloggingconfiguration.html#cfn-aps-workspace-queryloggingconfiguration-destinations)
     */
    public fun destinations(): Any

    /**
     * A builder for [QueryLoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinations Defines a destination and its associated filtering criteria for query
       * logging. 
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations Defines a destination and its associated filtering criteria for query
       * logging. 
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations Defines a destination and its associated filtering criteria for query
       * logging. 
       */
      public fun destinations(vararg destinations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.QueryLoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.aps.CfnWorkspace.QueryLoggingConfigurationProperty.builder()

      /**
       * @param destinations Defines a destination and its associated filtering criteria for query
       * logging. 
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinations Defines a destination and its associated filtering criteria for query
       * logging. 
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinations Defines a destination and its associated filtering criteria for query
       * logging. 
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      public fun build():
          software.amazon.awscdk.services.aps.CfnWorkspace.QueryLoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.QueryLoggingConfigurationProperty,
    ) : CdkObject(cdkObject),
        QueryLoggingConfigurationProperty {
      /**
       * Defines a destination and its associated filtering criteria for query logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-queryloggingconfiguration.html#cfn-aps-workspace-queryloggingconfiguration-destinations)
       */
      override fun destinations(): Any = unwrap(this).getDestinations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          QueryLoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.QueryLoggingConfigurationProperty):
          QueryLoggingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryLoggingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryLoggingConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.QueryLoggingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.QueryLoggingConfigurationProperty
    }
  }

  /**
   * Use this structure to define label sets and the ingestion limits for time series that match
   * label sets, and to specify the retention period of the workspace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * WorkspaceConfigurationProperty workspaceConfigurationProperty =
   * WorkspaceConfigurationProperty.builder()
   * .limitsPerLabelSets(List.of(LimitsPerLabelSetProperty.builder()
   * .labelSet(List.of(LabelProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .limits(LimitsPerLabelSetEntryProperty.builder()
   * .maxSeries(123)
   * .build())
   * .build()))
   * .retentionPeriodInDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-workspaceconfiguration.html)
   */
  public interface WorkspaceConfigurationProperty {
    /**
     * This is an array of structures, where each structure defines a label set for the workspace,
     * and defines the ingestion limit for active time series for each of those label sets.
     *
     * Each label name in a label set must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-workspaceconfiguration.html#cfn-aps-workspace-workspaceconfiguration-limitsperlabelsets)
     */
    public fun limitsPerLabelSets(): Any? = unwrap(this).getLimitsPerLabelSets()

    /**
     * Specifies how many days that metrics will be retained in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-workspaceconfiguration.html#cfn-aps-workspace-workspaceconfiguration-retentionperiodindays)
     */
    public fun retentionPeriodInDays(): Number? = unwrap(this).getRetentionPeriodInDays()

    /**
     * A builder for [WorkspaceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param limitsPerLabelSets This is an array of structures, where each structure defines a
       * label set for the workspace, and defines the ingestion limit for active time series for each
       * of those label sets.
       * Each label name in a label set must be unique.
       */
      public fun limitsPerLabelSets(limitsPerLabelSets: IResolvable)

      /**
       * @param limitsPerLabelSets This is an array of structures, where each structure defines a
       * label set for the workspace, and defines the ingestion limit for active time series for each
       * of those label sets.
       * Each label name in a label set must be unique.
       */
      public fun limitsPerLabelSets(limitsPerLabelSets: List<Any>)

      /**
       * @param limitsPerLabelSets This is an array of structures, where each structure defines a
       * label set for the workspace, and defines the ingestion limit for active time series for each
       * of those label sets.
       * Each label name in a label set must be unique.
       */
      public fun limitsPerLabelSets(vararg limitsPerLabelSets: Any)

      /**
       * @param retentionPeriodInDays Specifies how many days that metrics will be retained in the
       * workspace.
       */
      public fun retentionPeriodInDays(retentionPeriodInDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.WorkspaceConfigurationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnWorkspace.WorkspaceConfigurationProperty.builder()

      /**
       * @param limitsPerLabelSets This is an array of structures, where each structure defines a
       * label set for the workspace, and defines the ingestion limit for active time series for each
       * of those label sets.
       * Each label name in a label set must be unique.
       */
      override fun limitsPerLabelSets(limitsPerLabelSets: IResolvable) {
        cdkBuilder.limitsPerLabelSets(limitsPerLabelSets.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param limitsPerLabelSets This is an array of structures, where each structure defines a
       * label set for the workspace, and defines the ingestion limit for active time series for each
       * of those label sets.
       * Each label name in a label set must be unique.
       */
      override fun limitsPerLabelSets(limitsPerLabelSets: List<Any>) {
        cdkBuilder.limitsPerLabelSets(limitsPerLabelSets.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param limitsPerLabelSets This is an array of structures, where each structure defines a
       * label set for the workspace, and defines the ingestion limit for active time series for each
       * of those label sets.
       * Each label name in a label set must be unique.
       */
      override fun limitsPerLabelSets(vararg limitsPerLabelSets: Any): Unit =
          limitsPerLabelSets(limitsPerLabelSets.toList())

      /**
       * @param retentionPeriodInDays Specifies how many days that metrics will be retained in the
       * workspace.
       */
      override fun retentionPeriodInDays(retentionPeriodInDays: Number) {
        cdkBuilder.retentionPeriodInDays(retentionPeriodInDays)
      }

      public fun build():
          software.amazon.awscdk.services.aps.CfnWorkspace.WorkspaceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.WorkspaceConfigurationProperty,
    ) : CdkObject(cdkObject),
        WorkspaceConfigurationProperty {
      /**
       * This is an array of structures, where each structure defines a label set for the workspace,
       * and defines the ingestion limit for active time series for each of those label sets.
       *
       * Each label name in a label set must be unique.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-workspaceconfiguration.html#cfn-aps-workspace-workspaceconfiguration-limitsperlabelsets)
       */
      override fun limitsPerLabelSets(): Any? = unwrap(this).getLimitsPerLabelSets()

      /**
       * Specifies how many days that metrics will be retained in the workspace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-workspaceconfiguration.html#cfn-aps-workspace-workspaceconfiguration-retentionperiodindays)
       */
      override fun retentionPeriodInDays(): Number? = unwrap(this).getRetentionPeriodInDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkspaceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.WorkspaceConfigurationProperty):
          WorkspaceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkspaceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkspaceConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.WorkspaceConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.WorkspaceConfigurationProperty
    }
  }
}
