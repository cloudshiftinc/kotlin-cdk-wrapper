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

package io.cloudshiftdev.awscdkdsl.services.fis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/**
 * Specifies a target for an experiment.
 *
 * You must specify at least one Amazon Resource Name (ARN) or at least one resource tag. You cannot
 * specify both ARNs and tags.
 *
 * For more information, see
 * [Targets](https://docs.aws.amazon.com/fis/latest/userguide/targets.html) in the *AWS Fault
 * Injection Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * ExperimentTemplateTargetProperty experimentTemplateTargetProperty =
 * ExperimentTemplateTargetProperty.builder()
 * .resourceType("resourceType")
 * .selectionMode("selectionMode")
 * // the properties below are optional
 * .filters(List.of(ExperimentTemplateTargetFilterProperty.builder()
 * .path("path")
 * .values(List.of("values"))
 * .build()))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .resourceArns(List.of("resourceArns"))
 * .resourceTags(Map.of(
 * "resourceTagsKey", "resourceTags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html)
 */
@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateTargetPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateTargetProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateTargetProperty.builder()

    private val _filters: MutableList<Any> = mutableListOf()

    private val _resourceArns: MutableList<String> = mutableListOf()

    /**
     * @param filters The filters to apply to identify target resources using specific attributes.
     */
    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    /**
     * @param filters The filters to apply to identify target resources using specific attributes.
     */
    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    /**
     * @param filters The filters to apply to identify target resources using specific attributes.
     */
    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    /** @param parameters The parameters for the resource type. */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param parameters The parameters for the resource type. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param resourceArns The Amazon Resource Names (ARNs) of the targets. */
    public fun resourceArns(vararg resourceArns: String) {
        _resourceArns.addAll(listOf(*resourceArns))
    }

    /** @param resourceArns The Amazon Resource Names (ARNs) of the targets. */
    public fun resourceArns(resourceArns: Collection<String>) {
        _resourceArns.addAll(resourceArns)
    }

    /** @param resourceTags The tags for the target resources. */
    public fun resourceTags(resourceTags: Map<String, String>) {
        cdkBuilder.resourceTags(resourceTags)
    }

    /** @param resourceTags The tags for the target resources. */
    public fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags)
    }

    /** @param resourceType The resource type. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /** @param selectionMode Scopes the identified resources to a specific count or percentage. */
    public fun selectionMode(selectionMode: String) {
        cdkBuilder.selectionMode(selectionMode)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateTargetProperty {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        if (_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
        return cdkBuilder.build()
    }
}
