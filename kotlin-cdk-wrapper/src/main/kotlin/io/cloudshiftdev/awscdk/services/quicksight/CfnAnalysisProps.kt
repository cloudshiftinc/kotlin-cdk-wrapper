@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAnalysisProps {
  public fun analysisId(): String

  public fun awsAccountId(): String

  public fun definition(): Any? = unwrap(this).getDefinition()

  public fun errors(): Any? = unwrap(this).getErrors()

  public fun name(): String

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun permissions(): Any? = unwrap(this).getPermissions()

  public fun sheets(): Any? = unwrap(this).getSheets()

  public fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun themeArn(): String? = unwrap(this).getThemeArn()

  public fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

  @CdkDslMarker
  public interface Builder {
    public fun analysisId(analysisId: String)

    public fun awsAccountId(awsAccountId: String)

    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21c4e5d771e161578f5d76d392178006d92188b126fa8815f375731f2a469e64")
    public fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty.Builder.() -> Unit)

    public fun errors(errors: IResolvable)

    public fun errors(errors: List<Any>)

    public fun errors(vararg errors: Any)

    public fun name(name: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: CfnAnalysis.ParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528f1bf9c169f86460821ee727e860298b6313073b481086de8dff80080cbde5")
    public fun parameters(parameters: CfnAnalysis.ParametersProperty.Builder.() -> Unit)

    public fun permissions(permissions: IResolvable)

    public fun permissions(permissions: List<Any>)

    public fun permissions(vararg permissions: Any)

    public fun sheets(sheets: IResolvable)

    public fun sheets(sheets: List<Any>)

    public fun sheets(vararg sheets: Any)

    public fun sourceEntity(sourceEntity: IResolvable)

    public fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb79e76b4c4de5b022a657a2e85c6b0ca27920e7b08b9f29e05b5b527e91588")
    public
        fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun themeArn(themeArn: String)

    public fun validationStrategy(validationStrategy: IResolvable)

    public fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("842381f5719ed0367767421fe28416fe80d7dd421cbef87632c7893206ddf28e")
    public
        fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnAnalysisProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnAnalysisProps.builder()

    override fun analysisId(analysisId: String) {
      cdkBuilder.analysisId(analysisId)
    }

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnAnalysis.AnalysisDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21c4e5d771e161578f5d76d392178006d92188b126fa8815f375731f2a469e64")
    override fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnAnalysis.AnalysisDefinitionProperty(definition))

    override fun errors(errors: IResolvable) {
      cdkBuilder.errors(errors.let(IResolvable::unwrap))
    }

    override fun errors(errors: List<Any>) {
      cdkBuilder.errors(errors)
    }

    override fun errors(vararg errors: Any): Unit = errors(errors.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: CfnAnalysis.ParametersProperty) {
      cdkBuilder.parameters(parameters.let(CfnAnalysis.ParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528f1bf9c169f86460821ee727e860298b6313073b481086de8dff80080cbde5")
    override fun parameters(parameters: CfnAnalysis.ParametersProperty.Builder.() -> Unit): Unit =
        parameters(CfnAnalysis.ParametersProperty(parameters))

    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    override fun sheets(sheets: IResolvable) {
      cdkBuilder.sheets(sheets.let(IResolvable::unwrap))
    }

    override fun sheets(sheets: List<Any>) {
      cdkBuilder.sheets(sheets)
    }

    override fun sheets(vararg sheets: Any): Unit = sheets(sheets.toList())

    override fun sourceEntity(sourceEntity: IResolvable) {
      cdkBuilder.sourceEntity(sourceEntity.let(IResolvable::unwrap))
    }

    override fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty) {
      cdkBuilder.sourceEntity(sourceEntity.let(CfnAnalysis.AnalysisSourceEntityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb79e76b4c4de5b022a657a2e85c6b0ca27920e7b08b9f29e05b5b527e91588")
    override
        fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty.Builder.() -> Unit):
        Unit = sourceEntity(CfnAnalysis.AnalysisSourceEntityProperty(sourceEntity))

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun themeArn(themeArn: String) {
      cdkBuilder.themeArn(themeArn)
    }

    override fun validationStrategy(validationStrategy: IResolvable) {
      cdkBuilder.validationStrategy(validationStrategy.let(IResolvable::unwrap))
    }

    override fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty) {
      cdkBuilder.validationStrategy(validationStrategy.let(CfnAnalysis.ValidationStrategyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("842381f5719ed0367767421fe28416fe80d7dd421cbef87632c7893206ddf28e")
    override
        fun validationStrategy(validationStrategy: CfnAnalysis.ValidationStrategyProperty.Builder.() -> Unit):
        Unit = validationStrategy(CfnAnalysis.ValidationStrategyProperty(validationStrategy))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnAnalysisProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnAnalysisProps,
  ) : CdkObject(cdkObject), CfnAnalysisProps {
    override fun analysisId(): String = unwrap(this).getAnalysisId()

    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    override fun definition(): Any? = unwrap(this).getDefinition()

    override fun errors(): Any? = unwrap(this).getErrors()

    override fun name(): String = unwrap(this).getName()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun permissions(): Any? = unwrap(this).getPermissions()

    override fun sheets(): Any? = unwrap(this).getSheets()

    override fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun themeArn(): String? = unwrap(this).getThemeArn()

    override fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnalysisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnAnalysisProps):
        CfnAnalysisProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnalysisProps):
        software.amazon.awscdk.services.quicksight.CfnAnalysisProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnAnalysisProps
  }
}
