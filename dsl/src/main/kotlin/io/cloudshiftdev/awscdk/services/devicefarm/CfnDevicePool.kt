package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDevicePool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the device pool.
   *
   * See [Amazon resource
   * names](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *General
   * Reference guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The device pool's description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The device pool's description.
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
   * The number of devices that Device Farm can add to your device pool.
   */
  public open fun maxDevices(): Number? = unwrap(this).getMaxDevices()

  /**
   * The number of devices that Device Farm can add to your device pool.
   */
  public open fun maxDevices(`value`: Number) {
    unwrap(this).setMaxDevices(`value`)
  }

  /**
   * The device pool's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The device pool's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of the project for the device pool.
   */
  public open fun projectArn(): String = unwrap(this).getProjectArn()

  /**
   * The ARN of the project for the device pool.
   */
  public open fun projectArn(`value`: String) {
    unwrap(this).setProjectArn(`value`)
  }

  /**
   * The device pool's rules.
   */
  public open fun rules(): Any = unwrap(this).getRules()

  /**
   * The device pool's rules.
   */
  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * The device pool's rules.
   */
  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  /**
   * The device pool's rules.
   */
  public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devicefarm.CfnDevicePool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The device pool's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-description)
     * @param description The device pool's description. 
     */
    public fun description(description: String)

    /**
     * The number of devices that Device Farm can add to your device pool.
     *
     * Device Farm adds devices that are available and meet the criteria that you assign for the
     * `rules` parameter. Depending on how many devices meet these constraints, your device pool might
     * contain fewer devices than the value for this parameter.
     *
     * By specifying the maximum number of devices, you can control the costs that you incur by
     * running tests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-maxdevices)
     * @param maxDevices The number of devices that Device Farm can add to your device pool. 
     */
    public fun maxDevices(maxDevices: Number)

    /**
     * The device pool's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-name)
     * @param name The device pool's name. 
     */
    public fun name(name: String)

    /**
     * The ARN of the project for the device pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-projectarn)
     * @param projectArn The ARN of the project for the device pool. 
     */
    public fun projectArn(projectArn: String)

    /**
     * The device pool's rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
     * @param rules The device pool's rules. 
     */
    public fun rules(rules: IResolvable)

    /**
     * The device pool's rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
     * @param rules The device pool's rules. 
     */
    public fun rules(rules: List<Any>)

    /**
     * The device pool's rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
     * @param rules The device pool's rules. 
     */
    public fun rules(vararg rules: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnDevicePool.Builder =
        software.amazon.awscdk.services.devicefarm.CfnDevicePool.Builder.create(scope, id)

    /**
     * The device pool's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-description)
     * @param description The device pool's description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The number of devices that Device Farm can add to your device pool.
     *
     * Device Farm adds devices that are available and meet the criteria that you assign for the
     * `rules` parameter. Depending on how many devices meet these constraints, your device pool might
     * contain fewer devices than the value for this parameter.
     *
     * By specifying the maximum number of devices, you can control the costs that you incur by
     * running tests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-maxdevices)
     * @param maxDevices The number of devices that Device Farm can add to your device pool. 
     */
    override fun maxDevices(maxDevices: Number) {
      cdkBuilder.maxDevices(maxDevices)
    }

    /**
     * The device pool's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-name)
     * @param name The device pool's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of the project for the device pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-projectarn)
     * @param projectArn The ARN of the project for the device pool. 
     */
    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    /**
     * The device pool's rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
     * @param rules The device pool's rules. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * The device pool's rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
     * @param rules The device pool's rules. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * The device pool's rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
     * @param rules The device pool's rules. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnDevicePool =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devicefarm.CfnDevicePool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevicePool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevicePool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool):
        CfnDevicePool = CfnDevicePool(cdkObject)

    internal fun unwrap(wrapped: CfnDevicePool):
        software.amazon.awscdk.services.devicefarm.CfnDevicePool = wrapped.cdkObject
  }

  public interface RuleProperty {
    /**
     * The rule's stringified attribute. For example, specify the value as `"\"abc\""` .
     *
     * The supported operators for each attribute are provided in the following list.
     *
     * * **APPIUM_VERSION** - The Appium version for the test.
     *
     * Supported operators: `CONTAINS`
     *
     * * **ARN** - The Amazon Resource Name (ARN) of the device (for example,
     * `arn:aws:devicefarm:us-west-2::device:12345Example` .
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     *
     * * **AVAILABILITY** - The current availability of the device. Valid values are AVAILABLE,
     * HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.
     *
     * Supported operators: `EQUALS`
     *
     * * **FLEET_TYPE** - The fleet type. Valid values are PUBLIC or PRIVATE.
     *
     * Supported operators: `EQUALS`
     *
     * * **FORM_FACTOR** - The device form factor. Valid values are PHONE or TABLET.
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     *
     * * **INSTANCE_ARN** - The Amazon Resource Name (ARN) of the device instance.
     *
     * Supported operators: `IN` , `NOT_IN`
     *
     * * **INSTANCE_LABELS** - The label of the device instance.
     *
     * Supported operators: `CONTAINS`
     *
     * * **MANUFACTURER** - The device manufacturer (for example, Apple).
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     *
     * * **MODEL** - The device model, such as Apple iPad Air 2 or Google Pixel.
     *
     * Supported operators: `CONTAINS` , `EQUALS` , `IN` , `NOT_IN`
     *
     * * **OS_VERSION** - The operating system version (for example, 10.3.2).
     *
     * Supported operators: `EQUALS` , `GREATER_THAN` , `GREATER_THAN_OR_EQUALS` , `IN` ,
     * `LESS_THAN` , `LESS_THAN_OR_EQUALS` , `NOT_IN`
     *
     * * **PLATFORM** - The device platform. Valid values are ANDROID or IOS.
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     *
     * * **REMOTE_ACCESS_ENABLED** - Whether the device is enabled for remote access. Valid values
     * are TRUE or FALSE.
     *
     * Supported operators: `EQUALS`
     *
     * * **REMOTE_DEBUG_ENABLED** - Whether the device is enabled for remote debugging. Valid values
     * are TRUE or FALSE.
     *
     * Supported operators: `EQUALS`
     *
     * Because remote debugging is [no longer
     * supported](https://docs.aws.amazon.com/devicefarm/latest/developerguide/history.html) , this
     * filter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html#cfn-devicefarm-devicepool-rule-attribute)
     */
    public fun attribute(): String? = unwrap(this).getAttribute()

    /**
     * Specifies how Device Farm compares the rule's attribute to the value.
     *
     * For the operators that are supported by each attribute, see the attribute descriptions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html#cfn-devicefarm-devicepool-rule-operator)
     */
    public fun `operator`(): String? = unwrap(this).getOperator()

    /**
     * The rule's value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html#cfn-devicefarm-devicepool-rule-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The rule's stringified attribute. For example, specify the value as
       * `"\"abc\""` .
       * The supported operators for each attribute are provided in the following list.
       *
       * * **APPIUM_VERSION** - The Appium version for the test.
       *
       * Supported operators: `CONTAINS`
       *
       * * **ARN** - The Amazon Resource Name (ARN) of the device (for example,
       * `arn:aws:devicefarm:us-west-2::device:12345Example` .
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **AVAILABILITY** - The current availability of the device. Valid values are AVAILABLE,
       * HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.
       *
       * Supported operators: `EQUALS`
       *
       * * **FLEET_TYPE** - The fleet type. Valid values are PUBLIC or PRIVATE.
       *
       * Supported operators: `EQUALS`
       *
       * * **FORM_FACTOR** - The device form factor. Valid values are PHONE or TABLET.
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **INSTANCE_ARN** - The Amazon Resource Name (ARN) of the device instance.
       *
       * Supported operators: `IN` , `NOT_IN`
       *
       * * **INSTANCE_LABELS** - The label of the device instance.
       *
       * Supported operators: `CONTAINS`
       *
       * * **MANUFACTURER** - The device manufacturer (for example, Apple).
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **MODEL** - The device model, such as Apple iPad Air 2 or Google Pixel.
       *
       * Supported operators: `CONTAINS` , `EQUALS` , `IN` , `NOT_IN`
       *
       * * **OS_VERSION** - The operating system version (for example, 10.3.2).
       *
       * Supported operators: `EQUALS` , `GREATER_THAN` , `GREATER_THAN_OR_EQUALS` , `IN` ,
       * `LESS_THAN` , `LESS_THAN_OR_EQUALS` , `NOT_IN`
       *
       * * **PLATFORM** - The device platform. Valid values are ANDROID or IOS.
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **REMOTE_ACCESS_ENABLED** - Whether the device is enabled for remote access. Valid values
       * are TRUE or FALSE.
       *
       * Supported operators: `EQUALS`
       *
       * * **REMOTE_DEBUG_ENABLED** - Whether the device is enabled for remote debugging. Valid
       * values are TRUE or FALSE.
       *
       * Supported operators: `EQUALS`
       *
       * Because remote debugging is [no longer
       * supported](https://docs.aws.amazon.com/devicefarm/latest/developerguide/history.html) , this
       * filter is ignored.
       */
      public fun attribute(attribute: String)

      /**
       * @param operator Specifies how Device Farm compares the rule's attribute to the value.
       * For the operators that are supported by each attribute, see the attribute descriptions.
       */
      public fun `operator`(`operator`: String)

      /**
       * @param value The rule's value.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty.Builder =
          software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty.builder()

      /**
       * @param attribute The rule's stringified attribute. For example, specify the value as
       * `"\"abc\""` .
       * The supported operators for each attribute are provided in the following list.
       *
       * * **APPIUM_VERSION** - The Appium version for the test.
       *
       * Supported operators: `CONTAINS`
       *
       * * **ARN** - The Amazon Resource Name (ARN) of the device (for example,
       * `arn:aws:devicefarm:us-west-2::device:12345Example` .
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **AVAILABILITY** - The current availability of the device. Valid values are AVAILABLE,
       * HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.
       *
       * Supported operators: `EQUALS`
       *
       * * **FLEET_TYPE** - The fleet type. Valid values are PUBLIC or PRIVATE.
       *
       * Supported operators: `EQUALS`
       *
       * * **FORM_FACTOR** - The device form factor. Valid values are PHONE or TABLET.
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **INSTANCE_ARN** - The Amazon Resource Name (ARN) of the device instance.
       *
       * Supported operators: `IN` , `NOT_IN`
       *
       * * **INSTANCE_LABELS** - The label of the device instance.
       *
       * Supported operators: `CONTAINS`
       *
       * * **MANUFACTURER** - The device manufacturer (for example, Apple).
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **MODEL** - The device model, such as Apple iPad Air 2 or Google Pixel.
       *
       * Supported operators: `CONTAINS` , `EQUALS` , `IN` , `NOT_IN`
       *
       * * **OS_VERSION** - The operating system version (for example, 10.3.2).
       *
       * Supported operators: `EQUALS` , `GREATER_THAN` , `GREATER_THAN_OR_EQUALS` , `IN` ,
       * `LESS_THAN` , `LESS_THAN_OR_EQUALS` , `NOT_IN`
       *
       * * **PLATFORM** - The device platform. Valid values are ANDROID or IOS.
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **REMOTE_ACCESS_ENABLED** - Whether the device is enabled for remote access. Valid values
       * are TRUE or FALSE.
       *
       * Supported operators: `EQUALS`
       *
       * * **REMOTE_DEBUG_ENABLED** - Whether the device is enabled for remote debugging. Valid
       * values are TRUE or FALSE.
       *
       * Supported operators: `EQUALS`
       *
       * Because remote debugging is [no longer
       * supported](https://docs.aws.amazon.com/devicefarm/latest/developerguide/history.html) , this
       * filter is ignored.
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      /**
       * @param operator Specifies how Device Farm compares the rule's attribute to the value.
       * For the operators that are supported by each attribute, see the attribute descriptions.
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param value The rule's value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * The rule's stringified attribute. For example, specify the value as `"\"abc\""` .
       *
       * The supported operators for each attribute are provided in the following list.
       *
       * * **APPIUM_VERSION** - The Appium version for the test.
       *
       * Supported operators: `CONTAINS`
       *
       * * **ARN** - The Amazon Resource Name (ARN) of the device (for example,
       * `arn:aws:devicefarm:us-west-2::device:12345Example` .
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **AVAILABILITY** - The current availability of the device. Valid values are AVAILABLE,
       * HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.
       *
       * Supported operators: `EQUALS`
       *
       * * **FLEET_TYPE** - The fleet type. Valid values are PUBLIC or PRIVATE.
       *
       * Supported operators: `EQUALS`
       *
       * * **FORM_FACTOR** - The device form factor. Valid values are PHONE or TABLET.
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **INSTANCE_ARN** - The Amazon Resource Name (ARN) of the device instance.
       *
       * Supported operators: `IN` , `NOT_IN`
       *
       * * **INSTANCE_LABELS** - The label of the device instance.
       *
       * Supported operators: `CONTAINS`
       *
       * * **MANUFACTURER** - The device manufacturer (for example, Apple).
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **MODEL** - The device model, such as Apple iPad Air 2 or Google Pixel.
       *
       * Supported operators: `CONTAINS` , `EQUALS` , `IN` , `NOT_IN`
       *
       * * **OS_VERSION** - The operating system version (for example, 10.3.2).
       *
       * Supported operators: `EQUALS` , `GREATER_THAN` , `GREATER_THAN_OR_EQUALS` , `IN` ,
       * `LESS_THAN` , `LESS_THAN_OR_EQUALS` , `NOT_IN`
       *
       * * **PLATFORM** - The device platform. Valid values are ANDROID or IOS.
       *
       * Supported operators: `EQUALS` , `IN` , `NOT_IN`
       *
       * * **REMOTE_ACCESS_ENABLED** - Whether the device is enabled for remote access. Valid values
       * are TRUE or FALSE.
       *
       * Supported operators: `EQUALS`
       *
       * * **REMOTE_DEBUG_ENABLED** - Whether the device is enabled for remote debugging. Valid
       * values are TRUE or FALSE.
       *
       * Supported operators: `EQUALS`
       *
       * Because remote debugging is [no longer
       * supported](https://docs.aws.amazon.com/devicefarm/latest/developerguide/history.html) , this
       * filter is ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html#cfn-devicefarm-devicepool-rule-attribute)
       */
      override fun attribute(): String? = unwrap(this).getAttribute()

      /**
       * Specifies how Device Farm compares the rule's attribute to the value.
       *
       * For the operators that are supported by each attribute, see the attribute descriptions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html#cfn-devicefarm-devicepool-rule-operator)
       */
      override fun `operator`(): String? = unwrap(this).getOperator()

      /**
       * The rule's value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html#cfn-devicefarm-devicepool-rule-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty
    }
  }
}
