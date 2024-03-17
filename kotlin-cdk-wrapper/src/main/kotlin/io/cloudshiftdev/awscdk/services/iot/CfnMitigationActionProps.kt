@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMitigationAction`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnMitigationActionProps cfnMitigationActionProps = CfnMitigationActionProps.builder()
 * .actionParams(ActionParamsProperty.builder()
 * .addThingsToThingGroupParams(AddThingsToThingGroupParamsProperty.builder()
 * .thingGroupNames(List.of("thingGroupNames"))
 * // the properties below are optional
 * .overrideDynamicGroups(false)
 * .build())
 * .enableIoTLoggingParams(EnableIoTLoggingParamsProperty.builder()
 * .logLevel("logLevel")
 * .roleArnForLogging("roleArnForLogging")
 * .build())
 * .publishFindingToSnsParams(PublishFindingToSnsParamsProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .replaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsProperty.builder()
 * .templateName("templateName")
 * .build())
 * .updateCaCertificateParams(UpdateCACertificateParamsProperty.builder()
 * .action("action")
 * .build())
 * .updateDeviceCertificateParams(UpdateDeviceCertificateParamsProperty.builder()
 * .action("action")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .actionName("actionName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html)
 */
public interface CfnMitigationActionProps {
  /**
   * The friendly name of the mitigation action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionname)
   */
  public fun actionName(): String? = unwrap(this).getActionName()

  /**
   * The set of parameters for this mitigation action.
   *
   * The parameters vary, depending on the kind of action you apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
   */
  public fun actionParams(): Any

  /**
   * The IAM role ARN used to apply this mitigation action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-rolearn)
   */
  public fun roleArn(): String

  /**
   * Metadata that can be used to manage the mitigation action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMitigationActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The friendly name of the mitigation action.
     */
    public fun actionName(actionName: String)

    /**
     * @param actionParams The set of parameters for this mitigation action. 
     * The parameters vary, depending on the kind of action you apply.
     */
    public fun actionParams(actionParams: IResolvable)

    /**
     * @param actionParams The set of parameters for this mitigation action. 
     * The parameters vary, depending on the kind of action you apply.
     */
    public fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty)

    /**
     * @param actionParams The set of parameters for this mitigation action. 
     * The parameters vary, depending on the kind of action you apply.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35cc1d0a71f0eff3eeb5b2f9fe494460406c77c1061e477305c310c139fc20c")
    public
        fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty.Builder.() -> Unit)

    /**
     * @param roleArn The IAM role ARN used to apply this mitigation action. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags Metadata that can be used to manage the mitigation action.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the mitigation action.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnMitigationActionProps.Builder =
        software.amazon.awscdk.services.iot.CfnMitigationActionProps.builder()

    /**
     * @param actionName The friendly name of the mitigation action.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param actionParams The set of parameters for this mitigation action. 
     * The parameters vary, depending on the kind of action you apply.
     */
    override fun actionParams(actionParams: IResolvable) {
      cdkBuilder.actionParams(actionParams.let(IResolvable::unwrap))
    }

    /**
     * @param actionParams The set of parameters for this mitigation action. 
     * The parameters vary, depending on the kind of action you apply.
     */
    override fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty) {
      cdkBuilder.actionParams(actionParams.let(CfnMitigationAction.ActionParamsProperty::unwrap))
    }

    /**
     * @param actionParams The set of parameters for this mitigation action. 
     * The parameters vary, depending on the kind of action you apply.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35cc1d0a71f0eff3eeb5b2f9fe494460406c77c1061e477305c310c139fc20c")
    override
        fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty.Builder.() -> Unit):
        Unit = actionParams(CfnMitigationAction.ActionParamsProperty(actionParams))

    /**
     * @param roleArn The IAM role ARN used to apply this mitigation action. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags Metadata that can be used to manage the mitigation action.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the mitigation action.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnMitigationActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnMitigationActionProps,
  ) : CdkObject(cdkObject), CfnMitigationActionProps {
    /**
     * The friendly name of the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionname)
     */
    override fun actionName(): String? = unwrap(this).getActionName()

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     */
    override fun actionParams(): Any = unwrap(this).getActionParams()

    /**
     * The IAM role ARN used to apply this mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * Metadata that can be used to manage the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMitigationActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationActionProps):
        CfnMitigationActionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMitigationActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMitigationActionProps):
        software.amazon.awscdk.services.iot.CfnMitigationActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnMitigationActionProps
  }
}
