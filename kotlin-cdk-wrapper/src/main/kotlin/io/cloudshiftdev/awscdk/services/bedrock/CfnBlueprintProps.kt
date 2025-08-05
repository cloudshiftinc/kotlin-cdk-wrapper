@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnBlueprint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * Object schema;
 * CfnBlueprintProps cfnBlueprintProps = CfnBlueprintProps.builder()
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
public interface CfnBlueprintProps {
  /**
   * The blueprint's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-blueprintname)
   */
  public fun blueprintName(): String

  /**
   * Name-value pairs to include as an encryption context.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmsencryptioncontext)
   */
  public fun kmsEncryptionContext(): Any? = unwrap(this).getKmsEncryptionContext()

  /**
   * The AWS KMS key to use for encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The blueprint's schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-schema)
   */
  public fun schema(): Any

  /**
   * List of Tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The blueprint's type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnBlueprintProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param blueprintName The blueprint's name. 
     */
    public fun blueprintName(blueprintName: String)

    /**
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context.
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>)

    /**
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context.
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: IResolvable)

    /**
     * @param kmsKeyId The AWS KMS key to use for encryption.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param schema The blueprint's schema. 
     */
    public fun schema(schema: Any)

    /**
     * @param tags List of Tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags List of Tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The blueprint's type. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnBlueprintProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnBlueprintProps.builder()

    /**
     * @param blueprintName The blueprint's name. 
     */
    override fun blueprintName(blueprintName: String) {
      cdkBuilder.blueprintName(blueprintName)
    }

    /**
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context.
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext)
    }

    /**
     * @param kmsEncryptionContext Name-value pairs to include as an encryption context.
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: IResolvable) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kmsKeyId The AWS KMS key to use for encryption.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param schema The blueprint's schema. 
     */
    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    /**
     * @param tags List of Tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags List of Tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The blueprint's type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnBlueprintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnBlueprintProps,
  ) : CdkObject(cdkObject),
      CfnBlueprintProps {
    /**
     * The blueprint's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-blueprintname)
     */
    override fun blueprintName(): String = unwrap(this).getBlueprintName()

    /**
     * Name-value pairs to include as an encryption context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmsencryptioncontext)
     */
    override fun kmsEncryptionContext(): Any? = unwrap(this).getKmsEncryptionContext()

    /**
     * The AWS KMS key to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The blueprint's schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-schema)
     */
    override fun schema(): Any = unwrap(this).getSchema()

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The blueprint's type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-blueprint.html#cfn-bedrock-blueprint-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBlueprintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnBlueprintProps):
        CfnBlueprintProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBlueprintProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBlueprintProps):
        software.amazon.awscdk.services.bedrock.CfnBlueprintProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.bedrock.CfnBlueprintProps
  }
}
