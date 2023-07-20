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

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import kotlin.String

@CdkDslMarker
public class CfnExperimentTemplateS3ConfigurationPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.S3ConfigurationProperty.Builder =
        CfnExperimentTemplate.S3ConfigurationProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnExperimentTemplate.S3ConfigurationProperty = cdkBuilder.build()
}
