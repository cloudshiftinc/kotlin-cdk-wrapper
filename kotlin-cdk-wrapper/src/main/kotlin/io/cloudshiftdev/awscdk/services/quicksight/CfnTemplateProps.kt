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

public interface CfnTemplateProps {
  public fun awsAccountId(): String

  public fun definition(): Any? = unwrap(this).getDefinition()

  public fun name(): String? = unwrap(this).getName()

  public fun permissions(): Any? = unwrap(this).getPermissions()

  public fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun templateId(): String

  public fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c69df204ab9740eff833642da87e1168185f391c5d9488c62bb4b9f66e6b1502")
    public
        fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun permissions(permissions: IResolvable)

    public fun permissions(permissions: List<Any>)

    public fun permissions(vararg permissions: Any)

    public fun sourceEntity(sourceEntity: IResolvable)

    public fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("880cfa170a80d80802eaba98a605c8f48e77bc0f031ba6953d1e50124b80c335")
    public
        fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateId(templateId: String)

    public fun validationStrategy(validationStrategy: IResolvable)

    public fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("439cf12bb7bc3bdaf8c71ae4445e0fc869467e00ce792bc27dc701a7c3ffd36b")
    public
        fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty.Builder.() -> Unit)

    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTemplateProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnTemplateProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnTemplate.TemplateVersionDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c69df204ab9740eff833642da87e1168185f391c5d9488c62bb4b9f66e6b1502")
    override
        fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnTemplate.TemplateVersionDefinitionProperty(definition))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    override fun sourceEntity(sourceEntity: IResolvable) {
      cdkBuilder.sourceEntity(sourceEntity.let(IResolvable::unwrap))
    }

    override fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty) {
      cdkBuilder.sourceEntity(sourceEntity.let(CfnTemplate.TemplateSourceEntityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("880cfa170a80d80802eaba98a605c8f48e77bc0f031ba6953d1e50124b80c335")
    override
        fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty.Builder.() -> Unit):
        Unit = sourceEntity(CfnTemplate.TemplateSourceEntityProperty(sourceEntity))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateId(templateId: String) {
      cdkBuilder.templateId(templateId)
    }

    override fun validationStrategy(validationStrategy: IResolvable) {
      cdkBuilder.validationStrategy(validationStrategy.let(IResolvable::unwrap))
    }

    override fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty) {
      cdkBuilder.validationStrategy(validationStrategy.let(CfnTemplate.ValidationStrategyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("439cf12bb7bc3bdaf8c71ae4445e0fc869467e00ce792bc27dc701a7c3ffd36b")
    override
        fun validationStrategy(validationStrategy: CfnTemplate.ValidationStrategyProperty.Builder.() -> Unit):
        Unit = validationStrategy(CfnTemplate.ValidationStrategyProperty(validationStrategy))

    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnTemplateProps,
  ) : CdkObject(cdkObject), CfnTemplateProps {
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    override fun definition(): Any? = unwrap(this).getDefinition()

    override fun name(): String? = unwrap(this).getName()

    override fun permissions(): Any? = unwrap(this).getPermissions()

    override fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun templateId(): String = unwrap(this).getTemplateId()

    override fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTemplateProps):
        CfnTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateProps):
        software.amazon.awscdk.services.quicksight.CfnTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnTemplateProps
  }
}
