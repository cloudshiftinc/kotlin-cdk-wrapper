@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCalculatedAttributeDefinitionProps {
  public fun attributeDetails(): Any

  public fun calculatedAttributeName(): String

  public fun conditions(): Any? = unwrap(this).getConditions()

  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun domainName(): String

  public fun statistic(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun attributeDetails(attributeDetails: IResolvable)

    public
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90cb636c208c8252fa2f54dab9f112639619a239f735a0e5ac6c44e4f048dede")
    public
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder.() -> Unit)

    public fun calculatedAttributeName(calculatedAttributeName: String)

    public fun conditions(conditions: IResolvable)

    public fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f77092e1f70c06621da546fe82fd4aa9ac153b69d95e7f95814cae16391490f7")
    public
        fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun domainName(domainName: String)

    public fun statistic(statistic: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps.Builder
        =
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps.builder()

    override fun attributeDetails(attributeDetails: IResolvable) {
      cdkBuilder.attributeDetails(attributeDetails.let(IResolvable::unwrap))
    }

    override
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty) {
      cdkBuilder.attributeDetails(attributeDetails.let(CfnCalculatedAttributeDefinition.AttributeDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90cb636c208c8252fa2f54dab9f112639619a239f735a0e5ac6c44e4f048dede")
    override
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder.() -> Unit):
        Unit =
        attributeDetails(CfnCalculatedAttributeDefinition.AttributeDetailsProperty(attributeDetails))

    override fun calculatedAttributeName(calculatedAttributeName: String) {
      cdkBuilder.calculatedAttributeName(calculatedAttributeName)
    }

    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
    }

    override fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty) {
      cdkBuilder.conditions(conditions.let(CfnCalculatedAttributeDefinition.ConditionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f77092e1f70c06621da546fe82fd4aa9ac153b69d95e7f95814cae16391490f7")
    override
        fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty.Builder.() -> Unit):
        Unit = conditions(CfnCalculatedAttributeDefinition.ConditionsProperty(conditions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps,
  ) : CdkObject(cdkObject), CfnCalculatedAttributeDefinitionProps {
    override fun attributeDetails(): Any = unwrap(this).getAttributeDetails()

    override fun calculatedAttributeName(): String = unwrap(this).getCalculatedAttributeName()

    override fun conditions(): Any? = unwrap(this).getConditions()

    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun statistic(): String = unwrap(this).getStatistic()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCalculatedAttributeDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps):
        CfnCalculatedAttributeDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCalculatedAttributeDefinitionProps):
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps
  }
}
