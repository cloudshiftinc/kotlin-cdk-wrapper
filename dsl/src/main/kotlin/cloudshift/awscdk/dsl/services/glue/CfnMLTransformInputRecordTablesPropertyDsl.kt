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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform

/**
 * A list of AWS Glue table definitions used by the transform.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * InputRecordTablesProperty inputRecordTablesProperty = InputRecordTablesProperty.builder()
 * .glueTables(List.of(GlueTablesProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * // the properties below are optional
 * .catalogId("catalogId")
 * .connectionName("connectionName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html)
 */
@CdkDslMarker
public class CfnMLTransformInputRecordTablesPropertyDsl {
    private val cdkBuilder: CfnMLTransform.InputRecordTablesProperty.Builder =
        CfnMLTransform.InputRecordTablesProperty.builder()

    private val _glueTables: MutableList<Any> = mutableListOf()

    /**
     * @param glueTables The database and table in the AWS Glue Data Catalog that is used for input
     *   or output data.
     */
    public fun glueTables(vararg glueTables: Any) {
        _glueTables.addAll(listOf(*glueTables))
    }

    /**
     * @param glueTables The database and table in the AWS Glue Data Catalog that is used for input
     *   or output data.
     */
    public fun glueTables(glueTables: Collection<Any>) {
        _glueTables.addAll(glueTables)
    }

    /**
     * @param glueTables The database and table in the AWS Glue Data Catalog that is used for input
     *   or output data.
     */
    public fun glueTables(glueTables: IResolvable) {
        cdkBuilder.glueTables(glueTables)
    }

    public fun build(): CfnMLTransform.InputRecordTablesProperty {
        if (_glueTables.isNotEmpty()) cdkBuilder.glueTables(_glueTables)
        return cdkBuilder.build()
    }
}
