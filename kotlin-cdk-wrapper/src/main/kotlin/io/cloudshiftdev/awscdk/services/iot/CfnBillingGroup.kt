@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new billing group.
 *
 * Requires permission to access the
 * [CreateBillingGroup](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnBillingGroup cfnBillingGroup = CfnBillingGroup.Builder.create(this, "MyCfnBillingGroup")
 * .billingGroupName("billingGroupName")
 * .billingGroupProperties(BillingGroupPropertiesProperty.builder()
 * .billingGroupDescription("billingGroupDescription")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html)
 */
public open class CfnBillingGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the billing group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the billing group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the billing group.
   */
  public open fun billingGroupName(): String? = unwrap(this).getBillingGroupName()

  /**
   * The name of the billing group.
   */
  public open fun billingGroupName(`value`: String) {
    unwrap(this).setBillingGroupName(`value`)
  }

  /**
   * The properties of the billing group.
   */
  public open fun billingGroupProperties(): Any? = unwrap(this).getBillingGroupProperties()

  /**
   * The properties of the billing group.
   */
  public open fun billingGroupProperties(`value`: IResolvable) {
    unwrap(this).setBillingGroupProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The properties of the billing group.
   */
  public open fun billingGroupProperties(`value`: BillingGroupPropertiesProperty) {
    unwrap(this).setBillingGroupProperties(`value`.let(BillingGroupPropertiesProperty::unwrap))
  }

  /**
   * The properties of the billing group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f753c76abb0cd325eaa77a57504c7a71292cbc706237c037ada087bec85ff17")
  public open
      fun billingGroupProperties(`value`: BillingGroupPropertiesProperty.Builder.() -> Unit): Unit =
      billingGroupProperties(BillingGroupPropertiesProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the billing group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the billing group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata which can be used to manage the billing group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnBillingGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupname)
     * @param billingGroupName The name of the billing group. 
     */
    public fun billingGroupName(billingGroupName: String)

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     * @param billingGroupProperties The properties of the billing group. 
     */
    public fun billingGroupProperties(billingGroupProperties: IResolvable)

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     * @param billingGroupProperties The properties of the billing group. 
     */
    public fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty)

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     * @param billingGroupProperties The properties of the billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55dbff1410458bd4eef08c70df11ab68af290157f142e2f6921fd29524062fd5")
    public
        fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty.Builder.() -> Unit)

    /**
     * Metadata which can be used to manage the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
     * @param tags Metadata which can be used to manage the billing group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
     * @param tags Metadata which can be used to manage the billing group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnBillingGroup.Builder =
        software.amazon.awscdk.services.iot.CfnBillingGroup.Builder.create(scope, id)

    /**
     * The name of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupname)
     * @param billingGroupName The name of the billing group. 
     */
    override fun billingGroupName(billingGroupName: String) {
      cdkBuilder.billingGroupName(billingGroupName)
    }

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     * @param billingGroupProperties The properties of the billing group. 
     */
    override fun billingGroupProperties(billingGroupProperties: IResolvable) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(IResolvable::unwrap))
    }

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     * @param billingGroupProperties The properties of the billing group. 
     */
    override fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(BillingGroupPropertiesProperty::unwrap))
    }

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     * @param billingGroupProperties The properties of the billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55dbff1410458bd4eef08c70df11ab68af290157f142e2f6921fd29524062fd5")
    override
        fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty.Builder.() -> Unit):
        Unit = billingGroupProperties(BillingGroupPropertiesProperty(billingGroupProperties))

    /**
     * Metadata which can be used to manage the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
     * @param tags Metadata which can be used to manage the billing group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata which can be used to manage the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
     * @param tags Metadata which can be used to manage the billing group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnBillingGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnBillingGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBillingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBillingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroup):
        CfnBillingGroup = CfnBillingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnBillingGroup):
        software.amazon.awscdk.services.iot.CfnBillingGroup = wrapped.cdkObject
  }

  /**
   * The properties of a billing group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * BillingGroupPropertiesProperty billingGroupPropertiesProperty =
   * BillingGroupPropertiesProperty.builder()
   * .billingGroupDescription("billingGroupDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-billinggroup-billinggroupproperties.html)
   */
  public interface BillingGroupPropertiesProperty {
    /**
     * The description of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-billinggroup-billinggroupproperties.html#cfn-iot-billinggroup-billinggroupproperties-billinggroupdescription)
     */
    public fun billingGroupDescription(): String? = unwrap(this).getBillingGroupDescription()

    /**
     * A builder for [BillingGroupPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param billingGroupDescription The description of the billing group.
       */
      public fun billingGroupDescription(billingGroupDescription: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty.builder()

      /**
       * @param billingGroupDescription The description of the billing group.
       */
      override fun billingGroupDescription(billingGroupDescription: String) {
        cdkBuilder.billingGroupDescription(billingGroupDescription)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty,
    ) : CdkObject(cdkObject), BillingGroupPropertiesProperty {
      /**
       * The description of the billing group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-billinggroup-billinggroupproperties.html#cfn-iot-billinggroup-billinggroupproperties-billinggroupdescription)
       */
      override fun billingGroupDescription(): String? = unwrap(this).getBillingGroupDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BillingGroupPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty):
          BillingGroupPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BillingGroupPropertiesProperty):
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty
    }
  }
}
