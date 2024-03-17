@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendraranking

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a rescore execution plan.
 *
 * A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning
 * the `Rescore` API. You set the number of capacity units that you require for Amazon Kendra
 * Intelligent Ranking to rescore or re-rank a search service's results.
 *
 * For an example of using the `CreateRescoreExecutionPlan` API, including using the Python and Java
 * SDKs, see [Semantically ranking a search service's
 * results](https://docs.aws.amazon.com/kendra/latest/dg/search-service-rerank.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kendraranking.*;
 * CfnExecutionPlan cfnExecutionPlan = CfnExecutionPlan.Builder.create(this, "MyCfnExecutionPlan")
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
public open class CfnExecutionPlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the rescore execution plan.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The identifier of the rescore execution plan.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * You can set additional capacity units to meet the needs of your rescore execution plan.
   */
  public open fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

  /**
   * You can set additional capacity units to meet the needs of your rescore execution plan.
   */
  public open fun capacityUnits(`value`: IResolvable) {
    unwrap(this).setCapacityUnits(`value`.let(IResolvable::unwrap))
  }

  /**
   * You can set additional capacity units to meet the needs of your rescore execution plan.
   */
  public open fun capacityUnits(`value`: CapacityUnitsConfigurationProperty) {
    unwrap(this).setCapacityUnits(`value`.let(CapacityUnitsConfigurationProperty::unwrap))
  }

  /**
   * You can set additional capacity units to meet the needs of your rescore execution plan.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("570b14833c90f2501a4684db2a2bea10f73daeaaa583d3eb54249322b156a911")
  public open fun capacityUnits(`value`: CapacityUnitsConfigurationProperty.Builder.() -> Unit):
      Unit = capacityUnits(CapacityUnitsConfigurationProperty(`value`))

  /**
   * A description for the rescore execution plan.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the rescore execution plan.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A name for the rescore execution plan.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the rescore execution plan.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that identify or categorize your rescore execution plan.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that identify or categorize your rescore execution plan.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize your rescore execution plan.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kendraranking.CfnExecutionPlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * You can set additional capacity units to meet the needs of your rescore execution plan.
     *
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan. 
     */
    public fun capacityUnits(capacityUnits: IResolvable)

    /**
     * You can set additional capacity units to meet the needs of your rescore execution plan.
     *
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan. 
     */
    public fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty)

    /**
     * You can set additional capacity units to meet the needs of your rescore execution plan.
     *
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f0487232fc9542eb49e50bc9ac7b57ac3f877147a4709a33d881524d6dd2607")
    public fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit)

    /**
     * A description for the rescore execution plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-description)
     * @param description A description for the rescore execution plan. 
     */
    public fun description(description: String)

    /**
     * A name for the rescore execution plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-name)
     * @param name A name for the rescore execution plan. 
     */
    public fun name(name: String)

    /**
     * A list of key-value pairs that identify or categorize your rescore execution plan.
     *
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize your rescore execution plan.
     *
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.Builder =
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.Builder.create(scope, id)

    /**
     * You can set additional capacity units to meet the needs of your rescore execution plan.
     *
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan. 
     */
    override fun capacityUnits(capacityUnits: IResolvable) {
      cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
    }

    /**
     * You can set additional capacity units to meet the needs of your rescore execution plan.
     *
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan. 
     */
    override fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty) {
      cdkBuilder.capacityUnits(capacityUnits.let(CapacityUnitsConfigurationProperty::unwrap))
    }

    /**
     * You can set additional capacity units to meet the needs of your rescore execution plan.
     *
     * You are given a single capacity unit by default. If you want to use the default capacity, you
     * don't set additional capacity units. For more information on the default capacity and additional
     * capacity units, see [Adjusting
     * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     * execution plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f0487232fc9542eb49e50bc9ac7b57ac3f877147a4709a33d881524d6dd2607")
    override
        fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit):
        Unit = capacityUnits(CapacityUnitsConfigurationProperty(capacityUnits))

    /**
     * A description for the rescore execution plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-description)
     * @param description A description for the rescore execution plan. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name for the rescore execution plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-name)
     * @param name A name for the rescore execution plan. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of key-value pairs that identify or categorize your rescore execution plan.
     *
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize your rescore execution plan.
     *
     * You can also use tags to help control access to the rescore execution plan. Tag keys and
     * values can consist of Unicode letters, digits, white space. They can also consist of underscore,
     * period, colon, equal, plus, and asperand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     * plan. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendraranking.CfnExecutionPlan =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExecutionPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExecutionPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan):
        CfnExecutionPlan = CfnExecutionPlan(cdkObject)

    internal fun unwrap(wrapped: CfnExecutionPlan):
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlan = wrapped.cdkObject
  }

  /**
   * Sets additional capacity units configured for your rescore execution plan.
   *
   * A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning
   * the `Rescore` API. You can add and remove capacity units to fit your usage requirements.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendraranking.*;
   * CapacityUnitsConfigurationProperty capacityUnitsConfigurationProperty =
   * CapacityUnitsConfigurationProperty.builder()
   * .rescoreCapacityUnits(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendraranking-executionplan-capacityunitsconfiguration.html)
   */
  public interface CapacityUnitsConfigurationProperty {
    /**
     * The amount of extra capacity for your rescore execution plan.
     *
     * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per
     * second. You can add up to 1000 extra capacity units.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendraranking-executionplan-capacityunitsconfiguration.html#cfn-kendraranking-executionplan-capacityunitsconfiguration-rescorecapacityunits)
     */
    public fun rescoreCapacityUnits(): Number

    /**
     * A builder for [CapacityUnitsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rescoreCapacityUnits The amount of extra capacity for your rescore execution plan. 
       * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests
       * per second. You can add up to 1000 extra capacity units.
       */
      public fun rescoreCapacityUnits(rescoreCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty.builder()

      /**
       * @param rescoreCapacityUnits The amount of extra capacity for your rescore execution plan. 
       * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests
       * per second. You can add up to 1000 extra capacity units.
       */
      override fun rescoreCapacityUnits(rescoreCapacityUnits: Number) {
        cdkBuilder.rescoreCapacityUnits(rescoreCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty,
    ) : CdkObject(cdkObject), CapacityUnitsConfigurationProperty {
      /**
       * The amount of extra capacity for your rescore execution plan.
       *
       * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests
       * per second. You can add up to 1000 extra capacity units.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendraranking-executionplan-capacityunitsconfiguration.html#cfn-kendraranking-executionplan-capacityunitsconfiguration-rescorecapacityunits)
       */
      override fun rescoreCapacityUnits(): Number = unwrap(this).getRescoreCapacityUnits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityUnitsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty):
          CapacityUnitsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CapacityUnitsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityUnitsConfigurationProperty):
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty
    }
  }
}
