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
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import kotlin.String

@CdkDslMarker
public class CfnResourceDefinitionVersionLocalDeviceResourceDataPropertyDsl {
    private val cdkBuilder: CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.builder()

    public fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting)
    }

    public fun groupOwnerSetting(groupOwnerSetting: CfnResourceDefinitionVersion.GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting)
    }

    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty =
        cdkBuilder.build()
}
