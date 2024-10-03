@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aps.*;
 * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
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
public interface CfnWorkspaceProps {
  /**
   * The alert manager definition, a YAML configuration for the alert manager in your Amazon Managed
   * Service for Prometheus workspace.
   *
   * For details about the alert manager definition, see [Creating an alert manager configuration
   * files](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alertmanager-config.html) in
   * the *Amazon Managed Service for Prometheus User Guide* .
   *
   * The following example shows part of a CloudFormation YAML file with an embedded alert manager
   * definition (following the `- |-` ).
   *
   * `Workspace: Type: AWS::APS::Workspace .... Properties: .... AlertManagerDefinition: Fn::Sub: -
   * |- alertmanager_config: | templates: - 'default_template' route: receiver: example-sns
   * receivers: - name: example-sns sns_configs: - topic_arn:
   * 'arn:aws:sns:${AWS::Region}:${AWS::AccountId}:${TopicName}' -`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alertmanagerdefinition)
   */
  public fun alertManagerDefinition(): String? = unwrap(this).getAlertManagerDefinition()

  /**
   * The alias that is assigned to this workspace to help identify it.
   *
   * It does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alias)
   */
  public fun alias(): String? = unwrap(this).getAlias()

  /**
   * (optional) The ARN for a customer managed AWS KMS key to use for encrypting data within your
   * workspace.
   *
   * For more information about using your own key in your workspace, see [Encryption at
   * rest](https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html)
   * in the *Amazon Managed Service for Prometheus User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * Contains information about the logging configuration for the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
   */
  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * The list of tag keys and values that are associated with the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnWorkspaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alertManagerDefinition The alert manager definition, a YAML configuration for the
     * alert manager in your Amazon Managed Service for Prometheus workspace.
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
     */
    public fun alertManagerDefinition(alertManagerDefinition: String)

    /**
     * @param alias The alias that is assigned to this workspace to help identify it.
     * It does not need to be unique.
     */
    public fun alias(alias: String)

    /**
     * @param kmsKeyArn (optional) The ARN for a customer managed AWS KMS key to use for encrypting
     * data within your workspace.
     * For more information about using your own key in your workspace, see [Encryption at
     * rest](https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html)
     * in the *Amazon Managed Service for Prometheus User Guide* .
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace.
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace.
     */
    public fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty)

    /**
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caa210e050853db0e7c94114d24a2c4ceb4d610e1ca6a3bdb14f252fb7616089")
    public
        fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags The list of tag keys and values that are associated with the workspace.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of tag keys and values that are associated with the workspace.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.aps.CfnWorkspaceProps.builder()

    /**
     * @param alertManagerDefinition The alert manager definition, a YAML configuration for the
     * alert manager in your Amazon Managed Service for Prometheus workspace.
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
     */
    override fun alertManagerDefinition(alertManagerDefinition: String) {
      cdkBuilder.alertManagerDefinition(alertManagerDefinition)
    }

    /**
     * @param alias The alias that is assigned to this workspace to help identify it.
     * It does not need to be unique.
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * @param kmsKeyArn (optional) The ARN for a customer managed AWS KMS key to use for encrypting
     * data within your workspace.
     * For more information about using your own key in your workspace, see [Encryption at
     * rest](https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html)
     * in the *Amazon Managed Service for Prometheus User Guide* .
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace.
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace.
     */
    override
        fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnWorkspace.LoggingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param loggingConfiguration Contains information about the logging configuration for the
     * workspace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caa210e050853db0e7c94114d24a2c4ceb4d610e1ca6a3bdb14f252fb7616089")
    override
        fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(CfnWorkspace.LoggingConfigurationProperty(loggingConfiguration))

    /**
     * @param tags The list of tag keys and values that are associated with the workspace.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of tag keys and values that are associated with the workspace.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.aps.CfnWorkspaceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.aps.CfnWorkspaceProps,
  ) : CdkObject(cdkObject),
      CfnWorkspaceProps {
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
     */
    override fun alertManagerDefinition(): String? = unwrap(this).getAlertManagerDefinition()

    /**
     * The alias that is assigned to this workspace to help identify it.
     *
     * It does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alias)
     */
    override fun alias(): String? = unwrap(this).getAlias()

    /**
     * (optional) The ARN for a customer managed AWS KMS key to use for encrypting data within your
     * workspace.
     *
     * For more information about using your own key in your workspace, see [Encryption at
     * rest](https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html)
     * in the *Amazon Managed Service for Prometheus User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * Contains information about the logging configuration for the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
     */
    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    /**
     * The list of tag keys and values that are associated with the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspaceProps):
        CfnWorkspaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkspaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.aps.CfnWorkspaceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.aps.CfnWorkspaceProps
  }
}
