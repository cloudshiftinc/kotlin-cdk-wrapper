@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * Creates an integration between CloudWatch Logs and another service in this account.
 *
 * Currently, only integrations with OpenSearch Service are supported, and currently you can have
 * only one integration in your account.
 *
 * Integrating with OpenSearch Service makes it possible for you to create curated vended logs
 * dashboards, powered by OpenSearch Service analytics. For more information, see [Vended log
 * dashboards powered by Amazon OpenSearch
 * Service](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatchLogs-OpenSearch-Dashboards.html)
 * .
 *
 * You can use this operation only to create a new integration. You can't modify an existing
 * integration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
 * .integrationName("integrationName")
 * .integrationType("integrationType")
 * .resourceConfig(ResourceConfigProperty.builder()
 * .openSearchResourceConfig(OpenSearchResourceConfigProperty.builder()
 * .dashboardViewerPrincipals(List.of("dashboardViewerPrincipals"))
 * .dataSourceRoleArn("dataSourceRoleArn")
 * // the properties below are optional
 * .applicationArn("applicationArn")
 * .kmsKeyArn("kmsKeyArn")
 * .retentionDays(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html)
 */
public open class CfnIntegration(
  cdkObject: software.amazon.awscdk.services.logs.CfnIntegration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntegrationProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnIntegration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIntegrationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntegrationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIntegrationProps(props)
  )

  /**
   * The current status of this integration.
   */
  public open fun attrIntegrationStatus(): String = unwrap(this).getAttrIntegrationStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of this integration.
   */
  public open fun integrationName(): String = unwrap(this).getIntegrationName()

  /**
   * The name of this integration.
   */
  public open fun integrationName(`value`: String) {
    unwrap(this).setIntegrationName(`value`)
  }

  /**
   * The type of integration.
   */
  public open fun integrationType(): String = unwrap(this).getIntegrationType()

  /**
   * The type of integration.
   */
  public open fun integrationType(`value`: String) {
    unwrap(this).setIntegrationType(`value`)
  }

  /**
   * This structure contains configuration details about an integration between CloudWatch Logs and
   * another entity.
   */
  public open fun resourceConfig(): Any = unwrap(this).getResourceConfig()

  /**
   * This structure contains configuration details about an integration between CloudWatch Logs and
   * another entity.
   */
  public open fun resourceConfig(`value`: IResolvable) {
    unwrap(this).setResourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This structure contains configuration details about an integration between CloudWatch Logs and
   * another entity.
   */
  public open fun resourceConfig(`value`: ResourceConfigProperty) {
    unwrap(this).setResourceConfig(`value`.let(ResourceConfigProperty.Companion::unwrap))
  }

  /**
   * This structure contains configuration details about an integration between CloudWatch Logs and
   * another entity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("389907bfde6259fdbf863c72da5254dfcc0f9f1ab389b272d5214f15a923a62b")
  public open fun resourceConfig(`value`: ResourceConfigProperty.Builder.() -> Unit): Unit =
      resourceConfig(ResourceConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of this integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationname)
     * @param integrationName The name of this integration. 
     */
    public fun integrationName(integrationName: String)

    /**
     * The type of integration.
     *
     * Integrations with OpenSearch Service have the type `OPENSEARCH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationtype)
     * @param integrationType The type of integration. 
     */
    public fun integrationType(integrationType: String)

    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and another entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    public fun resourceConfig(resourceConfig: IResolvable)

    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and another entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    public fun resourceConfig(resourceConfig: ResourceConfigProperty)

    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and another entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5f13e2a6395e97abe1bffd1df71688c8f8a1ae678be5aced335c4e836d8995f")
    public fun resourceConfig(resourceConfig: ResourceConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnIntegration.Builder =
        software.amazon.awscdk.services.logs.CfnIntegration.Builder.create(scope, id)

    /**
     * The name of this integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationname)
     * @param integrationName The name of this integration. 
     */
    override fun integrationName(integrationName: String) {
      cdkBuilder.integrationName(integrationName)
    }

    /**
     * The type of integration.
     *
     * Integrations with OpenSearch Service have the type `OPENSEARCH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationtype)
     * @param integrationType The type of integration. 
     */
    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and another entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    override fun resourceConfig(resourceConfig: IResolvable) {
      cdkBuilder.resourceConfig(resourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and another entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    override fun resourceConfig(resourceConfig: ResourceConfigProperty) {
      cdkBuilder.resourceConfig(resourceConfig.let(ResourceConfigProperty.Companion::unwrap))
    }

    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and another entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5f13e2a6395e97abe1bffd1df71688c8f8a1ae678be5aced335c4e836d8995f")
    override fun resourceConfig(resourceConfig: ResourceConfigProperty.Builder.() -> Unit): Unit =
        resourceConfig(ResourceConfigProperty(resourceConfig))

    public fun build(): software.amazon.awscdk.services.logs.CfnIntegration = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnIntegration):
        CfnIntegration = CfnIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnIntegration):
        software.amazon.awscdk.services.logs.CfnIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnIntegration
  }

  /**
   * This structure contains configuration details about an integration between CloudWatch Logs and
   * OpenSearch Service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * OpenSearchResourceConfigProperty openSearchResourceConfigProperty =
   * OpenSearchResourceConfigProperty.builder()
   * .dashboardViewerPrincipals(List.of("dashboardViewerPrincipals"))
   * .dataSourceRoleArn("dataSourceRoleArn")
   * // the properties below are optional
   * .applicationArn("applicationArn")
   * .kmsKeyArn("kmsKeyArn")
   * .retentionDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html)
   */
  public interface OpenSearchResourceConfigProperty {
    /**
     * If you want to use an existing OpenSearch Service application for your integration with
     * OpenSearch Service, specify it here.
     *
     * If you omit this, a new application will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-applicationarn)
     */
    public fun applicationArn(): String? = unwrap(this).getApplicationArn()

    /**
     * Specify the ARNs of IAM roles and IAM users who you want to grant permission to for viewing
     * the dashboards.
     *
     *
     * In addition to specifying these users here, you must also grant them the
     * *CloudWatchOpenSearchDashboardsAccess* IAM policy. For more information, see
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-dashboardviewerprincipals)
     */
    public fun dashboardViewerPrincipals(): List<String>

    /**
     * Specify the ARN of an IAM role that CloudWatch Logs will use to create the integration.
     *
     * This role must have the permissions necessary to access the OpenSearch Service collection to
     * be able to create the dashboards. For more information about the permissions needed, see [Create
     * an IAM role to access the OpenSearch Service
     * collection](https://docs.aws.amazon.com/OpenSearch-Dashboards-CreateRole) in the CloudWatch Logs
     * User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-datasourcerolearn)
     */
    public fun dataSourceRoleArn(): String

    /**
     * To have the vended dashboard data encrypted with AWS KMS instead of the CloudWatch Logs
     * default encryption method, specify the ARN of the AWS KMS key that you want to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * Specify how many days that you want the data derived by OpenSearch Service to be retained in
     * the index that the dashboard refers to.
     *
     * This also sets the maximum time period that you can choose when viewing data in the
     * dashboard. Choosing a longer time frame will incur additional costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-retentiondays)
     */
    public fun retentionDays(): Number? = unwrap(this).getRetentionDays()

    /**
     * A builder for [OpenSearchResourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationArn If you want to use an existing OpenSearch Service application for
       * your integration with OpenSearch Service, specify it here.
       * If you omit this, a new application will be created.
       */
      public fun applicationArn(applicationArn: String)

      /**
       * @param dashboardViewerPrincipals Specify the ARNs of IAM roles and IAM users who you want
       * to grant permission to for viewing the dashboards. 
       *
       * In addition to specifying these users here, you must also grant them the
       * *CloudWatchOpenSearchDashboardsAccess* IAM policy. For more information, see
       */
      public fun dashboardViewerPrincipals(dashboardViewerPrincipals: List<String>)

      /**
       * @param dashboardViewerPrincipals Specify the ARNs of IAM roles and IAM users who you want
       * to grant permission to for viewing the dashboards. 
       *
       * In addition to specifying these users here, you must also grant them the
       * *CloudWatchOpenSearchDashboardsAccess* IAM policy. For more information, see
       */
      public fun dashboardViewerPrincipals(vararg dashboardViewerPrincipals: String)

      /**
       * @param dataSourceRoleArn Specify the ARN of an IAM role that CloudWatch Logs will use to
       * create the integration. 
       * This role must have the permissions necessary to access the OpenSearch Service collection
       * to be able to create the dashboards. For more information about the permissions needed, see
       * [Create an IAM role to access the OpenSearch Service
       * collection](https://docs.aws.amazon.com/OpenSearch-Dashboards-CreateRole) in the CloudWatch
       * Logs User Guide.
       */
      public fun dataSourceRoleArn(dataSourceRoleArn: String)

      /**
       * @param kmsKeyArn To have the vended dashboard data encrypted with AWS KMS instead of the
       * CloudWatch Logs default encryption method, specify the ARN of the AWS KMS key that you want to
       * use.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param retentionDays Specify how many days that you want the data derived by OpenSearch
       * Service to be retained in the index that the dashboard refers to.
       * This also sets the maximum time period that you can choose when viewing data in the
       * dashboard. Choosing a longer time frame will incur additional costs.
       */
      public fun retentionDays(retentionDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnIntegration.OpenSearchResourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.logs.CfnIntegration.OpenSearchResourceConfigProperty.builder()

      /**
       * @param applicationArn If you want to use an existing OpenSearch Service application for
       * your integration with OpenSearch Service, specify it here.
       * If you omit this, a new application will be created.
       */
      override fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
      }

      /**
       * @param dashboardViewerPrincipals Specify the ARNs of IAM roles and IAM users who you want
       * to grant permission to for viewing the dashboards. 
       *
       * In addition to specifying these users here, you must also grant them the
       * *CloudWatchOpenSearchDashboardsAccess* IAM policy. For more information, see
       */
      override fun dashboardViewerPrincipals(dashboardViewerPrincipals: List<String>) {
        cdkBuilder.dashboardViewerPrincipals(dashboardViewerPrincipals)
      }

      /**
       * @param dashboardViewerPrincipals Specify the ARNs of IAM roles and IAM users who you want
       * to grant permission to for viewing the dashboards. 
       *
       * In addition to specifying these users here, you must also grant them the
       * *CloudWatchOpenSearchDashboardsAccess* IAM policy. For more information, see
       */
      override fun dashboardViewerPrincipals(vararg dashboardViewerPrincipals: String): Unit =
          dashboardViewerPrincipals(dashboardViewerPrincipals.toList())

      /**
       * @param dataSourceRoleArn Specify the ARN of an IAM role that CloudWatch Logs will use to
       * create the integration. 
       * This role must have the permissions necessary to access the OpenSearch Service collection
       * to be able to create the dashboards. For more information about the permissions needed, see
       * [Create an IAM role to access the OpenSearch Service
       * collection](https://docs.aws.amazon.com/OpenSearch-Dashboards-CreateRole) in the CloudWatch
       * Logs User Guide.
       */
      override fun dataSourceRoleArn(dataSourceRoleArn: String) {
        cdkBuilder.dataSourceRoleArn(dataSourceRoleArn)
      }

      /**
       * @param kmsKeyArn To have the vended dashboard data encrypted with AWS KMS instead of the
       * CloudWatch Logs default encryption method, specify the ARN of the AWS KMS key that you want to
       * use.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param retentionDays Specify how many days that you want the data derived by OpenSearch
       * Service to be retained in the index that the dashboard refers to.
       * This also sets the maximum time period that you can choose when viewing data in the
       * dashboard. Choosing a longer time frame will incur additional costs.
       */
      override fun retentionDays(retentionDays: Number) {
        cdkBuilder.retentionDays(retentionDays)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnIntegration.OpenSearchResourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnIntegration.OpenSearchResourceConfigProperty,
    ) : CdkObject(cdkObject),
        OpenSearchResourceConfigProperty {
      /**
       * If you want to use an existing OpenSearch Service application for your integration with
       * OpenSearch Service, specify it here.
       *
       * If you omit this, a new application will be created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-applicationarn)
       */
      override fun applicationArn(): String? = unwrap(this).getApplicationArn()

      /**
       * Specify the ARNs of IAM roles and IAM users who you want to grant permission to for viewing
       * the dashboards.
       *
       *
       * In addition to specifying these users here, you must also grant them the
       * *CloudWatchOpenSearchDashboardsAccess* IAM policy. For more information, see
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-dashboardviewerprincipals)
       */
      override fun dashboardViewerPrincipals(): List<String> =
          unwrap(this).getDashboardViewerPrincipals()

      /**
       * Specify the ARN of an IAM role that CloudWatch Logs will use to create the integration.
       *
       * This role must have the permissions necessary to access the OpenSearch Service collection
       * to be able to create the dashboards. For more information about the permissions needed, see
       * [Create an IAM role to access the OpenSearch Service
       * collection](https://docs.aws.amazon.com/OpenSearch-Dashboards-CreateRole) in the CloudWatch
       * Logs User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-datasourcerolearn)
       */
      override fun dataSourceRoleArn(): String = unwrap(this).getDataSourceRoleArn()

      /**
       * To have the vended dashboard data encrypted with AWS KMS instead of the CloudWatch Logs
       * default encryption method, specify the ARN of the AWS KMS key that you want to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * Specify how many days that you want the data derived by OpenSearch Service to be retained
       * in the index that the dashboard refers to.
       *
       * This also sets the maximum time period that you can choose when viewing data in the
       * dashboard. Choosing a longer time frame will incur additional costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-opensearchresourceconfig.html#cfn-logs-integration-opensearchresourceconfig-retentiondays)
       */
      override fun retentionDays(): Number? = unwrap(this).getRetentionDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenSearchResourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnIntegration.OpenSearchResourceConfigProperty):
          OpenSearchResourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenSearchResourceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchResourceConfigProperty):
          software.amazon.awscdk.services.logs.CfnIntegration.OpenSearchResourceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnIntegration.OpenSearchResourceConfigProperty
    }
  }

  /**
   * This structure contains configuration details about an integration between CloudWatch Logs and
   * another entity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ResourceConfigProperty resourceConfigProperty = ResourceConfigProperty.builder()
   * .openSearchResourceConfig(OpenSearchResourceConfigProperty.builder()
   * .dashboardViewerPrincipals(List.of("dashboardViewerPrincipals"))
   * .dataSourceRoleArn("dataSourceRoleArn")
   * // the properties below are optional
   * .applicationArn("applicationArn")
   * .kmsKeyArn("kmsKeyArn")
   * .retentionDays(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-resourceconfig.html)
   */
  public interface ResourceConfigProperty {
    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and OpenSearch Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-resourceconfig.html#cfn-logs-integration-resourceconfig-opensearchresourceconfig)
     */
    public fun openSearchResourceConfig(): Any? = unwrap(this).getOpenSearchResourceConfig()

    /**
     * A builder for [ResourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param openSearchResourceConfig This structure contains configuration details about an
       * integration between CloudWatch Logs and OpenSearch Service.
       */
      public fun openSearchResourceConfig(openSearchResourceConfig: IResolvable)

      /**
       * @param openSearchResourceConfig This structure contains configuration details about an
       * integration between CloudWatch Logs and OpenSearch Service.
       */
      public
          fun openSearchResourceConfig(openSearchResourceConfig: OpenSearchResourceConfigProperty)

      /**
       * @param openSearchResourceConfig This structure contains configuration details about an
       * integration between CloudWatch Logs and OpenSearch Service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe53d85b0721251343f9ffde9ae1df2ee514b811a71d83efe88ba9d91d31b0b9")
      public
          fun openSearchResourceConfig(openSearchResourceConfig: OpenSearchResourceConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnIntegration.ResourceConfigProperty.Builder =
          software.amazon.awscdk.services.logs.CfnIntegration.ResourceConfigProperty.builder()

      /**
       * @param openSearchResourceConfig This structure contains configuration details about an
       * integration between CloudWatch Logs and OpenSearch Service.
       */
      override fun openSearchResourceConfig(openSearchResourceConfig: IResolvable) {
        cdkBuilder.openSearchResourceConfig(openSearchResourceConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param openSearchResourceConfig This structure contains configuration details about an
       * integration between CloudWatch Logs and OpenSearch Service.
       */
      override
          fun openSearchResourceConfig(openSearchResourceConfig: OpenSearchResourceConfigProperty) {
        cdkBuilder.openSearchResourceConfig(openSearchResourceConfig.let(OpenSearchResourceConfigProperty.Companion::unwrap))
      }

      /**
       * @param openSearchResourceConfig This structure contains configuration details about an
       * integration between CloudWatch Logs and OpenSearch Service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe53d85b0721251343f9ffde9ae1df2ee514b811a71d83efe88ba9d91d31b0b9")
      override
          fun openSearchResourceConfig(openSearchResourceConfig: OpenSearchResourceConfigProperty.Builder.() -> Unit):
          Unit =
          openSearchResourceConfig(OpenSearchResourceConfigProperty(openSearchResourceConfig))

      public fun build(): software.amazon.awscdk.services.logs.CfnIntegration.ResourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnIntegration.ResourceConfigProperty,
    ) : CdkObject(cdkObject),
        ResourceConfigProperty {
      /**
       * This structure contains configuration details about an integration between CloudWatch Logs
       * and OpenSearch Service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-integration-resourceconfig.html#cfn-logs-integration-resourceconfig-opensearchresourceconfig)
       */
      override fun openSearchResourceConfig(): Any? = unwrap(this).getOpenSearchResourceConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnIntegration.ResourceConfigProperty):
          ResourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceConfigProperty):
          software.amazon.awscdk.services.logs.CfnIntegration.ResourceConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnIntegration.ResourceConfigProperty
    }
  }
}
