@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amazonmq.*;
 * CfnConfigurationAssociationProps cfnConfigurationAssociationProps =
 * CfnConfigurationAssociationProps.builder()
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
public interface CfnConfigurationAssociationProps {
  /**
   * The broker to associate with a configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker)
   */
  public fun broker(): String

  /**
   * The configuration to associate with a broker.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
   */
  public fun configuration(): Any

  /**
   * A builder for [CfnConfigurationAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param broker The broker to associate with a configuration. 
     */
    public fun broker(broker: String)

    /**
     * @param configuration The configuration to associate with a broker. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration The configuration to associate with a broker. 
     */
    public fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty)

    /**
     * @param configuration The configuration to associate with a broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("860af6d2a776a57d90af09a63d38ef580c8ed1f37884fca63d1a6f9bb8955b60")
    public
        fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.builder()

    /**
     * @param broker The broker to associate with a configuration. 
     */
    override fun broker(broker: String) {
      cdkBuilder.broker(broker)
    }

    /**
     * @param configuration The configuration to associate with a broker. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration The configuration to associate with a broker. 
     */
    override fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(CfnConfigurationAssociation.ConfigurationIdProperty::unwrap))
    }

    /**
     * @param configuration The configuration to associate with a broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("860af6d2a776a57d90af09a63d38ef580c8ed1f37884fca63d1a6f9bb8955b60")
    override
        fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty.Builder.() -> Unit):
        Unit = configuration(CfnConfigurationAssociation.ConfigurationIdProperty(configuration))

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps,
  ) : CdkObject(cdkObject), CfnConfigurationAssociationProps {
    /**
     * The broker to associate with a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker)
     */
    override fun broker(): String = unwrap(this).getBroker()

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps):
        CfnConfigurationAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfigurationAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAssociationProps):
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
  }
}
