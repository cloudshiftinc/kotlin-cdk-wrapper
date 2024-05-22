@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAnalysis`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html)
 */
public interface CfnAnalysisProps {
  /**
   * The ID for the analysis that you're creating.
   *
   * This ID displays in the URL of the analysis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-analysisid)
   */
  public fun analysisId(): String

  /**
   * The ID of the AWS account where you are creating an analysis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-awsaccountid)
   */
  public fun awsAccountId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-definition)
   */
  public fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * Errors associated with the analysis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-errors)
   */
  public fun errors(): Any? = unwrap(this).getErrors()

  /**
   * A descriptive name for the analysis that you're creating.
   *
   * This name displays for the analysis in the Amazon QuickSight console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-name)
   */
  public fun name(): String

  /**
   * The parameter names and override values that you want to use.
   *
   * An analysis can have any parameter type, and some parameters might accept multiple values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

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
   */
  public fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * A list of the associated sheets with the unique identifier and name of each sheet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-sheets)
   */
  public fun sheets(): Any? = unwrap(this).getSheets()

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
   */
  public fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

  /**
   * Status associated with the analysis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN for the theme to apply to the analysis that you're creating.
   *
   * To see the theme in the Amazon QuickSight console, make sure that you have access to it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-themearn)
   */
  public fun themeArn(): String? = unwrap(this).getThemeArn()

  /**
   * The option to relax the validation that is required to create and update analyses, dashboards,
   * and templates with definition objects.
   *
   * When you set this value to `LENIENT` , validation is skipped for specific errors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-validationstrategy)
   */
  public fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

  /**
   * A builder for [CfnAnalysisProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analysisId The ID for the analysis that you're creating. 
     * This ID displays in the URL of the analysis.
     */
    public fun analysisId(analysisId: String)

    /**
     * @param awsAccountId The ID of the AWS account where you are creating an analysis. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty)

    /**
     * @param definition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21c4e5d771e161578f5d76d392178006d92188b126fa8815f375731f2a469e64")
    public fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty.Builder.() -> Unit)

    /**
     * @param errors Errors associated with the analysis.
     */
    public fun errors(errors: IResolvable)

    /**
     * @param errors Errors associated with the analysis.
     */
    public fun errors(errors: List<Any>)

    /**
     * @param errors Errors associated with the analysis.
     */
    public fun errors(vararg errors: Any)

    /**
     * @param name A descriptive name for the analysis that you're creating. 
     * This name displays for the analysis in the Amazon QuickSight console.
     */
    public fun name(name: String)

    /**
     * @param parameters The parameter names and override values that you want to use.
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters The parameter names and override values that you want to use.
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     */
    public fun parameters(parameters: CfnAnalysis.ParametersProperty)

    /**
     * @param parameters The parameter names and override values that you want to use.
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528f1bf9c169f86460821ee727e860298b6313073b481086de8dff80080cbde5")
    public fun parameters(parameters: CfnAnalysis.ParametersProperty.Builder.() -> Unit)

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions on an analysis.
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(permissions: IResolvable)

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions on an analysis.
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(permissions: List<Any>)

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions on an analysis.
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    public fun permissions(vararg permissions: Any)

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    public fun sheets(sheets: IResolvable)

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    public fun sheets(sheets: List<Any>)

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    public fun sheets(vararg sheets: Any)

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: IResolvable)

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty)

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb79e76b4c4de5b022a657a2e85c6b0ca27920e7b08b9f29e05b5b527e91588")
    public
        fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty.Builder.() -> Unit)

    /**
     * @param status Status associated with the analysis.
     */
    public fun status(status: String)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the analysis.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the analysis.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param themeArn The ARN for the theme to apply to the analysis that you're creating.
     * To see the theme in the Amazon QuickSight console, make sure that you have access to it.
     */
    public fun themeArn(themeArn: String)

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    public fun validationStrategy(validationStrategy: IResolvable)

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    public fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty)

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("842381f5719ed0367767421fe28416fe80d7dd421cbef87632c7893206ddf28e")
    public
        fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnAnalysisProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnAnalysisProps.builder()

    /**
     * @param analysisId The ID for the analysis that you're creating. 
     * This ID displays in the URL of the analysis.
     */
    override fun analysisId(analysisId: String) {
      cdkBuilder.analysisId(analysisId)
    }

    /**
     * @param awsAccountId The ID of the AWS account where you are creating an analysis. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnAnalysis.AnalysisDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param definition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21c4e5d771e161578f5d76d392178006d92188b126fa8815f375731f2a469e64")
    override fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnAnalysis.AnalysisDefinitionProperty(definition))

    /**
     * @param errors Errors associated with the analysis.
     */
    override fun errors(errors: IResolvable) {
      cdkBuilder.errors(errors.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param errors Errors associated with the analysis.
     */
    override fun errors(errors: List<Any>) {
      cdkBuilder.errors(errors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param errors Errors associated with the analysis.
     */
    override fun errors(vararg errors: Any): Unit = errors(errors.toList())

    /**
     * @param name A descriptive name for the analysis that you're creating. 
     * This name displays for the analysis in the Amazon QuickSight console.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameter names and override values that you want to use.
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters The parameter names and override values that you want to use.
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     */
    override fun parameters(parameters: CfnAnalysis.ParametersProperty) {
      cdkBuilder.parameters(parameters.let(CfnAnalysis.ParametersProperty.Companion::unwrap))
    }

    /**
     * @param parameters The parameter names and override values that you want to use.
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528f1bf9c169f86460821ee727e860298b6313073b481086de8dff80080cbde5")
    override fun parameters(parameters: CfnAnalysis.ParametersProperty.Builder.() -> Unit): Unit =
        parameters(CfnAnalysis.ParametersProperty(parameters))

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions on an analysis.
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions on an analysis.
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param permissions A structure that describes the principals and the resource-level
     * permissions on an analysis.
     * You can use the `Permissions` structure to grant permissions by providing a list of AWS
     * Identity and Access Management (IAM) action information for each principal listed by Amazon
     * Resource Name (ARN).
     *
     * To specify no permissions, omit `Permissions` .
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    override fun sheets(sheets: IResolvable) {
      cdkBuilder.sheets(sheets.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    override fun sheets(sheets: List<Any>) {
      cdkBuilder.sheets(sheets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    override fun sheets(vararg sheets: Any): Unit = sheets(sheets.toList())

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    override fun sourceEntity(sourceEntity: IResolvable) {
      cdkBuilder.sourceEntity(sourceEntity.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    override fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty) {
      cdkBuilder.sourceEntity(sourceEntity.let(CfnAnalysis.AnalysisSourceEntityProperty.Companion::unwrap))
    }

    /**
     * @param sourceEntity A source entity to use for the analysis that you're creating.
     * This metadata structure contains details that describe a source template and one or more
     * datasets.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb79e76b4c4de5b022a657a2e85c6b0ca27920e7b08b9f29e05b5b527e91588")
    override
        fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty.Builder.() -> Unit):
        Unit = sourceEntity(CfnAnalysis.AnalysisSourceEntityProperty(sourceEntity))

    /**
     * @param status Status associated with the analysis.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the analysis.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the analysis.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param themeArn The ARN for the theme to apply to the analysis that you're creating.
     * To see the theme in the Amazon QuickSight console, make sure that you have access to it.
     */
    override fun themeArn(themeArn: String) {
      cdkBuilder.themeArn(themeArn)
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    override fun validationStrategy(validationStrategy: IResolvable) {
      cdkBuilder.validationStrategy(validationStrategy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    override fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty) {
      cdkBuilder.validationStrategy(validationStrategy.let(CfnAnalysis.ValidationStrategyProperty.Companion::unwrap))
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("842381f5719ed0367767421fe28416fe80d7dd421cbef87632c7893206ddf28e")
    override
        fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty.Builder.() -> Unit):
        Unit = validationStrategy(CfnAnalysis.ValidationStrategyProperty(validationStrategy))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnAnalysisProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.quicksight.CfnAnalysisProps,
  ) : CdkObject(cdkObject), CfnAnalysisProps {
    /**
     * The ID for the analysis that you're creating.
     *
     * This ID displays in the URL of the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-analysisid)
     */
    override fun analysisId(): String = unwrap(this).getAnalysisId()

    /**
     * The ID of the AWS account where you are creating an analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-awsaccountid)
     */
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-definition)
     */
    override fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * Errors associated with the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-errors)
     */
    override fun errors(): Any? = unwrap(this).getErrors()

    /**
     * A descriptive name for the analysis that you're creating.
     *
     * This name displays for the analysis in the Amazon QuickSight console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The parameter names and override values that you want to use.
     *
     * An analysis can have any parameter type, and some parameters might accept multiple values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

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
     */
    override fun permissions(): Any? = unwrap(this).getPermissions()

    /**
     * A list of the associated sheets with the unique identifier and name of each sheet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-sheets)
     */
    override fun sheets(): Any? = unwrap(this).getSheets()

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
     */
    override fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

    /**
     * Status associated with the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN for the theme to apply to the analysis that you're creating.
     *
     * To see the theme in the Amazon QuickSight console, make sure that you have access to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-themearn)
     */
    override fun themeArn(): String? = unwrap(this).getThemeArn()

    /**
     * The option to relax the validation that is required to create and update analyses,
     * dashboards, and templates with definition objects.
     *
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-analysis.html#cfn-quicksight-analysis-validationstrategy)
     */
    override fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnalysisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnAnalysisProps):
        CfnAnalysisProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAnalysisProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnalysisProps):
        software.amazon.awscdk.services.quicksight.CfnAnalysisProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnAnalysisProps
  }
}
