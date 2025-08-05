@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Details about a data automation blueprint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * Object schema;
 * CfnBlueprint cfnBlueprint = CfnBlueprint.Builder.create(this, "MyCfnBlueprint")
 * .blueprintName("blueprintName")
 * .schema(schema)
 * .type("type")
 * // the properties below are optional
 * .kmsEncryptionContext(Map.of(
 * "kmsEncryptionContextKey", "kmsEncryptionContext"))
 * .kmsKeyId("kmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html)
 */
public open class CfnBlueprint(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnBlueprint,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBlueprintProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnBlueprint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBlueprintProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBlueprintProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBlueprintProps(props)
  )

  /**
   * The blueprint's ARN.
   */
  public open fun attrBlueprintArn(): String = unwrap(this).getAttrBlueprintArn()

  /**
   * The blueprint's stage.
   */
  public open fun attrBlueprintStage(): String = unwrap(this).getAttrBlueprintStage()

  /**
   * When the blueprint was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * When the blueprint was last updated.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The blueprint's name.
   */
  public open fun blueprintName(): String = unwrap(this).getBlueprintName()

  /**
   * The blueprint's name.
   */
  public open fun blueprintName(`value`: String) {
    unwrap(this).setBlueprintName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Name-value pairs to include as an encryption context.
   */
  public open fun kmsEncryptionContext(): Any? = unwrap(this).getKmsEncryptionContext()

  /**
   * Name-value pairs to include as an encryption context.
   */
  public open fun kmsEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setKmsEncryptionContext(`value`)
  }

  /**
   * Name-value pairs to include as an encryption context.
   */
  public open fun kmsEncryptionContext(`value`: IResolvable) {
    unwrap(this).setKmsEncryptionContext(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The AWS KMS key to use for encryption.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS KMS key to use for encryption.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The blueprint's schema.
   */
  public open fun schema(): Any = unwrap(this).getSchema()

  /**
   * The blueprint's schema.
   */
  public open fun schema(`value`: Any) {
    unwrap(this).setSchema(`value`)
  }

  /**
   * List of Tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * List of Tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * List of Tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The blueprint's type.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The blueprint's type.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnBlueprint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The blueprint's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-blueprintname)
     * @param blueprintName The blueprint's name. 
     */
    public fun blueprintName(blueprintName: String)

    /**
     * Name-value pairs to include as an encryption context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmsencryptioncontext)
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context. 
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>)

    /**
     * Name-value pairs to include as an encryption context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmsencryptioncontext)
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context. 
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: IResolvable)

    /**
     * The AWS KMS key to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmskeyid)
     * @param kmsKeyId The AWS KMS key to use for encryption. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The blueprint's schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-schema)
     * @param schema The blueprint's schema. 
     */
    public fun schema(schema: Any)

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-tags)
     * @param tags List of Tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-tags)
     * @param tags List of Tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The blueprint's type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-type)
     * @param type The blueprint's type. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnBlueprint.Builder =
        software.amazon.awscdk.services.bedrock.CfnBlueprint.Builder.create(scope, id)

    /**
     * The blueprint's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-blueprintname)
     * @param blueprintName The blueprint's name. 
     */
    override fun blueprintName(blueprintName: String) {
      cdkBuilder.blueprintName(blueprintName)
    }

    /**
     * Name-value pairs to include as an encryption context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmsencryptioncontext)
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context. 
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext)
    }

    /**
     * Name-value pairs to include as an encryption context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmsencryptioncontext)
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context. 
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: IResolvable) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * The AWS KMS key to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmskeyid)
     * @param kmsKeyId The AWS KMS key to use for encryption. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The blueprint's schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-schema)
     * @param schema The blueprint's schema. 
     */
    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-tags)
     * @param tags List of Tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-tags)
     * @param tags List of Tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The blueprint's type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-type)
     * @param type The blueprint's type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnBlueprint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnBlueprint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBlueprint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBlueprint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnBlueprint): CfnBlueprint
        = CfnBlueprint(cdkObject)

    internal fun unwrap(wrapped: CfnBlueprint): software.amazon.awscdk.services.bedrock.CfnBlueprint
        = wrapped.cdkObject as software.amazon.awscdk.services.bedrock.CfnBlueprint
  }
}
