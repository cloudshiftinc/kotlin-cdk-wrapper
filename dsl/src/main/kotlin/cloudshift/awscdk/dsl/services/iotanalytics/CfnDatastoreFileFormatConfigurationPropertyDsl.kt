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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * Contains the configuration information of file formats. AWS IoT Analytics data stores support
 * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
 *
 * The default file format is JSON. You can specify only one format.
 *
 * You can't change the file format after you create the data store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * Object jsonConfiguration;
 * FileFormatConfigurationProperty fileFormatConfigurationProperty =
 * FileFormatConfigurationProperty.builder()
 * .jsonConfiguration(jsonConfiguration)
 * .parquetConfiguration(ParquetConfigurationProperty.builder()
 * .schemaDefinition(SchemaDefinitionProperty.builder()
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-fileformatconfiguration.html)
 */
@CdkDslMarker
public class CfnDatastoreFileFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDatastore.FileFormatConfigurationProperty.Builder =
        CfnDatastore.FileFormatConfigurationProperty.builder()

    /** @param jsonConfiguration Contains the configuration information of the JSON format. */
    public fun jsonConfiguration(jsonConfiguration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(jsonConfiguration)
        cdkBuilder.jsonConfiguration(builder.map)
    }

    /** @param jsonConfiguration Contains the configuration information of the JSON format. */
    public fun jsonConfiguration(jsonConfiguration: Any) {
        cdkBuilder.jsonConfiguration(jsonConfiguration)
    }

    /** @param parquetConfiguration Contains the configuration information of the Parquet format. */
    public fun parquetConfiguration(parquetConfiguration: IResolvable) {
        cdkBuilder.parquetConfiguration(parquetConfiguration)
    }

    /** @param parquetConfiguration Contains the configuration information of the Parquet format. */
    public fun parquetConfiguration(
        parquetConfiguration: CfnDatastore.ParquetConfigurationProperty
    ) {
        cdkBuilder.parquetConfiguration(parquetConfiguration)
    }

    public fun build(): CfnDatastore.FileFormatConfigurationProperty = cdkBuilder.build()
}
