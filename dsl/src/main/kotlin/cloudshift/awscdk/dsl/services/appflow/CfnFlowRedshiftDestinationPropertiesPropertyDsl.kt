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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowRedshiftDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.RedshiftDestinationPropertiesProperty.Builder =
        CfnFlow.RedshiftDestinationPropertiesProperty.builder()

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    public fun intermediateBucketName(intermediateBucketName: String) {
        cdkBuilder.intermediateBucketName(intermediateBucketName)
    }

    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.RedshiftDestinationPropertiesProperty = cdkBuilder.build()
}
