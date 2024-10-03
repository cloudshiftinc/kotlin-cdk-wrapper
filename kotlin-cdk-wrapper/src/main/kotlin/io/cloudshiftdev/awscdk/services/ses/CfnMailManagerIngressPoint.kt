@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource to provision an ingress endpoint for receiving email.
 *
 * An ingress endpoint serves as the entry point for incoming emails, allowing you to define how
 * emails are received and processed within your AWS environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerIngressPoint cfnMailManagerIngressPoint =
 * CfnMailManagerIngressPoint.Builder.create(this, "MyCfnMailManagerIngressPoint")
 * .ruleSetId("ruleSetId")
 * .trafficPolicyId("trafficPolicyId")
 * .type("type")
 * // the properties below are optional
 * .ingressPointConfiguration(IngressPointConfigurationProperty.builder()
 * .secretArn("secretArn")
 * .smtpPassword("smtpPassword")
 * .build())
 * .ingressPointName("ingressPointName")
 * .statusToUpdate("statusToUpdate")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html)
 */
public open class CfnMailManagerIngressPoint(
  cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerIngressPointProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMailManagerIngressPointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerIngressPointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMailManagerIngressPointProps(props)
  )

  /**
   * The DNS A Record that identifies your ingress endpoint.
   *
   * Configure your DNS Mail Exchange (MX) record with this value to route emails to Mail Manager.
   */
  public open fun attrARecord(): String = unwrap(this).getAttrARecord()

  /**
   * The Amazon Resource Name (ARN) of the ingress endpoint resource.
   */
  public open fun attrIngressPointArn(): String = unwrap(this).getAttrIngressPointArn()

  /**
   * The identifier of the ingress endpoint resource.
   */
  public open fun attrIngressPointId(): String = unwrap(this).getAttrIngressPointId()

  /**
   * The status of the ingress endpoint resource.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The configuration of the ingress endpoint resource.
   */
  public open fun ingressPointConfiguration(): Any? = unwrap(this).getIngressPointConfiguration()

  /**
   * The configuration of the ingress endpoint resource.
   */
  public open fun ingressPointConfiguration(`value`: IResolvable) {
    unwrap(this).setIngressPointConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of the ingress endpoint resource.
   */
  public open fun ingressPointConfiguration(`value`: IngressPointConfigurationProperty) {
    unwrap(this).setIngressPointConfiguration(`value`.let(IngressPointConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration of the ingress endpoint resource.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e378ac31b06e7c48badb8840de892b7392cc1ea0f2485f434b2621b04c441c67")
  public open
      fun ingressPointConfiguration(`value`: IngressPointConfigurationProperty.Builder.() -> Unit):
      Unit = ingressPointConfiguration(IngressPointConfigurationProperty(`value`))

  /**
   * A user friendly name for an ingress endpoint resource.
   */
  public open fun ingressPointName(): String? = unwrap(this).getIngressPointName()

  /**
   * A user friendly name for an ingress endpoint resource.
   */
  public open fun ingressPointName(`value`: String) {
    unwrap(this).setIngressPointName(`value`)
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
   * The identifier of an existing rule set that you attach to an ingress endpoint resource.
   */
  public open fun ruleSetId(): String = unwrap(this).getRuleSetId()

  /**
   * The identifier of an existing rule set that you attach to an ingress endpoint resource.
   */
  public open fun ruleSetId(`value`: String) {
    unwrap(this).setRuleSetId(`value`)
  }

  /**
   * The update status of an ingress endpoint.
   */
  public open fun statusToUpdate(): String? = unwrap(this).getStatusToUpdate()

  /**
   * The update status of an ingress endpoint.
   */
  public open fun statusToUpdate(`value`: String) {
    unwrap(this).setStatusToUpdate(`value`)
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
   */
  public open fun trafficPolicyId(): String = unwrap(this).getTrafficPolicyId()

  /**
   * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
   */
  public open fun trafficPolicyId(`value`: String) {
    unwrap(this).setTrafficPolicyId(`value`)
  }

  /**
   * The type of the ingress endpoint to create.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the ingress endpoint to create.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnMailManagerIngressPoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource. 
     */
    public fun ingressPointConfiguration(ingressPointConfiguration: IResolvable)

    /**
     * The configuration of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource. 
     */
    public
        fun ingressPointConfiguration(ingressPointConfiguration: IngressPointConfigurationProperty)

    /**
     * The configuration of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0fccc05ee78d2c1bb98852a9b3c38b1654f6f75e46f390cd63461cb9dd9b8d")
    public
        fun ingressPointConfiguration(ingressPointConfiguration: IngressPointConfigurationProperty.Builder.() -> Unit)

    /**
     * A user friendly name for an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointname)
     * @param ingressPointName A user friendly name for an ingress endpoint resource. 
     */
    public fun ingressPointName(ingressPointName: String)

    /**
     * The identifier of an existing rule set that you attach to an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-rulesetid)
     * @param ruleSetId The identifier of an existing rule set that you attach to an ingress
     * endpoint resource. 
     */
    public fun ruleSetId(ruleSetId: String)

    /**
     * The update status of an ingress endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-statustoupdate)
     * @param statusToUpdate The update status of an ingress endpoint. 
     */
    public fun statusToUpdate(statusToUpdate: String)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-trafficpolicyid)
     * @param trafficPolicyId The identifier of an existing traffic policy that you attach to an
     * ingress endpoint resource. 
     */
    public fun trafficPolicyId(trafficPolicyId: String)

    /**
     * The type of the ingress endpoint to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-type)
     * @param type The type of the ingress endpoint to create. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.Builder.create(scope, id)

    /**
     * The configuration of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource. 
     */
    override fun ingressPointConfiguration(ingressPointConfiguration: IResolvable) {
      cdkBuilder.ingressPointConfiguration(ingressPointConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource. 
     */
    override
        fun ingressPointConfiguration(ingressPointConfiguration: IngressPointConfigurationProperty) {
      cdkBuilder.ingressPointConfiguration(ingressPointConfiguration.let(IngressPointConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0fccc05ee78d2c1bb98852a9b3c38b1654f6f75e46f390cd63461cb9dd9b8d")
    override
        fun ingressPointConfiguration(ingressPointConfiguration: IngressPointConfigurationProperty.Builder.() -> Unit):
        Unit =
        ingressPointConfiguration(IngressPointConfigurationProperty(ingressPointConfiguration))

    /**
     * A user friendly name for an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointname)
     * @param ingressPointName A user friendly name for an ingress endpoint resource. 
     */
    override fun ingressPointName(ingressPointName: String) {
      cdkBuilder.ingressPointName(ingressPointName)
    }

    /**
     * The identifier of an existing rule set that you attach to an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-rulesetid)
     * @param ruleSetId The identifier of an existing rule set that you attach to an ingress
     * endpoint resource. 
     */
    override fun ruleSetId(ruleSetId: String) {
      cdkBuilder.ruleSetId(ruleSetId)
    }

    /**
     * The update status of an ingress endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-statustoupdate)
     * @param statusToUpdate The update status of an ingress endpoint. 
     */
    override fun statusToUpdate(statusToUpdate: String) {
      cdkBuilder.statusToUpdate(statusToUpdate)
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-trafficpolicyid)
     * @param trafficPolicyId The identifier of an existing traffic policy that you attach to an
     * ingress endpoint resource. 
     */
    override fun trafficPolicyId(trafficPolicyId: String) {
      cdkBuilder.trafficPolicyId(trafficPolicyId)
    }

    /**
     * The type of the ingress endpoint to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-type)
     * @param type The type of the ingress endpoint to create. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMailManagerIngressPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMailManagerIngressPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint):
        CfnMailManagerIngressPoint = CfnMailManagerIngressPoint(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerIngressPoint):
        software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint
  }

  /**
   * The configuration of the ingress endpoint resource.
   *
   *
   * This data type is a UNION, so only one of the following members can be specified when used or
   * returned.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressPointConfigurationProperty ingressPointConfigurationProperty =
   * IngressPointConfigurationProperty.builder()
   * .secretArn("secretArn")
   * .smtpPassword("smtpPassword")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-ingresspointconfiguration.html)
   */
  public interface IngressPointConfigurationProperty {
    /**
     * The SecretsManager::Secret ARN of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-ingresspointconfiguration.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * The password of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-ingresspointconfiguration.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration-smtppassword)
     */
    public fun smtpPassword(): String? = unwrap(this).getSmtpPassword()

    /**
     * A builder for [IngressPointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretArn The SecretsManager::Secret ARN of the ingress endpoint resource.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param smtpPassword The password of the ingress endpoint resource.
       */
      public fun smtpPassword(smtpPassword: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.IngressPointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.IngressPointConfigurationProperty.builder()

      /**
       * @param secretArn The SecretsManager::Secret ARN of the ingress endpoint resource.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param smtpPassword The password of the ingress endpoint resource.
       */
      override fun smtpPassword(smtpPassword: String) {
        cdkBuilder.smtpPassword(smtpPassword)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.IngressPointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.IngressPointConfigurationProperty,
    ) : CdkObject(cdkObject),
        IngressPointConfigurationProperty {
      /**
       * The SecretsManager::Secret ARN of the ingress endpoint resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-ingresspointconfiguration.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()

      /**
       * The password of the ingress endpoint resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-ingresspointconfiguration.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration-smtppassword)
       */
      override fun smtpPassword(): String? = unwrap(this).getSmtpPassword()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IngressPointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.IngressPointConfigurationProperty):
          IngressPointConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressPointConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressPointConfigurationProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.IngressPointConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.IngressPointConfigurationProperty
    }
  }
}
