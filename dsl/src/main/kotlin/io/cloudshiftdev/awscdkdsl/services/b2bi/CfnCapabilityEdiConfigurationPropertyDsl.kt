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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.b2bi.CfnCapability

/**
 * Specifies the details for the EDI (electronic data interchange) transformation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * EdiConfigurationProperty ediConfigurationProperty = EdiConfigurationProperty.builder()
 * .inputLocation(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build())
 * .outputLocation(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build())
 * .transformerId("transformerId")
 * .type(EdiTypeProperty.builder()
 * .x12Details(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html)
 */
@CdkDslMarker
public class CfnCapabilityEdiConfigurationPropertyDsl {
    private val cdkBuilder: CfnCapability.EdiConfigurationProperty.Builder =
        CfnCapability.EdiConfigurationProperty.builder()

    /**
     * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
     *   file, which is contained in an `S3Location` object.
     */
    public fun inputLocation(inputLocation: IResolvable) {
        cdkBuilder.inputLocation(inputLocation)
    }

    /**
     * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
     *   file, which is contained in an `S3Location` object.
     */
    public fun inputLocation(inputLocation: CfnCapability.S3LocationProperty) {
        cdkBuilder.inputLocation(inputLocation)
    }

    /**
     * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the output
     *   file, which is contained in an `S3Location` object.
     */
    public fun outputLocation(outputLocation: IResolvable) {
        cdkBuilder.outputLocation(outputLocation)
    }

    /**
     * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the output
     *   file, which is contained in an `S3Location` object.
     */
    public fun outputLocation(outputLocation: CfnCapability.S3LocationProperty) {
        cdkBuilder.outputLocation(outputLocation)
    }

    /** @param transformerId Returns the system-assigned unique identifier for the transformer. */
    public fun transformerId(transformerId: String) {
        cdkBuilder.transformerId(transformerId)
    }

    /** @param type Returns the type of the capability. Currently, only `edi` is supported. */
    public fun type(type: IResolvable) {
        cdkBuilder.type(type)
    }

    /** @param type Returns the type of the capability. Currently, only `edi` is supported. */
    public fun type(type: CfnCapability.EdiTypeProperty) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCapability.EdiConfigurationProperty = cdkBuilder.build()
}
