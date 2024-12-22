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
 * .iamIdentityCenterOptions(IamIdentityCenterConfigOptionsProperty.builder()
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .applicationArn("applicationArn")
 * .applicationDescription("applicationDescription")
 * .applicationName("applicationName")
 * .groupAttribute("groupAttribute")
 * .userAttribute("userAttribute")
 * .build())
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
public open class CfnSecurityConfig(
  cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityConfigProps,
  ) :
      this(software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSecurityConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityConfigProps(props)
  )

  /**
   * The ARN of the IAM Identity Center application used to integrate with OpenSearch Serverless.
   */
  public open fun attrIamIdentityCenterOptionsApplicationArn(): String =
      unwrap(this).getAttrIamIdentityCenterOptionsApplicationArn()

  /**
   * The description of the IAM Identity Center application used to integrate with OpenSearch
   * Serverless.
   */
  public open fun attrIamIdentityCenterOptionsApplicationDescription(): String =
      unwrap(this).getAttrIamIdentityCenterOptionsApplicationDescription()

  /**
   * The name of the IAM Identity Center application used to integrate with OpenSearch Serverless.
   */
  public open fun attrIamIdentityCenterOptionsApplicationName(): String =
      unwrap(this).getAttrIamIdentityCenterOptionsApplicationName()

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
   * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
   * the form of a key-value map.
   */
  public open fun iamIdentityCenterOptions(): Any? = unwrap(this).getIamIdentityCenterOptions()

  /**
   * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
   * the form of a key-value map.
   */
  public open fun iamIdentityCenterOptions(`value`: IResolvable) {
    unwrap(this).setIamIdentityCenterOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
   * the form of a key-value map.
   */
  public open fun iamIdentityCenterOptions(`value`: IamIdentityCenterConfigOptionsProperty) {
    unwrap(this).setIamIdentityCenterOptions(`value`.let(IamIdentityCenterConfigOptionsProperty.Companion::unwrap))
  }

  /**
   * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
   * the form of a key-value map.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07696eaf7a9854c39a2fe9a59529a78b60f060d4ca3c84a36e9b28b22281bd32")
  public open
      fun iamIdentityCenterOptions(`value`: IamIdentityCenterConfigOptionsProperty.Builder.() -> Unit):
      Unit = iamIdentityCenterOptions(IamIdentityCenterConfigOptionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setSamlOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * SAML options for the security configuration in the form of a key-value map.
   */
  public open fun samlOptions(`value`: SamlConfigOptionsProperty) {
    unwrap(this).setSamlOptions(`value`.let(SamlConfigOptionsProperty.Companion::unwrap))
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
     * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
     * the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Describes IAM Identity Center options for an OpenSearch
     * Serverless security configuration in the form of a key-value map. 
     */
    public fun iamIdentityCenterOptions(iamIdentityCenterOptions: IResolvable)

    /**
     * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
     * the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Describes IAM Identity Center options for an OpenSearch
     * Serverless security configuration in the form of a key-value map. 
     */
    public
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterConfigOptionsProperty)

    /**
     * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
     * the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Describes IAM Identity Center options for an OpenSearch
     * Serverless security configuration in the form of a key-value map. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9b259d4d52e3a45485098ebbf1c6bd3601e4098eea5b01ad6c577bba2b4f18e")
    public
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterConfigOptionsProperty.Builder.() -> Unit)

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
     * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
     * the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Describes IAM Identity Center options for an OpenSearch
     * Serverless security configuration in the form of a key-value map. 
     */
    override fun iamIdentityCenterOptions(iamIdentityCenterOptions: IResolvable) {
      cdkBuilder.iamIdentityCenterOptions(iamIdentityCenterOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
     * the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Describes IAM Identity Center options for an OpenSearch
     * Serverless security configuration in the form of a key-value map. 
     */
    override
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterConfigOptionsProperty) {
      cdkBuilder.iamIdentityCenterOptions(iamIdentityCenterOptions.let(IamIdentityCenterConfigOptionsProperty.Companion::unwrap))
    }

    /**
     * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
     * the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Describes IAM Identity Center options for an OpenSearch
     * Serverless security configuration in the form of a key-value map. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9b259d4d52e3a45485098ebbf1c6bd3601e4098eea5b01ad6c577bba2b4f18e")
    override
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterConfigOptionsProperty.Builder.() -> Unit):
        Unit =
        iamIdentityCenterOptions(IamIdentityCenterConfigOptionsProperty(iamIdentityCenterOptions))

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
      cdkBuilder.samlOptions(samlOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map. 
     */
    override fun samlOptions(samlOptions: SamlConfigOptionsProperty) {
      cdkBuilder.samlOptions(samlOptions.let(SamlConfigOptionsProperty.Companion::unwrap))
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
        as software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
  }

  /**
   * Describes IAM Identity Center options for an OpenSearch Serverless security configuration in
   * the form of a key-value map.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * IamIdentityCenterConfigOptionsProperty iamIdentityCenterConfigOptionsProperty =
   * IamIdentityCenterConfigOptionsProperty.builder()
   * .instanceArn("instanceArn")
   * // the properties below are optional
   * .applicationArn("applicationArn")
   * .applicationDescription("applicationDescription")
   * .applicationName("applicationName")
   * .groupAttribute("groupAttribute")
   * .userAttribute("userAttribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html)
   */
  public interface IamIdentityCenterConfigOptionsProperty {
    /**
     * The ARN of the IAM Identity Center application used to integrate with OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-applicationarn)
     */
    public fun applicationArn(): String? = unwrap(this).getApplicationArn()

    /**
     * The description of the IAM Identity Center application used to integrate with OpenSearch
     * Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-applicationdescription)
     */
    public fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

    /**
     * The name of the IAM Identity Center application used to integrate with OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-applicationname)
     */
    public fun applicationName(): String? = unwrap(this).getApplicationName()

    /**
     * Group attribute for this IAM Identity Center integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-groupattribute)
     */
    public fun groupAttribute(): String? = unwrap(this).getGroupAttribute()

    /**
     * The ARN of the IAM Identity Center instance used to integrate with OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-instancearn)
     */
    public fun instanceArn(): String

    /**
     * User attribute for this IAM Identity Center integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-userattribute)
     */
    public fun userAttribute(): String? = unwrap(this).getUserAttribute()

    /**
     * A builder for [IamIdentityCenterConfigOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationArn The ARN of the IAM Identity Center application used to integrate with
       * OpenSearch Serverless.
       */
      public fun applicationArn(applicationArn: String)

      /**
       * @param applicationDescription The description of the IAM Identity Center application used
       * to integrate with OpenSearch Serverless.
       */
      public fun applicationDescription(applicationDescription: String)

      /**
       * @param applicationName The name of the IAM Identity Center application used to integrate
       * with OpenSearch Serverless.
       */
      public fun applicationName(applicationName: String)

      /**
       * @param groupAttribute Group attribute for this IAM Identity Center integration.
       */
      public fun groupAttribute(groupAttribute: String)

      /**
       * @param instanceArn The ARN of the IAM Identity Center instance used to integrate with
       * OpenSearch Serverless. 
       */
      public fun instanceArn(instanceArn: String)

      /**
       * @param userAttribute User attribute for this IAM Identity Center integration.
       */
      public fun userAttribute(userAttribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.IamIdentityCenterConfigOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.IamIdentityCenterConfigOptionsProperty.builder()

      /**
       * @param applicationArn The ARN of the IAM Identity Center application used to integrate with
       * OpenSearch Serverless.
       */
      override fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
      }

      /**
       * @param applicationDescription The description of the IAM Identity Center application used
       * to integrate with OpenSearch Serverless.
       */
      override fun applicationDescription(applicationDescription: String) {
        cdkBuilder.applicationDescription(applicationDescription)
      }

      /**
       * @param applicationName The name of the IAM Identity Center application used to integrate
       * with OpenSearch Serverless.
       */
      override fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
      }

      /**
       * @param groupAttribute Group attribute for this IAM Identity Center integration.
       */
      override fun groupAttribute(groupAttribute: String) {
        cdkBuilder.groupAttribute(groupAttribute)
      }

      /**
       * @param instanceArn The ARN of the IAM Identity Center instance used to integrate with
       * OpenSearch Serverless. 
       */
      override fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
      }

      /**
       * @param userAttribute User attribute for this IAM Identity Center integration.
       */
      override fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.IamIdentityCenterConfigOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.IamIdentityCenterConfigOptionsProperty,
    ) : CdkObject(cdkObject),
        IamIdentityCenterConfigOptionsProperty {
      /**
       * The ARN of the IAM Identity Center application used to integrate with OpenSearch
       * Serverless.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-applicationarn)
       */
      override fun applicationArn(): String? = unwrap(this).getApplicationArn()

      /**
       * The description of the IAM Identity Center application used to integrate with OpenSearch
       * Serverless.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-applicationdescription)
       */
      override fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

      /**
       * The name of the IAM Identity Center application used to integrate with OpenSearch
       * Serverless.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-applicationname)
       */
      override fun applicationName(): String? = unwrap(this).getApplicationName()

      /**
       * Group attribute for this IAM Identity Center integration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-groupattribute)
       */
      override fun groupAttribute(): String? = unwrap(this).getGroupAttribute()

      /**
       * The ARN of the IAM Identity Center instance used to integrate with OpenSearch Serverless.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-instancearn)
       */
      override fun instanceArn(): String = unwrap(this).getInstanceArn()

      /**
       * User attribute for this IAM Identity Center integration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-iamidentitycenterconfigoptions.html#cfn-opensearchserverless-securityconfig-iamidentitycenterconfigoptions-userattribute)
       */
      override fun userAttribute(): String? = unwrap(this).getUserAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IamIdentityCenterConfigOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.IamIdentityCenterConfigOptionsProperty):
          IamIdentityCenterConfigOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IamIdentityCenterConfigOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamIdentityCenterConfigOptionsProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.IamIdentityCenterConfigOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.IamIdentityCenterConfigOptionsProperty
    }
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
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty,
    ) : CdkObject(cdkObject),
        SamlConfigOptionsProperty {
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
          SamlConfigOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SamlConfigOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamlConfigOptionsProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty
    }
  }
}
