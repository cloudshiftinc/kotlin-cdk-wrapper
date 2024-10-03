@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMlflowTrackingServer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnMlflowTrackingServerProps cfnMlflowTrackingServerProps =
 * CfnMlflowTrackingServerProps.builder()
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
public interface CfnMlflowTrackingServerProps {
  /**
   * The Amazon S3 URI for MLFlow Tracking Server artifacts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-artifactstoreuri)
   */
  public fun artifactStoreUri(): String

  /**
   * A flag to enable Automatic SageMaker Model Registration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-automaticmodelregistration)
   */
  public fun automaticModelRegistration(): Any? = unwrap(this).getAutomaticModelRegistration()

  /**
   * The MLFlow Version used on the MLFlow Tracking Server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-mlflowversion)
   */
  public fun mlflowVersion(): String? = unwrap(this).getMlflowVersion()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on
   * behalf of the customer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-rolearn)
   */
  public fun roleArn(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the MLFlow Tracking Server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingservername)
   */
  public fun trackingServerName(): String

  /**
   * The size of the MLFlow Tracking Server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingserversize)
   */
  public fun trackingServerSize(): String? = unwrap(this).getTrackingServerSize()

  /**
   * The start of the time window for maintenance of the MLFlow Tracking Server in UTC time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-weeklymaintenancewindowstart)
   */
  public fun weeklyMaintenanceWindowStart(): String? =
      unwrap(this).getWeeklyMaintenanceWindowStart()

  /**
   * A builder for [CfnMlflowTrackingServerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifactStoreUri The Amazon S3 URI for MLFlow Tracking Server artifacts. 
     */
    public fun artifactStoreUri(artifactStoreUri: String)

    /**
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration.
     */
    public fun automaticModelRegistration(automaticModelRegistration: Boolean)

    /**
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration.
     */
    public fun automaticModelRegistration(automaticModelRegistration: IResolvable)

    /**
     * @param mlflowVersion The MLFlow Version used on the MLFlow Tracking Server.
     */
    public fun mlflowVersion(mlflowVersion: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to
     * perform tasks on behalf of the customer. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trackingServerName The name of the MLFlow Tracking Server. 
     */
    public fun trackingServerName(trackingServerName: String)

    /**
     * @param trackingServerSize The size of the MLFlow Tracking Server.
     */
    public fun trackingServerSize(trackingServerSize: String)

    /**
     * @param weeklyMaintenanceWindowStart The start of the time window for maintenance of the
     * MLFlow Tracking Server in UTC time.
     */
    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps.builder()

    /**
     * @param artifactStoreUri The Amazon S3 URI for MLFlow Tracking Server artifacts. 
     */
    override fun artifactStoreUri(artifactStoreUri: String) {
      cdkBuilder.artifactStoreUri(artifactStoreUri)
    }

    /**
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration.
     */
    override fun automaticModelRegistration(automaticModelRegistration: Boolean) {
      cdkBuilder.automaticModelRegistration(automaticModelRegistration)
    }

    /**
     * @param automaticModelRegistration A flag to enable Automatic SageMaker Model Registration.
     */
    override fun automaticModelRegistration(automaticModelRegistration: IResolvable) {
      cdkBuilder.automaticModelRegistration(automaticModelRegistration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mlflowVersion The MLFlow Version used on the MLFlow Tracking Server.
     */
    override fun mlflowVersion(mlflowVersion: String) {
      cdkBuilder.mlflowVersion(mlflowVersion)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to
     * perform tasks on behalf of the customer. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trackingServerName The name of the MLFlow Tracking Server. 
     */
    override fun trackingServerName(trackingServerName: String) {
      cdkBuilder.trackingServerName(trackingServerName)
    }

    /**
     * @param trackingServerSize The size of the MLFlow Tracking Server.
     */
    override fun trackingServerSize(trackingServerSize: String) {
      cdkBuilder.trackingServerSize(trackingServerSize)
    }

    /**
     * @param weeklyMaintenanceWindowStart The start of the time window for maintenance of the
     * MLFlow Tracking Server in UTC time.
     */
    override fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
      cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps,
  ) : CdkObject(cdkObject),
      CfnMlflowTrackingServerProps {
    /**
     * The Amazon S3 URI for MLFlow Tracking Server artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-artifactstoreuri)
     */
    override fun artifactStoreUri(): String = unwrap(this).getArtifactStoreUri()

    /**
     * A flag to enable Automatic SageMaker Model Registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-automaticmodelregistration)
     */
    override fun automaticModelRegistration(): Any? = unwrap(this).getAutomaticModelRegistration()

    /**
     * The MLFlow Version used on the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-mlflowversion)
     */
    override fun mlflowVersion(): String? = unwrap(this).getMlflowVersion()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks
     * on behalf of the customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingservername)
     */
    override fun trackingServerName(): String = unwrap(this).getTrackingServerName()

    /**
     * The size of the MLFlow Tracking Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-trackingserversize)
     */
    override fun trackingServerSize(): String? = unwrap(this).getTrackingServerSize()

    /**
     * The start of the time window for maintenance of the MLFlow Tracking Server in UTC time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-mlflowtrackingserver.html#cfn-sagemaker-mlflowtrackingserver-weeklymaintenancewindowstart)
     */
    override fun weeklyMaintenanceWindowStart(): String? =
        unwrap(this).getWeeklyMaintenanceWindowStart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMlflowTrackingServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps):
        CfnMlflowTrackingServerProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMlflowTrackingServerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMlflowTrackingServerProps):
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps
  }
}
