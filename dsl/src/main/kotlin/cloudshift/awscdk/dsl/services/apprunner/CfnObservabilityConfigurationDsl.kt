@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.constructs.Construct

/**
 * Specify an AWS App Runner observability configuration by using the
 * `AWS::AppRunner::ObservabilityConfiguration` resource in an AWS CloudFormation template.
 *
 * The `AWS::AppRunner::ObservabilityConfiguration` resource is an AWS App Runner resource type that
 * specifies an App Runner observability configuration.
 *
 * App Runner requires this resource when you specify App Runner services and you want to enable
 * non-default observability features. You can share an observability configuration across multiple
 * services.
 *
 * Create multiple revisions of a configuration by specifying this resource multiple times using the
 * same `ObservabilityConfigurationName` . App Runner creates multiple resources with incremental
 * `ObservabilityConfigurationRevision` values. When you specify a service and configure an
 * observability configuration resource, the service uses the latest active revision of the
 * observability configuration by default. You can optionally configure the service to use a specific
 * revision.
 *
 * The observability configuration resource is designed to configure multiple features (currently
 * one feature, tracing). This resource takes optional parameters that describe the configuration of
 * these features (currently one parameter, `TraceConfiguration` ). If you don't specify a feature
 * parameter, App Runner doesn't enable the feature.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CfnObservabilityConfiguration cfnObservabilityConfiguration =
 * CfnObservabilityConfiguration.Builder.create(this, "MyCfnObservabilityConfiguration")
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
@CdkDslMarker
public class CfnObservabilityConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnObservabilityConfiguration.Builder =
      CfnObservabilityConfiguration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
   * @param observabilityConfigurationName A name for the observability configuration. 
   */
  public fun observabilityConfigurationName(observabilityConfigurationName: String) {
    cdkBuilder.observabilityConfigurationName(observabilityConfigurationName)
  }

  /**
   * A list of metadata items that you can associate with your observability configuration resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
   * @param tags A list of metadata items that you can associate with your observability
   * configuration resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of metadata items that you can associate with your observability configuration resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
   * @param tags A list of metadata items that you can associate with your observability
   * configuration resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The configuration of the tracing feature within this observability configuration.
   *
   * If you don't specify it, App Runner doesn't enable tracing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
   * @param traceConfiguration The configuration of the tracing feature within this observability
   * configuration. 
   */
  public fun traceConfiguration(traceConfiguration: IResolvable) {
    cdkBuilder.traceConfiguration(traceConfiguration)
  }

  /**
   * The configuration of the tracing feature within this observability configuration.
   *
   * If you don't specify it, App Runner doesn't enable tracing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
   * @param traceConfiguration The configuration of the tracing feature within this observability
   * configuration. 
   */
  public
      fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty) {
    cdkBuilder.traceConfiguration(traceConfiguration)
  }

  public fun build(): CfnObservabilityConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
