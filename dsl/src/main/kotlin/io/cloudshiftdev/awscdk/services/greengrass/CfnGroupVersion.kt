package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroupVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the connector definition version that contains the connectors
   * you want to deploy with the group version.
   */
  public open fun connectorDefinitionVersionArn(): String? =
      unwrap(this).getConnectorDefinitionVersionArn()

  /**
   * The Amazon Resource Name (ARN) of the connector definition version that contains the connectors
   * you want to deploy with the group version.
   */
  public open fun connectorDefinitionVersionArn(`value`: String) {
    unwrap(this).setConnectorDefinitionVersionArn(`value`)
  }

  /**
   * The ARN of the core definition version that contains the core you want to deploy with the group
   * version.
   */
  public open fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

  /**
   * The ARN of the core definition version that contains the core you want to deploy with the group
   * version.
   */
  public open fun coreDefinitionVersionArn(`value`: String) {
    unwrap(this).setCoreDefinitionVersionArn(`value`)
  }

  /**
   * The ARN of the device definition version that contains the devices you want to deploy with the
   * group version.
   */
  public open fun deviceDefinitionVersionArn(): String? =
      unwrap(this).getDeviceDefinitionVersionArn()

  /**
   * The ARN of the device definition version that contains the devices you want to deploy with the
   * group version.
   */
  public open fun deviceDefinitionVersionArn(`value`: String) {
    unwrap(this).setDeviceDefinitionVersionArn(`value`)
  }

  /**
   * The ARN of the function definition version that contains the functions you want to deploy with
   * the group version.
   */
  public open fun functionDefinitionVersionArn(): String? =
      unwrap(this).getFunctionDefinitionVersionArn()

  /**
   * The ARN of the function definition version that contains the functions you want to deploy with
   * the group version.
   */
  public open fun functionDefinitionVersionArn(`value`: String) {
    unwrap(this).setFunctionDefinitionVersionArn(`value`)
  }

  /**
   * The ID of the group associated with this version.
   */
  public open fun groupId(): String = unwrap(this).getGroupId()

  /**
   * The ID of the group associated with this version.
   */
  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
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
   * The ARN of the logger definition version that contains the loggers you want to deploy with the
   * group version.
   */
  public open fun loggerDefinitionVersionArn(): String? =
      unwrap(this).getLoggerDefinitionVersionArn()

  /**
   * The ARN of the logger definition version that contains the loggers you want to deploy with the
   * group version.
   */
  public open fun loggerDefinitionVersionArn(`value`: String) {
    unwrap(this).setLoggerDefinitionVersionArn(`value`)
  }

  /**
   * The ARN of the resource definition version that contains the resources you want to deploy with
   * the group version.
   */
  public open fun resourceDefinitionVersionArn(): String? =
      unwrap(this).getResourceDefinitionVersionArn()

  /**
   * The ARN of the resource definition version that contains the resources you want to deploy with
   * the group version.
   */
  public open fun resourceDefinitionVersionArn(`value`: String) {
    unwrap(this).setResourceDefinitionVersionArn(`value`)
  }

  /**
   * The ARN of the subscription definition version that contains the subscriptions you want to
   * deploy with the group version.
   */
  public open fun subscriptionDefinitionVersionArn(): String? =
      unwrap(this).getSubscriptionDefinitionVersionArn()

  /**
   * The ARN of the subscription definition version that contains the subscriptions you want to
   * deploy with the group version.
   */
  public open fun subscriptionDefinitionVersionArn(`value`: String) {
    unwrap(this).setSubscriptionDefinitionVersionArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnGroupVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the connector definition version that contains the
     * connectors you want to deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn)
     * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
     * definition version that contains the connectors you want to deploy with the group version. 
     */
    public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String)

    /**
     * The ARN of the core definition version that contains the core you want to deploy with the
     * group version.
     *
     * Currently, the core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn)
     * @param coreDefinitionVersionArn The ARN of the core definition version that contains the core
     * you want to deploy with the group version. 
     */
    public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String)

    /**
     * The ARN of the device definition version that contains the devices you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn)
     * @param deviceDefinitionVersionArn The ARN of the device definition version that contains the
     * devices you want to deploy with the group version. 
     */
    public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String)

    /**
     * The ARN of the function definition version that contains the functions you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn)
     * @param functionDefinitionVersionArn The ARN of the function definition version that contains
     * the functions you want to deploy with the group version. 
     */
    public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String)

    /**
     * The ID of the group associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid)
     * @param groupId The ID of the group associated with this version. 
     */
    public fun groupId(groupId: String)

    /**
     * The ARN of the logger definition version that contains the loggers you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn)
     * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains the
     * loggers you want to deploy with the group version. 
     */
    public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String)

    /**
     * The ARN of the resource definition version that contains the resources you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn)
     * @param resourceDefinitionVersionArn The ARN of the resource definition version that contains
     * the resources you want to deploy with the group version. 
     */
    public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String)

    /**
     * The ARN of the subscription definition version that contains the subscriptions you want to
     * deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn)
     * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
     * contains the subscriptions you want to deploy with the group version. 
     */
    public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroupVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnGroupVersion.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the connector definition version that contains the
     * connectors you want to deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn)
     * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
     * definition version that contains the connectors you want to deploy with the group version. 
     */
    override fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
      cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
    }

    /**
     * The ARN of the core definition version that contains the core you want to deploy with the
     * group version.
     *
     * Currently, the core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn)
     * @param coreDefinitionVersionArn The ARN of the core definition version that contains the core
     * you want to deploy with the group version. 
     */
    override fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
      cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
    }

    /**
     * The ARN of the device definition version that contains the devices you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn)
     * @param deviceDefinitionVersionArn The ARN of the device definition version that contains the
     * devices you want to deploy with the group version. 
     */
    override fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
      cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
    }

    /**
     * The ARN of the function definition version that contains the functions you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn)
     * @param functionDefinitionVersionArn The ARN of the function definition version that contains
     * the functions you want to deploy with the group version. 
     */
    override fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
      cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
    }

    /**
     * The ID of the group associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid)
     * @param groupId The ID of the group associated with this version. 
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    /**
     * The ARN of the logger definition version that contains the loggers you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn)
     * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains the
     * loggers you want to deploy with the group version. 
     */
    override fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
      cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
    }

    /**
     * The ARN of the resource definition version that contains the resources you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn)
     * @param resourceDefinitionVersionArn The ARN of the resource definition version that contains
     * the resources you want to deploy with the group version. 
     */
    override fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
      cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
    }

    /**
     * The ARN of the subscription definition version that contains the subscriptions you want to
     * deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn)
     * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
     * contains the subscriptions you want to deploy with the group version. 
     */
    override fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
      cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroupVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnGroupVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroupVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroupVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersion):
        CfnGroupVersion = CfnGroupVersion(cdkObject)

    internal fun unwrap(wrapped: CfnGroupVersion):
        software.amazon.awscdk.services.greengrass.CfnGroupVersion = wrapped.cdkObject
  }
}
