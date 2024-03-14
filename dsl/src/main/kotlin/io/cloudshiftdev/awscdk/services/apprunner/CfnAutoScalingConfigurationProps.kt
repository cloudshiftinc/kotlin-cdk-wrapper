package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAutoScalingConfigurationProps {
  /**
   * The customer-provided auto scaling configuration name.
   *
   * It can be used in multiple revisions of a configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-autoscalingconfigurationname)
   */
  public fun autoScalingConfigurationName(): String? =
      unwrap(this).getAutoScalingConfigurationName()

  /**
   * The maximum number of concurrent requests that an instance processes.
   *
   * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxconcurrency)
   */
  public fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  /**
   * The maximum number of instances that a service scales up to.
   *
   * At most `MaxSize` instances actively serve traffic for your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxsize)
   */
  public fun maxSize(): Number? = unwrap(this).getMaxSize()

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
   */
  public fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * A list of metadata items that you can associate with your auto scaling configuration resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAutoScalingConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingConfigurationName The customer-provided auto scaling configuration name.
     * It can be used in multiple revisions of a configuration.
     */
    public fun autoScalingConfigurationName(autoScalingConfigurationName: String)

    /**
     * @param maxConcurrency The maximum number of concurrent requests that an instance processes.
     * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * @param maxSize The maximum number of instances that a service scales up to.
     * At most `MaxSize` instances actively serve traffic for your service.
     */
    public fun maxSize(maxSize: Number)

    /**
     * @param minSize The minimum number of instances that App Runner provisions for a service.
     * The service always has at least `MinSize` provisioned instances. Some of them actively serve
     * traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute
     * capacity reserve and are ready to be quickly activated. You pay for memory usage of all the
     * provisioned instances. You pay for CPU usage of only the active subset.
     *
     * App Runner temporarily doubles the number of provisioned instances during deployments, to
     * maintain the same capacity for both old and new code.
     */
    public fun minSize(minSize: Number)

    /**
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps.builder()

    /**
     * @param autoScalingConfigurationName The customer-provided auto scaling configuration name.
     * It can be used in multiple revisions of a configuration.
     */
    override fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
      cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
    }

    /**
     * @param maxConcurrency The maximum number of concurrent requests that an instance processes.
     * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param maxSize The maximum number of instances that a service scales up to.
     * At most `MaxSize` instances actively serve traffic for your service.
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param minSize The minimum number of instances that App Runner provisions for a service.
     * The service always has at least `MinSize` provisioned instances. Some of them actively serve
     * traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute
     * capacity reserve and are ready to be quickly activated. You pay for memory usage of all the
     * provisioned instances. You pay for CPU usage of only the active subset.
     *
     * App Runner temporarily doubles the number of provisioned instances during deployments, to
     * maintain the same capacity for both old and new code.
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of metadata items that you can associate with your auto scaling
     * configuration resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps,
  ) : CdkObject(cdkObject), CfnAutoScalingConfigurationProps {
    /**
     * The customer-provided auto scaling configuration name.
     *
     * It can be used in multiple revisions of a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-autoscalingconfigurationname)
     */
    override fun autoScalingConfigurationName(): String? =
        unwrap(this).getAutoScalingConfigurationName()

    /**
     * The maximum number of concurrent requests that an instance processes.
     *
     * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxconcurrency)
     */
    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    /**
     * The maximum number of instances that a service scales up to.
     *
     * At most `MaxSize` instances actively serve traffic for your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxsize)
     */
    override fun maxSize(): Number? = unwrap(this).getMaxSize()

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
     */
    override fun minSize(): Number? = unwrap(this).getMinSize()

    /**
     * A list of metadata items that you can associate with your auto scaling configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps):
        CfnAutoScalingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingConfigurationProps):
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps
  }
}
