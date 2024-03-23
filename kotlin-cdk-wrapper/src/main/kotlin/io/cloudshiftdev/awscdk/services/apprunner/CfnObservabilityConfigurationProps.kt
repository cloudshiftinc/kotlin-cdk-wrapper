@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

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
 * Properties for defining a `CfnObservabilityConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apprunner.*;
 * CfnObservabilityConfigurationProps cfnObservabilityConfigurationProps =
 * CfnObservabilityConfigurationProps.builder()
 * .observabilityConfigurationName("observabilityConfigurationName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .traceConfiguration(TraceConfigurationProperty.builder()
 * .vendor("vendor")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html)
 */
public interface CfnObservabilityConfigurationProps {
  /**
   * A name for the observability configuration.
   *
   * When you use it for the first time in an AWS Region , App Runner creates revision number `1` of
   * this name. When you use the same name in subsequent calls, App Runner creates incremental
   * revisions of the configuration.
   *
   *
   * The name `DefaultConfiguration` is reserved. You can't use it to create a new observability
   * configuration, and you can't create a revision of it.
   *
   * When you want to use your own observability configuration for your App Runner service, *create
   * a configuration with a different name* , and then provide it when you create or update your
   * service.
   *
   *
   * If you don't specify a name, AWS CloudFormation generates a name for your observability
   * configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-observabilityconfigurationname)
   */
  public fun observabilityConfigurationName(): String? =
      unwrap(this).getObservabilityConfigurationName()

  /**
   * A list of metadata items that you can associate with your observability configuration resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The configuration of the tracing feature within this observability configuration.
   *
   * If you don't specify it, App Runner doesn't enable tracing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
   */
  public fun traceConfiguration(): Any? = unwrap(this).getTraceConfiguration()

  /**
   * A builder for [CfnObservabilityConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param observabilityConfigurationName A name for the observability configuration.
     * When you use it for the first time in an AWS Region , App Runner creates revision number `1`
     * of this name. When you use the same name in subsequent calls, App Runner creates incremental
     * revisions of the configuration.
     *
     *
     * The name `DefaultConfiguration` is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     *
     * When you want to use your own observability configuration for your App Runner service,
     * *create a configuration with a different name* , and then provide it when you create or update
     * your service.
     *
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your observability
     * configuration.
     */
    public fun observabilityConfigurationName(observabilityConfigurationName: String)

    /**
     * @param tags A list of metadata items that you can associate with your observability
     * configuration resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of metadata items that you can associate with your observability
     * configuration resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     * configuration.
     * If you don't specify it, App Runner doesn't enable tracing.
     */
    public fun traceConfiguration(traceConfiguration: IResolvable)

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     * configuration.
     * If you don't specify it, App Runner doesn't enable tracing.
     */
    public
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty)

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     * configuration.
     * If you don't specify it, App Runner doesn't enable tracing.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1326ccafceef15c293c4341cc9ac410c2a6b5b8a63fb448a114a49671fef0141")
    public
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps.builder()

    /**
     * @param observabilityConfigurationName A name for the observability configuration.
     * When you use it for the first time in an AWS Region , App Runner creates revision number `1`
     * of this name. When you use the same name in subsequent calls, App Runner creates incremental
     * revisions of the configuration.
     *
     *
     * The name `DefaultConfiguration` is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     *
     * When you want to use your own observability configuration for your App Runner service,
     * *create a configuration with a different name* , and then provide it when you create or update
     * your service.
     *
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your observability
     * configuration.
     */
    override fun observabilityConfigurationName(observabilityConfigurationName: String) {
      cdkBuilder.observabilityConfigurationName(observabilityConfigurationName)
    }

    /**
     * @param tags A list of metadata items that you can associate with your observability
     * configuration resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of metadata items that you can associate with your observability
     * configuration resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     * configuration.
     * If you don't specify it, App Runner doesn't enable tracing.
     */
    override fun traceConfiguration(traceConfiguration: IResolvable) {
      cdkBuilder.traceConfiguration(traceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     * configuration.
     * If you don't specify it, App Runner doesn't enable tracing.
     */
    override
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty) {
      cdkBuilder.traceConfiguration(traceConfiguration.let(CfnObservabilityConfiguration.TraceConfigurationProperty::unwrap))
    }

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     * configuration.
     * If you don't specify it, App Runner doesn't enable tracing.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1326ccafceef15c293c4341cc9ac410c2a6b5b8a63fb448a114a49671fef0141")
    override
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder.() -> Unit):
        Unit =
        traceConfiguration(CfnObservabilityConfiguration.TraceConfigurationProperty(traceConfiguration))

    public fun build(): software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps,
  ) : CdkObject(cdkObject), CfnObservabilityConfigurationProps {
    /**
     * A name for the observability configuration.
     *
     * When you use it for the first time in an AWS Region , App Runner creates revision number `1`
     * of this name. When you use the same name in subsequent calls, App Runner creates incremental
     * revisions of the configuration.
     *
     *
     * The name `DefaultConfiguration` is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     *
     * When you want to use your own observability configuration for your App Runner service,
     * *create a configuration with a different name* , and then provide it when you create or update
     * your service.
     *
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your observability
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-observabilityconfigurationname)
     */
    override fun observabilityConfigurationName(): String? =
        unwrap(this).getObservabilityConfigurationName()

    /**
     * A list of metadata items that you can associate with your observability configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The configuration of the tracing feature within this observability configuration.
     *
     * If you don't specify it, App Runner doesn't enable tracing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
     */
    override fun traceConfiguration(): Any? = unwrap(this).getTraceConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnObservabilityConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps):
        CfnObservabilityConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnObservabilityConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnObservabilityConfigurationProps):
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
  }
}
