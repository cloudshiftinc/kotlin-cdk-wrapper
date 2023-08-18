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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

/**
 * The value is either a dynamic (resource) value or a static value.
 *
 * You must select either a dynamic value or a static value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * RemediationParameterValueProperty remediationParameterValueProperty =
 * RemediationParameterValueProperty.builder()
 * .resourceValue(ResourceValueProperty.builder()
 * .value("value")
 * .build())
 * .staticValue(StaticValueProperty.builder()
 * .value(List.of("value"))
 * .values(List.of("values"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html)
 */
@CdkDslMarker
public class CfnRemediationConfigurationRemediationParameterValuePropertyDsl {
    private val cdkBuilder: CfnRemediationConfiguration.RemediationParameterValueProperty.Builder =
        CfnRemediationConfiguration.RemediationParameterValueProperty.builder()

    /** @param resourceValue The value is dynamic and changes at run-time. */
    public fun resourceValue(resourceValue: IResolvable) {
        cdkBuilder.resourceValue(resourceValue)
    }

    /** @param resourceValue The value is dynamic and changes at run-time. */
    public fun resourceValue(resourceValue: CfnRemediationConfiguration.ResourceValueProperty) {
        cdkBuilder.resourceValue(resourceValue)
    }

    /** @param staticValue The value is static and does not change at run-time. */
    public fun staticValue(staticValue: IResolvable) {
        cdkBuilder.staticValue(staticValue)
    }

    /** @param staticValue The value is static and does not change at run-time. */
    public fun staticValue(staticValue: CfnRemediationConfiguration.StaticValueProperty) {
        cdkBuilder.staticValue(staticValue)
    }

    public fun build(): CfnRemediationConfiguration.RemediationParameterValueProperty =
        cdkBuilder.build()
}
