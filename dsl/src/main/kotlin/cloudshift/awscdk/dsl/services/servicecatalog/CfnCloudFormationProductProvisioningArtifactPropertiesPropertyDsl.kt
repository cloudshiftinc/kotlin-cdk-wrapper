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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnCloudFormationProductProvisioningArtifactPropertiesPropertyDsl {
    private val cdkBuilder: CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.Builder =
        CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun disableTemplateValidation(disableTemplateValidation: Boolean) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation)
    }

    public fun disableTemplateValidation(disableTemplateValidation: IResolvable) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation)
    }

    public fun info(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.info(builder.map)
    }

    public fun info(info: Any) {
        cdkBuilder.info(info)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty =
        cdkBuilder.build()
}
