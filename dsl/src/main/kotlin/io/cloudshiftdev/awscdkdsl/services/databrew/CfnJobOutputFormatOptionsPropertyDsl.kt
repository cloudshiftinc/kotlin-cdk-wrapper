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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Represents a set of options that define the structure of comma-separated (CSV) job output.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * OutputFormatOptionsProperty outputFormatOptionsProperty = OutputFormatOptionsProperty.builder()
 * .csv(CsvOutputOptionsProperty.builder()
 * .delimiter("delimiter")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputformatoptions.html)
 */
@CdkDslMarker
public class CfnJobOutputFormatOptionsPropertyDsl {
    private val cdkBuilder: CfnJob.OutputFormatOptionsProperty.Builder =
        CfnJob.OutputFormatOptionsProperty.builder()

    /**
     * @param csv Represents a set of options that define the structure of comma-separated value
     *   (CSV) job output.
     */
    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    /**
     * @param csv Represents a set of options that define the structure of comma-separated value
     *   (CSV) job output.
     */
    public fun csv(csv: CfnJob.CsvOutputOptionsProperty) {
        cdkBuilder.csv(csv)
    }

    public fun build(): CfnJob.OutputFormatOptionsProperty = cdkBuilder.build()
}
