@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an MLflow Tracking Server using a general purpose Amazon S3 bucket as the artifact store.
 *
 * For more information, see [Create an MLflow Tracking
 * Server](https://docs.aws.amazon.com/sagemaker/latest/dg/mlflow-create-tracking-server.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnMlflowTrackingServer cfnMlflowTrackingServer = CfnMlflowTrackingServer.Builder.create(this,
 * "MyCfnMlflowTrackingServer")
 * .artifactStoreUri("artifactStoreUri")
 * .roleArn("roleArn")
 * .trackingServerName("trackingServerName")
 * // the properties below are optional
 * .automaticModelRegistration(false)
 * .mlflowVersion("mlflowVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trackingServerSize("trackingServerSize")
 * .weeklyMaintenanceWindowStart("weeklyMaintenanceWindowStart")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html)
 */
public open class CfnMlflowTrackingServer(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMlflowTrackingServerProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMlflowTrackingServerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMlflowTrackingServerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMlflowTrackingServerProps(props)
  )

  /**
   * The Amazon S3 URI for MLFlow Tracking Server artifacts.
   */
  public open fun artifactStoreUri(): String = unwrap(this).getArtifactStoreUri()

  /**
   * The Amazon S3 URI for MLFlow Tracking Server artifacts.
   */
  public open fun artifactStoreUri(`value`: String) {
    unwrap(this).setArtifactStoreUri(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the MLFlow Tracking Server.
   */
  public open fun attrTrackingServerArn(): String = unwrap(this).getAttrTrackingServerArn()

  /**
   * A flag to enable Automatic SageMaker Model Registration.
   */
  public open fun automaticModelRegistration(): Any? = unwrap(this).getAutomaticModelRegistration()

  /**
   * A flag to enable Automatic SageMaker Model Registration.
   */
  public open fun automaticModelRegistration(`value`: Boolean) {
    unwrap(this).setAutomaticModelRegistration(`value`)
  }

  /**
   * A flag to enable Automatic SageMaker Model Registration.
   */
  public open fun automaticModelRegistration(`value`: IResolvable) {
    unwrap(this).setAutomaticModelRegistration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The MLFlow Version used on the MLFlow Tracking Server.
   */
  public open fun mlflowVersion(): String? = unwrap(this).getMlflowVersion()

  /**
   * The MLFlow Version used on the MLFlow Tracking Server.
   */
  public open fun mlflowVersion(`value`: String) {
    unwrap(this).setMlflowVersion(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on
   * behalf of the customer.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on
   * behalf of the customer.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the MLFlow Tracking Server.
   */
  public open fun trackingServerName(): String = unwrap(this).getTrackingServerName()

  /**
   * The name of the MLFlow Tracking Server.
   */
  public open fun trackingServerName(`value`: String) {
    unwrap(this).setTrackingServerName(`value`)
  }

  /**
   * The size of the MLFlow Tracking Server.
   */
  public open fun trackingServerSize(): String? = unwrap(this).getTrackingServerSize()

  /**
   * The size of the MLFlow Tracking Server.
   */
  public open fun trackingServerSize(`value`: String) {
    unwrap(this).setTrackingServerSize(`value`)
  }

  /**
   * The start of the time window for maintenance of the MLFlow Tracking Server in UTC time.
   */
  public open fun weeklyMaintenanceWindowStart(): String? =
      unwrap(this).getWeeklyMaintenanceWindowStart()

  /**
   * The start of the time window for maintenance of the MLFlow Tracking Server in UTC time.
   */
  public open fun weeklyMaintenanceWindowStart(`value`: String) {
    unwrap(this).setWeeklyMaintenanceWindowStart(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnMlflowTrackingServer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon S3 URI for MLFlow Tracking Server artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-artifactstoreuri)
     * @param artifactStoreUri The Amazon S3 URI for MLFlow Tracking Server artifacts. 
     */
    public fun artifactStoreUri(artifactStoreUri: String)

    /**
     * A flag to enable Automatic SageMaker Model Registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-automaticmodelregistration)
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration. 
     */
    public fun automaticModelRegistration(automaticModelRegistration: Boolean)

    /**
     * A flag to enable Automatic SageMaker Model Registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-automaticmodelregistration)
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration. 
     */
    public fun automaticModelRegistration(automaticModelRegistration: IResolvable)

    /**
     * The MLFlow Version used on the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-mlflowversion)
     * @param mlflowVersion The MLFlow Version used on the MLFlow Tracking Server. 
     */
    public fun mlflowVersion(mlflowVersion: String)

    /**
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks
     * on behalf of the customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to
     * perform tasks on behalf of the customer. 
     */
    public fun roleArn(roleArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingservername)
     * @param trackingServerName The name of the MLFlow Tracking Server. 
     */
    public fun trackingServerName(trackingServerName: String)

    /**
     * The size of the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingserversize)
     * @param trackingServerSize The size of the MLFlow Tracking Server. 
     */
    public fun trackingServerSize(trackingServerSize: String)

    /**
     * The start of the time window for maintenance of the MLFlow Tracking Server in UTC time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-weeklymaintenancewindowstart)
     * @param weeklyMaintenanceWindowStart The start of the time window for maintenance of the
     * MLFlow Tracking Server in UTC time. 
     */
    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer.Builder =
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer.Builder.create(scope, id)

    /**
     * The Amazon S3 URI for MLFlow Tracking Server artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-artifactstoreuri)
     * @param artifactStoreUri The Amazon S3 URI for MLFlow Tracking Server artifacts. 
     */
    override fun artifactStoreUri(artifactStoreUri: String) {
      cdkBuilder.artifactStoreUri(artifactStoreUri)
    }

    /**
     * A flag to enable Automatic SageMaker Model Registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-automaticmodelregistration)
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration. 
     */
    override fun automaticModelRegistration(automaticModelRegistration: Boolean) {
      cdkBuilder.automaticModelRegistration(automaticModelRegistration)
    }

    /**
     * A flag to enable Automatic SageMaker Model Registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-automaticmodelregistration)
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration. 
     */
    override fun automaticModelRegistration(automaticModelRegistration: IResolvable) {
      cdkBuilder.automaticModelRegistration(automaticModelRegistration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The MLFlow Version used on the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-mlflowversion)
     * @param mlflowVersion The MLFlow Version used on the MLFlow Tracking Server. 
     */
    override fun mlflowVersion(mlflowVersion: String) {
      cdkBuilder.mlflowVersion(mlflowVersion)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks
     * on behalf of the customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to
     * perform tasks on behalf of the customer. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingservername)
     * @param trackingServerName The name of the MLFlow Tracking Server. 
     */
    override fun trackingServerName(trackingServerName: String) {
      cdkBuilder.trackingServerName(trackingServerName)
    }

    /**
     * The size of the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingserversize)
     * @param trackingServerSize The size of the MLFlow Tracking Server. 
     */
    override fun trackingServerSize(trackingServerSize: String) {
      cdkBuilder.trackingServerSize(trackingServerSize)
    }

    /**
     * The start of the time window for maintenance of the MLFlow Tracking Server in UTC time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-weeklymaintenancewindowstart)
     * @param weeklyMaintenanceWindowStart The start of the time window for maintenance of the
     * MLFlow Tracking Server in UTC time. 
     */
    override fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
      cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMlflowTrackingServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMlflowTrackingServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer):
        CfnMlflowTrackingServer = CfnMlflowTrackingServer(cdkObject)

    internal fun unwrap(wrapped: CfnMlflowTrackingServer):
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer
  }
}
