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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * A pointer to the dataset that underlies this table.
 *
 * Currently, this can only be an AWS Glue table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * TableReferenceProperty tableReferenceProperty = TableReferenceProperty.builder()
 * .glue(GlueTableReferenceProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-tablereference.html)
 */
@CdkDslMarker
public class CfnConfiguredTableTableReferencePropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.TableReferenceProperty.Builder =
        CfnConfiguredTable.TableReferenceProperty.builder()

    /**
     * @param glue If present, a reference to the AWS Glue table referred to by this table
     *   reference.
     */
    public fun glue(glue: IResolvable) {
        cdkBuilder.glue(glue)
    }

    /**
     * @param glue If present, a reference to the AWS Glue table referred to by this table
     *   reference.
     */
    public fun glue(glue: CfnConfiguredTable.GlueTableReferenceProperty) {
        cdkBuilder.glue(glue)
    }

    public fun build(): CfnConfiguredTable.TableReferenceProperty = cdkBuilder.build()
}
