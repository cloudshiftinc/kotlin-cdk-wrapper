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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.CfnOptionGroup
import kotlin.String

@CdkDslMarker
public class CfnOptionGroupOptionSettingPropertyDsl {
    private val cdkBuilder: CfnOptionGroup.OptionSettingProperty.Builder =
        CfnOptionGroup.OptionSettingProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnOptionGroup.OptionSettingProperty = cdkBuilder.build()
}
