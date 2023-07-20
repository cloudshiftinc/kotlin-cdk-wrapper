@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnObservabilityConfigurationPropsDsl {
    private val cdkBuilder: CfnObservabilityConfigurationProps.Builder =
        CfnObservabilityConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun observabilityConfigurationName(observabilityConfigurationName: String) {
        cdkBuilder.observabilityConfigurationName(observabilityConfigurationName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun traceConfiguration(traceConfiguration: IResolvable) {
        cdkBuilder.traceConfiguration(traceConfiguration)
    }

    public fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty) {
        cdkBuilder.traceConfiguration(traceConfiguration)
    }

    public fun build(): CfnObservabilityConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
