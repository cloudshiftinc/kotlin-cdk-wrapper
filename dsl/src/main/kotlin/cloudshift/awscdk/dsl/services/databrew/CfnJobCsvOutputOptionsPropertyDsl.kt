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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Represents a set of options that define how DataBrew will write a comma-separated value (CSV)
 * file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CsvOutputOptionsProperty csvOutputOptionsProperty = CsvOutputOptionsProperty.builder()
 * .delimiter("delimiter")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-csvoutputoptions.html)
 */
@CdkDslMarker
public class CfnJobCsvOutputOptionsPropertyDsl {
    private val cdkBuilder: CfnJob.CsvOutputOptionsProperty.Builder =
        CfnJob.CsvOutputOptionsProperty.builder()

    /**
     * @param delimiter A single character that specifies the delimiter used to create CSV job
     *   output.
     */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun build(): CfnJob.CsvOutputOptionsProperty = cdkBuilder.build()
}
