@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rbin

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
 * Properties for defining a `CfnRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rbin.*;
 * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
 * .resourceType("resourceType")
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .retentionPeriodUnit("retentionPeriodUnit")
 * .retentionPeriodValue(123)
 * .build())
 * // the properties below are optional
 * .description("description")
 * .excludeResourceTags(List.of(ResourceTagProperty.builder()
 * .resourceTagKey("resourceTagKey")
 * .resourceTagValue("resourceTagValue")
 * .build()))
 * .lockConfiguration(UnlockDelayProperty.builder()
 * .unlockDelayUnit("unlockDelayUnit")
 * .unlockDelayValue(123)
 * .build())
 * .resourceTags(List.of(ResourceTagProperty.builder()
 * .resourceTagKey("resourceTagKey")
 * .resourceTagValue("resourceTagValue")
 * .build()))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html)
 */
public interface CfnRuleProps {
  /**
   * The retention rule description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Information about the exclude resource tags used to identify resources that are excluded by the
   * retention rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
   */
  public fun excludeResourceTags(): Any? = unwrap(this).getExcludeResourceTags()

  /**
   * Information about the retention rule lock configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
   */
  public fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

  /**
   * [Tag-level retention rules only] Information about the resource tags used to identify resources
   * that are retained by the retention rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
   */
  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * The resource type retained by the retention rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetype)
   */
  public fun resourceType(): String

  /**
   * Information about the retention period for which the retention rule is to retain resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
   */
  public fun retentionPeriod(): Any

  /**
   * The state of the retention rule.
   *
   * Only retention rules that are in the `available` state retain resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Information about the tags assigned to the retention rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The retention rule description.
     */
    public fun description(description: String)

    /**
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule.
     */
    public fun excludeResourceTags(excludeResourceTags: IResolvable)

    /**
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule.
     */
    public fun excludeResourceTags(excludeResourceTags: List<Any>)

    /**
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule.
     */
    public fun excludeResourceTags(vararg excludeResourceTags: Any)

    /**
     * @param lockConfiguration Information about the retention rule lock configuration.
     */
    public fun lockConfiguration(lockConfiguration: IResolvable)

    /**
     * @param lockConfiguration Information about the retention rule lock configuration.
     */
    public fun lockConfiguration(lockConfiguration: CfnRule.UnlockDelayProperty)

    /**
     * @param lockConfiguration Information about the retention rule lock configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("536c80ac6abb3c956c750ce79c826d993b11b09602e27a6e803f53077f490ad6")
    public fun lockConfiguration(lockConfiguration: CfnRule.UnlockDelayProperty.Builder.() -> Unit)

    /**
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule.
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule.
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule.
     */
    public fun resourceTags(vararg resourceTags: Any)

    /**
     * @param resourceType The resource type retained by the retention rule. 
     */
    public fun resourceType(resourceType: String)

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    public fun retentionPeriod(retentionPeriod: CfnRule.RetentionPeriodProperty)

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac642ce12e0fef51b029c1a62123c851e32d0446752e4d37e0e8acd7b31397c0")
    public fun retentionPeriod(retentionPeriod: CfnRule.RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * @param status The state of the retention rule.
     * Only retention rules that are in the `available` state retain resources.
     */
    public fun status(status: String)

    /**
     * @param tags Information about the tags assigned to the retention rule.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Information about the tags assigned to the retention rule.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rbin.CfnRuleProps.Builder =
        software.amazon.awscdk.services.rbin.CfnRuleProps.builder()

    /**
     * @param description The retention rule description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule.
     */
    override fun excludeResourceTags(excludeResourceTags: IResolvable) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule.
     */
    override fun excludeResourceTags(excludeResourceTags: List<Any>) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule.
     */
    override fun excludeResourceTags(vararg excludeResourceTags: Any): Unit =
        excludeResourceTags(excludeResourceTags.toList())

    /**
     * @param lockConfiguration Information about the retention rule lock configuration.
     */
    override fun lockConfiguration(lockConfiguration: IResolvable) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lockConfiguration Information about the retention rule lock configuration.
     */
    override fun lockConfiguration(lockConfiguration: CfnRule.UnlockDelayProperty) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(CfnRule.UnlockDelayProperty.Companion::unwrap))
    }

    /**
     * @param lockConfiguration Information about the retention rule lock configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("536c80ac6abb3c956c750ce79c826d993b11b09602e27a6e803f53077f490ad6")
    override
        fun lockConfiguration(lockConfiguration: CfnRule.UnlockDelayProperty.Builder.() -> Unit):
        Unit = lockConfiguration(CfnRule.UnlockDelayProperty(lockConfiguration))

    /**
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule.
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule.
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule.
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    /**
     * @param resourceType The resource type retained by the retention rule. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    override fun retentionPeriod(retentionPeriod: CfnRule.RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(CfnRule.RetentionPeriodProperty.Companion::unwrap))
    }

    /**
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac642ce12e0fef51b029c1a62123c851e32d0446752e4d37e0e8acd7b31397c0")
    override
        fun retentionPeriod(retentionPeriod: CfnRule.RetentionPeriodProperty.Builder.() -> Unit):
        Unit = retentionPeriod(CfnRule.RetentionPeriodProperty(retentionPeriod))

    /**
     * @param status The state of the retention rule.
     * Only retention rules that are in the `available` state retain resources.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags Information about the tags assigned to the retention rule.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Information about the tags assigned to the retention rule.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rbin.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rbin.CfnRuleProps,
  ) : CdkObject(cdkObject),
      CfnRuleProps {
    /**
     * The retention rule description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Information about the exclude resource tags used to identify resources that are excluded by
     * the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
     */
    override fun excludeResourceTags(): Any? = unwrap(this).getExcludeResourceTags()

    /**
     * Information about the retention rule lock configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
     */
    override fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

    /**
     * [Tag-level retention rules only] Information about the resource tags used to identify
     * resources that are retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
     */
    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * The resource type retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetype)
     */
    override fun resourceType(): String = unwrap(this).getResourceType()

    /**
     * Information about the retention period for which the retention rule is to retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
     */
    override fun retentionPeriod(): Any = unwrap(this).getRetentionPeriod()

    /**
     * The state of the retention rule.
     *
     * Only retention rules that are in the `available` state retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * Information about the tags assigned to the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rbin.CfnRuleProps): CfnRuleProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnRuleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps): software.amazon.awscdk.services.rbin.CfnRuleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rbin.CfnRuleProps
  }
}
