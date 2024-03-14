package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProvisioningTemplateProps {
  /**
   * The description of the fleet provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * True to enable the fleet provisioning template, otherwise false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Creates a pre-provisioning hook template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
   */
  public fun preProvisioningHook(): Any? = unwrap(this).getPreProvisioningHook()

  /**
   * The role ARN for the role associated with the fleet provisioning template.
   *
   * This IoT role grants permission to provision a device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn)
   */
  public fun provisioningRoleArn(): String

  /**
   * Metadata that can be used to manage the fleet provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The JSON formatted contents of the fleet provisioning template version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody)
   */
  public fun templateBody(): String

  /**
   * The name of the fleet provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename)
   */
  public fun templateName(): String? = unwrap(this).getTemplateName()

  /**
   * The type of the provisioning template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatetype)
   */
  public fun templateType(): String? = unwrap(this).getTemplateType()

  /**
   * A builder for [CfnProvisioningTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the fleet provisioning template.
     */
    public fun description(description: String)

    /**
     * @param enabled True to enable the fleet provisioning template, otherwise false.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled True to enable the fleet provisioning template, otherwise false.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template.
     */
    public fun preProvisioningHook(preProvisioningHook: IResolvable)

    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template.
     */
    public
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty)

    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1d82b3fb5cabe48f550455e75052ca478eb5ad3f77fab13022554c25ca6af91")
    public
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty.Builder.() -> Unit)

    /**
     * @param provisioningRoleArn The role ARN for the role associated with the fleet provisioning
     * template. 
     * This IoT role grants permission to provision a device.
     */
    public fun provisioningRoleArn(provisioningRoleArn: String)

    /**
     * @param tags Metadata that can be used to manage the fleet provisioning template.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the fleet provisioning template.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param templateBody The JSON formatted contents of the fleet provisioning template version. 
     */
    public fun templateBody(templateBody: String)

    /**
     * @param templateName The name of the fleet provisioning template.
     */
    public fun templateName(templateName: String)

    /**
     * @param templateType The type of the provisioning template.
     */
    public fun templateType(templateType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps.Builder
        = software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps.builder()

    /**
     * @param description The description of the fleet provisioning template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enabled True to enable the fleet provisioning template, otherwise false.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled True to enable the fleet provisioning template, otherwise false.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template.
     */
    override fun preProvisioningHook(preProvisioningHook: IResolvable) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(IResolvable::unwrap))
    }

    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template.
     */
    override
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(CfnProvisioningTemplate.ProvisioningHookProperty::unwrap))
    }

    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1d82b3fb5cabe48f550455e75052ca478eb5ad3f77fab13022554c25ca6af91")
    override
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty.Builder.() -> Unit):
        Unit =
        preProvisioningHook(CfnProvisioningTemplate.ProvisioningHookProperty(preProvisioningHook))

    /**
     * @param provisioningRoleArn The role ARN for the role associated with the fleet provisioning
     * template. 
     * This IoT role grants permission to provision a device.
     */
    override fun provisioningRoleArn(provisioningRoleArn: String) {
      cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    /**
     * @param tags Metadata that can be used to manage the fleet provisioning template.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the fleet provisioning template.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param templateBody The JSON formatted contents of the fleet provisioning template version. 
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * @param templateName The name of the fleet provisioning template.
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    /**
     * @param templateType The type of the provisioning template.
     */
    override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps,
  ) : CdkObject(cdkObject), CfnProvisioningTemplateProps {
    /**
     * The description of the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * True to enable the fleet provisioning template, otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Creates a pre-provisioning hook template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-preprovisioninghook)
     */
    override fun preProvisioningHook(): Any? = unwrap(this).getPreProvisioningHook()

    /**
     * The role ARN for the role associated with the fleet provisioning template.
     *
     * This IoT role grants permission to provision a device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn)
     */
    override fun provisioningRoleArn(): String = unwrap(this).getProvisioningRoleArn()

    /**
     * Metadata that can be used to manage the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The JSON formatted contents of the fleet provisioning template version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody)
     */
    override fun templateBody(): String = unwrap(this).getTemplateBody()

    /**
     * The name of the fleet provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename)
     */
    override fun templateName(): String? = unwrap(this).getTemplateName()

    /**
     * The type of the provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatetype)
     */
    override fun templateType(): String? = unwrap(this).getTemplateType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProvisioningTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps):
        CfnProvisioningTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProvisioningTemplateProps):
        software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps
  }
}
