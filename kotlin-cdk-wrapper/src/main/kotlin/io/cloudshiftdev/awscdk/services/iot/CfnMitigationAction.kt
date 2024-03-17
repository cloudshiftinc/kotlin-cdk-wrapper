@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines an action that can be applied to audit findings by using StartAuditMitigationActionsTask.
 *
 * For API reference, see
 * [CreateMitigationAction](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateMitigationAction.html)
 * and for general information, see [Mitigation
 * actions](https://docs.aws.amazon.com/iot/latest/developerguide/dd-mitigation-actions.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnMitigationAction cfnMitigationAction = CfnMitigationAction.Builder.create(this,
 * "MyCfnMitigationAction")
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
public open class CfnMitigationAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The friendly name of the mitigation action.
   */
  public open fun actionName(): String? = unwrap(this).getActionName()

  /**
   * The friendly name of the mitigation action.
   */
  public open fun actionName(`value`: String) {
    unwrap(this).setActionName(`value`)
  }

  /**
   * The set of parameters for this mitigation action.
   */
  public open fun actionParams(): Any = unwrap(this).getActionParams()

  /**
   * The set of parameters for this mitigation action.
   */
  public open fun actionParams(`value`: IResolvable) {
    unwrap(this).setActionParams(`value`.let(IResolvable::unwrap))
  }

  /**
   * The set of parameters for this mitigation action.
   */
  public open fun actionParams(`value`: ActionParamsProperty) {
    unwrap(this).setActionParams(`value`.let(ActionParamsProperty::unwrap))
  }

  /**
   * The set of parameters for this mitigation action.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4277dd54191b45938991cab9c779cfb5b3c064af6e3b1d0a0d2a8ef0c31fdc98")
  public open fun actionParams(`value`: ActionParamsProperty.Builder.() -> Unit): Unit =
      actionParams(ActionParamsProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the mitigation action.
   */
  public open fun attrMitigationActionArn(): String = unwrap(this).getAttrMitigationActionArn()

  /**
   * The ID of the mitigation action.
   */
  public open fun attrMitigationActionId(): String = unwrap(this).getAttrMitigationActionId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IAM role ARN used to apply this mitigation action.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The IAM role ARN used to apply this mitigation action.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the mitigation action.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the mitigation action.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that can be used to manage the mitigation action.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnMitigationAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The friendly name of the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionname)
     * @param actionName The friendly name of the mitigation action. 
     */
    public fun actionName(actionName: String)

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     * @param actionParams The set of parameters for this mitigation action. 
     */
    public fun actionParams(actionParams: IResolvable)

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     * @param actionParams The set of parameters for this mitigation action. 
     */
    public fun actionParams(actionParams: ActionParamsProperty)

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     * @param actionParams The set of parameters for this mitigation action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94827d7ae4954a5b85a0e5f58a8b7663a47cd9b53b03e99ef47ab8d0ffdb6d45")
    public fun actionParams(actionParams: ActionParamsProperty.Builder.() -> Unit)

    /**
     * The IAM role ARN used to apply this mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-rolearn)
     * @param roleArn The IAM role ARN used to apply this mitigation action. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Metadata that can be used to manage the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
     * @param tags Metadata that can be used to manage the mitigation action. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
     * @param tags Metadata that can be used to manage the mitigation action. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnMitigationAction.Builder =
        software.amazon.awscdk.services.iot.CfnMitigationAction.Builder.create(scope, id)

    /**
     * The friendly name of the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionname)
     * @param actionName The friendly name of the mitigation action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     * @param actionParams The set of parameters for this mitigation action. 
     */
    override fun actionParams(actionParams: IResolvable) {
      cdkBuilder.actionParams(actionParams.let(IResolvable::unwrap))
    }

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     * @param actionParams The set of parameters for this mitigation action. 
     */
    override fun actionParams(actionParams: ActionParamsProperty) {
      cdkBuilder.actionParams(actionParams.let(ActionParamsProperty::unwrap))
    }

    /**
     * The set of parameters for this mitigation action.
     *
     * The parameters vary, depending on the kind of action you apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-actionparams)
     * @param actionParams The set of parameters for this mitigation action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94827d7ae4954a5b85a0e5f58a8b7663a47cd9b53b03e99ef47ab8d0ffdb6d45")
    override fun actionParams(actionParams: ActionParamsProperty.Builder.() -> Unit): Unit =
        actionParams(ActionParamsProperty(actionParams))

    /**
     * The IAM role ARN used to apply this mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-rolearn)
     * @param roleArn The IAM role ARN used to apply this mitigation action. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Metadata that can be used to manage the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
     * @param tags Metadata that can be used to manage the mitigation action. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that can be used to manage the mitigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html#cfn-iot-mitigationaction-tags)
     * @param tags Metadata that can be used to manage the mitigation action. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnMitigationAction = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnMitigationAction.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMitigationAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMitigationAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction):
        CfnMitigationAction = CfnMitigationAction(cdkObject)

    internal fun unwrap(wrapped: CfnMitigationAction):
        software.amazon.awscdk.services.iot.CfnMitigationAction = wrapped.cdkObject
  }

  /**
   * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ReplaceDefaultPolicyVersionParamsProperty replaceDefaultPolicyVersionParamsProperty =
   * ReplaceDefaultPolicyVersionParamsProperty.builder()
   * .templateName("templateName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-replacedefaultpolicyversionparams.html)
   */
  public interface ReplaceDefaultPolicyVersionParamsProperty {
    /**
     * The name of the template to be applied.
     *
     * The only supported value is `BLANK_POLICY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-replacedefaultpolicyversionparams.html#cfn-iot-mitigationaction-replacedefaultpolicyversionparams-templatename)
     */
    public fun templateName(): String

    /**
     * A builder for [ReplaceDefaultPolicyVersionParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param templateName The name of the template to be applied. 
       * The only supported value is `BLANK_POLICY` .
       */
      public fun templateName(templateName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.builder()

      /**
       * @param templateName The name of the template to be applied. 
       * The only supported value is `BLANK_POLICY` .
       */
      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty,
    ) : CdkObject(cdkObject), ReplaceDefaultPolicyVersionParamsProperty {
      /**
       * The name of the template to be applied.
       *
       * The only supported value is `BLANK_POLICY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-replacedefaultpolicyversionparams.html#cfn-iot-mitigationaction-replacedefaultpolicyversionparams-templatename)
       */
      override fun templateName(): String = unwrap(this).getTemplateName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReplaceDefaultPolicyVersionParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty):
          ReplaceDefaultPolicyVersionParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplaceDefaultPolicyVersionParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplaceDefaultPolicyVersionParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty
    }
  }

  /**
   * Parameters to define a mitigation action that publishes findings to Amazon SNS.
   *
   * You can implement your own custom actions in response to the Amazon SNS messages.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * PublishFindingToSnsParamsProperty publishFindingToSnsParamsProperty =
   * PublishFindingToSnsParamsProperty.builder()
   * .topicArn("topicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-publishfindingtosnsparams.html)
   */
  public interface PublishFindingToSnsParamsProperty {
    /**
     * The ARN of the topic to which you want to publish the findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-publishfindingtosnsparams.html#cfn-iot-mitigationaction-publishfindingtosnsparams-topicarn)
     */
    public fun topicArn(): String

    /**
     * A builder for [PublishFindingToSnsParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param topicArn The ARN of the topic to which you want to publish the findings. 
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty.builder()

      /**
       * @param topicArn The ARN of the topic to which you want to publish the findings. 
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty,
    ) : CdkObject(cdkObject), PublishFindingToSnsParamsProperty {
      /**
       * The ARN of the topic to which you want to publish the findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-publishfindingtosnsparams.html#cfn-iot-mitigationaction-publishfindingtosnsparams-topicarn)
       */
      override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublishFindingToSnsParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty):
          PublishFindingToSnsParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PublishFindingToSnsParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublishFindingToSnsParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty
    }
  }

  /**
   * Parameters to define a mitigation action that changes the state of the device certificate to
   * inactive.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * UpdateDeviceCertificateParamsProperty updateDeviceCertificateParamsProperty =
   * UpdateDeviceCertificateParamsProperty.builder()
   * .action("action")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatedevicecertificateparams.html)
   */
  public interface UpdateDeviceCertificateParamsProperty {
    /**
     * The action that you want to apply to the device certificate.
     *
     * The only supported value is `DEACTIVATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatedevicecertificateparams.html#cfn-iot-mitigationaction-updatedevicecertificateparams-action)
     */
    public fun action(): String

    /**
     * A builder for [UpdateDeviceCertificateParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that you want to apply to the device certificate. 
       * The only supported value is `DEACTIVATE` .
       */
      public fun action(action: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty.builder()

      /**
       * @param action The action that you want to apply to the device certificate. 
       * The only supported value is `DEACTIVATE` .
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty,
    ) : CdkObject(cdkObject), UpdateDeviceCertificateParamsProperty {
      /**
       * The action that you want to apply to the device certificate.
       *
       * The only supported value is `DEACTIVATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatedevicecertificateparams.html#cfn-iot-mitigationaction-updatedevicecertificateparams-action)
       */
      override fun action(): String = unwrap(this).getAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpdateDeviceCertificateParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty):
          UpdateDeviceCertificateParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UpdateDeviceCertificateParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateDeviceCertificateParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty
    }
  }

  /**
   * Defines the type of action and the parameters for that action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ActionParamsProperty actionParamsProperty = ActionParamsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html)
   */
  public interface ActionParamsProperty {
    /**
     * Specifies the group to which you want to add the devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-addthingstothinggroupparams)
     */
    public fun addThingsToThingGroupParams(): Any? = unwrap(this).getAddThingsToThingGroupParams()

    /**
     * Specifies the logging level and the role with permissions for logging.
     *
     * You cannot specify a logging level of `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-enableiotloggingparams)
     */
    public fun enableIoTLoggingParams(): Any? = unwrap(this).getEnableIoTLoggingParams()

    /**
     * Specifies the topic to which the finding should be published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-publishfindingtosnsparams)
     */
    public fun publishFindingToSnsParams(): Any? = unwrap(this).getPublishFindingToSnsParams()

    /**
     * Replaces the policy version with a default or blank policy.
     *
     * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-replacedefaultpolicyversionparams)
     */
    public fun replaceDefaultPolicyVersionParams(): Any? =
        unwrap(this).getReplaceDefaultPolicyVersionParams()

    /**
     * Specifies the new state for the CA certificate.
     *
     * Only a value of `DEACTIVATE` is currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-updatecacertificateparams)
     */
    public fun updateCaCertificateParams(): Any? = unwrap(this).getUpdateCaCertificateParams()

    /**
     * Specifies the new state for a device certificate.
     *
     * Only a value of `DEACTIVATE` is currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-updatedevicecertificateparams)
     */
    public fun updateDeviceCertificateParams(): Any? =
        unwrap(this).getUpdateDeviceCertificateParams()

    /**
     * A builder for [ActionParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addThingsToThingGroupParams Specifies the group to which you want to add the
       * devices.
       */
      public fun addThingsToThingGroupParams(addThingsToThingGroupParams: IResolvable)

      /**
       * @param addThingsToThingGroupParams Specifies the group to which you want to add the
       * devices.
       */
      public
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty)

      /**
       * @param addThingsToThingGroupParams Specifies the group to which you want to add the
       * devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576250c58660aa14398d2e7acc9859fef027ac9e73834d8419d993fc670253b5")
      public
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty.Builder.() -> Unit)

      /**
       * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
       * logging.
       * You cannot specify a logging level of `DISABLED` .
       */
      public fun enableIoTLoggingParams(enableIoTLoggingParams: IResolvable)

      /**
       * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
       * logging.
       * You cannot specify a logging level of `DISABLED` .
       */
      public fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty)

      /**
       * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
       * logging.
       * You cannot specify a logging level of `DISABLED` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d11768dcffb11d427f4990380f183d8345e55cf5c7353d2b0500009afbe4946")
      public
          fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty.Builder.() -> Unit)

      /**
       * @param publishFindingToSnsParams Specifies the topic to which the finding should be
       * published.
       */
      public fun publishFindingToSnsParams(publishFindingToSnsParams: IResolvable)

      /**
       * @param publishFindingToSnsParams Specifies the topic to which the finding should be
       * published.
       */
      public
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty)

      /**
       * @param publishFindingToSnsParams Specifies the topic to which the finding should be
       * published.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ac44a0c3360a8ba7c389aba05f1cd5cb9c5ff079e4c46ee7986c31c45a1d57d")
      public
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty.Builder.() -> Unit)

      /**
       * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or
       * blank policy.
       * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
       */
      public fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: IResolvable)

      /**
       * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or
       * blank policy.
       * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
       */
      public
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty)

      /**
       * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or
       * blank policy.
       * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da35d38e5876bb2eb3314310693a2a32262316b91a8d7b7ff5d930b155bbcde2")
      public
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty.Builder.() -> Unit)

      /**
       * @param updateCaCertificateParams Specifies the new state for the CA certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      public fun updateCaCertificateParams(updateCaCertificateParams: IResolvable)

      /**
       * @param updateCaCertificateParams Specifies the new state for the CA certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      public
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty)

      /**
       * @param updateCaCertificateParams Specifies the new state for the CA certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("922182c578eddfa5af1ac576b5a0fa17b7422973060aed72c1fd2559e3249ff1")
      public
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty.Builder.() -> Unit)

      /**
       * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      public fun updateDeviceCertificateParams(updateDeviceCertificateParams: IResolvable)

      /**
       * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      public
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty)

      /**
       * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef7506e8ba0ea83eeec6aa8cc9c18671ff5b693261e3f928b436dd47d01ba5d6")
      public
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty.Builder =
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty.builder()

      /**
       * @param addThingsToThingGroupParams Specifies the group to which you want to add the
       * devices.
       */
      override fun addThingsToThingGroupParams(addThingsToThingGroupParams: IResolvable) {
        cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams.let(IResolvable::unwrap))
      }

      /**
       * @param addThingsToThingGroupParams Specifies the group to which you want to add the
       * devices.
       */
      override
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty) {
        cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams.let(AddThingsToThingGroupParamsProperty::unwrap))
      }

      /**
       * @param addThingsToThingGroupParams Specifies the group to which you want to add the
       * devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576250c58660aa14398d2e7acc9859fef027ac9e73834d8419d993fc670253b5")
      override
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty.Builder.() -> Unit):
          Unit =
          addThingsToThingGroupParams(AddThingsToThingGroupParamsProperty(addThingsToThingGroupParams))

      /**
       * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
       * logging.
       * You cannot specify a logging level of `DISABLED` .
       */
      override fun enableIoTLoggingParams(enableIoTLoggingParams: IResolvable) {
        cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams.let(IResolvable::unwrap))
      }

      /**
       * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
       * logging.
       * You cannot specify a logging level of `DISABLED` .
       */
      override fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty) {
        cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams.let(EnableIoTLoggingParamsProperty::unwrap))
      }

      /**
       * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
       * logging.
       * You cannot specify a logging level of `DISABLED` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d11768dcffb11d427f4990380f183d8345e55cf5c7353d2b0500009afbe4946")
      override
          fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty.Builder.() -> Unit):
          Unit = enableIoTLoggingParams(EnableIoTLoggingParamsProperty(enableIoTLoggingParams))

      /**
       * @param publishFindingToSnsParams Specifies the topic to which the finding should be
       * published.
       */
      override fun publishFindingToSnsParams(publishFindingToSnsParams: IResolvable) {
        cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams.let(IResolvable::unwrap))
      }

      /**
       * @param publishFindingToSnsParams Specifies the topic to which the finding should be
       * published.
       */
      override
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty) {
        cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams.let(PublishFindingToSnsParamsProperty::unwrap))
      }

      /**
       * @param publishFindingToSnsParams Specifies the topic to which the finding should be
       * published.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ac44a0c3360a8ba7c389aba05f1cd5cb9c5ff079e4c46ee7986c31c45a1d57d")
      override
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty.Builder.() -> Unit):
          Unit =
          publishFindingToSnsParams(PublishFindingToSnsParamsProperty(publishFindingToSnsParams))

      /**
       * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or
       * blank policy.
       * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
       */
      override
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: IResolvable) {
        cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams.let(IResolvable::unwrap))
      }

      /**
       * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or
       * blank policy.
       * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
       */
      override
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty) {
        cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams.let(ReplaceDefaultPolicyVersionParamsProperty::unwrap))
      }

      /**
       * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or
       * blank policy.
       * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da35d38e5876bb2eb3314310693a2a32262316b91a8d7b7ff5d930b155bbcde2")
      override
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty.Builder.() -> Unit):
          Unit =
          replaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsProperty(replaceDefaultPolicyVersionParams))

      /**
       * @param updateCaCertificateParams Specifies the new state for the CA certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      override fun updateCaCertificateParams(updateCaCertificateParams: IResolvable) {
        cdkBuilder.updateCaCertificateParams(updateCaCertificateParams.let(IResolvable::unwrap))
      }

      /**
       * @param updateCaCertificateParams Specifies the new state for the CA certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      override
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty) {
        cdkBuilder.updateCaCertificateParams(updateCaCertificateParams.let(UpdateCACertificateParamsProperty::unwrap))
      }

      /**
       * @param updateCaCertificateParams Specifies the new state for the CA certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("922182c578eddfa5af1ac576b5a0fa17b7422973060aed72c1fd2559e3249ff1")
      override
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty.Builder.() -> Unit):
          Unit =
          updateCaCertificateParams(UpdateCACertificateParamsProperty(updateCaCertificateParams))

      /**
       * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      override fun updateDeviceCertificateParams(updateDeviceCertificateParams: IResolvable) {
        cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams.let(IResolvable::unwrap))
      }

      /**
       * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      override
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty) {
        cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams.let(UpdateDeviceCertificateParamsProperty::unwrap))
      }

      /**
       * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
       * Only a value of `DEACTIVATE` is currently supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef7506e8ba0ea83eeec6aa8cc9c18671ff5b693261e3f928b436dd47d01ba5d6")
      override
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty.Builder.() -> Unit):
          Unit =
          updateDeviceCertificateParams(UpdateDeviceCertificateParamsProperty(updateDeviceCertificateParams))

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty,
    ) : CdkObject(cdkObject), ActionParamsProperty {
      /**
       * Specifies the group to which you want to add the devices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-addthingstothinggroupparams)
       */
      override fun addThingsToThingGroupParams(): Any? =
          unwrap(this).getAddThingsToThingGroupParams()

      /**
       * Specifies the logging level and the role with permissions for logging.
       *
       * You cannot specify a logging level of `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-enableiotloggingparams)
       */
      override fun enableIoTLoggingParams(): Any? = unwrap(this).getEnableIoTLoggingParams()

      /**
       * Specifies the topic to which the finding should be published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-publishfindingtosnsparams)
       */
      override fun publishFindingToSnsParams(): Any? = unwrap(this).getPublishFindingToSnsParams()

      /**
       * Replaces the policy version with a default or blank policy.
       *
       * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-replacedefaultpolicyversionparams)
       */
      override fun replaceDefaultPolicyVersionParams(): Any? =
          unwrap(this).getReplaceDefaultPolicyVersionParams()

      /**
       * Specifies the new state for the CA certificate.
       *
       * Only a value of `DEACTIVATE` is currently supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-updatecacertificateparams)
       */
      override fun updateCaCertificateParams(): Any? = unwrap(this).getUpdateCaCertificateParams()

      /**
       * Specifies the new state for a device certificate.
       *
       * Only a value of `DEACTIVATE` is currently supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html#cfn-iot-mitigationaction-actionparams-updatedevicecertificateparams)
       */
      override fun updateDeviceCertificateParams(): Any? =
          unwrap(this).getUpdateDeviceCertificateParams()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty):
          ActionParamsProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionParamsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty
    }
  }

  /**
   * Parameters to define a mitigation action that changes the state of the CA certificate to
   * inactive.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * UpdateCACertificateParamsProperty updateCACertificateParamsProperty =
   * UpdateCACertificateParamsProperty.builder()
   * .action("action")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatecacertificateparams.html)
   */
  public interface UpdateCACertificateParamsProperty {
    /**
     * The action that you want to apply to the CA certificate.
     *
     * The only supported value is `DEACTIVATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatecacertificateparams.html#cfn-iot-mitigationaction-updatecacertificateparams-action)
     */
    public fun action(): String

    /**
     * A builder for [UpdateCACertificateParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that you want to apply to the CA certificate. 
       * The only supported value is `DEACTIVATE` .
       */
      public fun action(action: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty.builder()

      /**
       * @param action The action that you want to apply to the CA certificate. 
       * The only supported value is `DEACTIVATE` .
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty,
    ) : CdkObject(cdkObject), UpdateCACertificateParamsProperty {
      /**
       * The action that you want to apply to the CA certificate.
       *
       * The only supported value is `DEACTIVATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatecacertificateparams.html#cfn-iot-mitigationaction-updatecacertificateparams-action)
       */
      override fun action(): String = unwrap(this).getAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpdateCACertificateParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty):
          UpdateCACertificateParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UpdateCACertificateParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateCACertificateParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty
    }
  }

  /**
   * Parameters used when defining a mitigation action that move a set of things to a thing group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AddThingsToThingGroupParamsProperty addThingsToThingGroupParamsProperty =
   * AddThingsToThingGroupParamsProperty.builder()
   * .thingGroupNames(List.of("thingGroupNames"))
   * // the properties below are optional
   * .overrideDynamicGroups(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-addthingstothinggroupparams.html)
   */
  public interface AddThingsToThingGroupParamsProperty {
    /**
     * Specifies if this mitigation action can move the things that triggered the mitigation action
     * even if they are part of one or more dynamic thing groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-addthingstothinggroupparams.html#cfn-iot-mitigationaction-addthingstothinggroupparams-overridedynamicgroups)
     */
    public fun overrideDynamicGroups(): Any? = unwrap(this).getOverrideDynamicGroups()

    /**
     * The list of groups to which you want to add the things that triggered the mitigation action.
     *
     * You can add a thing to a maximum of 10 groups, but you can't add a thing to more than one
     * group in the same hierarchy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-addthingstothinggroupparams.html#cfn-iot-mitigationaction-addthingstothinggroupparams-thinggroupnames)
     */
    public fun thingGroupNames(): List<String>

    /**
     * A builder for [AddThingsToThingGroupParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param overrideDynamicGroups Specifies if this mitigation action can move the things that
       * triggered the mitigation action even if they are part of one or more dynamic thing groups.
       */
      public fun overrideDynamicGroups(overrideDynamicGroups: Boolean)

      /**
       * @param overrideDynamicGroups Specifies if this mitigation action can move the things that
       * triggered the mitigation action even if they are part of one or more dynamic thing groups.
       */
      public fun overrideDynamicGroups(overrideDynamicGroups: IResolvable)

      /**
       * @param thingGroupNames The list of groups to which you want to add the things that
       * triggered the mitigation action. 
       * You can add a thing to a maximum of 10 groups, but you can't add a thing to more than one
       * group in the same hierarchy.
       */
      public fun thingGroupNames(thingGroupNames: List<String>)

      /**
       * @param thingGroupNames The list of groups to which you want to add the things that
       * triggered the mitigation action. 
       * You can add a thing to a maximum of 10 groups, but you can't add a thing to more than one
       * group in the same hierarchy.
       */
      public fun thingGroupNames(vararg thingGroupNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty.builder()

      /**
       * @param overrideDynamicGroups Specifies if this mitigation action can move the things that
       * triggered the mitigation action even if they are part of one or more dynamic thing groups.
       */
      override fun overrideDynamicGroups(overrideDynamicGroups: Boolean) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups)
      }

      /**
       * @param overrideDynamicGroups Specifies if this mitigation action can move the things that
       * triggered the mitigation action even if they are part of one or more dynamic thing groups.
       */
      override fun overrideDynamicGroups(overrideDynamicGroups: IResolvable) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups.let(IResolvable::unwrap))
      }

      /**
       * @param thingGroupNames The list of groups to which you want to add the things that
       * triggered the mitigation action. 
       * You can add a thing to a maximum of 10 groups, but you can't add a thing to more than one
       * group in the same hierarchy.
       */
      override fun thingGroupNames(thingGroupNames: List<String>) {
        cdkBuilder.thingGroupNames(thingGroupNames)
      }

      /**
       * @param thingGroupNames The list of groups to which you want to add the things that
       * triggered the mitigation action. 
       * You can add a thing to a maximum of 10 groups, but you can't add a thing to more than one
       * group in the same hierarchy.
       */
      override fun thingGroupNames(vararg thingGroupNames: String): Unit =
          thingGroupNames(thingGroupNames.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty,
    ) : CdkObject(cdkObject), AddThingsToThingGroupParamsProperty {
      /**
       * Specifies if this mitigation action can move the things that triggered the mitigation
       * action even if they are part of one or more dynamic thing groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-addthingstothinggroupparams.html#cfn-iot-mitigationaction-addthingstothinggroupparams-overridedynamicgroups)
       */
      override fun overrideDynamicGroups(): Any? = unwrap(this).getOverrideDynamicGroups()

      /**
       * The list of groups to which you want to add the things that triggered the mitigation
       * action.
       *
       * You can add a thing to a maximum of 10 groups, but you can't add a thing to more than one
       * group in the same hierarchy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-addthingstothinggroupparams.html#cfn-iot-mitigationaction-addthingstothinggroupparams-thinggroupnames)
       */
      override fun thingGroupNames(): List<String> = unwrap(this).getThingGroupNames()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AddThingsToThingGroupParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty):
          AddThingsToThingGroupParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AddThingsToThingGroupParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddThingsToThingGroupParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty
    }
  }

  /**
   * Parameters used when defining a mitigation action that enable AWS IoT Core logging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * EnableIoTLoggingParamsProperty enableIoTLoggingParamsProperty =
   * EnableIoTLoggingParamsProperty.builder()
   * .logLevel("logLevel")
   * .roleArnForLogging("roleArnForLogging")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-enableiotloggingparams.html)
   */
  public interface EnableIoTLoggingParamsProperty {
    /**
     * Specifies the type of information to be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-enableiotloggingparams.html#cfn-iot-mitigationaction-enableiotloggingparams-loglevel)
     */
    public fun logLevel(): String

    /**
     * The Amazon Resource Name (ARN) of the IAM role used for logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-enableiotloggingparams.html#cfn-iot-mitigationaction-enableiotloggingparams-rolearnforlogging)
     */
    public fun roleArnForLogging(): String

    /**
     * A builder for [EnableIoTLoggingParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logLevel Specifies the type of information to be logged. 
       */
      public fun logLevel(logLevel: String)

      /**
       * @param roleArnForLogging The Amazon Resource Name (ARN) of the IAM role used for logging. 
       */
      public fun roleArnForLogging(roleArnForLogging: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty.builder()

      /**
       * @param logLevel Specifies the type of information to be logged. 
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      /**
       * @param roleArnForLogging The Amazon Resource Name (ARN) of the IAM role used for logging. 
       */
      override fun roleArnForLogging(roleArnForLogging: String) {
        cdkBuilder.roleArnForLogging(roleArnForLogging)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty,
    ) : CdkObject(cdkObject), EnableIoTLoggingParamsProperty {
      /**
       * Specifies the type of information to be logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-enableiotloggingparams.html#cfn-iot-mitigationaction-enableiotloggingparams-loglevel)
       */
      override fun logLevel(): String = unwrap(this).getLogLevel()

      /**
       * The Amazon Resource Name (ARN) of the IAM role used for logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-enableiotloggingparams.html#cfn-iot-mitigationaction-enableiotloggingparams-rolearnforlogging)
       */
      override fun roleArnForLogging(): String = unwrap(this).getRoleArnForLogging()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnableIoTLoggingParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty):
          EnableIoTLoggingParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnableIoTLoggingParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnableIoTLoggingParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty
    }
  }
}
