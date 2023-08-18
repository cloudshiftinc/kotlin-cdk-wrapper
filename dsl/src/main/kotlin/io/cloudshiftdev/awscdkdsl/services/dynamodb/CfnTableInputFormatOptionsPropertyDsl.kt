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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * The format options for the data that was imported into the target table.
 *
 * There is one value, CsvOption.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * InputFormatOptionsProperty inputFormatOptionsProperty = InputFormatOptionsProperty.builder()
 * .csv(CsvProperty.builder()
 * .delimiter("delimiter")
 * .headerList(List.of("headerList"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-inputformatoptions.html)
 */
@CdkDslMarker
public class CfnTableInputFormatOptionsPropertyDsl {
    private val cdkBuilder: CfnTable.InputFormatOptionsProperty.Builder =
        CfnTable.InputFormatOptionsProperty.builder()

    /**
     * @param csv The options for imported source files in CSV format. The values are Delimiter and
     *   HeaderList.
     */
    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    /**
     * @param csv The options for imported source files in CSV format. The values are Delimiter and
     *   HeaderList.
     */
    public fun csv(csv: CfnTable.CsvProperty) {
        cdkBuilder.csv(csv)
    }

    public fun build(): CfnTable.InputFormatOptionsProperty = cdkBuilder.build()
}
