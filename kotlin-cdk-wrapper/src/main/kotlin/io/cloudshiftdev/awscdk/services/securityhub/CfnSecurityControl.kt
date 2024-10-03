@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::SecurityControl` resource specifies custom parameter values for an AWS
 * Security Hub control.
 *
 * For a list of controls that support custom parameters, see [Security Hub controls
 * reference](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-controls-reference.html)
 * . You can also use this resource to specify the use of default parameter values for a control. For
 * more information about custom parameters, see [Custom control
 * parameters](https://docs.aws.amazon.com/securityhub/latest/userguide/custom-control-parameters.html)
 * in the *AWS Security Hub User Guide* .
 *
 * Tags aren't supported for this resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnSecurityControl cfnSecurityControl = CfnSecurityControl.Builder.create(this,
 * "MyCfnSecurityControl")
 * .parameters(Map.of(
 * "parametersKey", ParameterConfigurationProperty.builder()
 * .valueType("valueType")
 * // the properties below are optional
 * .value(ParameterValueProperty.builder()
 * .boolean(false)
 * .double(123)
 * .enum("enum")
 * .enumList(List.of("enumList"))
 * .integer(123)
 * .integerList(List.of(123))
 * .string("string")
 * .stringList(List.of("stringList"))
 * .build())
 * .build()))
 * // the properties below are optional
 * .lastUpdateReason("lastUpdateReason")
 * .securityControlArn("securityControlArn")
 * .securityControlId("securityControlId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html)
 */
public open class CfnSecurityControl(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControl,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityControlProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnSecurityControl(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSecurityControlProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityControlProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityControlProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The most recent reason for updating the customizable properties of a security control.
   */
  public open fun lastUpdateReason(): String? = unwrap(this).getLastUpdateReason()

  /**
   * The most recent reason for updating the customizable properties of a security control.
   */
  public open fun lastUpdateReason(`value`: String) {
    unwrap(this).setLastUpdateReason(`value`)
  }

  /**
   * An object that identifies the name of a control parameter, its current value, and whether it
   * has been customized.
   */
  public open fun parameters(): Any = unwrap(this).getParameters()

  /**
   * An object that identifies the name of a control parameter, its current value, and whether it
   * has been customized.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that identifies the name of a control parameter, its current value, and whether it
   * has been customized.
   */
  public open fun parameters(`value`: Map<String, Any>) {
    unwrap(this).setParameters(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * The Amazon Resource Name (ARN) for a security control across standards, such as
   * `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This parameter doesn't
   * mention a specific standard.
   */
  public open fun securityControlArn(): String? = unwrap(this).getSecurityControlArn()

  /**
   * The Amazon Resource Name (ARN) for a security control across standards, such as
   * `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This parameter doesn't
   * mention a specific standard.
   */
  public open fun securityControlArn(`value`: String) {
    unwrap(this).setSecurityControlArn(`value`)
  }

  /**
   * The unique identifier of a security control across standards.
   */
  public open fun securityControlId(): String? = unwrap(this).getSecurityControlId()

  /**
   * The unique identifier of a security control across standards.
   */
  public open fun securityControlId(`value`: String) {
    unwrap(this).setSecurityControlId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnSecurityControl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The most recent reason for updating the customizable properties of a security control.
     *
     * This differs from the `UpdateReason` field of the
     * [`BatchUpdateStandardsControlAssociations`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html)
     * API, which tracks the reason for updating the enablement status of a control. This field accepts
     * alphanumeric characters in addition to white spaces, dashes, and underscores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-lastupdatereason)
     * @param lastUpdateReason The most recent reason for updating the customizable properties of a
     * security control. 
     */
    public fun lastUpdateReason(lastUpdateReason: String)

    /**
     * An object that identifies the name of a control parameter, its current value, and whether it
     * has been customized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-parameters)
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * An object that identifies the name of a control parameter, its current value, and whether it
     * has been customized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-parameters)
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * The Amazon Resource Name (ARN) for a security control across standards, such as
     * `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This parameter doesn't
     * mention a specific standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolarn)
     * @param securityControlArn The Amazon Resource Name (ARN) for a security control across
     * standards, such as `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This
     * parameter doesn't mention a specific standard. 
     */
    public fun securityControlArn(securityControlArn: String)

    /**
     * The unique identifier of a security control across standards.
     *
     * Values for this field typically consist of an AWS service name and a number, such as
     * APIGateway.3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolid)
     * @param securityControlId The unique identifier of a security control across standards. 
     */
    public fun securityControlId(securityControlId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnSecurityControl.Builder =
        software.amazon.awscdk.services.securityhub.CfnSecurityControl.Builder.create(scope, id)

    /**
     * The most recent reason for updating the customizable properties of a security control.
     *
     * This differs from the `UpdateReason` field of the
     * [`BatchUpdateStandardsControlAssociations`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html)
     * API, which tracks the reason for updating the enablement status of a control. This field accepts
     * alphanumeric characters in addition to white spaces, dashes, and underscores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-lastupdatereason)
     * @param lastUpdateReason The most recent reason for updating the customizable properties of a
     * security control. 
     */
    override fun lastUpdateReason(lastUpdateReason: String) {
      cdkBuilder.lastUpdateReason(lastUpdateReason)
    }

    /**
     * An object that identifies the name of a control parameter, its current value, and whether it
     * has been customized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-parameters)
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that identifies the name of a control parameter, its current value, and whether it
     * has been customized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-parameters)
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The Amazon Resource Name (ARN) for a security control across standards, such as
     * `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This parameter doesn't
     * mention a specific standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolarn)
     * @param securityControlArn The Amazon Resource Name (ARN) for a security control across
     * standards, such as `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This
     * parameter doesn't mention a specific standard. 
     */
    override fun securityControlArn(securityControlArn: String) {
      cdkBuilder.securityControlArn(securityControlArn)
    }

    /**
     * The unique identifier of a security control across standards.
     *
     * Values for this field typically consist of an AWS service name and a number, such as
     * APIGateway.3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolid)
     * @param securityControlId The unique identifier of a security control across standards. 
     */
    override fun securityControlId(securityControlId: String) {
      cdkBuilder.securityControlId(securityControlId)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnSecurityControl =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnSecurityControl.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityControl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityControl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControl):
        CfnSecurityControl = CfnSecurityControl(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityControl):
        software.amazon.awscdk.services.securityhub.CfnSecurityControl = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnSecurityControl
  }

  /**
   * An object that provides the current value of a security control parameter and identifies
   * whether it has been customized.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * ParameterConfigurationProperty parameterConfigurationProperty =
   * ParameterConfigurationProperty.builder()
   * .valueType("valueType")
   * // the properties below are optional
   * .value(ParameterValueProperty.builder()
   * .boolean(false)
   * .double(123)
   * .enum("enum")
   * .enumList(List.of("enumList"))
   * .integer(123)
   * .integerList(List.of(123))
   * .string("string")
   * .stringList(List.of("stringList"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parameterconfiguration.html)
   */
  public interface ParameterConfigurationProperty {
    /**
     * The current value of a control parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parameterconfiguration.html#cfn-securityhub-securitycontrol-parameterconfiguration-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * Identifies whether a control parameter uses a custom user-defined value or subscribes to the
     * default AWS Security Hub behavior.
     *
     * When `ValueType` is set equal to `DEFAULT` , the default behavior can be a specific Security
     * Hub default value, or the default behavior can be to ignore a specific parameter. When
     * `ValueType` is set equal to `DEFAULT` , Security Hub ignores user-provided input for the `Value`
     * field.
     *
     * When `ValueType` is set equal to `CUSTOM` , the `Value` field can't be empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parameterconfiguration.html#cfn-securityhub-securitycontrol-parameterconfiguration-valuetype)
     */
    public fun valueType(): String

    /**
     * A builder for [ParameterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The current value of a control parameter.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The current value of a control parameter.
       */
      public fun `value`(`value`: ParameterValueProperty)

      /**
       * @param value The current value of a control parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1970bd9e66d295224a8cc76102348b3b5c112a97273e5e89f57360d526af1e93")
      public fun `value`(`value`: ParameterValueProperty.Builder.() -> Unit)

      /**
       * @param valueType Identifies whether a control parameter uses a custom user-defined value or
       * subscribes to the default AWS Security Hub behavior. 
       * When `ValueType` is set equal to `DEFAULT` , the default behavior can be a specific
       * Security Hub default value, or the default behavior can be to ignore a specific parameter.
       * When `ValueType` is set equal to `DEFAULT` , Security Hub ignores user-provided input for the
       * `Value` field.
       *
       * When `ValueType` is set equal to `CUSTOM` , the `Value` field can't be empty.
       */
      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterConfigurationProperty.builder()

      /**
       * @param value The current value of a control parameter.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The current value of a control parameter.
       */
      override fun `value`(`value`: ParameterValueProperty) {
        cdkBuilder.`value`(`value`.let(ParameterValueProperty.Companion::unwrap))
      }

      /**
       * @param value The current value of a control parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1970bd9e66d295224a8cc76102348b3b5c112a97273e5e89f57360d526af1e93")
      override fun `value`(`value`: ParameterValueProperty.Builder.() -> Unit): Unit =
          `value`(ParameterValueProperty(`value`))

      /**
       * @param valueType Identifies whether a control parameter uses a custom user-defined value or
       * subscribes to the default AWS Security Hub behavior. 
       * When `ValueType` is set equal to `DEFAULT` , the default behavior can be a specific
       * Security Hub default value, or the default behavior can be to ignore a specific parameter.
       * When `ValueType` is set equal to `DEFAULT` , Security Hub ignores user-provided input for the
       * `Value` field.
       *
       * When `ValueType` is set equal to `CUSTOM` , the `Value` field can't be empty.
       */
      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterConfigurationProperty,
    ) : CdkObject(cdkObject),
        ParameterConfigurationProperty {
      /**
       * The current value of a control parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parameterconfiguration.html#cfn-securityhub-securitycontrol-parameterconfiguration-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()

      /**
       * Identifies whether a control parameter uses a custom user-defined value or subscribes to
       * the default AWS Security Hub behavior.
       *
       * When `ValueType` is set equal to `DEFAULT` , the default behavior can be a specific
       * Security Hub default value, or the default behavior can be to ignore a specific parameter.
       * When `ValueType` is set equal to `DEFAULT` , Security Hub ignores user-provided input for the
       * `Value` field.
       *
       * When `ValueType` is set equal to `CUSTOM` , the `Value` field can't be empty.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parameterconfiguration.html#cfn-securityhub-securitycontrol-parameterconfiguration-valuetype)
       */
      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterConfigurationProperty):
          ParameterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParameterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterConfigurationProperty):
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterConfigurationProperty
    }
  }

  /**
   * An object that includes the data type of a security control parameter and its current value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * ParameterValueProperty parameterValueProperty = ParameterValueProperty.builder()
   * .boolean(false)
   * .double(123)
   * .enum("enum")
   * .enumList(List.of("enumList"))
   * .integer(123)
   * .integerList(List.of(123))
   * .string("string")
   * .stringList(List.of("stringList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html)
   */
  public interface ParameterValueProperty {
    /**
     * A control parameter that is a boolean.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-boolean)
     */
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    /**
     * A control parameter that is a double.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-double)
     */
    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    /**
     * A control parameter that is a list of enums.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-enumlist)
     */
    public fun enumList(): List<String> = unwrap(this).getEnumList() ?: emptyList()

    /**
     * A control parameter that is an enum.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-enum)
     */
    public fun enumValue(): String? = unwrap(this).getEnumValue()

    /**
     * A control parameter that is an integer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-integer)
     */
    public fun integer(): Number? = unwrap(this).getInteger()

    /**
     * A control parameter that is a list of integers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-integerlist)
     */
    public fun integerList(): Any? = unwrap(this).getIntegerList()

    /**
     * A control parameter that is a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-string)
     */
    public fun string(): String? = unwrap(this).getString()

    /**
     * A control parameter that is a list of strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-stringlist)
     */
    public fun stringList(): List<String> = unwrap(this).getStringList() ?: emptyList()

    /**
     * A builder for [ParameterValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanValue A control parameter that is a boolean.
       */
      public fun booleanValue(booleanValue: Boolean)

      /**
       * @param booleanValue A control parameter that is a boolean.
       */
      public fun booleanValue(booleanValue: IResolvable)

      /**
       * @param doubleValue A control parameter that is a double.
       */
      public fun doubleValue(doubleValue: Number)

      /**
       * @param enumList A control parameter that is a list of enums.
       */
      public fun enumList(enumList: List<String>)

      /**
       * @param enumList A control parameter that is a list of enums.
       */
      public fun enumList(vararg enumList: String)

      /**
       * @param enumValue A control parameter that is an enum.
       */
      public fun enumValue(enumValue: String)

      /**
       * @param integer A control parameter that is an integer.
       */
      public fun integer(integer: Number)

      /**
       * @param integerList A control parameter that is a list of integers.
       */
      public fun integerList(integerList: IResolvable)

      /**
       * @param integerList A control parameter that is a list of integers.
       */
      public fun integerList(integerList: List<Number>)

      /**
       * @param integerList A control parameter that is a list of integers.
       */
      public fun integerList(vararg integerList: Number)

      /**
       * @param string A control parameter that is a string.
       */
      public fun string(string: String)

      /**
       * @param stringList A control parameter that is a list of strings.
       */
      public fun stringList(stringList: List<String>)

      /**
       * @param stringList A control parameter that is a list of strings.
       */
      public fun stringList(vararg stringList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterValueProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterValueProperty.builder()

      /**
       * @param booleanValue A control parameter that is a boolean.
       */
      override fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
      }

      /**
       * @param booleanValue A control parameter that is a boolean.
       */
      override fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param doubleValue A control parameter that is a double.
       */
      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param enumList A control parameter that is a list of enums.
       */
      override fun enumList(enumList: List<String>) {
        cdkBuilder.enumList(enumList)
      }

      /**
       * @param enumList A control parameter that is a list of enums.
       */
      override fun enumList(vararg enumList: String): Unit = enumList(enumList.toList())

      /**
       * @param enumValue A control parameter that is an enum.
       */
      override fun enumValue(enumValue: String) {
        cdkBuilder.enumValue(enumValue)
      }

      /**
       * @param integer A control parameter that is an integer.
       */
      override fun integer(integer: Number) {
        cdkBuilder.integer(integer)
      }

      /**
       * @param integerList A control parameter that is a list of integers.
       */
      override fun integerList(integerList: IResolvable) {
        cdkBuilder.integerList(integerList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param integerList A control parameter that is a list of integers.
       */
      override fun integerList(integerList: List<Number>) {
        cdkBuilder.integerList(integerList)
      }

      /**
       * @param integerList A control parameter that is a list of integers.
       */
      override fun integerList(vararg integerList: Number): Unit = integerList(integerList.toList())

      /**
       * @param string A control parameter that is a string.
       */
      override fun string(string: String) {
        cdkBuilder.string(string)
      }

      /**
       * @param stringList A control parameter that is a list of strings.
       */
      override fun stringList(stringList: List<String>) {
        cdkBuilder.stringList(stringList)
      }

      /**
       * @param stringList A control parameter that is a list of strings.
       */
      override fun stringList(vararg stringList: String): Unit = stringList(stringList.toList())

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterValueProperty,
    ) : CdkObject(cdkObject),
        ParameterValueProperty {
      /**
       * A control parameter that is a boolean.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-boolean)
       */
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      /**
       * A control parameter that is a double.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-double)
       */
      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      /**
       * A control parameter that is a list of enums.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-enumlist)
       */
      override fun enumList(): List<String> = unwrap(this).getEnumList() ?: emptyList()

      /**
       * A control parameter that is an enum.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-enum)
       */
      override fun enumValue(): String? = unwrap(this).getEnumValue()

      /**
       * A control parameter that is an integer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-integer)
       */
      override fun integer(): Number? = unwrap(this).getInteger()

      /**
       * A control parameter that is a list of integers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-integerlist)
       */
      override fun integerList(): Any? = unwrap(this).getIntegerList()

      /**
       * A control parameter that is a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-string)
       */
      override fun string(): String? = unwrap(this).getString()

      /**
       * A control parameter that is a list of strings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-securitycontrol-parametervalue.html#cfn-securityhub-securitycontrol-parametervalue-stringlist)
       */
      override fun stringList(): List<String> = unwrap(this).getStringList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterValueProperty):
          ParameterValueProperty = CdkObjectWrappers.wrap(cdkObject) as? ParameterValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterValueProperty):
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnSecurityControl.ParameterValueProperty
    }
  }
}
