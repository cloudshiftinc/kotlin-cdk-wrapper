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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModel

/**
 * Specifies the location of ML model data to deploy.
 *
 * If specified, you must specify one and only one of the available data sources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelDataSourceProperty modelDataSourceProperty = ModelDataSourceProperty.builder()
 * .s3DataSource(S3DataSourceProperty.builder()
 * .compressionType("compressionType")
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .modelAccessConfig(ModelAccessConfigProperty.builder()
 * .acceptEula(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modeldatasource.html)
 */
@CdkDslMarker
public class CfnModelModelDataSourcePropertyDsl {
    private val cdkBuilder: CfnModel.ModelDataSourceProperty.Builder =
        CfnModel.ModelDataSourceProperty.builder()

    /** @param s3DataSource Specifies the S3 location of ML model data to deploy. */
    public fun s3DataSource(s3DataSource: IResolvable) {
        cdkBuilder.s3DataSource(s3DataSource)
    }

    /** @param s3DataSource Specifies the S3 location of ML model data to deploy. */
    public fun s3DataSource(s3DataSource: CfnModel.S3DataSourceProperty) {
        cdkBuilder.s3DataSource(s3DataSource)
    }

    public fun build(): CfnModel.ModelDataSourceProperty = cdkBuilder.build()
}
