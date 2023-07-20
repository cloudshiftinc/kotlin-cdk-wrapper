@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import kotlin.String

@CdkDslMarker
public class CfnModelPackageS3DataSourcePropertyDsl {
    private val cdkBuilder: CfnModelPackage.S3DataSourceProperty.Builder =
        CfnModelPackage.S3DataSourceProperty.builder()

    public fun s3DataType(s3DataType: String) {
        cdkBuilder.s3DataType(s3DataType)
    }

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelPackage.S3DataSourceProperty = cdkBuilder.build()
}
