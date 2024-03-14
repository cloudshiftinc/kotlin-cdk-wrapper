package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEntitlement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlement,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies whether to entitle all apps or only selected apps.
   */
  public open fun appVisibility(): String = unwrap(this).getAppVisibility()

  /**
   * Specifies whether to entitle all apps or only selected apps.
   */
  public open fun appVisibility(`value`: String) {
    unwrap(this).setAppVisibility(`value`)
  }

  /**
   * The time when the entitlement was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The time when the entitlement was last modified.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The attributes of the entitlement.
   */
  public open fun attributes(): Any = unwrap(this).getAttributes()

  /**
   * The attributes of the entitlement.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The attributes of the entitlement.
   */
  public open fun attributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setAttributes(__idx_ac66f0)
  }

  /**
   * The attributes of the entitlement.
   */
  public open fun attributes(vararg __idx_ac66f0: Any): Unit = attributes(__idx_ac66f0.toList())

  /**
   * The description of the entitlement.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the entitlement.
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
   * The name of the entitlement.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the entitlement.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The name of the stack.
   */
  public open fun stackName(): String = unwrap(this).getStackName()

  /**
   * The name of the stack.
   */
  public open fun stackName(`value`: String) {
    unwrap(this).setStackName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnEntitlement].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to entitle all apps or only selected apps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-appvisibility)
     * @param appVisibility Specifies whether to entitle all apps or only selected apps. 
     */
    public fun appVisibility(appVisibility: String)

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     * @param attributes The attributes of the entitlement. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     * @param attributes The attributes of the entitlement. 
     */
    public fun attributes(attributes: List<Any>)

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     * @param attributes The attributes of the entitlement. 
     */
    public fun attributes(vararg attributes: Any)

    /**
     * The description of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-description)
     * @param description The description of the entitlement. 
     */
    public fun description(description: String)

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-name)
     * @param name The name of the entitlement. 
     */
    public fun name(name: String)

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-stackname)
     * @param stackName The name of the stack. 
     */
    public fun stackName(stackName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnEntitlement.Builder =
        software.amazon.awscdk.services.appstream.CfnEntitlement.Builder.create(scope, id)

    /**
     * Specifies whether to entitle all apps or only selected apps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-appvisibility)
     * @param appVisibility Specifies whether to entitle all apps or only selected apps. 
     */
    override fun appVisibility(appVisibility: String) {
      cdkBuilder.appVisibility(appVisibility)
    }

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     * @param attributes The attributes of the entitlement. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     * @param attributes The attributes of the entitlement. 
     */
    override fun attributes(attributes: List<Any>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     * @param attributes The attributes of the entitlement. 
     */
    override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

    /**
     * The description of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-description)
     * @param description The description of the entitlement. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-name)
     * @param name The name of the entitlement. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-stackname)
     * @param stackName The name of the stack. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnEntitlement =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnEntitlement.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEntitlement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEntitlement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlement):
        CfnEntitlement = CfnEntitlement(cdkObject)

    internal fun unwrap(wrapped: CfnEntitlement):
        software.amazon.awscdk.services.appstream.CfnEntitlement = wrapped.cdkObject
  }

  public interface AttributeProperty {
    /**
     * A supported AWS IAM SAML PrincipalTag attribute that is matched to a value when a user
     * identity federates to an AppStream 2.0 SAML application.
     *
     * The following are supported values:
     *
     * * roles
     * * department
     * * organization
     * * groups
     * * title
     * * costCenter
     * * userType
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-entitlement-attribute.html#cfn-appstream-entitlement-attribute-name)
     */
    public fun name(): String

    /**
     * A value that is matched to a supported SAML attribute name when a user identity federates to
     * an AppStream 2.0 SAML application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-entitlement-attribute.html#cfn-appstream-entitlement-attribute-value)
     */
    public fun `value`(): String

    /**
     * A builder for [AttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name A supported AWS IAM SAML PrincipalTag attribute that is matched to a value when
       * a user identity federates to an AppStream 2.0 SAML application. 
       * The following are supported values:
       *
       * * roles
       * * department
       * * organization
       * * groups
       * * title
       * * costCenter
       * * userType
       */
      public fun name(name: String)

      /**
       * @param value A value that is matched to a supported SAML attribute name when a user
       * identity federates to an AppStream 2.0 SAML application. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty.builder()

      /**
       * @param name A supported AWS IAM SAML PrincipalTag attribute that is matched to a value when
       * a user identity federates to an AppStream 2.0 SAML application. 
       * The following are supported values:
       *
       * * roles
       * * department
       * * organization
       * * groups
       * * title
       * * costCenter
       * * userType
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value A value that is matched to a supported SAML attribute name when a user
       * identity federates to an AppStream 2.0 SAML application. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty,
    ) : CdkObject(cdkObject), AttributeProperty {
      /**
       * A supported AWS IAM SAML PrincipalTag attribute that is matched to a value when a user
       * identity federates to an AppStream 2.0 SAML application.
       *
       * The following are supported values:
       *
       * * roles
       * * department
       * * organization
       * * groups
       * * title
       * * costCenter
       * * userType
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-entitlement-attribute.html#cfn-appstream-entitlement-attribute-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A value that is matched to a supported SAML attribute name when a user identity federates
       * to an AppStream 2.0 SAML application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-entitlement-attribute.html#cfn-appstream-entitlement-attribute-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty):
          AttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty
    }
  }
}
