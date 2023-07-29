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

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnProject
import software.constructs.Construct

/**
 * The `AWS::IoT1Click::Project` resource creates an empty project with a placement template.
 *
 * A project contains zero or more placements that adhere to the placement template defined in the
 * project. For more information, see
 * [CreateProject](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_CreateProject.html)
 * in the *AWS IoT 1-Click Projects API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot1click.*;
 * Object callbackOverrides;
 * Object defaultAttributes;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
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
public class CfnProjectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

    /**
     * The description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
     *
     * @param description The description of the project.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     *
     * @param placementTemplate An object describing the project's placement specifications.
     */
    public fun placementTemplate(placementTemplate: IResolvable) {
        cdkBuilder.placementTemplate(placementTemplate)
    }

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     *
     * @param placementTemplate An object describing the project's placement specifications.
     */
    public fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty) {
        cdkBuilder.placementTemplate(placementTemplate)
    }

    /**
     * The name of the project from which to obtain information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
     *
     * @param projectName The name of the project from which to obtain information.
     */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun build(): CfnProject = cdkBuilder.build()
}
