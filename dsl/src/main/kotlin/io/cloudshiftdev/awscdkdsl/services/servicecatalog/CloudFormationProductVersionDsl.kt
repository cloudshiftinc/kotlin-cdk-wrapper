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

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
import software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate

/**
 * Properties of product version (also known as a provisioning artifact).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CloudFormationTemplate cloudFormationTemplate;
 * CloudFormationProductVersion cloudFormationProductVersion =
 * CloudFormationProductVersion.builder()
 * .cloudFormationTemplate(cloudFormationTemplate)
 * // the properties below are optional
 * .description("description")
 * .productVersionName("productVersionName")
 * .validateTemplate(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudFormationProductVersionDsl {
    private val cdkBuilder: CloudFormationProductVersion.Builder =
        CloudFormationProductVersion.builder()

    /**
     * @param cloudFormationTemplate The S3 template that points to the provisioning version
     *   template.
     */
    public fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate) {
        cdkBuilder.cloudFormationTemplate(cloudFormationTemplate)
    }

    /** @param description The description of the product version. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param productVersionName The name of the product version. */
    public fun productVersionName(productVersionName: String) {
        cdkBuilder.productVersionName(productVersionName)
    }

    /**
     * @param validateTemplate Whether the specified product template will be validated by
     *   CloudFormation. If turned off, an invalid template configuration can be stored.
     */
    public fun validateTemplate(validateTemplate: Boolean) {
        cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): CloudFormationProductVersion = cdkBuilder.build()
}
