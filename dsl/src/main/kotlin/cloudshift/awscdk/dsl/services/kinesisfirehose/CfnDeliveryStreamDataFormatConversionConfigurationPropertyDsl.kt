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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.Boolean

@CdkDslMarker
public class CfnDeliveryStreamDataFormatConversionConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.DataFormatConversionConfigurationProperty.Builder =
        CfnDeliveryStream.DataFormatConversionConfigurationProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun inputFormatConfiguration(inputFormatConfiguration: IResolvable) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration)
    }

    public fun inputFormatConfiguration(inputFormatConfiguration: CfnDeliveryStream.InputFormatConfigurationProperty) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration)
    }

    public fun outputFormatConfiguration(outputFormatConfiguration: IResolvable) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration)
    }

    public fun outputFormatConfiguration(outputFormatConfiguration: CfnDeliveryStream.OutputFormatConfigurationProperty) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration)
    }

    public fun schemaConfiguration(schemaConfiguration: IResolvable) {
        cdkBuilder.schemaConfiguration(schemaConfiguration)
    }

    public fun schemaConfiguration(schemaConfiguration: CfnDeliveryStream.SchemaConfigurationProperty) {
        cdkBuilder.schemaConfiguration(schemaConfiguration)
    }

    public fun build(): CfnDeliveryStream.DataFormatConversionConfigurationProperty =
        cdkBuilder.build()
}
