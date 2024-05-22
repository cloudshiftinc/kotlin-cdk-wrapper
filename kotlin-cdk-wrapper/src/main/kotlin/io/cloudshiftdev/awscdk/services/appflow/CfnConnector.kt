@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new connector profile associated with your AWS account .
 *
 * There is a soft quota of 100 connector profiles per AWS account . If you need more connector
 * profiles than this quota allows, you can submit a request to the Amazon AppFlow team through the
 * Amazon AppFlow support channel. In each connector profile that you create, you can provide the
 * credentials and properties for only one connector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appflow.*;
 * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
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
public open class CfnConnector(
  cdkObject: software.amazon.awscdk.services.appflow.CfnConnector,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps,
  ) :
      this(software.amazon.awscdk.services.appflow.CfnConnector(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectorProps(props)
  )

  /**
   * The arn of the connector.
   *
   * The arn is unique for each ConnectorRegistration in your AWS account.
   */
  public open fun attrConnectorArn(): String = unwrap(this).getAttrConnectorArn()

  /**
   * The label used for registering the connector.
   */
  public open fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  /**
   * The label used for registering the connector.
   */
  public open fun connectorLabel(`value`: String) {
    unwrap(this).setConnectorLabel(`value`)
  }

  /**
   * The configuration required for registering the connector.
   */
  public open fun connectorProvisioningConfig(): Any = unwrap(this).getConnectorProvisioningConfig()

  /**
   * The configuration required for registering the connector.
   */
  public open fun connectorProvisioningConfig(`value`: IResolvable) {
    unwrap(this).setConnectorProvisioningConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration required for registering the connector.
   */
  public open fun connectorProvisioningConfig(`value`: ConnectorProvisioningConfigProperty) {
    unwrap(this).setConnectorProvisioningConfig(`value`.let(ConnectorProvisioningConfigProperty.Companion::unwrap))
  }

  /**
   * The configuration required for registering the connector.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("69453e53ec25d11f99e9604d35c506312f73363ec7104e8e64a4bdf22805b677")
  public open
      fun connectorProvisioningConfig(`value`: ConnectorProvisioningConfigProperty.Builder.() -> Unit):
      Unit = connectorProvisioningConfig(ConnectorProvisioningConfigProperty(`value`))

  /**
   * The provisioning type used to register the connector.
   */
  public open fun connectorProvisioningType(): String = unwrap(this).getConnectorProvisioningType()

  /**
   * The provisioning type used to register the connector.
   */
  public open fun connectorProvisioningType(`value`: String) {
    unwrap(this).setConnectorProvisioningType(`value`)
  }

  /**
   * A description about the connector runtime setting.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description about the connector runtime setting.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appflow.CfnConnector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The label used for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorlabel)
     * @param connectorLabel The label used for registering the connector. 
     */
    public fun connectorLabel(connectorLabel: String)

    /**
     * The configuration required for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    public fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable)

    /**
     * The configuration required for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty)

    /**
     * The configuration required for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e561cbca072ea56030f196d2486de545587240ded38203a38b4ee9b0e3bbe5")
    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty.Builder.() -> Unit)

    /**
     * The provisioning type used to register the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningtype)
     * @param connectorProvisioningType The provisioning type used to register the connector. 
     */
    public fun connectorProvisioningType(connectorProvisioningType: String)

    /**
     * A description about the connector runtime setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-description)
     * @param description A description about the connector runtime setting. 
     */
    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnector.Builder =
        software.amazon.awscdk.services.appflow.CfnConnector.Builder.create(scope, id)

    /**
     * The label used for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorlabel)
     * @param connectorLabel The label used for registering the connector. 
     */
    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    /**
     * The configuration required for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    override fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration required for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(ConnectorProvisioningConfigProperty.Companion::unwrap))
    }

    /**
     * The configuration required for registering the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
     * @param connectorProvisioningConfig The configuration required for registering the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e561cbca072ea56030f196d2486de545587240ded38203a38b4ee9b0e3bbe5")
    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty.Builder.() -> Unit):
        Unit =
        connectorProvisioningConfig(ConnectorProvisioningConfigProperty(connectorProvisioningConfig))

    /**
     * The provisioning type used to register the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningtype)
     * @param connectorProvisioningType The provisioning type used to register the connector. 
     */
    override fun connectorProvisioningType(connectorProvisioningType: String) {
      cdkBuilder.connectorProvisioningType(connectorProvisioningType)
    }

    /**
     * A description about the connector runtime setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-description)
     * @param description A description about the connector runtime setting. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnector = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appflow.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnector): CfnConnector
        = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector): software.amazon.awscdk.services.appflow.CfnConnector
        = wrapped.cdkObject as software.amazon.awscdk.services.appflow.CfnConnector
  }

  /**
   * Contains information about the configuration of the connector being registered.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * ConnectorProvisioningConfigProperty connectorProvisioningConfigProperty =
   * ConnectorProvisioningConfigProperty.builder()
   * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-connectorprovisioningconfig.html)
   */
  public interface ConnectorProvisioningConfigProperty {
    /**
     * Contains information about the configuration of the lambda which is being registered as the
     * connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-connectorprovisioningconfig.html#cfn-appflow-connector-connectorprovisioningconfig-lambda)
     */
    public fun lambda(): Any? = unwrap(this).getLambda()

    /**
     * A builder for [ConnectorProvisioningConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambda Contains information about the configuration of the lambda which is being
       * registered as the connector.
       */
      public fun lambda(lambda: IResolvable)

      /**
       * @param lambda Contains information about the configuration of the lambda which is being
       * registered as the connector.
       */
      public fun lambda(lambda: LambdaConnectorProvisioningConfigProperty)

      /**
       * @param lambda Contains information about the configuration of the lambda which is being
       * registered as the connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5950ab3d5fc3efe717c0d5750d63b530f6dc218e2d5f862378656fa69ec5b00f")
      public fun lambda(lambda: LambdaConnectorProvisioningConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty.builder()

      /**
       * @param lambda Contains information about the configuration of the lambda which is being
       * registered as the connector.
       */
      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambda Contains information about the configuration of the lambda which is being
       * registered as the connector.
       */
      override fun lambda(lambda: LambdaConnectorProvisioningConfigProperty) {
        cdkBuilder.lambda(lambda.let(LambdaConnectorProvisioningConfigProperty.Companion::unwrap))
      }

      /**
       * @param lambda Contains information about the configuration of the lambda which is being
       * registered as the connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5950ab3d5fc3efe717c0d5750d63b530f6dc218e2d5f862378656fa69ec5b00f")
      override fun lambda(lambda: LambdaConnectorProvisioningConfigProperty.Builder.() -> Unit):
          Unit = lambda(LambdaConnectorProvisioningConfigProperty(lambda))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty,
    ) : CdkObject(cdkObject), ConnectorProvisioningConfigProperty {
      /**
       * Contains information about the configuration of the lambda which is being registered as the
       * connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-connectorprovisioningconfig.html#cfn-appflow-connector-connectorprovisioningconfig-lambda)
       */
      override fun lambda(): Any? = unwrap(this).getLambda()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorProvisioningConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty):
          ConnectorProvisioningConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectorProvisioningConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProvisioningConfigProperty):
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty
    }
  }

  /**
   * Contains information about the configuration of the lambda which is being registered as the
   * connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appflow.*;
   * LambdaConnectorProvisioningConfigProperty lambdaConnectorProvisioningConfigProperty =
   * LambdaConnectorProvisioningConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-lambdaconnectorprovisioningconfig.html)
   */
  public interface LambdaConnectorProvisioningConfigProperty {
    /**
     * Lambda ARN of the connector being registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-lambdaconnectorprovisioningconfig.html#cfn-appflow-connector-lambdaconnectorprovisioningconfig-lambdaarn)
     */
    public fun lambdaArn(): String

    /**
     * A builder for [LambdaConnectorProvisioningConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn Lambda ARN of the connector being registered. 
       */
      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty.builder()

      /**
       * @param lambdaArn Lambda ARN of the connector being registered. 
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty,
    ) : CdkObject(cdkObject), LambdaConnectorProvisioningConfigProperty {
      /**
       * Lambda ARN of the connector being registered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-lambdaconnectorprovisioningconfig.html#cfn-appflow-connector-lambdaconnectorprovisioningconfig-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaConnectorProvisioningConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty):
          LambdaConnectorProvisioningConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaConnectorProvisioningConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConnectorProvisioningConfigProperty):
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty
    }
  }
}
