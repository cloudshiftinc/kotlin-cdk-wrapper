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
 * Create an environment template for AWS Proton .
 *
 * For more information, see [Environment
 * Templates](https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html) in the *AWS Proton
 * User Guide* .
 *
 * You can create an environment template in one of the two following ways:
 *
 * * Register and publish a *standard* environment template that instructs AWS Proton to deploy and
 * manage environment infrastructure.
 * * Register and publish a *customer managed* environment template that connects AWS Proton to your
 * existing provisioned infrastructure that you manage. AWS Proton *doesn't* manage your existing
 * provisioned infrastructure. To create an environment template for customer provisioned and managed
 * infrastructure, include the `provisioning` parameter and set the value to `CUSTOMER_MANAGED` . For
 * more information, see [Register and publish an environment
 * template](https://docs.aws.amazon.com/proton/latest/userguide/template-create.html) in the *AWS
 * Proton User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.proton.*;
 * CfnEnvironmentTemplate cfnEnvironmentTemplate = CfnEnvironmentTemplate.Builder.create(this,
 * "MyCfnEnvironmentTemplate")
 * .description("description")
 * .displayName("displayName")
 * .encryptionKey("encryptionKey")
 * .name("name")
 * .provisioning("provisioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html)
 */
public open class CfnEnvironmentTemplate(
  cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentTemplate,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.proton.CfnEnvironmentTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentTemplateProps,
  ) :
      this(software.amazon.awscdk.services.proton.CfnEnvironmentTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEnvironmentTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentTemplateProps(props)
  )

  /**
   * Returns the ARN of the environment template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A description of the environment template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the environment template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the environment template as displayed in the developer interface.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The name of the environment template as displayed in the developer interface.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The customer provided encryption key for the environment template.
   */
  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The customer provided encryption key for the environment template.
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
   * The name of the environment template.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the environment template.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * When included, indicates that the environment template is for customer provisioned and managed
   * infrastructure.
   */
  public open fun provisioning(): String? = unwrap(this).getProvisioning()

  /**
   * When included, indicates that the environment template is for customer provisioned and managed
   * infrastructure.
   */
  public open fun provisioning(`value`: String) {
    unwrap(this).setProvisioning(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * template.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * template.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * template.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.proton.CfnEnvironmentTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-description)
     * @param description A description of the environment template. 
     */
    public fun description(description: String)

    /**
     * The name of the environment template as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-displayname)
     * @param displayName The name of the environment template as displayed in the developer
     * interface. 
     */
    public fun displayName(displayName: String)

    /**
     * The customer provided encryption key for the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-encryptionkey)
     * @param encryptionKey The customer provided encryption key for the environment template. 
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * The name of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-name)
     * @param name The name of the environment template. 
     */
    public fun name(name: String)

    /**
     * When included, indicates that the environment template is for customer provisioned and
     * managed infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-provisioning)
     * @param provisioning When included, indicates that the environment template is for customer
     * provisioned and managed infrastructure. 
     */
    public fun provisioning(provisioning: String)

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * template.
     *
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * template.
     *
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.proton.CfnEnvironmentTemplate.Builder =
        software.amazon.awscdk.services.proton.CfnEnvironmentTemplate.Builder.create(scope, id)

    /**
     * A description of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-description)
     * @param description A description of the environment template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the environment template as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-displayname)
     * @param displayName The name of the environment template as displayed in the developer
     * interface. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The customer provided encryption key for the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-encryptionkey)
     * @param encryptionKey The customer provided encryption key for the environment template. 
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The name of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-name)
     * @param name The name of the environment template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * When included, indicates that the environment template is for customer provisioned and
     * managed infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-provisioning)
     * @param provisioning When included, indicates that the environment template is for customer
     * provisioned and managed infrastructure. 
     */
    override fun provisioning(provisioning: String) {
      cdkBuilder.provisioning(provisioning)
    }

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * template.
     *
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * template.
     *
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnEnvironmentTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.proton.CfnEnvironmentTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentTemplate):
        CfnEnvironmentTemplate = CfnEnvironmentTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentTemplate):
        software.amazon.awscdk.services.proton.CfnEnvironmentTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.proton.CfnEnvironmentTemplate
  }
}
