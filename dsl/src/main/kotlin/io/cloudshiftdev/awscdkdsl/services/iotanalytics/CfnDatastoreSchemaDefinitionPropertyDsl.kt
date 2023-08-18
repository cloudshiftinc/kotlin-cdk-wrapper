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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * Information needed to define a schema.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * SchemaDefinitionProperty schemaDefinitionProperty = SchemaDefinitionProperty.builder()
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-schemadefinition.html)
 */
@CdkDslMarker
public class CfnDatastoreSchemaDefinitionPropertyDsl {
    private val cdkBuilder: CfnDatastore.SchemaDefinitionProperty.Builder =
        CfnDatastore.SchemaDefinitionProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    /**
     * @param columns Specifies one or more columns that store your data. Each schema can have up to
     *   100 columns. Each column can have up to 100 nested types.
     */
    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    /**
     * @param columns Specifies one or more columns that store your data. Each schema can have up to
     *   100 columns. Each column can have up to 100 nested types.
     */
    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    /**
     * @param columns Specifies one or more columns that store your data. Each schema can have up to
     *   100 columns. Each column can have up to 100 nested types.
     */
    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    public fun build(): CfnDatastore.SchemaDefinitionProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        return cdkBuilder.build()
    }
}
