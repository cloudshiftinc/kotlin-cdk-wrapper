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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Specifies the deserializer you want to use to convert the format of the input data.
 *
 * This parameter is required if `Enabled` is set to true.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * InputFormatConfigurationProperty inputFormatConfigurationProperty =
 * InputFormatConfigurationProperty.builder()
 * .deserializer(DeserializerProperty.builder()
 * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
 * .timestampFormats(List.of("timestampFormats"))
 * .build())
 * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
 * .caseInsensitive(false)
 * .columnToJsonKeyMappings(Map.of(
 * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
 * .convertDotsInJsonKeysToUnderscores(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamInputFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.InputFormatConfigurationProperty.Builder =
        CfnDeliveryStream.InputFormatConfigurationProperty.builder()

    /**
     * @param deserializer Specifies which deserializer to use. You can choose either the Apache
     *   Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null, the server rejects the
     *   request.
     */
    public fun deserializer(deserializer: IResolvable) {
        cdkBuilder.deserializer(deserializer)
    }

    /**
     * @param deserializer Specifies which deserializer to use. You can choose either the Apache
     *   Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null, the server rejects the
     *   request.
     */
    public fun deserializer(deserializer: CfnDeliveryStream.DeserializerProperty) {
        cdkBuilder.deserializer(deserializer)
    }

    public fun build(): CfnDeliveryStream.InputFormatConfigurationProperty = cdkBuilder.build()
}
