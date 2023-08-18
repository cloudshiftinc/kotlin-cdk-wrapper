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

package io.cloudshiftdev.awscdkdsl.services.iot1click

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnProject
import software.amazon.awscdk.services.iot1click.CfnProjectProps

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot1click.*;
 * Object callbackOverrides;
 * Object defaultAttributes;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .placementTemplate(PlacementTemplateProperty.builder()
 * .defaultAttributes(defaultAttributes)
 * .deviceTemplates(Map.of(
 * "deviceTemplatesKey", DeviceTemplateProperty.builder()
 * .callbackOverrides(callbackOverrides)
 * .deviceType("deviceType")
 * .build()))
 * .build())
 * // the properties below are optional
 * .description("description")
 * .projectName("projectName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html)
 */
@CdkDslMarker
public class CfnProjectPropsDsl {
    private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

    /** @param description The description of the project. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param placementTemplate An object describing the project's placement specifications. */
    public fun placementTemplate(placementTemplate: IResolvable) {
        cdkBuilder.placementTemplate(placementTemplate)
    }

    /** @param placementTemplate An object describing the project's placement specifications. */
    public fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty) {
        cdkBuilder.placementTemplate(placementTemplate)
    }

    /** @param projectName The name of the project from which to obtain information. */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun build(): CfnProjectProps = cdkBuilder.build()
}
