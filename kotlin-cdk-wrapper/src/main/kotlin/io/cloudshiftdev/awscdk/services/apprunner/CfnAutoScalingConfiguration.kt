@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specify an AWS App Runner Automatic Scaling configuration by using the
 * `AWS::AppRunner::AutoScalingConfiguration` resource in an AWS CloudFormation template.
 *
 * The `AWS::AppRunner::AutoScalingConfiguration` resource is an AWS App Runner resource type that
 * specifies an App Runner automatic scaling configuration.
 *
 * App Runner requires this resource to set non-default auto scaling settings for instances used to
 * process the web requests. You can share an auto scaling configuration across multiple services.
 *
 * Create multiple revisions of a configuration by calling this action multiple times using the same
 * `AutoScalingConfigurationName` . The call returns incremental `AutoScalingConfigurationRevision`
 * values. When you create a service and configure an auto scaling configuration resource, the service
 * uses the latest active revision of the auto scaling configuration by default. You can optionally
 * configure the service to use a specific revision.
 *
 * Configure a higher `MinSize` to increase the spread of your App Runner service over more
 * Availability Zones in the AWS Region . The tradeoff is a higher minimal cost.
 *
 * Configure a lower `MaxSize` to control your cost. The tradeoff is lower responsiveness during
 * peak demand.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apprunner.*;
 * CfnAutoScalingConfiguration cfnAutoScalingConfiguration =
 * CfnAutoScalingConfiguration.Builder.create(this, "MyCfnAutoScalingConfiguration")
 * .autoScalingConfigurationName("autoScalingConfigurationName")
 * .maxConcurrency(123)
 * .maxSize(123)
 * .minSize(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html)
 */
public open class CfnAutoScalingConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of this auto scaling configuration.
   */
  public open fun attrAutoScalingConfigurationArn(): String =
      unwrap(this).getAttrAutoScalingConfigurationArn()

  /**
   * The revision of this auto scaling configuration.
   *
   * It's unique among all the active configurations that share the same
   * `AutoScalingConfigurationName` .
   */
  public open fun attrAutoScalingConfigurationRevision(): Number =
      unwrap(this).getAttrAutoScalingConfigurationRevision()

  /**
   * It's set to true for the configuration with the highest `Revision` among all configurations
   * that share the same `AutoScalingConfigurationName` .
   *
   * It's set to false otherwise. App Runner temporarily doubles the number of provisioned instances
   * during deployments, to maintain the same capacity for both old and new code.
   */
  public open fun attrLatest(): IResolvable = unwrap(this).getAttrLatest().let(IResolvable::wrap)

  /**
   * The customer-provided auto scaling configuration name.
   */
  public open fun autoScalingConfigurationName(): String? =
      unwrap(this).getAutoScalingConfigurationName()

  /**
   * The customer-provided auto scaling configuration name.
   */
  public open fun autoScalingConfigurationName(`value`: String) {
    unwrap(this).setAutoScalingConfigurationName(`value`)
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum number of concurrent requests that an instance processes.
   */
  public open fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  /**
   * The maximum number of concurrent requests that an instance processes.
   */
  public open fun maxConcurrency(`value`: Number) {
    unwrap(this).setMaxConcurrency(`value`)
  }

  /**
   * The maximum number of instances that a service scales up to.
   */
  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The maximum number of instances that a service scales up to.
   */
  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

  /**
   * The minimum number of instances that App Runner provisions for a service.
   */
  public open fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * The minimum number of instances that App Runner provisions for a service.
   */
  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  /**
   * A list of metadata items that you can associate with your auto scaling configuration resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of metadata items that you can associate with your auto scaling configuration resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of metadata items that you can associate with your auto scaling configuration resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apprunner.CfnAutoScalingConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The customer-provided auto scaling configuration name.
     *
     * It can be used in multiple revisions of a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-autoscalingconfigurationname)
     * @param autoScalingConfigurationName The customer-provided auto scaling configuration name. 
     */
    public fun autoScalingConfigurationName(autoScalingConfigurationName: String)

    /**
     * The maximum number of concurrent requests that an instance processes.
     *
     * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxconcurrency)
     * @param maxConcurrency The maximum number of concurrent requests that an instance processes. 
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * The maximum number of instances that a service scales up to.
     *
     * At most `MaxSize` instances actively serve traffic for your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxsize)
     * @param maxSize The maximum number of instances that a service scales up to. 
     */
    public fun maxSize(maxSize: Number)

    /**
     * The minimum number of instances that App Runner provisions for a service.
     *
     * The service always has at least `MinSize` provisioned instances. Some of them actively serve
     * traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute
     * capacity reserve and are ready to be quickly activated. You pay for memory usage of all the
     * provisioned instances. You pay for CPU usage of only the active subset.
     *
     * App Runner temporarily doubles the number of provisioned instances during deployments, to
     * maintain the same capacity for both old and new code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-minsize)
     * @param minSize The minimum number of instances that App Runner provisions for a service. 
     */
    public fun minSize(minSize: Number)

    /**
     * A list of metadata items that you can associate with your auto scaling configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of metadata items that you can associate with your auto scaling configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration.Builder =
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration.Builder.create(scope,
        id)

    /**
     * The customer-provided auto scaling configuration name.
     *
     * It can be used in multiple revisions of a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-autoscalingconfigurationname)
     * @param autoScalingConfigurationName The customer-provided auto scaling configuration name. 
     */
    override fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
      cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
    }

    /**
     * The maximum number of concurrent requests that an instance processes.
     *
     * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxconcurrency)
     * @param maxConcurrency The maximum number of concurrent requests that an instance processes. 
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * The maximum number of instances that a service scales up to.
     *
     * At most `MaxSize` instances actively serve traffic for your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxsize)
     * @param maxSize The maximum number of instances that a service scales up to. 
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * The minimum number of instances that App Runner provisions for a service.
     *
     * The service always has at least `MinSize` provisioned instances. Some of them actively serve
     * traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute
     * capacity reserve and are ready to be quickly activated. You pay for memory usage of all the
     * provisioned instances. You pay for CPU usage of only the active subset.
     *
     * App Runner temporarily doubles the number of provisioned instances during deployments, to
     * maintain the same capacity for both old and new code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-minsize)
     * @param minSize The minimum number of instances that App Runner provisions for a service. 
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * A list of metadata items that you can associate with your auto scaling configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of metadata items that you can associate with your auto scaling configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAutoScalingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAutoScalingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration):
        CfnAutoScalingConfiguration = CfnAutoScalingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingConfiguration):
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration = wrapped.cdkObject
  }
}
