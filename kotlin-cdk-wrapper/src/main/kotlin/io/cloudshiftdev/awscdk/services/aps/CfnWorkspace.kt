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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html)
 */
public open class CfnWorkspace(
  cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.aps.CfnWorkspace(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkspaceProps,
  ) :
      this(software.amazon.awscdk.services.aps.CfnWorkspace(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnWorkspaceProps::unwrap))
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * Contains information about the logging configuration for the workspace.
   */
  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * Contains information about the logging configuration for the workspace.
   */
  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains information about the logging configuration for the workspace.
   */
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  /**
   * Contains information about the logging configuration for the workspace.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db25d63fa46e0689793f9663994b31dfaa952181e3c28cb74551005428db0b28")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The list of tag keys and values that are associated with the workspace.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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
     * Contains information about the logging configuration for the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace. 
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * Contains information about the logging configuration for the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace. 
     */
    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    /**
     * Contains information about the logging configuration for the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c4a45ee9be8e4123c77e913c4dfa7afd640aac94bd113c210c15cd523e8489")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)

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
     * Contains information about the logging configuration for the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace. 
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Contains information about the logging configuration for the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace. 
     */
    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    /**
     * Contains information about the logging configuration for the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c4a45ee9be8e4123c77e913c4dfa7afd640aac94bd113c210c15cd523e8489")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    /**
     * The list of tag keys and values that are associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
     * @param tags The list of tag keys and values that are associated with the workspace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The list of tag keys and values that are associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
     * @param tags The list of tag keys and values that are associated with the workspace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
   * Contains information about the logging configuration for the workspace.
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
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
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
}
