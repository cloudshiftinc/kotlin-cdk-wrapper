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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The source analysis of the template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TemplateSourceAnalysisProperty templateSourceAnalysisProperty =
 * TemplateSourceAnalysisProperty.builder()
 * .arn("arn")
 * .dataSetReferences(List.of(DataSetReferenceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .dataSetPlaceholder("dataSetPlaceholder")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-templatesourceanalysis.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateSourceAnalysisPropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateSourceAnalysisProperty.Builder =
        CfnTemplate.TemplateSourceAnalysisProperty.builder()

    private val _dataSetReferences: MutableList<Any> = mutableListOf()

    /** @param arn The Amazon Resource Name (ARN) of the resource. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param dataSetReferences A structure containing information about the dataset references used
     *   as placeholders in the template.
     */
    public fun dataSetReferences(vararg dataSetReferences: Any) {
        _dataSetReferences.addAll(listOf(*dataSetReferences))
    }

    /**
     * @param dataSetReferences A structure containing information about the dataset references used
     *   as placeholders in the template.
     */
    public fun dataSetReferences(dataSetReferences: Collection<Any>) {
        _dataSetReferences.addAll(dataSetReferences)
    }

    /**
     * @param dataSetReferences A structure containing information about the dataset references used
     *   as placeholders in the template.
     */
    public fun dataSetReferences(dataSetReferences: IResolvable) {
        cdkBuilder.dataSetReferences(dataSetReferences)
    }

    public fun build(): CfnTemplate.TemplateSourceAnalysisProperty {
        if (_dataSetReferences.isNotEmpty()) cdkBuilder.dataSetReferences(_dataSetReferences)
        return cdkBuilder.build()
    }
}
