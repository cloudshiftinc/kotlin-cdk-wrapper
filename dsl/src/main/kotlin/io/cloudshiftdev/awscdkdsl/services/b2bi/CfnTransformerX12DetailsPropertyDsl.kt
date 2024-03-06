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

package io.cloudshiftdev.awscdkdsl.services.b2bi

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.b2bi.CfnTransformer

/**
 * A structure that contains the X12 transaction set and version.
 *
 * The X12 structure is used when the system transforms an EDI (electronic data interchange) file.
 *
 * If an EDI input file contains more than one transaction, each transaction must have the same
 * transaction set and version, for example 214/4010. If not, the transformer cannot parse the file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * X12DetailsProperty x12DetailsProperty = X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12details.html)
 */
@CdkDslMarker
public class CfnTransformerX12DetailsPropertyDsl {
    private val cdkBuilder: CfnTransformer.X12DetailsProperty.Builder =
        CfnTransformer.X12DetailsProperty.builder()

    /**
     * @param transactionSet Returns an enumerated type where each value identifies an X12
     *   transaction set. Transaction sets are maintained by the X12 Accredited Standards Committee.
     */
    public fun transactionSet(transactionSet: String) {
        cdkBuilder.transactionSet(transactionSet)
    }

    /**
     * @param version Returns the version to use for the specified X12 transaction set. Supported
     *   versions are `4010` , `4030` , and `5010` .
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnTransformer.X12DetailsProperty = cdkBuilder.build()
}
