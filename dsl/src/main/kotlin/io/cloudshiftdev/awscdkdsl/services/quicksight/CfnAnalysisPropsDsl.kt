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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import software.amazon.awscdk.services.quicksight.CfnAnalysisProps

/**
 * Properties for defining a `CfnAnalysis`.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html)
 */
@CdkDslMarker
public class CfnAnalysisPropsDsl {
    private val cdkBuilder: CfnAnalysisProps.Builder = CfnAnalysisProps.builder()

    private val _errors: MutableList<Any> = mutableListOf()

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _sheets: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param analysisId The ID for the analysis that you're creating. This ID displays in the URL
     *   of the analysis.
     */
    public fun analysisId(analysisId: String) {
        cdkBuilder.analysisId(analysisId)
    }

    /** @param awsAccountId The ID of the AWS account where you are creating an analysis. */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /** @param definition the value to be set. */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /** @param definition the value to be set. */
    public fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    /** @param errors Errors associated with the analysis. */
    public fun errors(vararg errors: Any) {
        _errors.addAll(listOf(*errors))
    }

    /** @param errors Errors associated with the analysis. */
    public fun errors(errors: Collection<Any>) {
        _errors.addAll(errors)
    }

    /** @param errors Errors associated with the analysis. */
    public fun errors(errors: IResolvable) {
        cdkBuilder.errors(errors)
    }

    /**
     * @param name A descriptive name for the analysis that you're creating. This name displays for
     *   the analysis in the Amazon QuickSight console.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameter names and override values that you want to use. An analysis
     *   can have any parameter type, and some parameters might accept multiple values.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param parameters The parameter names and override values that you want to use. An analysis
     *   can have any parameter type, and some parameters might accept multiple values.
     */
    public fun parameters(parameters: CfnAnalysis.ParametersProperty) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     *   permissions on an analysis. You can use the `Permissions` structure to grant permissions by
     *   providing a list of AWS Identity and Access Management (IAM) action information for each
     *   principal listed by Amazon Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     *   permissions on an analysis. You can use the `Permissions` structure to grant permissions by
     *   providing a list of AWS Identity and Access Management (IAM) action information for each
     *   principal listed by Amazon Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     *   permissions on an analysis. You can use the `Permissions` structure to grant permissions by
     *   providing a list of AWS Identity and Access Management (IAM) action information for each
     *   principal listed by Amazon Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     *   sheet.
     */
    public fun sheets(vararg sheets: Any) {
        _sheets.addAll(listOf(*sheets))
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     *   sheet.
     */
    public fun sheets(sheets: Collection<Any>) {
        _sheets.addAll(sheets)
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     *   sheet.
     */
    public fun sheets(sheets: IResolvable) {
        cdkBuilder.sheets(sheets)
    }

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating. This
     *   metadata structure contains details that describe a source template and one or more
     *   datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: IResolvable) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating. This
     *   metadata structure contains details that describe a source template and one or more
     *   datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    /** @param status Status associated with the analysis. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the analysis.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the analysis.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param themeArn The ARN for the theme to apply to the analysis that you're creating. To see
     *   the theme in the Amazon QuickSight console, make sure that you have access to it.
     */
    public fun themeArn(themeArn: String) {
        cdkBuilder.themeArn(themeArn)
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     *   update analyses, dashboards, and templates with definition objects. When you set this value
     *   to `LENIENT` , validation is skipped for specific errors.
     */
    public fun validationStrategy(validationStrategy: IResolvable) {
        cdkBuilder.validationStrategy(validationStrategy)
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     *   update analyses, dashboards, and templates with definition objects. When you set this value
     *   to `LENIENT` , validation is skipped for specific errors.
     */
    public fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty) {
        cdkBuilder.validationStrategy(validationStrategy)
    }

    public fun build(): CfnAnalysisProps {
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
