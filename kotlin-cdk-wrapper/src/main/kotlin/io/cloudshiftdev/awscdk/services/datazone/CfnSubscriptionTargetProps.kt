@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSubscriptionTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnSubscriptionTargetProps cfnSubscriptionTargetProps = CfnSubscriptionTargetProps.builder()
 * .applicableAssetTypes(List.of("applicableAssetTypes"))
 * .authorizedPrincipals(List.of("authorizedPrincipals"))
 * .domainIdentifier("domainIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .manageAccessRole("manageAccessRole")
 * .name("name")
 * .subscriptionTargetConfig(List.of(SubscriptionTargetFormProperty.builder()
 * .content("content")
 * .formName("formName")
 * .build()))
 * .type("type")
 * // the properties below are optional
 * .provider("provider")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html)
 */
public interface CfnSubscriptionTargetProps {
  /**
   * The asset types included in the subscription target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
   */
  public fun applicableAssetTypes(): List<String>

  /**
   * The authorized principals included in the subscription target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
   */
  public fun authorizedPrincipals(): List<String>

  /**
   * The ID of the Amazon DataZone domain in which subscription target is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The ID of the environment in which subscription target is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-environmentidentifier)
   */
  public fun environmentIdentifier(): String

  /**
   * The manage access role that is used to create the subscription target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-manageaccessrole)
   */
  public fun manageAccessRole(): String

  /**
   * The name of the subscription target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-name)
   */
  public fun name(): String

  /**
   * The provider of the subscription target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-provider)
   */
  public fun provider(): String? = unwrap(this).getProvider()

  /**
   * The configuration of the subscription target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
   */
  public fun subscriptionTargetConfig(): Any

  /**
   * The type of the subscription target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnSubscriptionTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    public fun applicableAssetTypes(applicableAssetTypes: List<String>)

    /**
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    public fun applicableAssetTypes(vararg applicableAssetTypes: String)

    /**
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    public fun authorizedPrincipals(authorizedPrincipals: List<String>)

    /**
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    public fun authorizedPrincipals(vararg authorizedPrincipals: String)

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain in which subscription target is
     * created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param environmentIdentifier The ID of the environment in which subscription target is
     * created. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * @param manageAccessRole The manage access role that is used to create the subscription
     * target. 
     */
    public fun manageAccessRole(manageAccessRole: String)

    /**
     * @param name The name of the subscription target. 
     */
    public fun name(name: String)

    /**
     * @param provider The provider of the subscription target.
     */
    public fun provider(provider: String)

    /**
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable)

    /**
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: List<Any>)

    /**
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    public fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any)

    /**
     * @param type The type of the subscription target. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps.Builder =
        software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps.builder()

    /**
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    override fun applicableAssetTypes(applicableAssetTypes: List<String>) {
      cdkBuilder.applicableAssetTypes(applicableAssetTypes)
    }

    /**
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    override fun applicableAssetTypes(vararg applicableAssetTypes: String): Unit =
        applicableAssetTypes(applicableAssetTypes.toList())

    /**
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    override fun authorizedPrincipals(authorizedPrincipals: List<String>) {
      cdkBuilder.authorizedPrincipals(authorizedPrincipals)
    }

    /**
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    override fun authorizedPrincipals(vararg authorizedPrincipals: String): Unit =
        authorizedPrincipals(authorizedPrincipals.toList())

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain in which subscription target is
     * created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param environmentIdentifier The ID of the environment in which subscription target is
     * created. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param manageAccessRole The manage access role that is used to create the subscription
     * target. 
     */
    override fun manageAccessRole(manageAccessRole: String) {
      cdkBuilder.manageAccessRole(manageAccessRole)
    }

    /**
     * @param name The name of the subscription target. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param provider The provider of the subscription target.
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    override fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable) {
      cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig.let(IResolvable::unwrap))
    }

    /**
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    override fun subscriptionTargetConfig(subscriptionTargetConfig: List<Any>) {
      cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig)
    }

    /**
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    override fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any): Unit =
        subscriptionTargetConfig(subscriptionTargetConfig.toList())

    /**
     * @param type The type of the subscription target. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps,
  ) : CdkObject(cdkObject), CfnSubscriptionTargetProps {
    /**
     * The asset types included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
     */
    override fun applicableAssetTypes(): List<String> = unwrap(this).getApplicableAssetTypes()

    /**
     * The authorized principals included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
     */
    override fun authorizedPrincipals(): List<String> = unwrap(this).getAuthorizedPrincipals()

    /**
     * The ID of the Amazon DataZone domain in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The ID of the environment in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-environmentidentifier)
     */
    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    /**
     * The manage access role that is used to create the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-manageaccessrole)
     */
    override fun manageAccessRole(): String = unwrap(this).getManageAccessRole()

    /**
     * The name of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The provider of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-provider)
     */
    override fun provider(): String? = unwrap(this).getProvider()

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     */
    override fun subscriptionTargetConfig(): Any = unwrap(this).getSubscriptionTargetConfig()

    /**
     * The type of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriptionTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps):
        CfnSubscriptionTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionTargetProps):
        software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps
  }
}
