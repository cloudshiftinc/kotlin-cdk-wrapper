@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * A topic rule destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnTopicRuleDestination cfnTopicRuleDestination = CfnTopicRuleDestination.Builder.create(this,
 * "MyCfnTopicRuleDestination")
 * .httpUrlProperties(HttpUrlDestinationSummaryProperty.builder()
 * .confirmationUrl("confirmationUrl")
 * .build())
 * .status("status")
 * .vpcProperties(VpcDestinationPropertiesProperty.builder()
 * .roleArn("roleArn")
 * .securityGroups(List.of("securityGroups"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html)
 */
public open class CfnTopicRuleDestination(
  cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iot.CfnTopicRuleDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicRuleDestinationProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnTopicRuleDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTopicRuleDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicRuleDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTopicRuleDestinationProps(props)
  )

  /**
   * The topic rule destination URL.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Additional details or reason why the topic rule destination is in the current status.
   */
  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  /**
   * Properties of the HTTP URL.
   */
  public open fun httpUrlProperties(): Any? = unwrap(this).getHttpUrlProperties()

  /**
   * Properties of the HTTP URL.
   */
  public open fun httpUrlProperties(`value`: IResolvable) {
    unwrap(this).setHttpUrlProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Properties of the HTTP URL.
   */
  public open fun httpUrlProperties(`value`: HttpUrlDestinationSummaryProperty) {
    unwrap(this).setHttpUrlProperties(`value`.let(HttpUrlDestinationSummaryProperty.Companion::unwrap))
  }

  /**
   * Properties of the HTTP URL.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbedd54f363089c571d6c38da31564cc71ea4d1fb59d4aae630e54e2aa3ea4ca")
  public open fun httpUrlProperties(`value`: HttpUrlDestinationSummaryProperty.Builder.() -> Unit):
      Unit = httpUrlProperties(HttpUrlDestinationSummaryProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * * **IN_PROGRESS** - A topic rule destination was created but has not been confirmed.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * * **IN_PROGRESS** - A topic rule destination was created but has not been confirmed.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Properties of the virtual private cloud (VPC) connection.
   */
  public open fun vpcProperties(): Any? = unwrap(this).getVpcProperties()

  /**
   * Properties of the virtual private cloud (VPC) connection.
   */
  public open fun vpcProperties(`value`: IResolvable) {
    unwrap(this).setVpcProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Properties of the virtual private cloud (VPC) connection.
   */
  public open fun vpcProperties(`value`: VpcDestinationPropertiesProperty) {
    unwrap(this).setVpcProperties(`value`.let(VpcDestinationPropertiesProperty.Companion::unwrap))
  }

  /**
   * Properties of the virtual private cloud (VPC) connection.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28c9d13d2b92dff8c8fe59fde242babb691fcbe69f9aabe0db1d146d6c4222f2")
  public open fun vpcProperties(`value`: VpcDestinationPropertiesProperty.Builder.() -> Unit): Unit
      = vpcProperties(VpcDestinationPropertiesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnTopicRuleDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Properties of the HTTP URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
     * @param httpUrlProperties Properties of the HTTP URL. 
     */
    public fun httpUrlProperties(httpUrlProperties: IResolvable)

    /**
     * Properties of the HTTP URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
     * @param httpUrlProperties Properties of the HTTP URL. 
     */
    public fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty)

    /**
     * Properties of the HTTP URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
     * @param httpUrlProperties Properties of the HTTP URL. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc2b764e69a29233aceaba10ec8762b290abc980f6fe1766601f883b8dda6925")
    public
        fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty.Builder.() -> Unit)

    /**
     * * **IN_PROGRESS** - A topic rule destination was created but has not been confirmed.
     *
     * You can set status to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling
     * `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     *
     * * **ENABLED** - Confirmation was completed, and traffic to this destination is allowed. You
     * can set status to `DISABLED` by calling `UpdateTopicRuleDestination` .
     * * **DISABLED** - Confirmation was completed, and traffic to this destination is not allowed.
     * You can set status to `ENABLED` by calling `UpdateTopicRuleDestination` .
     * * **ERROR** - Confirmation could not be completed; for example, if the confirmation timed
     * out. You can call `GetTopicRuleDestination` for details about the error. You can set status to
     * `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling `UpdateTopicRuleDestination`
     * causes a new confirmation challenge to be sent to your confirmation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-status)
     * @param status * **IN_PROGRESS** - A topic rule destination was created but has not been
     * confirmed. 
     */
    public fun status(status: String)

    /**
     * Properties of the virtual private cloud (VPC) connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection. 
     */
    public fun vpcProperties(vpcProperties: IResolvable)

    /**
     * Properties of the virtual private cloud (VPC) connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection. 
     */
    public fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty)

    /**
     * Properties of the virtual private cloud (VPC) connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4395235da5e0270bdf3f463e7b94b4cc592f5dbd0b60c86f1d2ce41030f65ec0")
    public fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRuleDestination.Builder.create(scope, id)

    /**
     * Properties of the HTTP URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
     * @param httpUrlProperties Properties of the HTTP URL. 
     */
    override fun httpUrlProperties(httpUrlProperties: IResolvable) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Properties of the HTTP URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
     * @param httpUrlProperties Properties of the HTTP URL. 
     */
    override fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(HttpUrlDestinationSummaryProperty.Companion::unwrap))
    }

    /**
     * Properties of the HTTP URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
     * @param httpUrlProperties Properties of the HTTP URL. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc2b764e69a29233aceaba10ec8762b290abc980f6fe1766601f883b8dda6925")
    override
        fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty.Builder.() -> Unit):
        Unit = httpUrlProperties(HttpUrlDestinationSummaryProperty(httpUrlProperties))

    /**
     * * **IN_PROGRESS** - A topic rule destination was created but has not been confirmed.
     *
     * You can set status to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling
     * `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     *
     * * **ENABLED** - Confirmation was completed, and traffic to this destination is allowed. You
     * can set status to `DISABLED` by calling `UpdateTopicRuleDestination` .
     * * **DISABLED** - Confirmation was completed, and traffic to this destination is not allowed.
     * You can set status to `ENABLED` by calling `UpdateTopicRuleDestination` .
     * * **ERROR** - Confirmation could not be completed; for example, if the confirmation timed
     * out. You can call `GetTopicRuleDestination` for details about the error. You can set status to
     * `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling `UpdateTopicRuleDestination`
     * causes a new confirmation challenge to be sent to your confirmation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-status)
     * @param status * **IN_PROGRESS** - A topic rule destination was created but has not been
     * confirmed. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * Properties of the virtual private cloud (VPC) connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection. 
     */
    override fun vpcProperties(vpcProperties: IResolvable) {
      cdkBuilder.vpcProperties(vpcProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Properties of the virtual private cloud (VPC) connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection. 
     */
    override fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty) {
      cdkBuilder.vpcProperties(vpcProperties.let(VpcDestinationPropertiesProperty.Companion::unwrap))
    }

    /**
     * Properties of the virtual private cloud (VPC) connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4395235da5e0270bdf3f463e7b94b4cc592f5dbd0b60c86f1d2ce41030f65ec0")
    override fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty.Builder.() -> Unit):
        Unit = vpcProperties(VpcDestinationPropertiesProperty(vpcProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRuleDestination =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnTopicRuleDestination.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicRuleDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicRuleDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination):
        CfnTopicRuleDestination = CfnTopicRuleDestination(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRuleDestination):
        software.amazon.awscdk.services.iot.CfnTopicRuleDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnTopicRuleDestination
  }

  /**
   * HTTP URL destination properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * HttpUrlDestinationSummaryProperty httpUrlDestinationSummaryProperty =
   * HttpUrlDestinationSummaryProperty.builder()
   * .confirmationUrl("confirmationUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-httpurldestinationsummary.html)
   */
  public interface HttpUrlDestinationSummaryProperty {
    /**
     * The URL used to confirm the HTTP topic rule destination URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-httpurldestinationsummary.html#cfn-iot-topicruledestination-httpurldestinationsummary-confirmationurl)
     */
    public fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

    /**
     * A builder for [HttpUrlDestinationSummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param confirmationUrl The URL used to confirm the HTTP topic rule destination URL.
       */
      public fun confirmationUrl(confirmationUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.builder()

      /**
       * @param confirmationUrl The URL used to confirm the HTTP topic rule destination URL.
       */
      override fun confirmationUrl(confirmationUrl: String) {
        cdkBuilder.confirmationUrl(confirmationUrl)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty,
    ) : CdkObject(cdkObject), HttpUrlDestinationSummaryProperty {
      /**
       * The URL used to confirm the HTTP topic rule destination URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-httpurldestinationsummary.html#cfn-iot-topicruledestination-httpurldestinationsummary-confirmationurl)
       */
      override fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpUrlDestinationSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty):
          HttpUrlDestinationSummaryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpUrlDestinationSummaryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpUrlDestinationSummaryProperty):
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty
    }
  }

  /**
   * The properties of a virtual private cloud (VPC) destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * VpcDestinationPropertiesProperty vpcDestinationPropertiesProperty =
   * VpcDestinationPropertiesProperty.builder()
   * .roleArn("roleArn")
   * .securityGroups(List.of("securityGroups"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html)
   */
  public interface VpcDestinationPropertiesProperty {
    /**
     * The ARN of a role that has permission to create and attach to elastic network interfaces
     * (ENIs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The security groups of the VPC destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The subnet IDs of the VPC destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The ARN of a role that has permission to create and attach to elastic
       * network interfaces (ENIs).
       */
      public fun roleArn(roleArn: String)

      /**
       * @param securityGroups The security groups of the VPC destination.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The security groups of the VPC destination.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnetIds The subnet IDs of the VPC destination.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The subnet IDs of the VPC destination.
       */
      public fun subnetIds(vararg subnetIds: String)

      /**
       * @param vpcId The ID of the VPC.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty.builder()

      /**
       * @param roleArn The ARN of a role that has permission to create and attach to elastic
       * network interfaces (ENIs).
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param securityGroups The security groups of the VPC destination.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The security groups of the VPC destination.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnetIds The subnet IDs of the VPC destination.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The subnet IDs of the VPC destination.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      /**
       * @param vpcId The ID of the VPC.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), VpcDestinationPropertiesProperty {
      /**
       * The ARN of a role that has permission to create and attach to elastic network interfaces
       * (ENIs).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The security groups of the VPC destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * The subnet IDs of the VPC destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      /**
       * The ID of the VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html#cfn-iot-topicruledestination-vpcdestinationproperties-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty):
          VpcDestinationPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcDestinationPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcDestinationPropertiesProperty):
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty
    }
  }
}
