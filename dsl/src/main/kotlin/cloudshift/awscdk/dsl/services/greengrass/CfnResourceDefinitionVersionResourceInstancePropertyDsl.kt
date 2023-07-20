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
public class CfnResourceDefinitionVersionResourceInstancePropertyDsl {
    private val cdkBuilder: CfnResourceDefinitionVersion.ResourceInstanceProperty.Builder =
        CfnResourceDefinitionVersion.ResourceInstanceProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun resourceDataContainer(resourceDataContainer: IResolvable) {
        cdkBuilder.resourceDataContainer(resourceDataContainer)
    }

    public fun resourceDataContainer(resourceDataContainer: CfnResourceDefinitionVersion.ResourceDataContainerProperty) {
        cdkBuilder.resourceDataContainer(resourceDataContainer)
    }

    public fun build(): CfnResourceDefinitionVersion.ResourceInstanceProperty = cdkBuilder.build()
}
