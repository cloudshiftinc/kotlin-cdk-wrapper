@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appflow.*;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .connectorProvisioningConfig(ConnectorProvisioningConfigProperty.builder()
 * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .connectorProvisioningType("connectorProvisioningType")
 * // the properties below are optional
 * .connectorLabel("connectorLabel")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html)
 */
public interface CfnConnectorProps {
  /**
   * The label used for registering the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorlabel)
   */
  public fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  /**
   * The configuration required for registering the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
   */
  public fun connectorProvisioningConfig(): Any

  /**
   * The provisioning type used to register the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningtype)
   */
  public fun connectorProvisioningType(): String

  /**
   * A description about the connector runtime setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A builder for [CfnConnectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectorLabel The label used for registering the connector.
     */
    public fun connectorLabel(connectorLabel: String)

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    public fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable)

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty)

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ffc62cfc1111a9c64c2c7ab103008c5a6504ddfad1ebc8d6fd88dd7c2bef78e")
    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty.Builder.() -> Unit)

    /**
     * @param connectorProvisioningType The provisioning type used to register the connector. 
     */
    public fun connectorProvisioningType(connectorProvisioningType: String)

    /**
     * @param description A description about the connector runtime setting.
     */
    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnectorProps.Builder =
        software.amazon.awscdk.services.appflow.CfnConnectorProps.builder()

    /**
     * @param connectorLabel The label used for registering the connector.
     */
    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    override fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(CfnConnector.ConnectorProvisioningConfigProperty.Companion::unwrap))
    }

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ffc62cfc1111a9c64c2c7ab103008c5a6504ddfad1ebc8d6fd88dd7c2bef78e")
    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty.Builder.() -> Unit):
        Unit =
        connectorProvisioningConfig(CfnConnector.ConnectorProvisioningConfigProperty(connectorProvisioningConfig))

    /**
     * @param connectorProvisioningType The provisioning type used to register the connector. 
     */
    override fun connectorProvisioningType(connectorProvisioningType: String) {
      cdkBuilder.connectorProvisioningType(connectorProvisioningType)
    }

    /**
     * @param description A description about the connector runtime setting.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProps,
  ) : CdkObject(cdkObject),
      CfnConnectorProps {
    /**
     * The label used for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorlabel)
     */
    override fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

    /**
     * The configuration required for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
     */
    override fun connectorProvisioningConfig(): Any = unwrap(this).getConnectorProvisioningConfig()

    /**
     * The provisioning type used to register the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningtype)
     */
    override fun connectorProvisioningType(): String = unwrap(this).getConnectorProvisioningType()

    /**
     * A description about the connector runtime setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-description)
     */
    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProps):
        CfnConnectorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.appflow.CfnConnectorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appflow.CfnConnectorProps
  }
}
