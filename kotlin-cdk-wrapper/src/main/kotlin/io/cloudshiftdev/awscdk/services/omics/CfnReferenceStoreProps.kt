@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnReferenceStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnReferenceStoreProps cfnReferenceStoreProps = CfnReferenceStoreProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .sseConfig(SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html)
 */
public interface CfnReferenceStoreProps {
  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-name)
   */
  public fun name(): String

  /**
   * Server-side encryption (SSE) settings for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
   */
  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  /**
   * Tags for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnReferenceStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the store.
     */
    public fun description(description: String)

    /**
     * @param name A name for the store. 
     */
    public fun name(name: String)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    public fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45d6bb523f9d2f3d09ca7f69569817845c5368f4e519712321b047b485fd803d")
    public fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Tags for the store.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnReferenceStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnReferenceStoreProps.builder()

    /**
     * @param description A description for the store.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnReferenceStore.SseConfigProperty::unwrap))
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45d6bb523f9d2f3d09ca7f69569817845c5368f4e519712321b047b485fd803d")
    override fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty.Builder.() -> Unit): Unit
        = sseConfig(CfnReferenceStore.SseConfigProperty(sseConfig))

    /**
     * @param tags Tags for the store.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnReferenceStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnReferenceStoreProps,
  ) : CdkObject(cdkObject), CfnReferenceStoreProps {
    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
     */
    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReferenceStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnReferenceStoreProps):
        CfnReferenceStoreProps = CdkObjectWrappers.wrap(cdkObject) as CfnReferenceStoreProps

    internal fun unwrap(wrapped: CfnReferenceStoreProps):
        software.amazon.awscdk.services.omics.CfnReferenceStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnReferenceStoreProps
  }
}
