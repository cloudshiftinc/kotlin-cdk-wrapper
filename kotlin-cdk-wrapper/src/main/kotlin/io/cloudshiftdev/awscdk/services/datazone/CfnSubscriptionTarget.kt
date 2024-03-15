@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * The `AWS::DataZone::SubscriptionTarget` resource specifies an Amazon DataZone subscription
 * target.
 *
 * Subscription targets enable you to access the data to which you have subscribed in your projects.
 * A subscription target specifies the location (for example, a database or a schema) and the required
 * permissions (for example, an IAM role) that Amazon DataZone can use to establish a connection with
 * the source data and to create the necessary grants so that members of the Amazon DataZone project
 * can start querying the data to which they have subscribed.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnSubscriptionTarget cfnSubscriptionTarget = CfnSubscriptionTarget.Builder.create(this,
 * "MyCfnSubscriptionTarget")
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
public open class CfnSubscriptionTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The asset types included in the subscription target.
   */
  public open fun applicableAssetTypes(): List<String> = unwrap(this).getApplicableAssetTypes()

  /**
   * The asset types included in the subscription target.
   */
  public open fun applicableAssetTypes(`value`: List<String>) {
    unwrap(this).setApplicableAssetTypes(`value`)
  }

  /**
   * The asset types included in the subscription target.
   */
  public open fun applicableAssetTypes(vararg `value`: String): Unit =
      applicableAssetTypes(`value`.toList())

  /**
   * The timestamp of when the subscription target was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon DataZone user who created the subscription target.
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The identifier of the Amazon DataZone domain in which the subscription target exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The identifier of the environment of the subscription target.
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * The identifier of the subscription target.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The identifier of the project specified in the subscription target.
   */
  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  /**
   * The timestamp of when the subscription target was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The Amazon DataZone user who updated the subscription target.
   */
  public open fun attrUpdatedBy(): String = unwrap(this).getAttrUpdatedBy()

  /**
   * The authorized principals included in the subscription target.
   */
  public open fun authorizedPrincipals(): List<String> = unwrap(this).getAuthorizedPrincipals()

  /**
   * The authorized principals included in the subscription target.
   */
  public open fun authorizedPrincipals(`value`: List<String>) {
    unwrap(this).setAuthorizedPrincipals(`value`)
  }

  /**
   * The authorized principals included in the subscription target.
   */
  public open fun authorizedPrincipals(vararg `value`: String): Unit =
      authorizedPrincipals(`value`.toList())

  /**
   * The ID of the Amazon DataZone domain in which subscription target is created.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The ID of the Amazon DataZone domain in which subscription target is created.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The ID of the environment in which subscription target is created.
   */
  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  /**
   * The ID of the environment in which subscription target is created.
   */
  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
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
   * The manage access role that is used to create the subscription target.
   */
  public open fun manageAccessRole(): String = unwrap(this).getManageAccessRole()

  /**
   * The manage access role that is used to create the subscription target.
   */
  public open fun manageAccessRole(`value`: String) {
    unwrap(this).setManageAccessRole(`value`)
  }

  /**
   * The name of the subscription target.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the subscription target.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The provider of the subscription target.
   */
  public open fun provider(): String? = unwrap(this).getProvider()

  /**
   * The provider of the subscription target.
   */
  public open fun provider(`value`: String) {
    unwrap(this).setProvider(`value`)
  }

  /**
   * The configuration of the subscription target.
   */
  public open fun subscriptionTargetConfig(): Any = unwrap(this).getSubscriptionTargetConfig()

  /**
   * The configuration of the subscription target.
   */
  public open fun subscriptionTargetConfig(`value`: IResolvable) {
    unwrap(this).setSubscriptionTargetConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of the subscription target.
   */
  public open fun subscriptionTargetConfig(_idx_ac66f0: List<Any>) {
    unwrap(this).setSubscriptionTargetConfig(_idx_ac66f0)
  }

  /**
   * The configuration of the subscription target.
   */
  public open fun subscriptionTargetConfig(vararg _idx_ac66f0: Any): Unit =
      subscriptionTargetConfig(_idx_ac66f0.toList())

  /**
   * The type of the subscription target.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the subscription target.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnSubscriptionTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The asset types included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    public fun applicableAssetTypes(applicableAssetTypes: List<String>)

    /**
     * The asset types included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    public fun applicableAssetTypes(vararg applicableAssetTypes: String)

    /**
     * The authorized principals included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    public fun authorizedPrincipals(authorizedPrincipals: List<String>)

    /**
     * The authorized principals included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    public fun authorizedPrincipals(vararg authorizedPrincipals: String)

    /**
     * The ID of the Amazon DataZone domain in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-domainidentifier)
     * @param domainIdentifier The ID of the Amazon DataZone domain in which subscription target is
     * created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The ID of the environment in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-environmentidentifier)
     * @param environmentIdentifier The ID of the environment in which subscription target is
     * created. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * The manage access role that is used to create the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-manageaccessrole)
     * @param manageAccessRole The manage access role that is used to create the subscription
     * target. 
     */
    public fun manageAccessRole(manageAccessRole: String)

    /**
     * The name of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-name)
     * @param name The name of the subscription target. 
     */
    public fun name(name: String)

    /**
     * The provider of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-provider)
     * @param provider The provider of the subscription target. 
     */
    public fun provider(provider: String)

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable)

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    public fun subscriptionTargetConfig(subscriptionTargetConfig: List<Any>)

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    public fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any)

    /**
     * The type of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-type)
     * @param type The type of the subscription target. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.Builder =
        software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.Builder.create(scope, id)

    /**
     * The asset types included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    override fun applicableAssetTypes(applicableAssetTypes: List<String>) {
      cdkBuilder.applicableAssetTypes(applicableAssetTypes)
    }

    /**
     * The asset types included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-applicableassettypes)
     * @param applicableAssetTypes The asset types included in the subscription target. 
     */
    override fun applicableAssetTypes(vararg applicableAssetTypes: String): Unit =
        applicableAssetTypes(applicableAssetTypes.toList())

    /**
     * The authorized principals included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    override fun authorizedPrincipals(authorizedPrincipals: List<String>) {
      cdkBuilder.authorizedPrincipals(authorizedPrincipals)
    }

    /**
     * The authorized principals included in the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-authorizedprincipals)
     * @param authorizedPrincipals The authorized principals included in the subscription target. 
     */
    override fun authorizedPrincipals(vararg authorizedPrincipals: String): Unit =
        authorizedPrincipals(authorizedPrincipals.toList())

    /**
     * The ID of the Amazon DataZone domain in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-domainidentifier)
     * @param domainIdentifier The ID of the Amazon DataZone domain in which subscription target is
     * created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The ID of the environment in which subscription target is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-environmentidentifier)
     * @param environmentIdentifier The ID of the environment in which subscription target is
     * created. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The manage access role that is used to create the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-manageaccessrole)
     * @param manageAccessRole The manage access role that is used to create the subscription
     * target. 
     */
    override fun manageAccessRole(manageAccessRole: String) {
      cdkBuilder.manageAccessRole(manageAccessRole)
    }

    /**
     * The name of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-name)
     * @param name The name of the subscription target. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The provider of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-provider)
     * @param provider The provider of the subscription target. 
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    override fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable) {
      cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    override fun subscriptionTargetConfig(subscriptionTargetConfig: List<Any>) {
      cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig)
    }

    /**
     * The configuration of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-subscriptiontargetconfig)
     * @param subscriptionTargetConfig The configuration of the subscription target. 
     */
    override fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any): Unit =
        subscriptionTargetConfig(subscriptionTargetConfig.toList())

    /**
     * The type of the subscription target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html#cfn-datazone-subscriptiontarget-type)
     * @param type The type of the subscription target. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnSubscriptionTarget =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget):
        CfnSubscriptionTarget = CfnSubscriptionTarget(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionTarget):
        software.amazon.awscdk.services.datazone.CfnSubscriptionTarget = wrapped.cdkObject
  }

  /**
   * The details of the subscription target configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * SubscriptionTargetFormProperty subscriptionTargetFormProperty =
   * SubscriptionTargetFormProperty.builder()
   * .content("content")
   * .formName("formName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-subscriptiontarget-subscriptiontargetform.html)
   */
  public interface SubscriptionTargetFormProperty {
    /**
     * The content of the subscription target configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-subscriptiontarget-subscriptiontargetform.html#cfn-datazone-subscriptiontarget-subscriptiontargetform-content)
     */
    public fun content(): String

    /**
     * The form name included in the subscription target configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-subscriptiontarget-subscriptiontargetform.html#cfn-datazone-subscriptiontarget-subscriptiontargetform-formname)
     */
    public fun formName(): String

    /**
     * A builder for [SubscriptionTargetFormProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content The content of the subscription target configuration. 
       */
      public fun content(content: String)

      /**
       * @param formName The form name included in the subscription target configuration. 
       */
      public fun formName(formName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty.builder()

      /**
       * @param content The content of the subscription target configuration. 
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      /**
       * @param formName The form name included in the subscription target configuration. 
       */
      override fun formName(formName: String) {
        cdkBuilder.formName(formName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty,
    ) : CdkObject(cdkObject), SubscriptionTargetFormProperty {
      /**
       * The content of the subscription target configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-subscriptiontarget-subscriptiontargetform.html#cfn-datazone-subscriptiontarget-subscriptiontargetform-content)
       */
      override fun content(): String = unwrap(this).getContent()

      /**
       * The form name included in the subscription target configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-subscriptiontarget-subscriptiontargetform.html#cfn-datazone-subscriptiontarget-subscriptiontargetform-formname)
       */
      override fun formName(): String = unwrap(this).getFormName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionTargetFormProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty):
          SubscriptionTargetFormProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionTargetFormProperty):
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty
    }
  }
}
