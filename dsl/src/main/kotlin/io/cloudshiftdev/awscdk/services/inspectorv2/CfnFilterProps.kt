package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFilterProps {
  /**
   * A description of the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The action that is to be applied to the findings that match the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filteraction)
   */
  public fun filterAction(): String

  /**
   * Details on the filter criteria associated with this filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
   */
  public fun filterCriteria(): Any

  /**
   * The name of the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the filter.
     */
    public fun description(description: String)

    /**
     * @param filterAction The action that is to be applied to the findings that match the filter. 
     */
    public fun filterAction(filterAction: String)

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    public fun filterCriteria(filterCriteria: IResolvable)

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty)

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e48f8ab3038abac856de7bb57c7a44f2edd2e9afc2e795911acc0b83c735ee28")
    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty.Builder.() -> Unit)

    /**
     * @param name The name of the filter. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspectorv2.CfnFilterProps.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnFilterProps.builder()

    /**
     * @param description A description of the filter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param filterAction The action that is to be applied to the findings that match the filter. 
     */
    override fun filterAction(filterAction: String) {
      cdkBuilder.filterAction(filterAction)
    }

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
    }

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    override fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(CfnFilter.FilterCriteriaProperty::unwrap))
    }

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e48f8ab3038abac856de7bb57c7a44f2edd2e9afc2e795911acc0b83c735ee28")
    override
        fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty.Builder.() -> Unit):
        Unit = filterCriteria(CfnFilter.FilterCriteriaProperty(filterCriteria))

    /**
     * @param name The name of the filter. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilterProps,
  ) : CdkObject(cdkObject), CfnFilterProps {
    /**
     * A description of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filteraction)
     */
    override fun filterAction(): String = unwrap(this).getFilterAction()

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     */
    override fun filterCriteria(): Any = unwrap(this).getFilterCriteria()

    /**
     * The name of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-name)
     */
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
