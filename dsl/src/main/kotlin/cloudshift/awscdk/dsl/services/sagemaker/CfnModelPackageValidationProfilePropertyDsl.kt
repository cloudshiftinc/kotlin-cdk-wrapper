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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Contains data, such as the inputs and targeted instance types that are used in the process of
 * validating the model package.
 *
 * The data provided in the validation profile is made available to your buyers on AWS Marketplace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ValidationProfileProperty validationProfileProperty = ValidationProfileProperty.builder()
 * .profileName("profileName")
 * .transformJobDefinition(TransformJobDefinitionProperty.builder()
 * .transformInput(TransformInputProperty.builder()
 * .dataSource(DataSourceProperty.builder()
 * .s3DataSource(S3DataSourceProperty.builder()
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * .build())
 * .build())
 * // the properties below are optional
 * .compressionType("compressionType")
 * .contentType("contentType")
 * .splitType("splitType")
 * .build())
 * .transformOutput(TransformOutputProperty.builder()
 * .s3OutputPath("s3OutputPath")
 * // the properties below are optional
 * .accept("accept")
 * .assembleWith("assembleWith")
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .transformResources(TransformResourcesProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * // the properties below are optional
 * .batchStrategy("batchStrategy")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .maxConcurrentTransforms(123)
 * .maxPayloadInMb(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationprofile.html)
 */
@CdkDslMarker
public class CfnModelPackageValidationProfilePropertyDsl {
    private val cdkBuilder: CfnModelPackage.ValidationProfileProperty.Builder =
        CfnModelPackage.ValidationProfileProperty.builder()

    /** @param profileName The name of the profile for the model package. */
    public fun profileName(profileName: String) {
        cdkBuilder.profileName(profileName)
    }

    /**
     * @param transformJobDefinition The `TransformJobDefinition` object that describes the
     *   transform job used for the validation of the model package.
     */
    public fun transformJobDefinition(transformJobDefinition: IResolvable) {
        cdkBuilder.transformJobDefinition(transformJobDefinition)
    }

    /**
     * @param transformJobDefinition The `TransformJobDefinition` object that describes the
     *   transform job used for the validation of the model package.
     */
    public fun transformJobDefinition(
        transformJobDefinition: CfnModelPackage.TransformJobDefinitionProperty
    ) {
        cdkBuilder.transformJobDefinition(transformJobDefinition)
    }

    public fun build(): CfnModelPackage.ValidationProfileProperty = cdkBuilder.build()
}
