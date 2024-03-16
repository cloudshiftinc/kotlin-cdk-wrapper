@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a security configuration for OpenSearch Serverless.
 *
 * For more information, see [SAML authentication for Amazon OpenSearch
 * Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnSecurityConfig cfnSecurityConfig = CfnSecurityConfig.Builder.create(this,
 * "MyCfnSecurityConfig")
 * .description("description")
 * .name("name")
 * .samlOptions(SamlConfigOptionsProperty.builder()
 * .metadata("metadata")
 * // the properties below are optional
 * .groupAttribute("groupAttribute")
 * .sessionTimeout(123)
 * .userAttribute("userAttribute")
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html)
 */
public open class CfnSecurityConfig internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The unique identifier of the security configuration.
   *
   * For example, `saml/123456789012/myprovider` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of the security configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the security configuration.
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
   * The name of the security configuration.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the security configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * SAML options for the security configuration in the form of a key-value map.
   */
  public open fun samlOptions(): Any? = unwrap(this).getSamlOptions()

  /**
   * SAML options for the security configuration in the form of a key-value map.
   */
  public open fun samlOptions(`value`: IResolvable) {
    unwrap(this).setSamlOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * SAML options for the security configuration in the form of a key-value map.
   */
  public open fun samlOptions(`value`: SamlConfigOptionsProperty) {
    unwrap(this).setSamlOptions(`value`.let(SamlConfigOptionsProperty::unwrap))
  }

  /**
   * SAML options for the security configuration in the form of a key-value map.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4de935795cdebeb67e4642a8fd371bc8651ac6c7fe9df9018650d497514250c6")
  public open fun samlOptions(`value`: SamlConfigOptionsProperty.Builder.() -> Unit): Unit =
      samlOptions(SamlConfigOptionsProperty(`value`))

  /**
   * The type of security configuration.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of security configuration.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchserverless.CfnSecurityConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-description)
     * @param description The description of the security configuration. 
     */
    public fun description(description: String)

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-name)
     * @param name The name of the security configuration. 
     */
    public fun name(name: String)

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map. 
     */
    public fun samlOptions(samlOptions: IResolvable)

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map. 
     */
    public fun samlOptions(samlOptions: SamlConfigOptionsProperty)

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6f686691d030724cbcf06455357d131785d142c32d88d2163185e08d40523f2")
    public fun samlOptions(samlOptions: SamlConfigOptionsProperty.Builder.() -> Unit)

    /**
     * The type of security configuration.
     *
     * Currently the only option is `saml` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-type)
     * @param type The type of security configuration. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.Builder.create(scope,
        id)

    /**
     * The description of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-description)
     * @param description The description of the security configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-name)
     * @param name The name of the security configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map. 
     */
    override fun samlOptions(samlOptions: IResolvable) {
      cdkBuilder.samlOptions(samlOptions.let(IResolvable::unwrap))
    }

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map. 
     */
    override fun samlOptions(samlOptions: SamlConfigOptionsProperty) {
      cdkBuilder.samlOptions(samlOptions.let(SamlConfigOptionsProperty::unwrap))
    }

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6f686691d030724cbcf06455357d131785d142c32d88d2163185e08d40523f2")
    override fun samlOptions(samlOptions: SamlConfigOptionsProperty.Builder.() -> Unit): Unit =
        samlOptions(SamlConfigOptionsProperty(samlOptions))

    /**
     * The type of security configuration.
     *
     * Currently the only option is `saml` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-type)
     * @param type The type of security configuration. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig):
        CfnSecurityConfig = CfnSecurityConfig(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfig):
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig = wrapped.cdkObject
  }

  /**
   * Describes SAML options for an OpenSearch Serverless security configuration in the form of a
   * key-value map.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * SamlConfigOptionsProperty samlConfigOptionsProperty = SamlConfigOptionsProperty.builder()
   * .metadata("metadata")
   * // the properties below are optional
   * .groupAttribute("groupAttribute")
   * .sessionTimeout(123)
   * .userAttribute("userAttribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html)
   */
  public interface SamlConfigOptionsProperty {
    /**
     * The group attribute for this SAML integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-groupattribute)
     */
    public fun groupAttribute(): String? = unwrap(this).getGroupAttribute()

    /**
     * The XML IdP metadata file generated from your identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-metadata)
     */
    public fun metadata(): String

    /**
     * The session timeout, in minutes.
     *
     * Default is 60 minutes (12 hours).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-sessiontimeout)
     */
    public fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

    /**
     * A user attribute for this SAML integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-userattribute)
     */
    public fun userAttribute(): String? = unwrap(this).getUserAttribute()

    /**
     * A builder for [SamlConfigOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupAttribute The group attribute for this SAML integration.
       */
      public fun groupAttribute(groupAttribute: String)

      /**
       * @param metadata The XML IdP metadata file generated from your identity provider. 
       */
      public fun metadata(metadata: String)

      /**
       * @param sessionTimeout The session timeout, in minutes.
       * Default is 60 minutes (12 hours).
       */
      public fun sessionTimeout(sessionTimeout: Number)

      /**
       * @param userAttribute A user attribute for this SAML integration.
       */
      public fun userAttribute(userAttribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty.builder()

      /**
       * @param groupAttribute The group attribute for this SAML integration.
       */
      override fun groupAttribute(groupAttribute: String) {
        cdkBuilder.groupAttribute(groupAttribute)
      }

      /**
       * @param metadata The XML IdP metadata file generated from your identity provider. 
       */
      override fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
      }

      /**
       * @param sessionTimeout The session timeout, in minutes.
       * Default is 60 minutes (12 hours).
       */
      override fun sessionTimeout(sessionTimeout: Number) {
        cdkBuilder.sessionTimeout(sessionTimeout)
      }

      /**
       * @param userAttribute A user attribute for this SAML integration.
       */
      override fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty,
    ) : CdkObject(cdkObject), SamlConfigOptionsProperty {
      /**
       * The group attribute for this SAML integration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-groupattribute)
       */
      override fun groupAttribute(): String? = unwrap(this).getGroupAttribute()

      /**
       * The XML IdP metadata file generated from your identity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-metadata)
       */
      override fun metadata(): String = unwrap(this).getMetadata()

      /**
       * The session timeout, in minutes.
       *
       * Default is 60 minutes (12 hours).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-sessiontimeout)
       */
      override fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

      /**
       * A user attribute for this SAML integration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html#cfn-opensearchserverless-securityconfig-samlconfigoptions-userattribute)
       */
      override fun userAttribute(): String? = unwrap(this).getUserAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SamlConfigOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty):
          SamlConfigOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as SamlConfigOptionsProperty

      internal fun unwrap(wrapped: SamlConfigOptionsProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty
    }
  }
}
