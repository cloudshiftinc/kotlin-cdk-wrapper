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
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * Contains information about a column that stores your data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * ColumnProperty columnProperty = ColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-column.html)
 */
@CdkDslMarker
public class CfnDatastoreColumnPropertyDsl {
    private val cdkBuilder: CfnDatastore.ColumnProperty.Builder =
        CfnDatastore.ColumnProperty.builder()

    /** @param name The name of the column. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param type The type of data. For more information about the supported data types, see
     *   [Common data types](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html) in
     *   the *AWS Glue Developer Guide* .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDatastore.ColumnProperty = cdkBuilder.build()
}
