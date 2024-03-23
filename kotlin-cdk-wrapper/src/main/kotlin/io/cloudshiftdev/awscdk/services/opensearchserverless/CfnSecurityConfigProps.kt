@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSecurityConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnSecurityConfigProps cfnSecurityConfigProps = CfnSecurityConfigProps.builder()
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
public interface CfnSecurityConfigProps {
  /**
   * The description of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * SAML options for the security configuration in the form of a key-value map.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
   */
  public fun samlOptions(): Any? = unwrap(this).getSamlOptions()

  /**
   * The type of security configuration.
   *
   * Currently the only option is `saml` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnSecurityConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the security configuration.
     */
    public fun description(description: String)

    /**
     * @param name The name of the security configuration.
     */
    public fun name(name: String)

    /**
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map.
     */
    public fun samlOptions(samlOptions: IResolvable)

    /**
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map.
     */
    public fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty)

    /**
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3b47a1112dc446a187fb14cfdd814fa4476b0948a61e41875af6250cd7fa481")
    public
        fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty.Builder.() -> Unit)

    /**
     * @param type The type of security configuration.
     * Currently the only option is `saml` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps.builder()

    /**
     * @param description The description of the security configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the security configuration.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map.
     */
    override fun samlOptions(samlOptions: IResolvable) {
      cdkBuilder.samlOptions(samlOptions.let(IResolvable::unwrap))
    }

    /**
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map.
     */
    override fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty) {
      cdkBuilder.samlOptions(samlOptions.let(CfnSecurityConfig.SamlConfigOptionsProperty::unwrap))
    }

    /**
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     * map.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3b47a1112dc446a187fb14cfdd814fa4476b0948a61e41875af6250cd7fa481")
    override
        fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty.Builder.() -> Unit):
        Unit = samlOptions(CfnSecurityConfig.SamlConfigOptionsProperty(samlOptions))

    /**
     * @param type The type of security configuration.
     * Currently the only option is `saml` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps,
  ) : CdkObject(cdkObject), CfnSecurityConfigProps {
    /**
     * The description of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     */
    override fun samlOptions(): Any? = unwrap(this).getSamlOptions()

    /**
     * The type of security configuration.
     *
     * Currently the only option is `saml` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps):
        CfnSecurityConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSecurityConfigProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfigProps):
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
  }
}
