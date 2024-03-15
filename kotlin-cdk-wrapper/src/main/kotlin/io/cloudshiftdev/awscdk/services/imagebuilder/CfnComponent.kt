@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new component that can be used to build, validate, test, and assess your image.
 *
 * The component is based on a YAML document that you specify using exactly one of the following
 * methods:
 *
 * * Inline, using the `data` property in the request body.
 * * A URL that points to a YAML document file stored in Amazon S3, using the `uri` property in the
 * request body.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnComponent cfnComponent = CfnComponent.Builder.create(this, "MyCfnComponent")
 * .name("name")
 * .platform("platform")
 * .version("version")
 * // the properties below are optional
 * .changeDescription("changeDescription")
 * .data("data")
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .supportedOsVersions(List.of("supportedOsVersions"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html)
 */
public open class CfnComponent internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponent,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) of the component.
   *
   * The following pattern is applied:
   * `^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe|infrastructure-configuration|distribution-configuration|component|image|image-pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the encryption status of the component.
   *
   * For example `true` or `false` .
   */
  public open fun attrEncrypted(): IResolvable =
      unwrap(this).getAttrEncrypted().let(IResolvable::wrap)

  /**
   * Returns the name of the component.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Image Builder determines the component type based on the phases that are defined in the
   * component document.
   *
   * If there is only one phase, and its name is "test", then the type is `TEST` . For all other
   * components, the type is `BUILD` .
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The change description of the component.
   */
  public open fun changeDescription(): String? = unwrap(this).getChangeDescription()

  /**
   * The change description of the component.
   */
  public open fun changeDescription(`value`: String) {
    unwrap(this).setChangeDescription(`value`)
  }

  /**
   * Component `data` contains inline YAML document content for the component.
   */
  public open fun `data`(): String? = unwrap(this).getData()

  /**
   * Component `data` contains inline YAML document content for the component.
   */
  public open fun `data`(`value`: String) {
    unwrap(this).setData(`value`)
  }

  /**
   * Describes the contents of the component.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Describes the contents of the component.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the KMS key that is used to encrypt this component.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the KMS key that is used to encrypt this component.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of the component.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the component.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The operating system platform of the component.
   */
  public open fun platform(): String = unwrap(this).getPlatform()

  /**
   * The operating system platform of the component.
   */
  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  /**
   * The operating system (OS) version supported by the component.
   */
  public open fun supportedOsVersions(): List<String> = unwrap(this).getSupportedOsVersions() ?:
      emptyList()

  /**
   * The operating system (OS) version supported by the component.
   */
  public open fun supportedOsVersions(`value`: List<String>) {
    unwrap(this).setSupportedOsVersions(`value`)
  }

  /**
   * The operating system (OS) version supported by the component.
   */
  public open fun supportedOsVersions(vararg `value`: String): Unit =
      supportedOsVersions(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that apply to the component.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags that apply to the component.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The `uri` of a YAML component document file.
   */
  public open fun uri(): String? = unwrap(this).getUri()

  /**
   * The `uri` of a YAML component document file.
   */
  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  /**
   * The component version.
   */
  public open fun version(): String = unwrap(this).getVersion()

  /**
   * The component version.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.imagebuilder.CfnComponent].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The change description of the component.
     *
     * Describes what change has been made in this version, or what makes this version different
     * from other versions of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-changedescription)
     * @param changeDescription The change description of the component. 
     */
    public fun changeDescription(changeDescription: String)

    /**
     * Component `data` contains inline YAML document content for the component.
     *
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-data)
     * @param data Component `data` contains inline YAML document content for the component. 
     */
    public fun `data`(`data`: String)

    /**
     * Describes the contents of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-description)
     * @param description Describes the contents of the component. 
     */
    public fun description(description: String)

    /**
     * The ID of the KMS key that is used to encrypt this component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-kmskeyid)
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this component. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-name)
     * @param name The name of the component. 
     */
    public fun name(name: String)

    /**
     * The operating system platform of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-platform)
     * @param platform The operating system platform of the component. 
     */
    public fun platform(platform: String)

    /**
     * The operating system (OS) version supported by the component.
     *
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
     * @param supportedOsVersions The operating system (OS) version supported by the component. 
     */
    public fun supportedOsVersions(supportedOsVersions: List<String>)

    /**
     * The operating system (OS) version supported by the component.
     *
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
     * @param supportedOsVersions The operating system (OS) version supported by the component. 
     */
    public fun supportedOsVersions(vararg supportedOsVersions: String)

    /**
     * The tags that apply to the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-tags)
     * @param tags The tags that apply to the component. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The `uri` of a YAML component document file.
     *
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-uri)
     * @param uri The `uri` of a YAML component document file. 
     */
    public fun uri(uri: String)

    /**
     * The component version.
     *
     * For example, `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-version)
     * @param version The component version. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnComponent.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnComponent.Builder.create(scope, id)

    /**
     * The change description of the component.
     *
     * Describes what change has been made in this version, or what makes this version different
     * from other versions of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-changedescription)
     * @param changeDescription The change description of the component. 
     */
    override fun changeDescription(changeDescription: String) {
      cdkBuilder.changeDescription(changeDescription)
    }

    /**
     * Component `data` contains inline YAML document content for the component.
     *
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-data)
     * @param data Component `data` contains inline YAML document content for the component. 
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * Describes the contents of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-description)
     * @param description Describes the contents of the component. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the KMS key that is used to encrypt this component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-kmskeyid)
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this component. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-name)
     * @param name The name of the component. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The operating system platform of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-platform)
     * @param platform The operating system platform of the component. 
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * The operating system (OS) version supported by the component.
     *
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
     * @param supportedOsVersions The operating system (OS) version supported by the component. 
     */
    override fun supportedOsVersions(supportedOsVersions: List<String>) {
      cdkBuilder.supportedOsVersions(supportedOsVersions)
    }

    /**
     * The operating system (OS) version supported by the component.
     *
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
     * @param supportedOsVersions The operating system (OS) version supported by the component. 
     */
    override fun supportedOsVersions(vararg supportedOsVersions: String): Unit =
        supportedOsVersions(supportedOsVersions.toList())

    /**
     * The tags that apply to the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-tags)
     * @param tags The tags that apply to the component. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The `uri` of a YAML component document file.
     *
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-uri)
     * @param uri The `uri` of a YAML component document file. 
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    /**
     * The component version.
     *
     * For example, `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-version)
     * @param version The component version. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnComponent =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnComponent.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponent):
        CfnComponent = CfnComponent(cdkObject)

    internal fun unwrap(wrapped: CfnComponent):
        software.amazon.awscdk.services.imagebuilder.CfnComponent = wrapped.cdkObject
  }
}
