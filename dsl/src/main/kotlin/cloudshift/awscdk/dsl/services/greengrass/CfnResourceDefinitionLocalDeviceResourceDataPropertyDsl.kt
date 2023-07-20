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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import kotlin.String

@CdkDslMarker
public class CfnResourceDefinitionLocalDeviceResourceDataPropertyDsl {
    private val cdkBuilder: CfnResourceDefinition.LocalDeviceResourceDataProperty.Builder =
        CfnResourceDefinition.LocalDeviceResourceDataProperty.builder()

    public fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting)
    }

    public fun groupOwnerSetting(groupOwnerSetting: CfnResourceDefinition.GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting)
    }

    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): CfnResourceDefinition.LocalDeviceResourceDataProperty = cdkBuilder.build()
}
