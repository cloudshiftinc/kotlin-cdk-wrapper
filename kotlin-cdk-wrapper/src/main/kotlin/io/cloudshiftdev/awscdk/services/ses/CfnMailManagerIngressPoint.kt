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
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .privateNetworkConfiguration(PrivateNetworkConfigurationProperty.builder()
 * .vpcEndpointId("vpcEndpointId")
 * .build())
 * .publicNetworkConfiguration(PublicNetworkConfigurationProperty.builder()
 * .ipType("ipType")
 * .build())
 * .build())
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
   * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty.Companion::unwrap))
  }

  /**
   * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41e9aa8b82ca584543ba5c02aa0016a5cb517e429de2d42b3c2c082664d23f94")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

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
     * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-networkconfiguration)
     * @param networkConfiguration The network type (IPv4-only, Dual-Stack, PrivateLink) of the
     * ingress endpoint resource. 
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-networkconfiguration)
     * @param networkConfiguration The network type (IPv4-only, Dual-Stack, PrivateLink) of the
     * ingress endpoint resource. 
     */
    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    /**
     * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-networkconfiguration)
     * @param networkConfiguration The network type (IPv4-only, Dual-Stack, PrivateLink) of the
     * ingress endpoint resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d22238cd9fbf14cc084c69fd100e7936f7c474676e788a6a8ee8dd5f76ecb27d")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

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
     * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-networkconfiguration)
     * @param networkConfiguration The network type (IPv4-only, Dual-Stack, PrivateLink) of the
     * ingress endpoint resource. 
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-networkconfiguration)
     * @param networkConfiguration The network type (IPv4-only, Dual-Stack, PrivateLink) of the
     * ingress endpoint resource. 
     */
    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty.Companion::unwrap))
    }

    /**
     * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-networkconfiguration)
     * @param networkConfiguration The network type (IPv4-only, Dual-Stack, PrivateLink) of the
     * ingress endpoint resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d22238cd9fbf14cc084c69fd100e7936f7c474676e788a6a8ee8dd5f76ecb27d")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

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

  /**
   * The network type (IPv4-only, Dual-Stack, PrivateLink) of the ingress endpoint resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * NetworkConfigurationProperty networkConfigurationProperty =
   * NetworkConfigurationProperty.builder()
   * .privateNetworkConfiguration(PrivateNetworkConfigurationProperty.builder()
   * .vpcEndpointId("vpcEndpointId")
   * .build())
   * .publicNetworkConfiguration(PublicNetworkConfigurationProperty.builder()
   * .ipType("ipType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-networkconfiguration.html)
   */
  public interface NetworkConfigurationProperty {
    /**
     * Specifies the network configuration for the private ingress point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-networkconfiguration.html#cfn-ses-mailmanageringresspoint-networkconfiguration-privatenetworkconfiguration)
     */
    public fun privateNetworkConfiguration(): Any? = unwrap(this).getPrivateNetworkConfiguration()

    /**
     * Specifies the network configuration for the public ingress point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-networkconfiguration.html#cfn-ses-mailmanageringresspoint-networkconfiguration-publicnetworkconfiguration)
     */
    public fun publicNetworkConfiguration(): Any? = unwrap(this).getPublicNetworkConfiguration()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param privateNetworkConfiguration Specifies the network configuration for the private
       * ingress point.
       */
      public fun privateNetworkConfiguration(privateNetworkConfiguration: IResolvable)

      /**
       * @param privateNetworkConfiguration Specifies the network configuration for the private
       * ingress point.
       */
      public
          fun privateNetworkConfiguration(privateNetworkConfiguration: PrivateNetworkConfigurationProperty)

      /**
       * @param privateNetworkConfiguration Specifies the network configuration for the private
       * ingress point.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e678f81ef12f26d2e6cd0f714aa634b68d89cb38cf8ecef6ca41746bcf21645")
      public
          fun privateNetworkConfiguration(privateNetworkConfiguration: PrivateNetworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param publicNetworkConfiguration Specifies the network configuration for the public
       * ingress point.
       */
      public fun publicNetworkConfiguration(publicNetworkConfiguration: IResolvable)

      /**
       * @param publicNetworkConfiguration Specifies the network configuration for the public
       * ingress point.
       */
      public
          fun publicNetworkConfiguration(publicNetworkConfiguration: PublicNetworkConfigurationProperty)

      /**
       * @param publicNetworkConfiguration Specifies the network configuration for the public
       * ingress point.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9856fb9bd36f12927cbca165f6368b57aeb47e55c5656f5dcf5ccd4e4cad6b6f")
      public
          fun publicNetworkConfiguration(publicNetworkConfiguration: PublicNetworkConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.NetworkConfigurationProperty.builder()

      /**
       * @param privateNetworkConfiguration Specifies the network configuration for the private
       * ingress point.
       */
      override fun privateNetworkConfiguration(privateNetworkConfiguration: IResolvable) {
        cdkBuilder.privateNetworkConfiguration(privateNetworkConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param privateNetworkConfiguration Specifies the network configuration for the private
       * ingress point.
       */
      override
          fun privateNetworkConfiguration(privateNetworkConfiguration: PrivateNetworkConfigurationProperty) {
        cdkBuilder.privateNetworkConfiguration(privateNetworkConfiguration.let(PrivateNetworkConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param privateNetworkConfiguration Specifies the network configuration for the private
       * ingress point.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e678f81ef12f26d2e6cd0f714aa634b68d89cb38cf8ecef6ca41746bcf21645")
      override
          fun privateNetworkConfiguration(privateNetworkConfiguration: PrivateNetworkConfigurationProperty.Builder.() -> Unit):
          Unit =
          privateNetworkConfiguration(PrivateNetworkConfigurationProperty(privateNetworkConfiguration))

      /**
       * @param publicNetworkConfiguration Specifies the network configuration for the public
       * ingress point.
       */
      override fun publicNetworkConfiguration(publicNetworkConfiguration: IResolvable) {
        cdkBuilder.publicNetworkConfiguration(publicNetworkConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param publicNetworkConfiguration Specifies the network configuration for the public
       * ingress point.
       */
      override
          fun publicNetworkConfiguration(publicNetworkConfiguration: PublicNetworkConfigurationProperty) {
        cdkBuilder.publicNetworkConfiguration(publicNetworkConfiguration.let(PublicNetworkConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param publicNetworkConfiguration Specifies the network configuration for the public
       * ingress point.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9856fb9bd36f12927cbca165f6368b57aeb47e55c5656f5dcf5ccd4e4cad6b6f")
      override
          fun publicNetworkConfiguration(publicNetworkConfiguration: PublicNetworkConfigurationProperty.Builder.() -> Unit):
          Unit =
          publicNetworkConfiguration(PublicNetworkConfigurationProperty(publicNetworkConfiguration))

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.NetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject),
        NetworkConfigurationProperty {
      /**
       * Specifies the network configuration for the private ingress point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-networkconfiguration.html#cfn-ses-mailmanageringresspoint-networkconfiguration-privatenetworkconfiguration)
       */
      override fun privateNetworkConfiguration(): Any? =
          unwrap(this).getPrivateNetworkConfiguration()

      /**
       * Specifies the network configuration for the public ingress point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-networkconfiguration.html#cfn-ses-mailmanageringresspoint-networkconfiguration-publicnetworkconfiguration)
       */
      override fun publicNetworkConfiguration(): Any? = unwrap(this).getPublicNetworkConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.NetworkConfigurationProperty):
          NetworkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.NetworkConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.NetworkConfigurationProperty
    }
  }

  /**
   * Specifies the network configuration for the private ingress point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * PrivateNetworkConfigurationProperty privateNetworkConfigurationProperty =
   * PrivateNetworkConfigurationProperty.builder()
   * .vpcEndpointId("vpcEndpointId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-privatenetworkconfiguration.html)
   */
  public interface PrivateNetworkConfigurationProperty {
    /**
     * The identifier of the VPC endpoint to associate with this private ingress point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-privatenetworkconfiguration.html#cfn-ses-mailmanageringresspoint-privatenetworkconfiguration-vpcendpointid)
     */
    public fun vpcEndpointId(): String

    /**
     * A builder for [PrivateNetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcEndpointId The identifier of the VPC endpoint to associate with this private
       * ingress point. 
       */
      public fun vpcEndpointId(vpcEndpointId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PrivateNetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PrivateNetworkConfigurationProperty.builder()

      /**
       * @param vpcEndpointId The identifier of the VPC endpoint to associate with this private
       * ingress point. 
       */
      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PrivateNetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PrivateNetworkConfigurationProperty,
    ) : CdkObject(cdkObject),
        PrivateNetworkConfigurationProperty {
      /**
       * The identifier of the VPC endpoint to associate with this private ingress point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-privatenetworkconfiguration.html#cfn-ses-mailmanageringresspoint-privatenetworkconfiguration-vpcendpointid)
       */
      override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateNetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PrivateNetworkConfigurationProperty):
          PrivateNetworkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateNetworkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateNetworkConfigurationProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PrivateNetworkConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PrivateNetworkConfigurationProperty
    }
  }

  /**
   * Specifies the network configuration for the public ingress point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * PublicNetworkConfigurationProperty publicNetworkConfigurationProperty =
   * PublicNetworkConfigurationProperty.builder()
   * .ipType("ipType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-publicnetworkconfiguration.html)
   */
  public interface PublicNetworkConfigurationProperty {
    /**
     * The IP address type for the public ingress point.
     *
     * Valid values are IPV4 and DUAL_STACK.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-publicnetworkconfiguration.html#cfn-ses-mailmanageringresspoint-publicnetworkconfiguration-iptype)
     */
    public fun ipType(): String

    /**
     * A builder for [PublicNetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipType The IP address type for the public ingress point. 
       * Valid values are IPV4 and DUAL_STACK.
       */
      public fun ipType(ipType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PublicNetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PublicNetworkConfigurationProperty.builder()

      /**
       * @param ipType The IP address type for the public ingress point. 
       * Valid values are IPV4 and DUAL_STACK.
       */
      override fun ipType(ipType: String) {
        cdkBuilder.ipType(ipType)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PublicNetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PublicNetworkConfigurationProperty,
    ) : CdkObject(cdkObject),
        PublicNetworkConfigurationProperty {
      /**
       * The IP address type for the public ingress point.
       *
       * Valid values are IPV4 and DUAL_STACK.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanageringresspoint-publicnetworkconfiguration.html#cfn-ses-mailmanageringresspoint-publicnetworkconfiguration-iptype)
       */
      override fun ipType(): String = unwrap(this).getIpType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublicNetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PublicNetworkConfigurationProperty):
          PublicNetworkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PublicNetworkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicNetworkConfigurationProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PublicNetworkConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint.PublicNetworkConfigurationProperty
    }
  }
}
