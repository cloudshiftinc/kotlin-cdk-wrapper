@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

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
 * The `AWS::Greengrass::SubscriptionDefinitionVersion` resource represents a subscription
 * definition version for AWS IoT Greengrass .
 *
 * A subscription definition version contains a list of subscriptions.
 *
 *
 * To create a subscription definition version, you must specify the ID of the subscription
 * definition that you want to associate with the version. For information about creating a
 * subscription definition, see
 * [`AWS::Greengrass::SubscriptionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
 * .
 *
 * After you create a subscription definition version that contains the subscriptions you want to
 * deploy, you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnSubscriptionDefinitionVersion cfnSubscriptionDefinitionVersion =
 * CfnSubscriptionDefinitionVersion.Builder.create(this, "MyCfnSubscriptionDefinitionVersion")
 * .subscriptionDefinitionId("subscriptionDefinitionId")
 * .subscriptions(List.of(SubscriptionProperty.builder()
 * .id("id")
 * .source("source")
 * .subject("subject")
 * .target("target")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
 */
public open class CfnSubscriptionDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the subscription definition associated with this version.
   */
  public open fun subscriptionDefinitionId(): String = unwrap(this).getSubscriptionDefinitionId()

  /**
   * The ID of the subscription definition associated with this version.
   */
  public open fun subscriptionDefinitionId(`value`: String) {
    unwrap(this).setSubscriptionDefinitionId(`value`)
  }

  /**
   * The subscriptions in this version.
   */
  public open fun subscriptions(): Any = unwrap(this).getSubscriptions()

  /**
   * The subscriptions in this version.
   */
  public open fun subscriptions(`value`: IResolvable) {
    unwrap(this).setSubscriptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The subscriptions in this version.
   */
  public open fun subscriptions(`value`: List<Any>) {
    unwrap(this).setSubscriptions(`value`)
  }

  /**
   * The subscriptions in this version.
   */
  public open fun subscriptions(vararg `value`: Any): Unit = subscriptions(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the subscription definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid)
     * @param subscriptionDefinitionId The ID of the subscription definition associated with this
     * version. 
     */
    public fun subscriptionDefinitionId(subscriptionDefinitionId: String)

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     * @param subscriptions The subscriptions in this version. 
     */
    public fun subscriptions(subscriptions: IResolvable)

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     * @param subscriptions The subscriptions in this version. 
     */
    public fun subscriptions(subscriptions: List<Any>)

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     * @param subscriptions The subscriptions in this version. 
     */
    public fun subscriptions(vararg subscriptions: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.Builder.create(scope,
        id)

    /**
     * The ID of the subscription definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid)
     * @param subscriptionDefinitionId The ID of the subscription definition associated with this
     * version. 
     */
    override fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
      cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
    }

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     * @param subscriptions The subscriptions in this version. 
     */
    override fun subscriptions(subscriptions: IResolvable) {
      cdkBuilder.subscriptions(subscriptions.let(IResolvable::unwrap))
    }

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     * @param subscriptions The subscriptions in this version. 
     */
    override fun subscriptions(subscriptions: List<Any>) {
      cdkBuilder.subscriptions(subscriptions)
    }

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     * @param subscriptions The subscriptions in this version. 
     */
    override fun subscriptions(vararg subscriptions: Any): Unit =
        subscriptions(subscriptions.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion):
        CfnSubscriptionDefinitionVersion = CfnSubscriptionDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion =
        wrapped.cdkObject
  }

  /**
   * Subscriptions define how MQTT messages can be exchanged between devices, functions, and
   * connectors in the group, and with AWS IoT or the local shadow service.
   *
   * A subscription defines a message source, message target, and a topic (or subject) that's used
   * to route messages from the source to the target. A subscription defines the message flow in one
   * direction, from the source to the target. For two-way communication, you must set up two
   * subscriptions, one for each direction.
   *
   * In an AWS CloudFormation template, the `Subscriptions` property of the
   * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
   * resource contains a list of `Subscription` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
   * .id("id")
   * .source("source")
   * .subject("subject")
   * .target("target")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html)
   */
  public interface SubscriptionProperty {
    /**
     * A descriptive or arbitrary ID for the subscription.
     *
     * This value must be unique within the subscription definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-id)
     */
    public fun id(): String

    /**
     * The originator of the message.
     *
     * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version, a
     * connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-source)
     */
    public fun source(): String

    /**
     * The MQTT topic used to route the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-subject)
     */
    public fun subject(): String

    /**
     * The destination of the message.
     *
     * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version, a
     * connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-target)
     */
    public fun target(): String

    /**
     * A builder for [SubscriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id A descriptive or arbitrary ID for the subscription. 
       * This value must be unique within the subscription definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param source The originator of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      public fun source(source: String)

      /**
       * @param subject The MQTT topic used to route the message. 
       */
      public fun subject(subject: String)

      /**
       * @param target The destination of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty.builder()

      /**
       * @param id A descriptive or arbitrary ID for the subscription. 
       * This value must be unique within the subscription definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param source The originator of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param subject The MQTT topic used to route the message. 
       */
      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      /**
       * @param target The destination of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty,
    ) : CdkObject(cdkObject), SubscriptionProperty {
      /**
       * A descriptive or arbitrary ID for the subscription.
       *
       * This value must be unique within the subscription definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The originator of the message.
       *
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The MQTT topic used to route the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-subject)
       */
      override fun subject(): String = unwrap(this).getSubject()

      /**
       * The destination of the message.
       *
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html#cfn-greengrass-subscriptiondefinitionversion-subscription-target)
       */
      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty):
          SubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionProperty):
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
    }
  }
}
