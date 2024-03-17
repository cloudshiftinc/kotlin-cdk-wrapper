@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendraranking

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
 * Properties for defining a `CfnExecutionPlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kendraranking.*;
 * CfnExecutionPlanProps cfnExecutionPlanProps = CfnExecutionPlanProps.builder()
 * .name("name")
 * // the properties below are optional
 * .capacityUnits(CapacityUnitsConfigurationProperty.builder()
 * .rescoreCapacityUnits(123)
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html)
 */
public interface CfnExecutionPlanProps {
  /**
   * You can set additional capacity units to meet the needs of your rescore execution plan.
   *
   * You are given a single capacity unit by default. If you want to use the default capacity, you
   * don't set additional capacity units. For more information on the default capacity and additional
   * capacity units, see [Adjusting
   * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
   */
  public fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

  /**
   * A description for the rescore execution plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name for the rescore execution plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-name)
   */
  public fun name(): String

  /**
   * A list of key-value pairs that identify or categorize your rescore execution plan.
   *
   * You can also use tags to help control access to the rescore execution plan. Tag keys and values
   * can consist of Unicode letters, digits, white space. They can also consist of underscore, period,
   * colon, equal, plus, and asperand.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnExecutionPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan.
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     */
    public fun capacityUnits(capacityUnits: IResolvable)

    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan.
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     */
    public fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty)

    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan.
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24cc9b2840e88f351dbdba3e9e529d0b6a5eee7c664b3453d75d5925d623cb8c")
    public
        fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description for the rescore execution plan.
     */
    public fun description(description: String)

    /**
     * @param name A name for the rescore execution plan. 
     */
    public fun name(name: String)

    /**
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan.
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan.
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps.Builder =
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps.builder()

    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan.
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     */
    override fun capacityUnits(capacityUnits: IResolvable) {
      cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
    }

    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan.
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     */
    override fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty) {
      cdkBuilder.capacityUnits(capacityUnits.let(CfnExecutionPlan.CapacityUnitsConfigurationProperty::unwrap))
    }

    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan.
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24cc9b2840e88f351dbdba3e9e529d0b6a5eee7c664b3453d75d5925d623cb8c")
    override
        fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder.() -> Unit):
        Unit = capacityUnits(CfnExecutionPlan.CapacityUnitsConfigurationProperty(capacityUnits))

    /**
     * @param description A description for the rescore execution plan.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the rescore execution plan. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan.
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan.
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps,
  ) : CdkObject(cdkObject), CfnExecutionPlanProps {
    /**
     * You can set additional capacity units to meet the needs of your rescore execution plan.
     *
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
     */
    override fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

    /**
     * A description for the rescore execution plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the rescore execution plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of key-value pairs that identify or categorize your rescore execution plan.
     *
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExecutionPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps):
        CfnExecutionPlanProps = CdkObjectWrappers.wrap(cdkObject) as? CfnExecutionPlanProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExecutionPlanProps):
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps
  }
}
