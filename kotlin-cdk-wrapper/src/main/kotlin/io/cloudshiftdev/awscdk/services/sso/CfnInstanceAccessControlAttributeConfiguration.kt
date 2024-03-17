@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Enables the attribute-based access control (ABAC) feature for the specified IAM Identity Center
 * instance.
 *
 * You can also specify new attributes to add to your ABAC configuration during the enabling
 * process. For more information about ABAC, see [Attribute-Based Access
 * Control](https://docs.aws.amazon.com//singlesignon/latest/userguide/abac.html) in the *IAM Identity
 * Center User Guide* .
 *
 *
 * The `InstanceAccessControlAttributeConfiguration` property has been deprecated but is still
 * supported for backwards compatibility purposes. We recommend that you use the
 * `AccessControlAttributes` property instead.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnInstanceAccessControlAttributeConfiguration cfnInstanceAccessControlAttributeConfiguration =
 * CfnInstanceAccessControlAttributeConfiguration.Builder.create(this,
 * "MyCfnInstanceAccessControlAttributeConfiguration")
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build()))
 * .instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty.builder()
 * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html)
 */
public open class CfnInstanceAccessControlAttributeConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   */
  public open fun accessControlAttributes(): Any? = unwrap(this).getAccessControlAttributes()

  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   */
  public open fun accessControlAttributes(`value`: IResolvable) {
    unwrap(this).setAccessControlAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   */
  public open fun accessControlAttributes(`value`: List<Any>) {
    unwrap(this).setAccessControlAttributes(`value`)
  }

  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   */
  public open fun accessControlAttributes(vararg `value`: Any): Unit =
      accessControlAttributes(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
   * is still supported for backwards compatibility purposes.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun instanceAccessControlAttributeConfiguration(): Any? =
      unwrap(this).getInstanceAccessControlAttributeConfiguration()

  /**
   * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
   * is still supported for backwards compatibility purposes.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun instanceAccessControlAttributeConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceAccessControlAttributeConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
   * is still supported for backwards compatibility purposes.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open
      fun instanceAccessControlAttributeConfiguration(`value`: InstanceAccessControlAttributeConfigurationProperty) {
    unwrap(this).setInstanceAccessControlAttributeConfiguration(`value`.let(InstanceAccessControlAttributeConfigurationProperty::unwrap))
  }

  /**
   * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
   * is still supported for backwards compatibility purposes.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("651e0dceb9d9a5dec558b462f07e3199258cf9af1319194955c53ef8fda77218")
  public open
      fun instanceAccessControlAttributeConfiguration(`value`: InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit):
      Unit =
      instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty(`value`))

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance. 
     */
    public fun accessControlAttributes(accessControlAttributes: IResolvable)

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance. 
     */
    public fun accessControlAttributes(accessControlAttributes: List<Any>)

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance. 
     */
    public fun accessControlAttributes(vararg accessControlAttributes: Any)

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use  AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     * @deprecated this property has been deprecated
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes. 
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable)

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use  AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     * @deprecated this property has been deprecated
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes. 
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty)

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use  AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     * @deprecated this property has been deprecated
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb6f51cac0d3bd8bf822248d82f6e62be610836114c987a9a4cf563b6e2b5b9c")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit)

    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instancearn)
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     */
    public fun instanceArn(instanceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.Builder =
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.Builder.create(scope,
        id)

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance. 
     */
    override fun accessControlAttributes(accessControlAttributes: IResolvable) {
      cdkBuilder.accessControlAttributes(accessControlAttributes.let(IResolvable::unwrap))
    }

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance. 
     */
    override fun accessControlAttributes(accessControlAttributes: List<Any>) {
      cdkBuilder.accessControlAttributes(accessControlAttributes)
    }

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance. 
     */
    override fun accessControlAttributes(vararg accessControlAttributes: Any): Unit =
        accessControlAttributes(accessControlAttributes.toList())

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use  AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     * @deprecated this property has been deprecated
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes. 
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(IResolvable::unwrap))
    }

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use  AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     * @deprecated this property has been deprecated
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes. 
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(InstanceAccessControlAttributeConfigurationProperty::unwrap))
    }

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use  AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     * @deprecated this property has been deprecated
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb6f51cac0d3bd8bf822248d82f6e62be610836114c987a9a4cf563b6e2b5b9c")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty(instanceAccessControlAttributeConfiguration))

    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instancearn)
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public fun build():
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceAccessControlAttributeConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceAccessControlAttributeConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration):
        CfnInstanceAccessControlAttributeConfiguration =
        CfnInstanceAccessControlAttributeConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceAccessControlAttributeConfiguration):
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration =
        wrapped.cdkObject
  }

  /**
   * These are IAM Identity Center identity store attributes that you can configure for use in
   * attributes-based access control (ABAC).
   *
   * You can create permissions policies that determine who can access your AWS resources based upon
   * the configured attribute values. When you enable ABAC and specify `AccessControlAttributes` , IAM
   * Identity Center passes the attribute values of the authenticated user into IAM for use in policy
   * evaluation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sso.*;
   * AccessControlAttributeProperty accessControlAttributeProperty =
   * AccessControlAttributeProperty.builder()
   * .key("key")
   * .value(AccessControlAttributeValueProperty.builder()
   * .source(List.of("source"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute.html)
   */
  public interface AccessControlAttributeProperty {
    /**
     * The name of the attribute associated with your identities in your identity source.
     *
     * This is used to map a specified attribute in your identity source with an attribute in IAM
     * Identity Center .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute-key)
     */
    public fun key(): String

    /**
     * The value used for mapping a specified attribute to an identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [AccessControlAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of the attribute associated with your identities in your identity
       * source. 
       * This is used to map a specified attribute in your identity source with an attribute in IAM
       * Identity Center .
       */
      public fun key(key: String)

      /**
       * @param value The value used for mapping a specified attribute to an identity source. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value used for mapping a specified attribute to an identity source. 
       */
      public fun `value`(`value`: AccessControlAttributeValueProperty)

      /**
       * @param value The value used for mapping a specified attribute to an identity source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b2ba344d29acf07e85c56f3146a8d7709b6f35e982893821de32fd1907f06de")
      public fun `value`(`value`: AccessControlAttributeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.builder()

      /**
       * @param key The name of the attribute associated with your identities in your identity
       * source. 
       * This is used to map a specified attribute in your identity source with an attribute in IAM
       * Identity Center .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value used for mapping a specified attribute to an identity source. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value used for mapping a specified attribute to an identity source. 
       */
      override fun `value`(`value`: AccessControlAttributeValueProperty) {
        cdkBuilder.`value`(`value`.let(AccessControlAttributeValueProperty::unwrap))
      }

      /**
       * @param value The value used for mapping a specified attribute to an identity source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b2ba344d29acf07e85c56f3146a8d7709b6f35e982893821de32fd1907f06de")
      override fun `value`(`value`: AccessControlAttributeValueProperty.Builder.() -> Unit): Unit =
          `value`(AccessControlAttributeValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty,
    ) : CdkObject(cdkObject), AccessControlAttributeProperty {
      /**
       * The name of the attribute associated with your identities in your identity source.
       *
       * This is used to map a specified attribute in your identity source with an attribute in IAM
       * Identity Center .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value used for mapping a specified attribute to an identity source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessControlAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty):
          AccessControlAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessControlAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAttributeProperty):
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty
    }
  }

  /**
   * The value used for mapping a specified attribute to an identity source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sso.*;
   * AccessControlAttributeValueProperty accessControlAttributeValueProperty =
   * AccessControlAttributeValueProperty.builder()
   * .source(List.of("source"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributevalue.html)
   */
  public interface AccessControlAttributeValueProperty {
    /**
     * The identity source to use when mapping a specified attribute to IAM Identity Center .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributevalue.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributevalue-source)
     */
    public fun source(): List<String>

    /**
     * A builder for [AccessControlAttributeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source The identity source to use when mapping a specified attribute to IAM Identity
       * Center . 
       */
      public fun source(source: List<String>)

      /**
       * @param source The identity source to use when mapping a specified attribute to IAM Identity
       * Center . 
       */
      public fun source(vararg source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.builder()

      /**
       * @param source The identity source to use when mapping a specified attribute to IAM Identity
       * Center . 
       */
      override fun source(source: List<String>) {
        cdkBuilder.source(source)
      }

      /**
       * @param source The identity source to use when mapping a specified attribute to IAM Identity
       * Center . 
       */
      override fun source(vararg source: String): Unit = source(source.toList())

      public fun build():
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty,
    ) : CdkObject(cdkObject), AccessControlAttributeValueProperty {
      /**
       * The identity source to use when mapping a specified attribute to IAM Identity Center .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributevalue.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributevalue-source)
       */
      override fun source(): List<String> = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAttributeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty):
          AccessControlAttributeValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessControlAttributeValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAttributeValueProperty):
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty
    }
  }

  /**
   * The InstanceAccessControlAttributeConfiguration property has been deprecated but is still
   * supported for backwards compatibility purposes.
   *
   * We recomend that you use  AccessControlAttributes property instead.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sso.*;
   * InstanceAccessControlAttributeConfigurationProperty
   * instanceAccessControlAttributeConfigurationProperty =
   * InstanceAccessControlAttributeConfigurationProperty.builder()
   * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
   * .key("key")
   * .value(AccessControlAttributeValueProperty.builder()
   * .source(List.of("source"))
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration.html)
   */
  public interface InstanceAccessControlAttributeConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     */
    public fun accessControlAttributes(): Any

    /**
     * A builder for [InstanceAccessControlAttributeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessControlAttributes the value to be set. 
       */
      public fun accessControlAttributes(accessControlAttributes: IResolvable)

      /**
       * @param accessControlAttributes the value to be set. 
       */
      public fun accessControlAttributes(accessControlAttributes: List<Any>)

      /**
       * @param accessControlAttributes the value to be set. 
       */
      public fun accessControlAttributes(vararg accessControlAttributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.builder()

      /**
       * @param accessControlAttributes the value to be set. 
       */
      override fun accessControlAttributes(accessControlAttributes: IResolvable) {
        cdkBuilder.accessControlAttributes(accessControlAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlAttributes the value to be set. 
       */
      override fun accessControlAttributes(accessControlAttributes: List<Any>) {
        cdkBuilder.accessControlAttributes(accessControlAttributes)
      }

      /**
       * @param accessControlAttributes the value to be set. 
       */
      override fun accessControlAttributes(vararg accessControlAttributes: Any): Unit =
          accessControlAttributes(accessControlAttributes.toList())

      public fun build():
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty,
    ) : CdkObject(cdkObject), InstanceAccessControlAttributeConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
       */
      override fun accessControlAttributes(): Any = unwrap(this).getAccessControlAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceAccessControlAttributeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty):
          InstanceAccessControlAttributeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject)
          as? InstanceAccessControlAttributeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceAccessControlAttributeConfigurationProperty):
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty
    }
  }
}
