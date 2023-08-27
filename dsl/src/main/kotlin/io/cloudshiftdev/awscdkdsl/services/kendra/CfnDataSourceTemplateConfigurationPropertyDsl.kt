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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * TemplateConfigurationProperty templateConfigurationProperty =
 * TemplateConfigurationProperty.builder()
 * .template("template")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-templateconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceTemplateConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.TemplateConfigurationProperty.Builder =
        CfnDataSource.TemplateConfigurationProperty.builder()

    /** @param template the value to be set. */
    public fun template(template: String) {
        cdkBuilder.template(template)
    }

    public fun build(): CfnDataSource.TemplateConfigurationProperty = cdkBuilder.build()
}
