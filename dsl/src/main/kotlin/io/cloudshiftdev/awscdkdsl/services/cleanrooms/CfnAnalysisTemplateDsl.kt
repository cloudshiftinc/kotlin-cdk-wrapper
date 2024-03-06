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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate
import software.constructs.Construct

/**
 * Creates a new analysis template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * CfnAnalysisTemplate cfnAnalysisTemplate = CfnAnalysisTemplate.Builder.create(this,
 * "MyCfnAnalysisTemplate")
 * .format("format")
 * .membershipIdentifier("membershipIdentifier")
 * .name("name")
 * .source(AnalysisSourceProperty.builder()
 * .text("text")
 * .build())
 * // the properties below are optional
 * .analysisParameters(List.of(AnalysisParameterProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .defaultValue("defaultValue")
 * .build()))
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html)
 */
@CdkDslMarker
public class CfnAnalysisTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAnalysisTemplate.Builder =
        CfnAnalysisTemplate.Builder.create(scope, id)

    private val _analysisParameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     *
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(vararg analysisParameters: Any) {
        _analysisParameters.addAll(listOf(*analysisParameters))
    }

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     *
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(analysisParameters: Collection<Any>) {
        _analysisParameters.addAll(analysisParameters)
    }

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     *
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(analysisParameters: IResolvable) {
        cdkBuilder.analysisParameters(analysisParameters)
    }

    /**
     * The description of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-description)
     *
     * @param description The description of the analysis template.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The format of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-format)
     *
     * @param format The format of the analysis template.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-membershipidentifier)
     *
     * @param membershipIdentifier The identifier for a membership resource.
     */
    public fun membershipIdentifier(membershipIdentifier: String) {
        cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * The name of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-name)
     *
     * @param name The name of the analysis template.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     *
     * @param source The source of the analysis template.
     */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     *
     * @param source The source of the analysis template.
     */
    public fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty) {
        cdkBuilder.source(source)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAnalysisTemplate {
        if (_analysisParameters.isNotEmpty()) cdkBuilder.analysisParameters(_analysisParameters)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
