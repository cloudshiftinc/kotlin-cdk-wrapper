@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
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
 * The `AWS::SecurityHub::ConfigurationPolicy` resource creates a central configuration policy with
 * the defined settings.
 *
 * Only the AWS Security Hub delegated administrator can create this resource in the home Region.
 * For more information, see [Central configuration in Security
 * Hub](https://docs.aws.amazon.com/securityhub/latest/userguide/central-configuration-intro.html) in
 * the *AWS Security Hub User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnConfigurationPolicy cfnConfigurationPolicy = CfnConfigurationPolicy.Builder.create(this,
 * "MyCfnConfigurationPolicy")
 * .configurationPolicy(PolicyProperty.builder()
 * .securityHub(SecurityHubPolicyProperty.builder()
 * .enabledStandardIdentifiers(List.of("enabledStandardIdentifiers"))
 * .securityControlsConfiguration(SecurityControlsConfigurationProperty.builder()
 * .disabledSecurityControlIdentifiers(List.of("disabledSecurityControlIdentifiers"))
 * .enabledSecurityControlIdentifiers(List.of("enabledSecurityControlIdentifiers"))
 * .securityControlCustomParameters(List.of(SecurityControlCustomParameterProperty.builder()
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
 * .securityControlId("securityControlId")
 * .build()))
 * .build())
 * .serviceEnabled(false)
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html)
 */
public open class CfnConfigurationPolicy(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationPolicyProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConfigurationPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationPolicyProps(props)
  )

  /**
   * The ARN of the configuration policy.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time, in UTC and ISO 8601 format.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The universally unique identifier (UUID) of the configuration policy.
   *
   * A self-managed configuration has no UUID. The identifier of a self-managed configuration is
   * `SELF_MANAGED_SECURITY_HUB` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates whether the service that the configuration policy applies to is enabled in the
   * policy.
   */
  public open fun attrServiceEnabled(): IResolvable =
      unwrap(this).getAttrServiceEnabled().let(IResolvable::wrap)

  /**
   * The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * An object that defines how AWS Security Hub is configured.
   */
  public open fun configurationPolicy(): Any = unwrap(this).getConfigurationPolicy()

  /**
   * An object that defines how AWS Security Hub is configured.
   */
  public open fun configurationPolicy(`value`: IResolvable) {
    unwrap(this).setConfigurationPolicy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines how AWS Security Hub is configured.
   */
  public open fun configurationPolicy(`value`: PolicyProperty) {
    unwrap(this).setConfigurationPolicy(`value`.let(PolicyProperty.Companion::unwrap))
  }

  /**
   * An object that defines how AWS Security Hub is configured.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01507ee0aa6d191c1e7cedea555899d0e342b38088a9936f5eea1a8afa9e0418")
  public open fun configurationPolicy(`value`: PolicyProperty.Builder.() -> Unit): Unit =
      configurationPolicy(PolicyProperty(`value`))

  /**
   * The description of the configuration policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the configuration policy.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the configuration policy.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the configuration policy.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * User-defined tags associated with a configuration policy.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * User-defined tags associated with a configuration policy.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnConfigurationPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An object that defines how AWS Security Hub is configured.
     *
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-configurationpolicy)
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     */
    public fun configurationPolicy(configurationPolicy: IResolvable)

    /**
     * An object that defines how AWS Security Hub is configured.
     *
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-configurationpolicy)
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     */
    public fun configurationPolicy(configurationPolicy: PolicyProperty)

    /**
     * An object that defines how AWS Security Hub is configured.
     *
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-configurationpolicy)
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daccfdd6555fa43c95821cb6f7ceca433dd844820a79b5f14efaeeaa5afa46af")
    public fun configurationPolicy(configurationPolicy: PolicyProperty.Builder.() -> Unit)

    /**
     * The description of the configuration policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-description)
     * @param description The description of the configuration policy. 
     */
    public fun description(description: String)

    /**
     * The name of the configuration policy.
     *
     * Alphanumeric characters and the following ASCII characters are permitted: `-, ., !, *, /` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-name)
     * @param name The name of the configuration policy. 
     */
    public fun name(name: String)

    /**
     * User-defined tags associated with a configuration policy.
     *
     * For more information, see [Tagging AWS Security Hub
     * resources](https://docs.aws.amazon.com/securityhub/latest/userguide/tagging-resources.html) in
     * the *Security Hub user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-tags)
     * @param tags User-defined tags associated with a configuration policy. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.Builder =
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.Builder.create(scope, id)

    /**
     * An object that defines how AWS Security Hub is configured.
     *
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-configurationpolicy)
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     */
    override fun configurationPolicy(configurationPolicy: IResolvable) {
      cdkBuilder.configurationPolicy(configurationPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that defines how AWS Security Hub is configured.
     *
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-configurationpolicy)
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     */
    override fun configurationPolicy(configurationPolicy: PolicyProperty) {
      cdkBuilder.configurationPolicy(configurationPolicy.let(PolicyProperty.Companion::unwrap))
    }

    /**
     * An object that defines how AWS Security Hub is configured.
     *
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-configurationpolicy)
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daccfdd6555fa43c95821cb6f7ceca433dd844820a79b5f14efaeeaa5afa46af")
    override fun configurationPolicy(configurationPolicy: PolicyProperty.Builder.() -> Unit): Unit =
        configurationPolicy(PolicyProperty(configurationPolicy))

    /**
     * The description of the configuration policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-description)
     * @param description The description of the configuration policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the configuration policy.
     *
     * Alphanumeric characters and the following ASCII characters are permitted: `-, ., !, *, /` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-name)
     * @param name The name of the configuration policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * User-defined tags associated with a configuration policy.
     *
     * For more information, see [Tagging AWS Security Hub
     * resources](https://docs.aws.amazon.com/securityhub/latest/userguide/tagging-resources.html) in
     * the *Security Hub user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-tags)
     * @param tags User-defined tags associated with a configuration policy. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy):
        CfnConfigurationPolicy = CfnConfigurationPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationPolicy):
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parameterconfiguration.html)
   */
  public interface ParameterConfigurationProperty {
    /**
     * The current value of a control parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parameterconfiguration.html#cfn-securityhub-configurationpolicy-parameterconfiguration-value)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parameterconfiguration.html#cfn-securityhub-configurationpolicy-parameterconfiguration-valuetype)
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
      @JvmName("7f647e6b7b4e8aa51f4bdba729a3fe9b8c99069583f53f36590bbf99a328ef9c")
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
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterConfigurationProperty.builder()

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
      @JvmName("7f647e6b7b4e8aa51f4bdba729a3fe9b8c99069583f53f36590bbf99a328ef9c")
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
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterConfigurationProperty,
    ) : CdkObject(cdkObject),
        ParameterConfigurationProperty {
      /**
       * The current value of a control parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parameterconfiguration.html#cfn-securityhub-configurationpolicy-parameterconfiguration-value)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parameterconfiguration.html#cfn-securityhub-configurationpolicy-parameterconfiguration-valuetype)
       */
      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterConfigurationProperty):
          ParameterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParameterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterConfigurationProperty):
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html)
   */
  public interface ParameterValueProperty {
    /**
     * A control parameter that is a boolean.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-boolean)
     */
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    /**
     * A control parameter that is a double.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-double)
     */
    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    /**
     * A control parameter that is a list of enums.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-enumlist)
     */
    public fun enumList(): List<String> = unwrap(this).getEnumList() ?: emptyList()

    /**
     * A control parameter that is an enum.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-enum)
     */
    public fun enumValue(): String? = unwrap(this).getEnumValue()

    /**
     * A control parameter that is an integer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-integer)
     */
    public fun integer(): Number? = unwrap(this).getInteger()

    /**
     * A control parameter that is a list of integers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-integerlist)
     */
    public fun integerList(): Any? = unwrap(this).getIntegerList()

    /**
     * A control parameter that is a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-string)
     */
    public fun string(): String? = unwrap(this).getString()

    /**
     * A control parameter that is a list of strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-stringlist)
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
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterValueProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterValueProperty.builder()

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
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterValueProperty,
    ) : CdkObject(cdkObject),
        ParameterValueProperty {
      /**
       * A control parameter that is a boolean.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-boolean)
       */
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      /**
       * A control parameter that is a double.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-double)
       */
      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      /**
       * A control parameter that is a list of enums.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-enumlist)
       */
      override fun enumList(): List<String> = unwrap(this).getEnumList() ?: emptyList()

      /**
       * A control parameter that is an enum.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-enum)
       */
      override fun enumValue(): String? = unwrap(this).getEnumValue()

      /**
       * A control parameter that is an integer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-integer)
       */
      override fun integer(): Number? = unwrap(this).getInteger()

      /**
       * A control parameter that is a list of integers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-integerlist)
       */
      override fun integerList(): Any? = unwrap(this).getIntegerList()

      /**
       * A control parameter that is a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-string)
       */
      override fun string(): String? = unwrap(this).getString()

      /**
       * A control parameter that is a list of strings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-parametervalue.html#cfn-securityhub-configurationpolicy-parametervalue-stringlist)
       */
      override fun stringList(): List<String> = unwrap(this).getStringList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterValueProperty):
          ParameterValueProperty = CdkObjectWrappers.wrap(cdkObject) as? ParameterValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterValueProperty):
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.ParameterValueProperty
    }
  }

  /**
   * An object that defines how AWS Security Hub is configured.
   *
   * It includes whether Security Hub is enabled or disabled, a list of enabled security standards,
   * a list of enabled or disabled security controls, and a list of custom parameter values for
   * specified controls. If you provide a list of security controls that are enabled in the
   * configuration policy, Security Hub disables all other controls (including newly released
   * controls). If you provide a list of security controls that are disabled in the configuration
   * policy, Security Hub enables all other controls (including newly released controls).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * PolicyProperty policyProperty = PolicyProperty.builder()
   * .securityHub(SecurityHubPolicyProperty.builder()
   * .enabledStandardIdentifiers(List.of("enabledStandardIdentifiers"))
   * .securityControlsConfiguration(SecurityControlsConfigurationProperty.builder()
   * .disabledSecurityControlIdentifiers(List.of("disabledSecurityControlIdentifiers"))
   * .enabledSecurityControlIdentifiers(List.of("enabledSecurityControlIdentifiers"))
   * .securityControlCustomParameters(List.of(SecurityControlCustomParameterProperty.builder()
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
   * .securityControlId("securityControlId")
   * .build()))
   * .build())
   * .serviceEnabled(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-policy.html)
   */
  public interface PolicyProperty {
    /**
     * The AWS service that the configuration policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-policy.html#cfn-securityhub-configurationpolicy-policy-securityhub)
     */
    public fun securityHub(): Any? = unwrap(this).getSecurityHub()

    /**
     * A builder for [PolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityHub The AWS service that the configuration policy applies to.
       */
      public fun securityHub(securityHub: IResolvable)

      /**
       * @param securityHub The AWS service that the configuration policy applies to.
       */
      public fun securityHub(securityHub: SecurityHubPolicyProperty)

      /**
       * @param securityHub The AWS service that the configuration policy applies to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("620d55a506dbf203d05ea2837e91bac447faf946dcb0c5448204b101ff384c91")
      public fun securityHub(securityHub: SecurityHubPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.PolicyProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.PolicyProperty.builder()

      /**
       * @param securityHub The AWS service that the configuration policy applies to.
       */
      override fun securityHub(securityHub: IResolvable) {
        cdkBuilder.securityHub(securityHub.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityHub The AWS service that the configuration policy applies to.
       */
      override fun securityHub(securityHub: SecurityHubPolicyProperty) {
        cdkBuilder.securityHub(securityHub.let(SecurityHubPolicyProperty.Companion::unwrap))
      }

      /**
       * @param securityHub The AWS service that the configuration policy applies to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("620d55a506dbf203d05ea2837e91bac447faf946dcb0c5448204b101ff384c91")
      override fun securityHub(securityHub: SecurityHubPolicyProperty.Builder.() -> Unit): Unit =
          securityHub(SecurityHubPolicyProperty(securityHub))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.PolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.PolicyProperty,
    ) : CdkObject(cdkObject),
        PolicyProperty {
      /**
       * The AWS service that the configuration policy applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-policy.html#cfn-securityhub-configurationpolicy-policy-securityhub)
       */
      override fun securityHub(): Any? = unwrap(this).getSecurityHub()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.PolicyProperty):
          PolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyProperty):
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.PolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.PolicyProperty
    }
  }

  /**
   * A list of security controls and control parameter values that are included in a configuration
   * policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * SecurityControlCustomParameterProperty securityControlCustomParameterProperty =
   * SecurityControlCustomParameterProperty.builder()
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
   * .securityControlId("securityControlId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolcustomparameter.html)
   */
  public interface SecurityControlCustomParameterProperty {
    /**
     * An object that specifies parameter values for a control in a configuration policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolcustomparameter.html#cfn-securityhub-configurationpolicy-securitycontrolcustomparameter-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The ID of the security control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolcustomparameter.html#cfn-securityhub-configurationpolicy-securitycontrolcustomparameter-securitycontrolid)
     */
    public fun securityControlId(): String? = unwrap(this).getSecurityControlId()

    /**
     * A builder for [SecurityControlCustomParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters An object that specifies parameter values for a control in a
       * configuration policy.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters An object that specifies parameter values for a control in a
       * configuration policy.
       */
      public fun parameters(parameters: Map<String, Any>)

      /**
       * @param securityControlId The ID of the security control.
       */
      public fun securityControlId(securityControlId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlCustomParameterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlCustomParameterProperty.builder()

      /**
       * @param parameters An object that specifies parameter values for a control in a
       * configuration policy.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameters An object that specifies parameter values for a control in a
       * configuration policy.
       */
      override fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param securityControlId The ID of the security control.
       */
      override fun securityControlId(securityControlId: String) {
        cdkBuilder.securityControlId(securityControlId)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlCustomParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlCustomParameterProperty,
    ) : CdkObject(cdkObject),
        SecurityControlCustomParameterProperty {
      /**
       * An object that specifies parameter values for a control in a configuration policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolcustomparameter.html#cfn-securityhub-configurationpolicy-securitycontrolcustomparameter-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The ID of the security control.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolcustomparameter.html#cfn-securityhub-configurationpolicy-securitycontrolcustomparameter-securitycontrolid)
       */
      override fun securityControlId(): String? = unwrap(this).getSecurityControlId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecurityControlCustomParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlCustomParameterProperty):
          SecurityControlCustomParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SecurityControlCustomParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityControlCustomParameterProperty):
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlCustomParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlCustomParameterProperty
    }
  }

  /**
   * An object that defines which security controls are enabled in an AWS Security Hub configuration
   * policy.
   *
   * The enablement status of a control is aligned across all of the enabled standards in an
   * account.
   *
   * This property is required only if `ServiceEnabled` is set to `true` in your configuration
   * policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * SecurityControlsConfigurationProperty securityControlsConfigurationProperty =
   * SecurityControlsConfigurationProperty.builder()
   * .disabledSecurityControlIdentifiers(List.of("disabledSecurityControlIdentifiers"))
   * .enabledSecurityControlIdentifiers(List.of("enabledSecurityControlIdentifiers"))
   * .securityControlCustomParameters(List.of(SecurityControlCustomParameterProperty.builder()
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
   * .securityControlId("securityControlId")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolsconfiguration.html)
   */
  public interface SecurityControlsConfigurationProperty {
    /**
     * A list of security controls that are disabled in the configuration policy.
     *
     * Provide only one of `EnabledSecurityControlIdentifiers` or
     * `DisabledSecurityControlIdentifiers` .
     *
     * If you provide `DisabledSecurityControlIdentifiers` , Security Hub enables all other controls
     * not in the list, and enables
     * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolsconfiguration.html#cfn-securityhub-configurationpolicy-securitycontrolsconfiguration-disabledsecuritycontrolidentifiers)
     */
    public fun disabledSecurityControlIdentifiers(): List<String> =
        unwrap(this).getDisabledSecurityControlIdentifiers() ?: emptyList()

    /**
     * A list of security controls that are enabled in the configuration policy.
     *
     * Provide only one of `EnabledSecurityControlIdentifiers` or
     * `DisabledSecurityControlIdentifiers` .
     *
     * If you provide `EnabledSecurityControlIdentifiers` , Security Hub disables all other controls
     * not in the list, and disables
     * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolsconfiguration.html#cfn-securityhub-configurationpolicy-securitycontrolsconfiguration-enabledsecuritycontrolidentifiers)
     */
    public fun enabledSecurityControlIdentifiers(): List<String> =
        unwrap(this).getEnabledSecurityControlIdentifiers() ?: emptyList()

    /**
     * A list of security controls and control parameter values that are included in a configuration
     * policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolsconfiguration.html#cfn-securityhub-configurationpolicy-securitycontrolsconfiguration-securitycontrolcustomparameters)
     */
    public fun securityControlCustomParameters(): Any? =
        unwrap(this).getSecurityControlCustomParameters()

    /**
     * A builder for [SecurityControlsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disabledSecurityControlIdentifiers A list of security controls that are disabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `DisabledSecurityControlIdentifiers` , Security Hub enables all other
       * controls not in the list, and enables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      public
          fun disabledSecurityControlIdentifiers(disabledSecurityControlIdentifiers: List<String>)

      /**
       * @param disabledSecurityControlIdentifiers A list of security controls that are disabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `DisabledSecurityControlIdentifiers` , Security Hub enables all other
       * controls not in the list, and enables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      public fun disabledSecurityControlIdentifiers(vararg
          disabledSecurityControlIdentifiers: String)

      /**
       * @param enabledSecurityControlIdentifiers A list of security controls that are enabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `EnabledSecurityControlIdentifiers` , Security Hub disables all other
       * controls not in the list, and disables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      public fun enabledSecurityControlIdentifiers(enabledSecurityControlIdentifiers: List<String>)

      /**
       * @param enabledSecurityControlIdentifiers A list of security controls that are enabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `EnabledSecurityControlIdentifiers` , Security Hub disables all other
       * controls not in the list, and disables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      public fun enabledSecurityControlIdentifiers(vararg enabledSecurityControlIdentifiers: String)

      /**
       * @param securityControlCustomParameters A list of security controls and control parameter
       * values that are included in a configuration policy.
       */
      public fun securityControlCustomParameters(securityControlCustomParameters: IResolvable)

      /**
       * @param securityControlCustomParameters A list of security controls and control parameter
       * values that are included in a configuration policy.
       */
      public fun securityControlCustomParameters(securityControlCustomParameters: List<Any>)

      /**
       * @param securityControlCustomParameters A list of security controls and control parameter
       * values that are included in a configuration policy.
       */
      public fun securityControlCustomParameters(vararg securityControlCustomParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlsConfigurationProperty.builder()

      /**
       * @param disabledSecurityControlIdentifiers A list of security controls that are disabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `DisabledSecurityControlIdentifiers` , Security Hub enables all other
       * controls not in the list, and enables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      override
          fun disabledSecurityControlIdentifiers(disabledSecurityControlIdentifiers: List<String>) {
        cdkBuilder.disabledSecurityControlIdentifiers(disabledSecurityControlIdentifiers)
      }

      /**
       * @param disabledSecurityControlIdentifiers A list of security controls that are disabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `DisabledSecurityControlIdentifiers` , Security Hub enables all other
       * controls not in the list, and enables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      override fun disabledSecurityControlIdentifiers(vararg
          disabledSecurityControlIdentifiers: String): Unit =
          disabledSecurityControlIdentifiers(disabledSecurityControlIdentifiers.toList())

      /**
       * @param enabledSecurityControlIdentifiers A list of security controls that are enabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `EnabledSecurityControlIdentifiers` , Security Hub disables all other
       * controls not in the list, and disables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      override
          fun enabledSecurityControlIdentifiers(enabledSecurityControlIdentifiers: List<String>) {
        cdkBuilder.enabledSecurityControlIdentifiers(enabledSecurityControlIdentifiers)
      }

      /**
       * @param enabledSecurityControlIdentifiers A list of security controls that are enabled in
       * the configuration policy.
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `EnabledSecurityControlIdentifiers` , Security Hub disables all other
       * controls not in the list, and disables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       */
      override fun enabledSecurityControlIdentifiers(vararg
          enabledSecurityControlIdentifiers: String): Unit =
          enabledSecurityControlIdentifiers(enabledSecurityControlIdentifiers.toList())

      /**
       * @param securityControlCustomParameters A list of security controls and control parameter
       * values that are included in a configuration policy.
       */
      override fun securityControlCustomParameters(securityControlCustomParameters: IResolvable) {
        cdkBuilder.securityControlCustomParameters(securityControlCustomParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityControlCustomParameters A list of security controls and control parameter
       * values that are included in a configuration policy.
       */
      override fun securityControlCustomParameters(securityControlCustomParameters: List<Any>) {
        cdkBuilder.securityControlCustomParameters(securityControlCustomParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param securityControlCustomParameters A list of security controls and control parameter
       * values that are included in a configuration policy.
       */
      override fun securityControlCustomParameters(vararg securityControlCustomParameters: Any):
          Unit = securityControlCustomParameters(securityControlCustomParameters.toList())

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlsConfigurationProperty,
    ) : CdkObject(cdkObject),
        SecurityControlsConfigurationProperty {
      /**
       * A list of security controls that are disabled in the configuration policy.
       *
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `DisabledSecurityControlIdentifiers` , Security Hub enables all other
       * controls not in the list, and enables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolsconfiguration.html#cfn-securityhub-configurationpolicy-securitycontrolsconfiguration-disabledsecuritycontrolidentifiers)
       */
      override fun disabledSecurityControlIdentifiers(): List<String> =
          unwrap(this).getDisabledSecurityControlIdentifiers() ?: emptyList()

      /**
       * A list of security controls that are enabled in the configuration policy.
       *
       * Provide only one of `EnabledSecurityControlIdentifiers` or
       * `DisabledSecurityControlIdentifiers` .
       *
       * If you provide `EnabledSecurityControlIdentifiers` , Security Hub disables all other
       * controls not in the list, and disables
       * [AutoEnableControls](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateSecurityHubConfiguration.html#securityhub-UpdateSecurityHubConfiguration-request-AutoEnableControls)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolsconfiguration.html#cfn-securityhub-configurationpolicy-securitycontrolsconfiguration-enabledsecuritycontrolidentifiers)
       */
      override fun enabledSecurityControlIdentifiers(): List<String> =
          unwrap(this).getEnabledSecurityControlIdentifiers() ?: emptyList()

      /**
       * A list of security controls and control parameter values that are included in a
       * configuration policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securitycontrolsconfiguration.html#cfn-securityhub-configurationpolicy-securitycontrolsconfiguration-securitycontrolcustomparameters)
       */
      override fun securityControlCustomParameters(): Any? =
          unwrap(this).getSecurityControlCustomParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecurityControlsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlsConfigurationProperty):
          SecurityControlsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SecurityControlsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityControlsConfigurationProperty):
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityControlsConfigurationProperty
    }
  }

  /**
   * An object that defines how AWS Security Hub is configured.
   *
   * The configuration policy includes whether Security Hub is enabled or disabled, a list of
   * enabled security standards, a list of enabled or disabled security controls, and a list of custom
   * parameter values for specified controls. If you provide a list of security controls that are
   * enabled in the configuration policy, Security Hub disables all other controls (including newly
   * released controls). If you provide a list of security controls that are disabled in the
   * configuration policy, Security Hub enables all other controls (including newly released controls).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * SecurityHubPolicyProperty securityHubPolicyProperty = SecurityHubPolicyProperty.builder()
   * .enabledStandardIdentifiers(List.of("enabledStandardIdentifiers"))
   * .securityControlsConfiguration(SecurityControlsConfigurationProperty.builder()
   * .disabledSecurityControlIdentifiers(List.of("disabledSecurityControlIdentifiers"))
   * .enabledSecurityControlIdentifiers(List.of("enabledSecurityControlIdentifiers"))
   * .securityControlCustomParameters(List.of(SecurityControlCustomParameterProperty.builder()
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
   * .securityControlId("securityControlId")
   * .build()))
   * .build())
   * .serviceEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securityhubpolicy.html)
   */
  public interface SecurityHubPolicyProperty {
    /**
     * A list that defines which security standards are enabled in the configuration policy.
     *
     * This property is required only if `ServiceEnabled` is set to `true` in your configuration
     * policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securityhubpolicy.html#cfn-securityhub-configurationpolicy-securityhubpolicy-enabledstandardidentifiers)
     */
    public fun enabledStandardIdentifiers(): List<String> =
        unwrap(this).getEnabledStandardIdentifiers() ?: emptyList()

    /**
     * An object that defines which security controls are enabled in the configuration policy.
     *
     * The enablement status of a control is aligned across all of the enabled standards in an
     * account.
     *
     * This property is required only if `ServiceEnabled` is set to true in your configuration
     * policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securityhubpolicy.html#cfn-securityhub-configurationpolicy-securityhubpolicy-securitycontrolsconfiguration)
     */
    public fun securityControlsConfiguration(): Any? =
        unwrap(this).getSecurityControlsConfiguration()

    /**
     * Indicates whether Security Hub is enabled in the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securityhubpolicy.html#cfn-securityhub-configurationpolicy-securityhubpolicy-serviceenabled)
     */
    public fun serviceEnabled(): Any? = unwrap(this).getServiceEnabled()

    /**
     * A builder for [SecurityHubPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledStandardIdentifiers A list that defines which security standards are enabled
       * in the configuration policy.
       * This property is required only if `ServiceEnabled` is set to `true` in your configuration
       * policy.
       */
      public fun enabledStandardIdentifiers(enabledStandardIdentifiers: List<String>)

      /**
       * @param enabledStandardIdentifiers A list that defines which security standards are enabled
       * in the configuration policy.
       * This property is required only if `ServiceEnabled` is set to `true` in your configuration
       * policy.
       */
      public fun enabledStandardIdentifiers(vararg enabledStandardIdentifiers: String)

      /**
       * @param securityControlsConfiguration An object that defines which security controls are
       * enabled in the configuration policy.
       * The enablement status of a control is aligned across all of the enabled standards in an
       * account.
       *
       * This property is required only if `ServiceEnabled` is set to true in your configuration
       * policy.
       */
      public fun securityControlsConfiguration(securityControlsConfiguration: IResolvable)

      /**
       * @param securityControlsConfiguration An object that defines which security controls are
       * enabled in the configuration policy.
       * The enablement status of a control is aligned across all of the enabled standards in an
       * account.
       *
       * This property is required only if `ServiceEnabled` is set to true in your configuration
       * policy.
       */
      public
          fun securityControlsConfiguration(securityControlsConfiguration: SecurityControlsConfigurationProperty)

      /**
       * @param securityControlsConfiguration An object that defines which security controls are
       * enabled in the configuration policy.
       * The enablement status of a control is aligned across all of the enabled standards in an
       * account.
       *
       * This property is required only if `ServiceEnabled` is set to true in your configuration
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ff6ee727adc1cfd7fce66167509db1fd865ad530ca931488dec035bdd169562")
      public
          fun securityControlsConfiguration(securityControlsConfiguration: SecurityControlsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param serviceEnabled Indicates whether Security Hub is enabled in the policy.
       */
      public fun serviceEnabled(serviceEnabled: Boolean)

      /**
       * @param serviceEnabled Indicates whether Security Hub is enabled in the policy.
       */
      public fun serviceEnabled(serviceEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityHubPolicyProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityHubPolicyProperty.builder()

      /**
       * @param enabledStandardIdentifiers A list that defines which security standards are enabled
       * in the configuration policy.
       * This property is required only if `ServiceEnabled` is set to `true` in your configuration
       * policy.
       */
      override fun enabledStandardIdentifiers(enabledStandardIdentifiers: List<String>) {
        cdkBuilder.enabledStandardIdentifiers(enabledStandardIdentifiers)
      }

      /**
       * @param enabledStandardIdentifiers A list that defines which security standards are enabled
       * in the configuration policy.
       * This property is required only if `ServiceEnabled` is set to `true` in your configuration
       * policy.
       */
      override fun enabledStandardIdentifiers(vararg enabledStandardIdentifiers: String): Unit =
          enabledStandardIdentifiers(enabledStandardIdentifiers.toList())

      /**
       * @param securityControlsConfiguration An object that defines which security controls are
       * enabled in the configuration policy.
       * The enablement status of a control is aligned across all of the enabled standards in an
       * account.
       *
       * This property is required only if `ServiceEnabled` is set to true in your configuration
       * policy.
       */
      override fun securityControlsConfiguration(securityControlsConfiguration: IResolvable) {
        cdkBuilder.securityControlsConfiguration(securityControlsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityControlsConfiguration An object that defines which security controls are
       * enabled in the configuration policy.
       * The enablement status of a control is aligned across all of the enabled standards in an
       * account.
       *
       * This property is required only if `ServiceEnabled` is set to true in your configuration
       * policy.
       */
      override
          fun securityControlsConfiguration(securityControlsConfiguration: SecurityControlsConfigurationProperty) {
        cdkBuilder.securityControlsConfiguration(securityControlsConfiguration.let(SecurityControlsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param securityControlsConfiguration An object that defines which security controls are
       * enabled in the configuration policy.
       * The enablement status of a control is aligned across all of the enabled standards in an
       * account.
       *
       * This property is required only if `ServiceEnabled` is set to true in your configuration
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ff6ee727adc1cfd7fce66167509db1fd865ad530ca931488dec035bdd169562")
      override
          fun securityControlsConfiguration(securityControlsConfiguration: SecurityControlsConfigurationProperty.Builder.() -> Unit):
          Unit =
          securityControlsConfiguration(SecurityControlsConfigurationProperty(securityControlsConfiguration))

      /**
       * @param serviceEnabled Indicates whether Security Hub is enabled in the policy.
       */
      override fun serviceEnabled(serviceEnabled: Boolean) {
        cdkBuilder.serviceEnabled(serviceEnabled)
      }

      /**
       * @param serviceEnabled Indicates whether Security Hub is enabled in the policy.
       */
      override fun serviceEnabled(serviceEnabled: IResolvable) {
        cdkBuilder.serviceEnabled(serviceEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityHubPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityHubPolicyProperty,
    ) : CdkObject(cdkObject),
        SecurityHubPolicyProperty {
      /**
       * A list that defines which security standards are enabled in the configuration policy.
       *
       * This property is required only if `ServiceEnabled` is set to `true` in your configuration
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securityhubpolicy.html#cfn-securityhub-configurationpolicy-securityhubpolicy-enabledstandardidentifiers)
       */
      override fun enabledStandardIdentifiers(): List<String> =
          unwrap(this).getEnabledStandardIdentifiers() ?: emptyList()

      /**
       * An object that defines which security controls are enabled in the configuration policy.
       *
       * The enablement status of a control is aligned across all of the enabled standards in an
       * account.
       *
       * This property is required only if `ServiceEnabled` is set to true in your configuration
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securityhubpolicy.html#cfn-securityhub-configurationpolicy-securityhubpolicy-securitycontrolsconfiguration)
       */
      override fun securityControlsConfiguration(): Any? =
          unwrap(this).getSecurityControlsConfiguration()

      /**
       * Indicates whether Security Hub is enabled in the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-configurationpolicy-securityhubpolicy.html#cfn-securityhub-configurationpolicy-securityhubpolicy-serviceenabled)
       */
      override fun serviceEnabled(): Any? = unwrap(this).getServiceEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityHubPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityHubPolicyProperty):
          SecurityHubPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SecurityHubPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityHubPolicyProperty):
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityHubPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy.SecurityHubPolicyProperty
    }
  }
}
