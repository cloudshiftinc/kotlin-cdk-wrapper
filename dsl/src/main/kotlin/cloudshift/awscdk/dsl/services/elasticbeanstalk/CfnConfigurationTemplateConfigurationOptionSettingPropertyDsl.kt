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

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import kotlin.String

@CdkDslMarker
public class CfnConfigurationTemplateConfigurationOptionSettingPropertyDsl {
    private val cdkBuilder: CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder =
        CfnConfigurationTemplate.ConfigurationOptionSettingProperty.builder()

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
    }

    public fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnConfigurationTemplate.ConfigurationOptionSettingProperty =
        cdkBuilder.build()
}
