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
 * A capability object.
 *
 * Currently, only EDI (electronic data interchange) capabilities are supported. A trading
 * capability contains the information required to transform incoming EDI documents into JSON or XML
 * outputs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * CapabilityConfigurationProperty capabilityConfigurationProperty =
 * CapabilityConfigurationProperty.builder()
 * .edi(EdiConfigurationProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-capabilityconfiguration.html)
 */
@CdkDslMarker
public class CfnCapabilityCapabilityConfigurationPropertyDsl {
    private val cdkBuilder: CfnCapability.CapabilityConfigurationProperty.Builder =
        CfnCapability.CapabilityConfigurationProperty.builder()

    /** @param edi An EDI (electronic data interchange) configuration object. */
    public fun edi(edi: IResolvable) {
        cdkBuilder.edi(edi)
    }

    /** @param edi An EDI (electronic data interchange) configuration object. */
    public fun edi(edi: CfnCapability.EdiConfigurationProperty) {
        cdkBuilder.edi(edi)
    }

    public fun build(): CfnCapability.CapabilityConfigurationProperty = cdkBuilder.build()
}
