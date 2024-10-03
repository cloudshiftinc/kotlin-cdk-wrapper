@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Metadata Entry spec for stack tag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Tag tag = Tag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
public interface Tag {
  /**
   * Tag key.
   *
   * (In the actual file on disk this will be cased as "Key", and the structure is
   * patched to match this structure upon loading:
   * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
   */
  public fun key(): String

  /**
   * Tag value.
   *
   * (In the actual file on disk this will be cased as "Value", and the structure is
   * patched to match this structure upon loading:
   * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
   */
  public fun `value`(): String

  /**
   * A builder for [Tag]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key Tag key. 
     * (In the actual file on disk this will be cased as "Key", and the structure is
     * patched to match this structure upon loading:
     * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    public fun key(key: String)

    /**
     * @param value Tag value. 
     * (In the actual file on disk this will be cased as "Value", and the structure is
     * patched to match this structure upon loading:
     * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.Tag.Builder =
        software.amazon.awscdk.cloud_assembly_schema.Tag.builder()

    /**
     * @param key Tag key. 
     * (In the actual file on disk this will be cased as "Key", and the structure is
     * patched to match this structure upon loading:
     * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value Tag value. 
     * (In the actual file on disk this will be cased as "Value", and the structure is
     * patched to match this structure upon loading:
     * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.Tag = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.Tag,
  ) : CdkObject(cdkObject),
      Tag {
    /**
     * Tag key.
     *
     * (In the actual file on disk this will be cased as "Key", and the structure is
     * patched to match this structure upon loading:
     * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * Tag value.
     *
     * (In the actual file on disk this will be cased as "Value", and the structure is
     * patched to match this structure upon loading:
     * https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Tag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.Tag): Tag =
        CdkObjectWrappers.wrap(cdkObject) as? Tag ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tag): software.amazon.awscdk.cloud_assembly_schema.Tag = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.Tag
  }
}
