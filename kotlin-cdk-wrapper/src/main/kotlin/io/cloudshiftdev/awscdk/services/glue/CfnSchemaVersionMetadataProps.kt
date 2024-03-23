@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSchemaVersionMetadata`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnSchemaVersionMetadataProps cfnSchemaVersionMetadataProps =
 * CfnSchemaVersionMetadataProps.builder()
 * .key("key")
 * .schemaVersionId("schemaVersionId")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html)
 */
public interface CfnSchemaVersionMetadataProps {
  /**
   * A metadata key in a key-value pair for metadata.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-key)
   */
  public fun key(): String

  /**
   * The version number of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-schemaversionid)
   */
  public fun schemaVersionId(): String

  /**
   * A metadata key's corresponding value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-value)
   */
  public fun `value`(): String

  /**
   * A builder for [CfnSchemaVersionMetadataProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key A metadata key in a key-value pair for metadata. 
     */
    public fun key(key: String)

    /**
     * @param schemaVersionId The version number of the schema. 
     */
    public fun schemaVersionId(schemaVersionId: String)

    /**
     * @param value A metadata key's corresponding value. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps.builder()

    /**
     * @param key A metadata key in a key-value pair for metadata. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param schemaVersionId The version number of the schema. 
     */
    override fun schemaVersionId(schemaVersionId: String) {
      cdkBuilder.schemaVersionId(schemaVersionId)
    }

    /**
     * @param value A metadata key's corresponding value. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps,
  ) : CdkObject(cdkObject), CfnSchemaVersionMetadataProps {
    /**
     * A metadata key in a key-value pair for metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-key)
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * The version number of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-schemaversionid)
     */
    override fun schemaVersionId(): String = unwrap(this).getSchemaVersionId()

    /**
     * A metadata key's corresponding value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-value)
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaVersionMetadataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps):
        CfnSchemaVersionMetadataProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSchemaVersionMetadataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaVersionMetadataProps):
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps
  }
}
