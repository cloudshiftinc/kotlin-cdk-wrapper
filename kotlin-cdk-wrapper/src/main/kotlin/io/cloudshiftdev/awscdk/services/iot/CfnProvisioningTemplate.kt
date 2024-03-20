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
 * Creates a fleet provisioning template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnProvisioningTemplate cfnProvisioningTemplate = CfnProvisioningTemplate.Builder.create(this,
 * "MyCfnProvisioningTemplate")
 * .provisioningRoleArn("provisioningRoleArn")
 * .templateBody("templateBody")
 * // the properties below are optional
 * .description("description")
 * .enabled(false)
 * .preProvisioningHook(ProvisioningHookProperty.builder()
 * .payloadVersion("payloadVersion")
 * .targetArn("targetArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateName("templateName")
 * .templateType("templateType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html)
 */
public open class CfnProvisioningTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProvisioningTemplateProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnProvisioningTemplate(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnProvisioningTemplateProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProvisioningTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProvisioningTemplateProps(props)
  )

  /**
   * The ARN that identifies the provisioning template.
   */
  public open fun attrTemplateArn(): String = unwrap(this).getAttrTemplateArn()

  /**
   * The description of the fleet provisioning template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the fleet provisioning template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * True to enable the fleet provisioning template, otherwise false.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * True to enable the fleet provisioning template, otherwise false.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * True to enable the fleet provisioning template, otherwise false.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
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
   * Creates a pre-provisioning hook template.
   */
  public open fun preProvisioningHook(): Any? = unwrap(this).getPreProvisioningHook()

  /**
   * Creates a pre-provisioning hook template.
   */
  public open fun preProvisioningHook(`value`: IResolvable) {
    unwrap(this).setPreProvisioningHook(`value`.let(IResolvable::unwrap))
  }

  /**
   * Creates a pre-provisioning hook template.
   */
  public open fun preProvisioningHook(`value`: ProvisioningHookProperty) {
    unwrap(this).setPreProvisioningHook(`value`.let(ProvisioningHookProperty::unwrap))
  }

  /**
   * Creates a pre-provisioning hook template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4397a2302134e730129d46ccc8332a13ce0e6443f8af54eebcb65f57e5ec8146")
  public open fun preProvisioningHook(`value`: ProvisioningHookProperty.Builder.() -> Unit): Unit =
      preProvisioningHook(ProvisioningHookProperty(`value`))

  /**
   * The role ARN for the role associated with the fleet provisioning template.
   */
  public open fun provisioningRoleArn(): String = unwrap(this).getProvisioningRoleArn()

  /**
   * The role ARN for the role associated with the fleet provisioning template.
   */
  public open fun provisioningRoleArn(`value`: String) {
    unwrap(this).setProvisioningRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the fleet provisioning template.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the fleet provisioning template.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that can be used to manage the fleet provisioning template.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The JSON formatted contents of the fleet provisioning template version.
   */
  public open fun templateBody(): String = unwrap(this).getTemplateBody()

  /**
   * The JSON formatted contents of the fleet provisioning template version.
   */
  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  /**
   * The name of the fleet provisioning template.
   */
  public open fun templateName(): String? = unwrap(this).getTemplateName()

  /**
   * The name of the fleet provisioning template.
   */
  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  /**
   * The type of the provisioning template.
   */
  public open fun templateType(): String? = unwrap(this).getTemplateType()

  /**
   * The type of the provisioning template.
   */
  public open fun templateType(`value`: String) {
    unwrap(this).setTemplateType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnProvisioningTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description)
     * @param description The description of the fleet provisioning template. 
     */
    public fun description(description: String)

    /**
     * True to enable the fleet provisioning template, otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
     * @param enabled True to enable the fleet provisioning template, otherwise false. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * True to enable the fleet provisioning template, otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
     * @param enabled True to enable the fleet provisioning template, otherwise false. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * Creates a pre-provisioning hook template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
     * @param preProvisioningHook Creates a pre-provisioning hook template. 
     */
    public fun preProvisioningHook(preProvisioningHook: IResolvable)

    /**
     * Creates a pre-provisioning hook template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
     * @param preProvisioningHook Creates a pre-provisioning hook template. 
     */
    public fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty)

    /**
     * Creates a pre-provisioning hook template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
     * @param preProvisioningHook Creates a pre-provisioning hook template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859854171f55f7301674cd68e0ca7c8cae08b6697bf440a98b5295633c0c207e")
    public fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty.Builder.() -> Unit)

    /**
     * The role ARN for the role associated with the fleet provisioning template.
     *
     * This IoT role grants permission to provision a device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn)
     * @param provisioningRoleArn The role ARN for the role associated with the fleet provisioning
     * template. 
     */
    public fun provisioningRoleArn(provisioningRoleArn: String)

    /**
     * Metadata that can be used to manage the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
     * @param tags Metadata that can be used to manage the fleet provisioning template. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
     * @param tags Metadata that can be used to manage the fleet provisioning template. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The JSON formatted contents of the fleet provisioning template version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody)
     * @param templateBody The JSON formatted contents of the fleet provisioning template version. 
     */
    public fun templateBody(templateBody: String)

    /**
     * The name of the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename)
     * @param templateName The name of the fleet provisioning template. 
     */
    public fun templateName(templateName: String)

    /**
     * The type of the provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatetype)
     * @param templateType The type of the provisioning template. 
     */
    public fun templateType(templateType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder =
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder.create(scope, id)

    /**
     * The description of the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description)
     * @param description The description of the fleet provisioning template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * True to enable the fleet provisioning template, otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
     * @param enabled True to enable the fleet provisioning template, otherwise false. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * True to enable the fleet provisioning template, otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
     * @param enabled True to enable the fleet provisioning template, otherwise false. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * Creates a pre-provisioning hook template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
     * @param preProvisioningHook Creates a pre-provisioning hook template. 
     */
    override fun preProvisioningHook(preProvisioningHook: IResolvable) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(IResolvable::unwrap))
    }

    /**
     * Creates a pre-provisioning hook template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
     * @param preProvisioningHook Creates a pre-provisioning hook template. 
     */
    override fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(ProvisioningHookProperty::unwrap))
    }

    /**
     * Creates a pre-provisioning hook template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
     * @param preProvisioningHook Creates a pre-provisioning hook template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859854171f55f7301674cd68e0ca7c8cae08b6697bf440a98b5295633c0c207e")
    override
        fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty.Builder.() -> Unit):
        Unit = preProvisioningHook(ProvisioningHookProperty(preProvisioningHook))

    /**
     * The role ARN for the role associated with the fleet provisioning template.
     *
     * This IoT role grants permission to provision a device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn)
     * @param provisioningRoleArn The role ARN for the role associated with the fleet provisioning
     * template. 
     */
    override fun provisioningRoleArn(provisioningRoleArn: String) {
      cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    /**
     * Metadata that can be used to manage the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
     * @param tags Metadata that can be used to manage the fleet provisioning template. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that can be used to manage the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
     * @param tags Metadata that can be used to manage the fleet provisioning template. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The JSON formatted contents of the fleet provisioning template version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody)
     * @param templateBody The JSON formatted contents of the fleet provisioning template version. 
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * The name of the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename)
     * @param templateName The name of the fleet provisioning template. 
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    /**
     * The type of the provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatetype)
     * @param templateType The type of the provisioning template. 
     */
    override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnProvisioningTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProvisioningTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProvisioningTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate):
        CfnProvisioningTemplate = CfnProvisioningTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnProvisioningTemplate):
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate = wrapped.cdkObject
  }

  /**
   * Structure that contains payloadVersion and targetArn.
   *
   * Provisioning hooks can be used when fleet provisioning to validate device parameters before
   * allowing the device to be provisioned.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ProvisioningHookProperty provisioningHookProperty = ProvisioningHookProperty.builder()
   * .payloadVersion("payloadVersion")
   * .targetArn("targetArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html)
   */
  public interface ProvisioningHookProperty {
    /**
     * The payload that was sent to the target function.
     *
     * The valid payload is `"2020-04-01"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-payloadversion)
     */
    public fun payloadVersion(): String? = unwrap(this).getPayloadVersion()

    /**
     * The ARN of the target function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-targetarn)
     */
    public fun targetArn(): String? = unwrap(this).getTargetArn()

    /**
     * A builder for [ProvisioningHookProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payloadVersion The payload that was sent to the target function.
       * The valid payload is `"2020-04-01"` .
       */
      public fun payloadVersion(payloadVersion: String)

      /**
       * @param targetArn The ARN of the target function.
       */
      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty.builder()

      /**
       * @param payloadVersion The payload that was sent to the target function.
       * The valid payload is `"2020-04-01"` .
       */
      override fun payloadVersion(payloadVersion: String) {
        cdkBuilder.payloadVersion(payloadVersion)
      }

      /**
       * @param targetArn The ARN of the target function.
       */
      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty,
    ) : CdkObject(cdkObject), ProvisioningHookProperty {
      /**
       * The payload that was sent to the target function.
       *
       * The valid payload is `"2020-04-01"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-payloadversion)
       */
      override fun payloadVersion(): String? = unwrap(this).getPayloadVersion()

      /**
       * The ARN of the target function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-targetarn)
       */
      override fun targetArn(): String? = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty):
          ProvisioningHookProperty = CdkObjectWrappers.wrap(cdkObject) as? ProvisioningHookProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningHookProperty):
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty
    }
  }
}
