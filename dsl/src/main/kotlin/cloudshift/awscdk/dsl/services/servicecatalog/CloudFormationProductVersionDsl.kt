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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
import software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CloudFormationProductVersionDsl {
    private val cdkBuilder: CloudFormationProductVersion.Builder =
        CloudFormationProductVersion.builder()

    public fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate) {
        cdkBuilder.cloudFormationTemplate(cloudFormationTemplate)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun productVersionName(productVersionName: String) {
        cdkBuilder.productVersionName(productVersionName)
    }

    public fun validateTemplate(validateTemplate: Boolean) {
        cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): CloudFormationProductVersion = cdkBuilder.build()
}
