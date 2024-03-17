@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnGroupVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnGroupVersionProps cfnGroupVersionProps = CfnGroupVersionProps.builder()
 * .groupId("groupId")
 * // the properties below are optional
 * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
 * .coreDefinitionVersionArn("coreDefinitionVersionArn")
 * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
 * .functionDefinitionVersionArn("functionDefinitionVersionArn")
 * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
 * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
 * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
 */
public interface CfnGroupVersionProps {
  /**
   * The Amazon Resource Name (ARN) of the connector definition version that contains the connectors
   * you want to deploy with the group version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn)
   */
  public fun connectorDefinitionVersionArn(): String? =
      unwrap(this).getConnectorDefinitionVersionArn()

  /**
   * The ARN of the core definition version that contains the core you want to deploy with the group
   * version.
   *
   * Currently, the core definition version can contain only one core.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn)
   */
  public fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

  /**
   * The ARN of the device definition version that contains the devices you want to deploy with the
   * group version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn)
   */
  public fun deviceDefinitionVersionArn(): String? = unwrap(this).getDeviceDefinitionVersionArn()

  /**
   * The ARN of the function definition version that contains the functions you want to deploy with
   * the group version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn)
   */
  public fun functionDefinitionVersionArn(): String? =
      unwrap(this).getFunctionDefinitionVersionArn()

  /**
   * The ID of the group associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid)
   */
  public fun groupId(): String

  /**
   * The ARN of the logger definition version that contains the loggers you want to deploy with the
   * group version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn)
   */
  public fun loggerDefinitionVersionArn(): String? = unwrap(this).getLoggerDefinitionVersionArn()

  /**
   * The ARN of the resource definition version that contains the resources you want to deploy with
   * the group version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn)
   */
  public fun resourceDefinitionVersionArn(): String? =
      unwrap(this).getResourceDefinitionVersionArn()

  /**
   * The ARN of the subscription definition version that contains the subscriptions you want to
   * deploy with the group version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn)
   */
  public fun subscriptionDefinitionVersionArn(): String? =
      unwrap(this).getSubscriptionDefinitionVersionArn()

  /**
   * A builder for [CfnGroupVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
     * definition version that contains the connectors you want to deploy with the group version.
     */
    public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String)

    /**
     * @param coreDefinitionVersionArn The ARN of the core definition version that contains the core
     * you want to deploy with the group version.
     * Currently, the core definition version can contain only one core.
     */
    public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String)

    /**
     * @param deviceDefinitionVersionArn The ARN of the device definition version that contains the
     * devices you want to deploy with the group version.
     */
    public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String)

    /**
     * @param functionDefinitionVersionArn The ARN of the function definition version that contains
     * the functions you want to deploy with the group version.
     */
    public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String)

    /**
     * @param groupId The ID of the group associated with this version. 
     * This value is a GUID.
     */
    public fun groupId(groupId: String)

    /**
     * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains the
     * loggers you want to deploy with the group version.
     */
    public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String)

    /**
     * @param resourceDefinitionVersionArn The ARN of the resource definition version that contains
     * the resources you want to deploy with the group version.
     */
    public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String)

    /**
     * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
     * contains the subscriptions you want to deploy with the group version.
     */
    public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroupVersionProps.Builder
        = software.amazon.awscdk.services.greengrass.CfnGroupVersionProps.builder()

    /**
     * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector
     * definition version that contains the connectors you want to deploy with the group version.
     */
    override fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
      cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
    }

    /**
     * @param coreDefinitionVersionArn The ARN of the core definition version that contains the core
     * you want to deploy with the group version.
     * Currently, the core definition version can contain only one core.
     */
    override fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
      cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
    }

    /**
     * @param deviceDefinitionVersionArn The ARN of the device definition version that contains the
     * devices you want to deploy with the group version.
     */
    override fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
      cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
    }

    /**
     * @param functionDefinitionVersionArn The ARN of the function definition version that contains
     * the functions you want to deploy with the group version.
     */
    override fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
      cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
    }

    /**
     * @param groupId The ID of the group associated with this version. 
     * This value is a GUID.
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    /**
     * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains the
     * loggers you want to deploy with the group version.
     */
    override fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
      cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
    }

    /**
     * @param resourceDefinitionVersionArn The ARN of the resource definition version that contains
     * the resources you want to deploy with the group version.
     */
    override fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
      cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
    }

    /**
     * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
     * contains the subscriptions you want to deploy with the group version.
     */
    override fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
      cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroupVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersionProps,
  ) : CdkObject(cdkObject), CfnGroupVersionProps {
    /**
     * The Amazon Resource Name (ARN) of the connector definition version that contains the
     * connectors you want to deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn)
     */
    override fun connectorDefinitionVersionArn(): String? =
        unwrap(this).getConnectorDefinitionVersionArn()

    /**
     * The ARN of the core definition version that contains the core you want to deploy with the
     * group version.
     *
     * Currently, the core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn)
     */
    override fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

    /**
     * The ARN of the device definition version that contains the devices you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn)
     */
    override fun deviceDefinitionVersionArn(): String? =
        unwrap(this).getDeviceDefinitionVersionArn()

    /**
     * The ARN of the function definition version that contains the functions you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn)
     */
    override fun functionDefinitionVersionArn(): String? =
        unwrap(this).getFunctionDefinitionVersionArn()

    /**
     * The ID of the group associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid)
     */
    override fun groupId(): String = unwrap(this).getGroupId()

    /**
     * The ARN of the logger definition version that contains the loggers you want to deploy with
     * the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn)
     */
    override fun loggerDefinitionVersionArn(): String? =
        unwrap(this).getLoggerDefinitionVersionArn()

    /**
     * The ARN of the resource definition version that contains the resources you want to deploy
     * with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn)
     */
    override fun resourceDefinitionVersionArn(): String? =
        unwrap(this).getResourceDefinitionVersionArn()

    /**
     * The ARN of the subscription definition version that contains the subscriptions you want to
     * deploy with the group version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn)
     */
    override fun subscriptionDefinitionVersionArn(): String? =
        unwrap(this).getSubscriptionDefinitionVersionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersionProps):
        CfnGroupVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGroupVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupVersionProps):
        software.amazon.awscdk.services.greengrass.CfnGroupVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrass.CfnGroupVersionProps
  }
}
