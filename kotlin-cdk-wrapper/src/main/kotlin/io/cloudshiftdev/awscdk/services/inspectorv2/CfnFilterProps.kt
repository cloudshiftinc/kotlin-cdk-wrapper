@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFilterProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun filterAction(): String

  public fun filterCriteria(): Any

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun filterAction(filterAction: String)

    public fun filterCriteria(filterCriteria: IResolvable)

    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e48f8ab3038abac856de7bb57c7a44f2edd2e9afc2e795911acc0b83c735ee28")
    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspectorv2.CfnFilterProps.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnFilterProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun filterAction(filterAction: String) {
      cdkBuilder.filterAction(filterAction)
    }

    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
    }

    override fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(CfnFilter.FilterCriteriaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e48f8ab3038abac856de7bb57c7a44f2edd2e9afc2e795911acc0b83c735ee28")
    override
        fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty.Builder.() -> Unit):
        Unit = filterCriteria(CfnFilter.FilterCriteriaProperty(filterCriteria))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilterProps,
  ) : CdkObject(cdkObject), CfnFilterProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun filterAction(): String = unwrap(this).getFilterAction()

    override fun filterCriteria(): Any = unwrap(this).getFilterCriteria()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilterProps):
        CfnFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFilterProps):
        software.amazon.awscdk.services.inspectorv2.CfnFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspectorv2.CfnFilterProps
  }
}
