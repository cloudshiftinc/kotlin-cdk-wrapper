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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnPartition

/**
 * A column in a `Table` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * ColumnProperty columnProperty = ColumnProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html)
 */
@CdkDslMarker
public class CfnPartitionColumnPropertyDsl {
    private val cdkBuilder: CfnPartition.ColumnProperty.Builder =
        CfnPartition.ColumnProperty.builder()

    /** @param comment A free-form text comment. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param name The name of the `Column` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type The data type of the `Column` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPartition.ColumnProperty = cdkBuilder.build()
}
