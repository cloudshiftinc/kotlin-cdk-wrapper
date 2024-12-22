@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rbin

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * Creates a Recycle Bin retention rule. You can create two types of retention rules:.
 *
 * * *Tag-level retention rules* - These retention rules use resource tags to identify the resources
 * to protect. For each retention rule, you specify one or more tag key and value pairs. Resources (of
 * the specified type) that have at least one of these tag key and value pairs are automatically
 * retained in the Recycle Bin upon deletion. Use this type of retention rule to protect specific
 * resources in your account based on their tags.
 * * *Region-level retention rules* - These retention rules, by default, apply to all of the
 * resources (of the specified type) in the Region, even if the resources are not tagged. However, you
 * can specify exclusion tags to exclude resources that have specific tags. Use this type of retention
 * rule to protect all resources of a specific type in a Region.
 *
 * For more information, see [Create Recycle Bin retention
 * rules](https://docs.aws.amazon.com/ebs/latest/userguide/recycle-bin.html) in the *Amazon EBS User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rbin.*;
 * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
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
public open class CfnRule(
  cdkObject: software.amazon.awscdk.services.rbin.CfnRule,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps,
  ) :
      this(software.amazon.awscdk.services.rbin.CfnRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRuleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the retention rule.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique ID of the retention rule.
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * [Region-level retention rules only] The lock state for the retention rule.
   *
   * * `locked` - The retention rule is locked and can't be modified or deleted.
   * * `pending_unlock` - The retention rule has been unlocked but it is still within the unlock
   * delay period. The retention rule can be modified or deleted only after the unlock delay period has
   * expired.
   * * `unlocked` - The retention rule is unlocked and it can be modified or deleted by any user
   * with the required permissions.
   * * `null` - The retention rule has never been locked. Once a retention rule has been locked, it
   * can transition between the `locked` and `unlocked` states only; it can never transition back to
   * `null` .
   */
  public open fun attrLockState(): String = unwrap(this).getAttrLockState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The retention rule description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The retention rule description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Information about the exclude resource tags used to identify resources that are excluded by the
   * retention rule.
   */
  public open fun excludeResourceTags(): Any? = unwrap(this).getExcludeResourceTags()

  /**
   * Information about the exclude resource tags used to identify resources that are excluded by the
   * retention rule.
   */
  public open fun excludeResourceTags(`value`: IResolvable) {
    unwrap(this).setExcludeResourceTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the exclude resource tags used to identify resources that are excluded by the
   * retention rule.
   */
  public open fun excludeResourceTags(`value`: List<Any>) {
    unwrap(this).setExcludeResourceTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Information about the exclude resource tags used to identify resources that are excluded by the
   * retention rule.
   */
  public open fun excludeResourceTags(vararg `value`: Any): Unit =
      excludeResourceTags(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Information about the retention rule lock configuration.
   */
  public open fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

  /**
   * Information about the retention rule lock configuration.
   */
  public open fun lockConfiguration(`value`: IResolvable) {
    unwrap(this).setLockConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the retention rule lock configuration.
   */
  public open fun lockConfiguration(`value`: UnlockDelayProperty) {
    unwrap(this).setLockConfiguration(`value`.let(UnlockDelayProperty.Companion::unwrap))
  }

  /**
   * Information about the retention rule lock configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96d268fea8c87bef01299750033c0d786ac560b91c918d22b940d425910ede49")
  public open fun lockConfiguration(`value`: UnlockDelayProperty.Builder.() -> Unit): Unit =
      lockConfiguration(UnlockDelayProperty(`value`))

  /**
   * [Tag-level retention rules only] Information about the resource tags used to identify resources
   * that are retained by the retention rule.
   */
  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * [Tag-level retention rules only] Information about the resource tags used to identify resources
   * that are retained by the retention rule.
   */
  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * [Tag-level retention rules only] Information about the resource tags used to identify resources
   * that are retained by the retention rule.
   */
  public open fun resourceTags(`value`: List<Any>) {
    unwrap(this).setResourceTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * [Tag-level retention rules only] Information about the resource tags used to identify resources
   * that are retained by the retention rule.
   */
  public open fun resourceTags(vararg `value`: Any): Unit = resourceTags(`value`.toList())

  /**
   * The resource type retained by the retention rule.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * The resource type retained by the retention rule.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * Information about the retention period for which the retention rule is to retain resources.
   */
  public open fun retentionPeriod(): Any = unwrap(this).getRetentionPeriod()

  /**
   * Information about the retention period for which the retention rule is to retain resources.
   */
  public open fun retentionPeriod(`value`: IResolvable) {
    unwrap(this).setRetentionPeriod(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the retention period for which the retention rule is to retain resources.
   */
  public open fun retentionPeriod(`value`: RetentionPeriodProperty) {
    unwrap(this).setRetentionPeriod(`value`.let(RetentionPeriodProperty.Companion::unwrap))
  }

  /**
   * Information about the retention period for which the retention rule is to retain resources.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b48d5d6be19881592b3336f6f7aa9cd7e90ec63cd12594373b6ffef975caea1")
  public open fun retentionPeriod(`value`: RetentionPeriodProperty.Builder.() -> Unit): Unit =
      retentionPeriod(RetentionPeriodProperty(`value`))

  /**
   * The state of the retention rule.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The state of the retention rule.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Information about the tags assigned to the retention rule.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Information about the tags assigned to the retention rule.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Information about the tags assigned to the retention rule.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rbin.CfnRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The retention rule description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-description)
     * @param description The retention rule description. 
     */
    public fun description(description: String)

    /**
     * Information about the exclude resource tags used to identify resources that are excluded by
     * the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule. 
     */
    public fun excludeResourceTags(excludeResourceTags: IResolvable)

    /**
     * Information about the exclude resource tags used to identify resources that are excluded by
     * the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule. 
     */
    public fun excludeResourceTags(excludeResourceTags: List<Any>)

    /**
     * Information about the exclude resource tags used to identify resources that are excluded by
     * the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule. 
     */
    public fun excludeResourceTags(vararg excludeResourceTags: Any)

    /**
     * Information about the retention rule lock configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
     * @param lockConfiguration Information about the retention rule lock configuration. 
     */
    public fun lockConfiguration(lockConfiguration: IResolvable)

    /**
     * Information about the retention rule lock configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
     * @param lockConfiguration Information about the retention rule lock configuration. 
     */
    public fun lockConfiguration(lockConfiguration: UnlockDelayProperty)

    /**
     * Information about the retention rule lock configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
     * @param lockConfiguration Information about the retention rule lock configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45f12b0113a91fca09ac91e24fd5091e86949611f442a7910543e841c23619e1")
    public fun lockConfiguration(lockConfiguration: UnlockDelayProperty.Builder.() -> Unit)

    /**
     * [Tag-level retention rules only] Information about the resource tags used to identify
     * resources that are retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule. 
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * [Tag-level retention rules only] Information about the resource tags used to identify
     * resources that are retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule. 
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * [Tag-level retention rules only] Information about the resource tags used to identify
     * resources that are retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule. 
     */
    public fun resourceTags(vararg resourceTags: Any)

    /**
     * The resource type retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetype)
     * @param resourceType The resource type retained by the retention rule. 
     */
    public fun resourceType(resourceType: String)

    /**
     * Information about the retention period for which the retention rule is to retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * Information about the retention period for which the retention rule is to retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty)

    /**
     * Information about the retention period for which the retention rule is to retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26434f251c938f682d25501d0b9547329ec0d22ea63e9586a36090eb68cb1942")
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * The state of the retention rule.
     *
     * Only retention rules that are in the `available` state retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-status)
     * @param status The state of the retention rule. 
     */
    public fun status(status: String)

    /**
     * Information about the tags assigned to the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-tags)
     * @param tags Information about the tags assigned to the retention rule. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Information about the tags assigned to the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-tags)
     * @param tags Information about the tags assigned to the retention rule. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rbin.CfnRule.Builder =
        software.amazon.awscdk.services.rbin.CfnRule.Builder.create(scope, id)

    /**
     * The retention rule description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-description)
     * @param description The retention rule description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Information about the exclude resource tags used to identify resources that are excluded by
     * the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule. 
     */
    override fun excludeResourceTags(excludeResourceTags: IResolvable) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the exclude resource tags used to identify resources that are excluded by
     * the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule. 
     */
    override fun excludeResourceTags(excludeResourceTags: List<Any>) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Information about the exclude resource tags used to identify resources that are excluded by
     * the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-excluderesourcetags)
     * @param excludeResourceTags Information about the exclude resource tags used to identify
     * resources that are excluded by the retention rule. 
     */
    override fun excludeResourceTags(vararg excludeResourceTags: Any): Unit =
        excludeResourceTags(excludeResourceTags.toList())

    /**
     * Information about the retention rule lock configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
     * @param lockConfiguration Information about the retention rule lock configuration. 
     */
    override fun lockConfiguration(lockConfiguration: IResolvable) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the retention rule lock configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
     * @param lockConfiguration Information about the retention rule lock configuration. 
     */
    override fun lockConfiguration(lockConfiguration: UnlockDelayProperty) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(UnlockDelayProperty.Companion::unwrap))
    }

    /**
     * Information about the retention rule lock configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-lockconfiguration)
     * @param lockConfiguration Information about the retention rule lock configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45f12b0113a91fca09ac91e24fd5091e86949611f442a7910543e841c23619e1")
    override fun lockConfiguration(lockConfiguration: UnlockDelayProperty.Builder.() -> Unit): Unit
        = lockConfiguration(UnlockDelayProperty(lockConfiguration))

    /**
     * [Tag-level retention rules only] Information about the resource tags used to identify
     * resources that are retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule. 
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Tag-level retention rules only] Information about the resource tags used to identify
     * resources that are retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule. 
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Tag-level retention rules only] Information about the resource tags used to identify
     * resources that are retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetags)
     * @param resourceTags [Tag-level retention rules only] Information about the resource tags used
     * to identify resources that are retained by the retention rule. 
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    /**
     * The resource type retained by the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-resourcetype)
     * @param resourceType The resource type retained by the retention rule. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * Information about the retention period for which the retention rule is to retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the retention period for which the retention rule is to retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(RetentionPeriodProperty.Companion::unwrap))
    }

    /**
     * Information about the retention period for which the retention rule is to retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-retentionperiod)
     * @param retentionPeriod Information about the retention period for which the retention rule is
     * to retain resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26434f251c938f682d25501d0b9547329ec0d22ea63e9586a36090eb68cb1942")
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit): Unit
        = retentionPeriod(RetentionPeriodProperty(retentionPeriod))

    /**
     * The state of the retention rule.
     *
     * Only retention rules that are in the `available` state retain resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-status)
     * @param status The state of the retention rule. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * Information about the tags assigned to the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-tags)
     * @param tags Information about the tags assigned to the retention rule. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Information about the tags assigned to the retention rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rbin-rule.html#cfn-rbin-rule-tags)
     * @param tags Information about the tags assigned to the retention rule. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rbin.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rbin.CfnRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rbin.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.rbin.CfnRule =
        wrapped.cdkObject as software.amazon.awscdk.services.rbin.CfnRule
  }

  /**
   * [Tag-level retention rules only] Information about the resource tags used to identify resources
   * that are retained by the retention rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rbin.*;
   * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
   * .resourceTagKey("resourceTagKey")
   * .resourceTagValue("resourceTagValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-resourcetag.html)
   */
  public interface ResourceTagProperty {
    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-resourcetag.html#cfn-rbin-rule-resourcetag-resourcetagkey)
     */
    public fun resourceTagKey(): String

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-resourcetag.html#cfn-rbin-rule-resourcetag-resourcetagvalue)
     */
    public fun resourceTagValue(): String

    /**
     * A builder for [ResourceTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceTagKey The tag key. 
       */
      public fun resourceTagKey(resourceTagKey: String)

      /**
       * @param resourceTagValue The tag value. 
       */
      public fun resourceTagValue(resourceTagValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rbin.CfnRule.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.rbin.CfnRule.ResourceTagProperty.builder()

      /**
       * @param resourceTagKey The tag key. 
       */
      override fun resourceTagKey(resourceTagKey: String) {
        cdkBuilder.resourceTagKey(resourceTagKey)
      }

      /**
       * @param resourceTagValue The tag value. 
       */
      override fun resourceTagValue(resourceTagValue: String) {
        cdkBuilder.resourceTagValue(resourceTagValue)
      }

      public fun build(): software.amazon.awscdk.services.rbin.CfnRule.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rbin.CfnRule.ResourceTagProperty,
    ) : CdkObject(cdkObject),
        ResourceTagProperty {
      /**
       * The tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-resourcetag.html#cfn-rbin-rule-resourcetag-resourcetagkey)
       */
      override fun resourceTagKey(): String = unwrap(this).getResourceTagKey()

      /**
       * The tag value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-resourcetag.html#cfn-rbin-rule-resourcetag-resourcetagvalue)
       */
      override fun resourceTagValue(): String = unwrap(this).getResourceTagValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rbin.CfnRule.ResourceTagProperty):
          ResourceTagProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceTagProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.rbin.CfnRule.ResourceTagProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rbin.CfnRule.ResourceTagProperty
    }
  }

  /**
   * Information about the retention period for which the retention rule is to retain resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rbin.*;
   * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
   * .retentionPeriodUnit("retentionPeriodUnit")
   * .retentionPeriodValue(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-retentionperiod.html)
   */
  public interface RetentionPeriodProperty {
    /**
     * The unit of time in which the retention period is measured.
     *
     * Currently, only `DAYS` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-retentionperiod.html#cfn-rbin-rule-retentionperiod-retentionperiodunit)
     */
    public fun retentionPeriodUnit(): String

    /**
     * The period value for which the retention rule is to retain resources.
     *
     * The period is measured using the unit specified for *RetentionPeriodUnit* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-retentionperiod.html#cfn-rbin-rule-retentionperiod-retentionperiodvalue)
     */
    public fun retentionPeriodValue(): Number

    /**
     * A builder for [RetentionPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param retentionPeriodUnit The unit of time in which the retention period is measured. 
       * Currently, only `DAYS` is supported.
       */
      public fun retentionPeriodUnit(retentionPeriodUnit: String)

      /**
       * @param retentionPeriodValue The period value for which the retention rule is to retain
       * resources. 
       * The period is measured using the unit specified for *RetentionPeriodUnit* .
       */
      public fun retentionPeriodValue(retentionPeriodValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rbin.CfnRule.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.rbin.CfnRule.RetentionPeriodProperty.builder()

      /**
       * @param retentionPeriodUnit The unit of time in which the retention period is measured. 
       * Currently, only `DAYS` is supported.
       */
      override fun retentionPeriodUnit(retentionPeriodUnit: String) {
        cdkBuilder.retentionPeriodUnit(retentionPeriodUnit)
      }

      /**
       * @param retentionPeriodValue The period value for which the retention rule is to retain
       * resources. 
       * The period is measured using the unit specified for *RetentionPeriodUnit* .
       */
      override fun retentionPeriodValue(retentionPeriodValue: Number) {
        cdkBuilder.retentionPeriodValue(retentionPeriodValue)
      }

      public fun build(): software.amazon.awscdk.services.rbin.CfnRule.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rbin.CfnRule.RetentionPeriodProperty,
    ) : CdkObject(cdkObject),
        RetentionPeriodProperty {
      /**
       * The unit of time in which the retention period is measured.
       *
       * Currently, only `DAYS` is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-retentionperiod.html#cfn-rbin-rule-retentionperiod-retentionperiodunit)
       */
      override fun retentionPeriodUnit(): String = unwrap(this).getRetentionPeriodUnit()

      /**
       * The period value for which the retention rule is to retain resources.
       *
       * The period is measured using the unit specified for *RetentionPeriodUnit* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-retentionperiod.html#cfn-rbin-rule-retentionperiod-retentionperiodvalue)
       */
      override fun retentionPeriodValue(): Number = unwrap(this).getRetentionPeriodValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rbin.CfnRule.RetentionPeriodProperty):
          RetentionPeriodProperty = CdkObjectWrappers.wrap(cdkObject) as? RetentionPeriodProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.rbin.CfnRule.RetentionPeriodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rbin.CfnRule.RetentionPeriodProperty
    }
  }

  /**
   * Information about the retention rule unlock delay.
   *
   * The unlock delay is the period after which a retention rule can be modified or edited after it
   * has been unlocked by a user with the required permissions. The retention rule can't be modified or
   * deleted during the unlock delay.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rbin.*;
   * UnlockDelayProperty unlockDelayProperty = UnlockDelayProperty.builder()
   * .unlockDelayUnit("unlockDelayUnit")
   * .unlockDelayValue(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-unlockdelay.html)
   */
  public interface UnlockDelayProperty {
    /**
     * The unit of time in which to measure the unlock delay.
     *
     * Currently, the unlock delay can be measure only in days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-unlockdelay.html#cfn-rbin-rule-unlockdelay-unlockdelayunit)
     */
    public fun unlockDelayUnit(): String? = unwrap(this).getUnlockDelayUnit()

    /**
     * The unlock delay period, measured in the unit specified for *UnlockDelayUnit* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-unlockdelay.html#cfn-rbin-rule-unlockdelay-unlockdelayvalue)
     */
    public fun unlockDelayValue(): Number? = unwrap(this).getUnlockDelayValue()

    /**
     * A builder for [UnlockDelayProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unlockDelayUnit The unit of time in which to measure the unlock delay.
       * Currently, the unlock delay can be measure only in days.
       */
      public fun unlockDelayUnit(unlockDelayUnit: String)

      /**
       * @param unlockDelayValue The unlock delay period, measured in the unit specified for
       * *UnlockDelayUnit* .
       */
      public fun unlockDelayValue(unlockDelayValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rbin.CfnRule.UnlockDelayProperty.Builder =
          software.amazon.awscdk.services.rbin.CfnRule.UnlockDelayProperty.builder()

      /**
       * @param unlockDelayUnit The unit of time in which to measure the unlock delay.
       * Currently, the unlock delay can be measure only in days.
       */
      override fun unlockDelayUnit(unlockDelayUnit: String) {
        cdkBuilder.unlockDelayUnit(unlockDelayUnit)
      }

      /**
       * @param unlockDelayValue The unlock delay period, measured in the unit specified for
       * *UnlockDelayUnit* .
       */
      override fun unlockDelayValue(unlockDelayValue: Number) {
        cdkBuilder.unlockDelayValue(unlockDelayValue)
      }

      public fun build(): software.amazon.awscdk.services.rbin.CfnRule.UnlockDelayProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rbin.CfnRule.UnlockDelayProperty,
    ) : CdkObject(cdkObject),
        UnlockDelayProperty {
      /**
       * The unit of time in which to measure the unlock delay.
       *
       * Currently, the unlock delay can be measure only in days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-unlockdelay.html#cfn-rbin-rule-unlockdelay-unlockdelayunit)
       */
      override fun unlockDelayUnit(): String? = unwrap(this).getUnlockDelayUnit()

      /**
       * The unlock delay period, measured in the unit specified for *UnlockDelayUnit* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rbin-rule-unlockdelay.html#cfn-rbin-rule-unlockdelay-unlockdelayvalue)
       */
      override fun unlockDelayValue(): Number? = unwrap(this).getUnlockDelayValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UnlockDelayProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rbin.CfnRule.UnlockDelayProperty):
          UnlockDelayProperty = CdkObjectWrappers.wrap(cdkObject) as? UnlockDelayProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UnlockDelayProperty):
          software.amazon.awscdk.services.rbin.CfnRule.UnlockDelayProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rbin.CfnRule.UnlockDelayProperty
    }
  }
}
