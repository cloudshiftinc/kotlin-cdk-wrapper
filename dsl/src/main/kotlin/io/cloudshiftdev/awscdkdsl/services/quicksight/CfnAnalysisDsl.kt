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
import software.constructs.Construct

/**
 * Creates an analysis in Amazon QuickSight.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html)
 */
@CdkDslMarker
public class CfnAnalysisDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAnalysis.Builder = CfnAnalysis.Builder.create(scope, id)

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID for the analysis that you're creating.
     *
     * This ID displays in the URL of the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-analysisid)
     *
     * @param analysisId The ID for the analysis that you're creating.
     */
    public fun analysisId(analysisId: String) {
        cdkBuilder.analysisId(analysisId)
    }

    /**
     * The ID of the AWS account where you are creating an analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-awsaccountid)
     *
     * @param awsAccountId The ID of the AWS account where you are creating an analysis.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-definition)
     *
     * @param definition
     */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-definition)
     *
     * @param definition
     */
    public fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    /**
     * A descriptive name for the analysis that you're creating.
     *
     * This name displays for the analysis in the Amazon QuickSight console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-name)
     *
     * @param name A descriptive name for the analysis that you're creating.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The parameter names and override values that you want to use.
     *
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-parameters)
     *
     * @param parameters The parameter names and override values that you want to use.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The parameter names and override values that you want to use.
     *
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-parameters)
     *
     * @param parameters The parameter names and override values that you want to use.
     */
    public fun parameters(parameters: CfnAnalysis.ParametersProperty) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * A structure that describes the principals and the resource-level permissions on an analysis.
     *
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-permissions)
     *
     * @param permissions A structure that describes the principals and the resource-level
     *   permissions on an analysis.
     */
    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * A structure that describes the principals and the resource-level permissions on an analysis.
     *
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-permissions)
     *
     * @param permissions A structure that describes the principals and the resource-level
     *   permissions on an analysis.
     */
    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    /**
     * A structure that describes the principals and the resource-level permissions on an analysis.
     *
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-permissions)
     *
     * @param permissions A structure that describes the principals and the resource-level
     *   permissions on an analysis.
     */
    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    /**
     * A source entity to use for the analysis that you're creating.
     *
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-sourceentity)
     *
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     */
    public fun sourceEntity(sourceEntity: IResolvable) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    /**
     * A source entity to use for the analysis that you're creating.
     *
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-sourceentity)
     *
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     */
    public fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    /**
     * Status associated with the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-status)
     *
     * @param status Status associated with the analysis.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-tags)
     *
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the analysis.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-tags)
     *
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the analysis.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN for the theme to apply to the analysis that you're creating.
     *
     * To see the theme in the Amazon QuickSight console, make sure that you have access to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-themearn)
     *
     * @param themeArn The ARN for the theme to apply to the analysis that you're creating.
     */
    public fun themeArn(themeArn: String) {
        cdkBuilder.themeArn(themeArn)
    }

    public fun build(): CfnAnalysis {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
