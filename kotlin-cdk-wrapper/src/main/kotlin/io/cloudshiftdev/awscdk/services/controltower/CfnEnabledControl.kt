@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The resource represents an enabled control.
 *
 * It specifies an asynchronous operation that creates AWS resources on the specified organizational
 * unit and the accounts it contains. The resources created will vary according to the control that you
 * specify.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.controltower.*;
 * Object value;
 * CfnEnabledControl cfnEnabledControl = CfnEnabledControl.Builder.create(this,
 * "MyCfnEnabledControl")
 * .controlIdentifier("controlIdentifier")
 * .targetIdentifier("targetIdentifier")
 * // the properties below are optional
 * .parameters(List.of(EnabledControlParameterProperty.builder()
 * .key("key")
 * .value(value)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
 */
public open class CfnEnabledControl internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControl,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ARN of the control.
   */
  public open fun controlIdentifier(): String = unwrap(this).getControlIdentifier()

  /**
   * The ARN of the control.
   */
  public open fun controlIdentifier(`value`: String) {
    unwrap(this).setControlIdentifier(`value`)
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
   * Array of `EnabledControlParameter` objects.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Array of `EnabledControlParameter` objects.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Array of `EnabledControlParameter` objects.
   */
  public open fun parameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setParameters(__idx_ac66f0)
  }

  /**
   * Array of `EnabledControlParameter` objects.
   */
  public open fun parameters(vararg __idx_ac66f0: Any): Unit = parameters(__idx_ac66f0.toList())

  /**
   * Tags to be applied to the enabled control.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to be applied to the enabled control.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags to be applied to the enabled control.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The ARN of the organizational unit.
   */
  public open fun targetIdentifier(): String = unwrap(this).getTargetIdentifier()

  /**
   * The ARN of the organizational unit.
   */
  public open fun targetIdentifier(`value`: String) {
    unwrap(this).setTargetIdentifier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.controltower.CfnEnabledControl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the control.
     *
     * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
     * *Region deny* control. For information on how to find the `controlIdentifier` , see [the
     * overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-controlidentifier)
     * @param controlIdentifier The ARN of the control. 
     */
    public fun controlIdentifier(controlIdentifier: String)

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     * @param parameters Array of `EnabledControlParameter` objects. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     * @param parameters Array of `EnabledControlParameter` objects. 
     */
    public fun parameters(parameters: List<Any>)

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     * @param parameters Array of `EnabledControlParameter` objects. 
     */
    public fun parameters(vararg parameters: Any)

    /**
     * Tags to be applied to the enabled control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
     * @param tags Tags to be applied to the enabled control. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to be applied to the enabled control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
     * @param tags Tags to be applied to the enabled control. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the organizational unit.
     *
     * For information on how to find the `targetIdentifier` , see [the overview
     * page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-targetidentifier)
     * @param targetIdentifier The ARN of the organizational unit. 
     */
    public fun targetIdentifier(targetIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnEnabledControl.Builder =
        software.amazon.awscdk.services.controltower.CfnEnabledControl.Builder.create(scope, id)

    /**
     * The ARN of the control.
     *
     * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
     * *Region deny* control. For information on how to find the `controlIdentifier` , see [the
     * overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-controlidentifier)
     * @param controlIdentifier The ARN of the control. 
     */
    override fun controlIdentifier(controlIdentifier: String) {
      cdkBuilder.controlIdentifier(controlIdentifier)
    }

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     * @param parameters Array of `EnabledControlParameter` objects. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     * @param parameters Array of `EnabledControlParameter` objects. 
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     * @param parameters Array of `EnabledControlParameter` objects. 
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * Tags to be applied to the enabled control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
     * @param tags Tags to be applied to the enabled control. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags to be applied to the enabled control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
     * @param tags Tags to be applied to the enabled control. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the organizational unit.
     *
     * For information on how to find the `targetIdentifier` , see [the overview
     * page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-targetidentifier)
     * @param targetIdentifier The ARN of the organizational unit. 
     */
    override fun targetIdentifier(targetIdentifier: String) {
      cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledControl =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.controltower.CfnEnabledControl.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnabledControl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnabledControl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControl):
        CfnEnabledControl = CfnEnabledControl(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledControl):
        software.amazon.awscdk.services.controltower.CfnEnabledControl = wrapped.cdkObject
  }

  /**
   * A set of parameters that configure the behavior of the enabled control.
   *
   * Expressed as a key/value pair, where `Key` is of type `String` and `Value` is of type
   * `Document` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.controltower.*;
   * Object value;
   * EnabledControlParameterProperty enabledControlParameterProperty =
   * EnabledControlParameterProperty.builder()
   * .key("key")
   * .value(value)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledcontrol-enabledcontrolparameter.html)
   */
  public interface EnabledControlParameterProperty {
    /**
     * The key of a key/value pair.
     *
     * It is of type `string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledcontrol-enabledcontrolparameter.html#cfn-controltower-enabledcontrol-enabledcontrolparameter-key)
     */
    public fun key(): String

    /**
     * The value of a key/value pair.
     *
     * It can be of type `array` , `string` , `number` , `object` , or `boolean` . [Note: The *Type*
     * field that follows may show a single type such as Number, which is only one possible type.]
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledcontrol-enabledcontrolparameter.html#cfn-controltower-enabledcontrol-enabledcontrolparameter-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [EnabledControlParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key of a key/value pair. 
       * It is of type `string` .
       */
      public fun key(key: String)

      /**
       * @param value The value of a key/value pair. 
       * It can be of type `array` , `string` , `number` , `object` , or `boolean` . [Note: The
       * *Type* field that follows may show a single type such as Number, which is only one possible
       * type.]
       */
      public fun `value`(`value`: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty.Builder
          =
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty.builder()

      /**
       * @param key The key of a key/value pair. 
       * It is of type `string` .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of a key/value pair. 
       * It can be of type `array` , `string` , `number` , `object` , or `boolean` . [Note: The
       * *Type* field that follows may show a single type such as Number, which is only one possible
       * type.]
       */
      override fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty,
    ) : CdkObject(cdkObject), EnabledControlParameterProperty {
      /**
       * The key of a key/value pair.
       *
       * It is of type `string` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledcontrol-enabledcontrolparameter.html#cfn-controltower-enabledcontrol-enabledcontrolparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of a key/value pair.
       *
       * It can be of type `array` , `string` , `number` , `object` , or `boolean` . [Note: The
       * *Type* field that follows may show a single type such as Number, which is only one possible
       * type.]
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledcontrol-enabledcontrolparameter.html#cfn-controltower-enabledcontrol-enabledcontrolparameter-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnabledControlParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty):
          EnabledControlParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnabledControlParameterProperty):
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty
    }
  }
}
