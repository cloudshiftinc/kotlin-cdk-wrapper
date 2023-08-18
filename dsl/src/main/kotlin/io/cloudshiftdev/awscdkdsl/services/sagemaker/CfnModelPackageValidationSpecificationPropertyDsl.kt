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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Specifies batch transform jobs that SageMaker runs to validate your model package.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ValidationSpecificationProperty validationSpecificationProperty =
 * ValidationSpecificationProperty.builder()
 * .validationProfiles(List.of(ValidationProfileProperty.builder()
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
 * .build()))
 * .validationRole("validationRole")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationspecification.html)
 */
@CdkDslMarker
public class CfnModelPackageValidationSpecificationPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ValidationSpecificationProperty.Builder =
        CfnModelPackage.ValidationSpecificationProperty.builder()

    private val _validationProfiles: MutableList<Any> = mutableListOf()

    /**
     * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of which
     *   specifies a batch transform job that SageMaker runs to validate your model package.
     */
    public fun validationProfiles(vararg validationProfiles: Any) {
        _validationProfiles.addAll(listOf(*validationProfiles))
    }

    /**
     * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of which
     *   specifies a batch transform job that SageMaker runs to validate your model package.
     */
    public fun validationProfiles(validationProfiles: Collection<Any>) {
        _validationProfiles.addAll(validationProfiles)
    }

    /**
     * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of which
     *   specifies a batch transform job that SageMaker runs to validate your model package.
     */
    public fun validationProfiles(validationProfiles: IResolvable) {
        cdkBuilder.validationProfiles(validationProfiles)
    }

    /** @param validationRole The IAM roles to be used for the validation of the model package. */
    public fun validationRole(validationRole: String) {
        cdkBuilder.validationRole(validationRole)
    }

    public fun build(): CfnModelPackage.ValidationSpecificationProperty {
        if (_validationProfiles.isNotEmpty()) cdkBuilder.validationProfiles(_validationProfiles)
        return cdkBuilder.build()
    }
}
