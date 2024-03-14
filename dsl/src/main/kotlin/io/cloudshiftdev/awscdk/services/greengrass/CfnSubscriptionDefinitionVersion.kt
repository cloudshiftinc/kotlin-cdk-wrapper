package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
  public open fun subscriptions(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscriptions(__idx_ac66f0)
  }

  /**
   * The subscriptions in this version.
   */
  public open fun subscriptions(vararg __idx_ac66f0: Any): Unit =
      subscriptions(__idx_ac66f0.toList())

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
