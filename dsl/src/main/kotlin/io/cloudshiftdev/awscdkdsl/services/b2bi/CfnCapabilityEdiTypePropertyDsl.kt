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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.b2bi.CfnCapability

/**
 * Specifies the details for the EDI standard that is being used for the transformer.
 *
 * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
 * define specific business documents.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * EdiTypeProperty ediTypeProperty = EdiTypeProperty.builder()
 * .x12Details(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-editype.html)
 */
@CdkDslMarker
public class CfnCapabilityEdiTypePropertyDsl {
    private val cdkBuilder: CfnCapability.EdiTypeProperty.Builder =
        CfnCapability.EdiTypeProperty.builder()

    /**
     * @param x12Details Returns the details for the EDI standard that is being used for the
     *   transformer. Currently, only X12 is supported. X12 is a set of standards and corresponding
     *   messages that define specific business documents.
     */
    public fun x12Details(x12Details: IResolvable) {
        cdkBuilder.x12Details(x12Details)
    }

    /**
     * @param x12Details Returns the details for the EDI standard that is being used for the
     *   transformer. Currently, only X12 is supported. X12 is a set of standards and corresponding
     *   messages that define specific business documents.
     */
    public fun x12Details(x12Details: CfnCapability.X12DetailsProperty) {
        cdkBuilder.x12Details(x12Details)
    }

    public fun build(): CfnCapability.EdiTypeProperty = cdkBuilder.build()
}
