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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A data transformation on a logical table.
 *
 * This is a variant type structure. For this structure to be valid, only one of the attributes can
 * be non-null.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TransformOperationProperty transformOperationProperty = TransformOperationProperty.builder()
 * .castColumnTypeOperation(CastColumnTypeOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnType("newColumnType")
 * // the properties below are optional
 * .format("format")
 * .build())
 * .createColumnsOperation(CreateColumnsOperationProperty.builder()
 * .columns(List.of(CalculatedColumnProperty.builder()
 * .columnId("columnId")
 * .columnName("columnName")
 * .expression("expression")
 * .build()))
 * .build())
 * .filterOperation(FilterOperationProperty.builder()
 * .conditionExpression("conditionExpression")
 * .build())
 * .overrideDatasetParameterOperation(OverrideDatasetParameterOperationProperty.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .newDefaultValues(NewDefaultValuesProperty.builder()
 * .dateTimeStaticValues(List.of("dateTimeStaticValues"))
 * .decimalStaticValues(List.of(123))
 * .integerStaticValues(List.of(123))
 * .stringStaticValues(List.of("stringStaticValues"))
 * .build())
 * .newParameterName("newParameterName")
 * .build())
 * .projectOperation(ProjectOperationProperty.builder()
 * .projectedColumns(List.of("projectedColumns"))
 * .build())
 * .renameColumnOperation(RenameColumnOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnName("newColumnName")
 * .build())
 * .tagColumnOperation(TagColumnOperationProperty.builder()
 * .columnName("columnName")
 * .tags(List.of(ColumnTagProperty.builder()
 * .columnDescription(ColumnDescriptionProperty.builder()
 * .text("text")
 * .build())
 * .columnGeographicRole("columnGeographicRole")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html)
 */
@CdkDslMarker
public class CfnDataSetTransformOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.TransformOperationProperty.Builder =
        CfnDataSet.TransformOperationProperty.builder()

    /**
     * @param castColumnTypeOperation A transform operation that casts a column to a different type.
     */
    public fun castColumnTypeOperation(castColumnTypeOperation: IResolvable) {
        cdkBuilder.castColumnTypeOperation(castColumnTypeOperation)
    }

    /**
     * @param castColumnTypeOperation A transform operation that casts a column to a different type.
     */
    public fun castColumnTypeOperation(
        castColumnTypeOperation: CfnDataSet.CastColumnTypeOperationProperty
    ) {
        cdkBuilder.castColumnTypeOperation(castColumnTypeOperation)
    }

    /**
     * @param createColumnsOperation An operation that creates calculated columns. Columns created
     *   in one such operation form a lexical closure.
     */
    public fun createColumnsOperation(createColumnsOperation: IResolvable) {
        cdkBuilder.createColumnsOperation(createColumnsOperation)
    }

    /**
     * @param createColumnsOperation An operation that creates calculated columns. Columns created
     *   in one such operation form a lexical closure.
     */
    public fun createColumnsOperation(
        createColumnsOperation: CfnDataSet.CreateColumnsOperationProperty
    ) {
        cdkBuilder.createColumnsOperation(createColumnsOperation)
    }

    /** @param filterOperation An operation that filters rows based on some condition. */
    public fun filterOperation(filterOperation: IResolvable) {
        cdkBuilder.filterOperation(filterOperation)
    }

    /** @param filterOperation An operation that filters rows based on some condition. */
    public fun filterOperation(filterOperation: CfnDataSet.FilterOperationProperty) {
        cdkBuilder.filterOperation(filterOperation)
    }

    /**
     * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
     *   parameter values defined in another dataset.</p>.
     */
    public fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: IResolvable) {
        cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation)
    }

    /**
     * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
     *   parameter values defined in another dataset.</p>.
     */
    public fun overrideDatasetParameterOperation(
        overrideDatasetParameterOperation: CfnDataSet.OverrideDatasetParameterOperationProperty
    ) {
        cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation)
    }

    /**
     * @param projectOperation An operation that projects columns. Operations that come after a
     *   projection can only refer to projected columns.
     */
    public fun projectOperation(projectOperation: IResolvable) {
        cdkBuilder.projectOperation(projectOperation)
    }

    /**
     * @param projectOperation An operation that projects columns. Operations that come after a
     *   projection can only refer to projected columns.
     */
    public fun projectOperation(projectOperation: CfnDataSet.ProjectOperationProperty) {
        cdkBuilder.projectOperation(projectOperation)
    }

    /** @param renameColumnOperation An operation that renames a column. */
    public fun renameColumnOperation(renameColumnOperation: IResolvable) {
        cdkBuilder.renameColumnOperation(renameColumnOperation)
    }

    /** @param renameColumnOperation An operation that renames a column. */
    public fun renameColumnOperation(
        renameColumnOperation: CfnDataSet.RenameColumnOperationProperty
    ) {
        cdkBuilder.renameColumnOperation(renameColumnOperation)
    }

    /** @param tagColumnOperation An operation that tags a column with additional information. */
    public fun tagColumnOperation(tagColumnOperation: IResolvable) {
        cdkBuilder.tagColumnOperation(tagColumnOperation)
    }

    /** @param tagColumnOperation An operation that tags a column with additional information. */
    public fun tagColumnOperation(tagColumnOperation: CfnDataSet.TagColumnOperationProperty) {
        cdkBuilder.tagColumnOperation(tagColumnOperation)
    }

    public fun build(): CfnDataSet.TransformOperationProperty = cdkBuilder.build()
}
