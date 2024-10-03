@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnConfigurationPolicyProps cfnConfigurationPolicyProps = CfnConfigurationPolicyProps.builder()
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
public interface CfnConfigurationPolicyProps {
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-configurationpolicy)
   */
  public fun configurationPolicy(): Any

  /**
   * The description of the configuration policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the configuration policy.
   *
   * Alphanumeric characters and the following ASCII characters are permitted: `-, ., !, *, /` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-name)
   */
  public fun name(): String

  /**
   * User-defined tags associated with a configuration policy.
   *
   * For more information, see [Tagging AWS Security Hub
   * resources](https://docs.aws.amazon.com/securityhub/latest/userguide/tagging-resources.html) in the
   * *Security Hub user guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnConfigurationPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     */
    public fun configurationPolicy(configurationPolicy: IResolvable)

    /**
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     */
    public fun configurationPolicy(configurationPolicy: CfnConfigurationPolicy.PolicyProperty)

    /**
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58c6d43fb0fc681e924a2ffb9b76f84a2907276b1e19aa42171a3d08e7f4a9ba")
    public
        fun configurationPolicy(configurationPolicy: CfnConfigurationPolicy.PolicyProperty.Builder.() -> Unit)

    /**
     * @param description The description of the configuration policy.
     */
    public fun description(description: String)

    /**
     * @param name The name of the configuration policy. 
     * Alphanumeric characters and the following ASCII characters are permitted: `-, ., !, *, /` .
     */
    public fun name(name: String)

    /**
     * @param tags User-defined tags associated with a configuration policy.
     * For more information, see [Tagging AWS Security Hub
     * resources](https://docs.aws.amazon.com/securityhub/latest/userguide/tagging-resources.html) in
     * the *Security Hub user guide* .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps.builder()

    /**
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     */
    override fun configurationPolicy(configurationPolicy: IResolvable) {
      cdkBuilder.configurationPolicy(configurationPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     */
    override fun configurationPolicy(configurationPolicy: CfnConfigurationPolicy.PolicyProperty) {
      cdkBuilder.configurationPolicy(configurationPolicy.let(CfnConfigurationPolicy.PolicyProperty.Companion::unwrap))
    }

    /**
     * @param configurationPolicy An object that defines how AWS Security Hub is configured. 
     * It includes whether Security Hub is enabled or disabled, a list of enabled security
     * standards, a list of enabled or disabled security controls, and a list of custom parameter
     * values for specified controls. If you provide a list of security controls that are enabled in
     * the configuration policy, Security Hub disables all other controls (including newly released
     * controls). If you provide a list of security controls that are disabled in the configuration
     * policy, Security Hub enables all other controls (including newly released controls).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58c6d43fb0fc681e924a2ffb9b76f84a2907276b1e19aa42171a3d08e7f4a9ba")
    override
        fun configurationPolicy(configurationPolicy: CfnConfigurationPolicy.PolicyProperty.Builder.() -> Unit):
        Unit = configurationPolicy(CfnConfigurationPolicy.PolicyProperty(configurationPolicy))

    /**
     * @param description The description of the configuration policy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the configuration policy. 
     * Alphanumeric characters and the following ASCII characters are permitted: `-, ., !, *, /` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags User-defined tags associated with a configuration policy.
     * For more information, see [Tagging AWS Security Hub
     * resources](https://docs.aws.amazon.com/securityhub/latest/userguide/tagging-resources.html) in
     * the *Security Hub user guide* .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps,
  ) : CdkObject(cdkObject),
      CfnConfigurationPolicyProps {
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
     */
    override fun configurationPolicy(): Any = unwrap(this).getConfigurationPolicy()

    /**
     * The description of the configuration policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the configuration policy.
     *
     * Alphanumeric characters and the following ASCII characters are permitted: `-, ., !, *, /` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * User-defined tags associated with a configuration policy.
     *
     * For more information, see [Tagging AWS Security Hub
     * resources](https://docs.aws.amazon.com/securityhub/latest/userguide/tagging-resources.html) in
     * the *Security Hub user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-configurationpolicy.html#cfn-securityhub-configurationpolicy-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps):
        CfnConfigurationPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfigurationPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationPolicyProps):
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps
  }
}
