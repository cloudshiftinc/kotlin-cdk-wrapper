@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps

/**
 * Properties for defining a `CfnObservabilityConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
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
@CdkDslMarker
public class CfnObservabilityConfigurationPropsDsl {
    private val cdkBuilder: CfnObservabilityConfigurationProps.Builder =
        CfnObservabilityConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param observabilityConfigurationName A name for the observability configuration. When you
     *   use it for the first time in an AWS Region , App Runner creates revision number `1` of this
     *   name. When you use the same name in subsequent calls, App Runner creates incremental
     *   revisions of the configuration.
     *
     * The name `DefaultConfiguration` is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     *
     * When you want to use your own observability configuration for your App Runner service,
     * *create a configuration with a different name* , and then provide it when you create or
     * update your service.
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your observability
     * configuration.
     */
    public fun observabilityConfigurationName(observabilityConfigurationName: String) {
        cdkBuilder.observabilityConfigurationName(observabilityConfigurationName)
    }

    /**
     * @param tags A list of metadata items that you can associate with your observability
     *   configuration resource. A tag is a key-value pair.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of metadata items that you can associate with your observability
     *   configuration resource. A tag is a key-value pair.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     *   configuration. If you don't specify it, App Runner doesn't enable tracing.
     */
    public fun traceConfiguration(traceConfiguration: IResolvable) {
        cdkBuilder.traceConfiguration(traceConfiguration)
    }

    /**
     * @param traceConfiguration The configuration of the tracing feature within this observability
     *   configuration. If you don't specify it, App Runner doesn't enable tracing.
     */
    public fun traceConfiguration(
        traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty
    ) {
        cdkBuilder.traceConfiguration(traceConfiguration)
    }

    public fun build(): CfnObservabilityConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
