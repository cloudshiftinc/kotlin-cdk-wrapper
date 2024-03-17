@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

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
 * Use the AWS CloudFormation `AWS::AmazonMQ::ConfigurationAssociation` resource to associate a
 * configuration with a broker, or return information about the specified ConfigurationAssociation.
 *
 * Only use one per broker, and don't use a configuration on the broker resource if you have
 * associated a configuration with that broker.
 *
 *
 * Does not apply to RabbitMQ brokers.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amazonmq.*;
 * CfnConfigurationAssociation cfnConfigurationAssociation =
 * CfnConfigurationAssociation.Builder.create(this, "MyCfnConfigurationAssociation")
 * .broker("broker")
 * .configuration(ConfigurationIdProperty.builder()
 * .id("id")
 * .revision(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html)
 */
public open class CfnConfigurationAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The broker to associate with a configuration.
   */
  public open fun broker(): String = unwrap(this).getBroker()

  /**
   * The broker to associate with a configuration.
   */
  public open fun broker(`value`: String) {
    unwrap(this).setBroker(`value`)
  }

  /**
   * The configuration to associate with a broker.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * The configuration to associate with a broker.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration to associate with a broker.
   */
  public open fun configuration(`value`: ConfigurationIdProperty) {
    unwrap(this).setConfiguration(`value`.let(ConfigurationIdProperty::unwrap))
  }

  /**
   * The configuration to associate with a broker.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd76f337f3ee19b65d5b1709a50a50f7ac01533bd31ad7f10d2a3939159d25ad")
  public open fun configuration(`value`: ConfigurationIdProperty.Builder.() -> Unit): Unit =
      configuration(ConfigurationIdProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amazonmq.CfnConfigurationAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The broker to associate with a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker)
     * @param broker The broker to associate with a configuration. 
     */
    public fun broker(broker: String)

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     * @param configuration The configuration to associate with a broker. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     * @param configuration The configuration to associate with a broker. 
     */
    public fun configuration(configuration: ConfigurationIdProperty)

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     * @param configuration The configuration to associate with a broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88bd8f261d9e2e83f9a1e32baef40dc865fef95b496c50d1c0ae9d0c9d10379")
    public fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.Builder.create(scope,
        id)

    /**
     * The broker to associate with a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker)
     * @param broker The broker to associate with a configuration. 
     */
    override fun broker(broker: String) {
      cdkBuilder.broker(broker)
    }

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     * @param configuration The configuration to associate with a broker. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     * @param configuration The configuration to associate with a broker. 
     */
    override fun configuration(configuration: ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(ConfigurationIdProperty::unwrap))
    }

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     * @param configuration The configuration to associate with a broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88bd8f261d9e2e83f9a1e32baef40dc865fef95b496c50d1c0ae9d0c9d10379")
    override fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit): Unit =
        configuration(ConfigurationIdProperty(configuration))

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation):
        CfnConfigurationAssociation = CfnConfigurationAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAssociation):
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation = wrapped.cdkObject
  }

  /**
   * The `ConfigurationId` property type specifies a configuration Id and the revision of a
   * configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * ConfigurationIdProperty configurationIdProperty = ConfigurationIdProperty.builder()
   * .id("id")
   * .revision(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configurationassociation-configurationid.html)
   */
  public interface ConfigurationIdProperty {
    /**
     * The unique ID that Amazon MQ generates for the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configurationassociation-configurationid.html#cfn-amazonmq-configurationassociation-configurationid-id)
     */
    public fun id(): String

    /**
     * The revision number of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configurationassociation-configurationid.html#cfn-amazonmq-configurationassociation-configurationid-revision)
     */
    public fun revision(): Number

    /**
     * A builder for [ConfigurationIdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The unique ID that Amazon MQ generates for the configuration. 
       */
      public fun id(id: String)

      /**
       * @param revision The revision number of the configuration. 
       */
      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder
          =
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.builder()

      /**
       * @param id The unique ID that Amazon MQ generates for the configuration. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param revision The revision number of the configuration. 
       */
      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty,
    ) : CdkObject(cdkObject), ConfigurationIdProperty {
      /**
       * The unique ID that Amazon MQ generates for the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configurationassociation-configurationid.html#cfn-amazonmq-configurationassociation-configurationid-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The revision number of the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configurationassociation-configurationid.html#cfn-amazonmq-configurationassociation-configurationid-revision)
       */
      override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty):
          ConfigurationIdProperty = CdkObjectWrappers.wrap(cdkObject) as? ConfigurationIdProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationIdProperty):
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
    }
  }
}
