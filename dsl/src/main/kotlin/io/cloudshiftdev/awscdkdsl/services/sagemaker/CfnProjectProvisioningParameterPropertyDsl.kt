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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnProject

/**
 * A key value pair used when you provision a project as a service catalog product.
 *
 * For information, see
 * [What is AWS Service Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ProvisioningParameterProperty provisioningParameterProperty =
 * ProvisioningParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-provisioningparameter.html)
 */
@CdkDslMarker
public class CfnProjectProvisioningParameterPropertyDsl {
    private val cdkBuilder: CfnProject.ProvisioningParameterProperty.Builder =
        CfnProject.ProvisioningParameterProperty.builder()

    /** @param key The key that identifies a provisioning parameter. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value of the provisioning parameter. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnProject.ProvisioningParameterProperty = cdkBuilder.build()
}
