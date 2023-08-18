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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTable

/**
 * Information about a serialization/deserialization program (SerDe) that serves as an extractor and
 * loader.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * SerdeInfoProperty serdeInfoProperty = SerdeInfoProperty.builder()
 * .name("name")
 * .parameters(parameters)
 * .serializationLibrary("serializationLibrary")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html)
 */
@CdkDslMarker
public class CfnTableSerdeInfoPropertyDsl {
    private val cdkBuilder: CfnTable.SerdeInfoProperty.Builder =
        CfnTable.SerdeInfoProperty.builder()

    /** @param name Name of the SerDe. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param parameters These key-value pairs define initialization parameters for the SerDe. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters These key-value pairs define initialization parameters for the SerDe. */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param serializationLibrary Usually the class that implements the SerDe. An example is
     *   `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe` .
     */
    public fun serializationLibrary(serializationLibrary: String) {
        cdkBuilder.serializationLibrary(serializationLibrary)
    }

    public fun build(): CfnTable.SerdeInfoProperty = cdkBuilder.build()
}
