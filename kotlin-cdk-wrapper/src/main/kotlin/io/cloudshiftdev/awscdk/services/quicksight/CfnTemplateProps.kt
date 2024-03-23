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
 * Properties for defining a `CfnTemplate`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html)
 */
public interface CfnTemplateProps {
  /**
   * The ID for the AWS account that the group is in.
   *
   * You use the ID for the AWS account that contains your Amazon QuickSight account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-awsaccountid)
   */
  public fun awsAccountId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-definition)
   */
  public fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * A display name for the template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A list of resource permissions to be set on the template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-permissions)
   */
  public fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * The entity that you are using as a source when you create the template.
   *
   * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate` for
   * a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource Name
   * (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis` ,
   * specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account and
   * any Amazon QuickSight-supported AWS Region .
   *
   * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
   * replacement datasets for the placeholders listed in the original. The schema in each dataset must
   * match its placeholder.
   *
   * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
   * valid.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-sourceentity)
   */
  public fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An ID for the template that you want to create.
   *
   * This template is unique per AWS Region ; in each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-templateid)
   */
  public fun templateId(): String

  /**
   * The option to relax the validation that is required to create and update analyses, dashboards,
   * and templates with definition objects.
   *
   * When you set this value to `LENIENT` , validation is skipped for specific errors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-validationstrategy)
   */
  public fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

  /**
   * A description of the current template version being created.
   *
   * This API operation creates the first version of the template. Every time `UpdateTemplate` is
   * called, a new version is created. Each version of the template maintains a description of the
   * version in the `VersionDescription` field.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-versiondescription)
   */
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * A builder for [CfnTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The ID for the AWS account that the group is in. 
     * You use the ID for the AWS account that contains your Amazon QuickSight account.
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty)

    /**
     * @param definition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c69df204ab9740eff833642da87e1168185f391c5d9488c62bb4b9f66e6b1502")
    public
        fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty.Builder.() -> Unit)

    /**
     * @param name A display name for the template.
     */
    public fun name(name: String)

    /**
     * @param permissions A list of resource permissions to be set on the template.
     */
    public fun permissions(permissions: IResolvable)

    /**
     * @param permissions A list of resource permissions to be set on the template.
     */
    public fun permissions(permissions: List<Any>)

    /**
     * @param permissions A list of resource permissions to be set on the template.
     */
    public fun permissions(vararg permissions: Any)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     * for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource
     * Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis`
     * , specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account
     * and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: IResolvable)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     * for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource
     * Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis`
     * , specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account
     * and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     * for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource
     * Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis`
     * , specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account
     * and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("880cfa170a80d80802eaba98a605c8f48e77bc0f031ba6953d1e50124b80c335")
    public
        fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty.Builder.() -> Unit)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param templateId An ID for the template that you want to create. 
     * This template is unique per AWS Region ; in each AWS account.
     */
    public fun templateId(templateId: String)

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
    public fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty)

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("439cf12bb7bc3bdaf8c71ae4445e0fc869467e00ce792bc27dc701a7c3ffd36b")
    public
        fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty.Builder.() -> Unit)

    /**
     * @param versionDescription A description of the current template version being created.
     * This API operation creates the first version of the template. Every time `UpdateTemplate` is
     * called, a new version is created. Each version of the template maintains a description of the
     * version in the `VersionDescription` field.
     */
    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTemplateProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnTemplateProps.builder()

    /**
     * @param awsAccountId The ID for the AWS account that the group is in. 
     * You use the ID for the AWS account that contains your Amazon QuickSight account.
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnTemplate.TemplateVersionDefinitionProperty::unwrap))
    }

    /**
     * @param definition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c69df204ab9740eff833642da87e1168185f391c5d9488c62bb4b9f66e6b1502")
    override
        fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnTemplate.TemplateVersionDefinitionProperty(definition))

    /**
     * @param name A display name for the template.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param permissions A list of resource permissions to be set on the template.
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    /**
     * @param permissions A list of resource permissions to be set on the template.
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * @param permissions A list of resource permissions to be set on the template.
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     * for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource
     * Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis`
     * , specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account
     * and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    override fun sourceEntity(sourceEntity: IResolvable) {
      cdkBuilder.sourceEntity(sourceEntity.let(IResolvable::unwrap))
    }

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     * for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource
     * Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis`
     * , specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account
     * and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    override fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty) {
      cdkBuilder.sourceEntity(sourceEntity.let(CfnTemplate.TemplateSourceEntityProperty::unwrap))
    }

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     * for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource
     * Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis`
     * , specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account
     * and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("880cfa170a80d80802eaba98a605c8f48e77bc0f031ba6953d1e50124b80c335")
    override
        fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty.Builder.() -> Unit):
        Unit = sourceEntity(CfnTemplate.TemplateSourceEntityProperty(sourceEntity))

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param templateId An ID for the template that you want to create. 
     * This template is unique per AWS Region ; in each AWS account.
     */
    override fun templateId(templateId: String) {
      cdkBuilder.templateId(templateId)
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    override fun validationStrategy(validationStrategy: IResolvable) {
      cdkBuilder.validationStrategy(validationStrategy.let(IResolvable::unwrap))
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    override fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty) {
      cdkBuilder.validationStrategy(validationStrategy.let(CfnTemplate.ValidationStrategyProperty::unwrap))
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("439cf12bb7bc3bdaf8c71ae4445e0fc869467e00ce792bc27dc701a7c3ffd36b")
    override
        fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty.Builder.() -> Unit):
        Unit = validationStrategy(CfnTemplate.ValidationStrategyProperty(validationStrategy))

    /**
     * @param versionDescription A description of the current template version being created.
     * This API operation creates the first version of the template. Every time `UpdateTemplate` is
     * called, a new version is created. Each version of the template maintains a description of the
     * version in the `VersionDescription` field.
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.quicksight.CfnTemplateProps,
  ) : CdkObject(cdkObject), CfnTemplateProps {
    /**
     * The ID for the AWS account that the group is in.
     *
     * You use the ID for the AWS account that contains your Amazon QuickSight account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-awsaccountid)
     */
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-definition)
     */
    override fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * A display name for the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A list of resource permissions to be set on the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-permissions)
     */
    override fun permissions(): Any? = unwrap(this).getPermissions()

    /**
     * The entity that you are using as a source when you create the template.
     *
     * In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     * for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon Resource
     * Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For `SourceAnalysis`
     * , specify the ARN of the source analysis. The `SourceTemplate` ARN can contain any AWS account
     * and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-sourceentity)
     */
    override fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An ID for the template that you want to create.
     *
     * This template is unique per AWS Region ; in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-templateid)
     */
    override fun templateId(): String = unwrap(this).getTemplateId()

    /**
     * The option to relax the validation that is required to create and update analyses,
     * dashboards, and templates with definition objects.
     *
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-validationstrategy)
     */
    override fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

    /**
     * A description of the current template version being created.
     *
     * This API operation creates the first version of the template. Every time `UpdateTemplate` is
     * called, a new version is created. Each version of the template maintains a description of the
     * version in the `VersionDescription` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html#cfn-quicksight-template-versiondescription)
     */
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTemplateProps):
        CfnTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateProps):
        software.amazon.awscdk.services.quicksight.CfnTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnTemplateProps
  }
}
