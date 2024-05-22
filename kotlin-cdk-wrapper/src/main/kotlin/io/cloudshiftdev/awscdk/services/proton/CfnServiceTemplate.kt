@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.proton

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a service template.
 *
 * The administrator creates a service template to define standardized infrastructure and an
 * optional CI/CD service pipeline. Developers, in turn, select the service template from AWS Proton .
 * If the selected service template includes a service pipeline definition, they provide a link to
 * their source code repository. AWS Proton then deploys and manages the infrastructure defined by the
 * selected service template. For more information, see [AWS Proton
 * templates](https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html) in the *AWS Proton
 * User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.proton.*;
 * CfnServiceTemplate cfnServiceTemplate = CfnServiceTemplate.Builder.create(this,
 * "MyCfnServiceTemplate")
 * .description("description")
 * .displayName("displayName")
 * .encryptionKey("encryptionKey")
 * .name("name")
 * .pipelineProvisioning("pipelineProvisioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html)
 */
public open class CfnServiceTemplate(
  cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.proton.CfnServiceTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceTemplateProps,
  ) :
      this(software.amazon.awscdk.services.proton.CfnServiceTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnServiceTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServiceTemplateProps(props)
  )

  /**
   * Returns the service template ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A description of the service template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the service template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The service template name as displayed in the developer interface.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The service template name as displayed in the developer interface.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The customer provided service template encryption key that's used to encrypt data.
   */
  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The customer provided service template encryption key that's used to encrypt data.
   */
  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
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
   * The name of the service template.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the service template.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * If `pipelineProvisioning` is `true` , a service pipeline is included in the service template.
   */
  public open fun pipelineProvisioning(): String? = unwrap(this).getPipelineProvisioning()

  /**
   * If `pipelineProvisioning` is `true` , a service pipeline is included in the service template.
   */
  public open fun pipelineProvisioning(`value`: String) {
    unwrap(this).setPipelineProvisioning(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An object that includes the template bundle S3 bucket path and name for the new version of a
   * service template.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An object that includes the template bundle S3 bucket path and name for the new version of a
   * service template.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An object that includes the template bundle S3 bucket path and name for the new version of a
   * service template.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.proton.CfnServiceTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-description)
     * @param description A description of the service template. 
     */
    public fun description(description: String)

    /**
     * The service template name as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-displayname)
     * @param displayName The service template name as displayed in the developer interface. 
     */
    public fun displayName(displayName: String)

    /**
     * The customer provided service template encryption key that's used to encrypt data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-encryptionkey)
     * @param encryptionKey The customer provided service template encryption key that's used to
     * encrypt data. 
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * The name of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-name)
     * @param name The name of the service template. 
     */
    public fun name(name: String)

    /**
     * If `pipelineProvisioning` is `true` , a service pipeline is included in the service template.
     *
     * Otherwise, a service pipeline *isn't* included in the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-pipelineprovisioning)
     * @param pipelineProvisioning If `pipelineProvisioning` is `true` , a service pipeline is
     * included in the service template. 
     */
    public fun pipelineProvisioning(pipelineProvisioning: String)

    /**
     * An object that includes the template bundle S3 bucket path and name for the new version of a
     * service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An object that includes the template bundle S3 bucket path and name for the new version of a
     * service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.proton.CfnServiceTemplate.Builder =
        software.amazon.awscdk.services.proton.CfnServiceTemplate.Builder.create(scope, id)

    /**
     * A description of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-description)
     * @param description A description of the service template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The service template name as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-displayname)
     * @param displayName The service template name as displayed in the developer interface. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The customer provided service template encryption key that's used to encrypt data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-encryptionkey)
     * @param encryptionKey The customer provided service template encryption key that's used to
     * encrypt data. 
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The name of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-name)
     * @param name The name of the service template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * If `pipelineProvisioning` is `true` , a service pipeline is included in the service template.
     *
     * Otherwise, a service pipeline *isn't* included in the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-pipelineprovisioning)
     * @param pipelineProvisioning If `pipelineProvisioning` is `true` , a service pipeline is
     * included in the service template. 
     */
    override fun pipelineProvisioning(pipelineProvisioning: String) {
      cdkBuilder.pipelineProvisioning(pipelineProvisioning)
    }

    /**
     * An object that includes the template bundle S3 bucket path and name for the new version of a
     * service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An object that includes the template bundle S3 bucket path and name for the new version of a
     * service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnServiceTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.proton.CfnServiceTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplate):
        CfnServiceTemplate = CfnServiceTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnServiceTemplate):
        software.amazon.awscdk.services.proton.CfnServiceTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.proton.CfnServiceTemplate
  }
}
